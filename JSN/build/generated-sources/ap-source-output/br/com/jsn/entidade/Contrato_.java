package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Contrato.class)
public abstract class Contrato_ {

	public static volatile SingularAttribute<Contrato, String> contratoStatus;
	public static volatile SingularAttribute<Contrato, String> contratoTipo;
	public static volatile SingularAttribute<Contrato, String> contratoFlag;
	public static volatile SingularAttribute<Contrato, Date> contratoData;
	public static volatile SingularAttribute<Contrato, Integer> contratoId;
	public static volatile SingularAttribute<Contrato, String> contratoAnexo;
	public static volatile SingularAttribute<Contrato, String> contratoDescricao;
	public static volatile SingularAttribute<Contrato, Servico> servicoServicoId;

}

