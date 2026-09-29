package com.google.android.exoplayer2.text;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.BundleableUtil;
import java.util.ArrayList;
import kotlin.initExtraTracks;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class CueDecoder {
    static final String BUNDLED_CUES = "c";

    public final initExtraTracks<Cue> decode(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
        parcelObtain.recycle();
        return BundleableUtil.fromBundleList(Cue.CREATOR, (ArrayList) Assertions.checkNotNull(bundle.getParcelableArrayList(BUNDLED_CUES)));
    }
}
