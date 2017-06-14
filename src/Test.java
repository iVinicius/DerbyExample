import java.util.List;

/**
 * 
 */

/**
 * @author 14108849
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String xd = CadastroDAOJavaDb.getInstance().toString();
			
			String eo = "";
			
			List<Pessoa> list = CadastroDAOJavaDb.getInstance().getHomens();
			
			eo = "";
			CadastroDAOJavaDb.getInstance().adicionar(new Pessoa("Vinicius", "454564", true));
			
			list = CadastroDAOJavaDb.getInstance().getHomens();
		} catch (CadastroDAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
