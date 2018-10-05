package dir;

import java.io.File;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	
	public static void localizar() throws Exception{
		File carpetaActual = null;
		String fichero = null;
		File file = new File(carpetaActual,fichero);
		if(carpetaActual.isDirectory()) {
			if(!carpetaActual.canExecute()&&!carpetaActual.canRead()&&!carpetaActual.canWrite()) {
				throw new Exception("No tiene permisos en este directorio");
			}else {
				if(file.exists()) {
					fichero=fichero;
				} else
						throw new Exception("No existe el fichero");
			}	
		} else
				throw new Exception("No es un directorio");		
	}
	
}
