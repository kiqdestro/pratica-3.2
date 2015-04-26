/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kiqdestro
 */
public class Pratica32 {
    public static double densidade(double x, double media, double desvio) {
        double d = (Math.pow(Math.E,(-0.5*(Math.pow((x-media)/desvio,2)))))/(Math.sqrt(2*Math.PI)*desvio);
        return d;
    }    
    public static void main(String[] args){
        double res;
        res = densidade (-1, 67, 3);
        System.out.println(res);
    }
}
