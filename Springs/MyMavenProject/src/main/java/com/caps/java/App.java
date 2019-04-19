package com.caps.java;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Person person=new Person();
    	 person.setId(1);
    	 person.setName("nagoor");
    	
    	 
    	
    	Job job=new SoftwareDevelpoer();
    	person.setJob(job);
    	person.getJob().dojob();
    	Job job2=new SoftwareTester();
    	person.setJob(job2);
    	person.getJob().dojob();
    }
    
}
