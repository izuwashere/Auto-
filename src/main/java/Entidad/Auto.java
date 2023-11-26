
package Entidad;

import java.util.Date;


public class Auto {
    private String nombreDueño;
    private Date fechaVencimientoCarnet;
    private String colorVehiculo;
    private String modelo;
    private int kmMotor;

    public Auto() {
        kmMotor = 7500;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public Date getFechaVencimientoCarnet() {
        return fechaVencimientoCarnet;
    }

    public void setFechaVencimientoCarnet(Date fechaVencimientoCarnet) {
        this.fechaVencimientoCarnet = fechaVencimientoCarnet;
    }

    public String getColorVehiculo() {
        return colorVehiculo;
    }

    public void setColorVehiculo(String colorVehiculo) {
        this.colorVehiculo = colorVehiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKmMotor() {
        return kmMotor;
    }

    public void setKmMotor(int kmMotor) {
        this.kmMotor = kmMotor;
    }
}
