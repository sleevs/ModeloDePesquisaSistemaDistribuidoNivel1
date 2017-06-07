package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TarefaStatus.class)
public abstract class TarefaStatus_ {

	public static volatile ListAttribute<TarefaStatus, Tarefa> tarefaList;
	public static volatile SingularAttribute<TarefaStatus, Integer> tarefaStatusId;
	public static volatile SingularAttribute<TarefaStatus, Date> tarefaStatusUpdate;
	public static volatile SingularAttribute<TarefaStatus, String> tarefaStatusTipo;

}

