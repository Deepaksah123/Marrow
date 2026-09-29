package kotlin;

import android.graphics.PointF;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Format1;

/* JADX INFO: loaded from: classes2.dex */
public final class r8lambdaX7nl7LhRRR7vAUSsFRuS_B99As implements copyWithCryptoType<setMediaItemsInternal> {
    public static final r8lambdaX7nl7LhRRR7vAUSsFRuS_B99As write = new r8lambdaX7nl7LhRRR7vAUSsFRuS_B99As();
    private static final Format1.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer = Format1.AudioAttributesCompatParcelizer.write("c", "v", CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, "o");

    @Override // kotlin.copyWithCryptoType
    public final /* synthetic */ setMediaItemsInternal AudioAttributesCompatParcelizer(Format1 format1, float f) throws IOException {
        return write(format1, f);
    }

    private r8lambdaX7nl7LhRRR7vAUSsFRuS_B99As() {
    }

    private static setMediaItemsInternal write(Format1 format1, float f) throws IOException {
        if (format1.MediaBrowserCompatMediaItem() == Format1.IconCompatParcelizer.BEGIN_ARRAY) {
            format1.read();
        }
        format1.AudioAttributesCompatParcelizer();
        List<PointF> listIconCompatParcelizer = null;
        List<PointF> listIconCompatParcelizer2 = null;
        List<PointF> listIconCompatParcelizer3 = null;
        boolean zMediaBrowserCompatItemReceiver = false;
        while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
            int iAudioAttributesCompatParcelizer = format1.AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer);
            if (iAudioAttributesCompatParcelizer == 0) {
                zMediaBrowserCompatItemReceiver = format1.MediaBrowserCompatItemReceiver();
            } else if (iAudioAttributesCompatParcelizer == 1) {
                listIconCompatParcelizer = setPlayWhenReadyChangeReason.IconCompatParcelizer(format1, f);
            } else if (iAudioAttributesCompatParcelizer == 2) {
                listIconCompatParcelizer2 = setPlayWhenReadyChangeReason.IconCompatParcelizer(format1, f);
            } else if (iAudioAttributesCompatParcelizer == 3) {
                listIconCompatParcelizer3 = setPlayWhenReadyChangeReason.IconCompatParcelizer(format1, f);
            } else {
                format1.MediaDescriptionCompat();
                format1.RatingCompat();
            }
        }
        format1.IconCompatParcelizer();
        if (format1.MediaBrowserCompatMediaItem() == Format1.IconCompatParcelizer.END_ARRAY) {
            format1.write();
        }
        if (listIconCompatParcelizer == null || listIconCompatParcelizer2 == null || listIconCompatParcelizer3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (listIconCompatParcelizer.isEmpty()) {
            return new setMediaItemsInternal(new PointF(), false, Collections.emptyList());
        }
        int size = listIconCompatParcelizer.size();
        PointF pointF = listIconCompatParcelizer.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = listIconCompatParcelizer.get(i);
            int i2 = i - 1;
            arrayList.add(new isLoadingPossible(setColorInfo.AudioAttributesCompatParcelizer(listIconCompatParcelizer.get(i2), listIconCompatParcelizer3.get(i2)), setColorInfo.AudioAttributesCompatParcelizer(pointF2, listIconCompatParcelizer2.get(i)), pointF2));
        }
        if (zMediaBrowserCompatItemReceiver) {
            PointF pointF3 = listIconCompatParcelizer.get(0);
            int i3 = size - 1;
            arrayList.add(new isLoadingPossible(setColorInfo.AudioAttributesCompatParcelizer(listIconCompatParcelizer.get(i3), listIconCompatParcelizer3.get(i3)), setColorInfo.AudioAttributesCompatParcelizer(pointF3, listIconCompatParcelizer2.get(0)), pointF3));
        }
        return new setMediaItemsInternal(pointF, zMediaBrowserCompatItemReceiver, arrayList);
    }
}
