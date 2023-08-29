package servicio;
import entidades.Asiento;
import entidades.Sala;

public class SalaServicio {
    Sala sala=new Sala();
    public Sala abrirCine(){
        for (int i=8;i>0;i--){
            for (int j=0; i<5;i++){
                String columnaAux = null;
                    switch (j) {
                    case 0:
                        columnaAux = "A";
                        break;
                    case 1:
                        columnaAux = "B";
                        break;
                    case 2:
                        columnaAux = "C";
                        break;
                    case 3:
                        columnaAux = "D";
                        break;
                    case 4:
                        columnaAux = "E";
                        break;
                    case 5:
                        columnaAux = "F";
                        break;
                    }
                Asiento asiento=new Asiento(i,columnaAux,false,null);
                    
            }


        }
        return sala;
    }
}

