/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author copec
 */
public class Medicamento extends Producto{
    private String especificacion;

    public String getEspecificacion() {
        return especificacion;
    }

    public void setEspecificacion(String especificacion) {
        this.especificacion = especificacion;
    }

    @Override
    public String serializa() {
        try{
            JSONObject json = new JSONObject();
            json.put("nombre", getNombre());
            json.put("precio", getPrecio());
            json.put("descripcion", getDescripcion());
            json.put("especificaicon", getEspecificacion());
            json.put("unidadDeMedida", getUnidadMedida());
            json.put("dimension", getDimension());
            json.put("fechaCaducidad", getFechaCaducidad());
            return json.toString();
        }catch(JSONException e){return null;}
    }
    public static MaterialDeCuracion deserializa(String linea){
        try{
            JSONObject json = new JSONObject(linea);
            MaterialDeCuracion materialDeCuracion = new MaterialDeCuracion();
            materialDeCuracion.setClasificacion(json.getString("especificacion"));
            materialDeCuracion.setDescripcion(json.getString("descripcion"));
            materialDeCuracion.setDimension(new Dimension(json.getString("nombreTamaño"),json.getInt("TamañoEnNumero")));
            materialDeCuracion.setFechaCaducidad((json.getString("FechaCaducidad")));
            materialDeCuracion.setPrecio(json.getLong("precio"));
            materialDeCuracion.setUnidadMedida(json.getString("UnidadDeMedida"));
            materialDeCuracion.setNombre(json.getString("NombreProducto"));
            return materialDeCuracion;
        }catch(JSONException e){
            e.printStackTrace();
            return null;
        }
    }
}
