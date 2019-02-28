/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senacrs.controller.logic;

import br.com.senacrs.bean.Pessoa;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rafael
 */
public class ControllerLogicPessoaEditar implements ControllerLogic{

    @Override
    public void executar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(request.getParameter("nome"));
                pessoa.setSobrenome(request.getParameter("sobrenome"));

                pessoa.getEndereco().setBairro(request.getParameter("bairro"));
                pessoa.getEndereco().setCep(request.getParameter("cep"));
                pessoa.getEndereco().setRua(request.getParameter("rua"));

                request.getSession().setAttribute("pessoa", pessoa);
                request.getRequestDispatcher("index.jsp").forward(request, response);
    }
    
}
