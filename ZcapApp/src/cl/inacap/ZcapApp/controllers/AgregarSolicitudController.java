package cl.inacap.ZcapApp.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.inacap.ZcapModel.dao.IngresoDAOLocal;
import cl.inacap.ZcapModel.dto.Ingreso;

@WebServlet("/AgregarSolicitudController.do")
public class AgregarSolicitudController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   private IngresoDAOLocal ingresoDAO ;
   
    public AgregarSolicitudController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
				
		request.getRequestDispatcher("WEB-INF/vistas/AgregarSolicitud.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<String> errores = new ArrayList<>();
		String ruttxt = request.getParameter("rut-txt").trim();
		int rut = 0;
		try {
			rut = Integer.parseInt(ruttxt);
		} catch (Exception ex) {
			errores.add("rut debe ser numerico");
		}
		String nombre = request.getParameter("nombre-txt").trim();
		if (nombre.isEmpty()) {
			errores.add("ingrese nombre");
		}
		String tipoSolicitud=request.getParameter("tipoSolictud-select").trim();
		if (tipoSolicitud.isEmpty()) {
			errores.add("debe seleccionar el tipo de solicitud");
		}
		if (errores.isEmpty()) {
			Ingreso ingreso = new Ingreso();
			ingreso.setRut(rut);
			ingreso.setNombre(nombre);
			ingreso.setTipoSolicitud(tipoSolicitud);
			ingresoDAO.save(ingreso);
			
		
			request.setAttribute("mensaje", "registro exitoso");
		}else {
			request.setAttribute("errores", errores);
		}
		doGet(request, response);
			
		}
	}


