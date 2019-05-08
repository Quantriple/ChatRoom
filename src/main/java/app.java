import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by Administrator on 2019/5/8.
 */
@SpringBootApplication
@EnableTransactionManagement
public class app {
    public static void main(String[] args) {
        SpringApplication.run(app.class);
    }
}
