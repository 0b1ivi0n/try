package WriteInfo;
import Race.Race;

public class WriteInfo {
    private Race race;

    public WriteInfo(Race race) {
        this.race = race;
    }

    public void printInfo() {
        System.out.println("Дата соревнования:" + race.getDate());
        System.out.println("Количество участников: " + race.getParticipants());
        System.out.println("Наличие приза: " + (race.isPrize() ? "да" : "нет"));
    }
}