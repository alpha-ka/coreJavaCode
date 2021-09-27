package InterfaceFlow;

public class AccessSim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Airtel airtel = new Airtel();
		airtel.card();

		Jio jio=new Jio();
		jio.card();
		//Access using Interface Reference and just changing by constructor access what we need.
		
		
		Sim sim=new Jio();
		sim.card();
		Sim sim2=new Airtel();
		sim2.card();
		
		
		
	}

}
