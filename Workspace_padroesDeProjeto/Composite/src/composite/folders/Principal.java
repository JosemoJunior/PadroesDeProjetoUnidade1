package composite.folders;
import composite.folders.model.FileSystemItem;

import java.util.Arrays;

import composite.folders.model.File;
import composite.folders.model.Folder;

public class Principal {

	public static void main(String[] args) {
		//Instanciando os files
		FileSystemItem file1 = new File("Arquivo1.txt");
		FileSystemItem file2 = new File("Arquivo2.txt");
		FileSystemItem file3 = new File("Arquivo3.txt");
		FileSystemItem file4 = new File("Arquivo4.txt");
		FileSystemItem file5 = new File("Arquivo5.txt");
		
		//Instanciando as Folders
		
		FileSystemItem SystemFolder1 = new Folder("SystemFolder1", Arrays.asList(file2, file3));
		FileSystemItem SystemFolder2 = new Folder("SystemFolder2", Arrays.asList(SystemFolder1, file4, file5));
		
		FileSystemItem SystemFolderAdm = new Folder("SystemFolderAdm", Arrays.asList(file1, SystemFolder1, SystemFolder2));
		
		SystemFolderAdm.print("");
		

	}

}
