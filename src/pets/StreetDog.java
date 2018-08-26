package pets;

import attribute.Creator;
import attribute.Fur;

public class StreetDog extends Dog {
    public StreetDog(){
        super(Creator.createClaws(22), Fur.FLUFFY );
    }

}
