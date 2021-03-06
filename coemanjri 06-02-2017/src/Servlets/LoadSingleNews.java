package Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import Bean.NewsBean;
import Model.GetListItemDao;

/**
 * Servlet implementation class Count
 */

public class LoadSingleNews extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final int BUFFER_SIZE = 4096;      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoadSingleNews() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
				int newsID=Integer.parseInt(request.getParameter("newsid"));
				NewsBean news=GetListItemDao.getSingleNews(newsID);
				/*Date myDate = new Date();
				SimpleDateFormat dmyFormat = new SimpleDateFormat("dd/MM/yyyy");
				String sd = dmyFormat.format(event.getStartdate());
				String ed="";
				if(event.getEnddate()!=null)
				{
					sd = dmyFormat.format(event.getEnddate());
				}*/
					
					/*if(eventBean.getStatus().equals("Yes"))
					{
						if(eventBean.getEnddate()==null)
						{
							
							if(dateobj.compareTo(eventBean.getStartdate())>0||dateobj.compareTo(eventBean.getStartdate())==0)
							{
								beans.add(eventBean);
							}
						}
						else
						{
							if(dateobj.compareTo(eventBean.getStartdate())>0||dateobj.compareTo(eventBean.getStartdate())==0)
							{
								if(dateobj.compareTo(eventBean.getEnddate())==0||dateobj.compareTo(eventBean.getEnddate())<0)
								{
									beans.add(eventBean);
								}
								
							}
		
						}
					}
					
					*/
				
				String json = new Gson().toJson(news);
		        response.setContentType("application/json");
		        response.getWriter().write(json);			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
