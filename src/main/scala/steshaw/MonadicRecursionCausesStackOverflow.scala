//
// From: https://twitter.com/puffnfresh/status/620455136935030784
//

package steshaw

import scalaz._, Scalaz._

class MonadicRecursionCausesStackOverflow {
  (1 to 10000).toList.foldMapM[({type l[a]=Reader[Int, a]})#l,Int](n=>Reader(r=>r+n)).run(10)
}
