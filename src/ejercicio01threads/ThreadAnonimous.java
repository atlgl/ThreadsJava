/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01threads;

/**
 *
 * @author upam
 */
public class ThreadAnonimous {

    public Thread threada;
    public ThreadAnonimous() {
        threada=new Thread(){
            @Override
            public void run() {
                super.run();
                DibujarFrame df=new DibujarFrame();
                df.setVisible(true);

            }
          
        };
        threada.start();
     
    }
    
    
    
}
