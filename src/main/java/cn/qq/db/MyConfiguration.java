package cn.qq.db;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Created by Administrator on 2019/5/8.
 */
@Configuration
@MapperScan(basePackages = {"cn.qq.dao"})
public class MyConfiguration {

    @Autowired
    @Qualifier("datasource1")
    private DataSource dataSourc1e;

    @Bean(name = "SqlSessionFactory")
    public SqlSessionFactoryBean sqlSessionFactory(@Value("${mybatis.mapper-locations}") String mapperLocations,@Value("${mybatis.type-aliases-package}")String typeAliasesPackage) throws Exception {
        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSourc1e);
        sessionFactoryBean.setMapperLocations((new PathMatchingResourcePatternResolver().getResources(mapperLocations)));
        sessionFactoryBean.setTypeAliasesPackage(typeAliasesPackage);
        return sessionFactoryBean;
    }
    @Bean(name = "TransactionManager")
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSourc1e);
    }

}
