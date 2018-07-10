
public class Address
{
    String street, city;
    public Address(String street, String city){
        this.street = street; 
        this.city = city;
    }

    public String getStreet(){return street;}

    public String getCity(){return city;}

    @Override
    public boolean equals(Object other){
        if (!(other instanceof Address))
            return false;
        Address otherAddress = (Address)other;
        if (!(street.equals(otherAddress.getStreet())))
            return false;
        if (!(city.equals(otherAddress.getCity())))
            return false;
        return true;
    }
}
