import org.apache.spark.{SparkConf, SparkContext}

object HelloApp extends App {

  println("Hello, world!")

  val sparkConf = new SparkConf()
  sparkConf.setAppName("hello-spark")
  sparkConf.setMaster(args.headOption.getOrElse("local"))

  val sc = new SparkContext(sparkConf)

  val str = "Hello, spark!"
  val rdd = sc.parallelize(str.toCharArray)
  println(rdd.collect().mkString(""))

}
