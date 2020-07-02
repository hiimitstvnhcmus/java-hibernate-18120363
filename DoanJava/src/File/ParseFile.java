package File;

import java.awt.Frame;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

import pojo.Class_Subject;
import pojo.Class_Subject_Student;
import pojo.Student;

public class ParseFile {
	public static List<String[]> ParseCSV(String filename) {

		String line = "";
		String[] record;
		List<String[]> records = new ArrayList<String[]>();

		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			br.read();

			while ((line = br.readLine()) != null) {
				record = line.split(",");
				records.add(record);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return records;
	}

	public static List<Class_Subject_Student> To_Class_Subject_Student_by_dangky(String filename) {
		List<String[]> records = ParseCSV(filename);
		List<Class_Subject_Student> list = new ArrayList<Class_Subject_Student>();
		Class_Subject_Student x;

		Iterator<String[]> it = records.iterator();
		while (it.hasNext()) {
			String[] strings = it.next();
			x = new Class_Subject_Student(strings[4],strings[5],strings[0],0,0,0,0);
			list.add(x);
		}
		return list;
	}
	
	public static List<Class_Subject_Student> to_Class_Subject_Student_by_diem(String filename) {
		List<String[]> records = ParseCSV(filename);
		List<Class_Subject_Student> list = new ArrayList<Class_Subject_Student>();
		Class_Subject_Student x;
		
		Iterator<String[]> it = records.iterator();
		while (it.hasNext()) {
			String[] strings = it.next();

			x = new Class_Subject_Student(strings[6],strings[7],strings[0],
					Float.parseFloat(strings[2]),Float.parseFloat(strings[3]),Float.parseFloat(strings[4]),Float.parseFloat(strings[5]));
			list.add(x);
		}
		return list;
	}
	
	public static List<Class_Subject> to_Class_Subject(String filename) {
		List<String[]> records = ParseCSV(filename);
		List<Class_Subject> list = new ArrayList<Class_Subject>();
		Class_Subject x;
		
		Iterator<String[]> it = records.iterator();
		while (it.hasNext()) {
			String[] strings = it.next();
			x = new Class_Subject(strings[3],strings[0],strings[2]);
			list.add(x);
		}
		return list;
	}
	
	public static List<Student> to_Student(String filename) {
		List<String[]> records = ParseCSV(filename);
		List<Student> list = new ArrayList<Student>();
		Student x;
		
		Iterator<String[]> it = records.iterator();
		while (it.hasNext()) {
			String[] strings = it.next();
			x = new Student(strings[0],strings[1]+" "+strings[2]+" "+strings[3],strings[4],strings[5],strings[6]);

			list.add(x);
		}
		return list;
	}
	
}
