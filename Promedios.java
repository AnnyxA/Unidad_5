
public class Promedios {

 public static double[] promEstudiante(double[][] calificaciones) {
        double[] estudiante = new double[calificaciones.length];
        for (int i = 0; i < calificaciones.length; i++) {
            double suma = 0;
            for (int j = 0; j < calificaciones[i].length; j++) {
                suma += calificaciones[i][j];
            }
            estudiante[i] = suma / calificaciones[i].length;
        }
        return estudiante;
    }

    public static double[] promMateria(double[][] calificaciones) {
        double[] materia = new double[calificaciones[0].length];
        for (int i = 0; i < calificaciones[0].length; i++) {
            double suma = 0;
            for (int j = 0; j < calificaciones.length; j++) {
                suma += calificaciones[j][i];
            }
            materia[i] = suma / calificaciones.length;
        }
        return materia;
    }

    public static void main(String[] args) {
        double[][] calificaciones = {
            {90.5, 85.0, 78.5, 92.0},
            {88.0, 76.5, 89.0, 94.5},
            {70.0, 82.5, 91.0, 87.5}
        };

        double[] totalPromedios = Promedios.promEstudiante(calificaciones);
        for (int i = 0; i < totalPromedios.length; i++) {
            System.out.println("El promedio del estudiante " + (i + 1) + " es " + totalPromedios[i]);
        }

        double[] totalPromediosM = Promedios.promMateria(calificaciones);
        for (int i = 0; i < totalPromediosM.length; i++) {
            System.out.println("El promedio de la materia " + (i + 1) + " es " + totalPromediosM[i]);
        }
    }
}

