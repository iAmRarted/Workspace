package cuentapersona;

public class CuentaBancaria {

	Persona titular;
	float saldo;
	boolean rojos = false;
	
	CuentaBancaria (Persona titular){
		this.titular = titular;
		saldo = 0;
	}
	
	CuentaBancaria (Persona titular, float saldo){
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
			System.out.println("El titular de la cuenta VIP es: " + this.titular.nombre + " tiene un saldo de " + this.saldo + "�.");
		else
			System.out.println("El titular de la cuenta es: " + this.titular.nombre + " tiene un saldo de " + this.saldo + "�.");

	}
}
