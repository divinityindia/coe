package Servlets.admin;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import Bean.AccessBean;
import Model.VirtualTourDao;


/**
 * Servlet implementation class AddClass
 */

public class VirtualTour extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VirtualTour() {
        super();
        // TODO Auto-generated constructor stub
    }

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			HttpSession session=request.getSession(false);
			AccessBean bean=(AccessBean)session.getAttribute("right");
			if(session.getAttribute("cat")!=null)
			{
				if(session.getAttribute("cat").equals("Administrator")&&bean.isGallery())
				{
					FileItemFactory factory = new DiskFileItemFactory();
			        ServletFileUpload upload = new ServletFileUpload(factory);
			        Iterator<FileItem> iterator = null;
					try {
						iterator = upload.parseRequest(request).iterator();
					} catch (FileUploadException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			        HashMap<String, String> fields = new HashMap<>();
			        InputStream video = null;
			        while (iterator.hasNext()) {

			                       FileItem item = iterator.next();
			                       if (!item.isFormField()) {
			                    	   
			                           video=item.getInputStream();
			                                                  }
			                       else {
			                    	   		fields.put(item.getFieldName(), item.getString());
			                    	   	}
			                  }
			    	
			            int result = VirtualTourDao.addVideo(video);
			    		if(result!=0)
			    		{
			    			response.sendRedirect("virtualtour.jsp?success=1&id="+result);
			    		}
			    		else
			    		{
			    			response.sendRedirect("virtualtour.jsp?success=0");
			    		}
				}
				
				else
				{
					session=request.getSession(true);
					session.setAttribute("cat", null);
					response.sendRedirect("../../login.jsp?success=0");
				}
				
				
			}
			
			else
			{	
				session=request.getSession(true);
				session.setAttribute("cat", null);
				response.sendRedirect("../../login.jsp?success=0");
			}	
			
				
	            
			}
		@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException{
			try {
				
				Blob video=VirtualTourDao.getVideo();
				ServletOutputStream out;  
				try {
					InputStream is=video.getBinaryStream();
					out = response.getOutputStream();  
					BufferedInputStream bin = new BufferedInputStream(is);  
					BufferedOutputStream bout = new BufferedOutputStream(out);  
					 int ch =0; ;  
					    while((ch=bin.read())!=-1)  
					    { 
					    	try{
					    bout.write(ch);
					    	}
					    	catch(Exception e){
					    		
					    		e.printStackTrace();
					    		System.out.println("user cancelled loading videogallery page");
					    		break;
					    	}
					    }  
					      
					    bin.close();  
					   
					    bout.close();  
					    out.close(); 
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				catch(Exception e)
				{
					System.out.println("Video not avallable");
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

}
