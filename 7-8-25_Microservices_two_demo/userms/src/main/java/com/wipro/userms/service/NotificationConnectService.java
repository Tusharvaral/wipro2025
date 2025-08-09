package com.wipro.userms.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.wipro.userms.dto.NotificationDto;

@FeignClient(name = "notificationms")
public interface NotificationConnectService {

    @PostMapping("/notify")
    ResponseEntity<NotificationDto> sendNotification(@RequestBody NotificationDto notification);
}