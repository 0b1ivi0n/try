package Race;

public class Race {

    private String date;
    private int participants;
    private boolean prize;

    public Race(String date, int participants, boolean prize) {
        this.date = date;
        this.participants = participants;
        this.prize = prize;
        addRace(this);
    }

    public Race(String date, int participants) {
        this(date, participants, false);
    }

    public Race() {
        this(java.time.LocalDate.now().toString(), 0, false);
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }

    public boolean isPrize() {
        return prize;
    }

    public void setPrize(boolean prize) {
        this.prize = prize;
    }

    public void printInfo() {
        System.out.println("Дата соревнования: " + date);
        System.out.println("Количество участников: " + participants);
        System.out.println("Наличие приза: " + (prize ? "да" : "нет"));
    }

    public void printDate() {
        System.out.println("Дата соревнования: " + date);
        System.out.println();
    }

    public void printParticipants() {
        System.out.println("Количество участников: " + participants);
    }

    public void printPrize() {
        System.out.println("Наличие приза: " + (prize ? "да" : "нет"));
    }

    private static int totalParticipants = 0;
    private static int prizeRaces = 0;

    public static void addRace(Race race) {
        totalParticipants += race.getParticipants();
        if (race.isPrize()) {
            prizeRaces++;
        }
    }

    public static void printStatistics() {
        System.out.println("Общее количество участников: " + totalParticipants);
        System.out.println("Количество соревнований с призом: " + prizeRaces);
    }
}