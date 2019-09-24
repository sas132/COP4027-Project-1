
public class Vehicle {
	private String make;
	private String size;
	private Double weight;
	private Double engineSize;
	private Boolean imported; //gave error when named "import"
	
	public Vehicle()
	{
		make = "NONE";
		size = "NONE";
		weight = -1.0;
		engineSize = -1.0;
		imported = false;
	}
	
	public Vehicle(String newMake, String newSize, Double newWeight, Double newEngine, Boolean newImport)
	{
		make = newMake;
		size = newSize;
		weight = newWeight;
		engineSize = newEngine;
		imported = newImport;
	}
	
	public void setMake(String newMake)
	{
		make = newMake;
	}
	
	public void setSize(String newSize)
	{
		size = newSize;
	}
	
	public void setWeight(Double newWeight)
	{
		if(positiveValue(newWeight))
		{
			weight = newWeight;
		}
	}
	
	public void setEngine(Double newEngine)
	{
		if(positiveValue(newEngine))
		{
			weight = newEngine;
		}
		engineSize = newEngine;
	}
	
	public void setImport(Boolean newImport)
	{
		imported = newImport;
	}
	
	public String getMake()
	{
		return make;
	}
	
	public String getSize()
	{
		return size;
	}
	
	public Double getWeight()
	{
		return weight;
	}
	
	public Double getEngine()
	{
		return engineSize;
	}
	
	public Boolean getImport()
	{
		return imported;
	}
	
	private Boolean positiveValue(Double value)
	{
		if(value >= 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
