import java.util.ArrayList;

public class CityMain{

    //creating the list for cities
    static ArrayList<City> CityList = new ArrayList<City>();

    //declaring citites
    static City Boston;
    static City Sydney;
    static City Johannesburg;
    static City Kualalumper;
    static City Rio;

    static void start(){

        //declaring cities data
        Boston = new City("Boston", "USA","42 North","71 West", 4590000);
        Sydney = new City("Sydney", "Australia","33 South","151 East", 4627345);
        Johannesburg = new City("Johannesburg", "South Africa","26 South","28 East", 1009035);
        Kualalumper = new City("Kuala Lumpur", "Malaysia","3 NORTH","101 East", 1627171);
        Rio = new City("Rio de Janeiro", "Brazil","22 South","43 West", 6323037);


        //adding the cities data to list
        CityList.add(Boston);
        CityList.add(Sydney);
        CityList.add(Johannesburg);
        CityList.add(Kualalumper);
        CityList.add(Rio);
    }

    public static void main(String [] args){
        
        start();
        for(City city : CityList) {
            System.out.println(city);
        }


    }

    @Override
    public String toString(){
   
        return null;                                     
    }

}