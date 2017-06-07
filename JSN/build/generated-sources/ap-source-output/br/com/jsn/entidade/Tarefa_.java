package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Tarefa.class)
public abstract class Tarefa_ {

	public static volatile SingularAttribute<Tarefa, Endereco> enderecoEnderecoId;
	public static volatile SingularAttribute<Tarefa, TarefaStatus> tarefaStatusTarefaStatusId;
	public static volatile SingularAttribute<Tarefa, String> tarefaTipo;
	public static volatile SingularAttribute<Tarefa, Date> tarefaData;
	public static volatile SingularAttribute<Tarefa, String> tarefaCategoria;
	public static volatile SingularAttribute<Tarefa, Atividade> atividadeAtividadeId;
	public static volatile SingularAttribute<Tarefa, Double> tarefaValor;
	public static volatile ListAttribute<Tarefa, ServicoTarefa> servicoTarefaList;
	public static volatile SingularAttribute<Tarefa, Integer> tarefaId;
	public static volatile SingularAttribute<Tarefa, String> tarefaDescricao;

}

