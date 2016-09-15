/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author Payares
 */
public class NumerosComplejos {
    private int N_real;
    private int N_imaginaria;
    
    public NumerosComplejos(int N_real, int N_imaginaria){
        this.N_real= N_real;
        this.N_imaginaria = N_imaginaria;
    }

    public int getParte_real() {
        return N_real;
    }

    public void setParte_real(int parte_real) {
        this.N_real = N_real;
    }

    public int getParte_imaginaria() {
        return N_imaginaria;
    }

    public void setParte_imaginaria(int parte_imaginaria) {
        this.N_imaginaria = N_imaginaria;
    }
    
    public NumerosComplejos sumar(NumerosComplejos c2){
       NumerosComplejos Nc;
        int  r, i;
        r = this.N_real + c2.N_real;
        i = this.N_imaginaria + c2.N_imaginaria;
       Nc = new NumerosComplejos(r, i);
        return Nc;
    }
    
    public NumerosComplejos restar(NumerosComplejos c2){
        NumerosComplejos Nc;
        int  real, imaginario;
        real = this.N_real - c2.N_real;
        imaginario = this.N_imaginaria - c2.N_imaginaria;
        Nc = new NumerosComplejos(real, imaginario);
        return Nc;
    }
    
    public NumerosComplejos multiplicar(NumerosComplejos c2){
        NumerosComplejos Nc;
        int  r, i;
        r = (this.N_real * c2.N_real) - (this.N_imaginaria * c2.N_imaginaria);
        i = (this.N_real * c2.N_imaginaria) + (this.N_imaginaria * c2.N_real);
        Nc = new NumerosComplejos(r, i);
        return Nc;
    }
    
    public NumerosComplejos dividir(NumerosComplejos c2){
        NumerosComplejos Nc;
        int r_numerador, i_numerador;
        r_numerador = ((this.N_real * c2.N_real) + (this.N_imaginaria * c2.N_imaginaria));
        i_numerador = ((this.N_imaginaria * c2.N_real) - (this.N_real * c2.N_imaginaria));
        Nc = new NumerosComplejos(r_numerador, i_numerador);
        return Nc;
    }
    
}
