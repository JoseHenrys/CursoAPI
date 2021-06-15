package com.cursoapirest.modulos.status.rest;

import com.cursoapirest.modulos.status.dto.StatusDTO;
import org.springframework.http.ResponseEntity;

public interface StatusApi {

    ResponseEntity<StatusDTO> getStatus();
}
