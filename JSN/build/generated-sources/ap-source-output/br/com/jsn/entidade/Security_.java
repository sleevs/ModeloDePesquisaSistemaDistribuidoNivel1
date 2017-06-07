package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Security.class)
public abstract class Security_ {

	public static volatile SingularAttribute<Security, Integer> securityNivel;
	public static volatile SingularAttribute<Security, String> securityOperacao;
	public static volatile ListAttribute<Security, SecurityConta> securityContaList;
	public static volatile SingularAttribute<Security, Integer> securityId;
	public static volatile SingularAttribute<Security, String> securityRegra;
	public static volatile SingularAttribute<Security, String> securityPermissao;
	public static volatile SingularAttribute<Security, String> securityStatus;
	public static volatile SingularAttribute<Security, Date> securityData;

}

