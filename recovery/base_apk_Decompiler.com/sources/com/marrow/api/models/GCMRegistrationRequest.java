package com.marrow.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public class GCMRegistrationRequest {
    public static int AudioAttributesCompatParcelizer;
    public static int write;

    @JsonProperty("country")
    public String country;

    @JsonProperty("device_id")
    public String deviceId;

    @JsonProperty("notification_id")
    public String notificationId;

    @JsonProperty("platform")
    public String platform;

    public static int write() {
        int i = AudioAttributesCompatParcelizer;
        int i2 = i % 6768713;
        AudioAttributesCompatParcelizer = i + 1;
        if (i2 != 0) {
            return write;
        }
        int iNextInt = new Random().nextInt();
        write = iNextInt;
        return iNextInt;
    }
}
