/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import sinpatron.Vehiculo;

/**
 *
 * @author Moises
 */
public class ManagerBuilder {
    private AbstractBuilder ab;
    
    public ManagerBuilder(AbstractBuilder ab){
        this.ab=ab;
    }
    
    public Vehiculo contruirVehiculo(){
        this.ab.setCarroceria();
        this.ab.setColor();
        this.ab.setDireccionAsistida();
        this.ab.setMarca();
        this.ab.setModelo();
        this.ab.setMotor();
        
        return ab.getVehiculo();
    }
}
