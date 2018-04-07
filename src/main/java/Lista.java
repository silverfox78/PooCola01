public class Lista {
    private Nodo primero;

    public void push(Nodo n){
        Nodo auxiliar = this.primero;
        while(!auxiliar.getSiguiente().equals(null)){
            auxiliar = auxiliar.getSiguiente();
        }
        auxiliar.setSiguiente(n);
    }

    public Nodo pop(){
        if (this.primero.equals(null)){
            return null;
        }
        Nodo retorno = this.primero;
        retorno.setSiguiente(null);
        this.primero = this.primero.getSiguiente();
        return retorno;
    }

    public Nodo peek(){
        return this.primero;
    }
}
