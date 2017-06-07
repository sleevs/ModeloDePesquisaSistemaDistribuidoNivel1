package br.com.jsn.entidade;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Qualificar.class)
public abstract class Qualificar_ {

	public static volatile SingularAttribute<Qualificar, Conta> contaConta;
	public static volatile SingularAttribute<Qualificar, Integer> qualificarAtendimento;
	public static volatile SingularAttribute<Qualificar, String> qualificarTipo;
	public static volatile SingularAttribute<Qualificar, String> qualificarCategoria;
	public static volatile SingularAttribute<Qualificar, Integer> qualificarId;
	public static volatile SingularAttribute<Qualificar, String> qualificarDescricao;
	public static volatile SingularAttribute<Qualificar, Integer> qualificarProfissional;
	public static volatile SingularAttribute<Qualificar, Integer> qualificarServico;
	public static volatile SingularAttribute<Qualificar, Integer> qualificarValor;
	public static volatile SingularAttribute<Qualificar, Integer> qualificarPontualidade;
	public static volatile SingularAttribute<Qualificar, Servico> servicoServicoId;

}

