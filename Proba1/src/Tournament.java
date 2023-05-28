
import Helpers.Print;

import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
import java.util.Random;

public class Tournament {
    private String name;
    private String country;

    public Tournament(String name, String country) {
        this.name = name;
        this.country = country;
    }
    public void numberTeams() throws InterruptedException {

        Print.loader("Створюємо турнір");
        System.out.println("\nВиберіть розмірність турніру 8 або 16 команд: ");
        Scanner scanner = new Scanner(System.in);
        int number  = scanner.nextInt();


        if (number == 8){
            System.out.println("Добре, турнір на 8 команд генерується ");
            Scanner scanner1 = new Scanner(System.in);
            String[] teams = new String[8]; // Масив для збереження команд

            for( int i = 0; i<8; i++){
                System.out.print("Введіть команду " + (i + 1) + ": ");
                teams[i] = scanner1.nextLine(); // Зчитування назви команди з клавіатури
            }
            Print.printDownWord("Команди на турнірі :");
            for (String team : teams) {
                System.out.println(team);
            }
            Print.printDownWord("Проводиться жеребкування ... ");
            Collections.shuffle(Arrays.asList(teams));
            Print.line();
            Print.printWord("Результати жеребкування 1/4 :");

            String[] group1 = new String[2];
            group1[0] = teams[0];
            group1[1] = teams[1];
            System.out.println("Пеpший матч : ");
            System.out.println(group1[0]+ " vs "+group1[1] );
            System.out.println();

            String[] group2 = new String[2];
            group2[0] = teams[2];
            group2[1] = teams[3];
            System.out.println("Другий матч : ");
            System.out.println(group2[0]+" vs "+group2[1]);
            /*System.out.println(Arrays.toString(group2));*/
            System.out.println();

            String[] group3 = new String[2];
            group3[0] = teams[4];
            group3[1] = teams[5];
            System.out.println("Третій матч : ");
            System.out.println(group3[0]+" vs "+group3[1]);
            System.out.println();

            String[] group4 = new String[2];
            group4[0] = teams[6];
            group4[1] = teams[7];
            System.out.println("Четвертий матч : ");
            System.out.println(group4[0]+" vs "+group4[1]);
            System.out.println();
            //////////////////////////
            System.out.println("Результати матчів 1/4:");
            Random random = new Random();
            int index1 = random.nextInt(group1.length);
            String element1 = group1[index1];
            System.out.println("Перемога команди :"+element1);
            int index2 = random.nextInt(group2.length);
            String element2 = group2[index2];
            System.out.println("Перемога команди :"+element2);
            int index3 = random.nextInt(group3.length);
            String element3 = group3[index3];
            System.out.println("Перемога команди :"+element3);
            int index4 = random.nextInt(group4.length);
            String element4 = group4[index4];
            System.out.println("Перемога команди :"+element4);
            Print.line();
            Print.printDownWord("Список матчів 1/2 :");

            String[] group11 = new String[2];
            group11[0] = element1;
            group11[1] = element2;
            System.out.println("Перший матч : \n" + group11[0]+ " vs "+ group11[1]);
            System.out.println();
            String[] group12 = new String[2];
            group12[0] = element3;
            group12[1] = element4;
            System.out.println("Другий матч : \n" + group12[0]+ " vs "+ group12[1]);
            System.out.println();
            int index5 = random.nextInt(group11.length);
            String element5 = group11[index5];
            System.out.println("Премога команди : "+element5);
            int index6 = random.nextInt(group12.length);
            String element6 = group12[index6];
            System.out.println("Перемога команди : "+element6);
            Print.line();
            Print.printWord("ФІНАЛ!");

            String[] finall = new String[2];
            finall[0] = element5;
            finall[1] = element6;
            System.out.println("Список команд фіналу :\n"+finall[0]+ " vs "+finall[1] );
            System.out.println();
            int index10 = random.nextInt(finall.length);
            String element10 = finall[index10];
            System.out.println("Перемога в турнірі команди : "+ element10);


        }else if(number == 16){
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Добре, турнір на 16 команд генерується ");
            String[] teams = new String[16]; // Масив для збереження команд

            for( int i = 0; i<16; i++){
                System.out.print("Введіть команду " + (i + 1) + ": ");
                teams[i] = scanner3.nextLine(); // Зчитування назви команди з клавіатури
            }
            System.out.println();
            System.out.println("Команди на турнірі :");

            for (String team : teams) {
                System.out.println(team);
            }

            System.out.println();
            System.out.println("Проводиться жеребкування ");
            Collections.shuffle(Arrays.asList(teams));
            Print.line();
            Print.printWord("Результати жеребкування 1/8 :");

            String[] group1 = new String[2];
            group1[0] = teams[0];
            group1[1] = teams[1];
            System.out.println("Пеpший матч : ");
            System.out.println(group1[0]+ " vs "+group1[1] );
            System.out.println();

            String[] group2 = new String[2];
            group2[0] = teams[2];
            group2[1] = teams[3];
            System.out.println("Другий матч : ");
            System.out.println(group2[0]+" vs "+group2[1]);
            System.out.println();

            String[] group3 = new String[2];
            group3[0] = teams[4];
            group3[1] = teams[5];
            System.out.println("Третій матч : ");
            System.out.println(group3[0]+" vs "+group3[1]);
            System.out.println();

            String[] group4 = new String[2];
            group4[0] = teams[6];
            group4[1] = teams[7];
            System.out.println("Четвертий матч : ");
            System.out.println(group4[0]+" vs "+group4[1]);
            System.out.println();

            String[] group5 = new String[2];
            group5[0] = teams[8];
            group5[1] = teams[9];
            System.out.println("П'ятий матч : ");
            System.out.println(group5[0]+" vs "+group5[1]);
            System.out.println();

            String[] group6 = new String[2];
            group6[0] = teams[10];
            group6[1] = teams[11];
            System.out.println("Шостий матч : ");
            System.out.println(group6[0]+" vs "+group6[1]);
            System.out.println();

            String[] group7 = new String[2];
            group7[0] = teams[12];
            group7[1] = teams[13];
            System.out.println("Сьомий матч : ");
            System.out.println(group7[0]+" vs "+group7[1]);
            System.out.println();

            String[] group8 = new String[2];
            group8[0] = teams[14];
            group8[1] = teams[15];
            System.out.println("Восьмий матч : ");
            System.out.println(group8[0]+" vs "+group8[1]);
            System.out.println();

            System.out.println("Результати матчів 1/8:");
            Random random = new Random();
            int index1 = random.nextInt(group1.length);
            String element1 = group1[index1];
            System.out.println("Перемога команди :"+element1);
            int index2 = random.nextInt(group2.length);
            String element2 = group2[index2];
            System.out.println("Перемога команди :"+element2);
            int index3 = random.nextInt(group1.length);
            String element3 = group3[index3];
            System.out.println("Перемога команди :"+element3);
            int index4 = random.nextInt(group1.length);
            String element4 = group4[index4];
            System.out.println("Перемога команди :"+element4);
            int index5 = random.nextInt(group1.length);
            String element5 = group5[index5];
            System.out.println("Перемога команди :"+element5);
            int index6 = random.nextInt(group1.length);
            String element6 = group6[index6];
            System.out.println("Перемога команди :"+element6);
            int index7 = random.nextInt(group1.length);
            String element7 = group7[index7];
            System.out.println("Перемога команди :"+element7);
            int index8 = random.nextInt(group1.length);
            String element8 = group8[index8];
            System.out.println("Перемога команди :"+element8);
            System.out.println();

            Print.line();
            System.out.println("Список матчів 1/4 :");
            System.out.println();
            String[] group21 = new String[2];
            group21[0] = element1;
            group21[1] = element2;
            System.out.println("Перший матч : \n" + group21[0]+ " vs "+ group21[1]);
            System.out.println();

            String[] group22 = new String[2];
            group22[0] = element3;
            group22[1] = element4;
            System.out.println("Другий матч : \n" + group22[0]+ " vs "+ group22[1]);
            System.out.println();

            String[] group23 = new String[2];
            group23[0] = element5;
            group23[1] = element6;
            System.out.println("Третій матч : \n" + group23[0]+ " vs "+ group23[1]);
            System.out.println();

            String[] group24 = new String[2];
            group24[0] = element7;
            group24[1] = element8;
            System.out.println("Четвертий матч : \n" + group24[0]+ " vs "+ group24[1]);
            System.out.println();

            Print.line();
            System.out.println("Результати матчів 1/4");
            System.out.println();
            int index21 = random.nextInt(group21.length);
            String element21 = group21[index21];
            System.out.println("Премога команди : "+element21);

            int index22 = random.nextInt(group22.length);
            String element22 = group22[index22];
            System.out.println("Перемога команди : "+element22);

            int index23 = random.nextInt(group22.length);
            String element23 = group23[index23];
            System.out.println("Перемога команди : "+element23);

            int index24 = random.nextInt(group22.length);
            String element24 = group24[index24];
            System.out.println("Перемога команди : "+element24);
            Print.line();
            Print.printWord("Список матчів 1/2 :");
            String[] group25 = new String[2];
            group25[0] = element21;
            group25[1] = element22;
            System.out.println("Перший матч : \n" + group25[0]+ " vs "+ group25[1]);

            String[] group26 = new String[2];
            group26[0] = element23;
            group26[1] = element24;
            System.out.println("Другий матч : \n" + group26[0]+ " vs "+ group26[1]);
            System.out.println();

            System.out.println("Результати команд 1/2 : ");
            System.out.println();
            int index25 = random.nextInt(group25.length);
            String element25 = group25[index25];
            System.out.println("Перемога команди : "+element25);


            int index26 = random.nextInt(group26.length);
            String element26 = group26[index26];
            System.out.println("Перемога команди : "+element26);
            Print.line();
            Print.printWord("ФІНАЛ!");

            String[] finall = new String[2];
            finall[0] = element25;
            finall[1] = element26;
            System.out.println("Список команд фіналу :\n"+finall[0]+ " vs "+finall[1] );
            System.out.println();

            int index27 = random.nextInt(finall.length);
            String element27 = finall[index27];
            System.out.println("Перемога в турнірі команди : "+ element27);

        }else{
            System.out.println("Ви ввели неправильне число, будьласка введіть або 8 або 12");
        }
        System.out.println();
        System.out.println("Спасибі що глянули наш турнір");
    }
}
