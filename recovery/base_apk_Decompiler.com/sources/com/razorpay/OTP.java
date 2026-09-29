package com.razorpay;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public class OTP {
    String bank;
    String pin;
    String sender;

    OTP(String str, String str2, String str3) {
        this.pin = str;
        this.bank = str2;
        this.sender = str3;
        l$1_I$l$();
    }

    private void l$1_I$l$() {
        if (!Pattern.compile("^\\d").matcher(this.pin).find()) {
            this.pin = this.pin.substring(1);
        }
        if (Pattern.compile("\\d$").matcher(this.pin).find()) {
            return;
        }
        String str = this.pin;
        this.pin = str.substring(0, str.length() - 1);
    }

    String getBank() {
        return this.bank;
    }

    String getSender() {
        return this.sender;
    }

    String getPin() {
        return this.pin;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Pin: ");
        sb.append(this.pin);
        sb.append(" bank: ");
        sb.append(this.bank);
        sb.append(" sender: ");
        sb.append(this.sender);
        return sb.toString();
    }
}
