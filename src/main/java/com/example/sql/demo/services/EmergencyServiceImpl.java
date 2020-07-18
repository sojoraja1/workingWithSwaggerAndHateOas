package com.example.sql.demo.services;
/*
 * @author: Sundar Gautam
 * @create date: 7/13/2020
 */

import com.example.sql.demo.entity.AlertMessage;
import com.example.sql.demo.repository.AlertMessageRepository;
import com.example.sql.demo.repository.AlertRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmergencyServiceImpl implements EmergencyService {
    private final AlertRepository alertRepository;
    private final AlertMessageRepository alertMessageRepository;

    public EmergencyServiceImpl(AlertRepository alertRepository, AlertMessageRepository alertMessageRepository) {
        this.alertRepository = alertRepository;
        this.alertMessageRepository = alertMessageRepository;
    }


}
