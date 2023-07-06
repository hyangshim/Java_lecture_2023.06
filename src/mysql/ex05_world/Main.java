package mysql.ex05_world;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		cityDao cDao =new cityDao();
		
		City city =cDao.getCityById(2340);
		System.out.println(city);
		
		City citystring =cDao.getCityByNmae("성남");
		System.out.println(citystring);
		System.out.println("=========================================");
		
		List<City> list =cDao.getCityList("kor", 10);
		for (City c : list)
			System.out.println(c);
		System.out.println("=========================================");
		
		
		City city2 =new City("화성","kor","kyonggi",500000);
		cDao.insertCity(city2);
		city =cDao.getCityByNmae("화성");
		System.out.println(city);
		System.out.println("=========================================");
		
		
		city =cDao.getCityByNmae("부천");
		city.setName("부천");
		city.setPopulation(850000);
		cDao.updateCity(city);
		city =cDao.getCityByNmae("부천");
		System.out.println(city);
		System.out.println("=========================================");
		
		cDao.deleteCity(5019);
		city =cDao.getCityByNmae("화성");
		if (city == null)
			System.out.println("화성이 없습니다.");
		else {
			System.out.println(city);
		}
	}
	

}
