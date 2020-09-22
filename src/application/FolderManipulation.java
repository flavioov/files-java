package application;

import java.io.File;
import java.util.Scanner;

public class FolderManipulation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        // list folders in a directory
        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("FOLDERS:");
        assert folders != null;
        for (File folder : folders) {
            System.out.println(folder);
        }

        // list files in da directory
        File[] files = path.listFiles(File::isFile);

        System.out.println("Files:");
        assert files != null;
        for (File file : files) {
            System.out.println(file);
        }

        boolean success = new File(strPath + "/Newfolder").mkdir();
        System.out.println("directory created successfully: " + success);
    }
}
