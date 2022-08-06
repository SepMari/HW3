public class Main {
    public static void main(String[] args) {
        //Задание 1 и Задание 2
        int clientOS = 0;

        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        //Задание 2
        int clientDeviceYear = 2015;

        if (clientOS == 1 && clientDeviceYear > 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear > 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear <= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
        } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
        }

        //Задание 3 високосным является каждый четвертый год, но не является каждый сотый.
        // Также високосным является каждый четырехсотый год.
        int year = 2021;

         if (year %4==0 && year %100 > 0 || year %400==0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        //Задание 4
        int deliveryDistance = 95;
        int day=1;

        if (deliveryDistance > 20) {
            day++;
        }
        if (deliveryDistance > 60) {
            day++;
        }
        System.out.println("Потребуется дней: " + day);

        //Задание 5
        int monthNumber = 13;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("принадлежит к сезону осень");
                break;
            default:
                System.out.println("Такого месяца в сезонах не существует");
        }

        //Задание 6
        //Людям старше (или равно) 23 лет мы предоставляем лимит в размере 3 зарплат.
        //Людям младше 23 лет мы предоставляем лимит в размере 2 зарплат.
        //Если заработная плата клиента выше (или равно) 50 тысяч, мы увеличиваем лимит в 1.2 раза.
        //Если заработная плата выше (или равно) 80 тысяч, мы увеличиваем лимит в 1.5 раза.
        //Увеличения не могут быть применены одновременно.

        int age = 19;
        double salary = 40_000;
        if (age >= 23 && salary < 50_000) {
            salary = salary * 3;
            System.out.println("1: Мы готовы выдать вам кредитную карту с лимитом " + salary + " рублей");
        } else if (age < 23 && salary < 50_000) {
            salary = salary * 2;
            System.out.println("2: Мы готовы выдать вам кредитную карту с лимитом " + salary + " рублей");
        } else if (age >= 23 && salary >= 50_000 && salary < 80_000) {
            salary = salary * 3 * 1.2;
            System.out.println("3: Мы готовы выдать вам кредитную карту с лимитом " + salary + " рублей");
        } else if (age >= 23 && salary >= 80_000) {
            salary = salary * 3 * 1.5;
            System.out.println("4: Мы готовы выдать вам кредитную карту с лимитом " + salary + " рублей");
        } else if (age < 23 && salary >=50_000 && salary < 80_000) {
            salary = salary * 2 * 1.2;
            System.out.println("5: Мы готовы выдать вам кредитную карту с лимитом " + salary + " рублей");
        } else if (age < 23 && salary >= 80_000) {
            salary = salary * 2 * 1.5;
            System.out.println("6: Мы готовы выдать вам кредитную карту с лимитом " + salary + " рублей");
        }


    }
}