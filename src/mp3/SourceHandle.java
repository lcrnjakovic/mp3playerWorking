package mp3;

import java.util.ArrayList;
import java.util.Iterator;

public class SourceHandle implements Iterable<String>{
	
	private String [] fileNames;
	private ArrayList <String> songList = new ArrayList <String>();
	
	public SourceHandle(String [] _fileNames){
		this.fileNames = _fileNames;
		
		// no if checks so far, run as if the args[] contain file names
		handleCommandLineArgs();
	}
	
	
	public Iterator<String> iterator() {
		return songList.iterator();
	}

	
	public Iterable<String> handleCommandLineArgs() {
		
		for(int i = 0; i<fileNames.length; i++){
			songList.add(fileNames[i]);
		}
		return songList;
	}

	/**
	public Iterable<String> handleXML() {
		// TODO 
		return null;
	}

	
	public Iterable<String> handleURL() {
		// TODO
		return null;
	}

	
	public Iterable<String> handlemySQL() {
		// TODO 
		return null;
	}

	public Iterable<String> handleJSON() {
		// TODO
		return null;
	}
	*/
	
}
