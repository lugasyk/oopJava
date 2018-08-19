package pets;

import attribute.Claw;
import attribute.Fur;

import java.util.Arrays;

public abstract class Pet {

    private Claw[] claws;

    private Fur fur;

    public Pet( Claw[] claws, Fur fur){
        this.claws = claws;
        this.fur = fur;
    }

    public void bark(){
        System.out.println("Woff,Woff! ");


    }
    public void feed(){
        System.out.println("I'm hungry");
    }

    @Override
    public String toString() {
        return "Pet{" +
                "claws=" + Arrays.toString(claws) +
                ", fur=" + fur +
                '}';
    }

    public Claw[] getClaws() {
        return claws;
    }

    public void setClaws(Claw[] claws) {
        this.claws = claws;
    }

    public Fur getFur() {
        return fur;
    }

    public void setFur(Fur fur) {
        this.fur = fur;
    }
}