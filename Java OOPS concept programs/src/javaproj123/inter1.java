package javaproj123;
interface cricket{
    void play();
}
public class inter1 implements cricket {
    public void play(){
        System.out.println("RCB");
    }
    public static void main(String[] args) {
        inter1 match1=new inter1();
        match1.play();
    }
}
