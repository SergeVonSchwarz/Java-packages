package Exception4;

import java.io.IOException;
import java.text.ParseException;

public class Exception3 {
    public void main(String[] args) {
        try {
            run();
        } catch (IOException | ParseException e) { // multicatch
            e.printStackTrace();
        }
    }

    public void run() throws IOException, ParseException, IllegalArgumentException{

    }
}
