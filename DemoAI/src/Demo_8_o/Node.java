/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo_8_o;

public class Node {
    private Step parent;
    private Step childe;

    public Node(Step parent, Step childe) {
        this.parent = parent;
        this.childe = childe;
    }

    public Step getParent() {
        return parent;
    }

    public Step getChilde() {
        return childe;
    }
    
}
