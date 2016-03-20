package com.platalytics.platform.custom

import org.apache.spark.sql.SQLContext
import org.apache.spark.sql.DataFrame
import org.apache.spark.SparkContext

import scala.collection.mutable.{ Map => MutMap }

/**
* Interface to implement a custom operation
* 
* @param inputData    Map of all the ancestor stages along with their DataFrame
* @param sparkContext
* @param sqlContext
* @param params       A mutable map containing all the process parameters (name, (value, type))
* @return DataFrame   Resultant DataFrame created by performing the operation
*/
trait Operation {
  def run(inputData: Map[Int, DataFrame],
          sparkContext: SparkContext,
          sqlContext: SQLContext,
          params: MutMap[String, (String, String)]): DataFrame
}
