package singleton;

public class Principal {

	public static void main(String[] args) {

		Logger logger = null;
		
		try {
			
			logger = Logger.getInstance();
			
			logger.log("Iniciando serviço.");
			
			
		} catch (Exception e) {
			
			logger.log("Error: " + e.getMessage());
			
		} finally {
			
			logger.log("Finalizando serviço.");
			
		}
		
	}

}
