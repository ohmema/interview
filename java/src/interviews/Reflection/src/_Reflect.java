    import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Type;  
    import java.lang.reflect.Field;  
    import java.lang.reflect.ParameterizedType;  
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;  
       
    public class _Reflect {  

       
        public static void main(String[] args) throws Exception { 

        	
        	/*	URLClassLoader classLoader = URLClassLoader.newInstance(
        			new URL[]{"http://example.com/javaClasses.jar"});

        	Unlike other dynamic class loading techniques this can be used even without security permission provided the classes come from the same web domain as the caller.

        	Once a ClassLoader instance is obtained a class can be loaded via the loadClass method. For example to load the class com.example.MyClass one would:

        		Class<?> clazz = classLoader.load("com.example.MyClass");
        	 */

             
        	File file = new File("/Users/changpil/Documents/J2EE/RandomNumber/bin/RandomGen/Randomgen.jar");
         
            URL[] urls = null;
            try {
                URL url = file.toURI().toURL();
                urls = new URL[] { url };
            } catch (MalformedURLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
            URLClassLoader classLoader = URLClassLoader.newInstance(urls);
            Class c = classLoader.loadClass("RandomGen.ReadFile"); 
            Method method = c.getMethod("storeData", null);
          
            
            Object instance = c.newInstance();
            //Class<?>[] classes = null; If you have parameters.
             method.invoke(instance, null);
            //When You invoke storeData... the file' relative path is different So file should follow the absolute path.
            
            
            for(Field f: c.getDeclaredFields()) {
                System.out.println("Field name: " + f.getName());
        }
            for(Method f: c.getDeclaredMethods()) {
                System.out.println("Method name: " + f.getName());
        }
            
           
        } 
           
    }  