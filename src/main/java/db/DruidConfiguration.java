package db;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by Administrator on 2019/5/8.
 */
@Configuration
public class DruidConfiguration {

    @Bean(name = "datasource1")
    public DataSource dataSource1(
            @Value("${datasorce1.driver}") String driver,
            @Value("${datasorce1.url}") String url,
            @Value("${datasorce1.username}") String username,
            @Value("${datasorce1.password}") String password,
            @Value("${datasorce1.minIdle}") int minIdle,
            @Value("${datasorce1.maxActive}") int maxActive,
            @Value("${datasorce1.initialSize}") int initialSize,
            @Value("${datasorce1.timeBetweenEvictionRunsMillis}") long timeBetweenEvictionRunsMillis,
            @Value("${datasorce1.minEvictableIdleTimeMillis}") long minEvictableIdleTimeMillis,
            @Value("${datasorce1.validationQuery}") String validationQuery,
            @Value("${datasorce1.testWhileIdle}") boolean testWhileIdle,
            @Value("${datasorce1.testOnBorrow}") boolean testOnBorrow,
            @Value("${datasorce1.testOnReturn}") boolean testOnReturn) {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(driver);
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        druidDataSource.setMinIdle(minIdle);
        druidDataSource.setMaxActive(maxActive);
        druidDataSource.setInitialSize(initialSize);
        druidDataSource
                .setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        druidDataSource
                .setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        druidDataSource.setValidationQuery(validationQuery);
        druidDataSource.setTestWhileIdle(testWhileIdle);
        druidDataSource.setTestOnBorrow(testOnBorrow);
        druidDataSource.setTestOnReturn(testOnReturn);
        return druidDataSource;

    }
}
