package com.eventosapp.appeventos.models;

import com.fasterxml.jackson.databind.DatabindException;

public class Evento {

    private String name;
    private String Local;
    private String data;
    private String horario;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocal() {
        return Local;
    }

    public void setLocal(String local) {
        Local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Evento() {
    }
}
