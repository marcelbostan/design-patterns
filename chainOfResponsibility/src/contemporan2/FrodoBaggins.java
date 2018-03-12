package contemporan2;

import classic.PresentationSpecs;
import java.util.Optional;


public class FrodoBaggins {

    public static Optional<String> makePresentation(PresentationSpecs specs) {
        return Optional.ofNullable(specs)
                .filter(f -> f.getType() == null)
                .map(f -> "I will take the Ring");
    }
}
