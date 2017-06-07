package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Curtir.class)
public abstract class Curtir_ {

	public static volatile SingularAttribute<Curtir, Integer> curtirId;
	public static volatile SingularAttribute<Curtir, Conta> contaConta;
	public static volatile SingularAttribute<Curtir, Integer> curtirFlag;
	public static volatile SingularAttribute<Curtir, String> curtirDescricao;
	public static volatile SingularAttribute<Curtir, Social> socialSocialId;
	public static volatile SingularAttribute<Curtir, Date> curtirData;

}

