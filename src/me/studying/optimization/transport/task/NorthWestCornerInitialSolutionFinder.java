package me.studying.optimization.transport.task;

public class NorthWestCornerInitialSolutionFinder {
	
	int[] supply;
	int[] demand;
	int[][] costs;
	int width, height;
	
	public NorthWestCornerInitialSolutionFinder(int[] supply, int[] demand, int[][] costs) {
		this.supply = supply;
		this.demand = demand;
		this.costs = costs;
		width = supply.length;
		height = demand.length; 
	}
	
	int[] results;
	
	public void run() {
		int x = 0;
		int y = 0;
		while (x < width && y < height) {
			if (demand[y] < supply[x]) {
				
			}
		}
	}

}
