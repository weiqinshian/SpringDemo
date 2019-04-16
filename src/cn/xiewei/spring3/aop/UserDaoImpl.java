package cn.xiewei.spring3.aop;

public class UserDaoImpl implements BaseDao {
    public void add(User user) {
        System.out.println("保存user到数据库………………");
    }

    public void update(User user) {       
        System.out.println("更新user到数据库………………");
    }       
}
