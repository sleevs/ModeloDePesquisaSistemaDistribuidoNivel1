package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Membro.class)
public abstract class Membro_ {

	public static volatile SingularAttribute<Membro, Conta> contaConta;
	public static volatile SingularAttribute<Membro, Integer> membroId;
	public static volatile SingularAttribute<Membro, Date> membroData;
	public static volatile SingularAttribute<Membro, String> membroTipo;
	public static volatile SingularAttribute<Membro, Integer> membroFlag;
	public static volatile SingularAttribute<Membro, Social> socialSocialId;
	public static volatile SingularAttribute<Membro, String> membroStatus;

}

