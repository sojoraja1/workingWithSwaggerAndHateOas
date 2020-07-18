package com.example.sql.demo.repository;
/*
 * @author: Sundar Gautam
 * @create date: 7/13/2020
 */

import com.example.sql.demo.entity.AlertMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface AlertMessageRepository extends PagingAndSortingRepository<AlertMessage,Long> {



}
