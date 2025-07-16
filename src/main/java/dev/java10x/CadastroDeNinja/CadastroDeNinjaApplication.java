package dev.java10x.CadastroDeNinja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CadastroDeNinjaApplication {

	public static void main(String[] args) {
		try{
			SpringApplication.run(CadastroDeNinjaApplication.class, args);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
