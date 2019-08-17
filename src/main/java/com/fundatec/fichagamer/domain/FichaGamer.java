package com.fundatec.fichagamer.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
public class FichaGamer {
    @Id
    private ObjectId _id;

    private String nickname;
    private String jogoFavorito;
    private String plataformaFavorita;
    private List<String> plataformasPossui;
    private String steamID;
    private String xboxID;
    private String psnID;
    private String nintendoID;

    public FichaGamer() {
        this.plataformasPossui = new ArrayList<>();
    }

    public FichaGamer(ObjectId _id, String nickname, String jogoFavorito, String plataformaFavorita,
                      String steamID, String xboxID, String psnID, String nintendoID) {
        this._id = _id;
        this.nickname = nickname;
        this.jogoFavorito = jogoFavorito;
        this.plataformaFavorita = plataformaFavorita;
        this.plataformasPossui = new ArrayList<>();
        this.steamID = steamID;
        this.xboxID = xboxID;
        this.psnID = psnID;
        this.nintendoID = nintendoID;
    }

    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getJogoFavorito() {
        return jogoFavorito;
    }

    public void setJogoFavorito(String jogoFavorito) {
        this.jogoFavorito = jogoFavorito;
    }

    public String getPlataformaFavorita() {
        return plataformaFavorita;
    }

    public void setPlataformaFavorita(String plataformaFavorita) {
        this.plataformaFavorita = plataformaFavorita;
    }

    public List<String> getPlataformasPossui() {
        return plataformasPossui;
    }

    public void addPlataformas(String plataforma) {
        this.plataformasPossui.add(plataforma);
    }

    public String getSteamID() {
        return steamID;
    }

    public void setSteamID(String steamID) {
        this.steamID = steamID;
    }

    public String getXboxID() {
        return xboxID;
    }

    public void setXboxID(String xboxID) {
        this.xboxID = xboxID;
    }

    public String getPsnID() {
        return psnID;
    }

    public void setPsnID(String psnID) {
        this.psnID = psnID;
    }

    public String getNintendoID() {
        return nintendoID;
    }

    public void setNintendoID(String nintendoID) {
        this.nintendoID = nintendoID;
    }
}
