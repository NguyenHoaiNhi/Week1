fun convertDNAtoRNA(DNA: String)
{ 
    for (x in DNA) {
  		when (x){
            'A' -> print("U")
            'T' -> print("A")
            'G' -> print("C")
            'C' -> print("G")

        }
    }
}


fun main() {
    

  	convertDNAtoRNA("GCTGCAGTACG")

}