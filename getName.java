// Write a java program to create a class known as Person with methods called getFirstName() and getLastName(). Create a subclass called Employee that adds a new method names getEmployeeId() and overrides the getLastName() method to include the employee's job tittle.
class person {
    public String getFirstName() {
        String name = "Joe";
        return name;
    }
    public String getLastName() {
        String LastNa = "Smith";
        return LastNa;
    }
}

class Employee extends person {
    public int getEmployeeId() {
        int id = 443;
        return id;
    }
    public String getLastName() {
        String role = "S|W-Engg";
        return role;
    }
}

class getName{
    public static void main(String[] args) {
        Employee emp = new Employee();
        person per = new person();
        System.out.println(emp.getFirstName()+" "+per.getLastName()+ " " + emp.getEmployeeId()+" " + emp.getLastName());
    }
}