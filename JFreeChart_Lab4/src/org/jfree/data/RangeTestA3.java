//Group 16
//Team Members: Hridika, Syed, Radia, MD


package org.jfree.data;

import static org.junit.Assert.*; 
import org.jfree.data.Range; 
import org.junit.*;

public class RangeTest {
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
    @Test 
    public void TestContainsLessThanLowerBound() {
    	
    	
    	assertFalse("The value 0 must be in the range in -2 and 1", exampleRange.contains(-4));
    	
    }
    
 // Test for more than upper bound
    @Test 
    public void TestContainsMoreThanUpperBound() {
    	
    	
    	assertFalse("The value 0 must be in the range in -2 and 1", exampleRange.contains(4));
    	
    }
    
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
    
    @Test
    public void TestgetConstrainLessLowerBound() {
    	
    	
    	
        assertEquals("The Constrian value -7.0 is -5.0 ",
        -5.0, exampleRange3.constrain(-7.0), .000000001d);
        
        
    

    }
    
// Test greater than upper bound 
    
    @Test
    public void TestgetConstrainGreaterUpperBound() {
    	
    	
    	
        assertEquals("The Constrian value 20.0 is 10.0 ",
        10.0, exampleRange3.constrain(20.0), .000000001d);
        
        
    

    }
    
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
    
    
    // New test to kill mutant (a++)
    @Test
    public void TestgetConstrainKillMutantIncrement() {
    	
    	Range Range1 = new Range(6.0, 7.0);
    	
        assertEquals("The Constrain value of -2.0 is -2.0",
        6.0, Range1.constrain(5.0), .000000001d);
        
    

    }
    
    // test to kill mutant (a--)
    
