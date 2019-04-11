package com.go.l.struct;

import java.util.HashMap;
import java.util.Map;

public class Trie {


    private final TrieNode root;

    public Trie() {
        root = new TrieNode();
    }


    //      ######## Trie Functions . ##########
    public static void insert(String word) {


    }

    public static void delete(String word) {

    }

    public void insertWords(String[] words) {

        TrieNode currNode = root;

        for (String word : words) {
            // Iterate Words.

            int level = word.length();

            for (int index = 0; index < level; index++) {
                // If current Map has the Character
                char currChar = word.charAt(index);
                if (currNode.children.containsKey(currChar)) {
                    currNode = currNode.children.get(currChar);

                } else {
                    // If current Map doesn't have the Character
                    TrieNode tmp = new TrieNode();
                    tmp.endOfWord = true;
                    currNode.children.put(currChar, tmp);
                    currNode.endOfWord = false;
                    currNode = tmp;

                }
            }
        }
    }

    public boolean search(String word) {

        boolean res = false;
        TrieNode currNode = root;
        if (!currNode.children.containsKey(word.charAt(0)) ||  currNode.children.isEmpty()) {
            return res;
        }


        for(int  i=0;i< word.length();i++){
            if(!currNode.children.containsKey(word.charAt(i))){
                return res;
            }else{
                currNode = currNode.children.get(word.charAt(i));
            }

        }
        return (currNode.endOfWord == true);
    }


/*
    public void printTrie(TrieNode root ) {
        TrieNode curr = root;

        for(Map.Entry e : root.children.entrySet()) {

            char  currChar =  (char)e.getKey();
            Map<Character,TrieNode> mp =  (Map<Character,TrieNode>)e.getValue();

            while (curr.endOfWord != true) {

            }
        }

    }*/

    public class TrieNode {

        Map<Character, TrieNode> children;
        boolean endOfWord;

        public TrieNode() {
            children = new HashMap<>();
            endOfWord = false;
        }
    }

}
