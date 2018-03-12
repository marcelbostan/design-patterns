package contemporan2;

import classic.PresentationSpecs;

import java.util.Arrays;
import java.util.Optional;

import static classic.PresentationSpecs.Type.UI;
import static java.lang.String.join;

public class AngularSpeaker {
    private static final String SUBJECT = "Subject: ";
    private static final String LIFE_MOTTO = "Angular is better than React";
    private static final String ON_COMPLETE_MSG = "I made a cool presentation";

    public static Optional<String> makePresentation(PresentationSpecs specs) {
        return Optional.ofNullable(specs)
                .filter(f -> f.getType() == UI)
                .map(f -> join(". ", Arrays.asList(LIFE_MOTTO, ON_COMPLETE_MSG, SUBJECT + specs.getSubject())));
    }
}
