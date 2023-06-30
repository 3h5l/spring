import com.cn.hl.config.SpringConfig;
import com.cn.hl.dao.BookDao;
import com.cn.hl.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = ctx.getBean(BookService.class);
        bookService.save();
        BookDao bookDao = ctx.getBean(BookDao.class);
        bookDao.save();
    }
}
