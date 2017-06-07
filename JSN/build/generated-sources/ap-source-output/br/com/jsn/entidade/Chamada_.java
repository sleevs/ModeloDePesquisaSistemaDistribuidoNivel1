package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Chamada.class)
public abstract class Chamada_ {

	public static volatile SingularAttribute<Chamada, Conta> contaConta;
	public static volatile SingularAttribute<Chamada, ChamadaStatus> chamadaStatusChamadaStatusId;
	public static volatile SingularAttribute<Chamada, String> chamadaTipo;
	public static volatile SingularAttribute<Chamada, String> chamadaCategoria;
	public static volatile SingularAttribute<Chamada, Date> chamadaData;
	public static volatile SingularAttribute<Chamada, Integer> chamadaId;
	public static volatile SingularAttribute<Chamada, String> chamadaDescricao;
	public static volatile SingularAttribute<Chamada, Double> chamadaOcorrencia;
	public static volatile SingularAttribute<Chamada, SolucaoProblema> solucaoProblemaSolucaoProblemaId;

}

