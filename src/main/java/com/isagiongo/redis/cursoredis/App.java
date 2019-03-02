package com.isagiongo.redis.cursoredis;

import java.util.List;
import java.util.Set;

import redis.clients.jedis.Jedis;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String dataSorteio1 = "01-01-2019";
    	String numerosSorteio1 = "2,4,5,22,43,48,51";
    	String chave1 = String.format("resultado:%s:megasena", dataSorteio1);

    	String dataSorteio2 = "15-01-2019";
    	String numerosSorteio2 = "12,15,33,39,42,51";
    	String chave2 = String.format("resultado:%s:megasena", dataSorteio2);
    	
    	String dataSorteio3 = "29-01-2019";
    	String numerosSorteio3 = "9,14,19,20,46,48,49";
    	String chave3 = String.format("resultado:%s:megasena", dataSorteio3);
    	
    	String dataSorteio4 = "01-02-2019";
    	String numerosSorteio4 = "21,25,33,34,49,52,53";
    	String chave4 = String.format("resultado:%s:megasena", dataSorteio4);
    	
    	
    	Jedis jedis = new Jedis("localhost");
    	
    	
    	String resultado = jedis.mset(
    			chave1, numerosSorteio1,
    			chave2, numerosSorteio2,
    			chave3, numerosSorteio3,
    			chave4, numerosSorteio4
    			);
    	System.out.println(resultado);
    	
    	int mes = 01;
    	int ano = 2019;
    	Set<String> chaves = new FiltrarHistoricoMegasena().filtraResultados(mes, ano);
    	System.out.println(chaves);
    	List<String> valores = jedis.mget(chave1, chave2);
    System.out.println(valores);
    }
}
