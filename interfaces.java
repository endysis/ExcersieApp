public interface Info {
	public double getWeight();
	public void setWeight();
	public double getHeight();
	public void setHeight();
	public double getTargetWeight();
	public void setTargetWeight();
	public double getCaloriesBurned();
	public void setCaloriesBurned();
}

public interface AccountI {
	public string get FName();
	public string get LName();
	public int get accNumber();
	public Info get info();
}

public interface AppI {
	public Info sendInfo();
}

public interface FoodI {
	public FoodPlan[] getDayFoodPlan();
	public void setFoodPlan();
	}

public interface DayFoodPlanI {
	public void setBreakafst(Meal b);
	public void setLunch(Meal l);
	public void setDinner(Meal d);
	public void getTotalCalories();
}

public interface MealI {
	public void setMealName(string s);
	public string getMealName();
	public void setCalories(double c);
	public void getCalories();
	public void setMealDescription(); // User Adding Meal Description Cycle 2
	public string getMealDescription();
}

public interface MeasurementsI{
	public double getWeight();
	public void setWeight(double d);
	public double getHeight();
	public void setHeight(double h);
	public double getTargetWeight();
	public void setTargetWeight(double d);
	
}

public interface PedometerI {
	public void updateFootSteps(int i);
	public int getTotalFootSteps();
	public int getTargetFootSteps();
	public void setTargetFootSteps();
}

public interface SportsI{
	public List<Activity> getActivities;
	public void setActivites();
}

public interface ActivityI(){
	public double getTitle();
	public void setTitle(string t);
	public int getNoOfDaysTrained();
	public void setNoOfDaysTrained(int d);
	public int getDuration();
	public void setDuration(int d);
}

public interface CalorieCounterI {
	public double getTotal();
	public void setTotal();
	public void setFood(); // User Adding FoodInput Cycle1
}












