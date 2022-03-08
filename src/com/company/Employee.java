package com.company;

public class Employee {

    private int baseSalary;
    private int hourRate;
    private int extraHour;

    public Employee() {


    }

    public  int calculateWage(){
        return (baseSalary + (extraHour*hourRate)) ;
    }
    public void setBaseSalary(int baseSalary){
        if(baseSalary<=0)
            throw new IllegalArgumentException("Salary can not be zero ");
        this.baseSalary=baseSalary;
    }
   private int getBaseSalary(){
        return (baseSalary);
    }

    public void setHourRate(int hourRate){
        this.hourRate=hourRate;
    }
    private int getHourRate(){
        return hourRate;
    }


    public int getExtraHour() {
        if(extraHour<=0){
            throw new IllegalArgumentException("Extra Hour Can not be zero or less then that");
        }
        return extraHour;
    }

    public void setExtraHour(int extraHour) {

        this.extraHour = extraHour;
    }
}
