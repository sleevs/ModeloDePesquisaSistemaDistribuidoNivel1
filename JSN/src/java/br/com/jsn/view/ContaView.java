/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jsn.view;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author jeison muniz
 * 
 * output enconding in custom tag
 * 
synchronization tokens as anti-CSRF mechanism 
page - level autorization
whitelist input validation 
* flagging tained variables
* 
 * 
 */
@Named(value = "contaView")
@SessionScoped
public class ContaView implements Serializable {

    /**
     * Creates a new instance of ContaView
     */
    public ContaView() {
    }
    
}
