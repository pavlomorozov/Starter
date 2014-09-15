package dp.ua.pavelmorozov.utils;

import java.io.IOException;
/**
 * 
 * @author PM
 *
 *Runs application jar with memory preset.  
 */

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Runtime.getRuntime().exec("java -Xms256m -Xmx1024m -jar watermark_app.jar");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
