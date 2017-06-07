package br.com.jsn.entidade;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Moeda.class)
public abstract class Moeda_ {

	public static volatile SingularAttribute<Moeda, String> moedaNome;
	public static volatile SingularAttribute<Moeda, Double> moedaValor;
	public static volatile SingularAttribute<Moeda, Double> moedaTarifa;
	public static volatile ListAttribute<Moeda, FormaPagamento> formaPagamentoList;
	public static volatile SingularAttribute<Moeda, Integer> moedaId;
	public static volatile SingularAttribute<Moeda, Double> moedaValorCambio;
	public static volatile SingularAttribute<Moeda, String> moedaOrigem;

}

