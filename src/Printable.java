public interface Printable {
 abstract void print();
}
interface Showable{
    abstract void show();
}
class Human implements Printable,Showable{
    public void print(){
        System.out.println("Hello");
    }
    public void show(){
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        Human h = new Human();
        h.print();
        h.show();
    }
}
