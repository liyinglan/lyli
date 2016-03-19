package cn.tjuscs.st;

public class Triangle {
	
	public String identifyTriangle(double sideA, double sideB, double sideC){
		String result = null;
		if (sideA == sideB && sideB == sideC){
			result = "equilateral";
		}
		else if (sideA == sideB || sideA == sideC || sideC == sideB){
			result = "isosceles";
		}
		else{
			result = "scalene";
		}
		return result;
	}
}
