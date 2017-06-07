package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Rota.class)
public abstract class Rota_ {

	public static volatile SingularAttribute<Rota, String> rotaOrigemCidade;
	public static volatile SingularAttribute<Rota, String> rotaOrigemUf;
	public static volatile SingularAttribute<Rota, String> rotaDestinoComplemento;
	public static volatile SingularAttribute<Rota, String> rotaDestinoLogradouro;
	public static volatile SingularAttribute<Rota, Date> rotaDataSaida;
	public static volatile SingularAttribute<Rota, String> rotaDestinoPais;
	public static volatile SingularAttribute<Rota, String> rotaOrigemBairro;
	public static volatile SingularAttribute<Rota, String> rotaDestinoBairro;
	public static volatile SingularAttribute<Rota, Date> rotaDataChegada;
	public static volatile SingularAttribute<Rota, String> rotaOrigemComplemento;
	public static volatile SingularAttribute<Rota, String> rotaDestinoCidade;
	public static volatile SingularAttribute<Rota, Integer> rotaFlag;
	public static volatile SingularAttribute<Rota, String> rotaCategoria;
	public static volatile ListAttribute<Rota, Entrega> entregaList;
	public static volatile SingularAttribute<Rota, String> rotaDescricao;
	public static volatile SingularAttribute<Rota, String> rotaOrigemPais;
	public static volatile SingularAttribute<Rota, String> rotaDestinoCep;
	public static volatile SingularAttribute<Rota, String> rotaTipo;
	public static volatile SingularAttribute<Rota, String> rotaOrigemCep;
	public static volatile SingularAttribute<Rota, String> rotaOrigemLogradouro;
	public static volatile SingularAttribute<Rota, String> rotaDestinoUf;
	public static volatile SingularAttribute<Rota, Integer> rotaId;

}

