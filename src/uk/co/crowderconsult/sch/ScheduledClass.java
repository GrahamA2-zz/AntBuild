package uk.co.crowderconsult.sch;

import java.awt.HeadlessException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import javax.swing.JOptionPane;

import lombok.Data;

import uk.co.crowderconsult.FirstLib;
import uk.co.crowderconsult.ini4j.Ini;
import uk.co.crowderconsult.ini4j.Ini.Section;



/**
 *
 * @author Graham Allan
 * @version 1.0
 *
 */
@Data
public class ScheduledClass {

  private int valueA;
  private int valueB;
  private int valueC;
  private FirstLib lib = new FirstLib();

	/**
	 *
	 * @param a First Value
	 * @param b Second Value
	 * @return Int addition of a and b
	 */
	public int add(int a, int b){
		return a + b;
	}


	public static void main(String[] args) {
		try {
			ScheduledClass mc = new ScheduledClass();
			StringBuffer sb = new StringBuffer();
			sb.append(mc.add(10,23) + "\n");
			sb.append(new VatCalc().calcualteVAT(mc.add(10,23))+ "\n");
			sb.append(mc.lib.abs(345.634)+ "\n");
			VatCalc vc = new VatCalc();
			vc.setVatRate(0.56);
			sb.append("VAT Rate " + vc.getVatRate()+ "\n");
			sb.append("Type " + vc.getChart().getPlot().getPlotType() + "\n");
			sb.append(String.format("%2$s.%1$s@foo.com\n", "allan","graham"));

			Ini iniFile = new Ini();
			Section iniSection = iniFile.add("MySection");
			iniSection.put("Value1", (new Date()).toLocaleString());
			iniSection.put("Value2","B");
			iniSection.put("Value3","V");
			try {
				new File("./MyIniFile.ini").delete();
				sb.append("Deleted\n");
			} catch (Exception e1) {
				sb.append("VAT Rate " + e1.getLocalizedMessage() + "\n");
			}
			try {
				iniFile.store(new FileWriter(new File("./MyIniFile.ini")));
				sb.append("Created\n");
			} catch (IOException e) {
				e.printStackTrace();
				sb.append("VAT Rate " + e.getLocalizedMessage() + "\n");
			}
			JOptionPane.showMessageDialog(null, sb.toString());

		} catch (HeadlessException e) {
			JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
		}

	}
}
