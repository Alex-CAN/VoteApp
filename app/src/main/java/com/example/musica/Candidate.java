package com.example.musica;

class Candidate {
    private String name;
    private String party;
    private int img;

    public Candidate(String name, String party, int img) {
        this.name = name;
        this.party = party;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
