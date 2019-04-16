package cn.xiewei.spring3.aop.mashibing;
import java.util.Random;
public class Tank3  implements Movable{
    Tank t;
    Tank3(Tank t){
        this.t=t;
    }
    public void move() {//重写父类的move方法
        long start=System.currentTimeMillis();
        t.move();//调用父类的move方法
        long end=System.currentTimeMillis();
        System.out.println("time:"+(start-end));
    }
}
