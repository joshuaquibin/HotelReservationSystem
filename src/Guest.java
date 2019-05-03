public class Guest extends BookingDetails {
    String name;
    int phone;
    String email;
    String address;
    int ccInfo;

    public void setName(String n){
        name = n;
    }
    public void setPhone(int p){
        phone = p;
    }
    public void setEmail(String e){
        email = e;
    }
    public void setAddress(String a){
        address = a;
    }
    public void setCCInfo(int c){
        ccInfo = c;
    }
    public String getName(){
        return name;
    }
    public int getPhone(){
        return phone;
    }
    public String getEmail(){
        return email;
    }
    public String getAddress(){
        return address;
    }
    public int getCCInfo(){
        return ccInfo;
    }
}
