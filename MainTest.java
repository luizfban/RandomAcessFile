
public class MainTest {

	public MainTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arquivo = "paciente.bin";
		ArquivosAcesso acesso = new ArquivosAcesso();
		objetoDados obj;
		for(int i=0;i<20;i++) {
		objetoDados p = new objetoDados();
		p.setCodigo(i);
		p.setIdade(i+100);
		p.setNome("Nome "+i);
		p.setSobrenome("Sobrenome "+i);
		acesso.openFile(arquivo);
		acesso.setData(p);
		}
		System.out.println("Direto 3");
		obj=acesso.getData(3);
		obj.toString();
		System.out.println("///////////////////////////////////////");
		System.out.println("///////////////////////////////////////");
		System.out.println("///////////////////////////////////////");
		System.out.println("///////////////////////////////////////");
		System.out.println("///////////////////////////////////////");
		System.out.println("///////////////////////////////////////");
		System.out.println("///////////////////////////////////////");
		System.out.println("///////////////////////////////////////");
		System.out.println("///////////////////////////////////////");
		System.out.println("Recursivo Agora");
		for(int i=0;i<20;i++) {
			obj=acesso.getData(i);
			obj.toString();
			

	}

}
}
