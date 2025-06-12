package KotlinCore.SOLID.S


interface UserDao {

    fun insertUser(user: User)

    fun getUser(id: String): User?

    fun deleteUser(id: String)
}