package test;

public class Asiento {
    String color;
    Integer precio;
    Integer registro;

    boolean cambiarColor(String string){
        boolean colorCambiado = true;
        if(string == "rojo"){
            this.color = string;
        }
        else if(string == "verde"){
            this.color = string;
        }
        else if(string == "amarillo"){
            this.color = string;
        }
        else if(string == "negro"){
            this.color = string;
        }
        else if(string == "blanco"){
            this.color = string;
        }
        else{
            colorCambiado = false;
        }
        return colorCambiado;
    }
}