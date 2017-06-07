package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Compra.class)
public abstract class Compra_ {

	public static volatile ListAttribute<Compra, CompraServico> compraServicoList;
	public static volatile SingularAttribute<Compra, String> compraDescricao;
	public static volatile SingularAttribute<Compra, Date> compraData;
	public static volatile SingularAttribute<Compra, Double> compraTotal;
	public static volatile SingularAttribute<Compra, String> compraTipo;
	public static volatile SingularAttribute<Compra, Double> compraPreco;
	public static volatile SingularAttribute<Compra, ItemProduto> itemProdutoItemProdutoId;
	public static volatile SingularAttribute<Compra, String> compraEnvio;
	public static volatile SingularAttribute<Compra, Double> compraDesconto;
	public static volatile SingularAttribute<Compra, String> compraCategoria;
	public static volatile SingularAttribute<Compra, CompraStatus> compraStatusCompraStatusId;
	public static volatile SingularAttribute<Compra, Integer> compraId;

}

