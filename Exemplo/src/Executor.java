import br.com.exemplo.model.Cliente;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente1 = new Cliente();
		cliente1.setEmail("email@email.com");
		cliente1.setNome("Gustavo");
		
		cliente1.checarTipo(200);
		cliente1.checarTipo(600);
		cliente1.checarTipo(900);
	}

}
