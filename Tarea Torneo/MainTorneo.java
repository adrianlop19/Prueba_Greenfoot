import java.util.Scanner;
public class MainTorneo{

    public static Equipo funcion_equipo(){
        Scanner Inputs = new Scanner(System.in);
        System.out.println("Escriba el nombre del equipo: ");
            String nombre=Inputs.nextLine();
        System.out.println("En que lugar quedo el equipo?: ");
            int Posicion= Inputs.nextInt();
        System.out.println("Escriba cuantos tiros de esquina tuvo: ");
            int esquinas= Inputs.nextInt();
        System.out.println("Cuantos partidos ganaron? :");
            int ganados= Inputs.nextInt();
        System.out.println("Cuantos perdieron? :");
            int perdidos= Inputs.nextInt();
        System.out.println("Cuantos tiros a gol tuvieron?: ");
            int tirosAgol= Inputs.nextInt();
        System.out.println("Cuantas amarillas tuvieron?: ");
            int amarillas= Inputs.nextInt();
        System.out.println("Cuantas rojas?: ");
            int rojas= Inputs.nextInt();
        System.out.println("Cuantas faltas tuvieron?: ");
            int faltas= Inputs.nextInt();

        return new Equipo(nombre, Posicion, esquinas, ganados, perdidos, tirosAgol, amarillas, rojas, faltas);
    }
    public static void main(String args[]){
        Equipo equipo1= funcion_equipo();

        System.out.println(equipo1.getEsquinas());

    }



}
