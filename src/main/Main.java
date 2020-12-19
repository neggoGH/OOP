package main;


import box.Box;
import box.BoxWeight;

public class Main {
    public static void main(String[] args) {
       Box box1 = new Box(15);
       Box box2 = box1.increase(2);
       BoxWeight box3 = new BoxWeight(box1, 15);
       box1.showInfo();
       box2.showInfo();
       box3.showInfo();


    }
}
