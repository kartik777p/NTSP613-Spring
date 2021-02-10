package com.nit.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.nit.comps.IEnggine;
import com.nit.comps.Vehical;

public class VehicalFactory {
	// create static veriable to hold Props
	private static Properties props;
	// use static block to load that file at the time of class load
	static {
		// create obj of properties file
		props = new Properties();
		// hold that file using InputStram
		try {
			InputStream is = new FileInputStream("src/com/nit/commons/info.properties");
			// load that file using is
			props.load(is);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} // catch
		catch (IOException e) {
			e.printStackTrace();
		} // catch
	}// staticBlock

	public static Vehical getInstance() {
		Vehical vehical = null;
		IEnggine engg = null;
		String dependentclassName = null;
		Class dependentClazz = null;
		Constructor cons[] = null;
		try {
			// load and create obj of the dependent class by collecting classname using
			// properties file
			// (get dependnt class name as string contnt)
			dependentclassName = props.getProperty("className");
			// load that given class
			dependentClazz = Class.forName(dependentclassName);
			// get class cons of that loaded class
			cons = dependentClazz.getDeclaredConstructors();
			// create the obj of that loaded class
			engg = (IEnggine) cons[0].newInstance();
			// create the obj of target(fix class)
			vehical = new Vehical();
			// assign dependnt class to a target class
			vehical.setEngg(engg);
		} // try
		catch (ClassNotFoundException cnf) {
			cnf.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// return vehical obj having dependent class
		return vehical;
	}// getInstance()
}// class
