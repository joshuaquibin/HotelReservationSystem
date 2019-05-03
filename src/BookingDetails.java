public class BookingDetails {
    int date;
    int time;
    // TODO: Fix line of code below
    //MealPlan mealPlan;
    String upgrades;
    String specialInstructions;

    public void setDate(int d){
        date = d;
    }
    public void setTime(int t){
        time = t;
    }
    // TODO: Fix method
    /*
    public void setMealPlan(MealPlan m){
        mealPlan = m;
    }
    */
    public void setUpgrades(String u){
        upgrades = u;
    }
    public void setSpecialInstructions(String special){
        specialInstructions = special;
    }
    public int getDate(){
        return date;
    }
    public int getTime(){
        return time;
    }
    public String getUpgrades(){
        return upgrades;
    }
    public String getSpecialInstructions() {
        return specialInstructions;
    }
}
