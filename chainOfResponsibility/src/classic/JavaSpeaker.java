package classic;

import java.util.Arrays;
import static java.lang.String.join;
public class JavaSpeaker extends AbstractSpeaker {
    private static final String SUBJECT = "Subject: ";
    private static final String LIFE_MOTTO = "I'm a guru in java";
    private static final String ON_COMPLETE_MSG = "I made a cool presentation";
    @Override
    public void makePresentation(PresentationSpecs specs) {
        if (specs.getType() == PresentationSpecs.Type.BACK_END) {
            System.out.println(join(". ", Arrays.asList(LIFE_MOTTO, ON_COMPLETE_MSG, SUBJECT + specs.getSubject())));
        }
        if (nextSpeaker != null) {
            nextSpeaker.makePresentation(specs);
        }
    }
}
