package Application;

import java.util.Scanner;

import model_dao.DaoFactory;
import model_dao.SellerDao;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SellerDao sellerDao = DaoFactory.createSellerDao();
		 System.out.println("Enter id for delete test: ");
		 int id = sc.nextInt();
		 sellerDao.deleteById(id);
		 System.out.println("Delete completed");

	}

}
