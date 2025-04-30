package KotlinCore

data class User(
    var name: String = "",
    var age: Int = 0,
    var email: String = ""
)

fun main() {
    val user = User().apply {
        name = "Shashwath"
        age = 33
        email = "kamathsh91@gmail.com"
    }

    user.also {
        println("User created with name:${it.name}, age:${it.age} and email: ${it.email}")
    }

    user.let {
        println("Sending email with ${it.email}")
    }

    val greeting = user.run {
        "Hello, $name! welcome!!"
    }

    println(greeting)

    val userInfo = with(user) {
        """
        ---- User Info ----
        Name: $name
        Age: $age
        Email: $email
        -------------------
        """.trimIndent()
    }

    println(userInfo)
}
