package sda.com;

import org.junit.Assert;
import org.junit.Test;

public class BooleanOperationsTest {

    Boolean result;

    /* Conjunction

        t && t - t
        t && f - f
        t && n - n
        f && t - f
        f && f - f
        f && n - n
        n && t - n
        n && f - n
        n && n - n

       Disjunction
        t || t - true
        t || f - true
        t || n - true
        f || t - true
        f || f - false
        f || n - false
        n || t - true
        n || f - false
        n || n - null

    */


    // conjunction start

    @Test
    public void firstTrueSecondTrueConjunctionTrue() {
        Assert.assertEquals(true,
                result = new BooleanOperations(true, true).conjunction()
        );
    }
    @Test
    public void firstTrueSecondFalseConjunctionFalse() {
        Assert.assertEquals(false,
                result = new BooleanOperations(true, false).conjunction()
        );
    }
    @Test
    public void firstTrueSecondNullConjunctionNull() {
        Assert.assertEquals(null,
                result = new BooleanOperations(true,null).conjunction()
        );
    }
    @Test
    public void firstFalseSecondTrueConjunctionFalse() {
        Assert.assertEquals(false,
                result = new BooleanOperations(false,true).conjunction()
        );
    }
    @Test
    public void firstFalseSecondFalseConjunctionFalse() {
        Assert.assertEquals(false,
                result = new BooleanOperations(false,false).conjunction()
        );
    }

    @Test
    public void firstFalseSecondNullConjunctionNull() {
        Assert.assertEquals(null,
                result = new BooleanOperations(false,null).conjunction()
        );
    }
    @Test
    public void firstNullSecondTrueConjunctionNull() {
        Assert.assertEquals(null,
                result = new BooleanOperations(null,true).conjunction()
        );
    }

    @Test
    public void firstNullSecondFalseConjunctionNull() {
        Assert.assertEquals(null,
                result = new BooleanOperations(null,false).conjunction()
        );
    }

    @Test
    public void firstNullSecondNullConjunctionNull() {
        Assert.assertEquals(null,
                result = new BooleanOperations(null,null).conjunction()
        );
    }
    // end of conjunction


    // strart of disjunction
    @Test
    public void firstTrueSecondTrueDisjunctionTrue(){
        Assert.assertEquals(true,
                result = new BooleanOperations(true,true).disjunction());
    }
    @Test
    public void firstTrueSecondFalseDisjunctionTrue(){
        Assert.assertEquals(true,
                result = new BooleanOperations(true,false).disjunction());
    }
    @Test
    public void firstTrueSecondNullDisjunctionTrue(){
        Assert.assertEquals(true,
                result = new BooleanOperations(true,null).disjunction());
    }
    @Test
    public void firstFalseSecondTrueDisjunctionTrue(){
        Assert.assertEquals(true,
                result = new BooleanOperations(false,true).disjunction());
    }
    @Test
    public void firstFalseSecondFalseDisjunctionFalse(){
        Assert.assertEquals(false,
                result = new BooleanOperations(false,false).disjunction());
    }
    @Test
    public void firstFalseSecondNullDisjunctionFalse(){
        Assert.assertEquals(false,
                result = new BooleanOperations(false,null).disjunction());
    }
    @Test
    public void firstNullSecondTrueDisjunctionTrue(){
        Assert.assertEquals(true,
                result = new BooleanOperations(null,true).disjunction());
    }
    @Test
    public void firstNullSecondFalseDisjunctionFalse(){
        Assert.assertEquals(true,
                result = new BooleanOperations(null,false).disjunction());
    }
    @Test
    public void firstNullSecondNullDisjunctionNull(){
        Assert.assertEquals(null,
                result = new BooleanOperations(null,null).disjunction());
    }

}