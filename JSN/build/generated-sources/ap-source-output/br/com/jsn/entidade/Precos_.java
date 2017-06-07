package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Precos.class)
public abstract class Precos_ {

	public static volatile SingularAttribute<Precos, String> precoDescricao;
	public static volatile SingularAttribute<Precos, Double> precoTarifa;
	public static volatile SingularAttribute<Precos, String> precoCategoria;
	public static volatile ListAttribute<Precos, Hospedagem> hospedagemList;
	public static volatile SingularAttribute<Precos, Double> precoMes;
	public static volatile SingularAttribute<Precos, Double> precoSemana;
	public static volatile SingularAttribute<Precos, Double> precoDia;
	public static volatile SingularAttribute<Precos, Integer> precoId;
	public static volatile SingularAttribute<Precos, Double> precoTotal;
	public static volatile SingularAttribute<Precos, Date> precosData;
	public static volatile SingularAttribute<Precos, Double> precoValor;
	public static volatile SingularAttribute<Precos, String> precoTipo;
	public static volatile SingularAttribute<Precos, Double> precoHora;
	public static volatile SingularAttribute<Precos, Double> precoDesconto;

}

