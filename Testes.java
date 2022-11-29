package pckage.testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import metodos.Metodos;

public class Testes {

	Metodos metodos = new Metodos();
	By bntCookies = By.xpath("//*[@id=\"moove_gdpr_cookie_info_bar\"]/div/div/div[2]/button");
	By bntContato = By.xpath("/html/body/div[1]/div/header[1]/div[2]/div/div[2]/div/div/div[2]");
	By quemSomos = By.xpath("//*[@id=\"menu-1-d6cf617\"]/li[1]/a");
	By nome = By.id("rd-text_field-kruzfvbk");
	By email = By.name("email");
	By empresas = By.id("rd-text_field-kruzfvbm");
	By cargo = By.id("rd-text_field-kruzfvbn");
	By telefone = By.name("cf_numero_de_telefone");
	By assunto = By.name("cf_assunto");
	By botaoEnviar = By.id("rd-button-kruzaryr");

	@Before
	public void setUp() throws Exception {
		metodos.acessarNavegador();
	}

	@After
	public void tearDown() throws Exception {
		metodos.fecharNavegador();
	}

	@Test
	public void clicarEmFuncionalidade() {
		metodos.pause(bntCookies, 3000);
		metodos.click(bntCookies);
		metodos.click(quemSomos);
		metodos.pause(quemSomos, 3000);
		metodos.click(bntContato);
		metodos.pause(bntContato, 3000);
		metodos.click(nome);
		metodos.fill(nome, "Lorenzo do nascimento");
		metodos.pause(nome, 3000);
		metodos.click(email);
		metodos.fill(email, "Lorenzo123@gmail.com");
		metodos.click(empresas);
		metodos.fill(empresas, "TW Tecnologia");
		metodos.pause(empresas, 3000);
		metodos.click(cargo);
		metodos.fill(cargo, "Líder de Qualidade");
		metodos.click(telefone);
		metodos.fill(telefone, "00123456789");
		metodos.pause(telefone, 3000);
		metodos.click(assunto);
		metodos.fill(assunto, "Olá, bom dia!!! Eu consegui realizar mais uma etapa do teste!!!!");
		metodos.click(botaoEnviar);

	}

}
