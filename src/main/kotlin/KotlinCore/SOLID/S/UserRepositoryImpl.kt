package KotlinCore.SOLID.S

class UserRepositoryImpl(private val userDao: UserDao) : UserRepository {
    override suspend fun insertUser(user: User) {
        userDao.insertUser(user)
    }

    override suspend fun getUser(id: String): User? {
        return userDao.getUser(id) ?: User("1234", "SK")
    }

    override suspend fun deleteUser(id: String) {
        userDao.deleteUser(id)
    }

}