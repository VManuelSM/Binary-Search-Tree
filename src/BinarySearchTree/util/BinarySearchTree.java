/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchTree.util;
import java.util.LinkedList;
import javax.swing.JPanel;

/**
 *
 * @author Víctor Manuel
 */
public class BinarySearchTree {
    int height;
    int nodesNumber;
    private Node root;

    public BinarySearchTree() {
        root = null;
    }
    public boolean alreadyExists(int datum){
        Node auxNode = root;
        while(auxNode != null){
            if(datum == auxNode.getDatum()){
                return true;
            } else if (datum < auxNode.getDatum()){
                auxNode = auxNode.getLeft();
            } else {
                auxNode = auxNode.getRight();
            }
        }
        return false;
    }
    public void addNode(int datum) {
        Node newNode = new Node(datum);
        putInNode(newNode, this.root);
    }
    public void putInNode(Node newNode, Node tree){
        if(root == null){
            root = newNode;
        } else {
            if(newNode.getDatum() <= tree.getDatum()){
                if(tree.getLeft() == null){
                    tree.setLeft(newNode);
                } else {
                    putInNode(newNode, tree.getLeft());
                }
            } else {
                if(tree.getRight() == null){
                    tree.setRight(newNode);
                } else {
                    putInNode(newNode, tree.getRight());
                }
            }
        }
    }
    
    public void deleteNode(int datum){
        Node aux = this.root;
        Node previous = null;
        int sideOfSubTree = 0;
        while(aux.getDatum() != datum){
            System.out.println("Si entró al while aux != datum");
        previous = aux;
        if(datum < aux.getDatum()){
            aux = aux.getLeft();
            sideOfSubTree = -1;
        } else{
            aux = aux.getRight();
            sideOfSubTree = 1;
        }
        }
        if(aux.getLeft() == null && aux.getRight() == null){
            if(sideOfSubTree == 0){
                aux = root = null;
            }
            if(sideOfSubTree == -1){ previous.setLeft(null);
            }else if (sideOfSubTree == 1){ previous.setRight(null);
            }   
        } else if(aux.getLeft() == null){ previous.setRight(aux.getRight());
        } else if(aux.getRight() == null){ previous.setLeft(aux.getLeft());
        } 
        else {
            Node replace = aux.getRight();
            previous = replace;
            while(replace.getLeft() != null){
                previous = replace;
                replace = replace.getLeft();
                
            }
            aux.setDatum(replace.getDatum());
                if(replace.getRight()==null){
                    replace = replace.getRight();
                }
                if(aux.getRight().getLeft()==null && aux.getRight().getRight() == null){
                    aux.setRight(null);
                }
                previous.setLeft(null);
        }
    }
    
    //Ordering
    //PreOrder
    public LinkedList preOrder(){
        LinkedList haul = new LinkedList();
        preOrder(root, haul);
        return haul;
    }
    public void preOrder(Node auxNode, LinkedList haul){
        if(auxNode!= null){
            haul.add(auxNode.getDatum());
            preOrder(auxNode.getLeft(), haul);
            preOrder(auxNode.getRight(), haul);
        }
    }
    //InOrder
    public LinkedList inOrder(){
        LinkedList haul = new LinkedList();
        inOrder(root, haul);
        return haul;
    }
    public void inOrder(Node auxNode, LinkedList haul){
        if(auxNode!= null){
            inOrder(auxNode.getLeft(), haul);
            haul.add(auxNode.getDatum());
            inOrder(auxNode.getRight(), haul);
        }
    }
    //PostOrder
    public LinkedList postOrder(){
        LinkedList haul = new LinkedList();
        postOrder(root, haul);
        return haul;
    }
    public void postOrder(Node auxNode, LinkedList haul){
        if(auxNode!= null){
            postOrder(auxNode.getLeft(), haul);
            postOrder(auxNode.getRight(), haul);
            haul.add(auxNode.getDatum());
        }
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    JPanel getDraw() {
        return new GraphicBinarySearchTree(this);
    }
    
}
