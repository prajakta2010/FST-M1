package activities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Activity14 {

	public static void main(String[] args) {

		File file=new File("C:\\Users\\0023P7744\\TrainingWorkspace\\Training_Java\\resources\\newfile.txt");
		boolean fstatus;
		try {
			fstatus = file.createNewFile();
			if(fstatus)
			{
				System.out.println("File created successfully!");
			}
			else
			{
				System.out.println("File already exists at this path.");
			}

			File fileutil=FileUtils.getFile("C:\\Users\\0023P7744\\TrainingWorkspace\\Training_Java\\resources\\newfile.txt");
			System.out.println("Data in file >>>"+FileUtils.readFileToString(fileutil,"UTF8"));
			File destDir = new File("resources1");
			FileUtils.copyFileToDirectory(file, destDir);
			File newFile = FileUtils.getFile(destDir, "newfile.txt");
			//Read data from file
			String newFileData = FileUtils.readFileToString(newFile, "UTF8");
			//Print it
			System.out.println("Data in new file: " + newFileData);

		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
