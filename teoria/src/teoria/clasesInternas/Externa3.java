package teoria.clasesInternas;

public class Externa3 {
    private float atributoInstanciaExterno;

    public Externa3(float atributoInstanciaExterno) {
        this.atributoInstanciaExterno = atributoInstanciaExterno;
    }

    public float getAtributoInstanciaExterno() {
        return atributoInstanciaExterno;
    }

    public void setAtributoInstanciaExterno(float atributoInstanciaExterno) {
        this.atributoInstanciaExterno = atributoInstanciaExterno;

    }
    public float metodoLocal () {
        final int valor = 4;

        class Interna3 {
            private float atributoInstanciaInterno;

            public Interna3(float atributoInstanciaInterno) {
                this.atributoInstanciaInterno = atributoInstanciaInterno;
            }

            public float getAtributoInstanciaInterno() {
                return atributoInstanciaInterno;
            }
            public float  sumarAtributoInternoYExternoDesdeInterna (){
                return atributoInstanciaInterno + atributoInstanciaExterno;
            }

            public void setAtributoInstanciaInterno(float atributoInstanciaInterno) {
                this.atributoInstanciaInterno = atributoInstanciaInterno;
            }

        }
        Interna3 interna3 = new Interna3(2.2f);
        return interna3.sumarAtributoInternoYExternoDesdeInterna();
    }
}
