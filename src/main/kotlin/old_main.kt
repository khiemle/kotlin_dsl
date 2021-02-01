
fun main() {

    val html = HTML()

    val head = Head()
    head.title = "old title"
    html.children.add(head)

    val body = Body()
    body.content = "this is old content"
    html.children.add(body)

    println(html.toString())

}