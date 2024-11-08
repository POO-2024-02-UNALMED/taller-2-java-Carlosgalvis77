package test;

public class Motor {
    Integer numeroCilindros;
    String tipo;
    Integer registro;


    void cambiarRegistro(int x){
        this.registro = x;
    }



    void asignarTipo(String string){
        if (string == "gasolina" || string == "electrico"){
            this.tipo = string;
        }
    }
}
