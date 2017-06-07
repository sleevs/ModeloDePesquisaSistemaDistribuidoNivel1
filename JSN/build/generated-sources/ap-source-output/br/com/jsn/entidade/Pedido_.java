package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Pedido.class)
public abstract class Pedido_ {

	public static volatile ListAttribute<Pedido, Entrega> entregaList;
	public static volatile SingularAttribute<Pedido, Carga> cargaCargaId;
	public static volatile SingularAttribute<Pedido, Integer> pedidoId;
	public static volatile SingularAttribute<Pedido, String> pedidoTipo;
	public static volatile SingularAttribute<Pedido, String> pedidoDescricao;
	public static volatile SingularAttribute<Pedido, Date> pedidoData;
	public static volatile SingularAttribute<Pedido, Double> pedidoValortotal;
	public static volatile SingularAttribute<Pedido, Double> pedidoValor;

}

