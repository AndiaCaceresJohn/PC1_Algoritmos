public class Pregunta_1 {

    public static Mascota[] CrearMascotas() {
        return new Mascota[] {
            new Mascota("Max", 5, "Carlos"),
            new Mascota("Bella", 2, "Ana"),
            new Mascota("Rocky", 7, "Pedro"),
            new Mascota("Luna", 1, "Maria"),
            new Mascota("Toby", 4, "Juan")
        };
    }

    public static void ImprimirMascotas(Mascota[] mascotas) {
        for (Mascota m : mascotas) {
            System.out.println(m);
        }
        System.out.println("------------------------------------");
    }
}
