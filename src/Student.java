public class Student {
    private String name;
    private int wage;
    private int hours;
    private int salary;
    public Student(String name, int wage, int hours) {
        this.name = name;
        this.wage = wage;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public int getWage(){
        return wage;
    }

    public int getHours() {
        return hours;
    }

    public int getSalary() {
        int yearlyWage = (getWage() * getHours()) * 52;
        if (yearlyWage <= 32000) {
            yearlyWage = yearlyWage - (int)(yearlyWage * .1) - (int)(yearlyWage * .062);
        } else if (yearlyWage <= 160200){
            yearlyWage = yearlyWage - (int)(yearlyWage * .25) - (int)(yearlyWage * .062) - 3200;
        } else {
            yearlyWage = yearlyWage - (int)(yearlyWage * .25) - 9932  - 3200;
        }
        return yearlyWage;
    }
}
