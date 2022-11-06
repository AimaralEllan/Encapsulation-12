public class Rectangle {
    private int with;
    private int length;

    public void getWith(int with){
        this.with=with;
    }
    public int setWith(){
        return with;
    }

    public void getLength(int length){
        this.length=length;
    }
    public int setLength(){
        return length;
    }

    public void area(){
        System.out.println(length*with);
    }
}
