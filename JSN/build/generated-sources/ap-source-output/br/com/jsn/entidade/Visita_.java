package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Visita.class)
public abstract class Visita_ {

	public static volatile SingularAttribute<Visita, Conta> contaConta;
	public static volatile SingularAttribute<Visita, String> visitaCategoria;
	public static volatile ListAttribute<Visita, VisitaPagina> visitaPaginaList;
	public static volatile SingularAttribute<Visita, VisitaStatus> visitaStatusVisitaStatusId;
	public static volatile SingularAttribute<Visita, Date> visitaSaida;
	public static volatile SingularAttribute<Visita, Integer> visitaFlag;
	public static volatile SingularAttribute<Visita, String> visitaTipo;
	public static volatile SingularAttribute<Visita, Date> visitaEntrada;
	public static volatile SingularAttribute<Visita, Double> visitaTempo;
	public static volatile SingularAttribute<Visita, Integer> visita;

}

