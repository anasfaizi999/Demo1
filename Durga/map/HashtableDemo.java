package Durga.map;
import java.util.Hashtable;

public class HashtableDemo {

        public static void main(String[] args) {
        	
        	
                
                Hashtable h = new Hashtable();//(25)
                h.put(new Temp1(5), "A");
                h.put(new Temp1(2), "B");        
                h.put(new Temp1(6), "C");
                h.put(new Temp1(15), "D");
                h.put(new Temp1(23), "E");
                h.put(new Temp1(16), "F");
                System.out.println(h);
           
                
        }
}
 class Temp1{
        int i;
        Temp1(int i)
        { 
                 this.i=i;
        }
        public int hashCode()
        {
                return i;             //i%9
        }
        public String toString()
        {
                return i+"";
        }
}
