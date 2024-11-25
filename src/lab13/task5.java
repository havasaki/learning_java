package lab13;
class Number {
    String codeCountry;
    String firstTriple;
    String secondTriple;
    String lastFour;
    String number;
    StringBuilder temp;

    private void formater() {
        number = String.format("+%s(%s)-%s-%s", codeCountry,
                firstTriple, secondTriple, lastFour);
    }

    public Number(String newNumber){

        temp = new StringBuilder(newNumber.substring(newNumber.indexOf("+")+1));

        lastFour = temp.substring(temp.length()-4);
        secondTriple = temp.substring(temp.length()-7, temp.length()-4);
        firstTriple = temp.substring(temp.length()-10, temp.length()-7);
        codeCountry = temp.substring(0, temp.length()-10);

        if (codeCountry.equals("8"))
            codeCountry = "7";

        formater();
    }

    @Override
    public String toString() {
        return "Number{" +
                "number='" + number + '\'' +
                '}';
    }
}
public class task5 {
    public static void main(String[] args) {
        Number n1 = new Number("+79501829266");
        Number n2 = new Number("89501829266");
        Number n3 = new Number("+189501829266");
        Number n4 = new Number("379501829266");
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);


    }
}