package Product.model;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;

public class ProductDao {
    private Connection conn;

    private static ProductDao productDao = new ProductDao();

    private ProductDao(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root", "1234");
            System.out.println("[ BoardDB Connection OK ]");
        }catch ( ClassNotFoundException e ){
            e.getMessage(); System.out.println("[ BoardDB Connection fail ]");
            // 실패이유 : 1. 프로젝트내 JDBC 라이브러리 등록 2. 오타(클래스경로,DB서버경로) 체크 3. MYSQL 워크벤치에서 DB 존재 체크
        }catch( SQLException e ){
            e.getMessage(); System.out.println("[ BoardDB Connection fail ]");
        }
    }

    public static ProductDao getInstance(){ return productDao;}

    public boolean addProduct(ProductDto productDto){
        try {
            String sql = "insert into product( name, price ) values ( ?, ? )";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,productDto.getName());
            ps.setInt(2,productDto.getPrice());
            ps.executeUpdate();
            return true;
        }catch (SQLException e){
            e.getMessage();
        }
        return false;
    }

    public ArrayList<ProductDto> printProduct(){

        ArrayList<ProductDto> list = new ArrayList<>();
        try{
            String sql = "select * from product";
            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int num = rs.getInt("num");
                String name = rs.getString("name");
                int price = rs.getInt("price");

                ProductDto productDto = new ProductDto(num,name,price);

                list.add(productDto);

            }
        }catch(SQLException e){
            e.getMessage();
        }
        return list;
    }

    public boolean deleteProduct(int deleteNum){

        try{
            String sql = "delete from product where num = ?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1,deleteNum);

            int result = ps.executeUpdate();

            if(result == 1){
                return true;
            }
        }catch (SQLException e){
            e.getMessage();
        }
        return false;
    }

    public boolean updateProduct(int updateNum,String updateName,int updatePrice){
        try {
            String sql = "update product set name = ?, price =? where num = ?";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1,updateName);
            ps.setInt(2,updatePrice);
            ps.setInt(3,updateNum);

            int result = ps.executeUpdate();

            if(result == 1){
                return true;
            }
        }catch (SQLException e){
            e.getMessage();
        }



        return false;
    }













    // c.end
}
