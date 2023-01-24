package nadocoding.quiz08;

public class Quiz08Main {
    public static void main(String[] args) {
        SpeedCam speedCam = new SpeedCam();
        speedCam.setDetector(new AccidentDetector());
        speedCam.setReporter(new VideoReporter());
        speedCam.detect();
        speedCam.report();


    }
}
