package com.example.imagenrandomkaren;


public class aleatorio {
    int imagen;
    String aleatorio;
    int sonido;

    public aleatorio(int imagen, String aleatorio, int sonido){
        this.imagen = imagen;
        this.aleatorio = aleatorio;
        this.sonido = sonido;
    }

    public int getImagen() {
        return imagen;
    }

    public String getAleatorio() {
        return aleatorio;
    }

    public int getSonido() {
        return sonido;
    }
}
