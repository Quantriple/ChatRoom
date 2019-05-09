package cn.qq.db;

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
            @Value("${datasource1.driver}") String driver,
            @Value("${datasource1.url}") String url,
            @Value("${datasource1.username}") String username,
            @Value("${datasource1.password}") String password,
            @Value("${datasource1.minIdle}") int minIdle,
            @Value("${datasource1.maxActive}") int maxActive,
            @Value("${datasource1.initialSize}") int initialSize,
            @Value("${datasource1.timeBetweenEvictionRunsMillis}") long timeBetweenEvictionRunsMillis,
            @Value("${datasource1.minEvictableIdleTimeMillis}") long minEvictableIdleTimeMillis,
            @Value("${datasource1.validationQuery}") String validationQuery,
            @Value("${datasource1.testWhileIdle}") boolean testWhileIdle,
            @Value("${datasource1.testOnBorrow}") boolean testOnBorrow,
            @Value("${datasource1.testOnReturn}") boolean testOnReturn) {
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
