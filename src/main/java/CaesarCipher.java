public class CaesarCipher {

    private String text;
    private Integer key;
    private String cipherText;
    private String plainText;


    public CaesarCipher(String text, Integer key){
        this.key = key;
        this.text = text;
        this.cipherText = encode();
        this.plainText = decode();
    }

    public String getText() {
        return text;
    }

    public Integer getKey() {
        return key;
    }

    public String getCipherText(){ return cipherText;}

    public String getPlainText(){ return plainText;}

    public String encode() {

        String resultText = "";
        if (key > 26) {
            key = key % 26;
        }
        else if (key < 0) {
            key = (key % 26) + 26;
        }

        for(int i = 0; i < text.length(); i++){
            char letter = text.charAt(i);
            if (Character.isLetter(letter)){
                if (Character.isLowerCase(letter)) {
                    char c = (char) (letter + key);
                    if (c > 'z') {
                        resultText += (char) (letter - (26 - key));
                    }
                    else {
                        resultText += c;
                    }
                }
                else if (Character.isUpperCase(letter)){
                    char c = (char) + (letter + key);
                    if (c >'Z'){
                        resultText += (char)(letter -(26 - key));
                    }
                    else {
                        resultText += c;
                    }
                }
            }
            else {
                resultText += letter;
            }
        }
        return resultText;
    }

    public String decode(){
        String resultText = "";
        if (key > 26) {
            key = key % 26;
        }
        else if (key < 0) {
            key = (key % 26) + 26;
        }
        for(int i = 0; i < text.length(); i++){
            char letter = text.charAt(i);
            if (Character.isLetter(letter)){
                if (Character.isLowerCase(letter)) {
                    char c = (char) (letter - key);
                    if (c < 'a') {
                        resultText += (char) (letter + (26 - key));
                    }
                    else {
                        resultText += c;
                    }
                }
                else if (Character.isUpperCase(letter)){
                    char c = (char) + (letter - key);
                    if (c <'A'){
                        resultText += (char)(letter +(26 - key));
                    }
                    else {
                        resultText += c;
                    }
                }
            }
            else {

                resultText += letter;
            }
        }
        return resultText;
    }
}
