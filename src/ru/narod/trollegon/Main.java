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
                        if (stored.equals(employee)) {
                            stored.setJobHoursCheck(stored.getJobHoursCheck() + employee.getJobHoursCheck());
                            stored.setBonus((stored.getBonus() + employee.getBonus())/2);
                            stored.setBrigadeBonus(stored.getBrigadeBonus() + employee.getBrigadeBonus());
                            stored.setBrigadir(stored.getBrigadir() + ", " + employee.getBrigadir());
                            stored.setPersonalOutput((stored.getPersonalOutput() + employee.getPersonalOutput())/2);
                            if (!stored.getJob().equals(employee.getJob())) {
                                stored.setJob(stored.getJob() + ", " + employee.getJob());
                            }
                            if (!stored.getOrganization().equals(employee.getOrganization())) {
                                stored.setOrganization(stored.getOrganization() + ", " +
                                        employee.getOrganization());
                            }
                        }
                    }
                }
                else {
                    employees.add(employee);
                }
            });
        Iterator<Employee> it = employees.iterator();
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