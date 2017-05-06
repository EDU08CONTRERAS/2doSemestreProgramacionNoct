class CuentaBancaria{
	public int saldo;
	public static int numero;
}

public class Variables {
	
	public void sumarSaldo(CuentaBancaria cta){
		cta.saldo +=10;
	}
	public void test(){
		CuentaBancaria cta1=new CuentaBancaria();
		sumarSaldo(cta1);
		sumarSaldo(cta1.saldo);
	}
	public static void sumarSaldo(int saldo){
		saldo +=10;
	}

	public static void main(String[] args) {
		CuentaBancaria cta1=new CuentaBancaria();
		cta1.numero = 10000;
		cta1.saldo=100;
		CuentaBancaria cta2=new CuentaBancaria();
		cta2.saldo=200;
		cta2.numero = 20000;
		CuentaBancaria cta3=cta1;
		
		System.out.println(cta1.numero);
		System.out.println(cta2.numero);
		System.out.println(CuentaBancaria.numero);
		
		
		cta3=new CuentaBancaria();
		Variables v1=new Variables();
		v1.sumarSaldo(cta1);
		v1.sumarSaldo(cta2);
		v1.sumarSaldo(cta3);
		
		sumarSaldo(cta3.saldo);
		
		System.out.println(cta1.saldo);
		System.out.println(cta2.saldo);
		System.out.println(cta3.saldo);
		
		int a=100;
		int b=200;
		int c=a;
		c++;
		
		sumarSaldo(a);
		sumarSaldo(b);
		sumarSaldo(c);
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("c: "+c);
		
	}

}
