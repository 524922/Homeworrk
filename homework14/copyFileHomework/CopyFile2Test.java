package endTermHomeWork.homework14.copyFileHomework;

import copyFileHomework.CopyFile2;

import java.io.File;
import java.io.IOException;

public class CopyFile2Test {
    public static void main(String[] args) throws IOException {
        //Ô´ÎÄ¼þ
        File srcPathStr=new File("C:\\Users\\HC\\Desktop\\20-21 Academic Year\\Java\\javaTextbookExercises\\src\\copyFileHomework\\hello2.txt");
        File desPathStr=new File("C:\\Users\\HC\\Desktop\\20-21 Academic Year\\Java\\javaTextbookExercises\\src\\copyFileHomework\\world.txt");

        copyFileHomework.CopyFile2 copyFile2 = new CopyFile2();
        copyFile2.copy2(srcPathStr,desPathStr);
    }
}
