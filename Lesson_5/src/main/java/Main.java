public class Main {
    public static void main(String[] args) {

        //Создание объекта

        Employee employee1 = new Employee("Лукиянов Александр Сергеевич", "Java Developer", "alex@123",
                8_999_999_99_99L, 100_000, 26);

        //Вызов метода, позволяющего вывести иинформации о сотруднике в консоль

        employee1.EmployeeInfo();

        // Создание массива из 5 сотрудников

        Employee[] EmployeeArray = new Employee[5];
        EmployeeArray[0] = new Employee("Иванов Иван Иванович", "Инженер", "ivivan@gmail.com",
                8_923_123_22L, 30_000, 60);
        EmployeeArray[1] = new Employee("Семенов Семен Семенович", "Developer", "semen@gmail.com",
                8_927_456_32L, 40_000, 32);
        EmployeeArray[2] = new Employee("Сидоров Александр Владимирович", "Разрабочик", "sidorov@gmail.com",
                8_928_789_42L, 50_000, 50);
        EmployeeArray[3] = new Employee("Петров Петр Петрович", "Дизайнер", "petrov@gmail.com",
                8_929_123_52L, 60_000, 35);
        EmployeeArray[4] = new Employee("Иванова Евгения Сергеевна", "Менеджер", "ivanova@gmail.com",
                8_921_234_62L, 70_000, 41);

        // Вывод информации о сотрудниках старше 40 лет

        for (int i = 0; i < EmployeeArray.length; i++) {
            if (EmployeeArray[i].age > 40)
            EmployeeArray[i].EmployeeInfo();
        }
    }
}
