package com.example.portlet;

import com.example.Beans.Theme;
import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import zango.example.model.Student;
import zango.example.service.FooLocalServiceUtil;
import zango.example.service.StudentLocalService;
import zango.example.service.StudentLocalServiceUtil;
import zango.example.service.persistence.StudentUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=hello Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class HellomvcportletPortlet extends MVCPortlet{
	
	public static String VUE_FORM="/showForm.jsp";
	public static String VUE_TABLE="/showTable.jsp";

	
	private String greetings(){
		return "Well done dude (^__________^)!!";	
	}
	
	public void saveURL(ActionRequest request, ActionResponse response)
            throws IOException, PortletException, PortalException, SystemException{
		
		
        String userName=ParamUtil.get(request, "name", "");
        String password=ParamUtil.get(request, "password", "");
        request.setAttribute("greetings", greetings());
        //response.setProperty("greetings", greetings());
        
        response.setRenderParameter("jspPage", VUE_FORM);
   //     getPortletContext().getRequestDispatcher(VUE).forward(request, response);
        System.out.println("My Username is "+userName+"----------And password"+password);
        
     
    }
	
	public void showTable(ActionRequest request, ActionResponse response)
            throws IOException, PortletException, PortalException, SystemException{
		
		List<Theme> someList=new ArrayList<>();
		
		// Setting the objects 
		Theme theme1=new Theme();
		theme1.setId(1);
		theme1.setTheme("SPORT");
		
		
		Theme theme2=new Theme();
		theme2.setId(2);
		theme2.setTheme("MUSIC");


		Theme theme3=new Theme();
		theme3.setId(3);
		theme3.setTheme("IT");


		Theme theme4=new Theme();
		theme4.setId(4);
		theme4.setTheme("MOVIES");
		
		someList.add(theme1);
		someList.add(theme2);
		someList.add(theme3);
		someList.add(theme4);
	
		request.setAttribute("themeList", someList);		
        response.setRenderParameter("jspPage", VUE_TABLE);	
    }
	
	public void addStudent(ActionRequest request, ActionResponse response)
            throws IOException, PortletException, PortalException, SystemException{
//		long studentId=CounterLocalServiceUtil.increment();
//		
//		String fname=request.getParameter("firstName");
//		String lname=request.getParameter("lastName");
//		System.out.println("Coordinates 1:"+fname);
//
//		Student student=StudentLocalServiceUtil.createStudent(studentId) ;
//		student.setLastName(lname);
//		student.setFirstName(fname);
//		System.out.println("Coordinates 2:"+student.getFirstName());
//Blbala this can trigger a change!!!
		//		StudentLocalServiceUtil.addStudent(student);
		
		System.out.println("Hello Friend count is at :: 	"+StudentLocalServiceUtil.getStudentsCount());
		System.out.println("TTest test test test ");

    }	
	
	
}