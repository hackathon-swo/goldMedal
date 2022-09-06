package com.hackathon.goldmedal.model;

public class Keyword {

    private String tipoCodificicacion;
    private String codigo;

    public Keyword(String tipoCodificicacion, String codigo) {
        this.tipoCodificicacion = tipoCodificicacion;
        this.codigo = codigo;
    }
    public String getTipoCodificicacion() {
        return tipoCodificicacion;
    }
    public void setTipoCodificicacion(String tipoCodificicacion) {
        this.tipoCodificicacion = "MD5";
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = "0010111010100111";
    }

    
    
}
