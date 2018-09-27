/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.xml.bind.annotation.XmlRootElement;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Isma
 */
@XmlRootElement
public class Data {
    private int id;
    private String contenido;

    public Data(int id, String contenido) {
        this.id = id;
        this.contenido = contenido;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public JSONObject ToJSON() throws JSONException{
        return new JSONObject().put("id", id).put("contenido", contenido);
    }
    
    
}
