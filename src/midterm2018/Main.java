package midterm2018;
import java.util.List;
import com.google.Gson;

public class Main {

    public static void main(String[] args) {
        String question1and2 = "GET /add?a=3&b=4 HTTP/1.1\n"
            + "Host: localhost:1298\n"
            + "Connection: keep-alive\n"
            + "User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.106 Safari/537.36\n"
            + "Accept: image/webp,image/apng,image/*,*/*;q=0.8\n"
            + "Referer: http://localhost:1298/\n"
            + "Accept-Encoding: gzip, deflate, br\n"
            + "Accept-Language: en-US,en;q=0.9,es;q=0.8\n";

        String question3 = "{\n"
            + "    “task” : “inc”,\n"
            + "    “num” : 3\n"
            + "}\n";

        String question4and5 = "To opt out, you’ll need to enter the Settings menu by clicking the three vertical dots, all the way in the upper right corner of the browser. From there, you’ll need to enter the Advanced settings at the very bottom and find the “Allow Chrome sign in” toggle, then turn it to off. Doing so lets you sign into Google services like Gmail and Maps without signing into the Chrome browser itself.";


        System.out.println(question1and2);
        System.out.println(question3);
        System.out.println(question4and5);

        // print each answer at the end

        // Question 1
        // Return the Host

        // Question 2
        // return sum of a and b

        // Question 3
        // convert to java object, increment num, convert back to json and return

        // Question 4
        // return unique words

        // Question 5
        // return 2nd most common word
        function myFunction() 
        {
            return localhost:1298;
        }
         var x = addFunction(3, 4);   

        function addFunction(a, b) 
        {
            return a + b;                
        }
        
        public String getObject()
        {
            private String object = question3;
            for(i = 0; i < object; i++)
            {
                object++;
            }
            let jsonObject = JSON.parse(object);
            return object;
        }
        
        function getFrequency(string, cutoff)
        {
            var cleanString = string.replace(/[\.,-\/#!$%\^&\*;:{}=\-_`~()]/g,""), words = readString.split(' '), frequencies = {}, word, frequency, i;
            var mf = 1, m = 0, iteam;
            for( i = 0, i < words.length; i++)
            {
                word = words[i];
                frequencies[word] = frequencies[word] || 0; 
                frequencies[word]++;
                
                for(var j = i; j < words.length; j++)
                {
                    if(words[i] == words[j])
                    {
                        if (mf < m)
                        {
                            mf = m;
                            item = words[i];
                        }
                        
                    }
                }
                m =0;
            }
            
            words = OBJECT.keys( frequencies );
            
            return [words, iteam];
            
            
            }
        
        document.write(getFrequency(question4and5);
        
         }
   }
}
