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
public class DailyReports {
    
    private int Confirmed;
    private int Recovered;
    private int Hospitalized;
    private int Deaths;
    private int NewConfirmed;
    private int NewRecovered;
    private int NewHospitalized;
    private int NewDeaths;
    private String UpdateDate;
    private String Source;
    private String DevBy;
    private String SeverBy;

    /**
     * Get the value of SeverBy
     *
     * @return the value of SeverBy
     */
    public String getSeverBy() {
        return SeverBy;
    }

    /**
     * Set the value of SeverBy
     *
     * @param SeverBy new value of SeverBy
     */
    public void setSeverBy(String SeverBy) {
        this.SeverBy = SeverBy;
    }


    /**
     * Get the value of DevBy
     *
     * @return the value of DevBy
     */
    public String getDevBy() {
        return DevBy;
    }

    /**
     * Set the value of DevBy
     *
     * @param DevBy new value of DevBy
     */
    public void setDevBy(String DevBy) {
        this.DevBy = DevBy;
    }


    /**
     * Get the value of Source
     *
     * @return the value of Source
     */
    public String getSource() {
        return Source;
    }

    /**
     * Set the value of Source
     *
     * @param Source new value of Source
     */
    public void setSource(String Source) {
        this.Source = Source;
    }


    /**
     * Get the value of UpdateDate
     *
     * @return the value of UpdateDate
     */
    public String getUpdateDate() {
        return UpdateDate;
    }

    /**
     * Set the value of UpdateDate
     *
     * @param UpdateDate new value of UpdateDate
     */
    public void setUpdateDate(String UpdateDate) {
        this.UpdateDate = UpdateDate;
    }


    /**
     * Get the value of NewDeaths
     *
     * @return the value of NewDeaths
     */
    public int getNewDeaths() {
        return NewDeaths;
    }

    /**
     * Set the value of NewDeaths
     *
     * @param NewDeaths new value of NewDeaths
     */
    public void setNewDeaths(int NewDeaths) {
        this.NewDeaths = NewDeaths;
    }


    /**
     * Get the value of NewHospitalized
     *
     * @return the value of NewHospitalized
     */
    public int getNewHospitalized() {
        return NewHospitalized;
    }

    /**
     * Set the value of NewHospitalized
     *
     * @param NewHospitalized new value of NewHospitalized
     */
    public void setNewHospitalized(int NewHospitalized) {
        this.NewHospitalized = NewHospitalized;
    }


    /**
     * Get the value of NewRecovered
     *
     * @return the value of NewRecovered
     */
    public int getNewRecovered() {
        return NewRecovered;
    }

    /**
     * Set the value of NewRecovered
     *
     * @param NewRecovered new value of NewRecovered
     */
    public void setNewRecovered(int NewRecovered) {
        this.NewRecovered = NewRecovered;
    }


    /**
     * Get the value of NewConfirmed
     *
     * @return the value of NewConfirmed
     */
    public int getNewConfirmed() {
        return NewConfirmed;
    }

    /**
     * Set the value of NewConfirmed
     *
     * @param NewConfirmed new value of NewConfirmed
     */
    public void setNewConfirmed(int NewConfirmed) {
        this.NewConfirmed = NewConfirmed;
    }


    /**
     * Get the value of Deaths
     *
     * @return the value of Deaths
     */
    public int getDeaths() {
        return Deaths;
    }

    /**
     * Set the value of Deaths
     *
     * @param Deaths new value of Deaths
     */
    public void setDeaths(int Deaths) {
        this.Deaths = Deaths;
    }


    /**
     * Get the value of Hospitalized
     *
     * @return the value of Hospitalized
     */
    public int getHospitalized() {
        return Hospitalized;
    }

    /**
     * Set the value of Hospitalized
     *
     * @param Hospitalized new value of Hospitalized
     */
    public void setHospitalized(int Hospitalized) {
        this.Hospitalized = Hospitalized;
    }


    /**
     * Get the value of Recovered
     *
     * @return the value of Recovered
     */
    public int getRecovered() {
        return Recovered;
    }

    /**
     * Set the value of Recovered
     *
     * @param Recovered new value of Recovered
     */
    public void setRecovered(int Recovered) {
        this.Recovered = Recovered;
    }


    /**
     * Get the value of Confirmed
     *
     * @return the value of Confirmed
     */
    public int getConfirmed() {
        return Confirmed;
    }

    /**
     * Set the value of Confirmed
     *
     * @param Confirmed new value of Confirmed
     */
    public void setConfirmed(int Confirmed) {
        this.Confirmed = Confirmed;
    }

}
