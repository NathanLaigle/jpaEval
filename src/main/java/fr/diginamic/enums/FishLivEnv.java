package fr.diginamic.enums;

public enum FishLivEnv {
    FRESH_WATER("fresh water"), SEA_WATER("sea water");

    private String env;

    private FishLivEnv(String env) {
        this.env = env;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

}
