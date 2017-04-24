val w: String = "Abcdabcd"
for ( word <- w groupBy(ch => ch.toLower)) yield (word._1, word._2.length)