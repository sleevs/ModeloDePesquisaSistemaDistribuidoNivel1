package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Boleto.class)
public abstract class Boleto_ {

	public static volatile ListAttribute<Boleto, FormaPagamento> formaPagamentoList;
	public static volatile SingularAttribute<Boleto, Date> boletoData;
	public static volatile SingularAttribute<Boleto, String> boletoAgencia;
	public static volatile SingularAttribute<Boleto, String> boletoCodigo;
	public static volatile SingularAttribute<Boleto, Date> boletoVencimento;
	public static volatile SingularAttribute<Boleto, Integer> boletoId;
	public static volatile SingularAttribute<Boleto, String> boletoNumero;

}

