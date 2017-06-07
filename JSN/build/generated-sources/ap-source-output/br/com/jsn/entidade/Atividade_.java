package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Atividade.class)
public abstract class Atividade_ {

	public static volatile SingularAttribute<Atividade, String> atividadeTipo;
	public static volatile SingularAttribute<Atividade, String> atividadeOrdem;
	public static volatile SingularAttribute<Atividade, String> atividadeStatus;
	public static volatile SingularAttribute<Atividade, Double> atividadeValor;
	public static volatile ListAttribute<Atividade, Tarefa> tarefaList;
	public static volatile SingularAttribute<Atividade, Integer> atividadeId;
	public static volatile SingularAttribute<Atividade, Date> atividadeInicio;
	public static volatile SingularAttribute<Atividade, Integer> atividadeFlag;
	public static volatile SingularAttribute<Atividade, Date> atividadeUpdate;
	public static volatile SingularAttribute<Atividade, String> atividadeCategoria;
	public static volatile SingularAttribute<Atividade, Date> atividadeFim;

}

