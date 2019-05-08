package com.jp.spark;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.SparkSession;

public class ReadWholeDirFile {

	public static void main(String[] args) throws Exception{
		SparkConf conf = new SparkConf()
				.setAppName("ReadWholeDirFile")
				.setMaster("local");
		JavaSparkContext sc = new JavaSparkContext(conf);
		JavaPairRDD<String,String> filenameContentRDD = sc.wholeTextFiles("/home/data");
		
		
	}
}
