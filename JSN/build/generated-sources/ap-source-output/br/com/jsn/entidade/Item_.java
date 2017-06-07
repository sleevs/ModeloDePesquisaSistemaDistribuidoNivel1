package br.com.jsn.entidade;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Item.class)
public abstract class Item_ {

	public static volatile SingularAttribute<Item, String> itemNome;
	public static volatile SingularAttribute<Item, Integer> itemId;
	public static volatile SingularAttribute<Item, Double> itemTarifa;
	public static volatile SingularAttribute<Item, String> itemCategoria;
	public static volatile SingularAttribute<Item, String> itemTipo;
	public static volatile SingularAttribute<Item, Double> itemValor;
	public static volatile ListAttribute<Item, ItemProduto> itemProdutoList;
	public static volatile SingularAttribute<Item, Double> itemDesconto;
	public static volatile SingularAttribute<Item, String> itemImagem;
	public static volatile SingularAttribute<Item, String> itemQuantidade;

}

