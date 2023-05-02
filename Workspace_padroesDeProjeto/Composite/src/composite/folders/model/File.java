package composite.folders.model;

public class File implements FileSystemItem{
	private String nomeFile;
	
	public File(String nome) {
		this.nomeFile = nome;
	}

	@Override
	public void print(String structure) {
		System.out.println(structure + nomeFile);
		
	}
	
	

}
