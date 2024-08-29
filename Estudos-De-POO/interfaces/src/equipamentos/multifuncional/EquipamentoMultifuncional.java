package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{


    public void imprimir() {
       System.out.println("Imprimindo Via Equipamento Multifuncional");
    }


    public void digitalizar() {
        System.out.println("Digitalizando Via Equipamento Multifuncional");

    }
    
    public void copiar() {
        System.out.println("Copiando Via Equipamento Multifuncional");
    }
    
}
