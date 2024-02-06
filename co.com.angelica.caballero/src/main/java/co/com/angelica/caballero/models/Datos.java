package co.com.angelica.caballero.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class Datos {

    private String nombre;
    private String apellido;
    private String correo;
    private String mes;
    private String dia;
    private String year;
    private String lenguaje;
    private String ciudad;
    private String cod_postal;
    private String pais;
    private String computador;
    private String version;
    private String lenguaje2;
    private String dispositivo;
    private String modelo;
    private String sistema_operativo;
    private String contrasena;
    private String confirmar_contrasena;
    private String curso;



    public static List<Datos> setDatos(DataTable dataTable) {
        List<Datos> dates = new ArrayList<>();
        List<Map<String, String>> mapInfo = dataTable.asMaps();
        for (Map<String, String> map : mapInfo) {
            dates.add(new ObjectMapper().convertValue(map, Datos.class));
        }
        return dates;
    }
}
