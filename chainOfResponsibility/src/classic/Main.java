package classic;

public class Main {

    public static void main(String[] args) {
        Speaker javaSpeaker = new JavaSpeaker();
        Speaker angularSpeaker = new AngularSpeaker();
        Speaker mobileSpeaker = new MobileSpeaker();
        Speaker frodoBaggins = new FrodoBaggins();

        mobileSpeaker.setNextSpeaker(angularSpeaker);
        angularSpeaker.setNextSpeaker(javaSpeaker);
        javaSpeaker.setNextSpeaker(frodoBaggins);

        PresentationSpecs presentationSpecs = new PresentationSpecs(PresentationSpecs.Type.UI, "Angular v5.0");

        mobileSpeaker.makePresentation(presentationSpecs);

    }
}
