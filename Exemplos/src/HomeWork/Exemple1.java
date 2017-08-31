package HomeWork;

public class  Exemple1 extends Commonly {
	
	private String type;
	private String skils;
	
	//Construtores e Sobrecarga de construtores ...
	public Exemple1 (String type){
		this.type = type;
	}
	
	public Exemple1(String type, String skils){
		this.skils = skils;
		this.type = type;
	}
	//Metodos e sobrecarga de metodos ...
	
	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type = type;
	}
	public void setType(String type, String skils){
		this.type = type;
		this.skils = skils;
	}
	
	//Herança
	public void Ex1(String type){
		
		Commonly com = new Commonly();
		com.setNameAvatar("Robertão gameplys");
		com.setUser("Alfonço");
	}
	//Polimofismo
	public void city(){
			System.out.println("Cidade: Brejo santo");
	}
}

