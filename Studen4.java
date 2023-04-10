
class Studen4{
    int id;
    String name;
    
    Studen4 (int i, String n){
        id =i;
        name =n;
    }
    void display(){
        System.out.println(id+ "My "+ name);
    }

public static void main (String args[]){
    Studen4 s1 = new Studen4(111, "Miriam");
    Studen4 s2 = new Studen4(123, "no");
    s1.display();
    s2.display();

}}