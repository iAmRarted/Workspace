public class Directorio {
    private String nombre;
    private long bytes;
    static final int MAX_CAR = 40;


    public Directorio(String nombre, long bytes) {
        this.nombre = nombre;
        this.bytes = bytes;
    }

    void ver() {
        System.out.println("Directorio: " + nombre + ", bytes: " + bytes);
    }

    int niveles() {
        int respuesta = 0, longitud = nombre.length();
        String str = nombre;

        for(int index = 0; index < longitud; index++) {
            if(str.charAt(index) == '/' && index + 1 != longitud && str.charAt(index + 1) != '/') {
                respuesta++;
            }
        }
        if(respuesta != 0) {
            return respuesta + 1;
        }
        return respuesta;
    }

    String ultimo() {
        String str = this.nombre;
        int longitud = str.length();
        boolean esPalabra = false;

        for(int index = longitud - 1; index >= 0; index--) {
            if(str.charAt(index) != '/') {
                esPalabra = true;
            }
            if(str.charAt(index) == '/' && esPalabra) {
                return nombre.substring(index + 1);
            }
        }        
        return "";
    }

    boolean carIlegales() {
        boolean respuesta = false;
        String str = nombre;
        int longitud = str.length();

        for(int index = 0; index < longitud; index++) {
            if(str.charAt(index) == '*' || str.charAt(index) == '#' || str.charAt(index) == '@') {
                return true;
            }
        }
        return respuesta;
    }

    String dirValido() {
        if(carIlegales()) {
            return "No es válido, tiene caracteres ilegales.";
        }
        if(nombre.length() > MAX_CAR) {
            return "El directorio tiene más caracteres de lo permitido";
        }
        if(nombre.charAt(0) > 'z' || nombre.charAt(0) < 'a' || nombre.charAt(1) != ':') {
            return "El directorio debe comenzar por un nombre de unidad de disco.";
        }
        int longitud = nombre.length();
        for(int index = 0; index < longitud; index++) {
            if(nombre.charAt(index) == '/' && index + 1 != longitud && nombre.charAt(index + 1) == '/') {
                return "Tiene dos o más '/' juntos.";
            }
        }
        return "Es válido";
    }

    void compactarDir() {
        nombre = nombre.toLowerCase();
        int longitud = nombre.length();
        String str = "";
        for(int index = 0; index < longitud; index++) {
            if(nombre.charAt(index) != ' ') {
                str += nombre.charAt(index);
            }
        }
        this.nombre = str;
    }

    public String getNombre() {
        return nombre;
    }
    public long getBytes() {
        return bytes;
    }

    public void setBytes(long bytes) {
        this.bytes = bytes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
