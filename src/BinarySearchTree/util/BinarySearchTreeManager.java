/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchTree.util;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Víctor Manuel
 */
public class BinarySearchTreeManager {
    BinarySearchTree searchBinaryTree = new BinarySearchTree();

    public BinarySearchTreeManager() {
    }
    public String preOrder() {
        LinkedList orderedNodes = this.searchBinaryTree.preOrder();
        return (haul(orderedNodes, "Recorrido en PreOrden"));        
    }
    public String InOrder() {
        LinkedList orderedNodes = this.searchBinaryTree.inOrder();
        return (haul(orderedNodes, "Recorrido en InOrden"));        
    }
    public String postOrder() {
        LinkedList orderedNodes = this.searchBinaryTree.postOrder();
        return (haul(orderedNodes, "Recorrido en PostOrden"));        
    }

    private String haul(LinkedList orderedNodes, String tittle) {
        int i = 0;
        String haul = tittle + "\n";
        while(i< orderedNodes.size()){
            haul += "\n" + orderedNodes.get(i).toString()+"";
            i++;
        }
    return haul;
    }
    public void putInNode(int datum){
        if(!this.searchBinaryTree.alreadyExists(datum)){
            this.searchBinaryTree.addNode(datum);
        } else {
        JOptionPane.showMessageDialog(null, "El nodo ya existe dentro del árbol", "Error al insertar", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void putOffNode(int datum){
        if(this.searchBinaryTree.alreadyExists(datum)){
            this.searchBinaryTree.deleteNode(datum);
        } else {
        JOptionPane.showMessageDialog(null, "El nodo no existe dentro del árbol", "Error al borrar", JOptionPane.ERROR_MESSAGE);
        }
    }
    public JPanel getDraw(){
        return this.searchBinaryTree.getDraw();
    }
}
