package com.example.sql.demo.resource;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

/*
 * @author: Sundar Gautam
 * @create date: 7/16/2020
 */
@ApiModel(value = "dummy data")
@Data
@Builder
public class Dummy{

    @ApiModelProperty(value = "name of a user")
    private String name;
}
