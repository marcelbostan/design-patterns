package contemporan1;



import classic.PresentationSpecs;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        PresentationSpecs presentationSpecs = new PresentationSpecs(PresentationSpecs.Type.UI, "Angular v5.0");
        chain(new FrodoBaggins(), new AngularSpeaker(), new JavaSpeaker(), new MobileSpeaker()).accept(presentationSpecs);
    }

    public static Consumer<PresentationSpecs> chain(Consumer<PresentationSpecs>...speakers) {
        return Stream.of(speakers).reduce(Consumer::andThen).get();
    }
}
