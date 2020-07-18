package com.example.sql.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.hateoas.client.LinkDiscoverer;
import org.springframework.hateoas.client.LinkDiscoverers;
import org.springframework.hateoas.mediatype.collectionjson.CollectionJsonLinkDiscoverer;
import org.springframework.plugin.core.SimplePluginRegistry;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
@EnableSwagger2
public class DemoApplication {
    @Bean
    public LinkDiscoverers discoverers() {
        List<LinkDiscoverer> plugins = new ArrayList<>();
        plugins.add(new CollectionJsonLinkDiscoverer());
        return new LinkDiscoverers(SimplePluginRegistry.create(plugins));

    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.ant("/check/*"))
                .apis(RequestHandlerSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }


    private ApiInfo apiInfo(){
        return new ApiInfo("emergency app","best app ever","1.0","donot copy paste"
                ,new springfox.documentation.service.Contact("sundar","www.babaji.com","sundargautam5@gmail.com"),
                "liscene under section eedsefsdf",
                "opps://not",
                Collections.EMPTY_LIST

        );



    }





    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
