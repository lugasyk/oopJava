package pets;


import attribute.Creator;
import attribute.Fur;

public class StreetCat extends Pet {
    public StreetCat(){
        super(Creator.createClaws(24), Fur.SHORT_FUR);
    }
}
