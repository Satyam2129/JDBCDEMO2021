import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_Expression {
    public static void main(String[] args) {
        String target = "2Bf5BBg7BBBi%";
//        Pattern p = Pattern.compile("[B]+");//pattern.case_insensitive bhi ek inbuilt method hai
//        Pattern p = Pattern.compile("[B]*");
        Pattern p = Pattern.compile("[B]?");
        Matcher m = p.matcher(target);
        int ctr=0;
        //find mehthod ka return type boolean hota h
        while(m.find()){
            ctr++;
            System.out.println(m.start()+"--"+m.end()+"--"+m.group());
            //group ki jagh string ko pass krne se nahi hoga kyunki wo us value ko print krta hia jo waha available hai
        }
        System.out.println(ctr);
    }
}
class String_matches{
    public static void main(String[] args) {
        String str = "Satyam";
        String s1 = "Satyam Singh student";
        System.out.println(str.matches("[a-z]{4}"));//only boolean value is the output
        System.out.println(s1.matches("[a-z]{4}"));
    }
}

class String_array{
    public static void main(String[] args) {
        String a[]= {"aaa","abcd","manana"};
        for (String res: a) {
            if(res.matches("[a-z]{4}")==true){
                System.out.println(res);
            }
        }
    }
}

class Valid_Email{
    public static void main(String[] args) {
        // agar ek hi string print karani hai to hum iska istemal akr skte ho nahi to regex ka use karna hoga
        String arr[] = {"abc@gmail.com","hasb","jsdkjan"};
        for (String res:arr) {
            if (res.matches("\\w+@gmail.com")){
                System.out.println(res);
            }
        }
    }
}