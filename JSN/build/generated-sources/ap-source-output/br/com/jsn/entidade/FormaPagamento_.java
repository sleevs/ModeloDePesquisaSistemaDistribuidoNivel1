package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(FormaPagamento.class)
public abstract class FormaPagamento_ {

	public static volatile SingularAttribute<FormaPagamento, Moeda> moedaMoedaId;
	public static volatile ListAttribute<FormaPagamento, Pagamento> pagamentoList;
	public static volatile SingularAttribute<FormaPagamento, Date> formaPagamentoData;
	public static volatile SingularAttribute<FormaPagamento, String> formaPagamentoTipo;
	public static volatile SingularAttribute<FormaPagamento, Boleto> boletoBoletoId;
	public static volatile SingularAttribute<FormaPagamento, Cartao> cartaoCartaoId;
	public static volatile SingularAttribute<FormaPagamento, Integer> formaPagamentoId;
	public static volatile ListAttribute<FormaPagamento, AssinaturaPagamento> assinaturaPagamentoList;

}

