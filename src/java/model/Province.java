/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 60050257
 */
public class Province {
    
    private String name;
    private int population;

    public Province(String name, int population) {
        this.name = name;
        this.population = population;
    }

    /**
     * Get the value of population
     *
     * @return the value of population
     */
    public int getPopulation() {
        return population;
    }

    /**
     * Set the value of population
     *
     * @param population new value of population
     */
    public void setPopulation(int population) {
        this.population = population;
    }


    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

}
