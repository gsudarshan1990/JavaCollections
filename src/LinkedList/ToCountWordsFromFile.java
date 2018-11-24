package LinkedList;

/*
 * Write a program that counts the number of unique words in a large text file 
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ToCountWordsFromFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long startTime=System.currentTimeMillis();
		File file=new File("E:\\sts examples\\JavaCollections\\mobydick.txt");
		List<String> ll=new LinkedList<String>();
		
		FileReader fr=null;
		try {
			fr=new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BufferedReader br=new BufferedReader(fr);
		String line="";
		
		try {
			while((line=br.readLine())!=null)
			{
			
				String[] word=line.split(" ");
				
				for(int i=0;i<word.length;i++)
				{
					if(!ll.contains(word[i]))
					{
						ll.add(word[i]);
					}
				}
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(ll.size());
		long endTime=System.currentTimeMillis();
		long time=endTime-startTime;
		System.out.println(time);
		
		
	}

}
