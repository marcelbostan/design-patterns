package classic;

import java.util.Arrays;
import static java.lang.String.join;
public class AngularSpeaker extends AbstractSpeaker {
    private static final String SUBJECT = "Subject: ";
    private static final String LIFE_MOTTO = "Angular is better than React";
    private static final String ON_COMPLETE_MSG = "I made a cool presentation";

    @Override
    public void makePresentation(PresentationSpecs specs) {
        if (specs.getType() == PresentationSpecs.Type.UI) {
            System.out.println(join(". ", Arrays.asList(LIFE_MOTTO, ON_COMPLETE_MSG, SUBJECT + specs.getSubject())));
        }
        if (nextSpeaker != null) {
            nextSpeaker.makePresentation(specs);
        }
    }

}
