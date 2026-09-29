package kotlin;

import java.util.Collections;
import java.util.List;
import kotlin.noTypeInfoBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class getRootCause {
    public final int AudioAttributesCompatParcelizer;
    public final int AudioAttributesImplApi21Parcelizer;
    public final int AudioAttributesImplApi26Parcelizer;
    public final List<byte[]> AudioAttributesImplBaseParcelizer;
    public final int IconCompatParcelizer;
    public final int MediaBrowserCompatCustomActionResultReceiver;
    public final int MediaBrowserCompatItemReceiver;
    public final int MediaBrowserCompatMediaItem;
    public final float RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final int read;
    public final String write;

    public static getRootCause write(AsPropertyTypeDeserializer asPropertyTypeDeserializer) throws SchemaAware {
        int i;
        int i2;
        try {
            asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(21);
            int iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId() & 3;
            int iOnPlayFromMediaId2 = asPropertyTypeDeserializer.onPlayFromMediaId();
            int iWrite = asPropertyTypeDeserializer.write();
            int i3 = 0;
            for (int i4 = 0; i4 < iOnPlayFromMediaId2; i4++) {
                asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(1);
                int iOnPrepare = asPropertyTypeDeserializer.onPrepare();
                for (int i5 = 0; i5 < iOnPrepare; i5++) {
                    int iOnPrepare2 = asPropertyTypeDeserializer.onPrepare();
                    i3 += iOnPrepare2 + 4;
                    asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(iOnPrepare2);
                }
            }
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite);
            byte[] bArr = new byte[i3];
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            float f = 1.0f;
            String strWrite = null;
            int i14 = 0;
            for (int i15 = 0; i15 < iOnPlayFromMediaId2; i15++) {
                int iOnPlayFromMediaId3 = asPropertyTypeDeserializer.onPlayFromMediaId();
                int iOnPrepare3 = asPropertyTypeDeserializer.onPrepare();
                int i16 = 0;
                while (i16 < iOnPrepare3) {
                    int iOnPrepare4 = asPropertyTypeDeserializer.onPrepare();
                    int i17 = iOnPlayFromMediaId2;
                    System.arraycopy(noTypeInfoBuilder.AudioAttributesCompatParcelizer, 0, bArr, i14, noTypeInfoBuilder.AudioAttributesCompatParcelizer.length);
                    int length = i14 + noTypeInfoBuilder.AudioAttributesCompatParcelizer.length;
                    System.arraycopy(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), asPropertyTypeDeserializer.write(), bArr, length, iOnPrepare4);
                    if ((iOnPlayFromMediaId3 & 63) == 33 && i16 == 0) {
                        noTypeInfoBuilder.write writeVarIconCompatParcelizer = noTypeInfoBuilder.IconCompatParcelizer(bArr, length, length + iOnPrepare4);
                        int i18 = writeVarIconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                        i7 = writeVarIconCompatParcelizer.MediaBrowserCompatMediaItem;
                        i8 = writeVarIconCompatParcelizer.write + 8;
                        i9 = writeVarIconCompatParcelizer.read + 8;
                        int i19 = writeVarIconCompatParcelizer.IconCompatParcelizer;
                        int i20 = writeVarIconCompatParcelizer.RemoteActionCompatParcelizer;
                        int i21 = writeVarIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver;
                        float f2 = writeVarIconCompatParcelizer.RatingCompat;
                        int i22 = writeVarIconCompatParcelizer.MediaDescriptionCompat;
                        i = iOnPlayFromMediaId3;
                        i2 = iOnPrepare3;
                        i6 = i18;
                        strWrite = inclusion.write(writeVarIconCompatParcelizer.MediaBrowserCompatSearchResultReceiver, writeVarIconCompatParcelizer.MediaMetadataCompat, writeVarIconCompatParcelizer.AudioAttributesImplApi26Parcelizer, writeVarIconCompatParcelizer.AudioAttributesImplBaseParcelizer, writeVarIconCompatParcelizer.AudioAttributesImplApi21Parcelizer, writeVarIconCompatParcelizer.MediaBrowserCompatItemReceiver);
                        i11 = i20;
                        i10 = i19;
                        i13 = i22;
                        f = f2;
                        i12 = i21;
                    } else {
                        i = iOnPlayFromMediaId3;
                        i2 = iOnPrepare3;
                    }
                    i14 = length + iOnPrepare4;
                    asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(iOnPrepare4);
                    i16++;
                    iOnPlayFromMediaId2 = i17;
                    iOnPlayFromMediaId3 = i;
                    iOnPrepare3 = i2;
                }
            }
            return new getRootCause(i3 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iOnPlayFromMediaId + 1, i6, i7, i8, i9, i10, i11, i12, f, i13, strWrite);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw SchemaAware.RemoteActionCompatParcelizer("Error parsing HEVC config", e);
        }
    }

    private getRootCause(List<byte[]> list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, int i9, String str) {
        this.AudioAttributesImplBaseParcelizer = list;
        this.MediaBrowserCompatCustomActionResultReceiver = i;
        this.MediaBrowserCompatMediaItem = i2;
        this.AudioAttributesImplApi26Parcelizer = i3;
        this.IconCompatParcelizer = i4;
        this.RemoteActionCompatParcelizer = i5;
        this.AudioAttributesCompatParcelizer = i6;
        this.read = i7;
        this.AudioAttributesImplApi21Parcelizer = i8;
        this.RatingCompat = f;
        this.MediaBrowserCompatItemReceiver = i9;
        this.write = str;
    }
}
