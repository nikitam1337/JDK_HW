package ru.geekbrains;


/*
Создать справочник сотрудников
Необходимо:
Создать класс справочник сотрудников, который содержит внутри коллекцию сотрудников -
каждый сотрудник должен иметь следующие атрибуты:
- Табельный номер
- Номер телефона
- Имя
- Стаж

1. Добавить метод, который ищет сотрудника по стажу (может быть список)
2. Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
3. Добавить метод, который ищет сотрудника по табельному номеру
4. Добавить метод добавление нового сотрудника в справочник
 */


public class Main {
    public static void main(String[] args) {

        EmployeeDirectory dir = new EmployeeDirectory();

        Employee employee1 = new Employee(1,666333,"Dima",5);
        Employee employee2 = new Employee(2,777,"Anna",1);
        Employee employee3 = new Employee(3,987654,"Oleg",7);
        Employee employee4 = new Employee(4,123123,"Dima",3);

        dir.addEmployee(employee1);
        dir.addEmployee(employee2);
        dir.addEmployee(employee3);
        dir.addEmployee(employee4);
        System.out.println(dir);
        System.out.println();

//      1. Добавить метод, который ищет сотрудника по стажу (может быть список)
        System.out.println("1. Поиск сотрудника по стажу. Должен вывести сотрудника Dima: ");
        System.out.println(dir.searchByExperience(5));

//      2. Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
        System.out.println();
        System.out.println("2. Поиск сотрудника по номеру телефона. Должен вывести сотрудников с именем Dima: ");
        System.out.println(dir.getPhoneByName("Dima"));

//      3. Добавить метод, который ищет сотрудника по табельному номеру
        System.out.println();
        System.out.println("3. Поиск сотрудника по табельному номеру. Должен вывести сотрудника с именем Oleg: ");
        System.out.println(dir.searchByServiceNumber(3));

//      4. Добавить метод добавление нового сотрудника в справочник
        System.out.println();
        System.out.println("4. Добавляем сотрудника с именем Pavel: ");
        Employee employee5 = new Employee(5,111,"Pavel",10);
        dir.addEmployee(employee5);

        System.out.println(dir);
    }

}

