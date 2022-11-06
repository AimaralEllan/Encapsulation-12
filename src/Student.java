public class Student {
    private String name;
    private String  surname;
    private int age;
    private String city;

    public void getName(String mainName){
        name=mainName;
    }
    public  String setName(){
        return name; //At barabarlandy
    }

    public void getSurname(String mainSurname){
        surname=mainSurname;
    }
    public String setSurname(){
        return surname;
    }
    public  void getAge(int maindenKeluuchuJash){
       /*if (maindenKeluuchuJash>0){
           age=maindenKeluuchuJash;
       }else {
           System.out.println("Wrong");
       }*/
        age=2022-maindenKeluuchuJash;

    }
    public int setAge(){
        return age;
    }

    public void getCity(String mainCity){
        city=mainCity;
    }
    public String setCity(){
        return city;
    }
}
