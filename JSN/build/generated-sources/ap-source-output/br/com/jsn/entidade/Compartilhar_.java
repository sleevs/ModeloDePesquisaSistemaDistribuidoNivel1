package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Compartilhar.class)
public abstract class Compartilhar_ {

	public static volatile SingularAttribute<Compartilhar, Integer> compartilharId;
	public static volatile SingularAttribute<Compartilhar, Conta> contaConta;
	public static volatile SingularAttribute<Compartilhar, String> compartilharDescricao;
	public static volatile SingularAttribute<Compartilhar, String> compartilharStatus;
	public static volatile SingularAttribute<Compartilhar, Social> socialSocialId;
	public static volatile SingularAttribute<Compartilhar, String> compartilharFlag;
	public static volatile SingularAttribute<Compartilhar, Date> compartilharData;
	public static volatile SingularAttribute<Compartilhar, String> compartilharImagem;

}

