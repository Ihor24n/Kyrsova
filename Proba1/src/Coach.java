import Parent.SuperCoach;

import java.util.Scanner;
public class Coach extends SuperCoach {

    Coach(String name, int age) {
        super(name, age);

        this.experienceAge();
        this.displayCoachInfo(178, 78);
        this.numberOfYearsUntilRetirement();


    }

    public int experienceAge() {
        System.out.println("Введіть у скільки років тренер почав працювати :");
        Scanner scanner = new Scanner(System.in);

        int startAge = scanner.nextInt();

        if (startAge > this.age) {
            System.out.println("Тренер не міг почати тренувати пізніше свого віку");
        } else if (startAge < 18) {
            System.out.println("Він не міг працювати швидше 18 років, будь-ласка введіть справжній вік роботи");
        } else {
            int experience = age - startAge;
            System.out.println("Досвід тренера "+this.name+": " + experience);
            return experience;
        }

        return startAge;
    }

    public void displayCoachInfo(double height, double weight) {
        System.out.println("Висота " + this.name + " : " + height);
        System.out.println("Вага : " + weight);
        System.out.println("Вік :" + this.age);
        System.out.println();
    }

    public void numberOfYearsUntilRetirement() {
        System.out.println("До пенсії залишилося років : " + (65 - this.age));
        if (this.age >= 65) {
            System.out.println("Тренер "+this.name+" вже на пенсії і ви не можете працювати, створіть нового тренера ");
        }
    }
}