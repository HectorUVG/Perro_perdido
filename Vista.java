
//*****************************************************************************
//Imports
//*****************************************************************************
import java.util.Scanner;
//*****************************************************************************
//Clase
//*****************************************************************************
public class Vista {
//*****************************************************************************
//Declaracion de variables
//*****************************************************************************
    private Scanner scan;

//*****************************************************************************
//Constructores
//*****************************************************************************
    public Vista(){
        scan = new Scanner(System.in);
    }

//*****************************************************************************
//Metodos
//*****************************************************************************
    
    public void bienvenida(){
        System.out.println("Bienvenido al programa buscador de perros perdidos\n");
    }

    public String PedirNombrePersona(){
        String nombre = "";
        System.out.println("Ingrese su nombre\n");
        nombre = scan.next();
        return nombre;
    }

    public String PedirTelefonoPersona(){
        String telefono = "";
        System.out.println("Ingrese su numero de telefono\n");
        telefono = scan.next();
        return telefono;
    }

    public String PedirNombrePerro(){
        String nomPerro = "";
        System.out.println("Ingrese el nombre del  perro\n");
        nomPerro = scan.next();
        return nomPerro;
    }
    
    public String PedirRazaPerro(){
        String raza = "";
        System.out.println("Ingrese la raza del  perro\n");
        raza = scan.next();
        return raza;
    }

    public String PedirEdadPerro(){
        String edad = "";
        System.out.println("Ingrese la edad del  perro\n");
        edad = scan.next();
        return edad;
    }

    public int menuOpciones(){//pregunta al usuario que quiere hacer
        int op;
        String s = "Que desea hacer?\n" +
                    "1. Llamar a la perrera\n" +
                    "2. Imprimir anuncio\n" + 
                    "3. Contratar anuncio en el periodico" +
                    "4. Salir";
        System.out.print(s);
        op = scan.nextInt();
        
        return op;
    }

    public void perreraYes(){
        System.out.print("Que alivio!!! La perrera ancontro a tu perro\n");
    }

    public void perreraNo(){
        System.out.print("La perrera no ha visto ningun perro extraviado\n");
    }

    public void imprimirAnuncio1(){
        string a = "Se busca perro\n " +
                    "su nombre es: \n ";
        System.out.print(a);

    }

    public void imprimirAnuncio2(){
        string a = "de raza: \n ";
        System.out.print(a);

    }



    public void intenteDeNuevo(){
        System.out.println("Por favor ingrese una opcion valida \n");
    }

    public void fin(){
        System.out.println("Tenga un buen dia \n");
    }

}
