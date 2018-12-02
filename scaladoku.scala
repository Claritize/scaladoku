import scala.io.Source;

object scaladoku {

    def main(args: Array[String]): Unit = {
        
        val path = args(0);

        //Read initial puzzle state and store into array
        val initial = ("""\d+|\.""".r findAllIn Source.fromFile(path).getLines.mkString).toList.grouped(9).toList;

        //Recursive depth first state search
        def search(puzzle: List(List(Int))): Option[List(List(Int))] = {

            //Checks validity of generated puzzle states
            def valid(puzzle: List(List(Int))): Boolean = {

                //Check each 1x9 row
                

                //Check each 9x1 column

                //Check each 3x3 square
            }

            //Generate new valid state
            
        }
        

    }

}