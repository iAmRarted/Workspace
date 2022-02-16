package ejercicio4;

public class Hora {
    int hora;
    int min;
    String meridiem;

    Hora(){}

    Hora(int hora, int min, String meridiem){
        this.hora = hora;
        this.min = min;
        this.meridiem = meridiem;
    }

    void adelantar(int cantidad, char tipo){
        if(tipo == 'm'){
            int cantidadMin = min + cantidad;
            hora += cantidadMin / 60;
            min = cantidadMin % 60;
            while(hora > 12){
                hora -= 12;
                if(meridiem.equals("AM")){
                    meridiem = "PM";
                } else {
                    meridiem = "AM";
                }
            }
        } else {
            if(tipo == 'h'){
                hora += cantidad;
                while(hora > 12){
                    hora -= 12;
                    if(meridiem.equals("AM")){
                        meridiem = "PM";
                    } else {
                        meridiem = "AM";
                    }
                }
            }
        }
    }

    void atrasar(int cantidad, char tipo){
        if(tipo == 'm'){
            min -= cantidad;
            while(min < 0){
                min += 60;
                hora--;
            }
            while(hora < 0){
                hora += 12;
                if(meridiem.equals("AM")){
                    meridiem = "PM";
                } else {
                    meridiem = "AM";
                }
            }
        } else {
            if(tipo == 'h'){
                hora -= cantidad;
                while(hora < 0){
                    hora += 12;
                    if(meridiem.equals("AM")){
                        meridiem = "PM";
                    } else {
                        meridiem = "AM";
                    }
                }
            }
        }
    }
    // Main para comprobar los métodos
    public static void main(String[] args) {
        // Hora h1 = new Hora(10, 30, "AM");

        // System.out.println(h1.hora + " " + h1.min + " " + h1.meridiem);

        // h1.adelantar(1, 'h');
        // System.out.println(h1.hora + " " + h1.min + " " + h1.meridiem);

        // h1.atrasar(3, 'h');
        // System.out.println(h1.hora + " " + h1.min + " " + h1.meridiem);

        // h1.adelantar(30, 'm');
        // System.out.println(h1.hora + " " + h1.min + " " + h1.meridiem);

        // h1.hora = 1;
        // h1.atrasar(180, 'm');
        // System.out.println(h1.hora + " " + h1.min + " " + h1.meridiem);
    }
}
