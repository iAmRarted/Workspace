package ejercicio4;

public class RelojAnalogico {
    Hora h1;
    float longAgujaMin;
    float longAgujaHora;

    RelojAnalogico(){}

    RelojAnalogico(Hora h1, float longAgujaMin, float longAgujaHora){
        this.h1.hora = h1.hora;
        this.h1.min = h1.min;
        this.h1.meridiem = h1.meridiem;
        this.longAgujaMin = longAgujaMin;
        this.longAgujaHora = longAgujaHora;
    }
}
