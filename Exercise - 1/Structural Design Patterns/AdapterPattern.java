// Target Interface
interface MediaPlayer {
    void play(String audioType, String fileName);
}

// Adaptee
class VideoPlayer {
    public void playVideo(String fileName) {
        System.out.println("Playing video: " + fileName);
    }
}

// Adapter
class MediaPlayerAdapter implements MediaPlayer {
    private VideoPlayer videoPlayer;

    public MediaPlayerAdapter(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("video")) {
            videoPlayer.playVideo(fileName);
        } else {
            System.out.println("Invalid media type");
        }
    }
}

// Test the Adapter Pattern
public class AdapterPattern {
    public static void main(String[] args) {
        VideoPlayer videoPlayer = new VideoPlayer();
        MediaPlayer mediaPlayer = new MediaPlayerAdapter(videoPlayer);
        
        mediaPlayer.play("video", "myMovie.mp4");
    }
}
