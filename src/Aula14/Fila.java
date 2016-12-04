package Aula14;
public class Fila {
    Doador inicio;
    Doador fim;
    int qtdDoador;

    Receptor Rinicio;
    Receptor Rfim;
    int qtdReceptor;
    Receptor Aux;
    public void addInicioReceptor(Receptor r){
        if(this.Rinicio==null) {
            this.Rinicio = r;
            this.Rfim = r;
            this.qtdReceptor++;
        }else{
            while (Rinicio!=null || Rinicio.receptorProximo.urgencia<r.urgencia){
                Aux = Rinicio.receptorProximo;
                Rinicio.receptorAnterior = r;
                Rinicio.receptorProximo = Aux;
            }
        }
    }
    public void addInicioDoador(Doador d){
        if(this.inicio==null) {
            this.inicio = d;
            this.fim = d;
            this.qtdDoador++;
        }else{
            this.fim.doadorProximo = d;
            d.doadorAnterior = this.fim;
        }
    }
}
