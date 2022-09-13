package spring;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import POJOs.*;

public class Main implements TratoArchivos{

	public static void main(String[] args) {

		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigurarSpring.class)){
			
			Servicio servicio = ctx.getBean(Servicio.class);
			
			TratoArchivos interfaz1 = new Main();
			
			List<Pais> listaPaises = new ArrayList(interfaz1.leerArchivo());
			
			for(Pais pais : listaPaises) {
				servicio.crearTxt(pais);
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

	@Override
	public List<Pais> leerArchivo() throws IOException {
		
		File file = new File("INFO_PAISES.txt");
		List<Pais> listaPaises = new ArrayList();
		List<String> listaInfo = new ArrayList();
		
		
		Scanner sn = new Scanner(file);
		while(sn.hasNext()) {
			String info = sn.nextLine();
			String[] infoDividida = info.split(":");
			listaInfo.add(infoDividida[1]);
			
		}
		
		for(int i=0; i<(listaInfo.size()/6);i++) {
			listaPaises.add(new Pais(listaInfo.get(0+(i*6)),listaInfo.get(2+(i*6)),listaInfo.get(3+(i*6)),listaInfo.get(4+(i*6)),listaInfo.get(5+(i*6)),new Continente(listaInfo.get(1+(i*6)))));
		}
		
		FuncionLambda funcionLambda = () -> System.out.println("Base de datos antigua escaneada con éxito\n");
		funcionLambda.listarInfo();
		
		
		return listaPaises;
	}
	
	
	

}

interface FuncionLambda {
	
	void listarInfo();
}
