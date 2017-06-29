package tutorial24.springmvc.annotationconfig;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import tutorial24.springmvc.DAO.AppDAOImpl;

@Configuration
public class AppConfig {
	
	@Bean
	public DataSource getDataSource() {
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setDriverClassName("org.apache.derby.jdbc.ClientDriver");
		dataSource.setUrl("jdbc:derby://localhost:1527/HibernateDerbyDB;create=true");
		dataSource.setUsername("user");
		dataSource.setPassword("password");
		
		return dataSource;
	}
	
	@Bean(name="DAOBean")
	public AppDAOImpl appDAO() {
		return new AppDAOImpl(getDataSource());
	}
}
