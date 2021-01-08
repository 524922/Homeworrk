package endTermHomeWork.homework14.copyFileHomework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {
    public void copy(String srcPathStr,String desPathStr){
        String newFileName=srcPathStr.substring(srcPathStr.lastIndexOf("\\")+1);
        System.out.println("source file:"+newFileName);
        desPathStr=desPathStr+ File.separator+newFileName;
        System.out.println("Ŀ���ļ���ַ��"+desPathStr);
        try {
            //����������
            FileInputStream fileInputStream=new FileInputStream(srcPathStr);
            //���������
            FileOutputStream fileOutputStream=new FileOutputStream(desPathStr);
            //�ֽ����飬���˹���
            byte[] data =new byte[1024];
            int len=0;
            //��û������������
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
