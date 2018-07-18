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
public class VehiculoAudi extends AbstractBuilder{
    @Override
    public void setColor() {
        this.getVehiculo().color="plata cromado";
    }

    @Override
    public void setDireccionAsistida() {
        this.getVehiculo().direccionAsistida=true;
    }

    @Override
    public void setMarca() {
        this.getVehiculo().marca="Audi";       
    }

    @Override
    public void setModelo() {
        this.getVehiculo().modelo="A3 Sportback";
    }

    @Override
    public void setMotor() {
        this.getVehiculo().motor=new MotorDiesel();
    }

    @Override
    public void setCarroceria() {
        Carroceria c = new Carroceria();
        c.habitaculoReforzado=true;
        c.material="fibra de carbono";
        c.tipoCarroceria="deportivo";
        this.getVehiculo().tipoCarroceria=c;
    }
}