//Group 16
//Team Members: Hridika, Syed, Radia, MD


package org.jfree.data;

import static org.junit.Assert.*; 
import org.jfree.data.Range; import org.junit.*;

public class RangeTestA3 {
	private Range exampleRange;
    private Range exampleRange2;
    private Range exampleRange3;
    private Range exampleRange4;
    //public Range exampleRange5;
    @BeforeClass public static void setUpBeforeClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception { 
    	exampleRange = new Range(-2.0, 1.0);
    	exampleRange2 = new Range(-5,-1);
    	exampleRange3 = new Range(-5.0,10.0);
    	exampleRange4= new Range(5.0,10.0);
    	//exampleRange5 = new Range(9.0,2.0);
    	
    }


    @Test
    public void centralValueShouldBeZeroPointFive() {
        assertEquals("The central value of -2 and 1 should be -0.5",
        -0.5, exampleRange.getCentralValue(), .000000001d);
    }
    
    
    
    
    @Test
    public void testIntersectRange(){
    	
    	assertTrue(" Does -7.0 to 4.0 intersect for (-5.0, 10.0) is: ", exampleRange3.intersects(exampleRange4));
    	
    }
    
    
   // Test for -ve to +ve range  
    @Test
    public void TestgetLengthNtoP() {
    	
        assertEquals("The Length value of -2 and 1 should be 3",
        3.0, exampleRange.getLength(), .000000001d);
    }
    
 // Test for -ve to -ve range  
    @Test
    public void TestgetLengthNtoN() {
    	
        assertEquals("The Length value of -5 and -1 should be 3",
        4.0, exampleRange2.getLength(), .000000001d);
        
        
    }
    
    // Test for +ve to +ve range  
    @Test
    public void TestgetLengthPtoP() {
    	
        assertEquals("The Length value of 5.0 and 10.0 should be 5",
        5.0, exampleRange4.getLength(), .000000001d);
        
        
    }
    
 
    
    

    
    
    
    
    
    // Tests for positive upper bound.
    
    @Test
    public void TestgetPUpperBound() {
    	
        assertEquals("The Upper value of -2 and 1 should be 1",
        1.0, exampleRange.getUpperBound(), .000000001d);
    }
    
    // Test for negative upper bound  
    
    @Test
    public void TestgetNUpperBound() {
    	
        assertEquals("The Upper value of -5 and -1  should be -1",
        -1.0, exampleRange2.getUpperBound(), .000000001d);
    }
    
    
    //
    
    
    
    
    
    
    // Tests for negative lower bound
    @Test
    public void TestgetNLowerbound() {
    	
    	
    	
        assertEquals("The LowerBound value of -2 and 1 should be -2.0",
        -2.0, exampleRange.getLowerBound(), .000000001d);
    

    }
    
    
    // Tests for positive lower bound
    @Test
    public void TestgetPLowerbound() {
    	
    	
    	
        assertEquals("The LowerBound value of 5.0 and 10.0 should be 5.0",
        5.0, exampleRange4.getLowerBound(), .000000001d);
    

    }
    
    
    
    
    
    // Test for contain 
    
    // Test for within range (integer)
    @Test 
    public void TestContainsInt() {
    	
    	
    	assertTrue("The value 0 must be in the range in -2 and 1", exampleRange.contains(0));
    	
    }
    
 // Test for within range (integer)
    @Test 
    public void TestContainsDouble() {
    	
    	
    	assertTrue("The value 0 must be in the range in -2 and 1", exampleRange.contains(0.5));
    	
    }
    
 // Test for upper bound
    @Test 
    public void TestContainsUpperBound() {
    	
    	
    	assertTrue("The value 0 must be in the range in -2 and 1", exampleRange.contains(1));
    	
    }
    
 // Test for lower bound
    @Test 
    public void TestContainsLowerBound() {
    	
    	
    	assertTrue("The value 0 must be in the range in -2 and 1", exampleRange.contains(-2));
    	
    }

 // Test for less than lower bound
    
    
 // Test for +infinity
    @Test 
    public void TestContainsPInfinity() {
    	
    	assertFalse("The value 0 must be in the range in -2 and 1", exampleRange.contains(Double.POSITIVE_INFINITY));
    	
    }
    
 // Test for more than upper bound
    @Test 
    public void TestContainsNInfinity() {
    	
    	assertFalse("The value 0 must be in the range in -2 and 1", exampleRange.contains(Double.NEGATIVE_INFINITY));
    	
    }
    
    
    
    
    
    
    

    
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
  
    
//    @Test 
//    public void TestToString() {
//    	String result = "Range[-2,1]";
//    	
//    	
//    	assertEquals("The String  value of Range(-2 and 1) should be Range[-2, 1]",
//    	        result, exampleRange.toString());
//    	
//    	System.out.println(exampleRange.toString());
//    	
//    }
    
    
    
    
    
    
    // Test for constrain
    
    // Test for within range(decimal)
    @Test
    public void TestgetConstrainWithinRangeDouble() {
    	
    	
    	
        assertEquals("The Constrain value of -2.0 is -2.0",
        -2.0, exampleRange3.constrain(-2.0), .000000001d);
        
    

    }
    
