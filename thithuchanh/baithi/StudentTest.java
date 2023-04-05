package baithi;


import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

import java.util.Scanner;
public class StudentTest {

        public static void main(String[] args) {
            try (
                    Connection cnt = DriverManager.getConnection("jdbc:mysql://localhost:3306/thijava2","root","")
            ) {
                do{
                    ArrayList<Student> students = new ArrayList<>();
                    Scanner in = new Scanner(System.in);
                    System.out.println("1.Add student records\n2.Display student records\n3.Save\n4.Exit");
                    System.out.printf("Choose: ");
                    int chon = in.nextInt();
                    in.nextLine();
                    switch (chon){
                        case 1:
                            System.out.printf("Nhap ID: ");
                            String ID = in.nextLine();
                            System.out.printf("Nhap Ten: ");
                            String Name = in.nextLine();
                            System.out.printf("Nhap Dia Chi: ");
                            String Address = in.nextLine();
                            System.out.printf("Nhap Phone: ");
                            int Phone = in.nextInt();
                            in.nextLine();

                            String add = "insert into student values(?,?,?,?)";
                            PreparedStatement pstm = cnt.prepareStatement(add);
                            pstm.setString(1,ID);
                            pstm.setString(2,Name);
                            pstm.setString(3,Address);
                            pstm.setInt(4,Phone);
                            int checkAdd = pstm.executeUpdate();
                            if(checkAdd >= 1){
                                System.out.println("số dòng ảnh hưởng: " + checkAdd );
                                System.out.println("thêm thành công");
                            }else{
                                System.out.println("số dòng ảnh hưởng: " + checkAdd);
                                System.out.println("Thêm thất bại");
                            }
                            break;

                        case 2:
                            String select = "select * from student";
                            PreparedStatement pstm2 =  cnt.prepareStatement(select);
                            ResultSet rs = pstm2.executeQuery();
                            ResultSetMetaData rsMD = rs.getMetaData();
                            int countSelect = rsMD.getColumnCount();
                            for(int i = 1; i <= countSelect; ++i){
                                System.out.printf("%-30s", rsMD.getColumnName(i));
                            }
                            System.out.println();
                            for(int i =1; i <= countSelect; ++i){

                                System.out.printf("%-30s", "(" + rsMD.getColumnClassName(i) + ")");
                            }
                            System.out.println();

                            while (rs.next()){

                                for(int i =1; i <= countSelect; ++i){
                                    System.out.printf("%-30s", rs.getString(i));
                                }
                                System.out.println();
                            }

                            break;
                        case 3:
                            for (Student student : students) {
                                System.out.println(student.getStudentId() + "," + student.getName() + "," + student.getAddress() + "," + student.getPhone());
                            }
                            break;
                        case 4:
                            return;




                    }

                }while(true);


            }catch (SQLException a){
                throw new RuntimeException(a);
            }
        }
    }


