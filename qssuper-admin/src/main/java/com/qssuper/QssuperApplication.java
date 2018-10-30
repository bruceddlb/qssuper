package com.qssuper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.qssuper.common.config.Global;

/**
 * 启动程序
 * 
 * @author qssuper
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@MapperScan("com.qssuper.*.mapper")
public class QssuperApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(QssuperApplication.class, args);
		System.out.println("===================================");
		System.out.println("(◠‿◠)ﾉﾞ  启动成功........");
		System.out.println("浏览地址：http://localhost:" + Global.getPort());
		System.out.println("===================================");
	}

}
