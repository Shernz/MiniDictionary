package Strings;

import java.io.FileReader;
import java.util.*;

public class MiniDict {

    HashMap<String, String> hash;
    public static final String FILE_NAME = "C:\\Users\\Sharanya.HP\\Desktop\\Sharanya\\Exercises\\Java\\project\\wordsHub.txt";

    public MiniDict() {
        hash = new HashMap<String, String>();
    }

    public void readWords(){
        /*String [] words = {"acrylic","\nadjective\n1.\nmade from polymers of acrylic acid.\nnoun\n1.\nan acrylic textile fibre.\n2.\nan acrylic paint."};
        for(int i = 0; i < words.length - 1; i++){
            d.hash.put(words[i],words[i + 1]);
        }*/
        //List<String> lines = Files.readAllLines(Paths.get("wordsHub.txt"));
        //String lines = Files.readAllLines(Paths.get("wordsHub.txt"));
        //System.out.println(lines);
        /*for (String w : lines) {
            System.out.println(w +  " ");
        }*/
        try {
            FileReader file =  new FileReader(FILE_NAME);
            int  ch = 0;
            StringBuilder words = new StringBuilder();
            while ((ch = file.read()) != -1) {
               // words += String.valueOf((char)ch);
                words.append((char)ch);
            }
            String [] wordsWithMeaning = words.split("\\*");//takes regular expressions only hence \\
            //for(int  i = 0;  i < wordsWithMeaning.length - 1 ; i++){
             //   hash.put(wordsWithMeaning[i], wordsWithMeaning[i + 1]);
            //}
            for (String v : words) {
                System.out.print(words);
            //}

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        //Requires two arguments as one is for key and the other is for the value
        MiniDict d = new MiniDict();
        d.readWords();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = in.next();
        String found = d.hash.get(word);
        if(found != null){
            System.out.println(found);
        }
        else{
            System.out.println("Word not found");
        }
    }
}
