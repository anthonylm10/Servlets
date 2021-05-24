package br.edu.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet ("/app")
public class aplicacao extends HttpServlet {
	
	protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ArrayList<Livros> livro = new ArrayList<Livros>();
		
		Livros livro1 = new Livros();
		livro1.setTitulo("A Bolsa Amarela");
		livro1.setAno(1964);
		livro1.setAutor("Anthony Vogado");
		
		Livros livro2 = new Livros();
		livro2.setTitulo("Holopensene");
		livro2.setAno(1985);
		livro2.setAutor("Veigar da Silva");
		
		Livros livro3 = new Livros() ;
		livro3.setTitulo("O capital");
		livro3.setAno(1800);
		livro3.setAutor("Carlinhos Maia"); 
		
		Livros livro4 = new Livros() ;
		livro4.setTitulo("Do mil ao milhão");
		livro4.setAno(2000);
		livro4.setAutor("Huanan Spadotto"); 
		
		livro.add(livro1);
		livro.add(livro2);
		livro.add(livro3);
		livro.add(livro4);
		
		req.setAttribute("livro", livro);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("listas.jsp");
		dispatcher.forward(req, resp);
	}

}