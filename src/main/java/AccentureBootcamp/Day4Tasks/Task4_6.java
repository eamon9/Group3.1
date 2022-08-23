package AccentureBootcamp.Day4Tasks;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/*
INPUT/OUTPUT

* 1. Write a Java program to get a list of all file/directory names from the given.
* 2. get specific files by extensions from a specified folder.
* 3. check if a file or directory specified by pathname exists or not.
* 4. check if a file or directory has read and write permission.
* 5. check if given pathname is a directory or a file.
* 6. compare two files lexicographically.
* 7. get last modified time of a file.
* 8  read input from java console.
* 9. get file size in bytes, kb, mb.
* 10. read contents from a file into byte array.
* 11. read a file content line by line.
* 12. read a plain text file.
* 13. read a file line by line and store it into a variable.
* 14. store text file content line by line into an array.
* 15. write and read a plain text file.
* 16. append text to an existing file. //Like add some text to existing file
* 17. read first 3 lines from a file.
* 18. find the longest word in a text file.
* */
public class Task4_6 {
    public Task4_6() throws IOException {
        File file= new File("/Users/qwer/eclipse-workspace/Group3/src/AccentureBootcamp");
        File file2= new File("/Users/qwer/eclipse-workspace/Group3/src/AccentureBootcamp/Day4Tasks/test.txt");
        File txtFile= new File("/Users/qwer/eclipse-workspace/Group3/src/AccentureBootcamp/Day4Tasks/test2.txt");

        //1
        nr(1);
        String[] fileList= file.list();
        for (int i = 0; i < fileList.length; i++) {
            System.out.println(fileList[i]);
        }

        //2
        nr(2);
        String fileName = file2.toString();
        int index = fileName.lastIndexOf('.');
        int index2 = fileName.lastIndexOf('/');
        String extension = fileName.substring(index + 1);
        String extension2 = fileName.substring(index2 + 1);
        if(index > 0) {
            System.out.println("File extension is " + extension);
            System.out.println("File name is= "+ extension2);
        }

        //3
        nr(3);
        System.out.println(file.exists() ? "The directory or file exists." : "The directory or file does not exist.");

        //4
        nr(4);
        System.out.println(file.canWrite() ? "You can write file there" : "You can't write file there");
        System.out.println(file.canRead() ? "You can read file there" : "You can't read file there");

        //5
        nr(5);
        System.out.println(file.isDirectory() ? "Is a directory" : "Isn't a directory");

        //6
        /*
According to Wikipedia:
In mathematics, the lexicographic or lexicographical order
(also known as lexical order,
dictionary order, alphabetical order or lexicographic(al) product)
is a generalization of the way the alphabetical order of
 words is based on the alphabetical order of their component letters.
 This generalization consists primarily in defining a total order
 over the sequences (often called words in computer science) of
 elements of a finite totally ordered set, often called alphabet.
 */
        /*nr(6);
        String str1 = "Today is a good day";
        String str2 = "Today is a good day";
        int lex = str1.compareTo(str2);

        if(lex > 0) {
            System.out.println("Total order over the sequences is "+lex);
        } else if(lex == 0) {
            System.out.println("Strings are in lexicographical order");
        } else{
            System.out.println("Total order over the sequences is "+lex);
        }*/

        //7
        nr(7);
        Date date= new Date(file.lastModified());
        System.out.println("Last modification: "+date);

        //8
        nr(8);
        /*Scanner scan= new Scanner(System.in);
        String name;
        int age;
        System.out.println("Enter your Name: ");
        name= scan.next();
        System.out.println("Enter your age: ");
        age= scan.nextInt();
        System.out.println("Hi "+name+", is your age is "+age+"?");*/

        /*BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String job, transport;
        System.out.println("Where are you working:");
        job= br.readLine();
        System.out.println("What kind of transport do you use to get to work:");
        transport= br.readLine();
        System.out.println("I like to use "+transport+" to get to work- "+job);
        br.close();*/

        //9
        nr(9);
        long txtSize= file.length();
        int kb= 1024;
        System.out.println("File length- "+txtSize+" chars");
        System.out.println("File size in bytes: "+txtSize);
        System.out.println("File size in kb: "+(double)txtSize/kb);
        System.out.println("File size in mb: "+(double)txtSize/(kb*kb));

        //10
        nr(10);
        Path path= Paths.get(String.valueOf(txtFile));
        byte[] arr= Files.readAllBytes(path);
        System.out.println(Arrays.toString(arr));

        //11
        nr(11);
        BufferedReader br= null;
        String strLine= "";
        try {
            br = new BufferedReader( new FileReader(txtFile));
            while( (strLine = br.readLine()) != null){
                System.out.println(strLine);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }

        //12
        /*nr(12);
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(txtFile));
            while (strLine != null)
            {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }*/

        //13
        /*nr(13);
        StringBuilder sb = new StringBuilder();
        String stringLine = "";
        String str_data = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(file2));
            while (stringLine != null)
            {
                if (stringLine == null)
                    break;
                str_data += stringLine+"\n";
                stringLine = br.readLine();

            }
            System.out.println(str_data);
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }*/

        //14
        /*nr(14);
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        List<String> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(txtFile));
            while (strLine != null)
            {
                strLine = br.readLine();
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                if (strLine==null)
                    break;
                list.add(strLine);
            }
            System.out.println(Arrays.toString(list.toArray()));
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }*/

        //15
        /*nr(15);
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        try
        {
            String filename= txtFile.toString();
            System.out.println(filename);
            FileWriter fw = new FileWriter(filename,false);
            fw.write("Lets have some fun at this sunny day\n");
            fw.close();
            BufferedReader br = new BufferedReader(new FileReader(txtFile));
            while (strLine != null)
            {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
            br.close();
        }
        catch(IOException ioe)
        {
            System.err.println("IOException: " + ioe.getMessage());
        }*/

        //16
        /*nr(16);
        StringBuilder sb = new StringBuilder();
        String strLine2 = "";
        try
        {
            String filename= file2.toString();
            FileWriter fw = new FileWriter(filename,true);
            fw.write("\nMother will be proud\n");
            fw.write("Dad will be proud to\n");
            fw.write("Cat says: \"meow\"\n");
            fw.close();
            BufferedReader bre = new BufferedReader(new FileReader(file2));
            while (strLine2 != null)
            {
                sb.append(strLine2);
                sb.append(System.lineSeparator());
                strLine2 = bre.readLine();
                System.out.println(strLine2);
            }
            bre.close();
        }
        catch(IOException ioe)
        {
            System.err.println("IOException: " + ioe.getMessage());
        }*/

        //17
        nr(17);
        BufferedReader br1= null;
        String strLine3= "";
        int count= 0;
        try {
            br1 = new BufferedReader( new FileReader(txtFile));
            while( ((strLine3 = br1.readLine()) != null)){
                System.out.println(strLine3);
                count++;
                if(count== 3) break;
            }
            br1.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }

        //18
        nr(18);
        /*FileReader fr=new FileReader(file2);
        BufferedReader br4=new BufferedReader(fr);
        String lWord= "";
        String tempWord= "";

        int i;
        while((i=br4.read())!=-1){
            System.out.print((char)i);
            tempWord+= (char)i;
        }
        String[] words= tempWord.split(" ");

        lWord= Arrays.stream(tempWord.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null);
        br4.close();
        fr.close();
        System.out.println("\nLongest word: "+lWord+", with length: "+lWord.length());
        System.out.println("\nTemp word array= "+Arrays.toString(words));*/
        String longest_word = "";
        String current;
        Scanner sc = new Scanner(new File(file2.toString()));


        while (sc.hasNext()) {
            current = sc.next();
            if (current.length() > longest_word.length()) {
                longest_word = current;
            }

        }
        System.out.println("Longest word: <"+longest_word+">");
    }

    void nr(int task) {
        System.out.println(task+".");
    }
}
