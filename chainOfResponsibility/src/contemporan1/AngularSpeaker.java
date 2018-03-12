package contemporan1;

import classic.PresentationSpecs;

import java.util.Arrays;
import java.util.function.Consumer;

import static java.lang.String.join;
import static classic.PresentationSpecs.*;

public class AngularSpeaker implements Consumer<PresentationSpecs> {
    private static final String SUBJECT = "Subject: ";
    private static final String LIFE_MOTTO = "Angular is better than React";
    private static final String ON_COMPLETE_MSG = "I made a cool presentation";

    @Override
    public void accept(PresentationSpecs specs) {
        if (specs.getType() == Type.UI) {
            System.out.println(join(". ", Arrays.asList(LIFE_MOTTO, ON_COMPLETE_MSG, SUBJECT + specs.getSubject())));
        }
    }
}
