package ru.narod.trollegon;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Parcel {
    public static List<String> fileReader(String source) throws IOException {
        StringBuilder builder = new StringBuilder();
        List<String> lines = Files.readAllLines(Paths.get(source), Charset.forName("windows-1251"));
        lines.forEach(line -> builder.append(line + "\n"));
        return lines;
    }

    public static Employee parce(String line) {
        Employee employee = new Employee();
        String[] strings = line.split(";");
        int column = 1;
        employee.setTabNum(strings[column++]); //табельный номер
        employee.setName(strings[column++]); //ФИО
        employee.setProfession(strings[column++]); //Должность
        employee.setPosition(strings[column++]); //Подразделение
        employee.setOp(strings[column++]); //ОП
        //Отработано часов за месяц
        employee.setJobHoursTabel(parseInteger(strings[column++]));
        //Отработано по договору ГПХ
        employee.setJobHoursGPH(parseInteger(strings[column++]));
        //Отработано часов по нарядам
        employee.setJobHoursCheck(parseInteger(strings[column++]));
        //Отработано по чек-листам по договору ГПХ
        employee.setJobHoursCheckGPH(parseInteger(strings[column++]));
        //Плановый уровень ЗП за полный месяц
        employee.setZpPlan(parseInteger(strings[column++]));
        //Уровень ЗП по договору ГПХ
        employee.setZpPlanGPH(parseInteger(strings[column++]));
        //ЗП за отработанное время по табелю
        employee.setZpTabel(parseInteger(strings[column++]));
        //ЗП за отработанное время по договору ГПХ
        employee.setZpTabelGPH(parseInteger(strings[column++]));
        //Процент премии работника за месяц
        employee.setBonus(parsePercents(strings[column++]));
        //Устанавливаем счетчик рядов в 1
        employee.setRowsCounter(1);
        //Премия работника с учетом выработки бригады
        employee.setBrigadeBonus(parseInteger(strings[column++]));
        //Примия работника с учетом выработки бригады по договору ГПХ
        employee.setBrigadeBonusGPH(parseInteger(strings[column++]));
        //ИТОГО премия работника с учетом выработки бригады
        employee.setSumBonus(parseInteger(strings[column++]));
        //ФИО бригадира - % выработки по бригаде
        employee.setBrigadir(strings[column++]);
        //Выработка индивидуальная
        employee.setPersonalOutput(parsePercents(strings[column++]));
        //Вид работы
        employee.setJob(strings[column++]);
        //Организация
        employee.setOrganization(strings[column++]);
        //Дата увольнения
        employee.setFireDate(strings[column++]);
        //Снятие за вечеровки
        employee.setVecheroffka(strings[column++]);
        return employee;
    }

    private static Integer parseInteger(String string) {
        return Integer.parseInt(string.replace(" ", ""));
    }

    private static Double parsePercents(String string) {
        return Double.parseDouble(string
                .replace("%", "")
                .replace(" ", ""));
    }
}
