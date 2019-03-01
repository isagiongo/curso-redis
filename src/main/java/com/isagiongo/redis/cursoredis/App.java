package com.isagiongo.redis.cursoredis;

import redis.clients.jedis.Jedis;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Jedis jedis = new Jedis("localhost");
    	System.out.println(jedis.echo("Ola redis"));
    	
    	System.out.println(jedis.set("ultimo_usuario_logado", "Isadora Giongo"));
    	System.out.println(jedis.get("ultimo_usuario_logado"));
    }
}
