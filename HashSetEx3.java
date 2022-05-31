package CollectionFrameWork;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx3 {
public static void main(String[] args) throws IOException {
	HashSet<String> hs = new HashSet();
	System.out.println("Enter names");
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	hs.add(br.readLine());
//	}
	char c;int n;
	String sp="  "; 
	 while ((c=(char)br.read())!='$') {
			hs.add((br.readLine()));
			System.out.println();
		}	
//	 for(String str:hs) {
//			System.out.println(str);
//	 }
	 
			while((n=br.read())!=-1) {
				System.out.print((char)n);
			}
		
	 Iterator<String>it  = hs.iterator();
	 while (it.hasNext()) {
		 System.out.println(it.next());
	}
	 
}
}
