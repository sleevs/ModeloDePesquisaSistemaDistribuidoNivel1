package br.com.jsn.entidade;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(EntregaServico.class)
public abstract class EntregaServico_ {

	public static volatile SingularAttribute<EntregaServico, Integer> entregaServicoFlag;
	public static volatile SingularAttribute<EntregaServico, Entrega> entregaEntregaId;
	public static volatile SingularAttribute<EntregaServico, Integer> entregaServicoId;
	public static volatile SingularAttribute<EntregaServico, String> entregaServicoData;
	public static volatile SingularAttribute<EntregaServico, Servico> servicoServicoId;

}

