public class Main {
    public static void main(String[] args) {

        char clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();

        int clientDeviceYear = 2016;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        System.out.println();

        int year = 1600;
        if (year >= 1584) {
           if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год является високосным");
        } else if ((year % 400 != 0) || (year % 4 != 0 && year % 100 == 0)) {
           System.out.println(year + " год не является високосным");
        } else {
            System.out.println("Назовите год после 1584 года");
        }
        }

        System.out.println();

        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней : 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней : 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней : 3");
        } else {
            System.out.println("Доставки свыше 100 км доставки нет");
        }
        System.out.println();


        int monthNumber = 12;
        if (monthNumber <= 12);
         switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + " это месяц зимы");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " это месяц весны");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " это месяц лета");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " это месяц осени");
                break;
            default:
                System.out.println("Такого месяца не существет");

        }

    }
}


