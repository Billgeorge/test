fun orderString(input: String): String? {
    var output = ""
    var maxCount = 0
    var minCount = 1
    val totalCountMap = hashMapOf<Int, Char>()
    for (actualChar in input) {
        if (!output.contains(actualChar)) {
            val count = input.count { char -> actualChar == char }
            if (count <= minCount) {
                output = "$output"+"$actualChar".repeat(count)
                minCount=count
                continue
            }
            if (count >= maxCount) {
                output = "$actualChar".repeat(count)+"$output"
                if(count>maxCount){
                    totalCountMap[count] = actualChar
                }
                maxCount = count
                continue
            }
            if (totalCountMap.containsKey(count)) {
                val existingChar = totalCountMap[count]
                val indexToPut = output.indexOf(existingChar!!)+count
                output = if (indexToPut > output.length - 1) {
                    "$output"+"$actualChar".repeat(count)
                } else {
                    "${output.substring(0, indexToPut)}"+"$actualChar".repeat(count)+"${
                        output.substring(
                            indexToPut,
                            output.length
                        )
                    }"
                }
            }else{
                return null
            }
            totalCountMap[count] = actualChar
        }
    }
    return output
}