package Product.controller;

import Product.model.ProductDao;
import Product.model.ProductDto;

import java.util.ArrayList;

public class ProductController {
    private static ProductController productController = new ProductController();
    private ProductController(){}
    public static ProductController getInstance(){ return productController;}


public boolean addProduct(String name, int price){

    ProductDto productDto = new ProductDto(name,price);


        return ProductDao.getInstance().addProduct(productDto);
}

public ArrayList<ProductDto> printProduct(){


        return ProductDao.getInstance().printProduct();
}

public boolean deleteProduct(int deleteNum){

        return ProductDao.getInstance().deleteProduct(deleteNum);
}

public boolean updateProduct(int updateNum,String updateName,int updatePrice){

        return ProductDao.getInstance().updateProduct(updateNum,updateName,updatePrice);
}















    // c end
}
