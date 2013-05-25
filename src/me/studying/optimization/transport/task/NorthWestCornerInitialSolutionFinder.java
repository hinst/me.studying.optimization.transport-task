package me.studying.optimization.transport.task;

public class NorthWestCornerInitialSolutionFinder 
{
	
	double[] demand;
	double[] supply;
	int width, height;
	
	public NorthWestCornerInitialSolutionFinder(double[] demand, double[] supply) 
	{
		this.demand = demand;
		this.supply = supply;
		width = demand.length; 
		height = supply.length;
	}
	
	double[][] result;
	
	public void run() {
		double[] supply = this.supply.clone();
		double[] demand = this.demand.clone();
		result = new double[width][height];
		int x = 0;
		int y = 0;
		while (x < width && y < height) 
		{
			if (demand[x] < supply[y]) 
			{
				result[x][y] = demand[x];
				supply[y] -= demand[x];
				demand[x] = 0;
				++x;
			} 
			else 
			{
				result[x][y] = supply[y];
				demand[x] -= supply[y];
				supply[y] = 0;
				++y;
			}
		}
	}
	
	public double[][] getResult()
	{
		return result;
	}

}
