package KotlinCore.SOLID.S

interface EmailService {
    suspend fun sendEmail(user: User, message: String)
}