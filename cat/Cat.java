public abstract class Cat {

    private int[] mustache = { 3, 4 , 7, 8, 9, 10};
    private int[] claws = { 20, 24, 30};
    private enum Size {
        SMALL,
        MEDIUM,
        BIG;
    }
    private String[] fur = {"bold", "fluffy", "short-haired"}

    public Cat(int[] mustache, int[] claws, enum Size, String[] fur){
        this.mustache = mustache;
        this.claws = claws;
        this.fur = fur;
        this.Size = size;
    }

    public void meow(){


    }
    public void feed(){

    }

}