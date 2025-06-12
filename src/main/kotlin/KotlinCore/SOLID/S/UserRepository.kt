package KotlinCore.SOLID.S

interface UserRepository {

    suspend fun insertUser(user: User)
    suspend fun getUser(id: String): User?
    suspend fun deleteUser(id: String)
}