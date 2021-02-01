
@DslMarker
annotation class HtmlTagMaker

@HtmlTagMaker
abstract class Element(val name: String) {
    override fun toString(): String {
        return "<$name>${getTagContent()}</$name>"
    }
    abstract fun getTagContent(): String
}

fun html(init: HTML.() -> Unit): HTML {
    val html = HTML()
    html.init()
    return html
}

class HTML: Element("html") {
    var children = arrayListOf<Element>()
    fun head(init: Head.() -> Unit): Head {
        val head = Head()
        head.apply(init)
        children.add(head)
        return head
    }
    fun body(init: Body.() -> Unit): Body {
        val body = Body()
        body.init()
        children.add(body)
        return body
    }

    override fun getTagContent(): String {
        return "\n" + children.joinToString(separator = "\n") {
            it.toString()
        } + "\n"
    }
}

class Body: Element("body") {
    var content: String = ""
    override fun getTagContent(): String {
        return content
    }
}

class Head: Element("head") {
    var title: String = ""
    override fun getTagContent(): String {
        return title
    }
}

