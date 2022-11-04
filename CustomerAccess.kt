package classAndConstructor

class CustomerAccess {
    companion object {
        const val LEVEL = "INTERMEDIATE"
        @JvmStatic fun longin() = println("Login...")//어노테이션 표기 사용
    }
}