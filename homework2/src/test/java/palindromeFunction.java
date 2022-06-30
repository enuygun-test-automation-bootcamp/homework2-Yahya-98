public class palindromeFunction {
    // A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward
    // Palindrom girilen değerin tersten ve düzden yazılışı aynı olan biçimdir
    public String Palindrome(String str) {
        String reverseStr = "";
        // The string going to reverse
        // Dizi tersine çevriliyor
        for (int i = str.length() - 1; i >= 0; --i) {

            reverseStr = reverseStr + str.charAt(i);

        }
        // If array and reverse array equals return true
        // Eğer dizi ve ters dizi birbirine eşitse doğru döndürür
        if (str.toLowerCase().equals(reverseStr.toLowerCase())){
            return "true";
        }
        // Else return false
        // Değilse yanlış döndürür
        return "false";
    }




}
