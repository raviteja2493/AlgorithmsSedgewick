package Implementations.LinkedLists;

/**
 * Created by ravi on 8/31/16.
 */
public class BST<Key extends Comparable<Key>,Value>{
    private Node root;
    private class Node{
        private Key key;
        private Value val;
        private Node left;
        private Node right;
        private int N;

        public Node(Key key,Value val,int N){
            this.key = key;
            this.val = val;
            this.N = N;
        }
    }

    public int size(){
        return size(root);
    }

    private  int size(Node x){
        if(x==null) return 0;
        return x.N;
    }




    /*public Value get(Key key){
        Node x = this.root;
        while(x!=null){
            if(x.key.compareTo(key)==0){
                return x.val;
            }else if(x.key.compareTo(key)>0){
                x = x.left;
            }else{
                x = x.right;
            }
        }
        return null;
    }

    public void put(Key key,Value val){
        Node x = this.root;
        Node newNode = new Node(key,val,1);
        if(x==null){
            this.root = newNode;
            return;
        }
        while(x!=null){
            if(x.key.compareTo(key)>0){
                if(x.left==null){
                    x.left = newNode;
                    x.N += 1;
                    x = null;
                }else{
                    x = x.left;
                }
            }else{
                if(x.right==null){
                    x.right = newNode;
                    x = null;
                    x.N += 1;
                }else{
                    x = x.right;
                }
            }
        }
    }
*/


    public Value get(Key key){
        return get(root,key);
    }

    private Value get(Node x, Key key){
        if (x == null) {
            return null;
        }
        int cmp = x.key.compareTo(key);
        if(cmp>0){
            return get(x.left,key);
        }else if(cmp<0){
            return get(x.right,key);
        }else{
            return x.val;
        }
    }

    public void put(Key key,Value val){
       root = put(root,key,val);
    }

    private Node put(Node x,Key key,Value val){
        if(x == null){
            return new Node(key,val,1);
        }else {
            int cmp = x.key.compareTo(key);
            if (cmp > 0) {
                x.left = put(x.left, key, val);
            } else if(cmp < 0){
                x.right = put(x.right, key, val);
            }else{
                x.val = val;
            }
            x.N = size(x.left) + size(x.right) + 1;
            return x;
        }
    }






}
