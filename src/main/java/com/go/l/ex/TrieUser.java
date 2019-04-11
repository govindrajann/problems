package com.go.l.ex;


public class TrieUser {


    public static void main(String[] args) {

        String[] inputWords = {"the", "an", "a", "answer", "theory", "manzana"};

        //  Intialize  a Trie
        Trie t = new Trie();
        t.insertWords(inputWords);
        System.out.println("Words inserted .");

        System.out.println("==== Check for Words =======");
        System.out.println(" the : => "+t.search("the"));
        System.out.println(" govind : => "+t.search("govind"));
        System.out.println(" manzana: => "+t.search("manzana"));


    }

}

