package vista;

import entidades.Ruta;
import java.time.LocalDate;
import java.time.LocalTime;

public class IngresoDatosRuta {

    public static Ruta ingresarNuevaRuta() {
        String origen = LectorDatos.leerString("Origen");
        String destino = LectorDatos.leerString("Destino");
        LocalTime hora = LocalTime.parse(LectorDatos.leerLinea("Hora (HH:mm)"));
        LocalDate fecha = LocalDate.parse(LectorDatos.leerLinea("Fecha (yyyy-MM-dd)"));
        int codigo = LectorDatos.leerInt("Código");
        double precio = LectorDatos.leerDouble("Precio");

        return new Ruta(origen, destino, hora, fecha, codigo, precio);
    }
}

