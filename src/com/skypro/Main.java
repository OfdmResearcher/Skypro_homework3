package com.skypro;

public class Main {

    public static void main(String[] args) {

        //task1
        System.out.println("Task 1");
        int clientOS = 1; // 0 or 1
        String detailedMessageForTheUser = (clientOS == 1) ?
                "Please, install the app for Android, using this link" :
                "Please, install the app for iOS, using this link";
        System.out.println(detailedMessageForTheUser);
        System.out.println("----------------------------");

        //task2
        System.out.println("Task 2");
        int clientDeviceYear = 2012;
        int clientOSVer2 = 0; // 0 or 1

        if (clientDeviceYear >= 2015 && clientOSVer2 == 1) {
            System.out.println("Please, install the app for Android, using this link");
        } else if (clientDeviceYear >= 2015 && clientOSVer2 == 0) {
            System.out.println("Please, install the app for iOS, using this link");
        } else if (clientDeviceYear < 2015 && clientOSVer2 == 1) {
            System.out.println("Please, install the light version of app for Android, using this link");
        } else {
            System.out.println("Please, install the light version of app for iOS, using this link");
        }
        System.out.println("-------------------------------");

        //task3
        System.out.println("Task 3");
        int year = 2000;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - is a leap year");
        } else {
            System.out.println(year + " - is a not leap year");
        }
        System.out.println("--------------------------------");

        //task4
        System.out.println("Task 4");
        int deliveryDistance = 95;
        int days = 1;
        if (deliveryDistance <= 20) {
            System.out.println("One day is required for the delivery");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days++;
            System.out.println("The " + days + " days are required for the delivery");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            days+=2;
            System.out.println("The " + days + " days are required for the delivery");
        } else {
            System.out.println("The delivery is impossible at your area");
        }
        System.out.println("--------------------------------");

        //task5
        System.out.println("Task 5");
        int monthNumber = 12;
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("This month is winter season");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("This month is spring season");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("This month is summer season");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("This month is autumn season");
                break;
            default:
                System.out.println("Please, enter the right number, your current number is out of scope");
        }
        System.out.println("------------------------------------");


    }
}
