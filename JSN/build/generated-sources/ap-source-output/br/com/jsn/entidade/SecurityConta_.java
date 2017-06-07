package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SecurityConta.class)
public abstract class SecurityConta_ {

	public static volatile SingularAttribute<SecurityConta, Integer> securitySecurityId;
	public static volatile SingularAttribute<SecurityConta, Security> securitySecurityId1;
	public static volatile SingularAttribute<SecurityConta, String> securityContaFlag;
	public static volatile SingularAttribute<SecurityConta, String> securityContaStatus;
	public static volatile ListAttribute<SecurityConta, Conta> contaList;
	public static volatile SingularAttribute<SecurityConta, Date> securityContaData;

}

