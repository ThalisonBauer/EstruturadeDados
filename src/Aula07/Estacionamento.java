package Aula07;

/**
 * Created by Thalison Bauer on 06/09/2016.
 */
public class Estacionamento {
    Carro[] vagas = new Carro[10];
    int topo;

    public void isInit()
    {
        this.topo=-1;
    }
    public boolean isEmpty()
    {
        if(this.topo==-1)
            return true;
        else
            return false;
    }
    public boolean isFull()
    {
        if(this.topo==10)
            return true;
        else
            return false;
    }
    public void addCarro(Carro car)
    {
        if(this.topo<10)
        {
            this.topo++;
            this.vagas[this.topo] = car;
        }
    }
    public Carro dellCarro()
    {
        if(this.topo >-1)
        {
            Carro r = this.vagas[this.topo];
            this.topo--;
            return r;
        }
        return null;
    }
    public void removCar(Carro car)
    { int pos = 0;
        if(isEmpty()==false)
        {
            for (int i=0;i>this.topo;i++)
            {
                if(car.placa .equalsIgnoreCase(this.vagas[this.topo].placa))
                {
                    pos = i;
                }
            }
        }

    }

}
