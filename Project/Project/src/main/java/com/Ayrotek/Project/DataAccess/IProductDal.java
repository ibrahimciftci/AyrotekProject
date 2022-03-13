package com.Ayrotek.Project.DataAccess;
import java.util.List;

import com.Ayrotek.Project.Entities.*;

public interface IProductDal {
	List<Product> getAll();
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	Product getById(int id);
}
