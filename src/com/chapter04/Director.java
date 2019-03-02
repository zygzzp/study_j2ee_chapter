package com.chapter04;
//通过构造函数，指定演员
public class Director {
    public static void main(String[] args) {
        Geli geli = new LiuDeHua();
        Moattack moattack =new Moattack(geli);
        moattack.cityGatAsk();
    }

}
