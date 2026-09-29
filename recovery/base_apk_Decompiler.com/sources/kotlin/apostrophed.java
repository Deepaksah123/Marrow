package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.noTypeInfoBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class apostrophed {
    public final int AudioAttributesCompatParcelizer;
    public final int AudioAttributesImplApi21Parcelizer;
    public final int AudioAttributesImplApi26Parcelizer;
    public final int AudioAttributesImplBaseParcelizer;
    public final int IconCompatParcelizer;
    public final List<byte[]> MediaBrowserCompatCustomActionResultReceiver;
    public final int MediaBrowserCompatItemReceiver;
    public final float MediaMetadataCompat;
    public final int RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final String read;
    public final int write;

    public static apostrophed AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) throws SchemaAware {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String strIconCompatParcelizer;
        int i8;
        float f;
        try {
            asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(4);
            int iOnPlayFromMediaId = (asPropertyTypeDeserializer.onPlayFromMediaId() & 3) + 1;
            if (iOnPlayFromMediaId == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iOnPlayFromMediaId2 = asPropertyTypeDeserializer.onPlayFromMediaId() & 31;
            for (int i9 = 0; i9 < iOnPlayFromMediaId2; i9++) {
                arrayList.add(write(asPropertyTypeDeserializer));
            }
            int iOnPlayFromMediaId3 = asPropertyTypeDeserializer.onPlayFromMediaId();
            for (int i10 = 0; i10 < iOnPlayFromMediaId3; i10++) {
                arrayList.add(write(asPropertyTypeDeserializer));
            }
            if (iOnPlayFromMediaId2 > 0) {
                noTypeInfoBuilder.IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = noTypeInfoBuilder.AudioAttributesCompatParcelizer((byte[]) arrayList.get(0), iOnPlayFromMediaId, ((byte[]) arrayList.get(0)).length);
                int i11 = iconCompatParcelizerAudioAttributesCompatParcelizer.onAddQueueItem;
                int i12 = iconCompatParcelizerAudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver;
                int i13 = iconCompatParcelizerAudioAttributesCompatParcelizer.write;
                int i14 = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer;
                int i15 = iconCompatParcelizerAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
                int i16 = iconCompatParcelizerAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
                int i17 = iconCompatParcelizerAudioAttributesCompatParcelizer.read;
                int i18 = iconCompatParcelizerAudioAttributesCompatParcelizer.MediaMetadataCompat;
                float f2 = iconCompatParcelizerAudioAttributesCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler;
                strIconCompatParcelizer = inclusion.IconCompatParcelizer(iconCompatParcelizerAudioAttributesCompatParcelizer.onCustomAction, iconCompatParcelizerAudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer, iconCompatParcelizerAudioAttributesCompatParcelizer.MediaDescriptionCompat);
                i7 = i17;
                i8 = i18;
                f = f2;
                i4 = i14 + 8;
                i5 = i15;
                i6 = i16;
                i = i11;
                i2 = i12;
                i3 = i13 + 8;
            } else {
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = -1;
                i7 = -1;
                strIconCompatParcelizer = null;
                i8 = 16;
                f = 1.0f;
            }
            return new apostrophed(arrayList, iOnPlayFromMediaId, i, i2, i3, i4, i5, i6, i7, i8, f, strIconCompatParcelizer);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw SchemaAware.RemoteActionCompatParcelizer("Error parsing AVC config", e);
        }
    }

    private apostrophed(List<byte[]> list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.MediaBrowserCompatCustomActionResultReceiver = list;
        this.MediaBrowserCompatItemReceiver = i;
        this.RatingCompat = i2;
        this.AudioAttributesImplApi26Parcelizer = i3;
        this.AudioAttributesCompatParcelizer = i4;
        this.IconCompatParcelizer = i5;
        this.write = i6;
        this.RemoteActionCompatParcelizer = i7;
        this.AudioAttributesImplApi21Parcelizer = i8;
        this.AudioAttributesImplBaseParcelizer = i9;
        this.MediaMetadataCompat = f;
        this.read = str;
    }

    private static byte[] write(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        int iOnPrepare = asPropertyTypeDeserializer.onPrepare();
        int iWrite = asPropertyTypeDeserializer.write();
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(iOnPrepare);
        return inclusion.write(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), iWrite, iOnPrepare);
    }
}
