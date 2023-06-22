package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== Test 1: seller findById ===");
		Department department = departmentDao.findById(1);
		System.out.println(department);
		
		List<Department> list = new ArrayList<>();
		
		System.out.println();
		System.out.println("=== Test 2: Department findAll ===");
		list = departmentDao.findAll();
		
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println("=== Test 3: Department Insert ===");
		Department newdepartment = new Department(0, "NOVO test");
		departmentDao.insert(newdepartment);
		
		System.out.println("Inserted! New dep = " + newdepartment.getId());
		
		System.out.println();
		System.out.println("=== TEST 5: seller update =====");
		department = departmentDao.findById(4);
		department.setName("Books1");
		departmentDao.update(department);
		
		
		System.out.println();
		System.out.println("=== Test 4: Department delete =====");
		departmentDao.deleteById(10);
		
		System.out.println("Delete completed");

	}

}
