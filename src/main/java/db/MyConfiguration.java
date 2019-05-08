package db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by Administrator on 2019/5/8.
 */
@Configuration
public class MyConfiguration {

    @Autowired
    @Qualifier( "datasource1")
    private DataSource dataSourc1e;
}
