package com.qssuper.web.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.qssuper.common.config.Global;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger2的接口配置
 * 
 * @author qssuper
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean(value = "defaultApi")
	public Docket defaultApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				// 详细定制
				.apiInfo(apiInfo())
				.groupName("普通接口")
				.select()				
				// 指定当前包路径
				.apis(RequestHandlerSelectors
						.basePackage("com.qssuper.web.controller.api"))
				// 扫描所有 .apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any()).build();
	}

	@Bean(value = "groupRestApi")
	public Docket groupRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(groupApiInfo())
				.groupName("分组接口")
				.select()
				.apis(RequestHandlerSelectors
						.basePackage("com.qssuper.web.controller.api"))
				.paths(PathSelectors.any()).build();
	}

	/*
	 * 普通接口
	 */
	private ApiInfo apiInfo() {
		// 用ApiInfoBuilder进行定制
		return new ApiInfoBuilder().title("默认接口").description("描述：系统接口")
				.contact(new Contact(Global.getName(), null, null))
				.version("版本号:" + Global.getVersion()).build();
	}

	/*
	 * 分组接口
	 */
	private ApiInfo groupApiInfo() {
		return new ApiInfoBuilder().title("分组Api")
				.description("描述：分组接口")
				.contact(new Contact(Global.getName(), null, null))
				.version("版本号:" + Global.getVersion()).build();
	}

}
