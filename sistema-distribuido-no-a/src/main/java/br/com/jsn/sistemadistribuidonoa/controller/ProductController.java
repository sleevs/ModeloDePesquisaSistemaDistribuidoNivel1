package br.com.jsn.sistemadistribuidonoa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jsn.sistemadistribuidonoa.dto.ProductDto;
import br.com.jsn.sistemadistribuidonoa.service.MessageProduceService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("product/v1")
public class ProductController {

    @Autowired
    MessageProduceService messageProduceService;

    
    @GetMapping("/buscar")
    public ResponseEntity<String> testProduct(){

        return ResponseEntity.ok("TESTE PRODUTO OK");
    }

    @PostMapping("/novo")
    public ResponseEntity<String> novoPedido(@RequestBody List<ProductDto> request){

      // String result = messageProduceService.solicitarProduto(request);
        return ResponseEntity.ok(" PRODUTO SOLICITADO" + request  );
    }
    
}
