package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CorridaServico.class)
public abstract class CorridaServico_ {

	public static volatile SingularAttribute<CorridaServico, Integer> corridaServicoFlag;
	public static volatile SingularAttribute<CorridaServico, Corrida> corridaCorridaId;
	public static volatile SingularAttribute<CorridaServico, Integer> corridaServicoId;
	public static volatile SingularAttribute<CorridaServico, Servico> servicoServicoId;
	public static volatile SingularAttribute<CorridaServico, Date> corridaServicoData;

}

