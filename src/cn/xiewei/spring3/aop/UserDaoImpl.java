package cn.xiewei.spring3.aop;

public class UserDaoImpl implements BaseDao {
    public void add(User user) {
        System.out.println("����user�����ݿ⡭����������");
    }

    public void update(User user) {       
        System.out.println("����user�����ݿ⡭����������");
    }       
}
