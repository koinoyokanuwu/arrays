public class arrays {
    public static void main(String[] args) {
        //matriz o arreglo
        int[]mi_arreglo = {1, 2, 3, 4, 5, 6, 7, 8};
        //for clásico
        int suma = 0;
        for (int i = 0;i < mi_arreglo.length;i++){
            suma = suma + mi_arreglo[i];
            System.out.println(mi_arreglo[i]);
        }
        System.out.println("La suma de los elementos es: " + suma);

        //foreach
        int acumulado = 0;
        for (int numero: mi_arreglo){
            System.out.println(numero);
            acumulado = acumulado + numero;
        }

        System.out.println("La suma de los elementos es: " + acumulado);

    }
}
