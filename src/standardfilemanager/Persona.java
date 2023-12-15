package standardfilemanager;
public class Persona {
int[] idPerson;
char[] name;
int[] Person_age;
int[] Cityid;
City c;
    public Persona(int[] idPerson, char[] name, int[] Person_age, int[] Cityid) {
        this.idPerson = idPerson;
        this.name = name;
        this.Person_age = Person_age;
        this.Cityid = c.getIdCity();
    }
   
    public Persona() {
    }
    
    public int[] getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int[] idPerson) {
        this.idPerson = idPerson;
    }

    public char[] getName() {
        return name;
    }

    public void setName(char[] name) {
        this.name = name;
    }

    public int[] getPerson_age() {
        return Person_age;
    }

    public void setPerson_age(int[] Person_age) {
        this.Person_age = Person_age;
    }

    public int[] getCityid() {
        return Cityid;
    }

    public void setCityid(int[] Cityid) {
        this.Cityid = Cityid;
    }

    @Override
    public String toString() {
        return "Name Person: " + name + "ID Person:" + idPerson + ", Age Persona: " + Person_age + ", City Id:" + Cityid + '}';
    }

}
