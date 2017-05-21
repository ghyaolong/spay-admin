import java.io.File;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;


public class loadEXCEL{
 
     public static Connection con=null;
 
     public static void build(Connection conn) throws Exception{
    	 conn = getConnection();
             String filepath="F:\\data.xls";
             File excelfile = new File(filepath);
             Workbook book = null;
             CallableStatement st = null;
             int rownum;
             String title = null;
             String type = null;
             String denomination = null;
             String taskType = null;
             String searchStartTime = null;
             String searchEndTime = null;
             String searchTime = null;
             String freezeAlive = null;
             try{
                   book = Workbook.getWorkbook(excelfile);
                   Sheet sheet = book.getSheet(0);//工作簿是从0开始的
                   for(rownum=1;rownum<sheet.getRows();rownum++){
                	   title = sheet.getCell(0,rownum).getContents().trim();//参数顺序为（列，行）
                	   type = sheet.getCell(1,rownum).getContents().trim();//getContents().trim()是获取单元格内的值并去空格
                	   denomination = sheet.getCell(2,rownum).getContents().trim();
                	   taskType = sheet.getCell(3,rownum).getContents().trim();
                	   searchStartTime = sheet.getCell(4,rownum).getContents().trim();
                	   searchEndTime = sheet.getCell(5,rownum).getContents().trim();
                	   searchTime = sheet.getCell(6,rownum).getContents().trim();
                	   freezeAlive = sheet.getCell(7,rownum).getContents().trim();
                   try{
                        st = conn.prepareCall("INSERT INTO T_PAY_RETURN_TASK_POOL values (?,?,?,?,?,?,?,?)");//这里是执行插入操作，可以换成别的如UPDATE
                        st.setString(1, title);
                        st.setString(2, type);
                        st.setString(3, denomination);
                        st.setString(4, taskType);
                        st.setString(5, searchStartTime);
                        st.setString(6, searchEndTime);
                        st.setString(7, searchTime);
                        st.setString(8, freezeAlive);
                        st.execute();
                        st.close();
                        System.out.println("第"+rownum+"条记录！");
                        }catch (SQLException e) {
                                 e.printStackTrace();
                                 }
                        }
                  }finally{
                       book.close();
                       }
 }
 
 public static  Connection getConnection() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{//配置JDBC连接
      String url = "jdbc:oracle:thin:192.168.88.181:1521:orcl";
      Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
      con = DriverManager.getConnection(url, "system", "Abc123456");
      return con;
     
  }

 public static void main(String [] arg) throws Exception{
  
          Connection co = loadEXCEL.getConnection();
          co.setAutoCommit(true);
          try {
			loadEXCEL.build(co);
		} catch (JXLException e) {
			
			e.printStackTrace();
		}
          co.close();
          System.out.println("JUST OK!!!");
  
      }
}