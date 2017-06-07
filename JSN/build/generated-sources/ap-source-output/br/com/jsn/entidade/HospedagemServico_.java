package br.com.jsn.entidade;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(HospedagemServico.class)
public abstract class HospedagemServico_ {

	public static volatile SingularAttribute<HospedagemServico, Integer> hospedagemServicoId;
	public static volatile SingularAttribute<HospedagemServico, Hospedagem> hospedagemHospedagemId;
	public static volatile SingularAttribute<HospedagemServico, String> hospedagemServicoFlag;
	public static volatile SingularAttribute<HospedagemServico, String> hospedagemServicoData;
	public static volatile SingularAttribute<HospedagemServico, Servico> servicoServicoId;

}

