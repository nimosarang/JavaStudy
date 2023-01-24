package nadocoding.quiz08;

public class SpeedCam extends Camera {
    private Detectable detector;
    private Reportable reporter;

    public void detect() {
        this.detector.detect();
    }
    public void report() {
        this.reporter.report();
    }

    public Detectable getDetector() {
        return detector;
    }
    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public Reportable getReporter() {
        return reporter;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }
}
