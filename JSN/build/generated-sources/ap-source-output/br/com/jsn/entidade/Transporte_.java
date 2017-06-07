package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Transporte.class)
public abstract class Transporte_ {

	public static volatile SingularAttribute<Transporte, String> transporteImagem;
	public static volatile SingularAttribute<Transporte, String> transporteDescricao;
	public static volatile SingularAttribute<Transporte, Date> transporteAno;
	public static volatile SingularAttribute<Transporte, Integer> transporteKm;
	public static volatile SingularAttribute<Transporte, Double> transporteValor;
	public static volatile SingularAttribute<Transporte, Double> transporteTarifa;
	public static volatile SingularAttribute<Transporte, String> transporteCor;
	public static volatile SingularAttribute<Transporte, String> transporteCategoria;
	public static volatile SingularAttribute<Transporte, String> transporteTipo;
	public static volatile SingularAttribute<Transporte, Double> transporteCusto;
	public static volatile SingularAttribute<Transporte, Integer> transporteId;
	public static volatile SingularAttribute<Transporte, String> transporteNome;

}

