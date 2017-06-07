package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Pagamento.class)
public abstract class Pagamento_ {

	public static volatile SingularAttribute<Pagamento, Integer> pagamentoId;
	public static volatile SingularAttribute<Pagamento, Date> pagamentoData;
	public static volatile SingularAttribute<Pagamento, String> pagamentoFlag;
	public static volatile SingularAttribute<Pagamento, Conta> contaContaId;
	public static volatile SingularAttribute<Pagamento, Double> pagamentoValor;
	public static volatile SingularAttribute<Pagamento, Double> pagamentoTarifa;
	public static volatile SingularAttribute<Pagamento, String> pagamentoDescricao;
	public static volatile SingularAttribute<Pagamento, Double> pagamentoValortotal;
	public static volatile SingularAttribute<Pagamento, PagamentoStatus> pagamentoStatusPagamentoStatus;
	public static volatile SingularAttribute<Pagamento, String> pagamentoTipo;
	public static volatile SingularAttribute<Pagamento, Servico> servicoServicoId;
	public static volatile SingularAttribute<Pagamento, FormaPagamento> formaPagamentoFormaPagamentoId;

}

