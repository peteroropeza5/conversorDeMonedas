package com.aluracursos.conversordemonedas.principal;

import com.aluracursos.conversordemonedas.modulos.ConsultaMoneda;
import com.aluracursos.conversordemonedas.modulos.Conversiones;
import com.aluracursos.conversordemonedas.modulos.DatosAdicionales;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();
        Conversiones conversiones = new Conversiones(consulta.buscaMoneda());
        DatosAdicionales datosAdicionales = new DatosAdicionales(consulta.buscaMoneda());

        int opcion;
        double cantidad;

        do {
            System.out.print("""
                **********************************
                BIENVENIDO AL CONVERSOR DE MONEDAS
                **********************************
                Dentro de las opciones digite una:
                1) Dolar a peso Mexicano.
                2) Peso Mexicano a Dolar.
                3) Dolar a peso Argentino.
                4) Peso Argentino a Dolar.
                5) Dolar a real Brasileño.
                6) Real Brasileño a Dolar.
                7) Salir.
                """);
            opcion = lectura.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese la cantidad en dolares que desea convertir: ");
                    cantidad = lectura.nextDouble();
                    conversiones.dolarMexicano(cantidad);
                    System.out.println("La cantidad de "+cantidad+" dolares a pesos Mexicanos es: "
                            +conversiones.getTotal());
                    System.out.println("Información de la consulta:");
                    System.out.println("Resultado: "+datosAdicionales.getResult());
                    System.out.println("Última actualización UTC: "+datosAdicionales.getUltimaActualizacionUTC());
                    System.out.println("Próxima actualización UTC: "+datosAdicionales.getSiguienteActualizacionUTC());
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad en pesos Mexicanos que desea convertir: ");
                    cantidad = lectura.nextDouble();
                    conversiones.mexicanoDolar(cantidad);
                    System.out.println("La cantidad de "+cantidad+" pesos Mexicanos a Dolar es: "
                            +conversiones.getTotal());
                    System.out.println("Información de la consulta:");
                    System.out.println("Resultado: "+datosAdicionales.getResult());
                    System.out.println("Última actualización UTC: "+datosAdicionales.getUltimaActualizacionUTC());
                    System.out.println("Próxima actualización UTC: "+datosAdicionales.getSiguienteActualizacionUTC());
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad en dolares que desea convertir: ");
                    cantidad = lectura.nextDouble();
                    conversiones.dolarArgentino(cantidad);
                    System.out.println("La cantidad de "+cantidad+" dolares a pesos Argentinos es: "
                            +conversiones.getTotal());
                    System.out.println("Información de la consulta:");
                    System.out.println("Resultado: "+datosAdicionales.getResult());
                    System.out.println("Última actualización UTC: "+datosAdicionales.getUltimaActualizacionUTC());
                    System.out.println("Próxima actualización UTC: "+datosAdicionales.getSiguienteActualizacionUTC());
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad en pesos Argentinos que desea convertir: ");
                    cantidad = lectura.nextDouble();
                    conversiones.argentinoDolar(cantidad);
                    System.out.println("La cantidad de "+cantidad+" pesos Argentinos a Dolar es: "
                            +conversiones.getTotal());
                    System.out.println("Información de la consulta:");
                    System.out.println("Resultado: "+datosAdicionales.getResult());
                    System.out.println("Última actualización UTC: "+datosAdicionales.getUltimaActualizacionUTC());
                    System.out.println("Próxima actualización UTC: "+datosAdicionales.getSiguienteActualizacionUTC());
                    System.out.println(" ");
                    break;
                case 5:
                    System.out.println("Ingrese la cantidad en dolares que desea convertir: ");
                    cantidad = lectura.nextDouble();
                    conversiones.dolarReal(cantidad);
                    System.out.println("La cantidad de "+cantidad+" dolares a reales Brasileños es: "
                            +conversiones.getTotal());
                    System.out.println("Información de la consulta:");
                    System.out.println("Resultado: "+datosAdicionales.getResult());
                    System.out.println("Última actualización UTC: "+datosAdicionales.getUltimaActualizacionUTC());
                    System.out.println("Próxima actualización UTC: "+datosAdicionales.getSiguienteActualizacionUTC());
                    System.out.println(" ");
                    break;
                case 6:
                    System.out.println("Ingrese la catidad en reales Brasileños que desea convertir: ");
                    cantidad = lectura.nextDouble();
                    conversiones.realDolar(cantidad);
                    System.out.println("La cantidad de "+cantidad+" pesos Brasileños a Dolar es: "
                            +conversiones.getTotal());
                    System.out.println("Información de la consulta:");
                    System.out.println("Resultado: "+datosAdicionales.getResult());
                    System.out.println("Última actualización UTC: "+datosAdicionales.getUltimaActualizacionUTC());
                    System.out.println("Próxima actualización UTC: "+datosAdicionales.getSiguienteActualizacionUTC());
                    System.out.println(" ");
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }while (opcion!=7);

    }
}
