import static java.lang.Math.random;
/*
17. Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
public class ej17_DigitosEnVector {
    public static void main(String[] args){

        int dim=20;
        int[] vector= new int[dim];
        CrearVectorRandom(dim,vector);
        MostrarVector(vector,dim);
        CuentaDigitos(vector,dim);
        System.out.println("");
        System.out.println("Dejá de molestarme. Chau.");


    }
    public static void CuentaDigitos(int[] vector,int dim){
        int unDig=0,dosDig=0,tresDig=0,cuatroDig=0,cincoDig=0;

        for (int i=0;i<dim;i++){

            int aux=vector[i];

            int cont=0;

            do {
                aux=aux/10;
                cont++;
            } while (aux!=0);

            switch (cont){
                case 1:
                    unDig++;
                    break;
                case 2:
                    dosDig++;
                    break;
                case 3:
                    tresDig++;
                    break;
                case 4:
                    cuatroDig++;
                    break;
                case 5:
                    cincoDig++;
                    break;
            }
        }
        System.out.println("El vector tiene "+unDig+" números de un dígito, "+dosDig+" de dos, "+tresDig+" de tres, "+cuatroDig+" de cuatro y "+cincoDig+" de cinco dígitos.");
    }

    public static void MostrarVector(int[] vector,int dim){
        for (int i=0;i<dim;i++){
            System.out.print(" ["+vector[i]+"] ");
        }
        System.out.println("");
    }
    public static void CrearVectorRandom(int dim,int[] vector){
        for(int i=0;i<dim;i++){
            if (i%2==0){
                vector[i]= (int) ((random()*random())*1000);
            } else {
                vector[i]= (int) ((random()*random())*100000);
            }

        }

    }
}
