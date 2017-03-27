package br.com.impacta.ads.gcm;

import java.util.*;
import java.io.*;

public class ContatoDaoArquivo implements IContatoDao {
	
	private String nomeAqruivo;
	
	public ContatoDaoArquivo (String nomeArquivo) {
		this.nomeAqruivo = nomeArquivo;
	}

}
