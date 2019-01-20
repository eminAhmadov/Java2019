import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class OompaLoompaSong{
	private int lines;
	private ArrayList<String> song = new ArrayList<String>();
	private final String FILENAME = "OompaLoompaSong.txt";
	
	public OompaLoompaSong(int lines){
		this.lines = lines;
		
		try{
		song = readSongFromFile();
		} catch(IOException e){}
        
	}
	
	public ArrayList<String> readSongFromFile() throws IOException {
		
		FileReader fileReader = new FileReader(FILENAME);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
		ArrayList<String> songFromFile = new ArrayList<String>();
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            songFromFile.add(line);
        }
        bufferedReader.close();
		
		return songFromFile;
	}

	public String sing(){
		Random random = new Random();
		String s = "";
		System.out.println("The OompaLoompa song: ");
		for(int i=0; i<lines; i++){
			s = s + song.get(random.nextInt(song.size())) + "\n";
		}
		return s;
	}
}