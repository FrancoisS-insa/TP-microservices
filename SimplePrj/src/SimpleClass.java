public class SimpleClass {
	public int somme(int a, int b){
	return a+b;
	}
	public static void main(String[] args) {
	SimpleClass sc=new SimpleClass();
	int a=3;
	int b=5;
	System.out.println("La somme de "+a+" et "+b+" est : "+sc.somme(a+b));
	}
}