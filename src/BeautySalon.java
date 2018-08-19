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
    }
}
