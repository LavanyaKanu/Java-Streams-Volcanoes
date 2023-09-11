package com.example.streams;

public class Volcano {

    private int Year;
    private String TSU;
    private String EQ;
    private String Name;
    private String Location;
    private String Country;
    private float Latitude;
    private float Longitude;
    private int Elevation;
    private String Type;
    private int VEI;
    private String Agent;
    private int DEATHS;

    public Volcano() {
    }

    public Volcano(int year, String TSU, String EQ, String name, String location, String Country, float latitude, float longitude, int elevation, String type, int VEI, String agent, int DEATHS) {
        Year = year;
        this.TSU = TSU;
        this.EQ = EQ;
        Name = name;
        Location = location;
        this.Country = Country;
        Latitude = latitude;
        Longitude = longitude;
        Elevation = elevation;
        Type = type;
        this.VEI = VEI;
        Agent = agent;
        this.DEATHS = DEATHS;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public String getTSU() {
        return TSU;
    }

    public void setTSU(String TSU) {
        this.TSU = TSU;
    }

    public String getEQ() {
        return EQ;
    }

    public void setEQ(String EQ) {
        this.EQ = EQ;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public double getLatitude() {
        return Latitude;
    }

    public void setLatitude(float latitude) {
        Latitude = latitude;
    }

    public double getLongitude() {
        return Longitude;
    }

    public void setLongitude(float longitude) {
        Longitude = longitude;
    }

    public int getElevation() {
        return Elevation;
    }

    public void setElevation(int elevation) {
        Elevation = elevation;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getVEI() {
        return VEI;
    }

    public void setVEI(int VEI) {
        this.VEI = VEI;
    }

    public String getAgent() {
        return Agent;
    }

    public void setAgent(String agent) {
        Agent = agent;
    }

    public int getDEATHS() {
        return DEATHS;
    }

    public void setDEATHS(int DEATHS) {
        this.DEATHS = DEATHS;
    }

    @Override
    public String toString() {
        return "Volcano{" +
                "Year=" + Year +
                ", TSU='" + TSU + '\'' +
                ", EQ='" + EQ + '\'' +
                ", Name='" + Name + '\'' +
                ", Location='" + Location + '\'' +
                ", Country='" + Country + '\'' +
                ", Latitude=" + Latitude +
                ", Longitude=" + Longitude +
                ", Elevation=" + Elevation +
                ", Type='" + Type + '\'' +
                ", VEI=" + VEI +
                ", Agent='" + Agent + '\'' +
                ", DEATHS=" + DEATHS +
                '}';
    }
}
