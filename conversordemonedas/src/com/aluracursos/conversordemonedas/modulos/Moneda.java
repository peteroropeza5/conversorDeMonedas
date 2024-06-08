package com.aluracursos.conversordemonedas.modulos;
import java.util.Map;

public record Moneda(String result, String time_last_update_utc,
                     String time_next_update_utc,  Map<String, Double> conversion_rates) {
    // Aquí vamos a recibir los datos la API, y las vamos a tener en un record llamado Moneda, para así
    // poder llamar el atributo Moneda y obtener los datos que deseamos.
}
