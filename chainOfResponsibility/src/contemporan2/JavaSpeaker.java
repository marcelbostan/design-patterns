package contemporan2;

import classic.PresentationSpecs;

import java.util.Arrays;
import java.util.Optional;

import static classic.PresentationSpecs.Type.BACK_END;

import static java.lang.String.join;

public class JavaSpeaker{
    private static final String SUBJECT = "Subject: ";
    private static final String LIFE_MOTTO = "I'm a guru in java";
    private static final String ON_COMPLETE_MSG = "I made a cool presentation";

    public static Optional<String> makePresentation(PresentationSpecs specs) {
        return Optional.ofNullable(specs)
                .filter(f -> f.getType() == BACK_END)
                .map(f -> join(". ", Arrays.asList(LIFE_MOTTO, ON_COMPLETE_MSG, SUBJECT + specs.getSubject())));
    }
}
