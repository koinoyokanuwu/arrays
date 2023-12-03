public class Main {
    public static void main(String[] args) {
       /* inicialización en varias líneas:
       int []mi_arreglo = new int[8];
        mi_arreglo[0] =1;
        mi_arreglo[1] =2;
        mi_arreglo[2] =3;
        mi_arreglo[3] =4;
        mi_arreglo[4] =5;
        mi_arreglo[5] =6;
        mi_arreglo[6] =7;
        mi_arreglo[7] =8;*/

       //inicialización de una sola línea

        int[]mi_arreglo = {1, 2, 3, 4, 5, 6, 7, 8};

        for (int i = 0;i < mi_arreglo.length; i++){
            System.out.println(mi_arreglo[i]);
        }

        String [] frutas = {"banano", "pera", "Fresa", "manzana"};

        for (String fruta: frutas){
            System.out.println(fruta);
        }
            int suma = mi_arreglo [0] + mi_arreglo[1] + mi_arreglo[2] + mi_arreglo[3] + mi_arreglo[4] + mi_arreglo[5] + mi_arreglo[6] + mi_arreglo[7];
        System.out.println("La suma de los elementos es: " + suma);

        int acumulado = 0;
        for (int i = 0;i < mi_arreglo.length;i++){
            acumulado = acumulado + mi_arreglo[i];

            System.out.println("La suma de los elementos es: " + acumulado);}
        }

    }
