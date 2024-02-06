package au.com.altx.components;

import lombok.extern.log4j.Log4j2;

import java.util.Random;
@Log4j2
public class RandomString {

    public int leftLimit = 97; // letter 'a'
    public int rightLimit = 122; // letter 'z'
    public int targetStringLength = 8;
    public String generatedString;

    public void randomText(){

        Random random = new Random();

        for(int x=1;x<=1000;x++) {
            StringBuilder buffer = new StringBuilder(targetStringLength);
            for (int i = 0; i < targetStringLength; i++) {
                int randomLimitedInt = leftLimit + random.nextInt(rightLimit - leftLimit + 1);
                buffer.append((char) randomLimitedInt);
            }
            generatedString = buffer.toString();
        }
    }
    public int randomNumber(){
        Random random = new Random();
        return random.nextInt(1000);
    }

    public int gen() {
        Random r = new Random( System.currentTimeMillis() );
        return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
    }

    public int randomNumberForNINumber(){
        Random random = new Random();
        return random.nextInt(1000000);
    }

    public int randomNumberForAccountNumber(){
        Random random = new Random();
        return random.nextInt(1000000000);
    }

}
