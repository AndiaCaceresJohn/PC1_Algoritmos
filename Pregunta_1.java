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

    public static void InsercionDueno(Mascota[] mascotas) {
        int n = mascotas.length;
        for (int i = 1; i < n; i++) {
            Mascota clave = mascotas[i];
            int j = i - 1;
            while (j >= 0 && mascotas[j].getDueno().compareToIgnoreCase(clave.getDueno()) > 0) {
                mascotas[j + 1] = mascotas[j];
                j = j - 1;
            }
            mascotas[j + 1] = clave;
        }
    }

    public static void main(String[] args) {
        System.out.println("LISTA INICIAL:");
        Mascota[] lista = CrearMascotas();
        ImprimirMascotas(lista);

        System.out.println("ORDENADO POR EDAD (BURBUJA):");
        BurbujaEdad(lista);
        ImprimirMascotas(lista);

        System.out.println("ORDENADO POR NOMBRE (SELECCION):");
        SeleccionNombre(lista);
        ImprimirMascotas(lista);

        System.out.println("ORDENADO POR DUENO (INSERCION):");
        InsercionDueno(lista);
        ImprimirMascotas(lista);
    }
}
