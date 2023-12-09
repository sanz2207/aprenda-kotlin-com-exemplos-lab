// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

class Formacao(val nome: String, val nivel: Nivel, val conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} matriculado na formação $nome")
    }
}

fun main() {
    val conteudo1 = ConteudoEducacional("Introdução à Programação", 90)
    val conteudo2 = ConteudoEducacional("Estrutura de Dados", 120)
    val conteudo3 = ConteudoEducacional("Algoritmos Avançados", 150)

    val formacaoTI = Formacao("Formação em TI", Nivel.INTERMEDIARIO, listOf(conteudo1, conteudo2, conteudo3))

    val usuario1 = Usuario("Alice")
    val usuario2 = Usuario("Bob")

    formacaoTI.matricular(usuario1)
    formacaoTI.matricular(usuario2)
}

