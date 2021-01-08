package endTermHomeWork.homework14.copyFileHomework;

import java.io.*;

public class CopyFile2 {
    public void copy2(File src,File dest) throws IOException{
        InputStream inputStream=null;
        OutputStream outputStream=null;
        try {
            inputStream=new FileInputStream(src);
            outputStream=new FileOutputStream(dest);
            byte[] buff=new byte[1024];
            int read;
            while ((read=inputStream.read(buff))!=-1){
                outputStream.write(buff,0,read);
            }
        }finally {
            inputStream.close();
            outputStream.close();
        }
    }
}
