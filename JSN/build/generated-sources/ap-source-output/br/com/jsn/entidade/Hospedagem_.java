package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Hospedagem.class)
public abstract class Hospedagem_ {

	public static volatile SingularAttribute<Hospedagem, Endereco> enderecoEnderecoId;
	public static volatile SingularAttribute<Hospedagem, Double> hospedagemValor;
	public static volatile SingularAttribute<Hospedagem, Integer> hospedagemId;
	public static volatile SingularAttribute<Hospedagem, HospedagemStatus> hospedagemStatusHospedagemStatusId;
	public static volatile SingularAttribute<Hospedagem, String> hospedagemTipo;
	public static volatile SingularAttribute<Hospedagem, String> enderecoLocalizacao;
	public static volatile SingularAttribute<Hospedagem, Double> hospedagemTotal;
	public static volatile ListAttribute<Hospedagem, HospedagemServico> hospedagemServicoList;
	public static volatile SingularAttribute<Hospedagem, String> hospedagemCategoria;
	public static volatile ListAttribute<Hospedagem, Reserva> reservaList;
	public static volatile SingularAttribute<Hospedagem, String> hospedagemDescricao;
	public static volatile SingularAttribute<Hospedagem, Date> hospedagemData;
	public static volatile SingularAttribute<Hospedagem, String> hospedagemImagem;
	public static volatile SingularAttribute<Hospedagem, Precos> precosPrecoId;

}

