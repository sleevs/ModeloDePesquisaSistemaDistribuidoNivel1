package br.com.jsn.entidade;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AssinaturaPagamento.class)
public abstract class AssinaturaPagamento_ {

	public static volatile SingularAttribute<AssinaturaPagamento, Double> assinaturaPagamentoTarifa;
	public static volatile SingularAttribute<AssinaturaPagamento, Double> assinaturaPagamentoTotal;
	public static volatile SingularAttribute<AssinaturaPagamento, Integer> assinaturaPagamentoId;
	public static volatile SingularAttribute<AssinaturaPagamento, String> assinaturaPagamentoFlag;
	public static volatile SingularAttribute<AssinaturaPagamento, Double> assinaturaPagamentoDesconto;
	public static volatile SingularAttribute<AssinaturaPagamento, Double> assinaturaPagamentoValor;
	public static volatile SingularAttribute<AssinaturaPagamento, Assinatura> assinaturaAssinaturaId;
	public static volatile SingularAttribute<AssinaturaPagamento, FormaPagamento> formaPagamentoFormaPagamentoId;

}

