package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Documento.class)
public abstract class Documento_ {

	public static volatile SingularAttribute<Documento, String> documentoPdf;
	public static volatile SingularAttribute<Documento, Date> documentoData;
	public static volatile SingularAttribute<Documento, Anuncio> anuncioAnuncioId;
	public static volatile SingularAttribute<Documento, Integer> documentoId;
	public static volatile SingularAttribute<Documento, String> documentoNome;
	public static volatile SingularAttribute<Documento, String> documentoTipo;
	public static volatile SingularAttribute<Documento, String> documentoOrigem;
	public static volatile SingularAttribute<Documento, String> documentoAnexo;

}

