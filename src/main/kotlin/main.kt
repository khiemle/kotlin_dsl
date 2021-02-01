fun main() {
    val htmlSheet = html {
        head {
            title = "Le Quang Khiem"
        }
        body {
            content = "Body content"
        }
    }
    println(htmlSheet.toString())
}