package homework6;

import java.io.File;
import java.io.FilenameFilter;

public class Part2 {
    public static void main(String[] args) {
        String source = "C:\\Users\\Adrian\\Desktop\\JAVA\\ro.siit.homework";

        showFiles(source);
        showByExtension(source);
        checkIfExist(source + "\\" + "build");


    }

    //  Implement a method to get a list of all file/directory names from the given.
    private static void showFiles(String str) {
        String[] pathnames;
        File f = new File(str);
        pathnames = f.list();
        for (String pathname : pathnames) {
            System.out.println(pathname);

        }
    }


    //Implement a method to get specific files by extensions from a specified folder.
    private static void showByExtension(String str) {
        File file = new File(str);
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.toLowerCase().endsWith(".bat")) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        for (String f : list) {
            System.out.println(f);
        }
    }

    // Implement a method to check if a file or directory specified by pathname exists or not.
    private static void checkIfExist(String str) {
        File my_file_dir = new File(str);
        if (my_file_dir.exists()) {
            System.out.println("The file " + str +" exists.\n");
        } else {
            System.out.println("The directory or file does not exist.\n");
        }
    }
}





