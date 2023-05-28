import Helpers.Print;
import Parent.SuperCoach;

import java.util.Scanner;
import java.util.Date;

public class AssistantCoach extends SuperCoach {

    public AssistantCoach(String name, int age) throws InterruptedException {
        super(name, age);
        this.checkAge();
        this.numberOfYearsUntilRetirement();
        this.displayCoachInfo(1.78,75);

    }
    public void checkAge() throws InterruptedException {
        Print.loader("Перевірка даних");

        if (age < 18) {
            System.out.println("Вік не може бути менше 18");
            return;
        }
        System.out.println("\nПеревірка даних пройшла успішно");
        System.out.println();

    }
    public void numberOfYearsUntilRetirement() {
        if (this.age < 40) {
            System.out.println("До пенсії "+this.name+ " залишилося років : " + (65 - this.age));
            return;
        }
        System.out.println(this.name + "бідьше 40 років, він уже неможе працювати, найміть нового асистента ");
    }

}


