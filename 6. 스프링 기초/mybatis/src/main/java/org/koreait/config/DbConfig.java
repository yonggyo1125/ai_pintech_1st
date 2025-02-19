package org.koreait.config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DbConfig {

    @Bean(destroyMethod = "close")
    public DataSource dataSource() {
        DataSource ds = new DataSource();
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUrl("jdbc:oracle:thin:@localhost:1522:XE");
        ds.setUsername("POKEMON");
        ds.setPassword("oracle");

        ds.setMaxActive(10);
        ds.setInitialSize(2);
        ds.setTestWhileIdle(true);
        

        return ds;
    }
}
