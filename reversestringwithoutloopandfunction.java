public class reversestringwithoutloopandfunction {
	public static String reverses(String s) { 
		   if(s.length() == 0) 
		     return ""; 
		   return s.charAt(s.length() - 1) + reverses(s.substring(0,s.length()-1)); 
		 } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String d=sc.nextLine();
		String z=reverses(d);
		System.out.print(z); 
		
		
		

		

	}

} 
INPUT:
hiihelloman

OUTPUT:
namollehiih