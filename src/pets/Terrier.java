package pets;

import attribute.Creator;
import attribute.Fur;

public class Terrier extends Dog {
    public Terrier(){
        super(Creator.createClaws(14), Fur.FLUFFY);
    }
}
