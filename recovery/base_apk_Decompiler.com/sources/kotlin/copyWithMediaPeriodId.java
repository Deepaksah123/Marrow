package kotlin;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class copyWithMediaPeriodId {
    private static /* synthetic */ int[] write;
    private final ExoPlaybackExceptionExternalSyntheticLambda0 AudioAttributesImplApi21Parcelizer;
    private final InputStream AudioAttributesImplApi26Parcelizer;
    private final getVolume MediaBrowserCompatMediaItem;
    private final lambdanew1 MediaBrowserCompatSearchResultReceiver;
    private final onExperimentalOffloadSchedulingEnabledChanged MediaDescriptionCompat;
    private final setVolume RatingCompat;
    private final ExoPlayerBuilder onAddQueueItem;
    private final onExperimentalSleepingForOffloadChanged onCustomAction;
    private final ExoPlayerAudioComponent read;
    private boolean IconCompatParcelizer = true;
    private boolean RemoteActionCompatParcelizer = true;
    private boolean AudioAttributesCompatParcelizer = true;
    private boolean AudioAttributesImplBaseParcelizer = true;
    private boolean MediaBrowserCompatItemReceiver = true;
    private boolean MediaBrowserCompatCustomActionResultReceiver = true;
    private boolean MediaMetadataCompat = false;

    private static /* synthetic */ int[] AudioAttributesImplApi21Parcelizer() {
        int[] iArr = write;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[lambdanew3.values().length];
        try {
            iArr2[lambdanew3.ARRAY.ordinal()] = 6;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[lambdanew3.BYTE_STRING.ordinal()] = 4;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[lambdanew3.INVALID.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[lambdanew3.MAP.ordinal()] = 7;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[lambdanew3.NEGATIVE_INTEGER.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[lambdanew3.SPECIAL.ordinal()] = 9;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[lambdanew3.TAG.ordinal()] = 8;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[lambdanew3.UNICODE_STRING.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[lambdanew3.UNSIGNED_INTEGER.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        write = iArr2;
        return iArr2;
    }

    private copyWithMediaPeriodId(InputStream inputStream) {
        Objects.requireNonNull(inputStream);
        this.AudioAttributesImplApi26Parcelizer = inputStream;
        this.onCustomAction = new onExperimentalSleepingForOffloadChanged(this, inputStream);
        this.MediaBrowserCompatMediaItem = new getVolume(this, inputStream);
        this.AudioAttributesImplApi21Parcelizer = new ExoPlaybackExceptionExternalSyntheticLambda0(this, inputStream);
        this.onAddQueueItem = new ExoPlayerBuilder(this, inputStream);
        this.read = new ExoPlayerAudioComponent(this, inputStream);
        this.RatingCompat = new setVolume(this, inputStream);
        this.MediaBrowserCompatSearchResultReceiver = new lambdanew1(this, inputStream);
        this.MediaDescriptionCompat = new onExperimentalOffloadSchedulingEnabledChanged(this, inputStream);
    }

    public static List<lambdanew10> write(byte[] bArr) throws ExoPlaybackExceptionType {
        return new copyWithMediaPeriodId(new ByteArrayInputStream(bArr)).AudioAttributesImplApi26Parcelizer();
    }

    private List<lambdanew10> AudioAttributesImplApi26Parcelizer() throws ExoPlaybackExceptionType {
        LinkedList linkedList = new LinkedList();
        while (true) {
            lambdanew10 lambdanew10Var = read();
            if (lambdanew10Var == null) {
                return linkedList;
            }
            linkedList.add(lambdanew10Var);
        }
    }

    public final lambdanew10 read() throws ExoPlaybackExceptionType {
        try {
            int i = this.AudioAttributesImplApi26Parcelizer.read();
            if (i == -1) {
                return null;
            }
            switch (AudioAttributesImplApi21Parcelizer()[lambdanew3.write(i).ordinal()]) {
                case 2:
                    return this.onCustomAction.write(i);
                case 3:
                    return this.MediaBrowserCompatMediaItem.write(i);
                case 4:
                    return this.AudioAttributesImplApi21Parcelizer.write(i);
                case 5:
                    return this.onAddQueueItem.write(i);
                case 6:
                    return this.read.write(i);
                case 7:
                    return this.RatingCompat.write(i);
                case 8:
                    lambdasetTrackSelector18 lambdasettrackselector18Write = this.MediaBrowserCompatSearchResultReceiver.write(i);
                    lambdanew10 lambdanew10Var = read();
                    if (lambdanew10Var == null) {
                        throw new ExoPlaybackExceptionType("Unexpected end of stream: tag without following data item.");
                    }
                    if (this.MediaBrowserCompatItemReceiver && lambdasettrackselector18Write.write() == 30) {
                        return IconCompatParcelizer(lambdanew10Var);
                    }
                    if (this.MediaBrowserCompatCustomActionResultReceiver && lambdasettrackselector18Write.write() == 38) {
                        return read(lambdanew10Var);
                    }
                    lambdanew10 lambdanew10VarAudioAttributesCompatParcelizer = lambdanew10Var;
                    while (lambdanew10VarAudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer()) {
                        lambdanew10VarAudioAttributesCompatParcelizer = lambdanew10VarAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
                    }
                    lambdanew10VarAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(lambdasettrackselector18Write);
                    return lambdanew10Var;
                case 9:
                    return this.MediaDescriptionCompat.IconCompatParcelizer(i);
                default:
                    throw new ExoPlaybackExceptionType("Not implemented major type ".concat(String.valueOf(i)));
            }
        } catch (IOException e) {
            throw new ExoPlaybackExceptionType(e);
        }
    }

    private static lambdanew10 read(lambdanew10 lambdanew10Var) throws ExoPlaybackExceptionType {
        if (!(lambdanew10Var instanceof lambdanew12)) {
            throw new ExoPlaybackExceptionType("Error decoding LanguageTaggedString: not an array");
        }
        lambdanew12 lambdanew12Var = (lambdanew12) lambdanew10Var;
        if (lambdanew12Var.RemoteActionCompatParcelizer().size() != 2) {
            throw new ExoPlaybackExceptionType("Error decoding LanguageTaggedString: array size is not 2");
        }
        lambdanew10 lambdanew10Var2 = lambdanew12Var.RemoteActionCompatParcelizer().get(0);
        if (!(lambdanew10Var2 instanceof lambdasetRenderersFactory16)) {
            throw new ExoPlaybackExceptionType("Error decoding LanguageTaggedString: first data item is not an UnicodeString");
        }
        lambdanew10 lambdanew10Var3 = lambdanew12Var.RemoteActionCompatParcelizer().get(1);
        if (!(lambdanew10Var3 instanceof lambdasetRenderersFactory16)) {
            throw new ExoPlaybackExceptionType("Error decoding LanguageTaggedString: second data item is not an UnicodeString");
        }
        return new lambdanew15((lambdasetRenderersFactory16) lambdanew10Var2, (lambdasetRenderersFactory16) lambdanew10Var3);
    }

    private static lambdanew10 IconCompatParcelizer(lambdanew10 lambdanew10Var) throws ExoPlaybackExceptionType {
        if (!(lambdanew10Var instanceof lambdanew12)) {
            throw new ExoPlaybackExceptionType("Error decoding RationalNumber: not an array");
        }
        lambdanew12 lambdanew12Var = (lambdanew12) lambdanew10Var;
        if (lambdanew12Var.RemoteActionCompatParcelizer().size() != 2) {
            throw new ExoPlaybackExceptionType("Error decoding RationalNumber: array size is not 2");
        }
        lambdanew10 lambdanew10Var2 = lambdanew12Var.RemoteActionCompatParcelizer().get(0);
        if (!(lambdanew10Var2 instanceof lambdanew6)) {
            throw new ExoPlaybackExceptionType("Error decoding RationalNumber: first data item is not a number");
        }
        lambdanew10 lambdanew10Var3 = lambdanew12Var.RemoteActionCompatParcelizer().get(1);
        if (!(lambdanew10Var3 instanceof lambdanew6)) {
            throw new ExoPlaybackExceptionType("Error decoding RationalNumber: second data item is not a number");
        }
        return new lambdanew8((lambdanew6) lambdanew10Var2, (lambdanew6) lambdanew10Var3);
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean IconCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final boolean MediaBrowserCompatItemReceiver() {
        return this.MediaMetadataCompat;
    }
}
