package org.example;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.*;

public class App2 {
    public static void main(String[] args) throws IOException {
        Configuration conf = new Configuration();
        conf.set("fs.defaultFS", "hdfs://namenode:8020");
        FileSystem fs = FileSystem.get(conf);
        Path path = new Path("/file.txt");
        FSDataInputStream fos = fs.open(path);
        BufferedReader br = new BufferedReader(new InputStreamReader(fos));

        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        fs.close();

        //jar file path : C:\Users\Administrateur\.m2\repository\org\example\TP_1_HDFS
    }
}
