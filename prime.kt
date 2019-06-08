import kotlin.math.*

fun main(args: Array<String>) {
	val n = Integer.parseInt(readLine())
	for(i in 2..n) {
		if(isPrime(i)) {
			if(i > 2) {
				print(", ")
			}
			print(i)
		}
	}
	println("")
}

fun isPrime(n: Int): Boolean {
	if(n < 2) {
		return false
	}
	for(i in 2..sqrt(n.toDouble()).toInt()) {
		if(n % i == 0) {
			return false
		}
	}
	return true
}
