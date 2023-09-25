package ru.narod.trollegon;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length==0) {
            System.out.println("No input file. Usage CSVParcel file.csv");
            System.exit(1);
        }
        String inputFile = args[0];
        Set<Employee> employees = new HashSet<>();
            List<String> list = Parcel.fileReader(inputFile);
            list.forEach(s -> {
                Employee employee = Parcel.parce(s);
                if (employees.contains(employee)) {
                    Iterator<Employee> iterator = employees.iterator();
                    while (iterator.hasNext()) {
                        Employee stored = iterator.next();
                        sumEmployee(employee, stored);
                    }
                }
                else {
                    employees.add(employee);
                }
            });
        saveEmployees(employees.iterator());
    }

    //Объединяет две записи по работнику в соответствии с заданными правилами
    private static void sumEmployee(Employee employee, Employee stored) {
        if (stored.equals(employee)) {
            //складываем Отработанно часов по нарядам
            stored.setJobHoursCheck(stored.getJobHoursCheck() + employee.getJobHoursCheck());
            //складываем Отработанно часов по нарядам по договору ГПХ
            stored.setJobHoursCheckGPH(stored.getJobHoursCheckGPH() + employee.getJobHoursCheckGPH());
            //ищем среднее % премии работнка за месяц
            int rowCounter = stored.getRowsCounter();
            stored.setBonus(countAVG(employee.getBonus(), stored.getBonus(), rowCounter));
            //ищем среднее Премия работника с цчетом выработки бригады
            stored.setBrigadeBonus(stored.getBrigadeBonus() + employee.getBrigadeBonus());
            //ищем среднее Премия работника с цчетом выработки бригады по договору ГПХ
            stored.setBrigadeBonusGPH(stored.getBrigadeBonusGPH() + employee.getBrigadeBonusGPH());
            //складываем ИТОГО премия работника с учетом выработки бригады
            stored.setSumBonus(stored.getSumBonus() + employee.getSumBonus());
            //добавляем значение ФИО Бригадира - % выработки через запятую
            stored.setBrigadir(stored.getBrigadir() + ", " + employee.getBrigadir());
            //ищем среднее Выработка индивидуальная
            stored.setPersonalOutput(countAVG(employee.getPersonalOutput(), stored.getPersonalOutput(), rowCounter));
            //добавляем значения через запятую
            if (!stored.getJob().equals(employee.getJob())) {
                stored.setJob(stored.getJob() + ", " + employee.getJob());
            }
            //добавляем значения через запятую
            if (!stored.getOrganization().equals(employee.getOrganization())) {
                stored.setOrganization(stored.getOrganization() + ", " +
                        employee.getOrganization());
            }
            stored.setRowsCounter(++rowCounter);
        }
    }

    private static Double countAVG(Double employee, Double stored, int counter) {
        return (stored*counter + employee)/++counter;
    }
    //Записывает коллекцию работников в файл
    private static void saveEmployees(Iterator<Employee> it) throws IOException {
        int i = 1;
        StringBuilder stringBuilder = new StringBuilder();
        while (it.hasNext()) {
            stringBuilder.append(i++ + it.next().toString());
        }
        PrintWriter writer = new PrintWriter("output.csv", "windows-1251");
        writer.write(stringBuilder.toString());
        writer.flush();
        writer.close();
    }
}