package com.example.springandangular_group1_ams.respone;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class ApiRespone <T>{
    String message;
    T payload;
}
