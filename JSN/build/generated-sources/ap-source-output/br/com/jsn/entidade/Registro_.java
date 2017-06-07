package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Registro.class)
public abstract class Registro_ {

	public static volatile SingularAttribute<Registro, String> registroOrigem;
	public static volatile SingularAttribute<Registro, String> registroEmail;
	public static volatile SingularAttribute<Registro, Conta> contaConta;
	public static volatile SingularAttribute<Registro, String> registroNome;
	public static volatile SingularAttribute<Registro, String> registroSenha;
	public static volatile SingularAttribute<Registro, String> registroToken;
	public static volatile SingularAttribute<Registro, String> registroStatus;
	public static volatile SingularAttribute<Registro, String> registroTipo;
	public static volatile SingularAttribute<Registro, Integer> registroId;
	public static volatile SingularAttribute<Registro, Date> registroData;

}

