package com.codegym.task.task29.task2909.user;

import java.util.concurrent.atomic.AtomicInteger;

public class UserHelper {
    private User userAnna = new User("Anna", "Larsen", 10);
    private User userRoman = new User("Roman", "Crouch", 30);

//    private boolean isAnnaMale = false;
//    private boolean isRomanMale = true;

    public void printUsers() {
        userAnna.printInfo();
//        System.out.println("First name: " + userAnna.getFirstName());
//        System.out.println("Last name: " + userAnna.getLastName());
        userAnna.printAdditionalInfo();

        userRoman.printInfo();
//        System.out.println("First name: " + userRoman.getFirstName());
//        System.out.println("Last name: " + userRoman.getLastName());
        userRoman.printAdditionalInfo();
    }



//    public void printAdditionalInfo(User user) {
//        if (user.getAge() < 16)
//            System.out.println("User is younger than 16");
//        else
//            System.out.println("User is at least 16");
//    }

//    private boolean ageLessThan16(User user) {
//        if (user.getAge() < 16) {
//            return true;
//        }
//        return false;
//    }

    public int calculateAverageAge() {
//        int age = 28;
        User userGeorge = new User("George", "Carp", 28);

        return  (userAnna.getAge() + userRoman.getAge() + userGeorge.getAge()) / 3;


    }

    public int calculateRate(AtomicInteger base, int age, boolean hasJob, boolean hasHouse) {

        int baseRate = base.get() + age / 100;

        baseRate = (int) (baseRate * (hasJob ? 1.1 : 0.9));
        baseRate = (int) (baseRate * (hasHouse ? 1.1 : 0.9));

        return baseRate;


//        return base.get() + age / 100;
//        return (int) (base.get() * (hasJob ? 1.1 : 0.9));
//        return (int) (base.get() * (hasHouse ? 1.1 : 0.9));
    }

    public String getBossName(User user) {

        return user.getBoss();
    }
}