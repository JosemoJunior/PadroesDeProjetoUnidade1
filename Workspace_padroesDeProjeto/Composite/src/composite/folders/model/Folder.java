package composite.folders.model;

import java.util.List;

public class Folder implements FileSystemItem{
	private String nomeFolder;
	private List<FileSystemItem> listaFiles;
	
	public Folder(String nomeFolder, List<FileSystemItem> listaFiles) {
		this.nomeFolder = nomeFolder;
		this.listaFiles = listaFiles;
	}

	@Override
	public void print(String structure) {
		System.out.println(structure + nomeFolder);
		for ( FileSystemItem file : listaFiles) {
			file.print(structure + "| ");
		}
		
	}
	
	
	
	

}
