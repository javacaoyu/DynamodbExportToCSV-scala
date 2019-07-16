import java.io.File

import com.typesafe.config.{Config, ConfigFactory}


object DynamodbExporter{
  def main(args:Array[String]): Unit = {
    if(args.length <= 0){
      println("You are not given any parameters for main class when it running, " +
        "The program will be exit in time.")
      println("Usage: p1 is the config file path[eg: ~/app/config.conf]")
      shutdown()
    }
    val config = getConfig(args(0).toString)


  }

  def configVerify(config: Config): Boolean = {



    true
  }

  /*
  Get config object from given config file path...
  Using typesafe.config
   */
  def getConfig(path: String): Config = {
    val configFile = new File(path)
    if (!configFile.exists) {
      println(s"File $path is not exists...exit...")
      shutdown()
    }

    ConfigFactory.parseFile(configFile)
  }

  def shutdown(): Unit ={
    sys.exit
  }


}
