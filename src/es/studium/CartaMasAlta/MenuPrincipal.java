package es.studium.CartaMasAlta;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class MenuPrincipal extends Frame
{
	private static final long serialVersionUID = 1L;
	
	// Objetos que contienen imagenes
	Image nuevaPartida, ayuda, ranking, salir;
	// Toolkit Objeto para manipulacion de imagenes
	Toolkit herramienta;
	
	public MenuPrincipal()
	{
		setLayout (null);
		setTitle("Carta Más Alta");
		setBackground(Color.white);
		setSize(600,400);
		// Activamos la herramienta	
		herramienta = getToolkit();
		// Cargar imagen
		nuevaPartida = herramienta.getImage("newGame.png");
		ayuda = herramienta.getImage("Ayuda.png");
		ranking = herramienta.getImage("Jugadores.png");
		salir = herramienta.getImage("GameOver.png");
				
		setResizable(false);
		setVisible(true);
		
		
	}
	public void paint (Graphics g)
	{
		// Dibujar la imagen
		g.drawImage(nuevaPartida, 80,30,this);
		g.drawImage(ayuda, 360,30,this);
		g.drawImage(ranking, 80,220,this);
		g.drawImage(salir, 360,220,this);
	}

}
