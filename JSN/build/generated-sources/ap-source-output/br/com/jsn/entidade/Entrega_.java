package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Entrega.class)
public abstract class Entrega_ {

	public static volatile SingularAttribute<Entrega, EntregaStatus> entregaStatusEntregaServicoId;
	public static volatile SingularAttribute<Entrega, Date> entregaData;
	public static volatile SingularAttribute<Entrega, String> entregaDescricao;
	public static volatile SingularAttribute<Entrega, Pedido> pedidoPedidoId;
	public static volatile SingularAttribute<Entrega, String> entregaTipo;
	public static volatile ListAttribute<Entrega, EntregaServico> entregaServicoList;
	public static volatile SingularAttribute<Entrega, Integer> entregaId;
	public static volatile SingularAttribute<Entrega, Double> entregaValortotal;
	public static volatile SingularAttribute<Entrega, String> entregaCategoria;
	public static volatile SingularAttribute<Entrega, Rota> rotaRotaId;
	public static volatile SingularAttribute<Entrega, Double> entregaValor;

}

