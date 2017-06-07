package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AnuncioStatus.class)
public abstract class AnuncioStatus_ {

	public static volatile SingularAttribute<AnuncioStatus, String> anuncioStatusTipo;
	public static volatile SingularAttribute<AnuncioStatus, Date> anuncioStatusUpdate;
	public static volatile SingularAttribute<AnuncioStatus, Integer> anuncioStatusFlag;
	public static volatile ListAttribute<AnuncioStatus, Anuncio> anuncioList;
	public static volatile SingularAttribute<AnuncioStatus, Integer> anuncioStatusId;

}

