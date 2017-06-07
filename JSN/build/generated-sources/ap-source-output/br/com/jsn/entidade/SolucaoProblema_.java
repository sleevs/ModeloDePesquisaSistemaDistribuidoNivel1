package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SolucaoProblema.class)
public abstract class SolucaoProblema_ {

	public static volatile SingularAttribute<SolucaoProblema, Solucao> solucaoSolucaoId;
	public static volatile SingularAttribute<SolucaoProblema, Date> solucaoProblemaUpdate;
	public static volatile SingularAttribute<SolucaoProblema, Integer> solucaoProblemaId;
	public static volatile ListAttribute<SolucaoProblema, Chamada> chamadaList;
	public static volatile SingularAttribute<SolucaoProblema, Problema> problemaProblema;
	public static volatile SingularAttribute<SolucaoProblema, Date> solucaoProblemaData;
	public static volatile SingularAttribute<SolucaoProblema, Integer> solucaoProblemacoFlag;

}

