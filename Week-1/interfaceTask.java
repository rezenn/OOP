public class interfaceTask {
    public static void main(String[] args) {

        Spotify sp1 = new Spotify();
        sp1.download();
        sp1.pause();
        sp1.play();
        sp1.previous();
        sp1.next();
        sp1.nowPlaying();
        sp1.size();
        sp1.remaining(23.23);

        AppleMusic ap1 = new AppleMusic();
        ap1.download();
        ap1.pause();
        ap1.play();
        ap1.previous();
        ap1.next();
        ap1.nowPlaying();
        ap1.size();
        ap1.remaining(124.23);

    }
}

/*
 * Task
 * Make an interface Media
 * make the following functions
 * void play()
 * void pause()
 * void next()
 * void previous()
 * String nowPlaying() *
 * Make an interface DigitalMedia extending Media
 * make the following functions
 * double size()
 * double remaining(double current) *
 * Make an interface OnlineAsset
 * make the following functions
 * void download() *
 * Make a class Spotify and implement DigitalMedia and OnlineAsset
 * Make a class AppleMusic and implement DigitalMedia and OnlineAsset
 * Make one object of Spotify and one object of AppleMusic
 */
interface media {
    void play();

    void pause();

    void next();

    void previous();

    String nowPlaying();
}

interface DigitalMedia extends media {
    double size();

    double remaining(double current);

}

interface onlineasset {
    void download();
}

class Spotify implements DigitalMedia, onlineasset {

    @Override
    public void play() {
        System.out.println("Play song.");
    }

    @Override
    public void pause() {
        System.out.println("Pause song.");
    }

    @Override
    public void next() {
        System.out.println("next song.");
    }

    @Override
    public void previous() {
        System.out.println("Previous song.");
    }

    @Override
    public String nowPlaying() {
        return "song";
    }

    @Override
    public double size() {
        return 1.23;
    }

    @Override
    public double remaining(double current) {
        return current;
    }

    @Override
    public void download() {
        System.out.println("Download song.");
    }
}

class AppleMusic implements DigitalMedia, onlineasset {

    @Override
    public void play() {
        System.out.println("Play song on Apple music.");
    }

    @Override
    public void pause() {
        System.out.println("Pause song on Apple music.");
    }

    @Override
    public void next() {
        System.out.println("next song on Apple music.");
    }

    @Override
    public void previous() {
        System.out.println("Previous song on Apple music.");
    }

    @Override
    public String nowPlaying() {
        return "song on Apple music.";
    }

    @Override
    public double size() {
        return 142.14;
    }

    @Override
    public double remaining(double current) {
        return current;
    }

    @Override
    public void download() {
        System.out.println("Download song on Apple music.");
    }
}