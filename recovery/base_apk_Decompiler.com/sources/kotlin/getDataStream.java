package kotlin;

import com.marrow.data.models.ResponseError;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\r"}, d2 = {"Lo/getDataStream;", "", "", "p0", "<init>", "(I)V", "read", "(Lo/getDataStream;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "onPause", "I", "AudioAttributesImplApi26Parcelizer", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getDataStream implements Comparable<getDataStream> {
    private static final getDataStream AudioAttributesCompatParcelizer;
    private static final getDataStream AudioAttributesImplApi21Parcelizer;
    private static final getDataStream AudioAttributesImplApi26Parcelizer;
    private static final getDataStream AudioAttributesImplBaseParcelizer;
    private static final getDataStream IconCompatParcelizer;
    private static final getDataStream MediaBrowserCompatCustomActionResultReceiver;
    private static final getDataStream MediaBrowserCompatItemReceiver;
    private static final getDataStream MediaBrowserCompatMediaItem;
    private static final getDataStream MediaBrowserCompatSearchResultReceiver;
    private static final getDataStream MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private static final getDataStream MediaDescriptionCompat;
    private static final getDataStream MediaMetadataCompat;
    private static final getDataStream RatingCompat;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final getDataStream handleMediaPlayPauseIfPendingOnHandler;
    private static final getDataStream onAddQueueItem;
    private static final getDataStream onCommand;
    private static final List<getDataStream> onCustomAction;
    private static final getDataStream read;
    private static final getDataStream write;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    public getDataStream(int i) {
        this.AudioAttributesCompatParcelizer = i;
        if (i <= 0 || i >= 1001) {
            withStackTrace.read("Font weight can be in range [1, 1000]. Current value: ".concat(String.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: o.getDataStream$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\t\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0007\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u000b\u0010\u000eR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u001a\u0010\u0012\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lo/getDataStream$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/getDataStream;", "MediaDescriptionCompat", "Lo/getDataStream;", "RemoteActionCompatParcelizer", "RatingCompat", "IconCompatParcelizer", "MediaMetadataCompat", "AudioAttributesCompatParcelizer", "MediaBrowserCompatMediaItem", "write", "()Lo/getDataStream;", "MediaBrowserCompatSearchResultReceiver", "AudioAttributesImplApi21Parcelizer", "read", "onCommand", "AudioAttributesImplBaseParcelizer", "handleMediaPlayPauseIfPendingOnHandler", "MediaBrowserCompatItemReceiver", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "onAddQueueItem", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi26Parcelizer", "", "onCustomAction", "Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final getDataStream write() {
            return getDataStream.MediaBrowserCompatMediaItem;
        }

        public final getDataStream AudioAttributesImplApi21Parcelizer() {
            return getDataStream.MediaBrowserCompatSearchResultReceiver;
        }

        public final getDataStream AudioAttributesImplBaseParcelizer() {
            return getDataStream.onCommand;
        }

        public final getDataStream IconCompatParcelizer() {
            return getDataStream.AudioAttributesImplApi21Parcelizer;
        }

        public final getDataStream RemoteActionCompatParcelizer() {
            return getDataStream.MediaBrowserCompatCustomActionResultReceiver;
        }

        public final getDataStream AudioAttributesCompatParcelizer() {
            return getDataStream.AudioAttributesImplApi26Parcelizer;
        }

        public final getDataStream read() {
            return getDataStream.read;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    static {
        getDataStream getdatastream = new getDataStream(100);
        MediaDescriptionCompat = getdatastream;
        getDataStream getdatastream2 = new getDataStream(200);
        RatingCompat = getdatastream2;
        getDataStream getdatastream3 = new getDataStream(300);
        MediaMetadataCompat = getdatastream3;
        getDataStream getdatastream4 = new getDataStream(ResponseError.NO_INTERNET_ERROR);
        MediaBrowserCompatMediaItem = getdatastream4;
        getDataStream getdatastream5 = new getDataStream(500);
        MediaBrowserCompatSearchResultReceiver = getdatastream5;
        getDataStream getdatastream6 = new getDataStream(600);
        onCommand = getdatastream6;
        getDataStream getdatastream7 = new getDataStream(700);
        handleMediaPlayPauseIfPendingOnHandler = getdatastream7;
        getDataStream getdatastream8 = new getDataStream(800);
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = getdatastream8;
        getDataStream getdatastream9 = new getDataStream(900);
        onAddQueueItem = getdatastream9;
        AudioAttributesImplBaseParcelizer = getdatastream;
        AudioAttributesCompatParcelizer = getdatastream2;
        AudioAttributesImplApi21Parcelizer = getdatastream3;
        MediaBrowserCompatCustomActionResultReceiver = getdatastream4;
        AudioAttributesImplApi26Parcelizer = getdatastream5;
        MediaBrowserCompatItemReceiver = getdatastream6;
        read = getdatastream7;
        write = getdatastream8;
        IconCompatParcelizer = getdatastream9;
        onCustomAction = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new getDataStream[]{getdatastream, getdatastream2, getdatastream3, getdatastream4, getdatastream5, getdatastream6, getdatastream7, getdatastream8, getdatastream9});
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final int compareTo(getDataStream p0) {
        return toMagicModuleMetaRepoModel.read(this.AudioAttributesCompatParcelizer, p0.AudioAttributesCompatParcelizer);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof getDataStream) && this.AudioAttributesCompatParcelizer == ((getDataStream) p0).AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontWeight(weight=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
