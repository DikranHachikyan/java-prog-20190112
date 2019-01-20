package text;

import java.io.IOException;

/**
 *
 * @author wizard
 */
public class ReadText implements AutoCloseable{
    public String get() throws IOException{
        StringBuilder sb = new StringBuilder();
        char c = ' ';
      
        while( (c =(char)System.in.read()) != 10){
            if( c == '+') throw new IOException("Invalid Char:" + c);
            sb.append(c);
        }
        
        return sb.toString();
    }

    @Override
    public void close() throws Exception {
    
    }
}
