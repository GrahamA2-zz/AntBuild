package uk.co.crowderconsult.sch;

import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import lombok.Data;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.PlotState;

@Data
public class VatCalc {

	private static final double DEFAULT_VAT_RATE = 0.25d;
	private double vatRate = DEFAULT_VAT_RATE;
	private JFreeChart chart;

	public VatCalc(){
	
          chart = new JFreeChart(new Plot(){

			@Override
			public String getPlotType() {

				return "Dummy Plot";
			}

			@Override
			public void draw(Graphics2D g2, Rectangle2D area, Point2D anchor,
					PlotState parentState, PlotRenderingInfo info) {
			}

          });
	};

	public VatCalc(double vatRate){
		this.vatRate = vatRate;
	};


	public double calcualteVAT(double ammount){
		return ammount + (ammount * vatRate);
	}

}
