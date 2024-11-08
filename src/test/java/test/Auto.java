package test;

public class Auto {
    String modelo;
    Integer precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    Integer registro;
    static String cantidadCreados;

    Integer cantidadAsientos(){
        int numeroAsientos = 0;
        for (int i = 0 ; i < this.asientos.length; i++){
            if (this.asientos[i] instanceof Asiento){
                numeroAsientos += 1;
            }
        }   
        return numeroAsientos;
    }



    String verificarIntegridad(){
        String original = "";
        if (this.motor.registro != this.registro){
            original = "Las piezas no son originales";
            return original;
        }
        for (int i = 0;  i< this.asientos.length; i++){
            if (this.asientos[i] instanceof Asiento){
                if (this.asientos[i].registro != this.registro){
                    original = "Las piezas no son originales";
                    break;
                }
                else{
                    original = "Auto original";
                }
            } 
        }
        return original;
    }
    }