package endTermHomeWork.homework14.copyFileHomework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {
    public void copy(String srcPathStr,String desPathStr){
        String newFileName=srcPathStr.substring(srcPathStr.lastIndexOf("\\")+1);
        System.out.println("source file:"+newFileName);
        desPathStr=desPathStr+ File.separator+newFileName;
        System.out.println("目标文件地址："+desPathStr);
        try {
            //输入流对象
            FileInputStream fileInputStream=new FileInputStream(srcPathStr);
            //输出流对象
            FileOutputStream fileOutputStream=new FileOutputStream(desPathStr);
            //字节数组，搬运工具
            byte[] data =new byte[1024];
            int len=0;
            //还没读到最后的数据
            while ((len=fileInputStream.read(data))!=-1){ 
                fileOutputStream.write(data,0,len);
            }
            fileInputStream.close();
            fileOutputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
