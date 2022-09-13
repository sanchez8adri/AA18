package spring;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.springframework.stereotype.Service;

import POJOs.Pais;

@Service
public class Servicio {
	
	public void crearTxt(Pais pais) {
		
		File archivo = new File(pais.getNombre()+".txt");
		FileWriter fw;
		try {
			fw = new FileWriter(archivo);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("Informaci�n sobre: " +pais.getNombre()+"\n");
			bw.write("Nombre: " +pais.getNombre()+"\n");
			bw.write("Poblaci�n: " +pais.getPoblacion()+"\n");
			bw.write("Capital: " +pais.getCapital()+"\n");
			bw.write("Continente: " +pais.getContinente().getNombre()+"\n");
			bw.write("Salario M�nimo: "+ pais.getSalarioMinimo() +"\n");
			bw.write("Clima: " +pais.getClima()+"\n");
			
			bw.close();
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
