package contemporan1;

import classic.PresentationSpecs;

import java.util.Arrays;
import java.util.function.Consumer;

import static classic.PresentationSpecs.*;
import static java.lang.String.join;

public class JavaSpeaker implements Consumer<PresentationSpecs> {
    private static final String SUBJECT = "Subject: ";
    private static final String LIFE_MOTTO = "I'm a guru in java";
    private static final String ON_COMPLETE_MSG = "I made a cool presentation";

    @Override
    public void accept(PresentationSpecs specs) {
        if (specs.getType() == Type.BACK_END) {
            System.out.println(join(". ", Arrays.asList(LIFE_MOTTO, ON_COMPLETE_MSG, SUBJECT + specs.getSubject())));
        }
    }
}
