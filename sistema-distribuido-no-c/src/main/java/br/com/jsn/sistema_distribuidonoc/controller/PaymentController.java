package br.com.jsn.sistema_distribuidonoc.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("payment/v1")
public class PaymentController {
    
    
    
    @GetMapping("/teste")
    public ResponseEntity<String> testPayment(){

        return ResponseEntity.ok("MUNIZ SOARES ENGENHARIA DE SOFTWAR - TESTE INTEGRAÇÃO");
    }
}
