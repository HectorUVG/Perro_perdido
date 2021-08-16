
//*****************************************************************************
//Imports
//*****************************************************************************

//*****************************************************************************
//Clase
//*****************************************************************************
public class Controlador {
//*****************************************************************************
//Declaracion de variables
//*****************************************************************************
    public static void main(String[] args){
        Perro dog = new Perro("nomP", "ra", "ed");//Me perdi con los parametros de estas clases,
        // me daba error y no supe como arreglarlo
        Persona per = new Persona("nom" , "tel");//genera nueva persona
        Vista vis = new Vista();//genera nueva vista

        vis.bienvenida();//ejecuta cada una en orden de arriba a abajo
        vis.PedirNombrePersona();
        vis.PedirTelefonoPersona();
        String nom = vis.PedirNombrePersona();
        String tel = vis.PedirTelefonoPersona();
        per(nom, tel);
        vis.PedirNombrePerro();
        vis.PedirRazaPerro();
        vis.PedirEdadPerro();
        String nomP = vis.PedirNombrePerro();
        String ra = vis.PedirRazaPerro();
        String ed = vis.PedirEdadPerro();
        dog(nomP, ra, ed);


        int opcion = 0;//esta variable mantiene al while funcionando al no ser 
                        // igual a 4, que indica la opcion salir en vista
        while (opcion != 4){
            opcion = vis.menuOpciones();

            switch(opcion){
                case 1:
                    if (per.suertePersona() < 5){
                        vis.perreraYes();
                        System.exit(0);
                    }
                    else{
                        vis.perreraNo();
                    }
                break;
                case 2:
                    vis.imprimirAnuncio1();
                    System.out.print(dog(nomP));
                    vis.imprimirAnuncio2();
                    System.out.print(dog(ra));
                break;
                case 3:
                break;
                case 4:
                break;
                case 5:
                    vis.fin();
                break;
                default:
                vis.intenteDeNuevo();//imprime un error si no se escoge una de 
                //las 5 opciones
            }
        }


    }



    
}
