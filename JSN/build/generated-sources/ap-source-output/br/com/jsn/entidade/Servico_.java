package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Servico.class)
public abstract class Servico_ {

	public static volatile SingularAttribute<Servico, String> servicoNome;
	public static volatile ListAttribute<Servico, EntregaServico> entregaServicoList;
	public static volatile ListAttribute<Servico, ServicoTarefa> servicoTarefaList;
	public static volatile SingularAttribute<Servico, Double> servicoTotal;
	public static volatile ListAttribute<Servico, HospedagemServico> hospedagemServicoList;
	public static volatile SingularAttribute<Servico, String> servicoTipo;
	public static volatile ListAttribute<Servico, Pagamento> pagamentoList;
	public static volatile ListAttribute<Servico, CompraServico> compraServicoList;
	public static volatile ListAttribute<Servico, CorridaServico> corridaServicoList;
	public static volatile ListAttribute<Servico, ServicoStatus> servicoStatusList;
	public static volatile SingularAttribute<Servico, Integer> servicoId;
	public static volatile ListAttribute<Servico, Contrato> contratoList;
	public static volatile SingularAttribute<Servico, Anuncio> anuncioAnuncioId;
	public static volatile SingularAttribute<Servico, String> servicoCategoria;
	public static volatile SingularAttribute<Servico, Double> servicoValor;
	public static volatile SingularAttribute<Servico, String> servicoDesconto;
	public static volatile SingularAttribute<Servico, Date> servicoData;
	public static volatile SingularAttribute<Servico, Double> servicoTarifa;
	public static volatile ListAttribute<Servico, Qualificar> qualificarList;

}

