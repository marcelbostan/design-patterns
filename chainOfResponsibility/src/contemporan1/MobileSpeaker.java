package contemporan1;

import classic.PresentationSpecs;

import java.util.Arrays;
import java.util.function.Consumer;

import static classic.PresentationSpecs.Type.MOBILE;
import static java.lang.String.join;

public class MobileSpeaker implements Consumer<PresentationSpecs> {
    private static final String SUBJECT = "Subject: ";
    private static final String LIFE_MOTTO = "I love mobile applications";
    private static final String ON_COMPLETE_MSG = "I made a cool presentation";

    @Override
    public void accept(PresentationSpecs specs) {
        if (specs.getType() == MOBILE) {
            System.out.println(join(". ", Arrays.asList(LIFE_MOTTO, ON_COMPLETE_MSG, SUBJECT + specs.getSubject())));
        }
    }
}

