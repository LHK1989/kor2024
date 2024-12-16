package Product.view;

import Product.controller.ProductController;
import Product.model.ProductDto;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductView {
private static ProductView productView = new ProductView();
private ProductView(){}
public static ProductView getInstance(){ return productView;}
    Scanner scan = new Scanner(System.in);

    public void mainPage(){
        while (true){

            System.out.println(" 1. 제품추가 2. 전체 제품 출력 3. 제품 삭제 4. 제품 수정 : ");
            int choose = scan.nextInt();
            if(choose==1){
                addProduct();
            }else if(choose==2){
                printProduct();
            }else if(choose==3){
                deleteProduct();
            }else if(choose==4){
                updateProduct();
            }


        }
    }

    void addProduct(){
        System.out.println(" 등록 할 제품 명 : ");
        String name = scan.next();
        System.out.println(" 가격 : ");
        int price = scan.nextInt();

        boolean result = ProductController.getInstance().addProduct(name,price);

        if(result){
            System.out.println(" 등록 성공");
        }else{
            System.out.println(" 등록 실패");
        }
    }


    void printProduct(){
        ArrayList<ProductDto> result = ProductController.getInstance().printProduct();

        for(int i = 0; i <= result.size()-1; i++){
            System.out.printf("제품 번호 : %d 제품 명 : %s 가격 : %d \n",result.get(i).getNum(),result.get(i).getName(),result.get(i).getPrice());
        }
    }

    void deleteProduct(){
        System.out.println(" 삭제 할 번호 : ");
        int deleteNum = scan.nextInt();

        boolean result = ProductController.getInstance().deleteProduct(deleteNum);

        if(result){
            System.out.println(" 삭제 성공 ");
        }else{
            System.out.println(" 삭제 실패 ");
        }
    }

    void updateProduct(){
        System.out.println(" 수정 할 번호 : ");
        int updateNum = scan.nextInt();
        System.out.println(" 수정 할 이름 :");
        String updateName = scan.next();
        System.out.println(" 수정 할 가격 :");
        int updatePrice = scan.nextInt();

        boolean result = ProductController.getInstance().updateProduct(updateNum,updateName,updatePrice);

        if(result){
            System.out.println("수정 성공");
        }else{
            System.out.println("수정 실패");
        }
    }



















    // c end
}
