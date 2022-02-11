/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iut.tpservlet;

import com.iut.repository.LigneRepository;
import com.iut.tpservlet.jpa.Ligne;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sami
 */
@WebServlet(name = "IndexLigneServlet", urlPatterns = {"/IndexLigne"})
public class IndexLigneServlet extends HttpServlet {

    
    protected final LigneRepository repository = new LigneRepository();
    protected final EntityManager entityManager = repository.getEntityManager();
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
  
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Ligne> lignes = repository.getAll();

        for (Ligne ligne : lignes) {
            entityManager.refresh(ligne);
        }
        
        request.getSession().setAttribute("lignes", lignes);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
