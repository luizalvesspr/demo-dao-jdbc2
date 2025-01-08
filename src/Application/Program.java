package Application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Model.Entities.Department;
import Model.Entities.Seller;
import model_dao.DaoFactory;
import model_dao.SellerDao;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
     SellerDao sellerDao = DaoFactory.createSellerDao();
     System.out.println("===Teste 1: Seller findById ========");
	 Seller seller = sellerDao.findById(3);
	 System.out.println(seller);
     System.out.println("===Teste 2: Seller findByDepartment ========");
     Department department = new Department(4,null);
     List<Seller> list = sellerDao.findByDepartment(department);
     for(Seller obj : list) {
    	 System.out.println(obj);
     }
     System.out.println("===Teste 3: Seller findAll ========");
     list = sellerDao.findAll();
     for(Seller obj : list) {
    	 System.out.println(obj);
     }
     System.out.println("===Teste 4: Seller  Insert========");
	 Seller newSeller = new Seller(null,"Luiz","Bruno@gmail.com", new Date(),15000,department );
	 sellerDao.insert(newSeller);
	 System.out.println("Inserted! New Id = "+ newSeller.getId());
	 System.out.println("===Teste 5: Seller  Update========");
	 seller = sellerDao.findById(1);
	 seller.setName("Bruce Wayne");
	 sellerDao.update(seller);
	 System.out.println("Update Completed");
	 System.out.println("===Teste 5: Seller  DELETE========");
	 System.out.println("Enter id for delete test: ");
	 int id = sc.nextInt();
	 sellerDao.deleteById(id);
	 System.out.println("Delete completed");
	 sc.close();
	 
	 
	 
	 
	 
	 
	 
	}
	 
}