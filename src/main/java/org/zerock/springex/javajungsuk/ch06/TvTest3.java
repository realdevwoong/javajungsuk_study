package org.zerock.springex.javajungsuk.ch06;

public class TvTest3 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1의 channel1값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel2값은 " + t2.channel + "입니다.");

        t2=t1;
        t1.channel=7;
        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel+ "입니다.");
    }
}
