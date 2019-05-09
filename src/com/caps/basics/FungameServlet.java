package com.caps.basics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fun")
public class FungameServlet extends HttpServlet{

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fileName = "C:/Users/QSP/Desktop/Caps_Training/25marchStudent.txt";
		ArrayList<String> allNames = new ArrayList<String>();
		Random r = new Random();

		BufferedReader in = new BufferedReader(new FileReader(fileName)); 
		while (in.ready()) { 
			allNames.add( in.readLine() );
		}
		in.close();

		String randomName = allNames.get(r.nextInt(allNames.size()));
		PrintWriter out = resp.getWriter();
		out.print("<h1>"+"Lucky Name :"+randomName+"</h1>");

				
	}
}
