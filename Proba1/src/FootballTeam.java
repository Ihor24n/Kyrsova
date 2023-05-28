import Helpers.Print;
import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
import java.util.Random;

public class FootballTeam {
    private String teamName;

    private String countryTeam;

    private String[] namesArray = {"Ігор", "Максим", "Назар", "Денис", "Віталій", "Сергій", "Іван", "Микола", "Петро", "Генадій", "Володимир"};

    private String[] positionsArray = {"Centre Forward", "Left Winger", "Right Winger", "Centre Midfield", "Centre Midfield", "Centre Midfield", "Full Back", "Centre Back", "Centre Back", "Full Back", "Keeper"};


    private String[] players = new String[11];/////Масив для збереження гравців
    private int[] ages = new int[11];/////Масив для збереження віку
    private String[] positions = new String[11];/////Масив для збереження позиції


    public void myTeam() throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        Print.loader("Створюємо команду");
        System.out.println("\nВведіть назву команди : ");
        this.teamName = scanner.nextLine();
        System.out.println("Введіть країну вашої команди : ");
        this.countryTeam = scanner.nextLine();


        System.out.println("Створити ім'я вручну(1)/рандом(2) :  ");
        int randomOrCreateName = scanner.nextInt();

        System.out.println("Введіть вік вручну(1)/рандом(2) :  ");
        Scanner ageScanner = new Scanner(System.in);
        int randomOrCreateAge = ageScanner.nextInt();

        System.out.println("Введіть позицію вручну(1)/рандом(2) :  ");
        Scanner positionScanner = new Scanner(System.in);
        int randomOrCreatePosition = positionScanner.nextInt();


        for (int i = 0; i < 11; i++) {

            Print.line();
            System.out.println("Гравець " + (i + 1) + ":");


            if (randomOrCreateName == 1) {
                Scanner namePlayerScanner = new Scanner(System.in);
                System.out.print("Введіть ім'я гравця: ");
                this.players[i] = namePlayerScanner.nextLine(); // Зчитування назви гравців з клавіатури
            } else {
                Collections.shuffle(Arrays.asList(this.namesArray));
                this.players[i] = namesArray[0];
                System.out.println(namesArray[0]);
            }

            if (randomOrCreateAge == 1) {
                Scanner agePlayerScanner = new Scanner(System.in);
                System.out.print("Введіть вік гравця: ");
                ages[i] = Integer.parseInt(agePlayerScanner.nextLine());
            } else {
                Random rand = new Random();
                int randomNumber = rand.nextInt(21) + 20;
                ages[i] = randomNumber;
                System.out.println(randomNumber);
            }

            if (randomOrCreatePosition == 1) {
                Scanner positionPlayerScanner = new Scanner(System.in);
                System.out.print("Введіть ім'я гравця: ");
                positions[i] = positionPlayerScanner.nextLine(); // Зчитування назви гравців з клавіатури
            } else {

                positions[i] = this.positionsArray[i];
                System.out.println(this.positions[i]);
            }
        }
        this.displayInfoTeam();
    }
    public void displayInfoTeam(){
        Print.line();
        Print.printsWords(
                "Ваша команда :",
                "Назва : " + this.teamName,
                "Країна : " + this.countryTeam
        );

        for (int i = 0; i < 11; i++) {
            System.out.println();
            Print.printsWords(

                    "Гравець " + (i + 1) + ":",
                    "Ім'я: " + this.players[i],
                    "Вік: " + this.ages[i],
                    "Позиція: " + this.positions[i]
            );

        }
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getCountryTeam() {
        return countryTeam;
    }

    public void setCountryTeam(String countryTeam) {
        this.countryTeam = countryTeam;
    }

    public String[] getNamesArray() {
        return namesArray;
    }

    public void setNamesArray(String[] namesArray) {
        this.namesArray = namesArray;
    }

    public String getTeamName() {
        return teamName;
    }
}