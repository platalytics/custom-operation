package com.platalytics.platform.custom

import org.apache.spark.sql.SQLContext
import org.apache.spark.sql.DataFrame
import org.apache.spark.SparkContext

import scala.collection.mutable.{ Map => MutMap }

trait Operation {
  def run(inputData: Map[Int, DataFrame],
          sparkContext: SparkContext,
          sqlContext: SQLContext,
          params: MutMap[String, (String, String)]): DataFrame
}