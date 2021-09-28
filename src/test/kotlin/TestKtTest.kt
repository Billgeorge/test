import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class TestKtTest{

    @Test
    fun `order short input happy path`(){
        val input = "aoNHQATeMNLuWC4vMdGgQpqMge7bit"
        val response = orderString(input)
        println(response)
        assertEquals(input.length,response!!.length)
    }
    @Test
    fun `order long input happy path`(){
        val input = "aoNHQATeMNLuWC4vMdGgQpqMge7bitaoNHQATeMNLuWC4vMdGgQpqMge7bitaoNHQATeMNLuWC4vMdGgQpqMge7bitaoNHQATeM" +
                "NLuWC4vMdGgQpqMge7bitaoNHQATeMNLuWC4vMdGgQpqMge7bitaoNHQATeMNLuWC4vMdGgQpqMge7bitaoNHQATeMNLuWC4vMdGg" +
                "QpqMge7bitaoNHQATeMNLuWC4vMdGgQpqMge7bitaoNHQATeMNLuWC4vMdGgQpqMge7bitaoNHQATeMNLuWC4vMdGgQpq" +
                "Mge7bitaoNHQATeMNLuWC4vMdGgQpqMge7bitaoNHQATeMNLuWC4vMdGgQpqMge7bitaoNHQATeMNLuWC4vMdGgQpqMge7b" +
                "itaoNHQATeMNLuWC4vMdGgQpqMge7bitaoNHQATeMNLuWC4vMdGgQpqMge7bitaoNHQATeMNLuWC4vMdGgQpqMge7bitaoNHQ" +
                "ATeMNLuWC4vMdGgQpqMge7bitaoNHQATeMNLuWC4vMdGgQpqMge7bitaoNHQATeMNLuWC4vMdGgQpqMge7bitaoNHQATeMNLuWC4vMdGgQpqMge7bit"
        val response = orderString(input)
        println(response)
        assertEquals(input.length,response!!.length)
    }


    @Test
    fun `empty string as input`(){
        val input = ""
        val response = orderString(input)
        println(response)
        assertEquals(input.length,response!!.length)
    }
}