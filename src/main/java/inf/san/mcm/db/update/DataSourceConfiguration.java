package inf.san.mcm.db.update;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class DataSourceConfiguration {

	@Bean
	@ConfigurationProperties("spring.master.datasource")
	public DataSourceProperties masterDataSourceProperties() {
		return new DataSourceProperties();
	}
	
	@Bean
	@ConfigurationProperties("spring.live.datasource")
	public DataSourceProperties liveDataSourceProperties() {
		return new DataSourceProperties();
	}
	
	@Bean
	public DataSource masterDataSource() {
		return masterDataSourceProperties()
				.initializeDataSourceBuilder()
				.build();
	}
	
	@Bean
	public DataSource liveDataSource() {
		return liveDataSourceProperties()
				.initializeDataSourceBuilder()
				.build();
	}
	
	@Bean
	public JdbcTemplate masterJdbcTemplate(@Qualifier("masterDataSource") DataSource dataSource) {
	    return new JdbcTemplate(dataSource);
	}

	@Bean
	public JdbcTemplate liveJdbcTemplate(@Qualifier("liveDataSource") DataSource dataSource) {
	    return new JdbcTemplate(dataSource);
	}
	
}
