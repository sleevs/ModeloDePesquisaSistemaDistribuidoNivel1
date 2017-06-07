package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ServicoStatus.class)
public abstract class ServicoStatus_ {

	public static volatile SingularAttribute<ServicoStatus, String> servicoStatusFlag;
	public static volatile SingularAttribute<ServicoStatus, String> contaStatusTipo;
	public static volatile SingularAttribute<ServicoStatus, Integer> contaStatusId;
	public static volatile SingularAttribute<ServicoStatus, Date> contaStatusUpdate;
	public static volatile SingularAttribute<ServicoStatus, Servico> servicoServicoId;

}

