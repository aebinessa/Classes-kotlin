    fun main() {
        val lordOfRings = Book("Lord of the rings","JRR Tolkien", 2000)
        lordOfRings.getBookInfo()
    
}

class Book(var title: String, var author: String, var yearPublished: Int) {

    fun getBookInfo(){
        println("$title by $author $yearPublished")
    }
    
}