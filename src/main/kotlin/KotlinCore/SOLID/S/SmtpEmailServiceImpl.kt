package KotlinCore.SOLID.S

class SmtpEmailServiceImpl : EmailService {
    override suspend fun sendEmail(user: User, message: String) {
        println("Sending email from $user with message $message")
    }
}