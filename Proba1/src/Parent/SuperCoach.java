package Parent;

public class SuperCoach {
    protected String name;
    protected int age;

    protected SuperCoach(String name, int age){
       this.name = name;
       this.age = age;


    }
    public void numberOfYearsUntilRetirement () {
        System.out.println("До пенсії залишилося років : " + (65 - this.age));
        if (this.age >= 65) {
            System.out.println("Тренер вже на пенсії і ви не можете працювати, створіть нового тренера ");
        }
    }
    public void displayCoachInfo ( double height, double weight){
        System.out.println("Висота "+name+" : " + height);
        System.out.println("Вага : " + weight);
        System.out.println("Вік :" + age);
        System.out.println();
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
