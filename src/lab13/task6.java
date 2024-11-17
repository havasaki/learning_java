package lab13;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

class GenerateFile {
    public static void main(String[] args) {

        StringBuilder finalString = new StringBuilder();
        StringBuilder currWord;
        ArrayList<StringBuilder> strings = new ArrayList<>();
        String middle = "какиетобуквы";
        for (int i=0; i<32; i++){
            currWord =  new StringBuilder();
            currWord.append((char)(1072+i)).append(middle).append((char)((1072+i+1)));
            strings.add(currWord);
        }

        Collections.shuffle(strings);

        for (StringBuilder str: strings){
            finalString.append(str).append(" ");
        }

        try(FileWriter writer = new FileWriter("src/lab13/example.txt", false))
        {
            writer.append(finalString.toString());
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}

public class task6 {

    public static String getLine(String string){
        StringBuilder rez = new StringBuilder();
        String[] strList = string.split(" ");

        rez.append(strList[0]).append(" ");
        char last = strList[0].charAt(strList[0].length() - 1);
        for (int i=1;i<strList.length; i++){
            for (int j=0;j<strList.length; j++){
                if (strList[j].charAt(0) == last){
                    rez.append(strList[j]).append(" ");
                    last = strList[j].charAt(strList[j].length() - 1);
                    break;
                }
            }
        }

        return rez.toString();
    }

    public static void main(String[] args) {

        StringBuilder string = new StringBuilder();
        StringBuilder finalString = new StringBuilder();

        try(FileReader reader = new FileReader(args[0]))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){
                string.append((char)c);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("Строка до преобразования: ");
        System.out.println(string);
        System.out.println("Строка после преобразования: ");
        System.out.println(getLine(string.toString()));

    }
}