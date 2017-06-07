package br.com.jsn.entidade;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Pagina.class)
public abstract class Pagina_ {

	public static volatile SingularAttribute<Pagina, String> paginaTipo;
	public static volatile SingularAttribute<Pagina, String> paginaCategoria;
	public static volatile ListAttribute<Pagina, VisitaPagina> visitaPaginaList;
	public static volatile SingularAttribute<Pagina, String> paginaUrl;
	public static volatile SingularAttribute<Pagina, String> paginaEndereco;
	public static volatile SingularAttribute<Pagina, Anuncio> anuncioAnuncioId;
	public static volatile SingularAttribute<Pagina, Integer> paginaId;

}

