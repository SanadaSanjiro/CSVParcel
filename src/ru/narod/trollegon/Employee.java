package ru.narod.trollegon;

public class Employee {
    private String tabNum; // табельный номер
    private String name; // ФИО
    private String profession; // Должность
    private String position; // Подразделение
    private String op; // ОП
    private Integer jobHoursTabel; // Отработано часов за месяц в табеле
    private Integer jobHoursGPH; // Отработано часов за месяц по договору ГПХ
    private Integer jobHoursCheck; // Отработано часов по нарядам согласно чек-листам
    private Integer jobHoursCheckGPH; // Отработано часов по нарядам согласно чек-листам по договору ГПХ
    private Integer zpPlan; // плановый уровень ЗП за полный месяц
    private Integer zpPlanGPH; // Уровень ЗП по договору ГПХ
    private Integer zpTabel; // ЗП за отработанное время по табелю
    private Integer zpTabelGPH; // ЗП за отработанное время по договору ГПХ
    private Double bonus; // % премии работника за полный месяц
    private int rowsCounter; // счетчик строк для вычисления среднего значения
    private Integer brigadeBonus; // Премия работников с учетом выработки бригады
    private Integer brigadeBonusGPH; // Премия работников с учетом выработки бригады по договору ГПХ
    private Integer sumBonus; // ИТОГО премия работника с учетом выработки бригады
    private String brigadir; // ФИО бригадира - % выработки по бригаде
    private Double personalOutput; // Выработка индивидуальная
    private String job; // Вид работы
    private String organization; // Организация
    private String fireDate; //Дата увольнения
    private String vecheroffka; //Снятие за вечеровки

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

    public Integer getJobHoursGPH() {
        return jobHoursGPH;
    }

    public void setJobHoursGPH(Integer jobHoursGPH) {
        this.jobHoursGPH = jobHoursGPH;
    }

    public Integer getJobHoursCheck() {
        return jobHoursCheck;
    }

    public void setJobHoursCheck(Integer jobHoursCheck) {
        this.jobHoursCheck = jobHoursCheck;
    }

    public Integer getJobHoursCheckGPH() {
        return jobHoursCheckGPH;
    }

    public void setJobHoursCheckGPH(Integer jobHoursCheckGPH) {
        this.jobHoursCheckGPH = jobHoursCheckGPH;
    }

    public Integer getZpPlan() {
        return zpPlan;
    }

    public void setZpPlan(Integer zpPlan) {
        this.zpPlan = zpPlan;
    }

    public Integer getZpPlanGPH() {
        return zpPlanGPH;
    }

    public void setZpPlanGPH(Integer zpPlanGPH) {
        this.zpPlanGPH = zpPlanGPH;
    }

    public Integer getZpTabel() {
        return zpTabel;
    }

    public void setZpTabel(Integer zpTabel) {
        this.zpTabel = zpTabel;
    }

    public Integer getZpTabelGPH() {
        return zpTabelGPH;
    }

    public void setZpTabelGPH(Integer zpTabelGPH) {
        this.zpTabelGPH = zpTabelGPH;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    public int getRowsCounter() {
        return rowsCounter;
    }

    public void setRowsCounter(int rowsCounter) {
        this.rowsCounter = rowsCounter;
    }

    public Integer getBrigadeBonus() {
        return brigadeBonus;
    }

    public void setBrigadeBonus(Integer brigadeBonus) {
        this.brigadeBonus = brigadeBonus;
    }

    public Integer getBrigadeBonusGPH() {
        return brigadeBonusGPH;
    }

    public void setBrigadeBonusGPH(Integer brigadeBonusGPH) {
        this.brigadeBonusGPH = brigadeBonusGPH;
    }

    public Integer getSumBonus() {
        return sumBonus;
    }

    public void setSumBonus(Integer sumBonus) {
        this.sumBonus = sumBonus;
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

    public String getFireDate() {
        return fireDate;
    }

    public void setFireDate(String fireDate) {
        this.fireDate = fireDate;
    }

    public String getVecheroffka() {
        return vecheroffka;
    }

    public void setVecheroffka(String vecheroffka) {
        this.vecheroffka = vecheroffka;
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
                ";" + jobHoursGPH +
                ";" + jobHoursCheck +
                ";" + jobHoursCheckGPH +
                ";" + zpPlan +
                ";" + zpPlanGPH +
                ";" + zpTabel +
                ";" + zpTabelGPH +
                ";" + bonus.intValue() + "%" +
                ";" + brigadeBonus +
                ";" + brigadeBonusGPH +
                ";" + sumBonus +
                ";" + brigadir +
                ";" + personalOutput.intValue() + "%" +
                ";" + job +
                ";" + organization +
                ";" + fireDate +
                ";" + vecheroffka + '\n';
    }
}
