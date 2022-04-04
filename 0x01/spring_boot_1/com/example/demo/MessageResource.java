package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/messages")
public class MessageResource {


	@GetMapping("/simpleMessageWelcome")
	public String simpleMessageWelcome() {
		return  "BEM VINDO A AULA DE MICROSSERVIÇO USANDO SPRING BOOT !!!";
	}
	
	@GetMapping("/login/{user}/{password}")
	public String login(@PathVariable("user") String user, @PathVariable("password") String password){
		String mensagem = "LOGIN EFETUADO COM SUCESSO !!!";
			
		if(user == "" || password == "") {
			return "USUÁRIO E SENHA NÃO INFORMADOS";
		}
		else if(user.length() > 15 || password.length() > 15) {
			return "USUÁRIO E SENHA INVÁLIDOS";
		}
		
		return mensagem;
		
	}
	
}
