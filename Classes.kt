    fun main() {
        val lordOfRings = Book("Lord of the rings","JRR Tolkien", 2000)
        lordOfRings.getBookInfo()
        val theHungerGames = fictionBook("the hunger games","abdullah bin essa",1990, "hunger games")
        theHungerGames.getBookInfo()
        theHungerGames.getFictionGenre()
        val fundemantalsOfCircuitAnalysis = nonFictionBook("fundamentals of circuit analysis", "Kendall L. Su", 1979," electricl engineering")
        fundemantalsOfCircuitAnalysis.getNonFictionGenre()
    
}

open class Book(val title: String, val author: String, val yearPublished: Int) {

    fun getBookInfo(){
        println("$title by $author $yearPublished")
    }
    
}

 class fictionBook(title: String, author: String, yearPublished: Int, val genre: String): Book(title,author,yearPublished){

    fun getFictionGenre(){
        println("$title by $author $yearPublished is a $genre book")
    }
 }

 class nonFictionBook(title: String, author: String, yearPublished: Int, val subject: String): Book(title,author,yearPublished){
    fun getNonFictionGenre(){
        println("$title by $author $yearPublished is a $subject book")
    }
 }