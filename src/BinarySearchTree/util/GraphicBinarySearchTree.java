/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchTree.util;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.util.HashMap;
import javafx.scene.shape.Circle;
import javax.swing.JPanel;

/**
 *
 * @author Víctor Manuel
 */
public class GraphicBinarySearchTree extends JPanel {
    private HashMap nodesPositions;
    private HashMap subTreeSizes;
    private int parentToChild = 30;
    private int childToChild = 40;
    private FontMetrics fontMetrics;
    Font fuente=new Font("Courier", Font.PLAIN, 14);
    private BinarySearchTree searchBinaryTree;
    private boolean used;

    public GraphicBinarySearchTree(BinarySearchTree searchBinaryTree) {
        this.searchBinaryTree = searchBinaryTree;
        this.setBackground(Color.decode("#122f3f"));
        subTreeSizes = new HashMap();
        nodesPositions = new HashMap();
        this.used = true;
        repaint();
    }
    
    private void calculatePositions(){
        nodesPositions.clear();
        subTreeSizes.clear();
        Node root = this.searchBinaryTree.getRoot();
        if(root != null){
            calculateSubTreeSize(root);
            calculatePosition(root, Integer.MAX_VALUE,Integer.MAX_VALUE,0);
        }
    }
    private Dimension calculateSubTreeSize(Node node){
        if(node == null) return new Dimension (0,0);
        Dimension rightDimension = calculateSubTreeSize(node.getRight());
        Dimension leftDimension = calculateSubTreeSize(node.getLeft());
        Dimension dimension = new Dimension(fontMetrics.getHeight()+parentToChild+Math.max(leftDimension.height, rightDimension.height),leftDimension.height+childToChild+rightDimension.height);
        subTreeSizes.put(node, dimension);
        return dimension;
    }   
    private void calculatePosition(Node node, int left, int right, int top){
        if (node == null) return;
        
        Dimension leftDimension = (Dimension) subTreeSizes.get(node.getLeft());
        if(leftDimension == null) leftDimension = new Dimension(0,0);
        
        Dimension rightDimension = (Dimension) subTreeSizes.get(node.getRight());
        if(rightDimension == null) rightDimension = new Dimension(0,0);
        
        int center = 0;
        if (right != Integer.MAX_VALUE) center = right - rightDimension.width - childToChild/2;
        else if (left != Integer.MAX_VALUE) center = left + leftDimension.width + childToChild/2;
        
        int width = fontMetrics.stringWidth(node.getDatum()+"");
        
        nodesPositions.put(node, new Rectangle (center - width/2 - 3, top, width + 6, fontMetrics.getHeight()));
        calculatePosition(node.getLeft(), Integer.MAX_VALUE, center - childToChild/2, top + fontMetrics.getHeight() + parentToChild);
        calculatePosition(node.getRight(), center + childToChild/2, Integer.MAX_VALUE, top + fontMetrics.getHeight() + parentToChild);
    }
    private void drawTree (Graphics2D graphics2D, Node node, int xpoint, int ypoint, int ymoved){
        if (node == null) return;
        Rectangle rectangle = (Rectangle) nodesPositions.get(node);
        graphics2D.setFont(fuente);
       	FontMetrics fm=graphics2D.getFontMetrics();
        graphics2D.setColor(Color.WHITE);
        graphics2D.drawOval(rectangle.x,rectangle.y,rectangle.width,rectangle.height);
        graphics2D.drawString(node.getDatum()+"", rectangle.x+3, rectangle.y+ymoved);
        if (xpoint != Integer.MAX_VALUE)
            graphics2D.drawLine(xpoint, ypoint, (int)(rectangle.x+rectangle.width/2), rectangle.y);
            drawTree(graphics2D, node.getLeft(),(int)(rectangle.x+rectangle.width/2), rectangle.y + rectangle.height, ymoved);
            drawTree(graphics2D, node.getRight(),(int)(rectangle.x+rectangle.width/2), rectangle.y + rectangle.height, ymoved);
        
    }
    @Override
    public void paint (Graphics g) {
        super.paint(g);
        fontMetrics = g.getFontMetrics();
        if(used){
            calculatePositions();
            used = false;
        }
        Graphics2D graphics2D = (Graphics2D) g;
        graphics2D.translate(getWidth()/2, parentToChild);
        drawTree(graphics2D, this.searchBinaryTree.getRoot(),Integer.MAX_VALUE,Integer.MAX_VALUE, fontMetrics.getLeading() + fontMetrics.getAscent());
        fontMetrics = null;
    }
}

