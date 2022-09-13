package spring;

import java.time.LocalTime;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import POJOs.Pais;
import POJOs.Usuario;

@Aspect
@Component
public class AspectoLog {
	
	@Before("execution(* crearTxt(*))")
	public void log() {
		System.out.println("Generando txt...");
	}
	
	@After("execution(* crearTxt(*))")
	public void log2() {
		Usuario usuario = new Usuario("sanchez8adri", "Adrian", "Sanchez");
		System.out.println("Txt generado por el usuario " +usuario.getUsuario()+" a las " +LocalTime.now()+"\n");
	}

}