 // Test for within range(integer)
    
    @Test
    public void TestgetConstrainWithinRangeInt() {
    	
    	
    	
        assertEquals("The Constrian value -2 is ",
        -2.0, exampleRange3.constrain(-2), .000000001d);
        
    

    }
    
 // Test lower bound 
    
    @Test
    public void TestgetConstrainLowerBound() {
    	
    	
    	
        assertEquals("The Constrian value -5.0 is -5.0 ",
        -5.0, exampleRange3.constrain(-5.0), .000000001d);
        
    

    }
    
// Test upper bound 
    
    @Test
    public void TestgetConstrainUpperBound() {
    	
    	
    	
        assertEquals("The Constrian value 10.0 is 10.0 ",
        10.0, exampleRange3.constrain(10.0), .000000001d);
        
    

    }
 
// Test less than lower bound 
    
   
    
// Test positive infinity
    
    @Test
    public void TestgetConstrainPInfinity() {
    	
    	
    	
        assertEquals("The Constrian value +infinity is 10.0 ",
        10.0, exampleRange3.constrain(Double.POSITIVE_INFINITY), .000000001d);
        
        
    

    }
    
// Test negative infinity
    
    @Test
    public void TestgetConstrainNInfinity() {
    	
    	
    	
        assertEquals("The Constrian value -infinity is -5.0 ",
        -5.0, exampleRange3.constrain(Double.NEGATIVE_INFINITY), .000000001d);
        
        
    

    }
    
    
    
    
    // test for combine
    
    
    @Test
    public void TestCombine() {
    	
    	Range Range1 = new Range(-2.0, 1.0);
    	Range Range2 = new Range(3.0, 10.0);
    	Range RangeAnswer = new Range(-2.0, 10.0);
    	
    	
    	
        assertEquals("The Constrian value -7.0 is -5.0 ",
        RangeAnswer, Range.combine(Range1,Range2));
        
        
    

    }
    
    @Test
    public void TestCombineRange1Null() {
    	
    	Range Range1 = null;
    	Range Range2 = new Range(3.0, 10.0);
    	
    	
    	
    	
        assertEquals("The Constrian value -7.0 is -5.0 ",
        Range2, Range.combine(Range1,Range2));
        
        
    

    }
    
    @Test
    public void TestCombineRange2Null() {
    	
    	
    	Range Range1 = new Range(3.0, 10.0);
    	Range Range2 = null;
    	
    	
    	
        assertEquals("The Constrian value -7.0 is -5.0 ",
        Range1, Range.combine(Range1,Range2));
        
        
    

    }
    
    
    
    //  tests for combineNaN
    
    
    
    @Test
    public void TestCombineNaN() {
    	
    	Range Range1 = new Range(3.0, 10.0);
    	Range Range2 = new Range(15.0, 20.0);
    	
    	Range RangeAnswer = new Range(3.0, 20.0);
    	assertEquals("The Constrian value -7.0 is -5.0 ",
    	        RangeAnswer, Range.combineIgnoringNaN(Range1,Range2));
    }
    
    
    
    
    
    @Test
    public void TestCombineNaNRange1NullRange2NaN() {
    	
    	
    	Range Range1 = null;
    	Range Range2 = new Range(Double.NaN, Double.NaN);
    	
    	
    	
        assertNull("The Constrian value -7.0 is -5.0 ",
         Range.combineIgnoringNaN(Range1,Range2));
        
        
    

    }
    
    @Test
    public void TestCombineNaNRange2NullRange1NaN() {
    	
    	Range Range1 = new Range(Double.NaN, Double.NaN);
    	Range Range2 = null;
    	
    	
        assertNull("The Constrian value -7.0 is -5.0 ",
         Range.combineIgnoringNaN(Range1,Range2));

    }
    
    
    @Test
    public void TestCombineNaNRange1Null() {
    	
    	Range Range2 = new Range(3.0, 10.0);
    	Range Range1 = null;
    	
    	
    	assertEquals("The Constrian value -7.0 is -5.0 ",
    	        Range2, Range.combineIgnoringNaN(Range1,Range2));
    }
    
    
    @Test
    public void TestCombineNaNRange2Null() {
    	
    	Range Range1 = new Range(3.0, 10.0);
    	Range Range2 = null;
    	
    	
    	assertEquals("The Constrian value -7.0 is -5.0 ",
    	        Range1, Range.combineIgnoringNaN(Range1,Range2));
    }
    
    
    
    
// tests expand.
    
    @Test
    public void TestExpand() {
    	
    	Range Range1 = new Range(3.0, 7.0);
    	
    	Range RangeAnswer = new Range(-5.0, 19.0);
    	
    	assertEquals("The Constrian value -7.0 is -5.0 ",
    	        RangeAnswer, Range.expand(Range1,2,3));
    }
    
    
    @Test
    public void TestExpandNegetive() {
    	
    	Range Range1 = new Range(3.0, 7.0);
    	
    	Range RangeAnswer = new Range(3.0, 3.0);
    	
    	assertEquals("The Constrian value -7.0 is -5.0 ",
    	        RangeAnswer, Range.expand(Range1,-2.0,-3.0));
    }
    
    
    
