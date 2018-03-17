package lesBieresDuDev;

public class Main {

    public static void combien(double litres){
        int girafe = (int) litres/3;
        litres -= girafe*3;
        int pinte = (int)(litres/0.5);
        litres -= pinte*0.5;
        int demi = (int)(litres/0.25);
        litres -= demi*0.25;
        int galopin = (int)(litres/0.125);

        System.out.print("girafe: "+girafe+"\n"+
                "pinte: "+pinte+"\n"+
                "demi: "+demi+"\n"+
                "galopin: "+galopin);
    }

    public static void main(String[] args){
        combien(Double.parseDouble(args[0]));
    }
}
