package cn.xiewei.spring3.aop;
public class Proxy implements BaseDao{
    private BaseDao baseDao;
    public Proxy(BaseDao baseDao) {
       super();
       this.baseDao=baseDao;
    }
    public void add(User user) {
        writeLog("add user");
        baseDao.add(user);
    }
    public void update(User user) {       
        writeLog("update user");
        baseDao.update(user);
    }     
    public void writeLog(String type) {
        System.out.println(type+",记一笔日志到数据库…………");

    }
}
