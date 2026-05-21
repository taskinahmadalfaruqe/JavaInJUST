interface Playable {
    void play();
    void pause();
    void stop();
}

class MusicPlayer implements Playable {

    public void play() {
        System.out.println("Playing music");
    }

    public void pause() {
        System.out.println("Pausing music");
    }

    public void stop() {
        System.out.println("Stopping music");
    }
}

class VideoPlayer implements Playable {

    public void play() {
        System.out.println("Playing video");
    }

    public void pause() {
        System.out.println("Pausing video");
    }

    public void stop() {
        System.out.println("Stopping video");
    }
}

public class PlayableTest {
    public static void main(String[] args) {

        MusicPlayer music = new MusicPlayer();
        VideoPlayer video = new VideoPlayer();

        music.play();
        music.pause();
        music.stop();

        System.out.println();

        video.play();
        video.pause();
        video.stop();
    }
}