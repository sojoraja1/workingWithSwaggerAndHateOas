package com.example.sql.demo.controller;
/*
 * @author: Sundar Gautam
 * @create date: 7/13/2020
 */

import com.example.sql.demo.resource.Dummy;
import com.example.sql.demo.services.EmergencyService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@Validated
public class EmergencyController {


    private final EmergencyService emergencyService;

    public EmergencyController(EmergencyService emergencyService){
        this.emergencyService = emergencyService;
    }

    @GetMapping("/check/{id}")
    @ApiOperation(value = "access deatial",notes = "helps to access details",produces = "application/json")
    public CollectionModel<EntityModel<Dummy>> check(@ApiParam(name = "opps") @PathVariable("id") int id){

        List<Dummy> dummies = Arrays.asList(
                Dummy.builder().name("sundar").build(),
                Dummy.builder().name("sss").build());

        List<EntityModel<Dummy>> mydummy = dummies.stream().map(data->{

            if (data.getName()=="sss"){
                return new EntityModel<>(data,Link.of("/ss"));
            }
            return new EntityModel<>(data,Link.of("/wow"));



        }).collect(Collectors.toList());

        return CollectionModel.of(mydummy);

    }


}
