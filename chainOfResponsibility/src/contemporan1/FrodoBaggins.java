package contemporan1;

import classic.PresentationSpecs;

import java.util.function.Consumer;

public class FrodoBaggins implements Consumer<PresentationSpecs> {
    @Override
    public void accept(PresentationSpecs specs) {
        System.out.println("I will take the Ring");
    }
}
