public class VectorOperations {
    public static void main(String[] args) {
        // Definir los vectores
        int[] vectorA = {1, 2, 3};
        int[] vectorB = {4, 5, 6};

        // Sumar los vectores
        int[] suma = sumarVectores(vectorA, vectorB);

        // Restar los vectores
        int[] resta = restarVectores(vectorA, vectorB);

        // Mostrar resultados
        System.out.println("La suma de los vectores es:");
        mostrarVector(suma);
        System.out.println("La resta de los vectores es:");
        mostrarVector(resta);
    }

    // Método para sumar dos vectores
    public static int[] sumarVectores(int[] a, int[] b) {
        int[] resultado = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            resultado[i] = a[i] + b[i];
        }
        return resultado;
    }

    // Método para restar dos vectores
    public static int[] restarVectores(int[] a, int[] b) {
        int[] resultado = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            resultado[i] = a[i] - b[i];
        }
        return resultado;
    }

    // Método para mostrar un vector
    public static void mostrarVector(int[] vector) {
        System.out.print("[ ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("]");
    }
}
