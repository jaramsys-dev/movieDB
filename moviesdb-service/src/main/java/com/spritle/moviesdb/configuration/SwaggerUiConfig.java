/**
 * Swagger Configuration Class for moviesDB
 * Create by Janarthanam 29/06/2020
 **/

package com.spritle.moviesdb.configuration;

import com.google.common.base.Predicate;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import static com.google.common.base.Predicates.or;
import org.springframework.context.annotation.Bean;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.spring.web.plugins.Docket;
import org.springframework.context.annotation.Configuration;
import static springfox.documentation.builders.PathSelectors.regex;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@ComponentScan("com.spritle.moviesdb")
public class SwaggerUiConfig {
  @Bean
  public Docket postsApi() {
    return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
          .apiInfo(apiInfo()).select().apis(RequestHandlerSelectors.basePackage("com.spritle.moviesdb.controller")).paths(postPaths()).build();
  }

  private Predicate<String> postPaths() {
    return or(regex("/api/v1/posts.*"), regex("/api/v1.*"));
  }

  private ApiInfo apiInfo() {
    return new ApiInfoBuilder().title("MoviesDB API")
            .description("MoviesDB API reference for developers")
            .termsOfServiceUrl("www.MoviesDB.com")
            .license("MoviesDB License")
            .licenseUrl("www.MoviesDB.com").version("1.0").build();
  }
}