public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        System.out.println("Задача 1");

        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — " + fullName + ".");

    }

    public static void task2() {
        System.out.println();
        System.out.println("Задача 2");

        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase() + ".");

    }

    public static void task3() {
        System.out.println();
        System.out.println("Задача 3");

        String fullName = "Курёхин Ёж Лёвович";
        String fullName1 = fullName.replace('ё', 'е').replace('Ё', 'Е');
        System.out.println("Данные ФИО сотрудника — " + fullName1 + ".");
        // В задаче "Иванов Семён Семёнович". Программа не принимает "ё", поэтому учла регистр.


    }
}