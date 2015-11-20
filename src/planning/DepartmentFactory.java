package planning;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class DepartmentFactory {

	private static void readFile2(File fileIn) throws IOException {
		// Construct BufferedReader from FileReader
		BufferedReader br = new BufferedReader(new FileReader(fileIn));

		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}

		br.close();
	}
	
	public static List<Department> getDepartments(String fileName){
		return null;
	}
}
