package cn.itcast.scm.servlets;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SysInitServlet
 */
public class SysInitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void init() throws ServletException{
		
		HashMap<String, Object> sysParamMap = new HashMap<String,Object>();
        HashMap<String, Object> supTypeMap = new HashMap<String,Object>();
        supTypeMap.put("1", "一级供应商");
        supTypeMap.put("2", "二级供应商");
        supTypeMap.put("3", "三级供应商");
        HashMap<String, Object> goodsColorsMap = new HashMap<String,Object>();
        goodsColorsMap.put("1", "红色");
        goodsColorsMap.put("2", "绿色");
        goodsColorsMap.put("3", "蓝色");
        sysParamMap.put("supType",supTypeMap );
        sysParamMap.put("goodsColors",goodsColorsMap );
        this.getServletContext().setAttribute("sysParam", sysParamMap);
        System.out.println("--------参数加载完成--------");
	} 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SysInitServlet() {
        super();
        // TODO Auto-generated constructor stub
        
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
