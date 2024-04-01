package org.example;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class App1 {
    public static void main(String[] args) throws IOException {
        Configuration conf = new Configuration();
        conf.set("fs.defaultFS", "hdfs://namenode:8020");
        FileSystem fs = FileSystem.get(conf);
        Path path = new Path("/file.txt");
        FSDataOutputStream fos = fs.create(path);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
        bw.write("Hello");
        bw.write("II-bdcc2");
        bw.write("end");
    }
}
