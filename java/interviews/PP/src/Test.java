class Test
{
    public static void main(String args[]) 
    { 
//    	System.out.println(Test.test()); 
    	
    	Integer i =0;
    	i++;
    	
    }

    public static int test()
    {
    	try 
    	{  
    			throw new Exception("sss");
//            	return 100;  
    	}  
    	catch (Exception e)
    	{
    		System.out.println("eXCEPTION");
    		return 1; 
    	}
    	finally 
    	{  
    	    System.out.println("finally trumps return.");
//    	    return 3;
    	}
//    	return 2;
    }
}