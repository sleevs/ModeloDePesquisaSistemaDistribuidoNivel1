package br.com.jsn.entidade;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Endereco.class)
public abstract class Endereco_ {

	public static volatile SingularAttribute<Endereco, String> enderecoLogradouro;
	public static volatile SingularAttribute<Endereco, String> enderecoStatus;
	public static volatile SingularAttribute<Endereco, String> enderecoLatitude;
	public static volatile SingularAttribute<Endereco, String> enderecoNumero;
	public static volatile ListAttribute<Endereco, Tarefa> tarefaList;
	public static volatile SingularAttribute<Endereco, String> enderecoCep;
	public static volatile ListAttribute<Endereco, Hospedagem> hospedagemList;
	public static volatile SingularAttribute<Endereco, String> enderecoFlag;
	public static volatile SingularAttribute<Endereco, String> enderecoTipo;
	public static volatile SingularAttribute<Endereco, String> enderecoUf;
	public static volatile SingularAttribute<Endereco, String> enderecoLongetude;
	public static volatile SingularAttribute<Endereco, Integer> enderecoId;
	public static volatile SingularAttribute<Endereco, String> enderecoContinente;
	public static volatile SingularAttribute<Endereco, String> enderecoDescricao;
	public static volatile SingularAttribute<Endereco, String> enderecoComplemento;
	public static volatile SingularAttribute<Endereco, String> enderecoPais;
	public static volatile SingularAttribute<Endereco, String> enderecoCidade;
	public static volatile SingularAttribute<Endereco, String> enderecoBairro;
	public static volatile SingularAttribute<Endereco, String> enderecoUpdate;

}

