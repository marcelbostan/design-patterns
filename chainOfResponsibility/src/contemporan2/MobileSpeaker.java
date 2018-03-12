package contemporan2;

import classic.PresentationSpecs;

import java.util.Arrays;
import java.util.Optional;

import static classic.PresentationSpecs.Type.MOBILE;
import static java.lang.String.join;

public class MobileSpeaker {
    private static final String SUBJECT = "Subject: ";
    private static final String LIFE_MOTTO = "I love mobile applications";
    private static final String ON_COMPLETE_MSG = "I made a cool presentation";

    public static Optional<String> makePresentation(PresentationSpecs specs) {
        return Optional.ofNullable(specs)
                .filter(f -> f.getType() == MOBILE)
                .map(f -> join(". ", Arrays.asList(LIFE_MOTTO, ON_COMPLETE_MSG, SUBJECT + specs.getSubject())));
    }
}
