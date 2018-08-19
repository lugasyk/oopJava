package attribute;

public class Creator {

    public static Claw[] createClaws(int number) {
        Claw[] claws = new Claw[number];
        for (int i = 0; i < number; i++) {
            claws[i] = Claw.WILD;
        }
        return claws;
    }

}
