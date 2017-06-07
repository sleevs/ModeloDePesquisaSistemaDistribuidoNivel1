package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ServicoTarefa.class)
public abstract class ServicoTarefa_ {

	public static volatile SingularAttribute<ServicoTarefa, Tarefa> tarefaTarefaId;
	public static volatile SingularAttribute<ServicoTarefa, Integer> servicoTarefaId;
	public static volatile SingularAttribute<ServicoTarefa, String> servicoTarefaFlag;
	public static volatile SingularAttribute<ServicoTarefa, Date> servicoTarefaData;
	public static volatile SingularAttribute<ServicoTarefa, Servico> servicoServicoId;

}

