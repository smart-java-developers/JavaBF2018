package Others1;
//Ако на някой му трябва. вземане на число от стринг.
public class FromStringToInt_oneDigit {
    public static void main(String[] args) {
        String element = "9dhfl5";
        String s;
        s = "" + element.charAt(0);
        int x = Integer.parseInt(s);
        // x = 9;
    }
}
