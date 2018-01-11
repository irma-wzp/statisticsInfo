package com.henghao.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileUtils
{
  public static void copyFile(String source, String target)
  {
    File sourceFile = new File(source);
    File targetFile = new File(target);
    try
    {
      InputStream in = new FileInputStream(sourceFile);
      OutputStream out = new FileOutputStream(targetFile);
      byte[] bytes = new byte['ࠀ'];
      int len = -1;
      while ((len = in.read(bytes)) != -1) {
        out.write(bytes, 0, len);
      }
      in.close();
      out.close();
    }
    catch (FileNotFoundException e)
    {
      e.printStackTrace();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }
}
