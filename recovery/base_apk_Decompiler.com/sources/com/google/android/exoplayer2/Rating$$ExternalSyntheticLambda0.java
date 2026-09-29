package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Rating$$ExternalSyntheticLambda0 implements Bundleable.Creator {
    public static int AudioAttributesCompatParcelizer;
    public static int read;

    public static int write() {
        int i = AudioAttributesCompatParcelizer;
        int i2 = i % 5717726;
        AudioAttributesCompatParcelizer = i + 1;
        if (i2 != 0) {
            return read;
        }
        int iNextInt = new Random().nextInt();
        read = iNextInt;
        return iNextInt;
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public final Bundleable fromBundle(Bundle bundle) {
        return Rating.fromBundle(bundle);
    }
}
