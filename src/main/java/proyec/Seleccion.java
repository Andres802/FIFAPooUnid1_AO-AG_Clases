/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyec;

/**
 *
 * @author ochoa
 */
public class Seleccion {

    String codigoFIFA;
    String nombre;
    String pais;
    int participacionesMundial;
    Director director;

    public String obtienePais() {

        var retorno = "Desconocido";
        switch (codigoFIFA) {
            case "ECU":
                retorno = "ECUADOR";
                break;

            case "ARG":
                retorno = "ARGENTINA";
                break;

            case "BRA":
                retorno = "BRASIL";
                break;
            case "CHI":
                retorno = "CHILE";
                break;

            default:
                throw new AssertionError();
        }
        return retorno;
    }
    public String mostrarInfo(){
        return "El nombre de la seleccion es " + this.nombre + " su codigo de Fifa es " + this.codigoFIFA + " que es de " + this.obtienePais() + " su numero de participacion al mundial es " + this.participacionesMundial + " y el director del equipo es " + this.director.nombreC; 
    }

}
