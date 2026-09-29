package com.google.android.play.core.review;

import android.content.Context;
import kotlin.isCodecSupported;
import kotlin.readUint;
import kotlin.samplesHaveSupplementalData;

/* JADX INFO: loaded from: classes3.dex */
public class ReviewManagerFactory {
    public static isCodecSupported create(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new samplesHaveSupplementalData(new readUint(context));
    }

    private ReviewManagerFactory() {
    }
}
