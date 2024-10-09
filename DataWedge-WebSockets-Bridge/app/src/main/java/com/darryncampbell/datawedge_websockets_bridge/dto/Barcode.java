package com.darryncampbell.datawedge_websockets_bridge.dto;

import android.support.annotation.NonNull;

public class Barcode {

    private String action;
    private String barcode;
    private String barcodeType;

    public Barcode(String action, String barcode, String barcodeType) {
        this.action = action;
        this.barcode = barcode;
        this.barcodeType = barcodeType;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getBarcodeType() {
        return barcodeType;
    }

    public void setBarcodeType(String barcodeType) {
        this.barcodeType = barcodeType;
    }

    @NonNull
    @Override
    public String toString() {
        return "Barcode [action=" + action + ", barcode=" + barcode + ", barcodeType=" + barcodeType + "]";
    }
}
