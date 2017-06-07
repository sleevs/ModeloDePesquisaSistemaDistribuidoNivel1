package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Solucao.class)
public abstract class Solucao_ {

	public static volatile SingularAttribute<Solucao, Double> solucaoOcorrencia;
	public static volatile SingularAttribute<Solucao, String> solucaoNivel;
	public static volatile SingularAttribute<Solucao, String> solucaoDescricao;
	public static volatile ListAttribute<Solucao, SolucaoProblema> solucaoProblemaList;
	public static volatile SingularAttribute<Solucao, String> solucaoArquivo;
	public static volatile SingularAttribute<Solucao, Integer> solucaoId;
	public static volatile SingularAttribute<Solucao, Date> solucaoData;

}

