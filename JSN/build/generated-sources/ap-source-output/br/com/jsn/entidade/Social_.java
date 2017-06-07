package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Social.class)
public abstract class Social_ {

	public static volatile SingularAttribute<Social, Date> socialData;
	public static volatile SingularAttribute<Social, String> socialDescricao;
	public static volatile ListAttribute<Social, Compartilhar> compartilharList;
	public static volatile ListAttribute<Social, Curtir> curtirList;
	public static volatile SingularAttribute<Social, Integer> socialId;
	public static volatile SingularAttribute<Social, Anuncio> anuncioAnuncioId;
	public static volatile ListAttribute<Social, Membro> membroList;
	public static volatile SingularAttribute<Social, String> socialStatus;
	public static volatile SingularAttribute<Social, String> socialImagem;
	public static volatile SingularAttribute<Social, String> socialNome;
	public static volatile SingularAttribute<Social, Integer> socialFlag;

}

