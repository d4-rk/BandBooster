public class BandBooster {
    String name;
    int boxesSold;

    //band booster class constructor
    public BandBooster(String str){
        name = str;
        boxesSold = 0;
    }
    //return the name
    public String getName() { return name; }

    //method to update the sales
    public void updateSales(int num) { boxesSold += num; }

    //return the total sales
    public String toString(){
        return name + ": " + boxesSold + " boxes";
    }
}
