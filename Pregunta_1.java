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

    public static void BurbujaEdad(Mascota[] mascotas) {
        int n = mascotas.length;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (mascotas[j].getEdad() > mascotas[j + 1].getEdad()) {
                    Mascota temp = mascotas[j];
                    mascotas[j] = mascotas[j + 1];
                    mascotas[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) break;
        }
    }

    public static void SeleccionNombre(Mascota[] mascotas) {
        int n = mascotas.length;
        for (int i = 0; i < n - 1; i++) {
            int indexMin = i;
            for (int j = i + 1; j < n; j++) {
                if (mascotas[j].getNombre().compareToIgnoreCase(mascotas[indexMin].getNombre()) < 0) {
                    indexMin = j;
                }
            }
            if (indexMin != i) {
                Mascota temp = mascotas[i];
                mascotas[i] = mascotas[indexMin];
                mascotas[indexMin] = temp;
            }
        }
    }
}
