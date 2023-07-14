public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS==0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS==1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear=2023;
        if (clientOS==0) {
            if (clientDeviceYear>=2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if ( clientDeviceYear<2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientOS==1) {
            if (clientDeviceYear>=2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if ( clientDeviceYear<2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }
    public static void task3() {
        System.out.println("Задача 3 ");
        var year = 2024;
        if (year % 4 == 0 || year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }


    public static void task4() {
        System.out.println("Задача 4 ");
        int deliveryDistance = 101;
        int deliveryDay = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDay++;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDay=deliveryDay+2;
            System.out.println("Потребуется дней: " + deliveryDay);

        }else if (deliveryDistance > 100) {
            System.out.println("Свыше 100 км доставки нет");
        }
    }
    public static void task5() {
        System.out.println("Задача 5 ");
        int monthNumber = 7;
        switch (monthNumber) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("july");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("There is no such month");
        }

    }
}