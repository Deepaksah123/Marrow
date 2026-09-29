package kotlin;

import com.google.android.exoplayer2.extractor.avi.AviExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import kotlin.C0170format;

/* JADX INFO: loaded from: classes2.dex */
final class wrapperType implements unwrapAndThrowAsIAE {
    public final C0170format RemoteActionCompatParcelizer;

    @Override // kotlin.unwrapAndThrowAsIAE
    public final int read() {
        return AviExtractor.FOURCC_strf;
    }

    public static unwrapAndThrowAsIAE AudioAttributesCompatParcelizer(int i, AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        if (i == 2) {
            return RemoteActionCompatParcelizer(asPropertyTypeDeserializer);
        }
        if (i == 1) {
            return write(asPropertyTypeDeserializer);
        }
        StringBuilder sb = new StringBuilder("Ignoring strf box for unsupported track type: ");
        sb.append(LaissezFaireSubTypeValidator.MediaBrowserCompatItemReceiver(i));
        prune.RemoteActionCompatParcelizer("StreamFormatChunk", sb.toString());
        return null;
    }

    private wrapperType(C0170format c0170format) {
        this.RemoteActionCompatParcelizer = c0170format;
    }

    private static unwrapAndThrowAsIAE RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(4);
        int iMediaMetadataCompat = asPropertyTypeDeserializer.MediaMetadataCompat();
        int iMediaMetadataCompat2 = asPropertyTypeDeserializer.MediaMetadataCompat();
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(4);
        int iMediaMetadataCompat3 = asPropertyTypeDeserializer.MediaMetadataCompat();
        String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(iMediaMetadataCompat3);
        if (strRemoteActionCompatParcelizer == null) {
            prune.RemoteActionCompatParcelizer("StreamFormatChunk", "Ignoring track with unsupported compression ".concat(String.valueOf(iMediaMetadataCompat3)));
            return null;
        }
        C0170format.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new C0170format.RemoteActionCompatParcelizer();
        remoteActionCompatParcelizer.onFastForward(iMediaMetadataCompat).MediaBrowserCompatItemReceiver(iMediaMetadataCompat2).AudioAttributesImplApi26Parcelizer(strRemoteActionCompatParcelizer);
        return new wrapperType(remoteActionCompatParcelizer.IconCompatParcelizer());
    }

    private static unwrapAndThrowAsIAE write(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        int iOnCustomAction = asPropertyTypeDeserializer.onCustomAction();
        String strWrite = write(iOnCustomAction);
        if (strWrite == null) {
            prune.RemoteActionCompatParcelizer("StreamFormatChunk", "Ignoring track with unsupported format tag ".concat(String.valueOf(iOnCustomAction)));
            return null;
        }
        int iOnCustomAction2 = asPropertyTypeDeserializer.onCustomAction();
        int iMediaMetadataCompat = asPropertyTypeDeserializer.MediaMetadataCompat();
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(6);
        int iAudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer.onCustomAction());
        int iOnCustomAction3 = asPropertyTypeDeserializer.IconCompatParcelizer() > 0 ? asPropertyTypeDeserializer.onCustomAction() : 0;
        byte[] bArr = new byte[iOnCustomAction3];
        asPropertyTypeDeserializer.write(bArr, 0, iOnCustomAction3);
        C0170format.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new C0170format.RemoteActionCompatParcelizer();
        remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer(strWrite).read(iOnCustomAction2).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(iMediaMetadataCompat);
        if (MimeTypes.AUDIO_RAW.equals(strWrite) && iAudioAttributesCompatParcelizer != 0) {
            remoteActionCompatParcelizer.RatingCompat(iAudioAttributesCompatParcelizer);
        }
        if (MimeTypes.AUDIO_AAC.equals(strWrite) && iOnCustomAction3 > 0) {
            remoteActionCompatParcelizer.RemoteActionCompatParcelizer(initExtraTracks.read(bArr));
        }
        return new wrapperType(remoteActionCompatParcelizer.IconCompatParcelizer());
    }

    private static String write(int i) {
        if (i == 1) {
            return MimeTypes.AUDIO_RAW;
        }
        if (i == 85) {
            return MimeTypes.AUDIO_MPEG;
        }
        if (i == 255) {
            return MimeTypes.AUDIO_AAC;
        }
        if (i == 8192) {
            return MimeTypes.AUDIO_AC3;
        }
        if (i != 8193) {
            return null;
        }
        return MimeTypes.AUDIO_DTS;
    }

    private static String RemoteActionCompatParcelizer(int i) {
        switch (i) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return MimeTypes.VIDEO_MP4V;
            case 826496577:
            case 828601953:
            case 875967048:
                return MimeTypes.VIDEO_H264;
            case 842289229:
                return MimeTypes.VIDEO_MP42;
            case 859066445:
                return MimeTypes.VIDEO_MP43;
            case 1196444237:
            case 1735420525:
                return MimeTypes.VIDEO_MJPEG;
            default:
                return null;
        }
    }
}
