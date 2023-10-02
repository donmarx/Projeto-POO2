
public class AnalyzerStart {

	public static void main(String[] args) {
	        try {
	            if (args.length == 0) {
	                System.out.println("Uso correto: java AnalyzerStart <arquivo1> <arquivo2> ...");
	                System.exit(1);
	            }

	            AnalyzerController controller = new AnalyzerController(args);
	            controller.processFiles();
	        } catch (Exception e) {
	            System.err.println("Ocorreu um erro durante a execução:");
	            e.printStackTrace();
	        }
	    }
}