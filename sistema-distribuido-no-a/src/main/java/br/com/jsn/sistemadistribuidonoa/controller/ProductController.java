package br.com.jsn.sistemadistribuidonoa.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("product/v1")
public class ProductController {


    
    @GetMapping
    public ResponseEntity<String> testProduct(){

        return ResponseEntity.ok("TESTE PRODUTO OK");
    }
    
}
