package com.aluracursos.conversordemonedas.modulos;

public class DatosAdicionales {

    String result;
    String ultimaActualizacionUTC;
    String siguienteActualizacionUTC;

    public DatosAdicionales(Moneda moneda){
        this.result = moneda.result();
        this.ultimaActualizacionUTC = moneda.time_last_update_utc();
        this.siguienteActualizacionUTC = moneda.time_next_update_utc();
    }

    public String getResult() {
        return result;
    }

    public String getUltimaActualizacionUTC() {
        return ultimaActualizacionUTC;
    }

    public String getSiguienteActualizacionUTC() {
        return siguienteActualizacionUTC;
    }

}
