package pets;

import attribute.Creator;
import attribute.Fur;

public class StreetDog extends Pet {
    public StreetDog(){
        super(Creator.createClaws(22), Fur.FLUFFY );
    }

}
