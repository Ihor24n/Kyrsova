public class FootballDoctor {
    private String name;
    private int experienceYears;
    private String currentClub; // Поточний футбольний клуб лікаря

    public FootballDoctor(String name, int experienceYears, String currentClub) {
        this.name = name;
        this.experienceYears = experienceYears;
        this.currentClub = currentClub;

    }

    public String getDoctorInfo() {
        return "Лікар: " + name + "\nДосвід: " + experienceYears + " років" + "\nПоточний клуб: " + currentClub;
    }

    public void performMedicalExamination(String playerName) {
        System.out.println("Медичний огляд гравця " + playerName+ " проведено.");

    }
}

