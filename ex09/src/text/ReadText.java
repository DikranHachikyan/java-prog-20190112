package text;

import java.io.IOException;

/**
 *
 * @author wizard
 */
public class ReadText {
    public String get(){
        StringBuilder sb = new StringBuilder();
        char c = ' ';
        try{
            while( (c =(char)System.in.read()) != 10){
                if( c == '+') throw new IOException("Invalid Char:" + c);
                sb.append(c);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return sb.toString();
    }
}
