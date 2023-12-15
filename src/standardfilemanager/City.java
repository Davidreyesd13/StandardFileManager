package standardfilemanager;
public class City {
int[] IdCity;
char[] CityName;

    public City(int IdCity, char CityName) {
        this.IdCity = new int[2];
        this.CityName = new char[30];
    }

    public City() {
    }

    public int[] getIdCity() {
        return IdCity;
    }

    public void setIdCity(int[] IdCity) {
        this.IdCity = IdCity;
    }

    public char[] getCityName() {
        return CityName;
    }

    public void setCityName(char[] CityName) {
        this.CityName = CityName;
    }

    @Override
    public String toString() {
        return  "Name City: " + CityName + "Id: " + IdCity ;
    }

}
