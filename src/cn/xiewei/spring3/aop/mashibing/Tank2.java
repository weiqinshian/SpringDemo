package cn.xiewei.spring3.aop.mashibing;
import java.util.Random;
public class Tank2 extends Tank{
    public void move() {//重写父类的move方法
        long start=System.currentTimeMillis();
        super.move();//调用父类的move方法
        long end=System.currentTimeMillis();
        System.out.println("time:"+(start-end));
    }
}
