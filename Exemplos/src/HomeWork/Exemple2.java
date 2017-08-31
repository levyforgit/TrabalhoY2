package HomeWork;

public class Exemple2 extends Commonly {
	
	private String name;
	private int password;
	
	
	//Construtores e Sobrecarga de construtores ...
	public Exemple2(){
		
	}
	
	public Exemple2(String name, int password){
		this.name = name;
		this.password = password;
	}
	//Metodos e sobrecarga de metodos ...
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setName(String name, int password){
		this.name = name;
		this.password = password;

	}
	//Herança
	public void Ex2(String name){
		Commonly com = new Commonly();
		com.setNameAvatar("junim");
		com.setUser("Paulo");
	}
	//Polimofismo
		public void city(){
				System.out.println("Cidade: Jubileison");
		}
}


