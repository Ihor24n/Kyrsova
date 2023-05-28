import Helpers.Print;

import java.util.Scanner;

public class Stadium {
    private String name;
    private String location;
    private int capacity;

    Scanner scanner = new Scanner(System.in);


    ////////////////////////////
    public Stadium(String location, int capacity, int numberOfSeats) {
        this.location = location;
        this.capacity = capacity;

    }

    public void displayStadiumInfo() {
        System.out.println("Введіть назву стадіону:");
        this.name = scanner.nextLine();
        Print.printsWords(
                "Назва стадіона : " + this.name,
                "Локація: " +   this.location,
                "Вмістивість: " + this.capacity
        );
    }

    public void checkAviability(int numberOfTickets) {
        if (numberOfTickets <= capacity) {
            System.out.println("Квитки доступні для " + numberOfTickets + " людей");
        } else {
            System.out.println("На жаль, стадіон недостатньо великий для розміщення " + numberOfTickets + " людей");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
