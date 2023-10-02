package com.marcio.springsecuritybasicsec6.controller;

import com.marcio.springsecuritybasicsec6.model.Notice;
import com.marcio.springsecuritybasicsec6.repository.NoticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
public class NoticeController {

    @Autowired
    private NoticeRepository repository;
    @GetMapping("/notices")
    public ResponseEntity<List<Notice>> getNotices(){
        List<Notice> notices = repository.findAllActiveNotices();
        if(notices != null){
            return ResponseEntity.ok()
                    .cacheControl(CacheControl.maxAge(60, TimeUnit.SECONDS))
                    .body(notices);
        }else {
            return null;
        }
    }
}
