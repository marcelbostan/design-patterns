package classic;


import java.util.Arrays;

import static java.lang.String.join;

public class MobileSpeaker extends AbstractSpeaker {
    private static final String SUBJECT = "Subject: ";
    private static final String LIFE_MOTTO = "I love mobile applications";
    private static final String ON_COMPLETE_MSG = "I made a cool presentation";

    @Override
    public void makePresentation(PresentationSpecs specs) {
        if (specs.getType() == PresentationSpecs.Type.MOBILE) {
            System.out.println( join(". ", Arrays.asList(LIFE_MOTTO, ON_COMPLETE_MSG, SUBJECT + specs.getSubject())));
        }
        if (nextSpeaker != null) {
            nextSpeaker.makePresentation(specs);
        }
    }
}
