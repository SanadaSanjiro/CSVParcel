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
        employee.setTabNum(strings[1]);
        employee.setName(strings[2]);
        employee.setProfession(strings[3]);
        employee.setPosition(strings[4]);
        employee.setOp(strings[5]);
        employee.setJobHoursTabel(Integer.parseInt(strings[6].replace(" ", "")));
        employee.setJobHoursCheck(Integer.parseInt(strings[7].replace(" ", "")));
        employee.setZpPlan(Integer.parseInt(strings[8].replace(" ", "")));
        employee.setZpTabel(Integer.parseInt(strings[9].replace(" ", "")));
        employee.setBonus(Double.parseDouble(strings[10]
                .replace("%", "")
                .replace(" ", "")));
        employee.setBrigadeBonus(Integer.parseInt(strings[11].replace(" ", "")));
        employee.setBrigadir(strings[12]);
        employee.setPersonalOutput(Double.parseDouble(strings[13]
                .replace("%", "")
                .replace(" ", "")));
        employee.setJob(strings[14]);
        employee.setOrganization(strings[15]);
        return employee;
    }
}
