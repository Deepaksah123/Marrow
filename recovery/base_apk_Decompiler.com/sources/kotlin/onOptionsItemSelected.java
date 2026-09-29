package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087@\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\b\u001a\u00020\nH\u0002¢\u0006\u0004\b\b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0088\u0001\u0013\u0092\u0001\u00020\u0002"}, d2 = {"Lo/onOptionsItemSelected;", "", "", "p0", "AudioAttributesCompatParcelizer", "(I)I", "(II)I", "", "read", "(II)Z", "", "IconCompatParcelizer", "(I)Ljava/lang/String;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "RatingCompat", "I", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class onOptionsItemSelected {
    private static final int AudioAttributesCompatParcelizer;
    private static final int AudioAttributesImplApi21Parcelizer;
    private static final int AudioAttributesImplApi26Parcelizer;
    private static final int AudioAttributesImplBaseParcelizer;
    private static final int IconCompatParcelizer;
    private static final int MediaBrowserCompatCustomActionResultReceiver;
    private static final int MediaBrowserCompatItemReceiver;
    private static final int MediaBrowserCompatMediaItem;
    private static final int MediaBrowserCompatSearchResultReceiver;
    private static final int MediaMetadataCompat;
    private static final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int write;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    private static int AudioAttributesCompatParcelizer(int i) {
        return i;
    }

    public static final boolean RemoteActionCompatParcelizer(int i, int i2) {
        return i == i2;
    }

    public static final boolean read(int i, int i2) {
        return (i & i2) != 0;
    }

    public static final int AudioAttributesCompatParcelizer(int i, int i2) {
        return AudioAttributesCompatParcelizer(i | i2);
    }

    public static String IconCompatParcelizer(int i) {
        StringBuilder sb = new StringBuilder("WindowInsetsSides(");
        sb.append(read(i));
        sb.append(')');
        return sb.toString();
    }

    public final String toString() {
        return IconCompatParcelizer(this.IconCompatParcelizer);
    }

    private static final String read(int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = MediaBrowserCompatMediaItem;
        if ((i & i2) == i2) {
            AudioAttributesCompatParcelizer(sb, "Start");
        }
        int i3 = AudioAttributesImplApi21Parcelizer;
        if ((i & i3) == i3) {
            AudioAttributesCompatParcelizer(sb, "Left");
        }
        int i4 = MediaBrowserCompatSearchResultReceiver;
        if ((i & i4) == i4) {
            AudioAttributesCompatParcelizer(sb, "Top");
        }
        int i5 = AudioAttributesImplApi26Parcelizer;
        if ((i & i5) == i5) {
            AudioAttributesCompatParcelizer(sb, "End");
        }
        int i6 = MediaBrowserCompatItemReceiver;
        if ((i & i6) == i6) {
            AudioAttributesCompatParcelizer(sb, "Right");
        }
        int i7 = MediaBrowserCompatCustomActionResultReceiver;
        if ((i & i7) == i7) {
            AudioAttributesCompatParcelizer(sb, "Bottom");
        }
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    private static final void AudioAttributesCompatParcelizer(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    /* JADX INFO: renamed from: o.onOptionsItemSelected$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001a\u0010\t\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\r\u0010\u0007R\u001a\u0010\u0012\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0010\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006"}, d2 = {"Lo/onOptionsItemSelected$read;", "", "<init>", "()V", "Lo/onOptionsItemSelected;", "RemoteActionCompatParcelizer", "I", "()I", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "write", "read", "MediaBrowserCompatMediaItem", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatSearchResultReceiver", "MediaBrowserCompatItemReceiver", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplBaseParcelizer", "MediaDescriptionCompat", "MediaMetadataCompat"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final int RemoteActionCompatParcelizer() {
            return onOptionsItemSelected.RemoteActionCompatParcelizer;
        }

        public final int AudioAttributesCompatParcelizer() {
            return onOptionsItemSelected.AudioAttributesCompatParcelizer;
        }

        public final int write() {
            return onOptionsItemSelected.IconCompatParcelizer;
        }

        public final int IconCompatParcelizer() {
            return onOptionsItemSelected.write;
        }

        public final int AudioAttributesImplApi26Parcelizer() {
            return onOptionsItemSelected.MediaBrowserCompatSearchResultReceiver;
        }

        public final int read() {
            return onOptionsItemSelected.MediaBrowserCompatCustomActionResultReceiver;
        }

        public final int MediaBrowserCompatItemReceiver() {
            return onOptionsItemSelected.AudioAttributesImplBaseParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    static {
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(8);
        RemoteActionCompatParcelizer = iAudioAttributesCompatParcelizer;
        int iAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(4);
        AudioAttributesCompatParcelizer = iAudioAttributesCompatParcelizer2;
        int iAudioAttributesCompatParcelizer3 = AudioAttributesCompatParcelizer(2);
        IconCompatParcelizer = iAudioAttributesCompatParcelizer3;
        int iAudioAttributesCompatParcelizer4 = AudioAttributesCompatParcelizer(1);
        write = iAudioAttributesCompatParcelizer4;
        MediaBrowserCompatMediaItem = AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer, iAudioAttributesCompatParcelizer4);
        AudioAttributesImplApi26Parcelizer = AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer3);
        int iAudioAttributesCompatParcelizer5 = AudioAttributesCompatParcelizer(16);
        MediaBrowserCompatSearchResultReceiver = iAudioAttributesCompatParcelizer5;
        int iAudioAttributesCompatParcelizer6 = AudioAttributesCompatParcelizer(32);
        MediaBrowserCompatCustomActionResultReceiver = iAudioAttributesCompatParcelizer6;
        int iAudioAttributesCompatParcelizer7 = AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer, iAudioAttributesCompatParcelizer3);
        AudioAttributesImplApi21Parcelizer = iAudioAttributesCompatParcelizer7;
        int iAudioAttributesCompatParcelizer8 = AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer4);
        MediaBrowserCompatItemReceiver = iAudioAttributesCompatParcelizer8;
        AudioAttributesImplBaseParcelizer = AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer7, iAudioAttributesCompatParcelizer8);
        MediaMetadataCompat = AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer5, iAudioAttributesCompatParcelizer6);
    }

    public static boolean RemoteActionCompatParcelizer(int i, Object obj) {
        return (obj instanceof onOptionsItemSelected) && i == ((onOptionsItemSelected) obj).getIconCompatParcelizer();
    }

    public static int RemoteActionCompatParcelizer(int i) {
        return Integer.hashCode(i);
    }

    public final boolean equals(Object p0) {
        return RemoteActionCompatParcelizer(this.IconCompatParcelizer, p0);
    }

    public final int hashCode() {
        return RemoteActionCompatParcelizer(this.IconCompatParcelizer);
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final /* synthetic */ int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }
}
