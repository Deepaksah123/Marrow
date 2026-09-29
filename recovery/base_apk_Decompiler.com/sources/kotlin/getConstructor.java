package kotlin;

import com.google.android.exoplayer2.extractor.avi.AviExtractor;
import kotlin.initExtraTracks;

/* JADX INFO: loaded from: classes2.dex */
final class getConstructor implements unwrapAndThrowAsIAE {
    public final initExtraTracks<unwrapAndThrowAsIAE> IconCompatParcelizer;
    private final int RemoteActionCompatParcelizer;

    public static getConstructor AudioAttributesCompatParcelizer(int i, AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        unwrapAndThrowAsIAE unwrapandthrowasiaeAudioAttributesCompatParcelizer;
        initExtraTracks.IconCompatParcelizer iconCompatParcelizer = new initExtraTracks.IconCompatParcelizer();
        int i2 = asPropertyTypeDeserializer.read();
        int iAudioAttributesCompatParcelizer = -2;
        while (asPropertyTypeDeserializer.IconCompatParcelizer() > 8) {
            int iMediaMetadataCompat = asPropertyTypeDeserializer.MediaMetadataCompat();
            int iWrite = asPropertyTypeDeserializer.write() + asPropertyTypeDeserializer.MediaMetadataCompat();
            asPropertyTypeDeserializer.AudioAttributesCompatParcelizer(iWrite);
            if (iMediaMetadataCompat == 1414744396) {
                unwrapandthrowasiaeAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(asPropertyTypeDeserializer.MediaMetadataCompat(), asPropertyTypeDeserializer);
            } else {
                unwrapandthrowasiaeAudioAttributesCompatParcelizer = read(iMediaMetadataCompat, iAudioAttributesCompatParcelizer, asPropertyTypeDeserializer);
            }
            if (unwrapandthrowasiaeAudioAttributesCompatParcelizer != null) {
                if (unwrapandthrowasiaeAudioAttributesCompatParcelizer.read() == 1752331379) {
                    iAudioAttributesCompatParcelizer = ((throwIfRTE) unwrapandthrowasiaeAudioAttributesCompatParcelizer).AudioAttributesCompatParcelizer();
                }
                iconCompatParcelizer.read(unwrapandthrowasiaeAudioAttributesCompatParcelizer);
            }
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite);
            asPropertyTypeDeserializer.AudioAttributesCompatParcelizer(i2);
        }
        return new getConstructor(i, iconCompatParcelizer.IconCompatParcelizer());
    }

    private getConstructor(int i, initExtraTracks<unwrapAndThrowAsIAE> initextratracks) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = initextratracks;
    }

    @Override // kotlin.unwrapAndThrowAsIAE
    public final int read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final <T extends unwrapAndThrowAsIAE> T RemoteActionCompatParcelizer(Class<T> cls) {
        getCurrentSampleFlags<unwrapAndThrowAsIAE> it = this.IconCompatParcelizer.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }

    private static unwrapAndThrowAsIAE read(int i, int i2, AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        switch (i) {
            case AviExtractor.FOURCC_strf /* 1718776947 */:
                return wrapperType.AudioAttributesCompatParcelizer(i2, asPropertyTypeDeserializer);
            case AviExtractor.FOURCC_avih /* 1751742049 */:
                return throwRootCauseIfIOE.IconCompatParcelizer(asPropertyTypeDeserializer);
            case AviExtractor.FOURCC_strh /* 1752331379 */:
                return throwIfRTE.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer);
            case AviExtractor.FOURCC_strn /* 1852994675 */:
                return getDeclaredAnnotations.write(asPropertyTypeDeserializer);
            default:
                return null;
        }
    }
}
