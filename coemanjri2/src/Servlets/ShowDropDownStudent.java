/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;

import Model.AddStudentDao;
import Model.EditBookDao;
import Model.EditStudentDao;

/**
 *
 * @author admin
 */
public class ShowDropDownStudent extends HttpServlet {

 
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            try {
        		String courseId=request.getParameter("course");
                String branchId=request.getParameter("branch");
                String semester=request.getParameter("semester");
                HashMap<String, String> studentList=new HashMap<>();
                studentList=AddStudentDao.getStudent1(courseId, semester, branchId);
                JSONObject json = new JSONObject();
                json.putAll(studentList);
                response.setContentType("application/json");
                response.getWriter().write(json.toString());

			} catch (Exception e) {
				e.printStackTrace();
			}
            
    }
}
