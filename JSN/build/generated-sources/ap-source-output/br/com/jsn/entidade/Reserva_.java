package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Reserva.class)
public abstract class Reserva_ {

	public static volatile SingularAttribute<Reserva, Integer> reservaId;
	public static volatile SingularAttribute<Reserva, String> reservaCategoria;
	public static volatile SingularAttribute<Reserva, String> reservaStatus;
	public static volatile SingularAttribute<Reserva, Double> reservaValor;
	public static volatile SingularAttribute<Reserva, Integer> reservaFlag;
	public static volatile SingularAttribute<Reserva, Hospedagem> hospedagemHospedagemId;
	public static volatile SingularAttribute<Reserva, String> reservaNome;
	public static volatile SingularAttribute<Reserva, String> reservaTipo;
	public static volatile SingularAttribute<Reserva, String> reservaDescricao;
	public static volatile SingularAttribute<Reserva, Date> reservaUpdate;
	public static volatile SingularAttribute<Reserva, Date> reservaData;
	public static volatile SingularAttribute<Reserva, Integer> reservaQuantidade;

}

