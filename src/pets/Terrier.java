package pets;

import attribute.Creator;
import attribute.Fur;

public class Terrier extends Pet {
    public Terrier(){
        super(Creator.createClaws(14), Fur.FLUFFY);
    }
}
