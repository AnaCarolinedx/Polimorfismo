/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rmimm
 */
interface InstrumentoMusical {
    void tocar();
}

class Guitarra implements InstrumentoMusical {
    public void tocar() {
        System.out.println("Guitarra tocando");
    }
}

class Piano implements InstrumentoMusical {
    public void tocar() {
        System.out.println("Piano tocando");
    }
}
