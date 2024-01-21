    fun main() {
        val lordOfRings = Book("Lord of the rings","JRR Tolkien", 2000)
        lordOfRings.getBookInfo()
    
}

class Book(val title: String, val author: String, val yearPublished: Int) {

    fun getBookInfo(){
        println("$title by $author $yearPublished")
    }
    
}