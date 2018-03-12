package classic;

public abstract class AbstractSpeaker implements Speaker {
    protected Speaker nextSpeaker;

    @Override
    public void setNextSpeaker(Speaker nextSpeaker) {
        this.nextSpeaker = nextSpeaker;
    }
}
