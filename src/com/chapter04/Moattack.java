package com.chapter04;
interface Geli{
    public void responseAsk();
}
class LiuDeHua implements Geli{
    public LiuDeHua() {
    }
    @Override
    public void responseAsk() {
        System.out.println("墨者革离");
    }
}
public class Moattack {
//    public static void main(String[] args) {
//        Geli geli = new LiuDeHua();
//        geli.responseAsk();
//    }
    private Geli geli;


    public void setGeli(Geli geli) {
        this.geli = geli;
    }

    public void cityGatAsk(){
        geli.responseAsk();
    }
}
