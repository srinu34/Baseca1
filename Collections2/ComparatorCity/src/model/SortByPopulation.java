package model;

import java.util.Comparator;

public class SortByPopulation  implements Comparable<City>{

	@Override
	public int compareTo(City population) {
		return this.population > City.population ? 1 : this.age < City.population ? -1 : 0;
	}
	

}
