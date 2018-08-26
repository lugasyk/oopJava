package pets;

import attribute.Creator;
import attribute.Fur;

public class Abysin extends Cat {
    public Abysin() {
        super(Creator.createClaws(20), Fur.BALD);
    }
}