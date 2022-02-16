package pruebas_class;

public class Recta {

		int grosor;
		Punto pIni;
		Punto pFin;
		
		Recta (){
			
		}
		
		Recta (int grosor1, Punto pIni1, Punto pFin1){
			grosor = grosor1;
			pIni = pIni1;
			pFin = pFin1;
		}
		
		Recta (int grosor1, float xInicio, float yInicio, float xFin, float yFin){
			grosor = grosor1;
			Punto pIni1= new Punto(xInicio, yInicio);
			pIni = pIni1;
			Punto pFin1= new Punto(xFin, yFin);
			pFin = pFin1;
			
		}
		
		
		boolean esHorizontal () {
			if (this.pIni.y == this.pFin.y)
				return true;
			
			return false;
		}
		
		boolean esVertical () {
			if (this.pIni.x == this.pFin.x)
				return true;
			
			return false;
		}
		
		void ver () {
			System.out.println("Recta de grosor " + grosor + " entre puntos (" + pIni.x + ", " + pIni.y + ") y (" + pFin.x + ", " + pFin.y + ")");
		}
		
		float longitud() {
			
		return (float)Math.sqrt((pFin.x - pIni.x) * (pFin.x - pIni.x) + (pFin.y - pIni.y) * (pFin.y - pIni.y));
		}
}
