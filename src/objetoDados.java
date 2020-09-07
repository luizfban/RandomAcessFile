
public class objetoDados {
	private int codigo;
	@Override
	public String toString() {
		return "objetoDados [codigo=" + codigo + ", nome=" + nome + ", sobrenome=" + sobrenome + ", idade=" + idade
				+ "]";
	}
	private String nome;
	private String sobrenome;
	private int idade;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public objetoDados() {;
		// TODO Auto-generated constructor stub
	}

}
