import attribute.Claw;
import pets.*;

public class BeautySalon {
    public static void main(String[] args){
        BeautySalon beautySalon = new BeautySalon();
        beautySalon.startprogramm();
    }

    public void startprogramm() {
        Pet[] beautysalon = new Pet[6];
        beautysalon[0] = new MainCoon();
        beautysalon[1] = new Abysin();
        beautysalon[2] = new StreetCat();
        beautysalon[3] = new Shepherd();
        beautysalon[4] = new Terrier();
        beautysalon[5] = new StreetDog();
        cutclaw((Cat) beautysalon[0]);
        cutclaw((Cat) beautysalon[1]);
        cutclaw((Cat) beautysalon[2]);
        cutclaws((Dog) beautysalon[3]);
        cutclaws((Dog) beautysalon[4]);
        cutclaws((Dog) beautysalon[5]);
        washpet(beautysalon[1]);
        washpet(beautysalon[3]);
        washpet(beautysalon[5]);


    }


    public void cutclaw(Cat cat){
        Claw[] claws = cat.getClaws();
        for (int i = 0; i < claws.length; i++){
            claws[i] = Claw.CUT;
        }
        System.out.println("Claws cut");
    }

    public void cutclaws(Dog dog){
        Claw[] claws = dog.getClaws();
        for (int i = 0; i < claws.length; i++){
            claws[i] = Claw.CUT;
        }
        System.out.println("Claws clipped");
    }

    public void washpet(Pet pet){
        if (pet instanceof Cat){
            System.out.println("Time for washing anb dry 2 - 2,5 hours");
        }
        else if (pet instanceof Dog){
            System.out.println("Time for washing anb dry 7 - 8 hours");
        }
    }
}
