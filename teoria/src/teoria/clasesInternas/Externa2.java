package teoria.clasesInternas;

public class Externa2 {
    private int atributoInstanciaExterno;

    public Externa2(int atributoInstancia) {
        this.atributoInstanciaExterno = atributoInstancia;
    }

    public int getAtributoInstanciaExterno() {
        return atributoInstanciaExterno;
    }

    public void setAtributoInstanciaExterno(int atributoInstanciaExterno) {
        this.atributoInstanciaExterno = atributoInstanciaExterno;
    }

    public int sumarAtributoInternoYExternoDesdeExterna () {
        Interna2 interna2 = new Interna2(5);
        return atributoInstanciaExterno + interna2.getAtributoInstanciaInterno();
    }

    public class Interna2 {
        private int atributoInstanciaInterno;

        public Interna2(int atributoInstanciaInterno) {
            this.atributoInstanciaInterno = atributoInstanciaInterno;
        }

        public int getAtributoInstanciaInterno() {
            return atributoInstanciaInterno;
        }

        public void setAtributoInstanciaInterno(int atributoInstanciaInterno) {
            this.atributoInstanciaInterno = atributoInstanciaInterno;
        }

        public int sumarAtributoInternoYExternoDesdeInterna (){
            return atributoInstanciaInterno + atributoInstanciaExterno;
        }
    }
}
