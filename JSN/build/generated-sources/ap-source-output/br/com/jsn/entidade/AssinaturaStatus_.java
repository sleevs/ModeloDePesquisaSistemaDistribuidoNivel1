package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AssinaturaStatus.class)
public abstract class AssinaturaStatus_ {

	public static volatile SingularAttribute<AssinaturaStatus, Integer> assinaturaStatusFlag;
	public static volatile SingularAttribute<AssinaturaStatus, String> assinaturaStatusTipo;
	public static volatile ListAttribute<AssinaturaStatus, Assinatura> assinaturaList;
	public static volatile SingularAttribute<AssinaturaStatus, Date> assinaturaStatusUpdate;
	public static volatile SingularAttribute<AssinaturaStatus, Integer> assinaturaStatusId;

}

