import Race.Race;

public class Main {
    public static void main(String[] args) {

        Race[] races = new Race[3];

        races[0] = new Race("25-09-2023", 10, true);
        races[1] = new Race("01-10-2023", 15);
        races[2] = new Race();

        for (Race race : races) {
            race.printInfo();
        }

        Race.printStatistics();
        
        Race.printStatistics();
    }
}
