/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author 60050257
 */
public class Provinces {
    
    private List<Province> provinces;

    public Provinces(List<Province> provinces) {
        this.provinces = provinces;
    }

    /**
     * Get the value of provinces
     *
     * @return the value of provinces
     */
    public List<Province> getProvinces() {
        return provinces;
    }

    /**
     * Set the value of provinces
     *
     * @param provinces new value of provinces
     */
    public void setProvinces(List<Province> provinces) {
        this.provinces = provinces;
    }

}
