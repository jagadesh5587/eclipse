package arrayproject;

public class Lower extends Greater {
	//public Lower(){
		
		//System.out.println("default");
	//}
	public Lower(int id) {
		super("dog");
		System.out.println(id);
		
	}
	
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Lower a=new Lower(20);
	}
	}


