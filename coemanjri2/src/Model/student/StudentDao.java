/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.student;

import Com.DBConnection;
import Com.MD5;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import javax.naming.NamingException;

import Bean.ParentBean;
import Bean.Student;
import Bean.StudentBean;


public class StudentDao {
    
	public static int addStudent(Student student) {
		
		
		int key=0;
		Connection con=null;
		try {
			con = DBConnection.createconnection();
			PreparedStatement pst=con.prepareStatement("insert into student (studentname,prnno,guardianname,dateofbirth,photo,gender,bloodgroup,religion,category,caste,email,phone,address,paddress,state,pstate,city,pcity,pincode,ppincode,academicyear,courseid,branchid,classid,semester,sectionid,rollno,dateofadmission,fathername,mothername,foccupation,moccupation,gphone,gaddress)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
			pst.setString(1, student.getStudentName());
			pst.setString(2, student.getPrnno());
			pst.setString(3, student.getGuardianName());
			pst.setDate(4, student.getDateofbirth());
			pst.setBlob(5, student.getPhoto());
			pst.setString(6, student.getGender());
			
			pst.setString(7, student.getBloodgroup());
			pst.setString(8, student.getReligion());
			pst.setString(9, student.getCategory());
			pst.setString(10, student.getCaste());
			pst.setString(11, student.getEmail());
			pst.setString(12, student.getPhone());
			pst.setString(13, student.getAddress());
			pst.setString(14, student.getPaddress());
			pst.setString(15, student.getState());
			pst.setString(16, student.getPstate());
			pst.setString(17, student.getCity());
			pst.setString(18, student.getPcity());
			pst.setString(19, student.getPincode());
			pst.setString(20, student.getPpincode());
			
			pst.setString(21, student.getAcademicyear());
			pst.setInt(22, student.getCourseId());
			pst.setInt(23, student.getBranchId());
			pst.setInt(24, student.getClassId());
			pst.setString(25, student.getSemester());
			pst.setInt(26, student.getSectionId());
			pst.setInt(27, student.getRollno());
			pst.setDate(28, student.getDateofadmission());
			pst.setString(29, student.getFatherName());
			pst.setString(30, student.getMotherName());
			pst.setString(31, student.getFoccupation());
			pst.setString(32, student.getMoccupation());
			pst.setString(33, student.getGphone());
			pst.setString(34, student.getGaddress());
			pst.executeUpdate();
			
			ResultSet rs = pst.getGeneratedKeys();
			if (rs.next()){
			    key=rs.getInt(1);
			}
			
			pst.close();
			con.close();
			return key;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			try {
				con.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		return key;
	}


    public static HashMap<String,String> getStudent(String courseid,String semester,String branchid, String classid, String sectionid) {
        
    	LinkedHashMap<String,String> studentList = new LinkedHashMap<String,String>();
    	Connection con = null;
        Statement stmt1 = null;
        ResultSet rs1 = null;
        try {
        
            con = DBConnection.createconnection();
            stmt1 = con.createStatement();
            String sql = "select studentid,studentname,rollno from student where courseid="+courseid+" and semester='"+semester+"' and branchid="+branchid+" and classid="+classid+" and sectionid="+sectionid+" order by rollno";
            rs1 = stmt1.executeQuery(sql); 
            while(rs1.next()){
              
            	studentList.put(rs1.getString("studentid"), rs1.getInt("rollno")+" - "+rs1.getString("studentname"));
              
            }
            stmt1.close();
            rs1.close();
            con.close();
            return studentList;      
        } 
        catch(Exception e)
        {
        	e.printStackTrace();
        }
        finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
        return studentList;
    
    }


	public static StudentBean getSingleStudent(int studentId) {
		
		StudentBean studentBean=new StudentBean();
		Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
        	con = DBConnection.createconnection();
            stmt = con.createStatement();
            String sql = "select * from student where studentid="+studentId+""; 
            rs = stmt.executeQuery(sql); 
            while(rs.next()){
              studentBean.setStudentid(rs.getInt(1));
              studentBean.setStudentName(rs.getString(2));
              studentBean.setPrnno(rs.getString(3));
              studentBean.setGuardianName(rs.getString(4));
              studentBean.setGender(rs.getString(5));
              studentBean.setDateofbirth(rs.getDate(6));
              studentBean.setBloodgroup(rs.getString(7));
              studentBean.setReligion(rs.getString(8));
              studentBean.setCategory(rs.getString(9));
              studentBean.setCaste(rs.getString(10));
              studentBean.setEmail(rs.getString(11));
              studentBean.setPhone(rs.getString(12));
              studentBean.setAddress(rs.getString(13));
              studentBean.setCity(rs.getString(14));
              studentBean.setState(rs.getString(15));
              studentBean.setPincode(rs.getString(16));
              studentBean.setClassId(rs.getInt(17));
              studentBean.setSectionId(rs.getInt(18));
              studentBean.setRollno(rs.getInt(19));
              studentBean.setPhotoInputStream(rs.getBinaryStream(20));
              studentBean.setDateofadmission(rs.getDate(21));
              studentBean.setAcademicyear(rs.getString(22));
              studentBean.setBranchId(rs.getInt(23));
              studentBean.setCourseId(rs.getInt(24));
              studentBean.setSemester(rs.getString(25));
              studentBean.setUsername(rs.getString(26));
              studentBean.setPassword(rs.getString(27));
            }
            stmt.close();
            rs.close();
            con.close();
            return studentBean;
               
        } 
        catch(Exception e)
        {
        	e.printStackTrace();
        }
        finally {
			
        	try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
        return studentBean;
		
		
	}
	
	public static Blob getImage(int studentId) {
		
		Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        Blob image =null;
        try {
        
            con = DBConnection.createconnection();
            stmt = con.createStatement();
            String sql = "select photo from student where studentid="+studentId;
            rs = stmt.executeQuery(sql); 
            if(rs.next()){
              
            	image = rs.getBlob(1);
              
            }
            
            stmt.close();
            rs.close();
            con.close();
            return image;  
        } 
        catch(Exception e)
        {
        	e.printStackTrace();
        }
        finally {
			
        	try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
        return image;
		
	}


	public static int updateStudent(StudentBean studentBean, String changePhoto) {
		
		int result=0;
		Connection con=null;
		PreparedStatement pst=null;
		try {
			
			con = DBConnection.createconnection();
			if(changePhoto!=null)
			{
				pst=con.prepareStatement("update student set studentname=?,prnno=?,guardianname=?,gender=?,dateofbirth=?,bloodgroup=?,religion=?,category=?,caste=?,email=?,phone=?,address=?,city=?,state=?,pincode=?,classid=?,sectionid=?,rollno=?,photo=?,dateofadmission=?,academicyear=?,branchid=?,courseid=?,semester=? where studentid=?");
				pst.setString(1, studentBean.getStudentName());
				pst.setString(2, studentBean.getPrnno());
				pst.setString(3, studentBean.getGuardianName());
				pst.setString(4, studentBean.getGender());
				pst.setDate(5, studentBean.getDateofbirth());
				pst.setString(6, studentBean.getBloodgroup());
				pst.setString(7, studentBean.getReligion());
				pst.setString(8, studentBean.getCategory());
				pst.setString(9, studentBean.getCaste());
				pst.setString(10, studentBean.getEmail());
				pst.setString(11, studentBean.getPhone());
				pst.setString(12, studentBean.getAddress());
				pst.setString(13, studentBean.getCity());
				pst.setString(14, studentBean.getState());
				pst.setString(15, studentBean.getPincode());
				pst.setInt(16, studentBean.getClassId());
				pst.setInt(17, studentBean.getSectionId());
				pst.setInt(18, studentBean.getRollno());
				pst.setBlob(19, studentBean.getPhotoInputStream());
				pst.setDate(20, studentBean.getDateofadmission());
				pst.setString(21, studentBean.getAcademicyear());
				pst.setInt(22, studentBean.getBranchId());
				pst.setInt(23, studentBean.getCourseId());
				pst.setString(24, studentBean.getSemester());
				pst.setInt(25, studentBean.getStudentid());
			
			}
			
			else
				{
				
				
				pst=con.prepareStatement("update student set studentname=?,prnno=?,guardianname=?,gender=?,dateofbirth=?,bloodgroup=?,religion=?,category=?,caste=?,email=?,phone=?,address=?,city=?,state=?,pincode=?,classid=?,sectionid=?,rollno=?,dateofadmission=?,academicyear=?,branchid=?,courseid=?,semester=? where studentid=?");
				pst.setString(1, studentBean.getStudentName());
				pst.setString(2, studentBean.getPrnno());
				pst.setString(3, studentBean.getGuardianName());
				pst.setString(4, studentBean.getGender());
				pst.setDate(5, studentBean.getDateofbirth());
				pst.setString(6, studentBean.getBloodgroup());
				pst.setString(7, studentBean.getReligion());
				pst.setString(8, studentBean.getCategory());
				pst.setString(9, studentBean.getCaste());
				pst.setString(10, studentBean.getEmail());
				pst.setString(11, studentBean.getPhone());
				pst.setString(12, studentBean.getAddress());
				pst.setString(13, studentBean.getCity());
				pst.setString(14, studentBean.getState());
				pst.setString(15, studentBean.getPincode());
				pst.setInt(16, studentBean.getClassId());
				pst.setInt(17, studentBean.getSectionId());
				pst.setInt(18, studentBean.getRollno());
				//pst.setBlob(17, studentBean.getPhotoInputStream());
				pst.setDate(19, studentBean.getDateofadmission());
				pst.setString(20, studentBean.getAcademicyear());
				pst.setInt(21, studentBean.getBranchId());
				pst.setInt(22, studentBean.getCourseId());
				pst.setString(23, studentBean.getSemester());
				pst.setInt(24, studentBean.getStudentid());
				}
			
			
			result=pst.executeUpdate();
			pst.close();
			con.close();
			return result;
		} catch (SQLException | NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
		return result;
	}


	public static HashMap<String, String> getStudent1(String courseId, String semester, String branchId) {

			LinkedHashMap<String,String> studentList = new LinkedHashMap<String,String>();
			Connection con = null;
	        Statement stmt1 = null;
	        ResultSet rs1 = null;
	        try {
	        
	            con = DBConnection.createconnection();
	            stmt1 = con.createStatement();
	            String sql = "select studentid,studentname,rollno from student where courseid="+courseId+" and semester='"+semester+"' and branchid="+branchId+" order by rollno";
	            rs1 = stmt1.executeQuery(sql); 
	            while(rs1.next()){
	              
	            	studentList.put(rs1.getString("studentid"), rs1.getInt("rollno")+" - "+rs1.getString("studentname"));
	              
	            }
	            stmt1.close();
	            rs1.close();
	            con.close();
	            return studentList;
	            
	        } 
	        catch(Exception e)
	        {
	        	e.printStackTrace();
	        }
	        finally {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	        return studentList;
	}


	public static ArrayList<StudentBean> getAllStudents(int courseId, int branchId, String semester) {
		
		ArrayList<StudentBean> studentBeans=new ArrayList<>();
		Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
        
            con = DBConnection.createconnection();
            String sql = "select * from student where courseid=? and semester=? and branchid=? order by rollno";
            System.out.println("in student dao");
            pst=con.prepareStatement(sql);
            pst.setInt(1, courseId);
            pst.setString(2, semester);
            pst.setInt(3, branchId);
            rs=pst.executeQuery(); 
            while(rs.next()){
              studentBeans.add(new StudentBean(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDate(6), rs.getString(7), rs.getString(8),  rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15),  rs.getString(16), rs.getInt(17), rs.getInt(18), rs.getInt(19), rs.getBinaryStream(20), rs.getDate(21), rs.getString(22), rs.getInt(23), rs.getInt(24), rs.getString(25)));
            }
            System.out.println("in student dao");
            pst.close();
            rs.close();
            con.close();
            return studentBeans;
            
        } 
        catch(Exception e)
        {
        	e.printStackTrace();
        }
        finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
        return studentBeans;
	}


	public static int checkPrn(String prnno) {
		
		Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
        
            con = DBConnection.createconnection();
            pst=con.prepareStatement("select studentid from student where prnno=?");
            pst.setString(1, prnno);
            rs = pst.executeQuery(); 
            if(rs.next()){
            	pst.close();
                rs.close();
                con.close();
                return 1;
            }
            
            pst.close();
            rs.close();
            con.close();
            return 0;
            
        } 
        catch(Exception e)
        {
        	e.printStackTrace();
        }
        finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
        return 0;
	}


	public static int checkPrnEdit(String prnno) {
		
		Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        int result=0;
        try {
        
            con = DBConnection.createconnection();
            
            pst=con.prepareStatement("select studentid from student where prnno=?");
            pst.setString(1, prnno);
            rs = pst.executeQuery();
            while(rs.next()){
            	result++;
            }
            System.out.println(result);
            pst.close();
            rs.close();
            con.close();
            return result;
           
        } 
        catch(Exception e)
        {
        	e.printStackTrace();
        }
        finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
        return result;
	}


	public static Student getStudentByPrn(String prnno) {
		Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        Student student=new Student();
        try {
        	con = DBConnection.createconnection();
            
        	pst= con.prepareStatement("SELECT s.studentid,s.studentname,s.prnno,s.guardianname,s.dateofbirth,s.gender,s.bloodgroup,s.religion,s.category,s.caste,s.email,s.phone,s.address,s.paddress,s.state,s.pstate,s.city,s.pcity,s.pincode,s.ppincode,s.academicyear,crs.coursename,br.branchname,cl.classname,s.semester,sec.sectionname,s.rollno,s.dateofadmission,s.fathername,s.mothername,s.foccupation,s.moccupation,s.gphone,s.gaddress FROM  student AS s INNER JOIN course AS crs ON s.courseid = crs.courseid INNER JOIN branch AS br ON s.branchid = br.branchid INNER JOIN class AS cl ON s.classid = cl.classid INNER JOIN section AS sec ON s.sectionid = sec.sectionid where prnno=?");
            pst.setString(1, prnno);
            rs = pst.executeQuery(); 
            if(rs.next()){
               student.setStudentid(rs.getInt("studentid"));
               student.setStudentName(rs.getString("studentname"));
               student.setPrnno(rs.getString("prnno"));
               student.setGuardianName(rs.getString("guardianname"));
               student.setDateofbirth(rs.getDate("dateofbirth"));
               System.out.println(student.getDateofbirth());
               student.setGender(rs.getString("gender"));
               student.setBloodgroup(rs.getString("bloodgroup"));
               student.setReligion(rs.getString("religion"));
               student.setCategory(rs.getString("category"));
               student.setCaste(rs.getString("caste"));
               student.setEmail(rs.getString("email"));
               student.setPhone(rs.getString("phone"));
               student.setAddress(rs.getString("address"));
               student.setPaddress(rs.getString("paddress"));
               student.setState(rs.getString("state"));
               student.setPstate(rs.getString("pstate"));
               student.setCity(rs.getString("city"));
               student.setPcity(rs.getString("pcity"));
               student.setPincode(rs.getString("pincode"));
               student.setPpincode(rs.getString("ppincode"));
               student.setAcademicyear(rs.getString("academicyear"));
               student.setCoursename(rs.getString("coursename"));
               student.setBranchname(rs.getString("branchname"));
               student.setClassname(rs.getString("classname"));
               student.setSemester(rs.getString("semester"));
               student.setSectionname(rs.getString("sectionname"));
               student.setRollno(rs.getInt("rollno"));
               student.setDateofadmission(rs.getDate("dateofadmission"));
               student.setFatherName(rs.getString("fathername"));
               student.setMotherName(rs.getString("mothername"));
               student.setFoccupation(rs.getString("foccupation"));
               student.setMoccupation(rs.getString("moccupation"));
               student.setGphone(rs.getString("gphone"));
               student.setGaddress(rs.getString("gaddress"));
            }
            pst.close();
            rs.close();
            con.close();
            return student;
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
        finally {
			
        	try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
        return student;
	}


	public static ArrayList<Student> getStudentByCrs(int courseid, int branchid, int classid, String academicyear) {
		ArrayList<Student> students=new ArrayList<>();
		Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
        	con = DBConnection.createconnection();
            
        	pst= con.prepareStatement("SELECT s.studentid,s.studentname,s.prnno,s.guardianname,s.dateofbirth,s.gender,s.bloodgroup,s.religion,s.category,s.caste,s.email,s.phone,s.address,s.paddress,s.state,s.pstate,s.city,s.pcity,s.pincode,s.ppincode,s.academicyear,crs.coursename,br.branchname,cl.classname,s.semester,sec.sectionname,s.rollno,s.dateofadmission,s.fathername,s.mothername,s.foccupation,s.moccupation,s.gphone,s.gaddress FROM  student AS s INNER JOIN course AS crs ON s.courseid = crs.courseid INNER JOIN branch AS br ON s.branchid = br.branchid INNER JOIN class AS cl ON s.classid = cl.classid INNER JOIN section AS sec ON s.sectionid = sec.sectionid where s.courseid=? and s.branchid=? and s.classid=? and s.academicyear=?");
            pst.setInt(1, courseid);
            pst.setInt(2, branchid);
            pst.setInt(3, classid);
            pst.setString(4, academicyear);
            rs = pst.executeQuery(); 
            while(rs.next()){
            	students.add(new Student(rs.getInt("studentid"),
            			rs.getString("studentname"),
            			rs.getString("prnno"),
            			rs.getString("guardianname"),
            			rs.getDate("dateofbirth"),
            			rs.getString("gender"),
            			rs.getString("bloodgroup"),
            			rs.getString("religion"),
            			rs.getString("category"),
            			rs.getString("caste"),
            			rs.getString("email"),
            			rs.getString("phone"),
            			rs.getString("address"),
            			rs.getString("paddress"),
            			rs.getString("city"),
            			rs.getString("pcity"),
            			rs.getString("state"),
            			rs.getString("pstate"),
            			rs.getString("pincode"),
            			rs.getString("ppincode"),
            			rs.getString("academicyear"),
            			rs.getString("semester"),
            			rs.getInt("rollno"),
            			rs.getDate("dateofadmission"),
            			rs.getString("coursename"),
            			rs.getString("branchname"),
            			rs.getString("classname"),
            			rs.getString("sectionname"),
            			rs.getString("fathername"),
            			rs.getString("mothername"),
            			rs.getString("foccupation"),
            			rs.getString("moccupation"),
            			rs.getString("gphone"),
            			rs.getString("gaddress")));
            	
            }
            pst.close();
            rs.close();
            con.close();
            return students;
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
        finally {
			
        	try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
        return students;
	}


	public static Blob getParentImage(int studentId) {
		Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        Blob image =null;
        try {
        
            con = DBConnection.createconnection();
            stmt = con.createStatement();
            String sql = "select photo from parent where studentid="+studentId;
            rs = stmt.executeQuery(sql); 
            if(rs.next()){
              
            	image = rs.getBlob(1);
              
            }
            
            stmt.close();
            rs.close();
            con.close();
            return image;  
        } 
        catch(Exception e)
        {
        	e.printStackTrace();
        }
        finally {
			
        	try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
        return image;
	}


	public static int updateStudent(Student student, String chkphoto) {
		int result=0;
		Connection con=null;
		PreparedStatement pst=null;
		if(chkphoto==null)
		{
			try {
				
				con = DBConnection.createconnection();
				pst=con.prepareStatement("update student set studentname=?,prnno=?,guardianname=?,dateofbirth=?,gender=?,bloodgroup=?,religion=?,category=?,caste=?,email=?,phone=?,address=?,paddress=?,state=?,pstate=?,city=?,pcity=?,pincode=?,ppincode=?,academicyear=?,courseid=?,branchid=?,classid=?,semester=?,sectionid=?,rollno=?,dateofadmission=?,fathername=?,mothername=?,foccupation=?,moccupation=?,gphone=?,gaddress=? where studentid=?");
				pst.setString(1, student.getStudentName());
				pst.setString(2, student.getPrnno());
				pst.setString(3, student.getGuardianName());
				pst.setDate(4, student.getDateofbirth());
				pst.setString(5, student.getGender());
				
				pst.setString(6, student.getBloodgroup());
				pst.setString(7, student.getReligion());
				pst.setString(8, student.getCategory());
				pst.setString(9, student.getCaste());
				pst.setString(10, student.getEmail());
				pst.setString(11, student.getPhone());
				pst.setString(12, student.getAddress());
				pst.setString(13, student.getPaddress());
				pst.setString(14, student.getState());
				pst.setString(15, student.getPstate());
				pst.setString(16, student.getCity());
				pst.setString(17, student.getPcity());
				pst.setString(18, student.getPincode());
				pst.setString(19, student.getPpincode());
				
				pst.setString(20, student.getAcademicyear());
				pst.setInt(21, student.getCourseId());
				pst.setInt(22, student.getBranchId());
				pst.setInt(23, student.getClassId());
				pst.setString(24, student.getSemester());
				pst.setInt(25, student.getSectionId());
				pst.setInt(26, student.getRollno());
				pst.setDate(27, student.getDateofadmission());
				pst.setString(28, student.getFatherName());
				pst.setString(29, student.getMotherName());
				pst.setString(30, student.getFoccupation());
				pst.setString(31, student.getMoccupation());
				pst.setString(32, student.getGphone());
				pst.setString(33, student.getGaddress());
				pst.setInt(34, student.getStudentid());
				result=pst.executeUpdate();
				
				pst.close();
				con.close();
				return result;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				
				try {
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		else
		{
			try {
				
				con = DBConnection.createconnection();
				pst=con.prepareStatement("update student set studentname=?,prnno=?,guardianname=?,dateofbirth=?,photo=?,gender=?,bloodgroup=?,religion=?,category=?,caste=?,email=?,phone=?,address=?,paddress=?,state=?,pstate=?,city=?,pcity=?,pincode=?,ppincode=?,academicyear=?,courseid=?,branchid=?,classid=?,semester=?,sectionid=?,rollno=?,dateofadmission=?,fathername=?,mothername=?,foccupation=?,moccupation=?,gphone=?,gaddress=? where studentid=?");
				pst.setString(1, student.getStudentName());
				pst.setString(2, student.getPrnno());
				pst.setString(3, student.getGuardianName());
				pst.setDate(4, student.getDateofbirth());
				pst.setBlob(5, student.getPhoto());
				pst.setString(6, student.getGender());
				
				pst.setString(7, student.getBloodgroup());
				pst.setString(8, student.getReligion());
				pst.setString(9, student.getCategory());
				pst.setString(10, student.getCaste());
				pst.setString(11, student.getEmail());
				pst.setString(12, student.getPhone());
				pst.setString(13, student.getAddress());
				pst.setString(14, student.getPaddress());
				pst.setString(15, student.getState());
				pst.setString(16, student.getPstate());
				pst.setString(17, student.getCity());
				pst.setString(18, student.getPcity());
				pst.setString(19, student.getPincode());
				pst.setString(20, student.getPpincode());
				
				pst.setString(21, student.getAcademicyear());
				pst.setInt(22, student.getCourseId());
				pst.setInt(23, student.getBranchId());
				pst.setInt(24, student.getClassId());
				pst.setString(25, student.getSemester());
				pst.setInt(26, student.getSectionId());
				pst.setInt(27, student.getRollno());
				pst.setDate(28, student.getDateofadmission());
				pst.setString(29, student.getFatherName());
				pst.setString(30, student.getMotherName());
				pst.setString(31, student.getFoccupation());
				pst.setString(32, student.getMoccupation());
				pst.setString(33, student.getGphone());
				pst.setString(34, student.getGaddress());
				pst.setInt(35, student.getStudentid());
				result=pst.executeUpdate();
				
				pst.close();
				con.close();
				return result;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				
				try {
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			
		}
		return result;
	}
}