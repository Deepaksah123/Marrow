package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class NumberDeserializersBigIntegerDeserializer {
    public static int read;
    private int IconCompatParcelizer;
    private NumberDeserializersBigDecimalDeserializer MediaBrowserCompatCustomActionResultReceiver;
    private int RemoteActionCompatParcelizer;
    private NumberDeserializersBigDecimalDeserializer write;
    private int AudioAttributesImplApi21Parcelizer = 0;
    public boolean AudioAttributesCompatParcelizer = false;
    private ArrayList<NumberDeserializersBigDecimalDeserializer> AudioAttributesImplBaseParcelizer = new ArrayList<>();

    NumberDeserializersBigIntegerDeserializer(NumberDeserializersBigDecimalDeserializer numberDeserializersBigDecimalDeserializer, int i) {
        this.write = null;
        this.MediaBrowserCompatCustomActionResultReceiver = null;
        int i2 = read;
        this.IconCompatParcelizer = i2;
        read = i2 + 1;
        this.write = numberDeserializersBigDecimalDeserializer;
        this.MediaBrowserCompatCustomActionResultReceiver = numberDeserializersBigDecimalDeserializer;
        this.RemoteActionCompatParcelizer = i;
    }

    public final void RemoteActionCompatParcelizer(NumberDeserializersBigDecimalDeserializer numberDeserializersBigDecimalDeserializer) {
        this.AudioAttributesImplBaseParcelizer.add(numberDeserializersBigDecimalDeserializer);
        this.MediaBrowserCompatCustomActionResultReceiver = numberDeserializersBigDecimalDeserializer;
    }

    private long AudioAttributesCompatParcelizer(setIncludableProperties setincludableproperties, long j) {
        NumberDeserializersBigDecimalDeserializer numberDeserializersBigDecimalDeserializer = setincludableproperties.AudioAttributesImplApi26Parcelizer;
        if (numberDeserializersBigDecimalDeserializer instanceof NullifyingDeserializer) {
            return j;
        }
        int size = setincludableproperties.AudioAttributesCompatParcelizer.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            MapDeserializerMapReferring mapDeserializerMapReferring = setincludableproperties.AudioAttributesCompatParcelizer.get(i);
            if (mapDeserializerMapReferring instanceof setIncludableProperties) {
                setIncludableProperties setincludableproperties2 = (setIncludableProperties) mapDeserializerMapReferring;
                if (setincludableproperties2.AudioAttributesImplApi26Parcelizer != numberDeserializersBigDecimalDeserializer) {
                    jMax = Math.max(jMax, AudioAttributesCompatParcelizer(setincludableproperties2, ((long) setincludableproperties2.read) + j));
                }
            }
        }
        if (setincludableproperties != numberDeserializersBigDecimalDeserializer.MediaBrowserCompatMediaItem) {
            return jMax;
        }
        long jIconCompatParcelizer = j + numberDeserializersBigDecimalDeserializer.IconCompatParcelizer();
        return Math.max(Math.max(jMax, AudioAttributesCompatParcelizer(numberDeserializersBigDecimalDeserializer.write, jIconCompatParcelizer)), jIconCompatParcelizer - ((long) numberDeserializersBigDecimalDeserializer.write.read));
    }

    private long IconCompatParcelizer(setIncludableProperties setincludableproperties, long j) {
        NumberDeserializersBigDecimalDeserializer numberDeserializersBigDecimalDeserializer = setincludableproperties.AudioAttributesImplApi26Parcelizer;
        if (numberDeserializersBigDecimalDeserializer instanceof NullifyingDeserializer) {
            return j;
        }
        int size = setincludableproperties.AudioAttributesCompatParcelizer.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            MapDeserializerMapReferring mapDeserializerMapReferring = setincludableproperties.AudioAttributesCompatParcelizer.get(i);
            if (mapDeserializerMapReferring instanceof setIncludableProperties) {
                setIncludableProperties setincludableproperties2 = (setIncludableProperties) mapDeserializerMapReferring;
                if (setincludableproperties2.AudioAttributesImplApi26Parcelizer != numberDeserializersBigDecimalDeserializer) {
                    jMin = Math.min(jMin, IconCompatParcelizer(setincludableproperties2, ((long) setincludableproperties2.read) + j));
                }
            }
        }
        if (setincludableproperties != numberDeserializersBigDecimalDeserializer.write) {
            return jMin;
        }
        long jIconCompatParcelizer = j - numberDeserializersBigDecimalDeserializer.IconCompatParcelizer();
        return Math.min(Math.min(jMin, IconCompatParcelizer(numberDeserializersBigDecimalDeserializer.MediaBrowserCompatMediaItem, jIconCompatParcelizer)), jIconCompatParcelizer - ((long) numberDeserializersBigDecimalDeserializer.MediaBrowserCompatMediaItem.read));
    }

    public final long AudioAttributesCompatParcelizer(_long _longVar, int i) {
        long jIconCompatParcelizer;
        int i2;
        NumberDeserializersBigDecimalDeserializer numberDeserializersBigDecimalDeserializer = this.write;
        if (numberDeserializersBigDecimalDeserializer instanceof getMapClass) {
            if (((getMapClass) numberDeserializersBigDecimalDeserializer).MediaMetadataCompat != i) {
                return 0L;
            }
        } else if (i == 0) {
            if (!(numberDeserializersBigDecimalDeserializer instanceof NumberDeserializers)) {
                return 0L;
            }
        } else if (!(numberDeserializersBigDecimalDeserializer instanceof NumberDeserializersBooleanDeserializer)) {
            return 0L;
        }
        setIncludableProperties setincludableproperties = (i == 0 ? _longVar.MediaDescriptionCompat : _longVar.onPrepareFromUri).MediaBrowserCompatMediaItem;
        setIncludableProperties setincludableproperties2 = (i == 0 ? _longVar.MediaDescriptionCompat : _longVar.onPrepareFromUri).write;
        boolean zContains = this.write.MediaBrowserCompatMediaItem.AudioAttributesImplApi21Parcelizer.contains(setincludableproperties);
        boolean zContains2 = this.write.write.AudioAttributesImplApi21Parcelizer.contains(setincludableproperties2);
        long jIconCompatParcelizer2 = this.write.IconCompatParcelizer();
        if (zContains && zContains2) {
            long jAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.write.MediaBrowserCompatMediaItem, 0L);
            long jIconCompatParcelizer3 = IconCompatParcelizer(this.write.write, 0L);
            long j = jAudioAttributesCompatParcelizer - jIconCompatParcelizer2;
            if (j >= (-this.write.write.read)) {
                j += (long) this.write.write.read;
            }
            long j2 = ((-jIconCompatParcelizer3) - jIconCompatParcelizer2) - ((long) this.write.MediaBrowserCompatMediaItem.read);
            if (j2 >= this.write.MediaBrowserCompatMediaItem.read) {
                j2 -= (long) this.write.MediaBrowserCompatMediaItem.read;
            }
            float fWrite = this.write.MediaBrowserCompatItemReceiver.write(i);
            float f = fWrite > BitmapDescriptorFactory.HUE_RED ? (long) ((j2 / fWrite) + (j / (1.0f - fWrite))) : 0L;
            jIconCompatParcelizer = ((long) this.write.MediaBrowserCompatMediaItem.read) + ((long) ((f * fWrite) + 0.5f)) + jIconCompatParcelizer2 + ((long) ((f * (1.0f - fWrite)) + 0.5f));
            i2 = this.write.write.read;
        } else {
            if (zContains) {
                return Math.max(AudioAttributesCompatParcelizer(this.write.MediaBrowserCompatMediaItem, this.write.MediaBrowserCompatMediaItem.read), ((long) this.write.MediaBrowserCompatMediaItem.read) + jIconCompatParcelizer2);
            }
            if (zContains2) {
                return Math.max(-IconCompatParcelizer(this.write.write, this.write.write.read), ((long) (-this.write.write.read)) + jIconCompatParcelizer2);
            }
            jIconCompatParcelizer = this.write.IconCompatParcelizer() + ((long) this.write.MediaBrowserCompatMediaItem.read);
            i2 = this.write.write.read;
        }
        return jIconCompatParcelizer - ((long) i2);
    }
}
