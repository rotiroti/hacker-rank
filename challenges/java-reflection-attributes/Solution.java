import java.util.*;
import java.lang.reflect.Method;

class Student{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void anothermethod(){  }
}


public class Solution {
    public static void main(String[] args) throws Exception {
	Class student = Class.forName("Student");
	Method[] methods = student.getDeclaredMethods();
	ArrayList<String> methodList = new ArrayList<>();
	
	for (Method method : methods) {
	    methodList.add(method.getName());
	}
	
	Collections.sort(methodList);

	for (String name: methodList) {
	    System.out.println(name);
	}
    }
}
