import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class helloworldTest {
    helloworld obj=new helloworld();
    @Test
    public void factorialTruePositive(){
        int n;
        assertEquals("FInding fact of a number for True Positive",120,obj.fact(5));
        assertEquals("FInding fact of a number for True Positive",24,obj.fact(4));
    }
}
