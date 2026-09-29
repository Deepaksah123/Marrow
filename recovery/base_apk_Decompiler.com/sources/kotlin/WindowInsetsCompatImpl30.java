package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin._skipWSOrEnd;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005\u0018%#\u0007$B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0007\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0007\u0010\u0016J/\u0010\f\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\f\u0010\u0015J/\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0017\u0010\u0015J/\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0018\u0010\u0015J/\u0010\u0007\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0007\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u000b8\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0017\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u0014\u0010\u001cR\u001a\u0010\u0014\u001a\u00020\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001a\u0010\f\u001a\u00020\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b\u0018\u0010 R\u001a\u0010\u0018\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010!\u001a\u0004\b\f\u0010\"R\u001a\u0010\u001b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b\u0017\u0010\"R\u001a\u0010$\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b\u0007\u0010\"R\u0014\u0010\u001e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!"}, d2 = {"Lo/WindowInsetsCompatImpl30;", "", "<init>", "()V", "Lo/assignParameter;", "p0", "Lo/WindowInsetsCompatImpl30$MediaBrowserCompatItemReceiver;", "RemoteActionCompatParcelizer", "(F)Lo/WindowInsetsCompatImpl30$MediaBrowserCompatItemReceiver;", "Lo/_skipWSOrEnd$write;", "p1", "Lo/WindowInsetsCompatImpl30$write;", "read", "(FLo/_skipWSOrEnd$write;)Lo/WindowInsetsCompatImpl30$write;", "", "", "p2", "", "p3", "", "IconCompatParcelizer", "(I[I[IZ)V", "([I[IZ)V", "AudioAttributesCompatParcelizer", "write", "AudioAttributesImplBaseParcelizer", "Lo/WindowInsetsCompatImpl30$write;", "AudioAttributesImplApi21Parcelizer", "()Lo/WindowInsetsCompatImpl30$write;", "Lo/WindowInsetsCompatImpl30$RatingCompat;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/WindowInsetsCompatImpl30$RatingCompat;", "()Lo/WindowInsetsCompatImpl30$RatingCompat;", "Lo/WindowInsetsCompatImpl30$MediaBrowserCompatItemReceiver;", "()Lo/WindowInsetsCompatImpl30$MediaBrowserCompatItemReceiver;", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi26Parcelizer", "RatingCompat"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WindowInsetsCompatImpl30 {
    public static final WindowInsetsCompatImpl30 INSTANCE = new WindowInsetsCompatImpl30();

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private static final write RemoteActionCompatParcelizer = new MediaMetadataCompat();

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private static final write AudioAttributesCompatParcelizer = new IconCompatParcelizer();

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private static final RatingCompat IconCompatParcelizer = new MediaBrowserCompatMediaItem();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private static final RatingCompat read = new AudioAttributesCompatParcelizer();

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private static final MediaBrowserCompatItemReceiver write = new read();

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private static final MediaBrowserCompatItemReceiver AudioAttributesImplApi21Parcelizer = new AudioAttributesImplBaseParcelizer();
    private static final MediaBrowserCompatItemReceiver AudioAttributesImplApi26Parcelizer = new AudioAttributesImplApi21Parcelizer();

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private static final MediaBrowserCompatItemReceiver MediaBrowserCompatCustomActionResultReceiver = new MediaBrowserCompatCustomActionResultReceiver();

    private WindowInsetsCompatImpl30() {
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/WindowInsetsCompatImpl30$MediaMetadataCompat;", "Lo/WindowInsetsCompatImpl30$write;", "Lo/bufferMapProperty;", "", "p0", "", "p1", "Lo/tryToResolveUnresolved;", "p2", "p3", "", "AudioAttributesCompatParcelizer", "(Lo/bufferMapProperty;I[ILo/tryToResolveUnresolved;[I)V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MediaMetadataCompat implements write {
        MediaMetadataCompat() {
        }

        @Override // o.WindowInsetsCompatImpl30.write
        public final void AudioAttributesCompatParcelizer(bufferMapProperty buffermapproperty, int i, int[] iArr, tryToResolveUnresolved trytoresolveunresolved, int[] iArr2) {
            if (trytoresolveunresolved == tryToResolveUnresolved.write) {
                WindowInsetsCompatImpl30.INSTANCE.RemoteActionCompatParcelizer(iArr, iArr2, false);
            } else {
                WindowInsetsCompatImpl30.INSTANCE.IconCompatParcelizer(i, iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#Start";
        }
    }

    public final write AudioAttributesImplApi21Parcelizer() {
        return RemoteActionCompatParcelizer;
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/WindowInsetsCompatImpl30$IconCompatParcelizer;", "Lo/WindowInsetsCompatImpl30$write;", "Lo/bufferMapProperty;", "", "p0", "", "p1", "Lo/tryToResolveUnresolved;", "p2", "p3", "", "AudioAttributesCompatParcelizer", "(Lo/bufferMapProperty;I[ILo/tryToResolveUnresolved;[I)V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer implements write {
        IconCompatParcelizer() {
        }

        @Override // o.WindowInsetsCompatImpl30.write
        public final void AudioAttributesCompatParcelizer(bufferMapProperty buffermapproperty, int i, int[] iArr, tryToResolveUnresolved trytoresolveunresolved, int[] iArr2) {
            if (trytoresolveunresolved == tryToResolveUnresolved.write) {
                WindowInsetsCompatImpl30.INSTANCE.IconCompatParcelizer(i, iArr, iArr2, false);
            } else {
                WindowInsetsCompatImpl30.INSTANCE.RemoteActionCompatParcelizer(iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#End";
        }
    }

    public final write IconCompatParcelizer() {
        return AudioAttributesCompatParcelizer;
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lo/WindowInsetsCompatImpl30$MediaBrowserCompatMediaItem;", "Lo/WindowInsetsCompatImpl30$RatingCompat;", "Lo/bufferMapProperty;", "", "p0", "", "p1", "p2", "", "write", "(Lo/bufferMapProperty;I[I[I)V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MediaBrowserCompatMediaItem implements RatingCompat {
        MediaBrowserCompatMediaItem() {
        }

        @Override // o.WindowInsetsCompatImpl30.RatingCompat
        public final void write(bufferMapProperty buffermapproperty, int i, int[] iArr, int[] iArr2) {
            WindowInsetsCompatImpl30.INSTANCE.RemoteActionCompatParcelizer(iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#Top";
        }
    }

    public final RatingCompat MediaBrowserCompatCustomActionResultReceiver() {
        return IconCompatParcelizer;
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lo/WindowInsetsCompatImpl30$AudioAttributesCompatParcelizer;", "Lo/WindowInsetsCompatImpl30$RatingCompat;", "Lo/bufferMapProperty;", "", "p0", "", "p1", "p2", "", "write", "(Lo/bufferMapProperty;I[I[I)V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer implements RatingCompat {
        AudioAttributesCompatParcelizer() {
        }

        @Override // o.WindowInsetsCompatImpl30.RatingCompat
        public final void write(bufferMapProperty buffermapproperty, int i, int[] iArr, int[] iArr2) {
            WindowInsetsCompatImpl30.INSTANCE.IconCompatParcelizer(i, iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#Bottom";
        }
    }

    public final RatingCompat write() {
        return read;
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00128\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lo/WindowInsetsCompatImpl30$read;", "Lo/WindowInsetsCompatImpl30$MediaBrowserCompatItemReceiver;", "Lo/bufferMapProperty;", "", "p0", "", "p1", "Lo/tryToResolveUnresolved;", "p2", "p3", "", "AudioAttributesCompatParcelizer", "(Lo/bufferMapProperty;I[ILo/tryToResolveUnresolved;[I)V", "write", "(Lo/bufferMapProperty;I[I[I)V", "", "toString", "()Ljava/lang/String;", "Lo/assignParameter;", "F", "IconCompatParcelizer", "()F", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read implements MediaBrowserCompatItemReceiver {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final float read = assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);

        read() {
        }

        @Override // o.WindowInsetsCompatImpl30.MediaBrowserCompatItemReceiver, o.WindowInsetsCompatImpl30.write, o.WindowInsetsCompatImpl30.RatingCompat
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final float getRead() {
            return this.read;
        }

        @Override // o.WindowInsetsCompatImpl30.write
        public final void AudioAttributesCompatParcelizer(bufferMapProperty buffermapproperty, int i, int[] iArr, tryToResolveUnresolved trytoresolveunresolved, int[] iArr2) {
            if (trytoresolveunresolved == tryToResolveUnresolved.write) {
                WindowInsetsCompatImpl30.INSTANCE.read(i, iArr, iArr2, false);
            } else {
                WindowInsetsCompatImpl30.INSTANCE.read(i, iArr, iArr2, true);
            }
        }

        @Override // o.WindowInsetsCompatImpl30.RatingCompat
        public final void write(bufferMapProperty buffermapproperty, int i, int[] iArr, int[] iArr2) {
            WindowInsetsCompatImpl30.INSTANCE.read(i, iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#Center";
        }
    }

    public final MediaBrowserCompatItemReceiver read() {
        return write;
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\r\u001a\u00020\u00128\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lo/WindowInsetsCompatImpl30$AudioAttributesImplBaseParcelizer;", "Lo/WindowInsetsCompatImpl30$MediaBrowserCompatItemReceiver;", "Lo/bufferMapProperty;", "", "p0", "", "p1", "Lo/tryToResolveUnresolved;", "p2", "p3", "", "AudioAttributesCompatParcelizer", "(Lo/bufferMapProperty;I[ILo/tryToResolveUnresolved;[I)V", "write", "(Lo/bufferMapProperty;I[I[I)V", "", "toString", "()Ljava/lang/String;", "Lo/assignParameter;", "F", "IconCompatParcelizer", "()F"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesImplBaseParcelizer implements MediaBrowserCompatItemReceiver {
        private final float write = assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);

        AudioAttributesImplBaseParcelizer() {
        }

        @Override // o.WindowInsetsCompatImpl30.MediaBrowserCompatItemReceiver, o.WindowInsetsCompatImpl30.write, o.WindowInsetsCompatImpl30.RatingCompat
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final float getRead() {
            return this.write;
        }

        @Override // o.WindowInsetsCompatImpl30.write
        public final void AudioAttributesCompatParcelizer(bufferMapProperty buffermapproperty, int i, int[] iArr, tryToResolveUnresolved trytoresolveunresolved, int[] iArr2) {
            if (trytoresolveunresolved == tryToResolveUnresolved.write) {
                WindowInsetsCompatImpl30.INSTANCE.AudioAttributesCompatParcelizer(i, iArr, iArr2, false);
            } else {
                WindowInsetsCompatImpl30.INSTANCE.AudioAttributesCompatParcelizer(i, iArr, iArr2, true);
            }
        }

        @Override // o.WindowInsetsCompatImpl30.RatingCompat
        public final void write(bufferMapProperty buffermapproperty, int i, int[] iArr, int[] iArr2) {
            WindowInsetsCompatImpl30.INSTANCE.AudioAttributesCompatParcelizer(i, iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#SpaceEvenly";
        }
    }

    public final MediaBrowserCompatItemReceiver AudioAttributesCompatParcelizer() {
        return AudioAttributesImplApi21Parcelizer;
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00128\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lo/WindowInsetsCompatImpl30$AudioAttributesImplApi21Parcelizer;", "Lo/WindowInsetsCompatImpl30$MediaBrowserCompatItemReceiver;", "Lo/bufferMapProperty;", "", "p0", "", "p1", "Lo/tryToResolveUnresolved;", "p2", "p3", "", "AudioAttributesCompatParcelizer", "(Lo/bufferMapProperty;I[ILo/tryToResolveUnresolved;[I)V", "write", "(Lo/bufferMapProperty;I[I[I)V", "", "toString", "()Ljava/lang/String;", "Lo/assignParameter;", "RemoteActionCompatParcelizer", "F", "IconCompatParcelizer", "()F", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesImplApi21Parcelizer implements MediaBrowserCompatItemReceiver {

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final float read = assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);

        AudioAttributesImplApi21Parcelizer() {
        }

        @Override // o.WindowInsetsCompatImpl30.MediaBrowserCompatItemReceiver, o.WindowInsetsCompatImpl30.write, o.WindowInsetsCompatImpl30.RatingCompat
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final float getRead() {
            return this.read;
        }

        @Override // o.WindowInsetsCompatImpl30.write
        public final void AudioAttributesCompatParcelizer(bufferMapProperty buffermapproperty, int i, int[] iArr, tryToResolveUnresolved trytoresolveunresolved, int[] iArr2) {
            if (trytoresolveunresolved == tryToResolveUnresolved.write) {
                WindowInsetsCompatImpl30.INSTANCE.write(i, iArr, iArr2, false);
            } else {
                WindowInsetsCompatImpl30.INSTANCE.write(i, iArr, iArr2, true);
            }
        }

        @Override // o.WindowInsetsCompatImpl30.RatingCompat
        public final void write(bufferMapProperty buffermapproperty, int i, int[] iArr, int[] iArr2) {
            WindowInsetsCompatImpl30.INSTANCE.write(i, iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#SpaceBetween";
        }
    }

    public final MediaBrowserCompatItemReceiver RemoteActionCompatParcelizer() {
        return AudioAttributesImplApi26Parcelizer;
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00128\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lo/WindowInsetsCompatImpl30$MediaBrowserCompatCustomActionResultReceiver;", "Lo/WindowInsetsCompatImpl30$MediaBrowserCompatItemReceiver;", "Lo/bufferMapProperty;", "", "p0", "", "p1", "Lo/tryToResolveUnresolved;", "p2", "p3", "", "AudioAttributesCompatParcelizer", "(Lo/bufferMapProperty;I[ILo/tryToResolveUnresolved;[I)V", "write", "(Lo/bufferMapProperty;I[I[I)V", "", "toString", "()Ljava/lang/String;", "Lo/assignParameter;", "F", "IconCompatParcelizer", "()F", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MediaBrowserCompatCustomActionResultReceiver implements MediaBrowserCompatItemReceiver {

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final float read = assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);

        MediaBrowserCompatCustomActionResultReceiver() {
        }

        @Override // o.WindowInsetsCompatImpl30.MediaBrowserCompatItemReceiver, o.WindowInsetsCompatImpl30.write, o.WindowInsetsCompatImpl30.RatingCompat
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final float getRead() {
            return this.read;
        }

        @Override // o.WindowInsetsCompatImpl30.write
        public final void AudioAttributesCompatParcelizer(bufferMapProperty buffermapproperty, int i, int[] iArr, tryToResolveUnresolved trytoresolveunresolved, int[] iArr2) {
            if (trytoresolveunresolved == tryToResolveUnresolved.write) {
                WindowInsetsCompatImpl30.INSTANCE.RemoteActionCompatParcelizer(i, iArr, iArr2, false);
            } else {
                WindowInsetsCompatImpl30.INSTANCE.RemoteActionCompatParcelizer(i, iArr, iArr2, true);
            }
        }

        @Override // o.WindowInsetsCompatImpl30.RatingCompat
        public final void write(bufferMapProperty buffermapproperty, int i, int[] iArr, int[] iArr2) {
            WindowInsetsCompatImpl30.INSTANCE.RemoteActionCompatParcelizer(i, iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#SpaceAround";
        }
    }

    public final MediaBrowserCompatItemReceiver RemoteActionCompatParcelizer(float p0) {
        return new AudioAttributesImplApi26Parcelizer(p0, true, new MagicModuleSubmissionRequestBody() { // from class: o.WindowInsetsCompatImpl34
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(WindowInsetsCompatImpl30.write(((Integer) obj).intValue(), (tryToResolveUnresolved) obj2));
            }
        }, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int write(int i, tryToResolveUnresolved trytoresolveunresolved) {
        return _skipWSOrEnd.INSTANCE.RatingCompat().IconCompatParcelizer(0, i, trytoresolveunresolved);
    }

    public final write read(float p0, final _skipWSOrEnd.write p1) {
        return new AudioAttributesImplApi26Parcelizer(p0, true, new MagicModuleSubmissionRequestBody() { // from class: o.setProtections
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(WindowInsetsCompatImpl30.RemoteActionCompatParcelizer(p1, ((Integer) obj).intValue(), (tryToResolveUnresolved) obj2));
            }
        }, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int RemoteActionCompatParcelizer(_skipWSOrEnd.write writeVar, int i, tryToResolveUnresolved trytoresolveunresolved) {
        return writeVar.IconCompatParcelizer(0, i, trytoresolveunresolved);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0007\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\r\u0010\fR\u0014\u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b"}, d2 = {"Lo/WindowInsetsCompatImpl30$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/assignParameter;", "p0", "Lo/WindowInsetsCompatImpl30$MediaBrowserCompatItemReceiver;", "RemoteActionCompatParcelizer", "(F)Lo/WindowInsetsCompatImpl30$MediaBrowserCompatItemReceiver;", "Lo/WindowInsetsCompatImpl30$write;", "read", "Lo/WindowInsetsCompatImpl30$write;", "()Lo/WindowInsetsCompatImpl30$write;", "write", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatCustomActionResultReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private static final write RemoteActionCompatParcelizer = new write();

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private static final write IconCompatParcelizer = new AudioAttributesCompatParcelizer();

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private static final write read = new IconCompatParcelizer();

        /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
        private static final write AudioAttributesCompatParcelizer = new C0051RemoteActionCompatParcelizer();

        /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
        private static final write write = new MediaBrowserCompatItemReceiver();

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private static final write MediaBrowserCompatCustomActionResultReceiver = new read();

        private RemoteActionCompatParcelizer() {
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/WindowInsetsCompatImpl30$RemoteActionCompatParcelizer$write;", "Lo/WindowInsetsCompatImpl30$write;", "Lo/bufferMapProperty;", "", "p0", "", "p1", "Lo/tryToResolveUnresolved;", "p2", "p3", "", "AudioAttributesCompatParcelizer", "(Lo/bufferMapProperty;I[ILo/tryToResolveUnresolved;[I)V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class write implements write {
            write() {
            }

            @Override // o.WindowInsetsCompatImpl30.write
            public final void AudioAttributesCompatParcelizer(bufferMapProperty buffermapproperty, int i, int[] iArr, tryToResolveUnresolved trytoresolveunresolved, int[] iArr2) {
                WindowInsetsCompatImpl30.INSTANCE.RemoteActionCompatParcelizer(iArr, iArr2, false);
            }

            public final String toString() {
                return "AbsoluteArrangement#Left";
            }
        }

        public final write read() {
            return RemoteActionCompatParcelizer;
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/WindowInsetsCompatImpl30$RemoteActionCompatParcelizer$AudioAttributesCompatParcelizer;", "Lo/WindowInsetsCompatImpl30$write;", "Lo/bufferMapProperty;", "", "p0", "", "p1", "Lo/tryToResolveUnresolved;", "p2", "p3", "", "AudioAttributesCompatParcelizer", "(Lo/bufferMapProperty;I[ILo/tryToResolveUnresolved;[I)V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AudioAttributesCompatParcelizer implements write {
            AudioAttributesCompatParcelizer() {
            }

            @Override // o.WindowInsetsCompatImpl30.write
            public final void AudioAttributesCompatParcelizer(bufferMapProperty buffermapproperty, int i, int[] iArr, tryToResolveUnresolved trytoresolveunresolved, int[] iArr2) {
                WindowInsetsCompatImpl30.INSTANCE.read(i, iArr, iArr2, false);
            }

            public final String toString() {
                return "AbsoluteArrangement#Center";
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/WindowInsetsCompatImpl30$RemoteActionCompatParcelizer$IconCompatParcelizer;", "Lo/WindowInsetsCompatImpl30$write;", "Lo/bufferMapProperty;", "", "p0", "", "p1", "Lo/tryToResolveUnresolved;", "p2", "p3", "", "AudioAttributesCompatParcelizer", "(Lo/bufferMapProperty;I[ILo/tryToResolveUnresolved;[I)V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class IconCompatParcelizer implements write {
            IconCompatParcelizer() {
            }

            @Override // o.WindowInsetsCompatImpl30.write
            public final void AudioAttributesCompatParcelizer(bufferMapProperty buffermapproperty, int i, int[] iArr, tryToResolveUnresolved trytoresolveunresolved, int[] iArr2) {
                WindowInsetsCompatImpl30.INSTANCE.IconCompatParcelizer(i, iArr, iArr2, false);
            }

            public final String toString() {
                return "AbsoluteArrangement#Right";
            }
        }

        public final write write() {
            return read;
        }

        /* JADX INFO: renamed from: o.WindowInsetsCompatImpl30$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer, reason: collision with other inner class name */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/WindowInsetsCompatImpl30$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer;", "Lo/WindowInsetsCompatImpl30$write;", "Lo/bufferMapProperty;", "", "p0", "", "p1", "Lo/tryToResolveUnresolved;", "p2", "p3", "", "AudioAttributesCompatParcelizer", "(Lo/bufferMapProperty;I[ILo/tryToResolveUnresolved;[I)V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C0051RemoteActionCompatParcelizer implements write {
            C0051RemoteActionCompatParcelizer() {
            }

            @Override // o.WindowInsetsCompatImpl30.write
            public final void AudioAttributesCompatParcelizer(bufferMapProperty buffermapproperty, int i, int[] iArr, tryToResolveUnresolved trytoresolveunresolved, int[] iArr2) {
                WindowInsetsCompatImpl30.INSTANCE.write(i, iArr, iArr2, false);
            }

            public final String toString() {
                return "AbsoluteArrangement#SpaceBetween";
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/WindowInsetsCompatImpl30$RemoteActionCompatParcelizer$MediaBrowserCompatItemReceiver;", "Lo/WindowInsetsCompatImpl30$write;", "Lo/bufferMapProperty;", "", "p0", "", "p1", "Lo/tryToResolveUnresolved;", "p2", "p3", "", "AudioAttributesCompatParcelizer", "(Lo/bufferMapProperty;I[ILo/tryToResolveUnresolved;[I)V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class MediaBrowserCompatItemReceiver implements write {
            MediaBrowserCompatItemReceiver() {
            }

            @Override // o.WindowInsetsCompatImpl30.write
            public final void AudioAttributesCompatParcelizer(bufferMapProperty buffermapproperty, int i, int[] iArr, tryToResolveUnresolved trytoresolveunresolved, int[] iArr2) {
                WindowInsetsCompatImpl30.INSTANCE.AudioAttributesCompatParcelizer(i, iArr, iArr2, false);
            }

            public final String toString() {
                return "AbsoluteArrangement#SpaceEvenly";
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/WindowInsetsCompatImpl30$RemoteActionCompatParcelizer$read;", "Lo/WindowInsetsCompatImpl30$write;", "Lo/bufferMapProperty;", "", "p0", "", "p1", "Lo/tryToResolveUnresolved;", "p2", "p3", "", "AudioAttributesCompatParcelizer", "(Lo/bufferMapProperty;I[ILo/tryToResolveUnresolved;[I)V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class read implements write {
            read() {
            }

            @Override // o.WindowInsetsCompatImpl30.write
            public final void AudioAttributesCompatParcelizer(bufferMapProperty buffermapproperty, int i, int[] iArr, tryToResolveUnresolved trytoresolveunresolved, int[] iArr2) {
                WindowInsetsCompatImpl30.INSTANCE.RemoteActionCompatParcelizer(i, iArr, iArr2, false);
            }

            public final String toString() {
                return "AbsoluteArrangement#SpaceAround";
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final MediaBrowserCompatItemReceiver RemoteActionCompatParcelizer(float p0) {
            return new AudioAttributesImplApi26Parcelizer(p0, false, null, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0010\u001a\u00020\u000f*\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0012\u001a\u00020\u000f*\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR%\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010 R\u001a\u0010\u0010\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\u001c\u0010\""}, d2 = {"Lo/WindowInsetsCompatImpl30$AudioAttributesImplApi26Parcelizer;", "Lo/WindowInsetsCompatImpl30$MediaBrowserCompatItemReceiver;", "Lo/assignParameter;", "p0", "", "p1", "Lkotlin/Function2;", "", "Lo/tryToResolveUnresolved;", "p2", "<init>", "(FZLo/MagicModuleSubmissionRequestBody;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/bufferMapProperty;", "", "p3", "", "AudioAttributesCompatParcelizer", "(Lo/bufferMapProperty;I[ILo/tryToResolveUnresolved;[I)V", "write", "(Lo/bufferMapProperty;I[I[I)V", "", "toString", "()Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "IconCompatParcelizer", "F", "RemoteActionCompatParcelizer", "Z", "Lo/MagicModuleSubmissionRequestBody;", "read", "()F"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AudioAttributesImplApi26Parcelizer implements MediaBrowserCompatItemReceiver {
        private final float IconCompatParcelizer;
        private final boolean RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final float AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final MagicModuleSubmissionRequestBody<Integer, tryToResolveUnresolved, Integer> read;

        /* JADX WARN: Multi-variable type inference failed */
        private AudioAttributesImplApi26Parcelizer(float f, boolean z, MagicModuleSubmissionRequestBody<? super Integer, ? super tryToResolveUnresolved, Integer> magicModuleSubmissionRequestBody) {
            this.IconCompatParcelizer = f;
            this.RemoteActionCompatParcelizer = z;
            this.read = magicModuleSubmissionRequestBody;
            this.AudioAttributesCompatParcelizer = f;
        }

        @Override // o.WindowInsetsCompatImpl30.MediaBrowserCompatItemReceiver, o.WindowInsetsCompatImpl30.write, o.WindowInsetsCompatImpl30.RatingCompat
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final float getRead() {
            return this.AudioAttributesCompatParcelizer;
        }

        @Override // o.WindowInsetsCompatImpl30.write
        public final void AudioAttributesCompatParcelizer(bufferMapProperty buffermapproperty, int i, int[] iArr, tryToResolveUnresolved trytoresolveunresolved, int[] iArr2) {
            int i2;
            int iMin;
            if (iArr.length == 0) {
                return;
            }
            int iIconCompatParcelizer = buffermapproperty.IconCompatParcelizer(this.IconCompatParcelizer);
            boolean z = this.RemoteActionCompatParcelizer && trytoresolveunresolved == tryToResolveUnresolved.RemoteActionCompatParcelizer;
            WindowInsetsCompatImpl30 windowInsetsCompatImpl30 = WindowInsetsCompatImpl30.INSTANCE;
            if (!z) {
                int length = iArr.length;
                i2 = 0;
                int i3 = 0;
                iMin = 0;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = iArr[i3];
                    int iMin2 = Math.min(i2, i - i5);
                    iArr2[i4] = iMin2;
                    int iMin3 = Math.min(iIconCompatParcelizer, (i - iMin2) - i5);
                    i3++;
                    int i6 = iArr2[i4] + i5 + iMin3;
                    i4++;
                    iMin = iMin3;
                    i2 = i6;
                }
            } else {
                i2 = 0;
                iMin = 0;
                for (int length2 = iArr.length - 1; length2 >= 0; length2--) {
                    int i7 = iArr[length2];
                    int iMin4 = Math.min(i2, i - i7);
                    iArr2[length2] = iMin4;
                    iMin = Math.min(iIconCompatParcelizer, (i - iMin4) - i7);
                    i2 = iArr2[length2] + i7 + iMin;
                }
            }
            int i8 = i2 - iMin;
            MagicModuleSubmissionRequestBody<Integer, tryToResolveUnresolved, Integer> magicModuleSubmissionRequestBody = this.read;
            if (magicModuleSubmissionRequestBody == null || i8 >= i) {
                return;
            }
            int iIntValue = magicModuleSubmissionRequestBody.invoke(Integer.valueOf(i - i8), trytoresolveunresolved).intValue();
            int length3 = iArr2.length;
            for (int i9 = 0; i9 < length3; i9++) {
                iArr2[i9] = iArr2[i9] + iIntValue;
            }
        }

        @Override // o.WindowInsetsCompatImpl30.RatingCompat
        public final void write(bufferMapProperty buffermapproperty, int i, int[] iArr, int[] iArr2) {
            AudioAttributesCompatParcelizer(buffermapproperty, i, iArr, tryToResolveUnresolved.write, iArr2);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.RemoteActionCompatParcelizer ? "" : "Absolute");
            sb.append("Arrangement#spacedAligned(");
            sb.append((Object) assignParameter.RemoteActionCompatParcelizer(this.IconCompatParcelizer));
            sb.append(", ");
            sb.append(this.read);
            sb.append(')');
            return sb.toString();
        }

        public /* synthetic */ AudioAttributesImplApi26Parcelizer(float f, boolean z, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(f, z, magicModuleSubmissionRequestBody);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof AudioAttributesImplApi26Parcelizer)) {
                return false;
            }
            AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer = (AudioAttributesImplApi26Parcelizer) p0;
            return assignParameter.IconCompatParcelizer(this.IconCompatParcelizer, audioAttributesImplApi26Parcelizer.IconCompatParcelizer) && this.RemoteActionCompatParcelizer == audioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, audioAttributesImplApi26Parcelizer.read);
        }

        public final int hashCode() {
            int iAudioAttributesCompatParcelizer = assignParameter.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
            int iHashCode = Boolean.hashCode(this.RemoteActionCompatParcelizer);
            MagicModuleSubmissionRequestBody<Integer, tryToResolveUnresolved, Integer> magicModuleSubmissionRequestBody = this.read;
            return (((iAudioAttributesCompatParcelizer * 31) + iHashCode) * 31) + (magicModuleSubmissionRequestBody == null ? 0 : magicModuleSubmissionRequestBody.hashCode());
        }
    }

    public final void write(int p0, int[] p1, int[] p2, boolean p3) {
        if (p1.length == 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 : p1) {
            i2 += i3;
        }
        float fMax = (p0 - i2) / Math.max(getOrderDetails.AudioAttributesImplBaseParcelizer(p1), 1);
        float f = (p3 && p1.length == 1) ? fMax : BitmapDescriptorFactory.HUE_RED;
        if (!p3) {
            int length = p1.length;
            int i4 = 0;
            while (i < length) {
                int i5 = p1[i];
                p2[i4] = Math.round(f);
                f += i5 + fMax;
                i++;
                i4++;
            }
            return;
        }
        for (int length2 = p1.length - 1; length2 >= 0; length2--) {
            int i6 = p1[length2];
            p2[length2] = Math.round(f);
            f += i6 + fMax;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Lo/WindowInsetsCompatImpl30$MediaBrowserCompatItemReceiver;", "Lo/WindowInsetsCompatImpl30$write;", "Lo/WindowInsetsCompatImpl30$RatingCompat;", "Lo/assignParameter;", "IconCompatParcelizer", "()F", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface MediaBrowserCompatItemReceiver extends write, RatingCompat {
        @Override // o.WindowInsetsCompatImpl30.write, o.WindowInsetsCompatImpl30.RatingCompat
        /* JADX INFO: renamed from: IconCompatParcelizer */
        default float getRead() {
            return assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\t\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Lo/WindowInsetsCompatImpl30$RatingCompat;", "", "Lo/bufferMapProperty;", "", "p0", "", "p1", "p2", "", "write", "(Lo/bufferMapProperty;I[I[I)V", "Lo/assignParameter;", "IconCompatParcelizer", "()F"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface RatingCompat {
        void write(bufferMapProperty buffermapproperty, int i, int[] iArr, int[] iArr2);

        /* JADX INFO: renamed from: IconCompatParcelizer */
        default float getRead() {
            return assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H&¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000b\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Lo/WindowInsetsCompatImpl30$write;", "", "Lo/bufferMapProperty;", "", "p0", "", "p1", "Lo/tryToResolveUnresolved;", "p2", "p3", "", "AudioAttributesCompatParcelizer", "(Lo/bufferMapProperty;I[ILo/tryToResolveUnresolved;[I)V", "Lo/assignParameter;", "IconCompatParcelizer", "()F"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface write {
        void AudioAttributesCompatParcelizer(bufferMapProperty buffermapproperty, int i, int[] iArr, tryToResolveUnresolved trytoresolveunresolved, int[] iArr2);

        /* JADX INFO: renamed from: IconCompatParcelizer */
        default float getRead() {
            return assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
        }
    }

    public final void IconCompatParcelizer(int p0, int[] p1, int[] p2, boolean p3) {
        int i = 0;
        int i2 = 0;
        for (int i3 : p1) {
            i2 += i3;
        }
        int i4 = p0 - i2;
        if (!p3) {
            int length = p1.length;
            int i5 = 0;
            while (i < length) {
                int i6 = p1[i];
                p2[i5] = i4;
                i4 += i6;
                i++;
                i5++;
            }
            return;
        }
        for (int length2 = p1.length - 1; length2 >= 0; length2--) {
            int i7 = p1[length2];
            p2[length2] = i4;
            i4 += i7;
        }
    }

    public final void RemoteActionCompatParcelizer(int[] p0, int[] p1, boolean p2) {
        int i = 0;
        if (!p2) {
            int length = p0.length;
            int i2 = 0;
            int i3 = 0;
            while (i < length) {
                int i4 = p0[i];
                p1[i2] = i3;
                i3 += i4;
                i++;
                i2++;
            }
            return;
        }
        for (int length2 = p0.length - 1; length2 >= 0; length2--) {
            int i5 = p0[length2];
            p1[length2] = i;
            i += i5;
        }
    }

    public final void read(int p0, int[] p1, int[] p2, boolean p3) {
        int i = 0;
        int i2 = 0;
        for (int i3 : p1) {
            i2 += i3;
        }
        float f = (p0 - i2) / 2.0f;
        if (!p3) {
            int length = p1.length;
            int i4 = 0;
            while (i < length) {
                int i5 = p1[i];
                p2[i4] = Math.round(f);
                f += i5;
                i++;
                i4++;
            }
            return;
        }
        for (int length2 = p1.length - 1; length2 >= 0; length2--) {
            int i6 = p1[length2];
            p2[length2] = Math.round(f);
            f += i6;
        }
    }

    public final void AudioAttributesCompatParcelizer(int p0, int[] p1, int[] p2, boolean p3) {
        int i = 0;
        int i2 = 0;
        for (int i3 : p1) {
            i2 += i3;
        }
        float length = (p0 - i2) / (p1.length + 1);
        if (!p3) {
            int length2 = p1.length;
            float f = length;
            int i4 = 0;
            while (i < length2) {
                int i5 = p1[i];
                p2[i4] = Math.round(f);
                f += i5 + length;
                i++;
                i4++;
            }
            return;
        }
        float f2 = length;
        for (int length3 = p1.length - 1; length3 >= 0; length3--) {
            int i6 = p1[length3];
            p2[length3] = Math.round(f2);
            f2 += i6 + length;
        }
    }

    public final void RemoteActionCompatParcelizer(int p0, int[] p1, int[] p2, boolean p3) {
        int i = 0;
        int i2 = 0;
        for (int i3 : p1) {
            i2 += i3;
        }
        float length = p1.length == 0 ? BitmapDescriptorFactory.HUE_RED : (p0 - i2) / p1.length;
        float f = length / 2.0f;
        if (!p3) {
            int length2 = p1.length;
            int i4 = 0;
            while (i < length2) {
                int i5 = p1[i];
                p2[i4] = Math.round(f);
                f += i5 + length;
                i++;
                i4++;
            }
            return;
        }
        for (int length3 = p1.length - 1; length3 >= 0; length3--) {
            int i6 = p1[length3];
            p2[length3] = Math.round(f);
            f += i6 + length;
        }
    }
}
