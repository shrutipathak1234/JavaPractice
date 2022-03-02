package com.udemy.Section14;
import java.io.*;

public class Exercise180 {
    public static void main(String[] args)throws IOException{
        FileInputStream in=null;
        FileOutputStream out=null;
        try{
            in = new FileInputStream("input.pdf");
            out=new FileOutputStream("output.pdf");
            int c;
            while((c = in.read())!=-1){
                out.write(c);
            }
        }
        finally {
            {
                if (in != null) {

                    in.close();
                }
                if (out != null) {

                    out.close();
                }
            }
        }
    }

}