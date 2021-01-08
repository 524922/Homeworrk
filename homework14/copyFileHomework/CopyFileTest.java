package endTermHomeWork.homework14.copyFileHomework;

import copyFileHomework.CopyFile;

public class CopyFileTest {
    public static void main(String[] args) {
        //Ô´ÎÄ¼þ
        String srcPathStr="C:\\Users\\HC\\Desktop\\20-21 Academic Year\\Java\\javaTextbookExercises\\src\\copyFileHomework\\hello.txt";
        String desPathStr="C:\\Users\\HC\\Desktop\\20-21 Academic Year\\Java\\javaTextbookExercises\\src\\copyFileHomework\\world";
        copyFileHomework.CopyFile copyFile = new CopyFile();
        copyFile.copy(srcPathStr,desPathStr);
    }
}
