/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bvr.com.jsn.rs.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author ADMINIBM
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(bvr.com.jsn.rs.service.AnuncioFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.AnuncioStatusFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.ArquivoFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.AssinaturaFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.AssinaturaStatusFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.AtividadeFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.CargaFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.ChamadaFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.ChamadaStatusFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.CompartilharFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.CompraFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.CompraServicoFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.CompraStatusFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.ContaFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.ContaStatusFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.ContratoFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.CorridaFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.CorridaServicoFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.CorridaStatusFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.CurtirFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.DestinoFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.DocumentoFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.EnderecoFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.EntregaFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.EntregaServicoFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.EntregaStatusFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.FormaPagamentoFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.HospedagemFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.HospedagemServicoFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.HospedagemStatusFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.ItemFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.ItemProdutoFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.MembroFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.MensagemFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.PagamentoFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.PagamentoStatusFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.PaginaFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.PedidoFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.PlanoFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.PrecosFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.ProblemaFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.ProdutoFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.PropostaFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.PropostaStatusFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.QualificarFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.RegistroFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.ReservaFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.RotaFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.SecurityContaFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.SecurityFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.ServicoFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.ServicoStatusFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.ServicoTarefaFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.SocialFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.SolucaoFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.SolucaoProblemaFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.TarefaFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.TarefaStatusFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.TransporteFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.VisitaFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.VisitaPaginaFacadeREST.class);
        resources.add(bvr.com.jsn.rs.service.VisitaStatusFacadeREST.class);
    }
    
}
