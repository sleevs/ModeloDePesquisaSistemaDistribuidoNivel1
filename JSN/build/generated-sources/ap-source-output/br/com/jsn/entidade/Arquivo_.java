package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Arquivo.class)
public abstract class Arquivo_ {

	public static volatile SingularAttribute<Arquivo, String> arquivoNome;
	public static volatile SingularAttribute<Arquivo, String> arquivoConteudo;
	public static volatile SingularAttribute<Arquivo, Conta> contaConta;
	public static volatile SingularAttribute<Arquivo, Integer> arquivoId;
	public static volatile SingularAttribute<Arquivo, String> arquivoDescricao;
	public static volatile SingularAttribute<Arquivo, Date> arquivoData;
	public static volatile SingularAttribute<Arquivo, String> arquivoUrl;
	public static volatile SingularAttribute<Arquivo, String> arquivoTipo;
	public static volatile SingularAttribute<Arquivo, Integer> arquivoFlag;
	public static volatile SingularAttribute<Arquivo, Date> arquivoUpdate;

}

