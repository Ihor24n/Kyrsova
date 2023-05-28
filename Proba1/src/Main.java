import Helpers.Print;

public class Main {
    public static void main(String[] args) throws InterruptedException {
    System.out.println("Створюємо власну команду ");
    FootballTeam footballTeam = new FootballTeam();
    footballTeam.myTeam();



    Print.line();

    System.out.println("Інформація про стадіон");
    Stadium stadium = new Stadium(footballTeam.getCountryTeam(), 99000,5000);
    stadium.displayStadiumInfo();
    System.out.println();
    stadium.checkAviability(60000);



    Print.line();
    System.out.println("");
    Coach coach = new Coach("Andriy", 48);

    Print.line();
    AssistantCoach ascoach = new AssistantCoach("Ihor",25);
    Print.line();



    FootballDoctor doctor1 = new FootballDoctor("Bodya",12,footballTeam.getTeamName());
    System.out.println(doctor1.getDoctorInfo());
    System.out.println();
    doctor1.performMedicalExamination("Ігор");


    Print.line();

    System.out.println();
    Tournament tournament = new Tournament("Askelad","Ukraine");
    tournament.numberTeams();
   }
}
