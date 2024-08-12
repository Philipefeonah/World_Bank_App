package com.maxiflexy.service;

import com.maxiflexy.payload.respond.BankResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

public interface GeneralUserService {

    ResponseEntity<BankResponse<String>> uploadProfilePics(Long id, MultipartFile multipartFile);

}
