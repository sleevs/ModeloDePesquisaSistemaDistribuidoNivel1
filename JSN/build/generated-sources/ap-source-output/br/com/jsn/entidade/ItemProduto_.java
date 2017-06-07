package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ItemProduto.class)
public abstract class ItemProduto_ {

	public static volatile SingularAttribute<ItemProduto, Item> itemItemId;
	public static volatile SingularAttribute<ItemProduto, Integer> itemProdutoId;
	public static volatile SingularAttribute<ItemProduto, Date> itemProdutoData;
	public static volatile SingularAttribute<ItemProduto, Produto> produtoProdutoId;
	public static volatile ListAttribute<ItemProduto, Compra> compraList;

}

