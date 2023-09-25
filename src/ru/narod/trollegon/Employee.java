package ru.narod.trollegon;

public class Employee {
    private String tabNum; // табельный номер
    private String name; // ФИО
    private String profession; // Должность
    private String position; // Подразделение
    private String op; // ОП
    private Integer jobHoursTabel; // Отработано часов за месяц в табеле
    private Integer jobHoursCheck; // Отработано часов по нарядам согласно чек-листам
    private Integer zpPlan; // плановый уровень ЗП за полный месяц
    private Integer zpTabel; // ЗП за отработанное время по табелю
    private Double bonus; // % премии работника за полный месяц
    private Integer brigadeBonus; // Премия работников с учетом выработки бригады
    private String brigadir; // ФИО бригадира - % выработки по бригаде
    private Double personalOutput; // Выработка индивидуальная
    private String job; // Вид работы
    private String organization; // Организация

    public Employee() {
    }

    public String getTabNum() {
        return tabNum;
    }

    public void setTabNum(String tabNum) {
        this.tabNum = tabNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public Integer getJobHoursTabel() {
        return jobHoursTabel;
    }

    public void setJobHoursTabel(Integer jobHoursTabel) {
        this.jobHoursTabel = jobHoursTabel;
    }

    public Integer getJobHoursCheck() {
        return jobHoursCheck;
    }

    public void setJobHoursCheck(Integer jobHoursCheck) {
        this.jobHoursCheck = jobHoursCheck;
    }

    public Integer getZpPlan() {
        return zpPlan;
    }

    public void setZpPlan(Integer zpPlan) {
        this.zpPlan = zpPlan;
    }

    public Integer getZpTabel() {
        return zpTabel;
    }

    public void setZpTabel(Integer zpTabel) {
        this.zpTabel = zpTabel;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    public Integer getBrigadeBonus() {
        return brigadeBonus;
    }

    public void setBrigadeBonus(Integer brigadeBonus) {
        this.brigadeBonus = brigadeBonus;
    }

    public String getBrigadir() {
        return brigadir;
    }

    public void setBrigadir(String brigadir) {
        this.brigadir = brigadir;
    }

    public Double getPersonalOutput() {
        return personalOutput;
    }

    public void setPersonalOutput(Double personalOutput) {
        this.personalOutput = personalOutput;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return tabNum.equals(employee.tabNum);
    }

    @Override
    public int hashCode() {
        return tabNum.hashCode();
    }

    @Override
    public String toString() {
        return  ";"+tabNum +
                ";" + name +
                ";" + profession +
                ";" + position +
                ";" + op +
                ";" + jobHoursTabel +
                ";" + jobHoursCheck +
                ";" + zpPlan +
                ";" + zpTabel +
                ";" + bonus.intValue() + "%" +
                ";" + brigadeBonus +
                ";" + brigadir +
                ";" + personalOutput.intValue() + "%" +
                ";" + job +
                ";" + organization + '\n';
    }
}
