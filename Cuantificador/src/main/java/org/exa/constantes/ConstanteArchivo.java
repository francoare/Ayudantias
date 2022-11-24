package org.exa.constantes;

public class ConstanteArchivo {

    public static String BASE_DIR = System.getProperty("user.dir");
    public static String RESOURCES_DIR = BASE_DIR + "/resources";

    public static String NOMBRE_ARCHIVO_FORMULA = "formula.txt";
    public static String PATH_ARCHIVO_FORMULA = RESOURCES_DIR + "/" + NOMBRE_ARCHIVO_FORMULA;

    public static String NOMBRE_ARCHIVO_RESULTADO = "resultado.csv";
    public static String PATH_ARCHIVO_RESULTADO =  RESOURCES_DIR;
    
    public static String NOMBRE_ARCHIVO_CONFIG = "config.json";
    public static String PATH_ARCHIVO_CONFIG = RESOURCES_DIR + "/" + NOMBRE_ARCHIVO_CONFIG;

    public static String getPATH_ARCHIVO_RESULTADO() {
    	return (PATH_ARCHIVO_RESULTADO + "/" + NOMBRE_ARCHIVO_RESULTADO);
    }
}
