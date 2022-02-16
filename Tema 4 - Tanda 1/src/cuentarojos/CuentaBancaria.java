package cuentarojos;

public class CuentaBancaria {

	String titular;
	float saldo;
	boolean rojos = false;
	
	CuentaBancaria (String titular){
		this.titular = titular;
		saldo = 0;
	}
	
	CuentaBancaria (String titular, float saldo){
		this.titular = titular;
		this.saldo = saldo;
	}
	
	void ingresar (float cantidad) {
		this.saldo += cantidad;
		
		if (this.saldo >= 0)
			rojos = false;
	}
	
	void gastar (float cantidad) {
		if (rojos == false)
			this.saldo -= cantidad;
		
		if (this.saldo < 0)
			rojos = true;
	}
	
	void ver () {
		if (this.saldo > 1000000)
			System.out.println("El titular de la cuenta VIP es: " + this.titular + " tiene un saldo de " + this.saldo + "€.");
		else
			System.out.println("El titular de la cuenta es: " + this.titular + " tiene un saldo de " + this.saldo + "€.");

	}
}
