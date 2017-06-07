package br.com.jsn.entidade;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Plano.class)
public abstract class Plano_ {

	public static volatile SingularAttribute<Plano, String> planoStatus;
	public static volatile ListAttribute<Plano, Assinatura> assinaturaList;
	public static volatile SingularAttribute<Plano, String> planoFlag;
	public static volatile SingularAttribute<Plano, String> planoNome;
	public static volatile SingularAttribute<Plano, Integer> planoId;
	public static volatile SingularAttribute<Plano, String> planoTipo;
	public static volatile SingularAttribute<Plano, String> planoCategoria;

}