    // test shift
    
    @Test
    public void TestShift() {
    	
    	Range Range1 = new Range(3.0, 7.0);
    	
    	Range RangeAnswer = new Range(5.0, 9.0);
    	
    	assertEquals("The Constrian value -7.0 is -5.0 ",
    	        RangeAnswer, Range.shift(Range1,2.0));
    	
    }
    
    
    // test shift with crossing
    
    @Test
    public void TestShiftCrossing() {
    	
    	Range Range1 = new Range(-3.0, 7.0);
    	
    	Range RangeAnswer = new Range(1.0, 11.0);
    	
    	assertEquals("The Constrian value -7.0 is -5.0 ",
    	        RangeAnswer, Range.shift(Range1,4.0,true));
    	
    }
    
    @Test
    public void TestShiftCrossingWITHNOZEROCROSSING() {
    	
    	Range Range1 = new Range(-3.0, 7.0);
    	
    	Range RangeAnswer = new Range(0.0, 11.0);
    	
    	assertEquals("The Constrian value -7.0 is -5.0 ",
    	        RangeAnswer, Range.shift(Range1,4.0,false));
    	
    }
    
    @Test
    public void TestShiftCrossingWithNoCrossingAndValueIsZero() {
    	
    	Range Range1 = new Range(0.0, 7.0);
    	
    	Range RangeAnswer = new Range(4.0, 11.0);
    	
    	assertEquals("The Constrian value -7.0 is -5.0 ",
    	        RangeAnswer, Range.shift(Range1,4.0,false));
    	
    }
    
    
    
    
    @Test
    public void TestexpandToInclude() {
        	
        	Range result = Range.expandToInclude(exampleRange4, 15);
        	Range expected = new Range(5,15);
        	
        	
        	assertEquals("Test for ExpandtoInclude()",expected,result);
        	
        	
        }
        
        
    @Test
    public void TestexpandToIncludeWITHLowerValue() {
    	
    	Range result = Range.expandToInclude(exampleRange4, 1);
    	Range expected = new Range(1,10);
    	
    	
    	assertEquals("Test for ExpandtoInclude()",expected,result);
    	
    	
    }

    @Test
    public void TestexpandToIncludeWithNULL() {
        	
        	Range result = Range.expandToInclude(null, 15);
        	Range expected = new Range(15,15);
        	
        	
        	assertEquals("Test for ExpandtoInclude()",expected,result);
        	
        	
        }
       
    @Test
    public void TestexpandToIncludeWithNOChange() {
        	
        	Range result = Range.expandToInclude(exampleRange4, 10);
        	Range expected = new Range(5,10);
        	
        	
        	assertEquals("Test for ExpandtoInclude()",expected,result);
        	
        	
        }
    
    
    @Test
    public void testHashCode(){
    	
    	assertEquals("The HashCode for (-2, 1) is 0 ", -1048576.0, exampleRange.hashCode(), .000000001d);
    	
    }
    
    
    @Test
    public void testIntersects1(){
    	
    	
    	assertEquals(" Does -1.0 to 4.0 intersect for (-5.0, 10.0) is: ", true, exampleRange3.intersects(-1.0, 4.0));
    	
    }
    
    
    @Test
    public void testIntersects2(){
    	
    	assertEquals(" Does -7.0 to 4.0 intersect for (-5.0, 10.0) is: ", true, exampleRange3.intersects(-7.0, 4.0));
    	
    }
    
    
    
@Test
    
    public void testScale1(){
    	
    	Range scaledRange = Range.scale(exampleRange3, 3);
    	Range expectedRange = new Range(-15.0, 30.0);
    	
    	assertEquals(" Scaling (-5.0, 10.0) by 3: ", expectedRange, scaledRange);
    	
    }
@Test(expected = IllegalArgumentException.class)
public void testScale2(){
	
	
	Range.scale(exampleRange3, -3);
	
	
}

@Test(expected = IllegalArgumentException.class)
public void testFlippedRange(){
	
	Range temp = new Range(10.0, 4.0);
	
	
	
}

@Test
public void testgetLen(){
	
	assertEquals(" Getlength is equal to 5: ", 5, exampleRange4.getLength(), 0.00000001d);
	
}
@Test
public void testequals(){
	Range temp1 = new Range(5.0, 10.0);
	assertTrue(" test for equal: ",exampleRange4.equals(temp1));
	
}
@Test
public void testequals1(){
	Range temp1 = new Range(5.0, 11.0);
	assertFalse(" test for equal: ",exampleRange4.equals(temp1));
	
}



//Range temp1 = new Range(10.0, 4.0);


//@Test(expected = IllegalArgumentException.class)
//public void testLowerBoundException(){
//	Range temp1 = new Range(10.0, 4.0);
//	temp1.getLowerBound();
//
//	
//}


    
    
    
    
    
    
    
    
    
   
    
    
    
    
    

    
    
    
    

    @After
    public void tearDown() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }
}