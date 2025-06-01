// write a prg where the super cls employee has 2 subclass manager and developer each subclass as its own method to calculate salary
// employee name ,id and salary
// manager ,name,salary,bonus,id=> salary +bonus.
// developer,name,salary,overtime,id=>salary + overtime.
class employee{
    public void details() {
        String name = "Mamathalathalli";
        int id = 0273;
        double salary = 150000;
        System.out.println("Name  : "+name);
        System.out.println("ID    : "+id);
        System.out.println("Salary: "+salary);
    }
}
class developer extends employee{
    public void details(){
        String name = "LekhanaLAG...";
        int id = 1406;
        double salary = 100000;
        double ot = 2500;
        System.out.println("Name  : "+name);
        System.out.println("ID    : "+id);
        System.out.println("Salary: "+salary);
        System.out.println("OT    : "+ot);
        System.out.println("Total : "+(salary+ot));
    }
}
class manager extends employee{
    public void details() {
        String name = "Nikitha Chill";
        int id = 2059;
        double salary = 200000;
        double bonus = 150000;
        System.out.println("Name  : "+name);
        System.out.println("ID    : "+id);
        System.out.println("Salary: "+salary);
        System.out.println("Bonus : "+bonus);
        System.out.println("Total : "+(salary+bonus));
    }
}

class Office {
    public static void main(String[] args) {
        employee emp = new employee();
        developer dev = new developer();
        manager man = new manager();
        System.out.println("EMPLOYEE");
        emp.details();
        System.out.println("-----------------");
        System.out.println("DEVELOPER");
        dev.details();
        System.out.println("-----------------");
        System.out.println("MANAGER");
        man.details();
    }
}