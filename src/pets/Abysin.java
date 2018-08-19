package pets;

import attribute.Creator;
import attribute.Fur;

public class Abysin extends Pet {
    public Abysin() {
        super(Creator.createClaws(20), Fur.BALD);
    }
}