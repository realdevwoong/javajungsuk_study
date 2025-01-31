package org.zerock.springex.javajungsuk.ch06;

class Tv{
    String color;
    boolean power;
    int channel;

    void power() {power=!power;}
    void channelUp() {++channel;}
    void channelDown(){--channel;}
}
public class TvTest {
    public static void main(String[] args) {
        Tv t;//참조변수 t선언
        t = new Tv();//인스턴스 생성 후, 주소를 t에 저장
        t.channel=7;
        t.channelDown();
        System.out.println("현재 채널은 "+ t.channel+" 입니다.");
    }
}

