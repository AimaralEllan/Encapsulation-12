public class Pupil {
    private String name;
    private String surname;
    private int age;
    private String[] courses=new String[3];

    void getName(String name){
        this.name=name;
    }
    String setName(){
        return name;
    }

    void getSurname(String surname){
        this.surname=surname;
    }
    String setSurname(){
        return surname;
    }

    void getAge(int age){
        this.age=age;
    }
    int setAge(){
        return age;
    }

    void getCourses(String[] courses){
      this.courses=courses;
    }
    public String[] setCourses(){
        return courses;
    }
}
