package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Assinatura.class)
public abstract class Assinatura_ {

	public static volatile SingularAttribute<Assinatura, String> assinaturaDescricao;
	public static volatile SingularAttribute<Assinatura, Double> assinaturaValor;
	public static volatile SingularAttribute<Assinatura, Plano> planoPlanoId;
	public static volatile SingularAttribute<Assinatura, String> assinaturaContrato;
	public static volatile SingularAttribute<Assinatura, String> assinaturaTermos;
	public static volatile SingularAttribute<Assinatura, String> assinaturaCategoria;
	public static volatile SingularAttribute<Assinatura, Date> assinaturaValidade;
	public static volatile SingularAttribute<Assinatura, String> assinaturaNome;
	public static volatile SingularAttribute<Assinatura, Date> assinaturaData;
	public static volatile SingularAttribute<Assinatura, Double> assinaturaDesconto;
	public static volatile SingularAttribute<Assinatura, Integer> assinaturaId;
	public static volatile SingularAttribute<Assinatura, Double> assinaturaValortotal;
	public static volatile ListAttribute<Assinatura, Conta> contaList;
	public static volatile SingularAttribute<Assinatura, String> assinaturaTipo;
	public static volatile SingularAttribute<Assinatura, AssinaturaStatus> assinaturaStatusAssinaturaStatusId;
	public static volatile ListAttribute<Assinatura, AssinaturaPagamento> assinaturaPagamentoList;

}

