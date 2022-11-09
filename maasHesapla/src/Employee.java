public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    public int tax(){
        int tax=0;
        if(salary>1000){
            tax=(salary*3)/100;
        }
        return tax;

    }

    public int bonus(){
        int bonus=0;
        if(workHours>40) {
            bonus = (workHours - 40) * 30;
        }
        return bonus;
    }

    public int riseSalary(){
        int riseSalary=0;

        if((2021-hireYear)<10){
            riseSalary=(salary*5)/100;
        }
        else if((2021-hireYear)>10 && (2021-hireYear)<20){
            riseSalary=(salary*10)/100;
        }
        else if((2021-hireYear)>=20){
            riseSalary=(salary*15)/100;
        }
        return riseSalary;
    }

    public String toString(){
        int fark=(bonus())+(riseSalary())-(tax());
        int sonMaas=(salary)+fark;
        int verBonus=salary+(bonus())-(tax());
        System.out.println("Çalışan adı: " + this.name);
        System.out.println("Çalışan maaşı: "+this.salary);
        System.out.println("Haftalık Çalışma Saati:  "+this.workHours);
        System.out.println("Vergi: "+tax());
        System.out.println("Bonus: "+bonus());
        System.out.println("Maaş Artışı: "+riseSalary());
        System.out.println("Vergi ve Bonuslar ile Maaş: "+verBonus);
        System.out.println("Toplam Maaş: " + sonMaas);
        return name;

    }

}
