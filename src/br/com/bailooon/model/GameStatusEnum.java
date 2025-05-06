package br.com.bailooon.model;

public enum GameStatusEnum {

    NON_STARTED("nãi iniciado"),
    INCOMPLETE("incompleto"),
    COMPLETE("completo");


    private String label;

    GameStatusEnum(final String label){
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
