import java.util.*;

class Student { }
class Rockstar { }
class Hacker { }


/**
 * NOTE:
 *
 * To pass the submission test for this problem, we need just to fill the code
 * inside the 3 if of the method InstanceOFTutorial.count(ArrayList mylist).
 * However, the code provided presents some warnings due to the use of unchecked
 * or unsafe operations. The following code shows the correct implementation
 * without the warnings.
 *
 */
public class InstanceOFTutorial {
   
    static String count(ArrayList<Object> mylist) {
	int a = 0,b = 0,c = 0;
      
	for(int i = 0; i < mylist.size(); i++){
	    Object element = mylist.get(i);
	 
	    if(element instanceof Student)
		a++;
	    if(element instanceof Rockstar)
		b++;
	    if(element instanceof Hacker)
		c++;
	}
      
	String ret = Integer.toString(a) + " " + Integer.toString(b) + " " + Integer.toString(c);
      
	return ret;
    }

    public static void main(String []args) {
	ArrayList<Object> mylist = new ArrayList<Object>();
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
      
	for(int i = 0; i < t; i++) {
	    String s = sc.next();
	 
	    if(s.equals("Student")) mylist.add(new Student());
	    if(s.equals("Rockstar")) mylist.add(new Rockstar());
	    if(s.equals("Hacker")) mylist.add(new Hacker());
	}
      
	System.out.println(count(mylist));
	sc.close();
    }
}
