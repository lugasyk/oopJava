package pets;

import attribute.Creator;
import attribute.Fur;

public class Shepherd extends Pet {
    public Shepherd(){
        super(Creator.createClaws(23), Fur.SHORT_FUR);
    }
}
