public class City{
    private String name;
    private String country;
    private String latitude;
    private String longitude;
    private int population;


    public City(String name,String country,String latitude,String longitude ,int population){
        this.name = name;
        this.country = country;
        this.latitude = latitude;
        this.longitude = longitude;
        this.population= population;

    }

    public void updatePopulation(int population){
        this.population = population;
    }

    public String getName(){
        return this.name;
    }

    public String getCountry(){
        return this.country;
    }

    public String getLatitude(){
        return this.latitude;
    }

    public String getLongitude(){
        return this.longitude;
    }

    public int getPopulation(){
        return this.population;
    } 

    @Override
    public String toString() {
        return("- " + name + " (" + country + ") [" + latitude + " " + longitude + "] " + population);
    }

   }