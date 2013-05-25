package me.studying.optimization.transport.task.test;

import me.studying.optimization.transport.task.NorthWestCornerInitialSolutionFinder;

public class TestNorthWestCornerInitialSolutionFinder 
{
	
	void test(double demand[], double supply[])	
	{
		NorthWestCornerInitialSolutionFinder finder = 
			new NorthWestCornerInitialSolutionFinder(demand, supply);
		finder.run();
		double[][] result = finder.getResult();
		System.out.println(me.studying.Util.doubleMatrixToString(result));
	}
	
	void test001() 
	{
		test(
			new double[]{5, 15, 15, 15},
			new double[]{15, 25, 10}
		);
	}
	
	void run() 
	{
		test001();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		TestNorthWestCornerInitialSolutionFinder application = 
			new TestNorthWestCornerInitialSolutionFinder();
		application.run();
	}

}
