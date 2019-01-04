package Exception4;

import java.io.IOException;
import java.text.ParseException;

public class Exception1 {
    public void main(String[] args) {
        try {
            run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void run() throws IOException, ParseException, IllegalArgumentException{

    }
}
