/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces; 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.xml.bind.JAXB;
import model.DailyReports;
import model.Province;
import model.Provinces;

/**
 * REST Web Service
 *
 * @author 60050257
 */

@Path("/api")
public class ApiResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ApiResource
     */
    public ApiResource() {
    }

    /**
     * Retrieves representation of an instance of services.ApiResource
     * @return an instance of java.lang.String
     */
    @GET
    @Path("/today")
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_XML)
    public String getToday() throws MalformedURLException, ProtocolException, IOException {
            StringWriter writter = new StringWriter();
            URL urlForGetRequest;
            urlForGetRequest = new URL("https://covid19.th-stat.com/api/open/today");
            String readLine = null;
            HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
            conection.setRequestMethod("GET");
            conection.setRequestProperty("Accept", "*/*");
            conection.setDoOutput(true);
            int responseCode = conection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(
                    new InputStreamReader(conection.getInputStream()));
                StringBuffer response = new StringBuffer();
                
                while ((readLine = in.readLine()) != null) {
                    response.append(readLine);
                } in.close();
                String[] format = response.toString().split("[,{]+");
                DailyReports dailyReports = new DailyReports();
                for(String a:format){
                    String[] b = a.split("\":");
                    switch(b[0]) {
                        case "\"Confirmed":
                          dailyReports.setConfirmed(Integer.parseInt(b[1]));
                          break;
                        case "\"Recovered":
                          dailyReports.setRecovered(Integer.parseInt(b[1]));
                          break;
                        case "\"Hospitalized":
                          dailyReports.setHospitalized(Integer.parseInt(b[1]));
                          break;
                        case "\"Deaths":
                          dailyReports.setDeaths(Integer.parseInt(b[1]));
                          break;
                        case "\"NewConfirmed":
                          dailyReports.setNewConfirmed(Integer.parseInt(b[1]));
                          break;
                        case "\"NewRecovered":
                          dailyReports.setNewRecovered(Integer.parseInt(b[1]));
                          break;
                        case "\"NewHospitalized":
                          dailyReports.setNewHospitalized(Integer.parseInt(b[1]));
                          break;
                        case "\"NewDeaths":
                          dailyReports.setNewDeaths(Integer.parseInt(b[1]));
                          break;
                        case "\"UpdateDate":
                          dailyReports.setUpdateDate(b[1]);
                          break;
                        case "\"Source":
                          dailyReports.setSource(b[1]);
                          break;
                        case "\"DevBy":
                          dailyReports.setDevBy(b[1]);
                          break;
                        case "\"SeverBy":
                          dailyReports.setSeverBy(b[1]);
                          break;
                      }   
                }
                JAXB.marshal(dailyReports, writter);
            } else {
                JAXB.marshal("GET NOT WORKED", writter);
            }
            conection.disconnect();
            return writter.toString();
    }

    @GET
    @Path("/sum")
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_XML)
    public String getSummary() throws MalformedURLException, ProtocolException, IOException {
            StringWriter writter = new StringWriter();
            URL urlForGetRequest;
            urlForGetRequest = new URL("https://covid19.th-stat.com/api/open/cases/sum");
            String readLine = null;
            HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
            conection.setRequestMethod("GET");
            conection.setRequestProperty("Accept", "*/*");
            conection.setDoOutput(true);
            int responseCode = conection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(
                    new InputStreamReader(conection.getInputStream()));
                StringBuffer response = new StringBuffer();
                
                while ((readLine = in.readLine()) != null) {
                    response.append(readLine);
                } in.close();
                String[] format = response.toString().split("[{}]+");
                String[] data = format[2].split(",");
                ArrayList<Province> provinces = new ArrayList<Province>();
                for(String a:data) {
                    String[] b = a.split(":");
                    provinces.add(new Province(b[0], Integer.valueOf(b[1])));
                }
                JAXB.marshal(new Provinces(provinces), writter);
            } else {
                JAXB.marshal("GET NOT WORKED", writter);
            }
            conection.disconnect();
            return writter.toString();
    }
}
