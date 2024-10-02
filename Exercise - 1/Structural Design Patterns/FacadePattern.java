// Subsystem 1: TV
class TV {
    public void on() {
        System.out.println("TV is ON.");
    }
}

// Subsystem 2: Speaker System
class SpeakerSystem {
    public void setVolume(int level) {
        System.out.println("Volume set to " + level);
    }
}

// Subsystem 3: Media Player
class MediaPlayer {
    public void play() {
        System.out.println("Playing media.");
    }
}

// Facade
class HomeEntertainmentFacade {
    private TV tv;
    private SpeakerSystem speaker;
    private MediaPlayer player;

    public HomeEntertainmentFacade() {
        tv = new TV();
        speaker = new SpeakerSystem();
        player = new MediaPlayer();
    }

    public void watchMovie() {
        tv.on();
        speaker.setVolume(10);
        player.play();
    }
}

// Test the Facade Pattern
public class FacadePattern {
    public static void main(String[] args) {
        HomeEntertainmentFacade entertainment = new HomeEntertainmentFacade();
        entertainment.watchMovie();
    }
}
