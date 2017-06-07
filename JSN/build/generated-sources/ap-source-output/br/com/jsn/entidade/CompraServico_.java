package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CompraServico.class)
public abstract class CompraServico_ {

	public static volatile SingularAttribute<CompraServico, Date> compraServicoData;
	public static volatile SingularAttribute<CompraServico, Integer> compraServicoFlag;
	public static volatile SingularAttribute<CompraServico, Compra> compraCompraId;
	public static volatile SingularAttribute<CompraServico, Integer> compraServicoId;
	public static volatile SingularAttribute<CompraServico, Servico> servicoServicoId;

}

