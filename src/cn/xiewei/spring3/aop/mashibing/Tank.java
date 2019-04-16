package cn.xiewei.spring3.aop.mashibing;
import java.util.Random;
public class Tank implements Movable{
    public void move() {
        long start=System.currentTimeMillis();
        System.out.println("Tank moving.......");
        try {
            Thread.sleep(new Random().nextInt(5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end=System.currentTimeMillis();
        System.out.println("time:"+(start-end));
    }
}
