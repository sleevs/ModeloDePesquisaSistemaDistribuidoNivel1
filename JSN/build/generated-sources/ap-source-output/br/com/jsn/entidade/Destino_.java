package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Destino.class)
public abstract class Destino_ {

	public static volatile SingularAttribute<Destino, Date> destinoData;
	public static volatile SingularAttribute<Destino, String> destinoPartidaCidade;
	public static volatile SingularAttribute<Destino, String> destinoPartidaLogradouro;
	public static volatile SingularAttribute<Destino, String> destinoPartidaCep;
	public static volatile SingularAttribute<Destino, String> destinoFinalPais;
	public static volatile ListAttribute<Destino, Corrida> corridaList;
	public static volatile SingularAttribute<Destino, Integer> destinoId;
	public static volatile SingularAttribute<Destino, String> destinoPartidaComplemento;
	public static volatile SingularAttribute<Destino, Double> destinoTempo;
	public static volatile SingularAttribute<Destino, String> destinoPartidaBairro;
	public static volatile SingularAttribute<Destino, String> destinoFinalComplemento;
	public static volatile SingularAttribute<Destino, String> destinoPartidaUf;
	public static volatile SingularAttribute<Destino, String> destinoFinalUf;
	public static volatile SingularAttribute<Destino, Double> destinoDistancia;
	public static volatile SingularAttribute<Destino, String> destinoFinalCep;
	public static volatile SingularAttribute<Destino, String> destinoFinalBairro;
	public static volatile SingularAttribute<Destino, String> destinoPartidaPais;
	public static volatile SingularAttribute<Destino, String> destinoPartidaNome;
	public static volatile SingularAttribute<Destino, String> destinoFinalCidade;

}

