package cn.xiewei.spring3.aop;
public class Test {
    public static void main(String[] args) {
        UserDaoImpl userDao= new UserDaoImpl();
        Proxy proxy=new Proxy(userDao);
        proxy.add(new User());
        proxy.update(new User());
    }
}