    @Test
    public void TestgetConstrainKillMutantDecrement() {
    	
    	Range Range1 = new Range(6.0, 7.0);
    	
        assertEquals("The Constrain value of -2.0 is -2.0",
        7.0, Range1.constrain(8.0), .000000001d);
        
    

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
    
    
    @Test
    public void TestCombineNaNRange1NaNRange2NaN() {
    	
    	
    	Range Range1 = new Range(Double.NaN, Double.NaN);
    	Range Range2 = new Range(Double.NaN, Double.NaN);
    	
    	
    	
        assertNull("The Constrian value -7.0 is -5.0 ",
         Range.combineIgnoringNaN(Range1,Range2));
        

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
    
    // new test for a++ mutant
    @Test
    public void testExpandSingleValueRange() {

        Range range = new Range(5, 5);


        Range expandedRange = Range.expand(range, 0.1, 0.1);


        assertEquals(range, expandedRange);
    }
    
    // new test for for a-- mutant
    
    @Test
    public void testExpandWithZeroMargins() {
       
        Range range = new Range(5, 10);

   
        Range expandedRange = Range.expand(range, 0, 0);


        assertEquals(range, expandedRange);
    }
    
    
    // test shift
    
    @Test
    public void TestShift() {
    	
    	Range Range1 = new Range(3.0, 7.0);
    	
    	Range RangeAnswer = new Range(5.0, 9.0);
    	
    	assertEquals("The Constrian value -7.0 is -5.0 ",
    	        RangeAnswer, Range.shift(Range1,2.0));
    	
    }
// new test a++
    @Test
    public void testShiftWithPositiveDelta() {
  
        Range Range1 = new Range(5, 10);

        
        Range shiftedRange = Range.shift(Range1, 2);

        
        assertEquals(7.0, shiftedRange.getLowerBound(), 0.0001);
        assertEquals(12.0, shiftedRange.getUpperBound(), 0.0001);
    }
    
   // new test a--
    @Test
    public void testExpandWithZeroMargin() {
        
        Range base = new Range(5, 10);

        
        Range expandedRange = Range.expand(base, 0, 0);

 
        assertEquals(base.getLowerBound(), expandedRange.getLowerBound(), 0.0001);
        assertEquals(base.getUpperBound(), expandedRange.getUpperBound(), 0.0001);
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
    public void testShiftWithIncrementedDelta() {
        Range range = new Range(0, 10);
        double delta = 2;
        Range expectedRange = new Range(2, 12); // expected result without mutation
        Range actualRange = Range.shift(range, delta);

        assertEquals(expectedRange, actualRange);

        // test with allowZeroCrossing = true
        Range expectedRange2 = new Range(3, 13); // expected result with mutation
        Range actualRange2 = Range.shift(range, delta, true);

        assertNotEquals(expectedRange2, actualRange2);
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
    public void testIntersects3(){
    	
    	
    	assertEquals(" Does -10.0 to -6.0 intersect for (-5.0, 10.0) is: ", false, exampleRange3.intersects(-10.0, -6.0));
    	
    }
    
    
    @Test
    public void testIntersects4(){
    	
    	assertEquals(" Does 11.0 to 13.0 intersect for (-5.0, 10.0) is: ", false, exampleRange3.intersects(11.0, 13.0));
    	
    }
    
    // killed mutant to solve a++ on lower
    
    @Test
    public void testIntersectsToKillIncrement(){
    	Range Range1 = new Range(5,10);
    	
    	assertEquals(" Does 11.0 to 13.0 intersect for (5.0, 10.0) is: ", true, Range1.intersects(9.0, 12.0));
    	
    }
    
    
// killed mutant to solve a-- on lower
    
    @Test
    public void testIntersectsToKillDecrement(){
    	Range Range1 = new Range(5,10);
    	
    	assertEquals(" Does 11.0 to 13.0 intersect for (5.0, 10.0) is: ", false, Range1.intersects(10.0, 12.0));
    	
    }
    
    
// killed mutant to solve negated lower field 
    
    @Test
    public void testIntersectsToKillNegetedFieldLower(){
    	Range Range1 = new Range(5,10);
    	
    	assertEquals(" Does 11.0 to 13.0 intersect for (5.0, 10.0) is: ", false, Range1.intersects(-3.0, -1.0));
    	
    }
    
// killed mutant to solve local variable 1 (a++) 
    
    @Test
    public void testIntersectsToKillNegetedFieldLowerBoundAdd(){
    	Range Range1 = new Range(5,10);
    	
    	assertEquals(" Does 11.0 to 13.0 intersect for (5.0, 10.0) is: ", false, Range1.intersects(0, 5));
    	
    }
    
// killed mutant to solve local variable 1 (a--) 
    
    @Test
    public void testIntersectsToKillNegetedFieldLowerBoundSub(){
    	Range Range1 = new Range(5,10);
    	
    	assertEquals(" Does 11.0 to 13.0 intersect for (5.0, 10.0) is: ", true, Range1.intersects(0, 6));
    	
    }
    
    
    
    
    
    
    
@Test
    
    public void testScale1(){
    	
    	Range scaledRange = Range.scale(exampleRange3, 3);
    	Range expectedRange = new Range(-15.0, 30.0);
    	
    	assertEquals(" Scaling (-5.0, 10.0) by 3: ", expectedRange, scaledRange);
    	
    }

// new test for a++
@Test
	public void testScaleIncrement() {
    	Range base = new Range(0, 10);
    	double factor = 2;

	    Range scaledRange = Range.scale(base, factor);
	    assertEquals(0, scaledRange.getLowerBound(), 0.0001);
	    assertEquals(20, scaledRange.getUpperBound(), 0.0001);

}


//@Test
//	public void testScaleDecrement() {
//	double factor = 1;
//	Range base = new Range(0, 10);
//    try {
//        Range.scale(base, factor);
//        fail("Expected IllegalArgumentException was not thrown.");
//    } catch (IllegalArgumentException e) {
//        // Expected exception thrown
//    }
//
//    // Test with modified base range
//    base = new Range(-5, 5);
//    Range scaledRange = Range.scale(base, factor);
//    assertEquals(-10, scaledRange.getLowerBound(), 0.0001);
//    assertEquals(10, scaledRange.getUpperBound(), 0.0001);
//}

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





@Test
public void testequalsToKillMutant(){
	int temp1 = 8;
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
