/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espol.edu.graphics;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.DefaultXYDataset;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.renderer.xy.XYItemRenderer;
/**
 *
 * @author Acer
 */
public class Graphics extends JFrame{
    
    DefaultXYDataset dataset;
    XYItemRenderer renderer;
    JFreeChart chart;
    ChartPanel panel;
    JFrame frame;
    
    public Graphics(){
        //Datos que se mostraran en la grafica
        dataset = new DefaultXYDataset();
        
        //Declaracion de las variables a mostrar y una matriz double(x,f(x))
        dataset.addSeries("firefox", new double[][] {{ 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017 }, { 25, 29.1, 32.1, 32.9, 31.9, 25.5, 20.1, 18.4, 15.3, 11.4, 9.5 }});
        dataset.addSeries("ie", new double[][] {{ 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017 }, { 67.7, 63.1, 60.2, 50.6, 41.1, 31.8, 27.6, 20.4, 17.3, 12.3, 8.1 }});
        dataset.addSeries("chrome", new double[][] {{ 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017 }, { 0.2, 6.4, 14.6, 25.3, 30.1, 34.3, 43.2, 47.3, 58.4 }});

        //Declaracion de los colores del grafico para cada variable
        renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.ORANGE);
        renderer.setSeriesPaint(1, Color.BLUE);
        renderer.setSeriesPaint(2, Color.GREEN);
        renderer.setSeriesStroke(0, new BasicStroke(2));
        renderer.setSeriesStroke(1, new BasicStroke(2));
        renderer.setSeriesStroke(2, new BasicStroke(2));
        
        //Declaracion del titulo, rango del eje Y, nombre del eje X y nombre del eje Y
        chart = ChartFactory.createXYLineChart("Browser Quota", "Year", "Quota", dataset);
        chart.getXYPlot().getRangeAxis().setRange(0, 100);
        ((NumberAxis) chart.getXYPlot().getRangeAxis()).setNumberFormatOverride(new DecimalFormat("#'%'"));
        chart.getXYPlot().setRenderer(renderer);
        
        //Declaracion del panel en donde se mostrara la grafica
        panel = new ChartPanel(chart,false);
        frame = new JFrame("Grafico");
        getGrafico();
    }
    
    //Metodo para mostrar el grafico en el panel
    public void getGrafico(){
        frame.setSize(600,400);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
    
    public static void main(String[] args){
        Graphics g = new Graphics();
    }
}
