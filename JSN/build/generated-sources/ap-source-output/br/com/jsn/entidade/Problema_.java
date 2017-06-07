package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Problema.class)
public abstract class Problema_ {

	public static volatile SingularAttribute<Problema, Double> problemaOcorrencia;
	public static volatile SingularAttribute<Problema, String> problemaArquivo;
	public static volatile SingularAttribute<Problema, String> problemaNivel;
	public static volatile SingularAttribute<Problema, Integer> problema;
	public static volatile SingularAttribute<Problema, Date> problemaData;
	public static volatile ListAttribute<Problema, SolucaoProblema> solucaoProblemaList;
	public static volatile SingularAttribute<Problema, String> problemaDescricao;

}

