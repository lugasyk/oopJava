package dog;

public abstract class Dog {

    private int[] mustache = { 3, 4 , 7, 8, 9, 10};
    private int[] claws = { 20, 24, 30};

    private String[] fur = {"bold", "fluffy", "short-haired"};

    public Dog(int[] mustache, int[] claws, String[] fur){
        this.mustache = mustache;
        this.claws = claws;
        this.fur = fur;
    }

    public void bark(){
        System.out.println("Woff,Woff! ");


    }
    public void feed(){
        System.out.println("I'm hungry");
    }
    public int[] getMustache() {
        return mustache;
    }

    public int[] getClaws() {
        return claws;
    }

    public String[] getFur() {
        return fur;
    }

    public void setClaws(int[] claws) {
        this.claws = claws;
    }
    public void setFur(String[] fur) {
        this.fur = fur;
    }

    public void setMustache(int[] mustache) {
        this.mustache = mustache;
    }

    @Override
    public String toString(){
        return getClass().getSimpleName() + "{" +
                "mustache=" + mustache +
                "claws=" + claws +
                "fur=" + fur +
                "}";
    }

}