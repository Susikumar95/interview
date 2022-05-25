package Inter;

public class Variable  {
	 static int a=20;
		int b=100;
		public void print() {
		System.out.println(a);
		
		System.out.println(b);
		a++;
		b++;
		}
		public static void main(String[] args) {
		Variable aa=new Variable();
		aa.print();
		Variable bb=new Variable();
		bb.print();
		Variable cc=new Variable();
		cc.print();
		}
}

