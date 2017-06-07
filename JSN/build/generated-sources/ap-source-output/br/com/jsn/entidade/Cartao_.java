package br.com.jsn.entidade;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Cartao.class)
public abstract class Cartao_ {

	public static volatile SingularAttribute<Cartao, Integer> cartaoId;
	public static volatile SingularAttribute<Cartao, String> cartaoBandeira;
	public static volatile SingularAttribute<Cartao, String> cartaoNome;
	public static volatile ListAttribute<Cartao, FormaPagamento> formaPagamentoList;
	public static volatile SingularAttribute<Cartao, String> cartaoTipo;
	public static volatile SingularAttribute<Cartao, String> cartaoAgencia;
	public static volatile SingularAttribute<Cartao, String> cartaoSecurity;
	public static volatile SingularAttribute<Cartao, String> cartaoValidade;
	public static volatile SingularAttribute<Cartao, String> cartaoNumero;

}

