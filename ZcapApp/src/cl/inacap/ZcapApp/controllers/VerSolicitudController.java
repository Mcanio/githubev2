package cl.inacap.ZcapApp.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.inacap.ZcapModel.dao.IngresoDAOLocal;
import cl.inacap.ZcapModel.dto.Ingreso;

/**
 * Servlet implementation class VerSolicitudController
 */
@WebServlet("/VerSolicitudController")
public class VerSolicitudController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private IngresoDAOLocal IngresoDAO;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerSolicitudController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getParameter("nombreEliminar") !=null) {
			
			String nombre=request.getParameter("nombreEliminar").trim();
			List<Ingreso> busqueda = IngresoDAO.filterByNombre(nombre);
			Ingreso ingresoEliminar = busqueda.isEmpty()? null:busqueda.get(0);
			
			if(ingresoEliminar !=null) {
				IngresoDAO.delete(ingresoEliminar);
			}
	
		}
		List<Ingreso>ingresos=IngresoDAO.getAll();
		request.setAttribute("ingresos",ingresos);
		request.getRequestDispatcher("WEB-INF/vistas/verRegistro.jsp").forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
