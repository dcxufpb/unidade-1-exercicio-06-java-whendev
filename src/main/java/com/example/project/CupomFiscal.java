package com.example.project;

public class CupomFiscal {

	public static String NOME_LOJA = "Arcos Dourados Com. de Alimentos LTDA";
	public static String LOGRADOURO = "Av. Projetada Leste";
	public static int NUMERO = 500;
	public static String COMPLEMENTO = "EUC F32/33/34";
	public static String BAIRRO = "Br. Sta Genebra";
	public static String MUNICIPIO = "Campinas";
	public static String ESTADO = "SP";
	public static String CEP = "13080-395";
	public static String TELEFONE = "(19) 3756-7408";
	public static String OBSERVACAO = "Loja 1317 (PDP)";
	public static String CNPJ = "42.591.651/0797-34";
	public static String INSCRICAO_ESTADUAL = "244.898.500.113";
	public static String texto;

	public static String dadosLoja() throws RuntimeException {
		if (NOME_LOJA.isEmpty()){
			throw new RuntimeException("O campo nome da loja é obrigatório");
		}

		if (LOGRADOURO.isEmpty()){
			throw new RuntimeException("O campo logradouro do endereço é obrigatório");
		}

		if (MUNICIPIO.isEmpty()){
			throw new RuntimeException("O campo município do endereço é obrigatório");
		}

		if (ESTADO.isEmpty()){
			throw new RuntimeException("O campo estado do endereço é obrigatório");
		}

		if (CNPJ.isEmpty()){
			throw new RuntimeException("O campo CNPJ da loja é obrigatório");
		}

		if (INSCRICAO_ESTADUAL.isEmpty()) {
			throw new RuntimeException("O campo inscrição estadual da loja é obrigatório");
		}
		String _COMPLEMENTO = "";
		if (!COMPLEMENTO.equals("")){
			_COMPLEMENTO = " " + COMPLEMENTO;
		}

		String _BAIRRO = "";
		if (!BAIRRO.equals("")) {
			_BAIRRO = BAIRRO + " - ";
		}

		String _CEP = "";
		String _TELEFONE = "";

		if (!CEP.equals("")) {
			_CEP = "CEP:" + CEP;
			if (!TELEFONE.equals("")){
				_TELEFONE = " Tel " + TELEFONE;
			}
		} else {
			_CEP = "";
			if (!TELEFONE.equals("")){
				_TELEFONE = "Tel " + TELEFONE;
			}
		}

		String _OBSERVACAO = "";
		if (!OBSERVACAO.equals("")){
			_OBSERVACAO = OBSERVACAO;
		}


		texto = String.format("%s\n",NOME_LOJA);
		if (NUMERO == 0){
			texto += String.format("%s, %s%s\n",LOGRADOURO,"s/n",_COMPLEMENTO);
		} else {
			texto += String.format("%s, %d%s\n",LOGRADOURO,NUMERO,_COMPLEMENTO);
		}
		texto += String.format("%s%s - %s\n",_BAIRRO,MUNICIPIO,ESTADO);
		texto += String.format("%s%s\n",_CEP,_TELEFONE);
		texto += String.format("%s\n",_OBSERVACAO);
		texto += String.format("CNPJ: %s\n",CNPJ);
		texto += String.format("IE: %s\n",INSCRICAO_ESTADUAL);
		return texto;
	}

}
