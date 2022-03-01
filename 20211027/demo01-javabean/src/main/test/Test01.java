import com.kgc.dao.NewsDao;
import com.kgc.dao.impl.NewsDaoImpl;
import com.kgc.entity.News;

import java.util.Date;

public class Test01 {
    public static void main(String[] args) {
        // 面向接口编程
        NewsDao newsDao = new NewsDaoImpl();
        newsDao.getNewsList();
        //newsDao.add(4,1,"许电大事件","出安全事故了","有人的寝室着火了",new Date());

        News news1 = new News(5,1,"许电校园墙","不好了，着火了",
                "有人抽烟惹事了",null,"刘启书",new Date(), new Date());

        newsDao.add2(news1);
        newsDao.getNewsList();

    }

}
