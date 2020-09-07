package org.sharma;

import org.sharma.blog.Java;

public class Main {

	public static void main(String[] args) {
		/*
		 * So here we are going to under the concept of packages.
		 * packages in java are nothing but the directories in windows or linux. They just simply helps us to organise our classes and interfaces
		 * so that there shouldn't be any name confilists and we can have multiple classes with same names but under different packages
		 * 
		 * Now if you notice this class Main which we are working with right now, is present inside a package org and subpackage sharma
		 * if we go to this package location in our system, we will see some sekeleton files and a folder named as src and inside this src folder
		 * there is package org and inside this package there is dub package called as sharma and inside our subpackage will be our Main.java class
		 * 
		 * Now as we have understnad the main role of packages in our java applications is to organise the classes in a proper manner.
		 * we will do one example where we are going to have classes with same name but under different package and we will see that there is no
		 * conflicts and we would be able to handle them easily.
		 */
		
		/*
		 * Now there are below mentioned packages:
		 * 1) org.sharma ==> this is a package and sub package where our Main class is present 
		 * 2) org.sharma.blog ==> where all the blog post on the website will go
		 * 3) org.sharma.platform ==> where all the platform related stuff will go
		 * 
		 * check out the paths of these packages in windows explorer and they will appear same as that of folders inside folders.
		 * 
		 * now there will be a class named as Java inside package org.sharma.blog, which will have method named as useFor() 
		 * similarly there will be another class with the same name Java under package org.sharma.platform and the class will have method will
		 * again a same name useFor()
		 * check out the classes inside both the packages for better understanding.
		 * 
		 * Now once this is done and we try to create the object of class Java to access its method useFor(), there will be an ambiguity as there 
		 * two classes with same name.
		 * so to resolve this ambiguity, we will need packages .
		 * so based on what package we import, we can call the class inside that package only and hence the ambiguity will be resolved
		 * check out at the top of this Main class where you will find "import org.sharma.blog.Java;"  packages imported and we can use 
		 * the Java class corresponding to that class
		 */
		
		Java obj1 = new Java();
		obj1.useFor();
		
		// So above object call to method will go to blog package.
		
		/*
		 * Now suppose we want to make use of the Java class inside other package as well in our present main class. for that also we will
		 * have to import the java class and this time import statement will work with the .* after package name for all the classes inside the 
		 * package org.sharma.platform:
		 *  import org.sharma.platform.*;
		 * Notice that if would have written Java instead of .* in this import statement then Java would start complaining about the conflict
		 * so this could be handled with the help of .* inplace of class name.
		 * now other thing is how to use the Java class inside the platform package because already a class named Java is instantiated inside our
		 * Main class above from blog package.
		 * so over come this thing we are going to use the absolute path to the class as below
		 */
		
		org.sharma.platform.Java obj2 = new org.sharma.platform.Java();
		// now lets access the method inside the Java class from platform package
		
		obj2.useFor();
		// Now since we are giving the absolute package path inside the Main class only so we need not to have an import statement at the top of
		// class, we can get rid of it.

	}

}
