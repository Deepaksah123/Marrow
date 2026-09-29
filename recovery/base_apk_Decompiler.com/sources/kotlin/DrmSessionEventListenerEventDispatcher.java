package kotlin;

import android.graphics.Color;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class DrmSessionEventListenerEventDispatcher {
    public static int AudioAttributesCompatParcelizer(int i, int i2) {
        return (i & 16777215) | ((i2 & 255) << 24);
    }

    static {
        Color.rgb(207, 248, 246);
        Color.rgb(TarConstants.CHKSUM_OFFSET, 212, 212);
        Color.rgb(136, 180, 187);
        Color.rgb(118, 174, 175);
        Color.rgb(42, 109, TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
        Color.rgb(217, 80, TsExtractor.TS_STREAM_TYPE_DTS);
        Color.rgb(254, 149, 7);
        Color.rgb(254, 247, 120);
        Color.rgb(106, 167, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO);
        Color.rgb(53, 194, 209);
        Color.rgb(64, 89, 128);
        Color.rgb(149, 165, 124);
        Color.rgb(217, 184, 162);
        Color.rgb(191, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO);
        Color.rgb(179, 48, 80);
        Color.rgb(193, 37, 82);
        Color.rgb(255, 102, 0);
        Color.rgb(245, 199, 0);
        Color.rgb(106, 150, 31);
        Color.rgb(179, 100, 53);
        Color.rgb(PsExtractor.AUDIO_STREAM, 255, 140);
        Color.rgb(255, 247, 140);
        Color.rgb(255, 208, 140);
        Color.rgb(140, 234, 255);
        Color.rgb(255, 140, 157);
        IconCompatParcelizer("#2ecc71");
        IconCompatParcelizer("#f1c40f");
        IconCompatParcelizer("#e74c3c");
        IconCompatParcelizer("#3498db");
    }

    private static int IconCompatParcelizer(String str) {
        int i = (int) Long.parseLong(str.replace("#", ""), 16);
        return Color.rgb((i >> 16) & 255, (i >> 8) & 255, i & 255);
    }

    public static List<Integer> read(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }
}
