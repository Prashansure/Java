
class Sport {
    private String name;

    public Sport(String name) {
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Type: Activity");
    }
}

interface Participating {
    void participate();
}

class Music extends Sport implements Participating {
    private String participant;

    public Music(String name, String participant) {
        super(name);
        this.participant = participant;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Participant: " + participant);
    }


    public void participate() {
        System.out.println(participant + " is participating in music.");
    }
}

public class Main {
    public static void main(String[] args) {
        Sport activity = new Sport("Dance");
        Music music = new Music("Classical Music", "");

        System.out.println("parent Class Details:");
        activity.displayDetails();

        System.out.println("\nMusic Details:");
        music.displayDetails();

        System.out.println("\nparticipation:");
        music.participate();
    }
}
