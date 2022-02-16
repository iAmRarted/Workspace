package cuenta1;

public class CuentaBancaria {

	String titular;
	float saldo;
	
	CuentaBancaria (Strig titular){
		this.titular = titular;
		saldo = 0;
	}
	
	CuentaBancaria (String titular, float saldo){
		this.titular = titular;
		this.saldo = saldo;
	}
	
	void ingresar (float cantidad) {
		this.saldo += cantidad;
	}
	
	void gastar (float cantidad) {
		if (cantidad <= this.saldo)
			this.saldo -= cantidad;
		else
			System.out.println("No puede gastar esa cantidad, no tiene tanto.");
	}
	
	void ver () {
		if (this.saldo > 1000000)
			System.out.println("El titular de la cuenta VIP es: " + this.titular + " tiene un saldo de " + this.saldo + "€.");
		else
			System.out.println("El titular de la cuenta es: " + this.titular + " tiene un saldo de " + this.saldo + "€.");
	}
}
