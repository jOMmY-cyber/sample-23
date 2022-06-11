package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
class StaffService{
    String connectionString = "jbdc:mysql://localhost/vk?user=putin&password=nueclear";
    
    String driver = "com.mysql.cj.jbdc.Driver";
    
    @RequestMapping("/member")
    ArrayList member(){
        ArrayList a = new ArrayList();
        try{
            Class.forName(driver);
            
            Connection cn = DriverManager.getConnection(connectionString);
            
            String sql = "select * from staff";
            
            var ps = cn.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                String name = rs.getString("name");
                a.add(name);
            }
            
            rs.close();
            ps.close();
            cn.close();
        }catch (Exception e){
            a.add(e);
        }
        return a;
    }
}
