package br.com.jsn.entidade;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Produto.class)
public abstract class Produto_ {

	public static volatile SingularAttribute<Produto, Integer> produtoId;
	public static volatile SingularAttribute<Produto, String> produtoDescricao;
	public static volatile SingularAttribute<Produto, String> produtoImagem;
	public static volatile SingularAttribute<Produto, String> produtoNome;
	public static volatile SingularAttribute<Produto, String> produtoCategoria;
	public static volatile SingularAttribute<Produto, Double> produtoValor;
	public static volatile ListAttribute<Produto, ItemProduto> itemProdutoList;
	public static volatile SingularAttribute<Produto, String> produtoSerie;
	public static volatile SingularAttribute<Produto, Double> produtoDesconto;
	public static volatile SingularAttribute<Produto, String> produtoTipo;

}

