
//*****************************************************************************
//Imports
//*****************************************************************************
import java.util.Random;
//*****************************************************************************
//Clase
//*****************************************************************************
public class Persona {
//*****************************************************************************
//Declaracion de variables
//*****************************************************************************
    private int suerte;
    private int dinero; 
    private String nombre;
    private String telefono;
    Random rand = new Random();


//*****************************************************************************
//Constructores
//*****************************************************************************
    public Persona(String nom, String tel){
     suerte = 0;
     dinero = 0;
     nombre = nom;
     telefono = tel;
        
    }

//*****************************************************************************
//Metodos
//*****************************************************************************
    public int dineroPersona(){
        dinero = rand.nextInt(1001);//genera un valor entre 0 y 1000
        return dinero;

    }

    public int suertePersona(){
        suerte = rand.nextInt();//numero entre 0 y 1 establece la suerte 
        return suerte;                 //de la persona
    }

    public int llamarPerrera(){//devuelve la suerte que tendra la perrera
        
        int suertePerrera = 20*suerte;

        return suertePerrera;

    }

    public int imprimirAnuncio(){
        int suerteAnuncio = 21;
        if (dinero > 25){        //solo funciona si tiene suficiente dinero
            suerteAnuncio = 20*suerte;
            dinero = dinero - 25;
            return suerteAnuncio;//devuelve la suerte que tendra
        }
        else{
            return suerteAnuncio;//si no tiene dinero devuelve 21 
        }
    }

   
}
