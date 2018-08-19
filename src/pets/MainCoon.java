package pets;

import attribute.Creator;
import attribute.Fur;

public class MainCoon extends Pet {
        public MainCoon() {
            super(Creator.createClaws(20), Fur.FLUFFY);
        }
}

