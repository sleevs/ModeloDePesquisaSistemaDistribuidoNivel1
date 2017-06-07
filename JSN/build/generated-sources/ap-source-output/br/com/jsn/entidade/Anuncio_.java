package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Anuncio.class)
public abstract class Anuncio_ {

	public static volatile SingularAttribute<Anuncio, String> anuncioDescricao;
	public static volatile SingularAttribute<Anuncio, String> anuncioImagem;
	public static volatile ListAttribute<Anuncio, Documento> documentoList;
	public static volatile ListAttribute<Anuncio, Pagina> paginaList;
	public static volatile ListAttribute<Anuncio, Social> socialList;
	public static volatile SingularAttribute<Anuncio, String> anuncioCategoria;
	public static volatile ListAttribute<Anuncio, Servico> servicoList;
	public static volatile SingularAttribute<Anuncio, String> anuncioTipo;
	public static volatile SingularAttribute<Anuncio, AnuncioStatus> anuncioStatusAnuncioStatusId;
	public static volatile SingularAttribute<Anuncio, String> anuncioTempo;
	public static volatile SingularAttribute<Anuncio, Conta> contaConta;
	public static volatile ListAttribute<Anuncio, Mensagem> mensagemList;
	public static volatile SingularAttribute<Anuncio, Date> anuncioData;
	public static volatile SingularAttribute<Anuncio, Integer> anuncioId;

}

