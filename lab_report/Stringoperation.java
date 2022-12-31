import javax.swing.text.StyleContext.NamedStyle;

public class Stringoperation {
    public static void main(String args[]){
        String name = "Nitesh";
        String caste = "Raya";

        //adding two string
        name.concat(" ").concat(caste);
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("t"));
        System.out.println(name.replace(name, "Bottle"));
    }
}
