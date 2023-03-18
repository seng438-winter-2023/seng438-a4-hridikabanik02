////Group 16
////Team Members: Hridika, Syed, Radia, MD
//
//package org.jfree.data;
//
//import static org.junit.Assert.*;
//
//import java.security.InvalidParameterException;
//import java.util.Arrays;
//
//import org.jfree.chart.util.ParamChecks;
//import org.jfree.data.DataUtilities;
//import org.jfree.data.DefaultKeyedValues;
//import org.jfree.data.KeyedValues;
//import org.jfree.data.Values2D;
//import org.jfree.data.category.DefaultCategoryDataset;
//import org.jmock.Expectations;
//import org.jmock.Mockery;
//import org.junit.*;
//
//public class DataUtilitiesTestA3{
//
//
//	@Before
//	public void setUp() throws Exception{
//		
//		
//	}
//
//	
//	
//	
//	
//	//Test for Calculating Column Total Correct Total
//	@Test
//	public void test1CalculateColumnTotal(){
//		Mockery mockingContext = new Mockery();
//	    final Values2D values = mockingContext.mock(Values2D.class);
//	    
//	    mockingContext.checking(new Expectations() {
//	        {
//	            one(values).getRowCount();
//	            will(returnValue(2));
//	            one(values).getValue(0, 0);
//	            will(returnValue(7.5));
//	            one(values).getValue(1, 0);
//	            will(returnValue(2.5));
//	        }
//	    });
//	    double result = DataUtilities.calculateColumnTotal(values, 0);
//	    assertEquals(10.0, result, .000000001d);
//	}
//	
//	//Test for Calculating column total for negative and positive returnValue of 'getValue'
//	
//	@Test
//	public void test2CalculateColumnTotalNegPos(){
//		Mockery mockingContext = new Mockery();
//	    final Values2D values = mockingContext.mock(Values2D.class);
//	    
//	    mockingContext.checking(new Expectations() {
//	        {
//	            one(values).getRowCount();
//	            will(returnValue(2));
//	            one(values).getValue(0, 0);
//	            will(returnValue(-7.5));
//	            one(values).getValue(1, 0);
//	            will(returnValue(2.5));
//	        }
//	    });
//	    double result = DataUtilities.calculateColumnTotal(values, 0);
//	    assertEquals(-5.0, result, .000000001d);
//	}
//	
//	//Test for Calculating column total for two negative returnValue of 'getValue'
//	
//	@Test
//	public void test3CalculateColumnTotalTwoNeg(){
//		Mockery mockingContext = new Mockery();
//	    final Values2D values = mockingContext.mock(Values2D.class);
//	    
//	    mockingContext.checking(new Expectations() {
//	        {
//	            one(values).getRowCount();
//	            will(returnValue(2));
//	            one(values).getValue(0, 0);
//	            will(returnValue(-7.5));
//	            one(values).getValue(1, 0);
//	            will(returnValue(-2.5));
//	        }
//	    });
//	    double result = DataUtilities.calculateColumnTotal(values, 0);
//	    assertEquals(-10.0, result, .000000001d);
//	}
//	
//	//Test for Calculating column total for zero rows
//	
//		@Test
//		public void test4CalculateColumnTotalZeroRows(){
//			Mockery mockingContext = new Mockery();
//		    final Values2D values = mockingContext.mock(Values2D.class);
//		    
//		    mockingContext.checking(new Expectations() {
//		        {
//		            one(values).getRowCount();
//		            will(returnValue(0));
//		            one(values).getValue(0, 0);
//		            will(returnValue(7.5));
//		            one(values).getValue(1, 0);
//		            will(returnValue(2.5));
//		        }
//		    });
//		    double result = DataUtilities.calculateColumnTotal(values, 0);
//		    assertEquals(0, result, .000000001d);
//		}
//		//Test for Calculating column total for invalid rows
//		
//			@Test
//			public void test5CalculateColumnTotalNegativeRow(){
//				final Values2D values = new DefaultCategoryDataset();
//			    
//			    Comparable<Integer> thing0 = 0;
//				Comparable<Integer> thing1 = 1;
//				//Comparable<Integer> thing2 = 2;
//			    ((DefaultCategoryDataset) values).addValue(1.0,thing0,thing0);
//			    ((DefaultCategoryDataset) values).addValue(1.0,thing0,thing1);
//			    ((DefaultCategoryDataset) values).addValue(1.0,thing1,thing0);
//			    ((DefaultCategoryDataset) values).addValue(1.0,thing1,thing1);
//			    
//			    double result = DataUtilities.calculateColumnTotal(values, 0);
//			    assertEquals(2, result, .000000001d);
//			}
//		
//			
//			
//	
//			
//	//Test for calculating Total Row Values		
//	@Test
//	public void test1CalculateRowTotal(){
//		Mockery mockingContext = new Mockery();
//	    final Values2D values = mockingContext.mock(Values2D.class);
//	    
//	    mockingContext.checking(new Expectations() {
//	        {
//	            one(values).getColumnCount();
//	            will(returnValue(2));
//	            one(values).getValue(0, 0);
//	            will(returnValue(7.5));
//	            one(values).getValue(0, 1);
//	            will(returnValue(2.5));
//	        }
//	    });
//	    double result = DataUtilities.calculateRowTotal(values, 0);
//	    assertEquals(10.0, result, .000000001d);
//	}
//	
//	//Test for Calculating negative and positive value of returnValue of getValue
//	
//	@Test
//	public void test2CalculateRowTotalNegPosValue(){
//		Mockery mockingContext = new Mockery();
//	    final Values2D values = mockingContext.mock(Values2D.class);
//	    
//	    mockingContext.checking(new Expectations() {
//	        {
//	            one(values).getColumnCount();
//	            will(returnValue(2));
//	            one(values).getValue(0, 0);
//	            will(returnValue(-7.5));
//	            one(values).getValue(0, 1);
//	            will(returnValue(2.5));
//	        }
//	    });
//	    double result = DataUtilities.calculateRowTotal(values, 0);
//	    assertEquals(-5.0, result, .000000001d);
//	}
//	
//	//Test for Calculating two negative values of returnValue of getValue
//	
//		@Test
//		public void test3CalculateRowTotalTwoNegValue(){
//			Mockery mockingContext = new Mockery();
//		    final Values2D values = mockingContext.mock(Values2D.class);
//		    
//		    mockingContext.checking(new Expectations() {
//		        {
//		            one(values).getColumnCount();
//		            will(returnValue(2));
//		            one(values).getValue(0, 0);
//		            will(returnValue(-7.5));
//		            one(values).getValue(0, 1);
//		            will(returnValue(-2.5));
//		        }
//		    });
//		    double result = DataUtilities.calculateRowTotal(values, 0);
//		    assertEquals(-10.0, result, .000000001d);
//		}
//		//Test for Calculating Row Total of zero columns
//		
//		@Test
//		public void test4CalculateRowTotalZeroCol(){
//			Mockery mockingContext = new Mockery();
//		    final Values2D values = mockingContext.mock(Values2D.class);
//		    
//		    mockingContext.checking(new Expectations() {
//		        {
//		            one(values).getColumnCount();
//		            will(returnValue(0));
//		            one(values).getValue(0, 0);
//		            will(returnValue(7.5));
//		            one(values).getValue(0, 1);
//		            will(returnValue(2.5));
//		        }
//		    });
//		    double result = DataUtilities.calculateRowTotal(values, 0);
//		    assertEquals(0, result, .000000001d);
//		}
//		//Test for Calculating negative value of Column
//		
//		@Test
//		public void test5CalculateRowTotalNegCol(){
//			
//            final Values2D values = new DefaultCategoryDataset();
//		    
//		    Comparable<Integer> thing0 = 0;
//			Comparable<Integer> thing1 = 1;
//			//Comparable<Integer> thing2 = 2;
//		    ((DefaultCategoryDataset) values).addValue(1.0,thing0,thing0);
//		    ((DefaultCategoryDataset) values).addValue(1.0,thing0,thing1);
//		    ((DefaultCategoryDataset) values).addValue(1.0,thing1,thing0);
//		    ((DefaultCategoryDataset) values).addValue(1.0,thing1,thing1);
//			
//		    
////		    //mockingContext.checking(new Expectations() {
////		        //{
////		            values.getColumnCount();
////		            will(returnValue(-1));
////		            one(values).getValue(0, 0);
////		            will(returnValue(-7.5));
////		            one(values).getValue(0, 1);
////		            will(returnValue(2.5));
////		        //}
////		    //});
//		    double result = DataUtilities.calculateRowTotal(values, 0);
//		    assertEquals(2, result, .000000001d);
//		}
//	
//	
//	
//		
//		
//	//Test for changing an Array of double data type to number data type
//	@Test
//	public void Test1CreateNumberArray() {
//		double[] data = {1.0,2.0,3.0};
//		Number[] Intdata = {1.0,2.0,3.0};
//		
//		assertArrayEquals("The Double array to Number array",
//		    	  Intdata, DataUtilities.createNumberArray(data));	
//	}
//	
//	
//	//Test for changing an Array of one element to Number data type
//		@Test
//		public void Test2CreateNumberArrayOneElement() {
//			double[] data = {1.0};
//			Number[] Intdata = {1.0};
//			
//			assertArrayEquals("The Double array to Number array",
//			    	  Intdata, DataUtilities.createNumberArray(data));	
//		}
//	//Test for changing an Array with Negative elements to number data type
//		@Test
//		public void Test3CreateNumberArrayNegValues() {
//			double[] data = {-1.0,-2.0,-3.0};
//			Number[] Intdata = {-1.0,-2.0,-3.0};
//			
//			assertArrayEquals("The Double array to Number array",
//			    	  Intdata, DataUtilities.createNumberArray(data));	
//		}
//		
//
//		
//		
//		
//	//Test for changing a 2D Array of double data type to a 2D array of number data type
//	@Test
//	public void TestCreateNumberArray2D() {
//		double[][] data = {{1.0,2.0,3.0},{4.0,5.0,6.0}};
//		Number[][] Intdata = {{1.0,2.0,3.0},{4.0,5.0,6.0}};
//		
//		assertArrayEquals("The Double array to Number array",
//		    	  Intdata, DataUtilities.createNumberArray2D(data));	    	    
//		
//	}
//	
//	//Test for changing a 2D Array of one element to Number Array
//		@Test
//		public void Test2CreateNumberArray2DOneELement() {
//			double[][] data = {{1.0},{4.0}};
//			Number[][] Intdata = {{1.0},{4.0}};
//			
//			assertArrayEquals("The Double array to Number array",
//			    	  Intdata, DataUtilities.createNumberArray2D(data));	    	    
//			
//		}
//	//Test for changing a 2D Array of Negative elements to Number Array
//			@Test
//			public void Test3CreateNumberArray2DNegELement() {
//				double[][] data = {{-1.0,-2.0,-3.0},{-4.0,-5.0,-6.0}};
//				Number[][] Intdata = {{-1.0,-2.0,-3.0},{-4.0,-5.0,-6.0}};
//					
//				assertArrayEquals("The Double array to Number array",
//					   Intdata, DataUtilities.createNumberArray2D(data));	    	    
//					
//				}
//	
//			
//	
//			
//			
//			@Test
//			public void TestgetCumulativePercentages() {
//				
//				
//				
//				
//				Mockery mockCP = new Mockery();
//				
//				 final KeyedValues values = mockCP.mock(KeyedValues.class);
//				
//				mockCP.checking(new Expectations() {
//			        {
//			        	allowing(values).getItemCount();
//						will(returnValue(3));
//						
//						allowing(values).getValue(0);
//						will(returnValue(5));
//						allowing(values).getValue(1);
//						will(returnValue(9));
//						allowing(values).getValue(2);
//						will(returnValue(2));
//
//						allowing(values).getKey(0);
//						will(returnValue(1));
//						allowing(values).getKey(1);
//						will(returnValue(2));
//						allowing(values).getKey(2);
//						will(returnValue(3));
//						
//			        }
//			    });
//				
//				
//				
//				
//				KeyedValues result = DataUtilities.getCumulativePercentages(values);
//				 assertEquals("The value for index 0 ", 0.135, result.getValue(0));
//				 assertEquals("The value for index 1",0.875, result.getValue(1));
//				 assertEquals("The value for index 2",1, result.getValue(2));
//				
//				
//			}
//			
//		@Test
//		public void TestgetCumulativePercentages_withNegativeValue() {
//				
//				
//				
//				
//				Mockery mockCP = new Mockery();
//				
//				 final KeyedValues values = mockCP.mock(KeyedValues.class);
//				
//				mockCP.checking(new Expectations() {
//			        {
//			        	allowing(values).getItemCount();
//						will(returnValue(3));
//						
//						allowing(values).getValue(0);
//						will(returnValue(5));
//						allowing(values).getValue(1);
//						will(returnValue(-9));
//						allowing(values).getValue(2);
//						will(returnValue(2));
//
//						allowing(values).getKey(0);
//						will(returnValue(1));
//						allowing(values).getKey(1);
//						will(returnValue(2));
//						allowing(values).getKey(2);
//						will(returnValue(3));
//						
//			        }
//			    });
//				
//				
//				
//				
//				KeyedValues result = DataUtilities.getCumulativePercentages(values);
//				 assertEquals("The value for index 0", -2.5, result.getValue(0));
//				 assertEquals("The value for index 1",2, result.getValue(1));
//				 assertEquals("The value for index 2",1, result.getValue(2));
//				
//				
//			}
//
//
//		@Test
//		public void TestgetCumulativePercentages_final_is_one() {
//				
//				
//				
//				
//				Mockery mockCP = new Mockery();
//				
//				 final KeyedValues values = mockCP.mock(KeyedValues.class);
//				
//				mockCP.checking(new Expectations() {
//			        {
//			        	allowing(values).getItemCount();
//						will(returnValue(3));
//						
//						allowing(values).getValue(0);
//						will(returnValue(5));
//						allowing(values).getValue(1);
//						will(returnValue(9));
//						allowing(values).getValue(2);
//						will(returnValue(2));
//
//						allowing(values).getKey(0);
//						will(returnValue(1));
//						allowing(values).getKey(1);
//						will(returnValue(2));
//						allowing(values).getKey(2);
//						will(returnValue(3));
//						
//			        }
//			    });
//				
//				
//				
//				
//				KeyedValues result = DataUtilities.getCumulativePercentages(values);;
//				 assertEquals("The value for index 2",1, result.getValue(2));
//				
//				
//			}
//			
//			
//
//		
//		
////Exceptions
//				
////			//Exception test for null array 1D (Doesn't work for Invalid Parameter)
////			@Test(expected = InvalidParameterException.class)
////			public void testCreateNumberArray1DNullNW(){
////				double[] input = null;
////				DataUtilities.createNumberArray(input);
////			}
//			
//			
//			//Exception test for null array 1D
//			@Test(expected = IllegalArgumentException.class)
//			public void testCreateNumberArray1DNull(){
//				double[] input = null;
//				DataUtilities.createNumberArray(input);
//			}
//			
//			//Exception test for null array 2D
//			@Test(expected = IllegalArgumentException.class)
//			public void testCreateNumberArray2DNull(){
//				double[][] input = null;
//				DataUtilities.createNumberArray2D(input);
//			}
//			
//			//Exception test for null array for Values2D object, Column Total
////			@Test(expected = NullPointerException.class)
////			public void testCalculateColumnTotalNull(){
////			    final Values2D values = null;
////			    int num = 2;
////			    
////			    DataUtilities.calculateColumnTotal(values, num);
////			}
////			
////			//Exception test for null array for Values2D object, Row Total 
////			@Test(expected = NullPointerException.class)
////			public void testCalculateRowTotalNull(){
////			    final Values2D values = null;
////			    int num = 2;
////			    
////			    DataUtilities.calculateRowTotal(values, num);
////			}
//			
//			//Exception for Cumulative Percentages
//			@Test(expected = IllegalArgumentException.class)
//			public void TestgetCumulativePercentages_throwing_Exception(){
//				Mockery mockCP = new Mockery();
//				
//				 final KeyedValues values = mockCP.mock(KeyedValues.class);
//				
//				mockCP.checking(new Expectations() {
//			       {
//			       	allowing(values).getItemCount();
//						will(returnValue(3));
//						
//						allowing(values).getValue(0);
//						will(returnValue(null));
//						allowing(values).getValue(1);
//						will(returnValue(null));
//						allowing(values).getValue(2);
//						will(returnValue(null));
//
//						allowing(values).getKey(0);
//						will(returnValue(null));
//						allowing(values).getKey(1);
//						will(returnValue(null));
//						allowing(values).getKey(2);
//						will(returnValue(null));
//						
//			       }
//			   });
//				
//				
//				
//				
//				KeyedValues result = DataUtilities.getCumulativePercentages(values);;
//				
//				
//			}
//			
//
// //Test for Equals
//@Test	
//public void TestEqual() {
//
//// 
//	
//	double[][] a = {{1,2},{3,4}};
//	double[][] b = {{1,2},{3,4}};
//	
//	assertTrue(DataUtilities.equal(a, b));
//	
//}
//// False of Equals -- Start--
//@Test
//public void TestEqual_WITHNULL_A() {
//	double[][] a = null;
//	double[][] b = {{1,2},{3,4}};
//	
//	assertFalse(DataUtilities.equal(a, b));
//	
//}
//@Test
//public void TestEqual_WITHNULL_A_BIsNull() {
//	double[][] a = null;
//	double[][] b = null;
//	
//	assertTrue(DataUtilities.equal(a, b));
//	
//}
//@Test
//public void TestEqual_WITHNULL_B() {
//	double[][] a = {{1,2},{3,4}};
//	double[][] b = null;
//	
//	assertFalse(DataUtilities.equal(a, b));
//	
//}
//@Test
//public void TestEqual_DifferentLenght() {
//	double[][] a = {{1,2},{3,4}};
//	double[][] b = {{1,2}};
//	
//	assertFalse(DataUtilities.equal(a, b));
//	
//}
//@Test
//public void TestEqual_SameLenght_DifferntContent() {
//	double[][] a = {{1,2},{3,4}};
//	double[][] b = {{1,2}, {3,5}};
//	
//	assertFalse(DataUtilities.equal(a, b));
//	
//}
//
////False of Equals --END--
//
//
////END Test for Equals
//
//
//
////Test for Clone
//@Test
//public void Testclone() {
//
////}
//	double[][] a = {{1,2},{3,4}};
//	double[][] result = DataUtilities.clone(a);
//	
//
//	assertArrayEquals("The Clone worked ",a,result);
//	
//
//}
//
//
//
////END Test for Clone
//
//
//// Test for calculateColumnTotal(Values2D data, int row, int[]validCol)
//	 
////{{7.5.7.5,7.5}, {2.5,2.5,2.5}
////THIS***
//@Test
//public void test1CalculateColumnTotal_WITHROWARRAY(){
//	Mockery mockingContext = new Mockery();
//    final Values2D values = mockingContext.mock(Values2D.class);
//    
//    mockingContext.checking(new Expectations() {
//        {
//            one(values).getRowCount();
//            will(returnValue(2));
//            one(values).getValue(0, 0);
//            will(returnValue(7.5));
//            one(values).getValue(0, 1);
//            will(returnValue(7.5));
//            one(values).getValue(0, 2);
//            will(returnValue(7.5));
//            
//            one(values).getValue(1, 0);
//            will(returnValue(7.5));
//            one(values).getValue(1, 1);
//            will(returnValue(2.5));
//            one(values).getValue(1, 2);
//            will(returnValue(2.5));
//            
//            
//    
//            
//        }
//        
//    });
//    int[] ValidRows = {1};
//    double result = DataUtilities.calculateColumnTotal(values, 1,ValidRows);
//    assertEquals(7.5, result, .000000001d);
//}
//
////@Test
////public void test2CalculateColumnTotalNegPosWITHROWARRAY(){
////	Mockery mockingContext = new Mockery();
////    final Values2D values = mockingContext.mock(Values2D.class);
////    
////    mockingContext.checking(new Expectations() {
////        {
////            one(values).getRowCount();
////            will(returnValue(2));
////            one(values).getValue(0, 0);
////            will(returnValue(-7.5));
////            one(values).getValue(1, 0);
////            will(returnValue(2.5));
////        }
////    });
////    int[] ValidRows = {1};
////    double result = DataUtilities.calculateColumnTotal(values, 0);
////    assertEquals(-5.0, result, .000000001d);
//
//
//// TEST END 
//
//// CaCalculateRowTotal(Values2D data, int row, int[]validCol)
//@Test 
//public void test1CalculateRowTotal_WITHCOLUMNARRAY(){
//	Mockery mockingContext = new Mockery();
//    final Values2D values = mockingContext.mock(Values2D.class);
//    
//    mockingContext.checking(new Expectations() {
//        {
//        	one(values).getColumnCount();
//            will(returnValue(2));
//            one(values).getValue(0, 0);
//            will(returnValue(7.5));
//            one(values).getValue(0, 1);
//            will(returnValue(7.5));
//            one(values).getValue(0, 2);
//            will(returnValue(7.5));
//            
//            one(values).getValue(1, 0);
//            will(returnValue(7.5));
//            one(values).getValue(1, 1);
//            will(returnValue(2.5));
//            one(values).getValue(1, 2);
//            will(returnValue(2.5));
//        }
//    });
//    
//    int[] ValidCOL = {0,1};
//    double result = DataUtilities.calculateRowTotal(values, 0, ValidCOL);
//    assertEquals(15, result, .000000001d);
//}
//
//@Test 
//public void test1CalculateRowTotal_WITHCOLUMNARRAY_DATA2DNULL(){
//	Mockery mockingContext = new Mockery();
//    final Values2D values = mockingContext.mock(Values2D.class);
//    
//    mockingContext.checking(new Expectations() {
//        {
//        	one(values).getColumnCount();
//            will(returnValue(0));
//      
//        }
//    });
//    
////    int[] ValidCOL = {0};
//    double result = DataUtilities.calculateRowTotal(values, 0);
//    assertEquals(0, result, .000000001d);
//}
//
//
//
//
//
//			
//	@After
//	public void tearDown() throws Exception{
//	}
//
//}
