package comconstructor;

 class Ace {
	int a=1,b=2;
	private int c=9;
	public void ryt(int a) {
		c=a;
		System.out.println(a);
	}
	Ace(int a,int b){
		a=a;
		c=b;
		System.out.println(a+"......"+b);
	}
		public static void main(String[] args) {
			Ace b=new Ace(5,6);
			b.ryt(80);}

		
	
}
 

	
	


