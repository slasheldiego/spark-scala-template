package ScalaSparkTemplate.utils

import org.apache.spark.sql.SparkSession

class utils{
    def createSparkSession(master: String, appName: String): SparkSession = {
        val spark:SparkSession = SparkSession.builder()
            .master(master)
            .appName(appName)
            .getOrCreate() 
        return spark
    }
}