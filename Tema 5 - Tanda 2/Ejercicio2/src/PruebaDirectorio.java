public class PruebaDirectorio {
    public static void main(String[] args) {
        Directorio d1 = new Directorio("c:/xX x x/y yy", 255542365);
        Directorio d2 = new Directorio("c:/PROGRAMS/ja v@/jre", 3166728);

        d1.ver();
        d2.ver();

        d2.setBytes(d1.getBytes() / 2 + d2.getBytes());

        System.out.println(d2.getBytes() / 1048576 + " MB, " + d2.getBytes() % 1048576 / 1024 + " KB, " +d2.getBytes() % (1024) + " B.");

        if(d1.niveles()>d2.niveles()) {
            System.out.println("d1 tiene más niveles.");
        } else {
            System.out.println("d2 tiene más niveles.");
        }

        System.out.println("d1: " + d1.dirValido() + ", d2: " + d2.dirValido());

        if(!d1.ultimo().equals(d2.ultimo())) {
            d2.setNombre("c:/programs/jav@/D2jre");
        }

        d1.ver();
        d2.ver();

        d1.compactarDir();
        d2.compactarDir();

        d1.ver();
        d2.ver();
    }
}
