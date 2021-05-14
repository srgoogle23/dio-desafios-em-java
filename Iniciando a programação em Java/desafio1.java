import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShowPairNumbers
{
    public static void main(String[] args) throws IOException
    {
        String insertedNumber;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        insertedNumber = br.readLine();
        for (int i = 2; i <= Integer.parseInt(insertedNumber); i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
