package com.cursoapirest.status;

import org.springframework.http.ResponseEntity;

public interface StatusApi {

    ResponseEntity<StatusDTO> getStatus();
}
