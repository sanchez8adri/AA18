package spring;

import java.io.IOException;
import java.util.List;

import POJOs.*;

public interface TratoArchivos {
	
	List<Pais> leerArchivo() throws IOException;

}
