package oop.practice.lab1.task2;

public class TextData {
    private String fileName;
    private String text;
    private int numberOfVowels;
    private int numberOfConsonants;
    private int numberOfLetters;
    private int numberOfSentences;
    private String longestWord;

    public TextData(String text) {
        this.text = text;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public String getText() {
        return text;
    }

    public int getNumberOfVowels() {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = Character.toLowerCase(text.charAt(i));
            if(c=='a' || c=='e' || c=='i'||
                    c=='o' || c=='u'){
                count++;
            }
        }
        return count;
    }

    public int getNumberOfConsonants() {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = Character.toLowerCase(text.charAt(i));
            if(Character.isLetter(c) && c !='a'&& c!='e'&& c!='i'&&
                    c!='o' && c!='u'){
                count++;
            }
        }
        return count;
    }

    public int getNumberOfLetters() {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if(Character.isLetter(text.charAt(i))){
                count++;
            }
        }
        return count;
    }

    public int getNumberOfSentences() {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == '.' || text.charAt(i) == '!' || text.charAt(i) == '?'){
                count++;
            }
        }
        return count;
    }

    public String getLongestWord() {
        String[] words = text.split("\\W");
        String longestWord = "";
        for(String word : words){
            if(word.length() > longestWord.length()){
                longestWord = word;
            }
        }
        return longestWord;
    }


}

