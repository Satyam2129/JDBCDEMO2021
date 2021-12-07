//Basics of generics
class abc <T>
{
    T obj;
    abc(T tobj)
    {
        obj = tobj;
    }
    public T get_val(){
        return obj;
    }

    public static void main(String[] args) {
        abc <String> obj = new abc<>("hello World");
        abc<Integer> obj1 = new abc<>(23);
        System.out.println(obj.get_val());
        System.out.println(obj1.get_val());
    }
}
// Concept of overloading by generics

class Test <T>
{
    public void display(T arr[])
    {
        for (T R:arr)
        {
            System.out.print(" "+R+" ");
        }
    }
}

public class Generics
{
    public static void main(String[] args) {
        String arr1[] = {"AAA","BBB","CCC","DDD"};
        Integer arr2[] = {1,2,3,4,5};
        Character arr3[] ={'a','b','c','d'};
        Test obj = new Test();
        obj.display(arr1);
        obj.display(arr2);
        obj.display(arr3);

    }
}
