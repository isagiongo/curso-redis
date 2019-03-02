package com.isagiongo.redis.cursoredis;

import java.util.Set;

import redis.clients.jedis.Jedis;

public class FiltrarHistoricoMegasena {

	public Set<String> filtraResultados(int mes, int ano){
		String chave = "resultado:*-%02d-%04d:megasena";
		Jedis jedis = new Jedis("localhost");
		return jedis.keys(String.format(chave, mes, ano));
	}
}
