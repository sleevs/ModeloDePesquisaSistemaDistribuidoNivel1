package br.com.jsn.sistemadistribuidonoa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jsn.sistemadistribuidonoa.dto.ProductDto;
import br.com.jsn.sistemadistribuidonoa.producer.ProdutoRequestProducer;

@Service
public class ProduceService {

    @Autowired
    private ProdutoRequestProducer produtoRequestProducer;

    public String solicitarProduto(List<ProductDto> lista){
       
        try{
            produtoRequestProducer.solicitarProduto(lista);
        }catch(Exception e){
            e.getMessage();
            return "Erro ao realizar pedido ..... "+e.getMessage();
        }
        return "PEDIDO SENDO PROCESSADO";
    }




    public void erroRequestProduct(String payload){
        System.out.println(" ERRO AO CONSULTAR PRODUTO ----" +payload);
    }

    public void succesRequestProduct(String payload){
        System.out.println(" RESPOSTA DA CONSULTA COM SUCESSO ---- " +payload);
    }
    
    
}
