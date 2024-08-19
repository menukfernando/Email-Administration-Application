/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailapp;

/**
 *
 * @author Menuk Fernando
 */
public class EmailApp {
    public static void main(String[] args) {
        Email em1 = new Email("Menuk", "Fernando");
        System.out.println(em1.showInfo());
    }
}
