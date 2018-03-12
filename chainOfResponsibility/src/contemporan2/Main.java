package contemporan2;

import classic.PresentationSpecs;


import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

import static classic.PresentationSpecs.Type.UI;

public class Main {

    public static void main(String[] args) {
        PresentationSpecs presentationSpecs = new PresentationSpecs(UI, "Angular v5.0");
        String result = Stream.<Function<PresentationSpecs, Optional<String>>>of(
                AngularSpeaker::makePresentation,
                JavaSpeaker::makePresentation,
                MobileSpeaker::makePresentation,
                FrodoBaggins::makePresentation)
                .map(f->f.apply(presentationSpecs))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("I'am a junior"));

        System.out.println(result);
    }
}
