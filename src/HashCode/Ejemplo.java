package HashCode;

public class Ejemplo {
    public static void main(String[] args){

        String str1 ="Hello";
        String str2 ="Hello";
        System.out.println(str1.equals(str2));


        example obj1 = new example(5);
        example obj2 = new example(5);
        System.out.println(obj1.equals(obj2));
    }
}
class example{
    private int id;

    public example(int id) {
        this.id = id;
    }
//
//    @Override
//    public int hashCode() {
//        return name.hashCode();
//    }
}
