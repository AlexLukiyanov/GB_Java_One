public class Employee {

    public String name;
    public String position;
    public String email;
    public long phoneNumber;
    public int salary;
    public int age;

    public Employee (String name, String position, String email, long phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void EmployeeInfo () {
        System.out.println("ФИО: " + this.name + "\n" + "Должность: " + this.position + "\n" + "E-mail: " + this.email + "\n" +
                "Номер телефона: " + this.phoneNumber + "\n" + "Зарплата: " + this.salary + "\n" + "Возраст: " + this.age);
    }
}
