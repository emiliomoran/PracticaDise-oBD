/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import sinpatron.Carroceria;
import sinpatron.MotorDiesel;

/**
 *
 * @author Moises
 */
public class VehiculoCitroen extends AbstractBuilder{

    @Override
    public void setColor() {
        this.getVehiculo().color="negro";
    }

    @Override
    public void setDireccionAsistida() {
        this.getVehiculo().direccionAsistida=false;
    }

    @Override
    public void setMarca() {
        this.getVehiculo().marca="Citroen";       
    }

    @Override
    public void setModelo() {
        this.getVehiculo().modelo="Xsara Picasso";
    }

    @Override
    public void setMotor() {
        this.getVehiculo().motor=new MotorDiesel();
    }

    @Override
    public void setCarroceria() {
        Carroceria c = new Carroceria();
        c.habitaculoReforzado=false;
        c.material="acero";
        c.tipoCarroceria="monovolumen";
        this.getVehiculo().tipoCarroceria=c;
    }
}
