package InterfaceFlow;

public class Jio implements Sim {
	
	private int id;
	private String name;
	
 

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

@Override
public void card() {
	// TODO Auto-generated method stub
	
	System.out.println("Jio sim started to use");
	
}


}
