package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Corrida.class)
public abstract class Corrida_ {

	public static volatile ListAttribute<Corrida, CorridaServico> corridaServicoList;
	public static volatile SingularAttribute<Corrida, String> corridaTipo;
	public static volatile SingularAttribute<Corrida, CorridaStatus> corridaStatusCorridaStatusId;
	public static volatile SingularAttribute<Corrida, Date> corridaData;
	public static volatile SingularAttribute<Corrida, Integer> corridaId;
	public static volatile SingularAttribute<Corrida, Integer> corridaTempo;
	public static volatile SingularAttribute<Corrida, Double> corridaValor;
	public static volatile SingularAttribute<Corrida, Double> corridaDistancia;
	public static volatile SingularAttribute<Corrida, String> corridaCategoria;
	public static volatile SingularAttribute<Corrida, Destino> destinoDestinoId;

}

