/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

/**
 *
 * @author Casa
 */
public class ProductoAlimenticio extends Producto {
     
    public double calcularSalarioProductoAlimenticio(){
        return super.calcularSalario + 12;
    }
    
}
