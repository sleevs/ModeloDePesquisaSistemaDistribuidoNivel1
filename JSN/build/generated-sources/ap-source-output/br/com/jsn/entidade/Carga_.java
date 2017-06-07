package br.com.jsn.entidade;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Carga.class)
public abstract class Carga_ {

	public static volatile SingularAttribute<Carga, String> cargaPeso;
	public static volatile SingularAttribute<Carga, String> cargaCategoria;
	public static volatile SingularAttribute<Carga, String> cargaTipo;
	public static volatile SingularAttribute<Carga, String> cargaImagem;
	public static volatile SingularAttribute<Carga, String> cargaEstado;
	public static volatile ListAttribute<Carga, Pedido> pedidoList;
	public static volatile SingularAttribute<Carga, String> cargaQuantidade;
	public static volatile SingularAttribute<Carga, Integer> cargaId;
	public static volatile SingularAttribute<Carga, String> cargaLargura;
	public static volatile SingularAttribute<Carga, String> cargaDescricao;
	public static volatile SingularAttribute<Carga, String> cargaAltura;
	public static volatile SingularAttribute<Carga, String> cargaComprimento;

}

