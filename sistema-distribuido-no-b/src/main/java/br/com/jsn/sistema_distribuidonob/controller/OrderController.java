package br.com.jsn.sistema_distribuidonob.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("order/v1")
public class OrderController {


      
      @GetMapping
      public ResponseEntity<String> testProduct(){

        return ResponseEntity.ok("MUNIZ SOARES ENGENHARIA DE SOFTWARE - TESTE ORDER OK");
    }
    
}
