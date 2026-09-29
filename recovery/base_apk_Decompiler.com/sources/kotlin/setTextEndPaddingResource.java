package kotlin;

import android.graphics.ImageFormat;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.lang.reflect.Method;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0017\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001aB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0017\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./01"}, d2 = {"Lo/setTextEndPaddingResource;", "", "<init>", "()V", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "onMediaButtonEvent", "write", "MediaBrowserCompatCustomActionResultReceiver", "onCustomAction", "onCommand", "handleMediaPlayPauseIfPendingOnHandler", "read", "onFastForward", "MediaMetadataCompat", "onPlayFromMediaId", "MediaBrowserCompatMediaItem", "onAddQueueItem", "RatingCompat", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplApi26Parcelizer", "MediaDescriptionCompat", "IconCompatParcelizer", "MediaBrowserCompatItemReceiver", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatSearchResultReceiver", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "Lo/setTextEndPaddingResource$IconCompatParcelizer;", "Lo/setTextEndPaddingResource$read;", "Lo/setTextEndPaddingResource$write;", "Lo/setTextEndPaddingResource$AudioAttributesCompatParcelizer;", "Lo/setTextEndPaddingResource$RemoteActionCompatParcelizer;", "Lo/setTextEndPaddingResource$MediaBrowserCompatItemReceiver;", "Lo/setTextEndPaddingResource$AudioAttributesImplBaseParcelizer;", "Lo/setTextEndPaddingResource$MediaBrowserCompatCustomActionResultReceiver;", "Lo/setTextEndPaddingResource$AudioAttributesImplApi21Parcelizer;", "Lo/setTextEndPaddingResource$AudioAttributesImplApi26Parcelizer;", "Lo/setTextEndPaddingResource$MediaMetadataCompat;", "Lo/setTextEndPaddingResource$MediaDescriptionCompat;", "Lo/setTextEndPaddingResource$MediaBrowserCompatMediaItem;", "Lo/setTextEndPaddingResource$RatingCompat;", "Lo/setTextEndPaddingResource$MediaBrowserCompatSearchResultReceiver;", "Lo/setTextEndPaddingResource$onCommand;", "Lo/setTextEndPaddingResource$handleMediaPlayPauseIfPendingOnHandler;", "Lo/setTextEndPaddingResource$onAddQueueItem;", "Lo/setTextEndPaddingResource$onCustomAction;", "Lo/setTextEndPaddingResource$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;", "Lo/setTextEndPaddingResource$onMediaButtonEvent;", "Lo/setTextEndPaddingResource$onPlayFromMediaId;", "Lo/setTextEndPaddingResource$onFastForward;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class setTextEndPaddingResource {

    /* JADX INFO: loaded from: classes4.dex */
    public static final class MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver extends setTextEndPaddingResource {
        private final boolean IconCompatParcelizer;
        private final int read;
        private final int write;

        public MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(int i, int i2, boolean z) {
            super(null);
            this.write = i;
            this.read = i2;
            this.IconCompatParcelizer = z;
        }

        public final int RemoteActionCompatParcelizer() {
            return this.write;
        }

        public final int write() {
            return this.read;
        }

        public final boolean read() {
            return this.IconCompatParcelizer;
        }
    }

    private setTextEndPaddingResource() {
    }

    public /* synthetic */ setTextEndPaddingResource(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setTextEndPaddingResource$onMediaButtonEvent;", "Lo/setTextEndPaddingResource;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class onMediaButtonEvent extends setTextEndPaddingResource {
        public static final onMediaButtonEvent INSTANCE = new onMediaButtonEvent();

        private onMediaButtonEvent() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setTextEndPaddingResource$write;", "Lo/setTextEndPaddingResource;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends setTextEndPaddingResource {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setTextEndPaddingResource$MediaBrowserCompatCustomActionResultReceiver;", "Lo/setTextEndPaddingResource;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaBrowserCompatCustomActionResultReceiver extends setTextEndPaddingResource {
        public static final MediaBrowserCompatCustomActionResultReceiver INSTANCE = new MediaBrowserCompatCustomActionResultReceiver();

        private MediaBrowserCompatCustomActionResultReceiver() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class onCustomAction extends setTextEndPaddingResource {
        private final boolean AudioAttributesCompatParcelizer;
        private final int IconCompatParcelizer;
        private final long RemoteActionCompatParcelizer;
        private final int read;
        private final boolean write;

        public onCustomAction(int i, int i2, boolean z, boolean z2, long j) {
            super(null);
            this.read = i;
            this.IconCompatParcelizer = i2;
            this.AudioAttributesCompatParcelizer = z;
            this.write = z2;
            this.RemoteActionCompatParcelizer = j;
        }

        public final int RemoteActionCompatParcelizer() {
            return this.read;
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final boolean write() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final boolean read() {
            return this.write;
        }

        public final long IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setTextEndPaddingResource$onCommand;", "Lo/setTextEndPaddingResource;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class onCommand extends setTextEndPaddingResource {
        public static final onCommand INSTANCE = new onCommand();

        private onCommand() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setTextEndPaddingResource$handleMediaPlayPauseIfPendingOnHandler;", "Lo/setTextEndPaddingResource;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class handleMediaPlayPauseIfPendingOnHandler extends setTextEndPaddingResource {
        public static final handleMediaPlayPauseIfPendingOnHandler INSTANCE = new handleMediaPlayPauseIfPendingOnHandler();

        private handleMediaPlayPauseIfPendingOnHandler() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class read extends setTextEndPaddingResource {
        private final readBlockToCache write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(readBlockToCache readblocktocache) {
            super(null);
            toMagicModuleMetaRepoModel.write(readblocktocache, "");
            this.write = readblocktocache;
        }

        public final readBlockToCache write() {
            return this.write;
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setTextEndPaddingResource$onFastForward;", "Lo/setTextEndPaddingResource;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class onFastForward extends setTextEndPaddingResource {
        public static final onFastForward INSTANCE = new onFastForward();

        private onFastForward() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setTextEndPaddingResource$MediaMetadataCompat;", "Lo/setTextEndPaddingResource;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaMetadataCompat extends setTextEndPaddingResource {
        public static final MediaMetadataCompat INSTANCE = new MediaMetadataCompat();

        private MediaMetadataCompat() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setTextEndPaddingResource$onPlayFromMediaId;", "Lo/setTextEndPaddingResource;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class onPlayFromMediaId extends setTextEndPaddingResource {
        public static final onPlayFromMediaId INSTANCE = new onPlayFromMediaId();

        private onPlayFromMediaId() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\r\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\t\u0010\f"}, d2 = {"Lo/setTextEndPaddingResource$MediaBrowserCompatMediaItem;", "Lo/setTextEndPaddingResource;", "", "p0", "", "p1", "p2", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "write", "Ljava/lang/String;", "read", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "Z", "()Z", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaBrowserCompatMediaItem extends setTextEndPaddingResource {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final boolean RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final String read;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final String AudioAttributesCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatMediaItem(String str, boolean z, String str2) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.AudioAttributesCompatParcelizer = str;
            this.RemoteActionCompatParcelizer = z;
            this.read = str2;
        }

        public /* synthetic */ MediaBrowserCompatMediaItem(String str, boolean z, String str2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(str, z, (i & 4) != 0 ? "" : str2);
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final boolean getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final String getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final String getRead() {
            return this.read;
        }
    }

    public static final class onAddQueueItem extends setTextEndPaddingResource {
        private final String AudioAttributesCompatParcelizer;
        private static final byte[] $$c = {93, -16, 105, -74};
        private static final int $$f = 31;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {16, -101, -28, -55, -19, -10, -3, -8, 9, 20, -6, 5};
        private static final int $$e = 159;
        private static final byte[] $$a = {66, 100, 74, -7, -11, 19, -23, -53, 60, -13, 11, -9, -59, 36, 18, 8, -15, -6, 1, -1, -21, 15, 0};
        private static final int $$b = 140;
        private static int MediaBrowserCompatCustomActionResultReceiver = 0;
        private static int AudioAttributesImplBaseParcelizer = 1;
        private static int write = 1000326170;
        private static char IconCompatParcelizer = 17775;
        private static char read = 22066;
        private static char RemoteActionCompatParcelizer = 5855;
        private static char AudioAttributesImplApi26Parcelizer = 25055;

        private static String $$g(int i, int i2, short s) {
            byte[] bArr = $$c;
            int i3 = (s * 4) + 122;
            int i4 = i2 + 4;
            int i5 = i * 4;
            byte[] bArr2 = new byte[i5 + 1];
            int i6 = -1;
            if (bArr == null) {
                i3 = i4 + i5;
                i4 = i4;
            }
            while (true) {
                i6++;
                bArr2[i6] = (byte) i3;
                int i7 = i4 + 1;
                if (i6 == i5) {
                    return new String(bArr2, 0);
                }
                i3 += bArr[i7];
                i4 = i7;
            }
        }

        private static void a(short s, int i, short s2, Object[] objArr) {
            byte[] bArr = $$d;
            int i2 = 114 - i;
            int i3 = s + 4;
            byte[] bArr2 = new byte[4 - s2];
            int i4 = 3 - s2;
            int i5 = -1;
            if (bArr == null) {
                i2 = i4 + i2 + 6;
            }
            while (true) {
                i5++;
                bArr2[i5] = (byte) i2;
                if (i5 == i4) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    i3++;
                    i2 = i2 + bArr[i3] + 6;
                }
            }
        }

        private static void d(int i, short s, int i2, Object[] objArr) {
            byte[] bArr = $$a;
            int i3 = i2 * 11;
            int i4 = 115 - (s * 9);
            int i5 = (i * 15) + 4;
            byte[] bArr2 = new byte[i3 + 5];
            int i6 = i3 + 4;
            int i7 = -1;
            if (bArr == null) {
                i4 = i5 + i6 + 2;
                i5++;
            }
            while (true) {
                i7++;
                bArr2[i7] = (byte) i4;
                if (i7 == i6) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i8 = i4;
                int i9 = i5 + 1;
                i4 = i8 + bArr[i5] + 2;
                i5 = i9;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onAddQueueItem(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.AudioAttributesCompatParcelizer = str;
        }

        public final String write() {
            int i = 2 % 2;
            int i2 = AudioAttributesImplBaseParcelizer;
            int i3 = i2 + 13;
            MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            String str = this.AudioAttributesCompatParcelizer;
            int i4 = i2 + 27;
            MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        private static void c(int i, char[] cArr, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2;
            int i4 = 2 % 2;
            isStopped isstopped = new isStopped();
            char[] cArr2 = new char[cArr.length];
            isstopped.read = 0;
            char[] cArr3 = new char[2];
            while (isstopped.read < cArr.length) {
                int i5 = $11 + 17;
                $10 = i5 % 128;
                if (i5 % i3 != 0) {
                    cArr3[0] = cArr[isstopped.read];
                    cArr3[0] = cArr[isstopped.read << 1];
                } else {
                    cArr3[0] = cArr[isstopped.read];
                    cArr3[1] = cArr[isstopped.read + 1];
                }
                int i6 = 58224;
                int i7 = 0;
                while (i7 < 16) {
                    int i8 = $11 + 1;
                    $10 = i8 % 128;
                    int i9 = i8 % i3;
                    char c = cArr3[1];
                    char c2 = cArr3[0];
                    int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (((long) RemoteActionCompatParcelizer) ^ 1193402106669854891L)));
                    int i11 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(AudioAttributesImplApi26Parcelizer);
                        objArr2[i3] = Integer.valueOf(i11);
                        objArr2[1] = Integer.valueOf(i10);
                        objArr2[0] = Integer.valueOf(c);
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(815477582);
                        if (objRemoteActionCompatParcelizer == null) {
                            byte b = (byte) 0;
                            byte b2 = (byte) (b - 1);
                            objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1503, AndroidCharacter.getMirror('0') - 27, 1322448859, false, $$g(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) IconCompatParcelizer) ^ 1193402106669854891L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(read)};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(815477582);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = (byte) (b3 - 1);
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.getOffsetAfter("", 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1505, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 21, 1322448859, false, $$g(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                        i6 -= 40503;
                        i7++;
                        i3 = 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2[isstopped.read] = cArr3[0];
                cArr2[isstopped.read + 1] = cArr3[1];
                Object[] objArr4 = {isstopped, isstopped};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-167774474);
                if (objRemoteActionCompatParcelizer3 == null) {
                    i2 = 2;
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 9015 - Process.getGidForName(""), ExpandableListView.getPackedPositionChild(0L) + 59, -1950993821, false, "D", new Class[]{Object.class, Object.class});
                } else {
                    i2 = 2;
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                i3 = i2;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        private static void b(int i, boolean z, char[] cArr, int i2, int i3, Object[] objArr) throws Throwable {
            int i4 = 2 % 2;
            clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
            char[] cArr2 = new char[i2];
            cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
                cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
                cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i3 + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
                int i5 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(write)};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((-1) - TextUtils.lastIndexOf("", '0')), View.resolveSizeAndState(0, 0, 0) + 23704, (ViewConfiguration.getLongPressTimeout() >> 16) + 32, -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (44863 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), Process.getGidForName("") + 18945, ImageFormat.getBitsPerPixel(0) + 29, -1836173544, false, "c", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            if (i > 0) {
                int i6 = $11 + 91;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                cleardownloadmanagerhelpers.write = i;
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr2, 0, cArr3, 0, i2);
                System.arraycopy(cArr3, 0, cArr2, i2 - cleardownloadmanagerhelpers.write, cleardownloadmanagerhelpers.write);
                System.arraycopy(cArr3, cleardownloadmanagerhelpers.write, cArr2, 0, i2 - cleardownloadmanagerhelpers.write);
                int i8 = $11 + 17;
                $10 = i8 % 128;
                int i9 = i8 % 2;
            }
            if (z) {
                char[] cArr4 = new char[i2];
                cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
                int i10 = $10 + 85;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
                    cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i2 - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                    Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (44862 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 18944 - ExpandableListView.getPackedPositionType(0L), KeyEvent.normalizeMetaState(0) + 28, -1836173544, false, "c", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(133:0|2|552|3|(1:5)|6|7|8|(1:10)|11|12|(125:14|15|(1:17)|18|19|(12:21|22|(1:24)|25|26|27|(1:29)|30|(125:32|(1:34)|35|36|(0)(1:39)|71|(6:73|74|(1:76)|77|78|(1:88))(6:81|82|(1:84)|85|86|(0))|92|93|(1:95)(1:96)|97|(6:99|100|(1:102)|103|104|(10:106|107|(1:109)(1:110)|111|112|113|(1:115)|116|(123:118|119|(1:121)|122|123|(0)(1:126)|136|(8:139|140|(1:142)|143|144|(2:146|583)(2:147|582)|148|137)|581|149|(1:151)|155|156|(1:158)|159|160|(5:162|163|(1:165)|166|167)(5:168|169|(1:171)|172|173)|174|(1:181)(1:180)|182|183|(1:185)|186|187|188|(1:190)|191|192|(1:194)(1:195)|196|(1:203)(2:200|(1:202)(0))|204|(2:205|(6:207|208|(1:210)|211|212|(2:584|214)(1:215))(2:585|216))|217|568|218|556|219|(1:221)|222|(5:224|225|(2:227|(8:587|231|232|550|233|(1:235)|236|(4:238|239|(1:241)(6:242|544|243|(1:245)|246|(0)(1:250))|266)(1:266))(1:230))|586|266)(7:231|232|550|233|(0)|236|(0)(0))|267|268|(1:270)|271|(3:273|(1:(2:275|(1:589)(1:278))(4:588|279|(7:282|283|(1:285)|286|287|(2:590|289)(1:290)|280)|591))|291)(1:291)|292|577|293|294|(3:575|295|(3:297|(4:300|301|(6:592|303|(1:305)(1:308)|540|306|(1:310))(1:311)|298)|593)(2:558|312))|324|(1:326)(2:327|(4:329|(4:334|(2:374|600)(5:340|579|341|342|(4:566|343|344|(4:346|(4:348|(4:562|350|351|(3:569|353|(2:598|355)(1:601))(1:356))(4:605|357|358|599)|533|(1:IC)(1:602))|606|359)(2:604|360)))|375|330)|597|326)(0))|376|573|377|378|(4:571|379|380|(3:382|(5:385|386|387|(5:594|389|564|390|(1:392))(1:393)|383)|595)(2:546|394))|406|407|408|(1:410)|411|412|(3:414|(1:416)|417)(1:418)|419|420|(1:422)|423|424|(1:426)(1:427)|428|429|(1:431)(1:432)|433|(1:435)|436|437|438|(1:440)(1:441)|442|443|(3:445|(1:447)(1:448)|449)|450|451|(1:453)|454|455|456|(1:458)|459|460|461|(1:463)|464|465|466|(1:468)|469|470|(2:472|(1:474))|475|476|(1:478)|479|480|(1:482)(1:483)|484|(1:486)|487|(3:489|(4:491|(1:493)|494|495)(4:496|(1:498)|499|500)|501)|502|503|(1:505)|506|507|508|(1:510)|511|542|512|513|514)(1:127)|(118:129|130|(1:132)|133|134|(5:136|(1:137)|581|149|(0)(0))|155|156|(0)|159|160|(0)(0)|174|(2:176|181)(0)|182|183|(0)|186|187|188|(0)|191|192|(0)(0)|196|(2:198|203)(0)|204|(3:205|(0)(0)|215)|217|568|218|556|219|(0)|222|(0)(0)|267|268|(0)|271|(0)(0)|292|577|293|294|(4:575|295|(0)(0)|593)|324|(0)(0)|376|573|377|378|(5:571|379|380|(0)(0)|595)|406|407|408|(0)|411|412|(0)(0)|419|420|(0)|423|424|(0)(0)|428|429|(0)(0)|433|(0)|436|437|438|(0)(0)|442|443|(0)|450|451|(0)|454|455|456|(0)|459|460|461|(0)|464|465|466|(0)|469|470|(0)|475|476|(0)|479|480|(0)(0)|484|(0)|487|(0)|502|503|(0)|506|507|508|(0)|511|542|512|513|514))(1:152))(1:153)|154|155|156|(0)|159|160|(0)(0)|174|(0)(0)|182|183|(0)|186|187|188|(0)|191|192|(0)(0)|196|(0)(0)|204|(3:205|(0)(0)|215)|217|568|218|556|219|(0)|222|(0)(0)|267|268|(0)|271|(0)(0)|292|577|293|294|(4:575|295|(0)(0)|593)|324|(0)(0)|376|573|377|378|(5:571|379|380|(0)(0)|595)|406|407|408|(0)|411|412|(0)(0)|419|420|(0)|423|424|(0)(0)|428|429|(0)(0)|433|(0)|436|437|438|(0)(0)|442|443|(0)|450|451|(0)|454|455|456|(0)|459|460|461|(0)|464|465|466|(0)|469|470|(0)|475|476|(0)|479|480|(0)(0)|484|(0)|487|(0)|502|503|(0)|506|507|508|(0)|511|542|512|513|514)(1:40)|(124:42|43|(1:45)(1:46)|47|48|(0)(3:51|71|(0)(0))|92|93|(0)(0)|97|(0)(0)|154|155|156|(0)|159|160|(0)(0)|174|(0)(0)|182|183|(0)|186|187|188|(0)|191|192|(0)(0)|196|(0)(0)|204|(3:205|(0)(0)|215)|217|568|218|556|219|(0)|222|(0)(0)|267|268|(0)|271|(0)(0)|292|577|293|294|(4:575|295|(0)(0)|593)|324|(0)(0)|376|573|377|378|(5:571|379|380|(0)(0)|595)|406|407|408|(0)|411|412|(0)(0)|419|420|(0)|423|424|(0)(0)|428|429|(0)(0)|433|(0)|436|437|438|(0)(0)|442|443|(0)|450|451|(0)|454|455|456|(0)|459|460|461|(0)|464|465|466|(0)|469|470|(0)|475|476|(0)|479|480|(0)(0)|484|(0)|487|(0)|502|503|(0)|506|507|508|(0)|511|542|512|513|514)(1:52)|(126:54|55|(1:57)|58|59|(0)(0)|71|(0)(0)|92|93|(0)(0)|97|(0)(0)|154|155|156|(0)|159|160|(0)(0)|174|(0)(0)|182|183|(0)|186|187|188|(0)|191|192|(0)(0)|196|(0)(0)|204|(3:205|(0)(0)|215)|217|568|218|556|219|(0)|222|(0)(0)|267|268|(0)|271|(0)(0)|292|577|293|294|(4:575|295|(0)(0)|593)|324|(0)(0)|376|573|377|378|(5:571|379|380|(0)(0)|595)|406|407|408|(0)|411|412|(0)(0)|419|420|(0)|423|424|(0)(0)|428|429|(0)(0)|433|(0)|436|437|438|(0)(0)|442|443|(0)|450|451|(0)|454|455|456|(0)|459|460|461|(0)|464|465|466|(0)|469|470|(0)|475|476|(0)|479|480|(0)(0)|484|(0)|487|(0)|502|503|(0)|506|507|508|(0)|511|542|512|513|514)(1:62)|(124:64|65|(1:67)|68|69|(2:71|(0)(0))|92|93|(0)(0)|97|(0)(0)|154|155|156|(0)|159|160|(0)(0)|174|(0)(0)|182|183|(0)|186|187|188|(0)|191|192|(0)(0)|196|(0)(0)|204|(3:205|(0)(0)|215)|217|568|218|556|219|(0)|222|(0)(0)|267|268|(0)|271|(0)(0)|292|577|293|294|(4:575|295|(0)(0)|593)|324|(0)(0)|376|573|377|378|(5:571|379|380|(0)(0)|595)|406|407|408|(0)|411|412|(0)(0)|419|420|(0)|423|424|(0)(0)|428|429|(0)(0)|433|(0)|436|437|438|(0)(0)|442|443|(0)|450|451|(0)|454|455|456|(0)|459|460|461|(0)|464|465|466|(0)|469|470|(0)|475|476|(0)|479|480|(0)(0)|484|(0)|487|(0)|502|503|(0)|506|507|508|(0)|511|542|512|513|514))|91|92|93|(0)(0)|97|(0)(0)|154|155|156|(0)|159|160|(0)(0)|174|(0)(0)|182|183|(0)|186|187|188|(0)|191|192|(0)(0)|196|(0)(0)|204|(3:205|(0)(0)|215)|217|568|218|556|219|(0)|222|(0)(0)|267|268|(0)|271|(0)(0)|292|577|293|294|(4:575|295|(0)(0)|593)|324|(0)(0)|376|573|377|378|(5:571|379|380|(0)(0)|595)|406|407|408|(0)|411|412|(0)(0)|419|420|(0)|423|424|(0)(0)|428|429|(0)(0)|433|(0)|436|437|438|(0)(0)|442|443|(0)|450|451|(0)|454|455|456|(0)|459|460|461|(0)|464|465|466|(0)|469|470|(0)|475|476|(0)|479|480|(0)(0)|484|(0)|487|(0)|502|503|(0)|506|507|508|(0)|511|542|512|513|514)(1:89)|90|91|92|93|(0)(0)|97|(0)(0)|154|155|156|(0)|159|160|(0)(0)|174|(0)(0)|182|183|(0)|186|187|188|(0)|191|192|(0)(0)|196|(0)(0)|204|(3:205|(0)(0)|215)|217|568|218|556|219|(0)|222|(0)(0)|267|268|(0)|271|(0)(0)|292|577|293|294|(4:575|295|(0)(0)|593)|324|(0)(0)|376|573|377|378|(5:571|379|380|(0)(0)|595)|406|407|408|(0)|411|412|(0)(0)|419|420|(0)|423|424|(0)(0)|428|429|(0)(0)|433|(0)|436|437|438|(0)(0)|442|443|(0)|450|451|(0)|454|455|456|(0)|459|460|461|(0)|464|465|466|(0)|469|470|(0)|475|476|(0)|479|480|(0)(0)|484|(0)|487|(0)|502|503|(0)|506|507|508|(0)|511|542|512|513|514|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:316:0x2bca, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:317:0x2bcb, code lost:
        
            r1 = r0;
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:321:0x2bd3, code lost:
        
            r6 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:398:0x2e26, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:399:0x2e27, code lost:
        
            r1 = r0;
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:403:0x2e2f, code lost:
        
            r6 = null;
         */
        /* JADX WARN: Removed duplicated region for block: B:139:0x1727  */
        /* JADX WARN: Removed duplicated region for block: B:151:0x1900  */
        /* JADX WARN: Removed duplicated region for block: B:153:0x1909  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x1961 A[Catch: all -> 0x3eb3, TryCatch #11 {all -> 0x3eb3, blocks: (B:3:0x0008, B:5:0x0015, B:6:0x0047, B:8:0x013b, B:10:0x0149, B:11:0x018d, B:15:0x01cb, B:17:0x01d8, B:18:0x0223, B:22:0x0308, B:24:0x0315, B:25:0x035c, B:27:0x0439, B:29:0x0446, B:30:0x048a, B:32:0x0493, B:34:0x04ab, B:35:0x04f1, B:74:0x0918, B:76:0x0925, B:77:0x095e, B:93:0x1175, B:95:0x1182, B:97:0x11d4, B:100:0x125f, B:102:0x126c, B:103:0x12b3, B:107:0x139a, B:109:0x13a7, B:111:0x13f0, B:113:0x1480, B:115:0x148d, B:116:0x14d3, B:119:0x14e9, B:121:0x1500, B:122:0x1545, B:140:0x17e1, B:142:0x17ee, B:143:0x182a, B:156:0x1954, B:158:0x1961, B:159:0x19a0, B:163:0x1a91, B:165:0x1a9e, B:166:0x1add, B:183:0x1cfa, B:185:0x1d07, B:186:0x1d42, B:188:0x1e0c, B:190:0x1e19, B:191:0x1e4e, B:208:0x212f, B:210:0x213c, B:211:0x217d, B:268:0x2594, B:270:0x25a1, B:271:0x25e9, B:283:0x299d, B:285:0x29aa, B:286:0x29ea, B:408:0x2e5c, B:410:0x2e62, B:411:0x2ea5, B:420:0x2f61, B:422:0x2f67, B:423:0x2fa6, B:429:0x3065, B:431:0x306b, B:433:0x30ab, B:435:0x3167, B:436:0x319d, B:438:0x3251, B:440:0x3257, B:442:0x3291, B:451:0x3386, B:453:0x3393, B:454:0x33ce, B:456:0x352e, B:458:0x3541, B:459:0x357d, B:461:0x3647, B:463:0x364d, B:464:0x367f, B:466:0x376c, B:468:0x3791, B:469:0x37e4, B:476:0x38ef, B:478:0x38fc, B:479:0x393a, B:491:0x3aad, B:493:0x3ab3, B:494:0x3aec, B:496:0x3b6e, B:498:0x3b74, B:499:0x3ba9, B:503:0x3c72, B:505:0x3c78, B:506:0x3cae, B:508:0x3d73, B:510:0x3da1, B:511:0x3e03, B:169:0x1b7c, B:171:0x1b89, B:172:0x1bc5, B:130:0x1613, B:132:0x162a, B:133:0x166e, B:82:0x0a55, B:84:0x0a62, B:85:0x0aaa, B:43:0x05b8, B:45:0x05cf, B:47:0x061d, B:55:0x06cf, B:57:0x06e6, B:58:0x072d, B:65:0x07fc, B:67:0x0813, B:68:0x0858), top: B:552:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:162:0x1a77  */
        /* JADX WARN: Removed duplicated region for block: B:168:0x1b65  */
        /* JADX WARN: Removed duplicated region for block: B:176:0x1c9d  */
        /* JADX WARN: Removed duplicated region for block: B:181:0x1cb4  */
        /* JADX WARN: Removed duplicated region for block: B:185:0x1d07 A[Catch: all -> 0x3eb3, TryCatch #11 {all -> 0x3eb3, blocks: (B:3:0x0008, B:5:0x0015, B:6:0x0047, B:8:0x013b, B:10:0x0149, B:11:0x018d, B:15:0x01cb, B:17:0x01d8, B:18:0x0223, B:22:0x0308, B:24:0x0315, B:25:0x035c, B:27:0x0439, B:29:0x0446, B:30:0x048a, B:32:0x0493, B:34:0x04ab, B:35:0x04f1, B:74:0x0918, B:76:0x0925, B:77:0x095e, B:93:0x1175, B:95:0x1182, B:97:0x11d4, B:100:0x125f, B:102:0x126c, B:103:0x12b3, B:107:0x139a, B:109:0x13a7, B:111:0x13f0, B:113:0x1480, B:115:0x148d, B:116:0x14d3, B:119:0x14e9, B:121:0x1500, B:122:0x1545, B:140:0x17e1, B:142:0x17ee, B:143:0x182a, B:156:0x1954, B:158:0x1961, B:159:0x19a0, B:163:0x1a91, B:165:0x1a9e, B:166:0x1add, B:183:0x1cfa, B:185:0x1d07, B:186:0x1d42, B:188:0x1e0c, B:190:0x1e19, B:191:0x1e4e, B:208:0x212f, B:210:0x213c, B:211:0x217d, B:268:0x2594, B:270:0x25a1, B:271:0x25e9, B:283:0x299d, B:285:0x29aa, B:286:0x29ea, B:408:0x2e5c, B:410:0x2e62, B:411:0x2ea5, B:420:0x2f61, B:422:0x2f67, B:423:0x2fa6, B:429:0x3065, B:431:0x306b, B:433:0x30ab, B:435:0x3167, B:436:0x319d, B:438:0x3251, B:440:0x3257, B:442:0x3291, B:451:0x3386, B:453:0x3393, B:454:0x33ce, B:456:0x352e, B:458:0x3541, B:459:0x357d, B:461:0x3647, B:463:0x364d, B:464:0x367f, B:466:0x376c, B:468:0x3791, B:469:0x37e4, B:476:0x38ef, B:478:0x38fc, B:479:0x393a, B:491:0x3aad, B:493:0x3ab3, B:494:0x3aec, B:496:0x3b6e, B:498:0x3b74, B:499:0x3ba9, B:503:0x3c72, B:505:0x3c78, B:506:0x3cae, B:508:0x3d73, B:510:0x3da1, B:511:0x3e03, B:169:0x1b7c, B:171:0x1b89, B:172:0x1bc5, B:130:0x1613, B:132:0x162a, B:133:0x166e, B:82:0x0a55, B:84:0x0a62, B:85:0x0aaa, B:43:0x05b8, B:45:0x05cf, B:47:0x061d, B:55:0x06cf, B:57:0x06e6, B:58:0x072d, B:65:0x07fc, B:67:0x0813, B:68:0x0858), top: B:552:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:190:0x1e19 A[Catch: all -> 0x3eb3, TryCatch #11 {all -> 0x3eb3, blocks: (B:3:0x0008, B:5:0x0015, B:6:0x0047, B:8:0x013b, B:10:0x0149, B:11:0x018d, B:15:0x01cb, B:17:0x01d8, B:18:0x0223, B:22:0x0308, B:24:0x0315, B:25:0x035c, B:27:0x0439, B:29:0x0446, B:30:0x048a, B:32:0x0493, B:34:0x04ab, B:35:0x04f1, B:74:0x0918, B:76:0x0925, B:77:0x095e, B:93:0x1175, B:95:0x1182, B:97:0x11d4, B:100:0x125f, B:102:0x126c, B:103:0x12b3, B:107:0x139a, B:109:0x13a7, B:111:0x13f0, B:113:0x1480, B:115:0x148d, B:116:0x14d3, B:119:0x14e9, B:121:0x1500, B:122:0x1545, B:140:0x17e1, B:142:0x17ee, B:143:0x182a, B:156:0x1954, B:158:0x1961, B:159:0x19a0, B:163:0x1a91, B:165:0x1a9e, B:166:0x1add, B:183:0x1cfa, B:185:0x1d07, B:186:0x1d42, B:188:0x1e0c, B:190:0x1e19, B:191:0x1e4e, B:208:0x212f, B:210:0x213c, B:211:0x217d, B:268:0x2594, B:270:0x25a1, B:271:0x25e9, B:283:0x299d, B:285:0x29aa, B:286:0x29ea, B:408:0x2e5c, B:410:0x2e62, B:411:0x2ea5, B:420:0x2f61, B:422:0x2f67, B:423:0x2fa6, B:429:0x3065, B:431:0x306b, B:433:0x30ab, B:435:0x3167, B:436:0x319d, B:438:0x3251, B:440:0x3257, B:442:0x3291, B:451:0x3386, B:453:0x3393, B:454:0x33ce, B:456:0x352e, B:458:0x3541, B:459:0x357d, B:461:0x3647, B:463:0x364d, B:464:0x367f, B:466:0x376c, B:468:0x3791, B:469:0x37e4, B:476:0x38ef, B:478:0x38fc, B:479:0x393a, B:491:0x3aad, B:493:0x3ab3, B:494:0x3aec, B:496:0x3b6e, B:498:0x3b74, B:499:0x3ba9, B:503:0x3c72, B:505:0x3c78, B:506:0x3cae, B:508:0x3d73, B:510:0x3da1, B:511:0x3e03, B:169:0x1b7c, B:171:0x1b89, B:172:0x1bc5, B:130:0x1613, B:132:0x162a, B:133:0x166e, B:82:0x0a55, B:84:0x0a62, B:85:0x0aaa, B:43:0x05b8, B:45:0x05cf, B:47:0x061d, B:55:0x06cf, B:57:0x06e6, B:58:0x072d, B:65:0x07fc, B:67:0x0813, B:68:0x0858), top: B:552:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:194:0x1e6c  */
        /* JADX WARN: Removed duplicated region for block: B:195:0x1f03  */
        /* JADX WARN: Removed duplicated region for block: B:198:0x1fb7  */
        /* JADX WARN: Removed duplicated region for block: B:203:0x1fd1  */
        /* JADX WARN: Removed duplicated region for block: B:207:0x212d  */
        /* JADX WARN: Removed duplicated region for block: B:221:0x2299 A[Catch: all -> 0x253d, TryCatch #13 {all -> 0x253d, blocks: (B:219:0x228c, B:221:0x2299, B:222:0x22e0), top: B:556:0x228c, outer: #24 }] */
        /* JADX WARN: Removed duplicated region for block: B:224:0x22eb  */
        /* JADX WARN: Removed duplicated region for block: B:231:0x2382  */
        /* JADX WARN: Removed duplicated region for block: B:235:0x23ad A[Catch: all -> 0x2533, TryCatch #10 {all -> 0x2533, blocks: (B:233:0x23a0, B:235:0x23ad, B:236:0x23f3), top: B:550:0x23a0, outer: #24 }] */
        /* JADX WARN: Removed duplicated region for block: B:238:0x23fc  */
        /* JADX WARN: Removed duplicated region for block: B:266:0x2547  */
        /* JADX WARN: Removed duplicated region for block: B:270:0x25a1 A[Catch: all -> 0x3eb3, TryCatch #11 {all -> 0x3eb3, blocks: (B:3:0x0008, B:5:0x0015, B:6:0x0047, B:8:0x013b, B:10:0x0149, B:11:0x018d, B:15:0x01cb, B:17:0x01d8, B:18:0x0223, B:22:0x0308, B:24:0x0315, B:25:0x035c, B:27:0x0439, B:29:0x0446, B:30:0x048a, B:32:0x0493, B:34:0x04ab, B:35:0x04f1, B:74:0x0918, B:76:0x0925, B:77:0x095e, B:93:0x1175, B:95:0x1182, B:97:0x11d4, B:100:0x125f, B:102:0x126c, B:103:0x12b3, B:107:0x139a, B:109:0x13a7, B:111:0x13f0, B:113:0x1480, B:115:0x148d, B:116:0x14d3, B:119:0x14e9, B:121:0x1500, B:122:0x1545, B:140:0x17e1, B:142:0x17ee, B:143:0x182a, B:156:0x1954, B:158:0x1961, B:159:0x19a0, B:163:0x1a91, B:165:0x1a9e, B:166:0x1add, B:183:0x1cfa, B:185:0x1d07, B:186:0x1d42, B:188:0x1e0c, B:190:0x1e19, B:191:0x1e4e, B:208:0x212f, B:210:0x213c, B:211:0x217d, B:268:0x2594, B:270:0x25a1, B:271:0x25e9, B:283:0x299d, B:285:0x29aa, B:286:0x29ea, B:408:0x2e5c, B:410:0x2e62, B:411:0x2ea5, B:420:0x2f61, B:422:0x2f67, B:423:0x2fa6, B:429:0x3065, B:431:0x306b, B:433:0x30ab, B:435:0x3167, B:436:0x319d, B:438:0x3251, B:440:0x3257, B:442:0x3291, B:451:0x3386, B:453:0x3393, B:454:0x33ce, B:456:0x352e, B:458:0x3541, B:459:0x357d, B:461:0x3647, B:463:0x364d, B:464:0x367f, B:466:0x376c, B:468:0x3791, B:469:0x37e4, B:476:0x38ef, B:478:0x38fc, B:479:0x393a, B:491:0x3aad, B:493:0x3ab3, B:494:0x3aec, B:496:0x3b6e, B:498:0x3b74, B:499:0x3ba9, B:503:0x3c72, B:505:0x3c78, B:506:0x3cae, B:508:0x3d73, B:510:0x3da1, B:511:0x3e03, B:169:0x1b7c, B:171:0x1b89, B:172:0x1bc5, B:130:0x1613, B:132:0x162a, B:133:0x166e, B:82:0x0a55, B:84:0x0a62, B:85:0x0aaa, B:43:0x05b8, B:45:0x05cf, B:47:0x061d, B:55:0x06cf, B:57:0x06e6, B:58:0x072d, B:65:0x07fc, B:67:0x0813, B:68:0x0858), top: B:552:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:273:0x25f4  */
        /* JADX WARN: Removed duplicated region for block: B:291:0x2abd A[EDGE_INSN: B:589:0x2abd->B:291:0x2abd BREAK  A[LOOP:3: B:274:0x2619->B:278:0x2626], PHI: r4
          0x2abd: PHI (r4v90 int) = (r4v89 int), (r4v223 int), (r4v89 int) binds: [B:272:0x25f2, B:591:0x2abd, B:589:0x2abd] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:297:0x2b07 A[Catch: all -> 0x2bc6, IOException -> 0x2bd4, TryCatch #26 {IOException -> 0x2bd4, all -> 0x2bc6, blocks: (B:295:0x2b00, B:297:0x2b07, B:300:0x2b13), top: B:575:0x2b00 }] */
        /* JADX WARN: Removed duplicated region for block: B:326:0x2bdd  */
        /* JADX WARN: Removed duplicated region for block: B:327:0x2be0  */
        /* JADX WARN: Removed duplicated region for block: B:382:0x2ddd  */
        /* JADX WARN: Removed duplicated region for block: B:410:0x2e62 A[Catch: all -> 0x3eb3, TryCatch #11 {all -> 0x3eb3, blocks: (B:3:0x0008, B:5:0x0015, B:6:0x0047, B:8:0x013b, B:10:0x0149, B:11:0x018d, B:15:0x01cb, B:17:0x01d8, B:18:0x0223, B:22:0x0308, B:24:0x0315, B:25:0x035c, B:27:0x0439, B:29:0x0446, B:30:0x048a, B:32:0x0493, B:34:0x04ab, B:35:0x04f1, B:74:0x0918, B:76:0x0925, B:77:0x095e, B:93:0x1175, B:95:0x1182, B:97:0x11d4, B:100:0x125f, B:102:0x126c, B:103:0x12b3, B:107:0x139a, B:109:0x13a7, B:111:0x13f0, B:113:0x1480, B:115:0x148d, B:116:0x14d3, B:119:0x14e9, B:121:0x1500, B:122:0x1545, B:140:0x17e1, B:142:0x17ee, B:143:0x182a, B:156:0x1954, B:158:0x1961, B:159:0x19a0, B:163:0x1a91, B:165:0x1a9e, B:166:0x1add, B:183:0x1cfa, B:185:0x1d07, B:186:0x1d42, B:188:0x1e0c, B:190:0x1e19, B:191:0x1e4e, B:208:0x212f, B:210:0x213c, B:211:0x217d, B:268:0x2594, B:270:0x25a1, B:271:0x25e9, B:283:0x299d, B:285:0x29aa, B:286:0x29ea, B:408:0x2e5c, B:410:0x2e62, B:411:0x2ea5, B:420:0x2f61, B:422:0x2f67, B:423:0x2fa6, B:429:0x3065, B:431:0x306b, B:433:0x30ab, B:435:0x3167, B:436:0x319d, B:438:0x3251, B:440:0x3257, B:442:0x3291, B:451:0x3386, B:453:0x3393, B:454:0x33ce, B:456:0x352e, B:458:0x3541, B:459:0x357d, B:461:0x3647, B:463:0x364d, B:464:0x367f, B:466:0x376c, B:468:0x3791, B:469:0x37e4, B:476:0x38ef, B:478:0x38fc, B:479:0x393a, B:491:0x3aad, B:493:0x3ab3, B:494:0x3aec, B:496:0x3b6e, B:498:0x3b74, B:499:0x3ba9, B:503:0x3c72, B:505:0x3c78, B:506:0x3cae, B:508:0x3d73, B:510:0x3da1, B:511:0x3e03, B:169:0x1b7c, B:171:0x1b89, B:172:0x1bc5, B:130:0x1613, B:132:0x162a, B:133:0x166e, B:82:0x0a55, B:84:0x0a62, B:85:0x0aaa, B:43:0x05b8, B:45:0x05cf, B:47:0x061d, B:55:0x06cf, B:57:0x06e6, B:58:0x072d, B:65:0x07fc, B:67:0x0813, B:68:0x0858), top: B:552:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:414:0x2f3b  */
        /* JADX WARN: Removed duplicated region for block: B:418:0x2f4c  */
        /* JADX WARN: Removed duplicated region for block: B:422:0x2f67 A[Catch: all -> 0x3eb3, TryCatch #11 {all -> 0x3eb3, blocks: (B:3:0x0008, B:5:0x0015, B:6:0x0047, B:8:0x013b, B:10:0x0149, B:11:0x018d, B:15:0x01cb, B:17:0x01d8, B:18:0x0223, B:22:0x0308, B:24:0x0315, B:25:0x035c, B:27:0x0439, B:29:0x0446, B:30:0x048a, B:32:0x0493, B:34:0x04ab, B:35:0x04f1, B:74:0x0918, B:76:0x0925, B:77:0x095e, B:93:0x1175, B:95:0x1182, B:97:0x11d4, B:100:0x125f, B:102:0x126c, B:103:0x12b3, B:107:0x139a, B:109:0x13a7, B:111:0x13f0, B:113:0x1480, B:115:0x148d, B:116:0x14d3, B:119:0x14e9, B:121:0x1500, B:122:0x1545, B:140:0x17e1, B:142:0x17ee, B:143:0x182a, B:156:0x1954, B:158:0x1961, B:159:0x19a0, B:163:0x1a91, B:165:0x1a9e, B:166:0x1add, B:183:0x1cfa, B:185:0x1d07, B:186:0x1d42, B:188:0x1e0c, B:190:0x1e19, B:191:0x1e4e, B:208:0x212f, B:210:0x213c, B:211:0x217d, B:268:0x2594, B:270:0x25a1, B:271:0x25e9, B:283:0x299d, B:285:0x29aa, B:286:0x29ea, B:408:0x2e5c, B:410:0x2e62, B:411:0x2ea5, B:420:0x2f61, B:422:0x2f67, B:423:0x2fa6, B:429:0x3065, B:431:0x306b, B:433:0x30ab, B:435:0x3167, B:436:0x319d, B:438:0x3251, B:440:0x3257, B:442:0x3291, B:451:0x3386, B:453:0x3393, B:454:0x33ce, B:456:0x352e, B:458:0x3541, B:459:0x357d, B:461:0x3647, B:463:0x364d, B:464:0x367f, B:466:0x376c, B:468:0x3791, B:469:0x37e4, B:476:0x38ef, B:478:0x38fc, B:479:0x393a, B:491:0x3aad, B:493:0x3ab3, B:494:0x3aec, B:496:0x3b6e, B:498:0x3b74, B:499:0x3ba9, B:503:0x3c72, B:505:0x3c78, B:506:0x3cae, B:508:0x3d73, B:510:0x3da1, B:511:0x3e03, B:169:0x1b7c, B:171:0x1b89, B:172:0x1bc5, B:130:0x1613, B:132:0x162a, B:133:0x166e, B:82:0x0a55, B:84:0x0a62, B:85:0x0aaa, B:43:0x05b8, B:45:0x05cf, B:47:0x061d, B:55:0x06cf, B:57:0x06e6, B:58:0x072d, B:65:0x07fc, B:67:0x0813, B:68:0x0858), top: B:552:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:426:0x304b  */
        /* JADX WARN: Removed duplicated region for block: B:427:0x3051  */
        /* JADX WARN: Removed duplicated region for block: B:431:0x306b A[Catch: all -> 0x3eb3, TryCatch #11 {all -> 0x3eb3, blocks: (B:3:0x0008, B:5:0x0015, B:6:0x0047, B:8:0x013b, B:10:0x0149, B:11:0x018d, B:15:0x01cb, B:17:0x01d8, B:18:0x0223, B:22:0x0308, B:24:0x0315, B:25:0x035c, B:27:0x0439, B:29:0x0446, B:30:0x048a, B:32:0x0493, B:34:0x04ab, B:35:0x04f1, B:74:0x0918, B:76:0x0925, B:77:0x095e, B:93:0x1175, B:95:0x1182, B:97:0x11d4, B:100:0x125f, B:102:0x126c, B:103:0x12b3, B:107:0x139a, B:109:0x13a7, B:111:0x13f0, B:113:0x1480, B:115:0x148d, B:116:0x14d3, B:119:0x14e9, B:121:0x1500, B:122:0x1545, B:140:0x17e1, B:142:0x17ee, B:143:0x182a, B:156:0x1954, B:158:0x1961, B:159:0x19a0, B:163:0x1a91, B:165:0x1a9e, B:166:0x1add, B:183:0x1cfa, B:185:0x1d07, B:186:0x1d42, B:188:0x1e0c, B:190:0x1e19, B:191:0x1e4e, B:208:0x212f, B:210:0x213c, B:211:0x217d, B:268:0x2594, B:270:0x25a1, B:271:0x25e9, B:283:0x299d, B:285:0x29aa, B:286:0x29ea, B:408:0x2e5c, B:410:0x2e62, B:411:0x2ea5, B:420:0x2f61, B:422:0x2f67, B:423:0x2fa6, B:429:0x3065, B:431:0x306b, B:433:0x30ab, B:435:0x3167, B:436:0x319d, B:438:0x3251, B:440:0x3257, B:442:0x3291, B:451:0x3386, B:453:0x3393, B:454:0x33ce, B:456:0x352e, B:458:0x3541, B:459:0x357d, B:461:0x3647, B:463:0x364d, B:464:0x367f, B:466:0x376c, B:468:0x3791, B:469:0x37e4, B:476:0x38ef, B:478:0x38fc, B:479:0x393a, B:491:0x3aad, B:493:0x3ab3, B:494:0x3aec, B:496:0x3b6e, B:498:0x3b74, B:499:0x3ba9, B:503:0x3c72, B:505:0x3c78, B:506:0x3cae, B:508:0x3d73, B:510:0x3da1, B:511:0x3e03, B:169:0x1b7c, B:171:0x1b89, B:172:0x1bc5, B:130:0x1613, B:132:0x162a, B:133:0x166e, B:82:0x0a55, B:84:0x0a62, B:85:0x0aaa, B:43:0x05b8, B:45:0x05cf, B:47:0x061d, B:55:0x06cf, B:57:0x06e6, B:58:0x072d, B:65:0x07fc, B:67:0x0813, B:68:0x0858), top: B:552:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:432:0x30a9  */
        /* JADX WARN: Removed duplicated region for block: B:435:0x3167 A[Catch: all -> 0x3eb3, TryCatch #11 {all -> 0x3eb3, blocks: (B:3:0x0008, B:5:0x0015, B:6:0x0047, B:8:0x013b, B:10:0x0149, B:11:0x018d, B:15:0x01cb, B:17:0x01d8, B:18:0x0223, B:22:0x0308, B:24:0x0315, B:25:0x035c, B:27:0x0439, B:29:0x0446, B:30:0x048a, B:32:0x0493, B:34:0x04ab, B:35:0x04f1, B:74:0x0918, B:76:0x0925, B:77:0x095e, B:93:0x1175, B:95:0x1182, B:97:0x11d4, B:100:0x125f, B:102:0x126c, B:103:0x12b3, B:107:0x139a, B:109:0x13a7, B:111:0x13f0, B:113:0x1480, B:115:0x148d, B:116:0x14d3, B:119:0x14e9, B:121:0x1500, B:122:0x1545, B:140:0x17e1, B:142:0x17ee, B:143:0x182a, B:156:0x1954, B:158:0x1961, B:159:0x19a0, B:163:0x1a91, B:165:0x1a9e, B:166:0x1add, B:183:0x1cfa, B:185:0x1d07, B:186:0x1d42, B:188:0x1e0c, B:190:0x1e19, B:191:0x1e4e, B:208:0x212f, B:210:0x213c, B:211:0x217d, B:268:0x2594, B:270:0x25a1, B:271:0x25e9, B:283:0x299d, B:285:0x29aa, B:286:0x29ea, B:408:0x2e5c, B:410:0x2e62, B:411:0x2ea5, B:420:0x2f61, B:422:0x2f67, B:423:0x2fa6, B:429:0x3065, B:431:0x306b, B:433:0x30ab, B:435:0x3167, B:436:0x319d, B:438:0x3251, B:440:0x3257, B:442:0x3291, B:451:0x3386, B:453:0x3393, B:454:0x33ce, B:456:0x352e, B:458:0x3541, B:459:0x357d, B:461:0x3647, B:463:0x364d, B:464:0x367f, B:466:0x376c, B:468:0x3791, B:469:0x37e4, B:476:0x38ef, B:478:0x38fc, B:479:0x393a, B:491:0x3aad, B:493:0x3ab3, B:494:0x3aec, B:496:0x3b6e, B:498:0x3b74, B:499:0x3ba9, B:503:0x3c72, B:505:0x3c78, B:506:0x3cae, B:508:0x3d73, B:510:0x3da1, B:511:0x3e03, B:169:0x1b7c, B:171:0x1b89, B:172:0x1bc5, B:130:0x1613, B:132:0x162a, B:133:0x166e, B:82:0x0a55, B:84:0x0a62, B:85:0x0aaa, B:43:0x05b8, B:45:0x05cf, B:47:0x061d, B:55:0x06cf, B:57:0x06e6, B:58:0x072d, B:65:0x07fc, B:67:0x0813, B:68:0x0858), top: B:552:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:440:0x3257 A[Catch: all -> 0x3eb3, TryCatch #11 {all -> 0x3eb3, blocks: (B:3:0x0008, B:5:0x0015, B:6:0x0047, B:8:0x013b, B:10:0x0149, B:11:0x018d, B:15:0x01cb, B:17:0x01d8, B:18:0x0223, B:22:0x0308, B:24:0x0315, B:25:0x035c, B:27:0x0439, B:29:0x0446, B:30:0x048a, B:32:0x0493, B:34:0x04ab, B:35:0x04f1, B:74:0x0918, B:76:0x0925, B:77:0x095e, B:93:0x1175, B:95:0x1182, B:97:0x11d4, B:100:0x125f, B:102:0x126c, B:103:0x12b3, B:107:0x139a, B:109:0x13a7, B:111:0x13f0, B:113:0x1480, B:115:0x148d, B:116:0x14d3, B:119:0x14e9, B:121:0x1500, B:122:0x1545, B:140:0x17e1, B:142:0x17ee, B:143:0x182a, B:156:0x1954, B:158:0x1961, B:159:0x19a0, B:163:0x1a91, B:165:0x1a9e, B:166:0x1add, B:183:0x1cfa, B:185:0x1d07, B:186:0x1d42, B:188:0x1e0c, B:190:0x1e19, B:191:0x1e4e, B:208:0x212f, B:210:0x213c, B:211:0x217d, B:268:0x2594, B:270:0x25a1, B:271:0x25e9, B:283:0x299d, B:285:0x29aa, B:286:0x29ea, B:408:0x2e5c, B:410:0x2e62, B:411:0x2ea5, B:420:0x2f61, B:422:0x2f67, B:423:0x2fa6, B:429:0x3065, B:431:0x306b, B:433:0x30ab, B:435:0x3167, B:436:0x319d, B:438:0x3251, B:440:0x3257, B:442:0x3291, B:451:0x3386, B:453:0x3393, B:454:0x33ce, B:456:0x352e, B:458:0x3541, B:459:0x357d, B:461:0x3647, B:463:0x364d, B:464:0x367f, B:466:0x376c, B:468:0x3791, B:469:0x37e4, B:476:0x38ef, B:478:0x38fc, B:479:0x393a, B:491:0x3aad, B:493:0x3ab3, B:494:0x3aec, B:496:0x3b6e, B:498:0x3b74, B:499:0x3ba9, B:503:0x3c72, B:505:0x3c78, B:506:0x3cae, B:508:0x3d73, B:510:0x3da1, B:511:0x3e03, B:169:0x1b7c, B:171:0x1b89, B:172:0x1bc5, B:130:0x1613, B:132:0x162a, B:133:0x166e, B:82:0x0a55, B:84:0x0a62, B:85:0x0aaa, B:43:0x05b8, B:45:0x05cf, B:47:0x061d, B:55:0x06cf, B:57:0x06e6, B:58:0x072d, B:65:0x07fc, B:67:0x0813, B:68:0x0858), top: B:552:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:441:0x328f  */
        /* JADX WARN: Removed duplicated region for block: B:445:0x332e  */
        /* JADX WARN: Removed duplicated region for block: B:453:0x3393 A[Catch: all -> 0x3eb3, TryCatch #11 {all -> 0x3eb3, blocks: (B:3:0x0008, B:5:0x0015, B:6:0x0047, B:8:0x013b, B:10:0x0149, B:11:0x018d, B:15:0x01cb, B:17:0x01d8, B:18:0x0223, B:22:0x0308, B:24:0x0315, B:25:0x035c, B:27:0x0439, B:29:0x0446, B:30:0x048a, B:32:0x0493, B:34:0x04ab, B:35:0x04f1, B:74:0x0918, B:76:0x0925, B:77:0x095e, B:93:0x1175, B:95:0x1182, B:97:0x11d4, B:100:0x125f, B:102:0x126c, B:103:0x12b3, B:107:0x139a, B:109:0x13a7, B:111:0x13f0, B:113:0x1480, B:115:0x148d, B:116:0x14d3, B:119:0x14e9, B:121:0x1500, B:122:0x1545, B:140:0x17e1, B:142:0x17ee, B:143:0x182a, B:156:0x1954, B:158:0x1961, B:159:0x19a0, B:163:0x1a91, B:165:0x1a9e, B:166:0x1add, B:183:0x1cfa, B:185:0x1d07, B:186:0x1d42, B:188:0x1e0c, B:190:0x1e19, B:191:0x1e4e, B:208:0x212f, B:210:0x213c, B:211:0x217d, B:268:0x2594, B:270:0x25a1, B:271:0x25e9, B:283:0x299d, B:285:0x29aa, B:286:0x29ea, B:408:0x2e5c, B:410:0x2e62, B:411:0x2ea5, B:420:0x2f61, B:422:0x2f67, B:423:0x2fa6, B:429:0x3065, B:431:0x306b, B:433:0x30ab, B:435:0x3167, B:436:0x319d, B:438:0x3251, B:440:0x3257, B:442:0x3291, B:451:0x3386, B:453:0x3393, B:454:0x33ce, B:456:0x352e, B:458:0x3541, B:459:0x357d, B:461:0x3647, B:463:0x364d, B:464:0x367f, B:466:0x376c, B:468:0x3791, B:469:0x37e4, B:476:0x38ef, B:478:0x38fc, B:479:0x393a, B:491:0x3aad, B:493:0x3ab3, B:494:0x3aec, B:496:0x3b6e, B:498:0x3b74, B:499:0x3ba9, B:503:0x3c72, B:505:0x3c78, B:506:0x3cae, B:508:0x3d73, B:510:0x3da1, B:511:0x3e03, B:169:0x1b7c, B:171:0x1b89, B:172:0x1bc5, B:130:0x1613, B:132:0x162a, B:133:0x166e, B:82:0x0a55, B:84:0x0a62, B:85:0x0aaa, B:43:0x05b8, B:45:0x05cf, B:47:0x061d, B:55:0x06cf, B:57:0x06e6, B:58:0x072d, B:65:0x07fc, B:67:0x0813, B:68:0x0858), top: B:552:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:458:0x3541 A[Catch: all -> 0x3eb3, TryCatch #11 {all -> 0x3eb3, blocks: (B:3:0x0008, B:5:0x0015, B:6:0x0047, B:8:0x013b, B:10:0x0149, B:11:0x018d, B:15:0x01cb, B:17:0x01d8, B:18:0x0223, B:22:0x0308, B:24:0x0315, B:25:0x035c, B:27:0x0439, B:29:0x0446, B:30:0x048a, B:32:0x0493, B:34:0x04ab, B:35:0x04f1, B:74:0x0918, B:76:0x0925, B:77:0x095e, B:93:0x1175, B:95:0x1182, B:97:0x11d4, B:100:0x125f, B:102:0x126c, B:103:0x12b3, B:107:0x139a, B:109:0x13a7, B:111:0x13f0, B:113:0x1480, B:115:0x148d, B:116:0x14d3, B:119:0x14e9, B:121:0x1500, B:122:0x1545, B:140:0x17e1, B:142:0x17ee, B:143:0x182a, B:156:0x1954, B:158:0x1961, B:159:0x19a0, B:163:0x1a91, B:165:0x1a9e, B:166:0x1add, B:183:0x1cfa, B:185:0x1d07, B:186:0x1d42, B:188:0x1e0c, B:190:0x1e19, B:191:0x1e4e, B:208:0x212f, B:210:0x213c, B:211:0x217d, B:268:0x2594, B:270:0x25a1, B:271:0x25e9, B:283:0x299d, B:285:0x29aa, B:286:0x29ea, B:408:0x2e5c, B:410:0x2e62, B:411:0x2ea5, B:420:0x2f61, B:422:0x2f67, B:423:0x2fa6, B:429:0x3065, B:431:0x306b, B:433:0x30ab, B:435:0x3167, B:436:0x319d, B:438:0x3251, B:440:0x3257, B:442:0x3291, B:451:0x3386, B:453:0x3393, B:454:0x33ce, B:456:0x352e, B:458:0x3541, B:459:0x357d, B:461:0x3647, B:463:0x364d, B:464:0x367f, B:466:0x376c, B:468:0x3791, B:469:0x37e4, B:476:0x38ef, B:478:0x38fc, B:479:0x393a, B:491:0x3aad, B:493:0x3ab3, B:494:0x3aec, B:496:0x3b6e, B:498:0x3b74, B:499:0x3ba9, B:503:0x3c72, B:505:0x3c78, B:506:0x3cae, B:508:0x3d73, B:510:0x3da1, B:511:0x3e03, B:169:0x1b7c, B:171:0x1b89, B:172:0x1bc5, B:130:0x1613, B:132:0x162a, B:133:0x166e, B:82:0x0a55, B:84:0x0a62, B:85:0x0aaa, B:43:0x05b8, B:45:0x05cf, B:47:0x061d, B:55:0x06cf, B:57:0x06e6, B:58:0x072d, B:65:0x07fc, B:67:0x0813, B:68:0x0858), top: B:552:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:463:0x364d A[Catch: all -> 0x3eb3, TryCatch #11 {all -> 0x3eb3, blocks: (B:3:0x0008, B:5:0x0015, B:6:0x0047, B:8:0x013b, B:10:0x0149, B:11:0x018d, B:15:0x01cb, B:17:0x01d8, B:18:0x0223, B:22:0x0308, B:24:0x0315, B:25:0x035c, B:27:0x0439, B:29:0x0446, B:30:0x048a, B:32:0x0493, B:34:0x04ab, B:35:0x04f1, B:74:0x0918, B:76:0x0925, B:77:0x095e, B:93:0x1175, B:95:0x1182, B:97:0x11d4, B:100:0x125f, B:102:0x126c, B:103:0x12b3, B:107:0x139a, B:109:0x13a7, B:111:0x13f0, B:113:0x1480, B:115:0x148d, B:116:0x14d3, B:119:0x14e9, B:121:0x1500, B:122:0x1545, B:140:0x17e1, B:142:0x17ee, B:143:0x182a, B:156:0x1954, B:158:0x1961, B:159:0x19a0, B:163:0x1a91, B:165:0x1a9e, B:166:0x1add, B:183:0x1cfa, B:185:0x1d07, B:186:0x1d42, B:188:0x1e0c, B:190:0x1e19, B:191:0x1e4e, B:208:0x212f, B:210:0x213c, B:211:0x217d, B:268:0x2594, B:270:0x25a1, B:271:0x25e9, B:283:0x299d, B:285:0x29aa, B:286:0x29ea, B:408:0x2e5c, B:410:0x2e62, B:411:0x2ea5, B:420:0x2f61, B:422:0x2f67, B:423:0x2fa6, B:429:0x3065, B:431:0x306b, B:433:0x30ab, B:435:0x3167, B:436:0x319d, B:438:0x3251, B:440:0x3257, B:442:0x3291, B:451:0x3386, B:453:0x3393, B:454:0x33ce, B:456:0x352e, B:458:0x3541, B:459:0x357d, B:461:0x3647, B:463:0x364d, B:464:0x367f, B:466:0x376c, B:468:0x3791, B:469:0x37e4, B:476:0x38ef, B:478:0x38fc, B:479:0x393a, B:491:0x3aad, B:493:0x3ab3, B:494:0x3aec, B:496:0x3b6e, B:498:0x3b74, B:499:0x3ba9, B:503:0x3c72, B:505:0x3c78, B:506:0x3cae, B:508:0x3d73, B:510:0x3da1, B:511:0x3e03, B:169:0x1b7c, B:171:0x1b89, B:172:0x1bc5, B:130:0x1613, B:132:0x162a, B:133:0x166e, B:82:0x0a55, B:84:0x0a62, B:85:0x0aaa, B:43:0x05b8, B:45:0x05cf, B:47:0x061d, B:55:0x06cf, B:57:0x06e6, B:58:0x072d, B:65:0x07fc, B:67:0x0813, B:68:0x0858), top: B:552:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:468:0x3791 A[Catch: all -> 0x3eb3, TryCatch #11 {all -> 0x3eb3, blocks: (B:3:0x0008, B:5:0x0015, B:6:0x0047, B:8:0x013b, B:10:0x0149, B:11:0x018d, B:15:0x01cb, B:17:0x01d8, B:18:0x0223, B:22:0x0308, B:24:0x0315, B:25:0x035c, B:27:0x0439, B:29:0x0446, B:30:0x048a, B:32:0x0493, B:34:0x04ab, B:35:0x04f1, B:74:0x0918, B:76:0x0925, B:77:0x095e, B:93:0x1175, B:95:0x1182, B:97:0x11d4, B:100:0x125f, B:102:0x126c, B:103:0x12b3, B:107:0x139a, B:109:0x13a7, B:111:0x13f0, B:113:0x1480, B:115:0x148d, B:116:0x14d3, B:119:0x14e9, B:121:0x1500, B:122:0x1545, B:140:0x17e1, B:142:0x17ee, B:143:0x182a, B:156:0x1954, B:158:0x1961, B:159:0x19a0, B:163:0x1a91, B:165:0x1a9e, B:166:0x1add, B:183:0x1cfa, B:185:0x1d07, B:186:0x1d42, B:188:0x1e0c, B:190:0x1e19, B:191:0x1e4e, B:208:0x212f, B:210:0x213c, B:211:0x217d, B:268:0x2594, B:270:0x25a1, B:271:0x25e9, B:283:0x299d, B:285:0x29aa, B:286:0x29ea, B:408:0x2e5c, B:410:0x2e62, B:411:0x2ea5, B:420:0x2f61, B:422:0x2f67, B:423:0x2fa6, B:429:0x3065, B:431:0x306b, B:433:0x30ab, B:435:0x3167, B:436:0x319d, B:438:0x3251, B:440:0x3257, B:442:0x3291, B:451:0x3386, B:453:0x3393, B:454:0x33ce, B:456:0x352e, B:458:0x3541, B:459:0x357d, B:461:0x3647, B:463:0x364d, B:464:0x367f, B:466:0x376c, B:468:0x3791, B:469:0x37e4, B:476:0x38ef, B:478:0x38fc, B:479:0x393a, B:491:0x3aad, B:493:0x3ab3, B:494:0x3aec, B:496:0x3b6e, B:498:0x3b74, B:499:0x3ba9, B:503:0x3c72, B:505:0x3c78, B:506:0x3cae, B:508:0x3d73, B:510:0x3da1, B:511:0x3e03, B:169:0x1b7c, B:171:0x1b89, B:172:0x1bc5, B:130:0x1613, B:132:0x162a, B:133:0x166e, B:82:0x0a55, B:84:0x0a62, B:85:0x0aaa, B:43:0x05b8, B:45:0x05cf, B:47:0x061d, B:55:0x06cf, B:57:0x06e6, B:58:0x072d, B:65:0x07fc, B:67:0x0813, B:68:0x0858), top: B:552:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:472:0x3886  */
        /* JADX WARN: Removed duplicated region for block: B:478:0x38fc A[Catch: all -> 0x3eb3, TryCatch #11 {all -> 0x3eb3, blocks: (B:3:0x0008, B:5:0x0015, B:6:0x0047, B:8:0x013b, B:10:0x0149, B:11:0x018d, B:15:0x01cb, B:17:0x01d8, B:18:0x0223, B:22:0x0308, B:24:0x0315, B:25:0x035c, B:27:0x0439, B:29:0x0446, B:30:0x048a, B:32:0x0493, B:34:0x04ab, B:35:0x04f1, B:74:0x0918, B:76:0x0925, B:77:0x095e, B:93:0x1175, B:95:0x1182, B:97:0x11d4, B:100:0x125f, B:102:0x126c, B:103:0x12b3, B:107:0x139a, B:109:0x13a7, B:111:0x13f0, B:113:0x1480, B:115:0x148d, B:116:0x14d3, B:119:0x14e9, B:121:0x1500, B:122:0x1545, B:140:0x17e1, B:142:0x17ee, B:143:0x182a, B:156:0x1954, B:158:0x1961, B:159:0x19a0, B:163:0x1a91, B:165:0x1a9e, B:166:0x1add, B:183:0x1cfa, B:185:0x1d07, B:186:0x1d42, B:188:0x1e0c, B:190:0x1e19, B:191:0x1e4e, B:208:0x212f, B:210:0x213c, B:211:0x217d, B:268:0x2594, B:270:0x25a1, B:271:0x25e9, B:283:0x299d, B:285:0x29aa, B:286:0x29ea, B:408:0x2e5c, B:410:0x2e62, B:411:0x2ea5, B:420:0x2f61, B:422:0x2f67, B:423:0x2fa6, B:429:0x3065, B:431:0x306b, B:433:0x30ab, B:435:0x3167, B:436:0x319d, B:438:0x3251, B:440:0x3257, B:442:0x3291, B:451:0x3386, B:453:0x3393, B:454:0x33ce, B:456:0x352e, B:458:0x3541, B:459:0x357d, B:461:0x3647, B:463:0x364d, B:464:0x367f, B:466:0x376c, B:468:0x3791, B:469:0x37e4, B:476:0x38ef, B:478:0x38fc, B:479:0x393a, B:491:0x3aad, B:493:0x3ab3, B:494:0x3aec, B:496:0x3b6e, B:498:0x3b74, B:499:0x3ba9, B:503:0x3c72, B:505:0x3c78, B:506:0x3cae, B:508:0x3d73, B:510:0x3da1, B:511:0x3e03, B:169:0x1b7c, B:171:0x1b89, B:172:0x1bc5, B:130:0x1613, B:132:0x162a, B:133:0x166e, B:82:0x0a55, B:84:0x0a62, B:85:0x0aaa, B:43:0x05b8, B:45:0x05cf, B:47:0x061d, B:55:0x06cf, B:57:0x06e6, B:58:0x072d, B:65:0x07fc, B:67:0x0813, B:68:0x0858), top: B:552:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:482:0x39ec  */
        /* JADX WARN: Removed duplicated region for block: B:483:0x39fb  */
        /* JADX WARN: Removed duplicated region for block: B:486:0x3a22  */
        /* JADX WARN: Removed duplicated region for block: B:489:0x3a36  */
        /* JADX WARN: Removed duplicated region for block: B:505:0x3c78 A[Catch: all -> 0x3eb3, TryCatch #11 {all -> 0x3eb3, blocks: (B:3:0x0008, B:5:0x0015, B:6:0x0047, B:8:0x013b, B:10:0x0149, B:11:0x018d, B:15:0x01cb, B:17:0x01d8, B:18:0x0223, B:22:0x0308, B:24:0x0315, B:25:0x035c, B:27:0x0439, B:29:0x0446, B:30:0x048a, B:32:0x0493, B:34:0x04ab, B:35:0x04f1, B:74:0x0918, B:76:0x0925, B:77:0x095e, B:93:0x1175, B:95:0x1182, B:97:0x11d4, B:100:0x125f, B:102:0x126c, B:103:0x12b3, B:107:0x139a, B:109:0x13a7, B:111:0x13f0, B:113:0x1480, B:115:0x148d, B:116:0x14d3, B:119:0x14e9, B:121:0x1500, B:122:0x1545, B:140:0x17e1, B:142:0x17ee, B:143:0x182a, B:156:0x1954, B:158:0x1961, B:159:0x19a0, B:163:0x1a91, B:165:0x1a9e, B:166:0x1add, B:183:0x1cfa, B:185:0x1d07, B:186:0x1d42, B:188:0x1e0c, B:190:0x1e19, B:191:0x1e4e, B:208:0x212f, B:210:0x213c, B:211:0x217d, B:268:0x2594, B:270:0x25a1, B:271:0x25e9, B:283:0x299d, B:285:0x29aa, B:286:0x29ea, B:408:0x2e5c, B:410:0x2e62, B:411:0x2ea5, B:420:0x2f61, B:422:0x2f67, B:423:0x2fa6, B:429:0x3065, B:431:0x306b, B:433:0x30ab, B:435:0x3167, B:436:0x319d, B:438:0x3251, B:440:0x3257, B:442:0x3291, B:451:0x3386, B:453:0x3393, B:454:0x33ce, B:456:0x352e, B:458:0x3541, B:459:0x357d, B:461:0x3647, B:463:0x364d, B:464:0x367f, B:466:0x376c, B:468:0x3791, B:469:0x37e4, B:476:0x38ef, B:478:0x38fc, B:479:0x393a, B:491:0x3aad, B:493:0x3ab3, B:494:0x3aec, B:496:0x3b6e, B:498:0x3b74, B:499:0x3ba9, B:503:0x3c72, B:505:0x3c78, B:506:0x3cae, B:508:0x3d73, B:510:0x3da1, B:511:0x3e03, B:169:0x1b7c, B:171:0x1b89, B:172:0x1bc5, B:130:0x1613, B:132:0x162a, B:133:0x166e, B:82:0x0a55, B:84:0x0a62, B:85:0x0aaa, B:43:0x05b8, B:45:0x05cf, B:47:0x061d, B:55:0x06cf, B:57:0x06e6, B:58:0x072d, B:65:0x07fc, B:67:0x0813, B:68:0x0858), top: B:552:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:510:0x3da1 A[Catch: all -> 0x3eb3, TryCatch #11 {all -> 0x3eb3, blocks: (B:3:0x0008, B:5:0x0015, B:6:0x0047, B:8:0x013b, B:10:0x0149, B:11:0x018d, B:15:0x01cb, B:17:0x01d8, B:18:0x0223, B:22:0x0308, B:24:0x0315, B:25:0x035c, B:27:0x0439, B:29:0x0446, B:30:0x048a, B:32:0x0493, B:34:0x04ab, B:35:0x04f1, B:74:0x0918, B:76:0x0925, B:77:0x095e, B:93:0x1175, B:95:0x1182, B:97:0x11d4, B:100:0x125f, B:102:0x126c, B:103:0x12b3, B:107:0x139a, B:109:0x13a7, B:111:0x13f0, B:113:0x1480, B:115:0x148d, B:116:0x14d3, B:119:0x14e9, B:121:0x1500, B:122:0x1545, B:140:0x17e1, B:142:0x17ee, B:143:0x182a, B:156:0x1954, B:158:0x1961, B:159:0x19a0, B:163:0x1a91, B:165:0x1a9e, B:166:0x1add, B:183:0x1cfa, B:185:0x1d07, B:186:0x1d42, B:188:0x1e0c, B:190:0x1e19, B:191:0x1e4e, B:208:0x212f, B:210:0x213c, B:211:0x217d, B:268:0x2594, B:270:0x25a1, B:271:0x25e9, B:283:0x299d, B:285:0x29aa, B:286:0x29ea, B:408:0x2e5c, B:410:0x2e62, B:411:0x2ea5, B:420:0x2f61, B:422:0x2f67, B:423:0x2fa6, B:429:0x3065, B:431:0x306b, B:433:0x30ab, B:435:0x3167, B:436:0x319d, B:438:0x3251, B:440:0x3257, B:442:0x3291, B:451:0x3386, B:453:0x3393, B:454:0x33ce, B:456:0x352e, B:458:0x3541, B:459:0x357d, B:461:0x3647, B:463:0x364d, B:464:0x367f, B:466:0x376c, B:468:0x3791, B:469:0x37e4, B:476:0x38ef, B:478:0x38fc, B:479:0x393a, B:491:0x3aad, B:493:0x3ab3, B:494:0x3aec, B:496:0x3b6e, B:498:0x3b74, B:499:0x3ba9, B:503:0x3c72, B:505:0x3c78, B:506:0x3cae, B:508:0x3d73, B:510:0x3da1, B:511:0x3e03, B:169:0x1b7c, B:171:0x1b89, B:172:0x1bc5, B:130:0x1613, B:132:0x162a, B:133:0x166e, B:82:0x0a55, B:84:0x0a62, B:85:0x0aaa, B:43:0x05b8, B:45:0x05cf, B:47:0x061d, B:55:0x06cf, B:57:0x06e6, B:58:0x072d, B:65:0x07fc, B:67:0x0813, B:68:0x0858), top: B:552:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x06c6 A[PHI: r10
          0x06c6: PHI (r10v231 java.lang.String) = (r10v230 java.lang.String), (r10v233 java.lang.String) binds: [B:60:0x07f3, B:49:0x06c3] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:546:0x2e1e A[EXC_TOP_SPLITTER, PHI: r6
          0x2e1e: PHI (r6v247 java.io.BufferedInputStream) = (r6v246 java.io.BufferedInputStream), (r6v556 java.io.BufferedInputStream) binds: [B:404:0x2e30, B:381:0x2ddb] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:558:0x2bc2 A[EXC_TOP_SPLITTER, PHI: r6
          0x2bc2: PHI (r6v231 java.io.BufferedInputStream) = (r6v230 java.io.BufferedInputStream), (r6v557 java.io.BufferedInputStream) binds: [B:322:0x2bd4, B:296:0x2b05] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:585:0x2233 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:602:0x2d72 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x08fd  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0a14  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0aed  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x1182 A[Catch: all -> 0x3eb3, TryCatch #11 {all -> 0x3eb3, blocks: (B:3:0x0008, B:5:0x0015, B:6:0x0047, B:8:0x013b, B:10:0x0149, B:11:0x018d, B:15:0x01cb, B:17:0x01d8, B:18:0x0223, B:22:0x0308, B:24:0x0315, B:25:0x035c, B:27:0x0439, B:29:0x0446, B:30:0x048a, B:32:0x0493, B:34:0x04ab, B:35:0x04f1, B:74:0x0918, B:76:0x0925, B:77:0x095e, B:93:0x1175, B:95:0x1182, B:97:0x11d4, B:100:0x125f, B:102:0x126c, B:103:0x12b3, B:107:0x139a, B:109:0x13a7, B:111:0x13f0, B:113:0x1480, B:115:0x148d, B:116:0x14d3, B:119:0x14e9, B:121:0x1500, B:122:0x1545, B:140:0x17e1, B:142:0x17ee, B:143:0x182a, B:156:0x1954, B:158:0x1961, B:159:0x19a0, B:163:0x1a91, B:165:0x1a9e, B:166:0x1add, B:183:0x1cfa, B:185:0x1d07, B:186:0x1d42, B:188:0x1e0c, B:190:0x1e19, B:191:0x1e4e, B:208:0x212f, B:210:0x213c, B:211:0x217d, B:268:0x2594, B:270:0x25a1, B:271:0x25e9, B:283:0x299d, B:285:0x29aa, B:286:0x29ea, B:408:0x2e5c, B:410:0x2e62, B:411:0x2ea5, B:420:0x2f61, B:422:0x2f67, B:423:0x2fa6, B:429:0x3065, B:431:0x306b, B:433:0x30ab, B:435:0x3167, B:436:0x319d, B:438:0x3251, B:440:0x3257, B:442:0x3291, B:451:0x3386, B:453:0x3393, B:454:0x33ce, B:456:0x352e, B:458:0x3541, B:459:0x357d, B:461:0x3647, B:463:0x364d, B:464:0x367f, B:466:0x376c, B:468:0x3791, B:469:0x37e4, B:476:0x38ef, B:478:0x38fc, B:479:0x393a, B:491:0x3aad, B:493:0x3ab3, B:494:0x3aec, B:496:0x3b6e, B:498:0x3b74, B:499:0x3ba9, B:503:0x3c72, B:505:0x3c78, B:506:0x3cae, B:508:0x3d73, B:510:0x3da1, B:511:0x3e03, B:169:0x1b7c, B:171:0x1b89, B:172:0x1bc5, B:130:0x1613, B:132:0x162a, B:133:0x166e, B:82:0x0a55, B:84:0x0a62, B:85:0x0aaa, B:43:0x05b8, B:45:0x05cf, B:47:0x061d, B:55:0x06cf, B:57:0x06e6, B:58:0x072d, B:65:0x07fc, B:67:0x0813, B:68:0x0858), top: B:552:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:96:0x11d2  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x11dd  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object[] IconCompatParcelizer$102327b9(int r73, java.lang.Object r74) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 17370
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setTextEndPaddingResource.onAddQueueItem.IconCompatParcelizer$102327b9(int, java.lang.Object):java.lang.Object[]");
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class RatingCompat extends setTextEndPaddingResource {
        private final String IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RatingCompat(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.IconCompatParcelizer = str;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setTextEndPaddingResource$AudioAttributesImplApi21Parcelizer;", "Lo/setTextEndPaddingResource;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesImplApi21Parcelizer extends setTextEndPaddingResource {
        public static final AudioAttributesImplApi21Parcelizer INSTANCE = new AudioAttributesImplApi21Parcelizer();

        private AudioAttributesImplApi21Parcelizer() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setTextEndPaddingResource$AudioAttributesImplApi26Parcelizer;", "Lo/setTextEndPaddingResource;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesImplApi26Parcelizer extends setTextEndPaddingResource {
        public static final AudioAttributesImplApi26Parcelizer INSTANCE = new AudioAttributesImplApi26Parcelizer();

        private AudioAttributesImplApi26Parcelizer() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setTextEndPaddingResource$MediaDescriptionCompat;", "Lo/setTextEndPaddingResource;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaDescriptionCompat extends setTextEndPaddingResource {
        public static final MediaDescriptionCompat INSTANCE = new MediaDescriptionCompat();

        private MediaDescriptionCompat() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setTextEndPaddingResource$IconCompatParcelizer;", "Lo/setTextEndPaddingResource;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer extends setTextEndPaddingResource {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setTextEndPaddingResource$MediaBrowserCompatItemReceiver;", "Lo/setTextEndPaddingResource;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaBrowserCompatItemReceiver extends setTextEndPaddingResource {
        public static final MediaBrowserCompatItemReceiver INSTANCE = new MediaBrowserCompatItemReceiver();

        private MediaBrowserCompatItemReceiver() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class AudioAttributesImplBaseParcelizer extends setTextEndPaddingResource {
        private final String AudioAttributesCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplBaseParcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.AudioAttributesCompatParcelizer = str;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/setTextEndPaddingResource$MediaBrowserCompatSearchResultReceiver;", "Lo/setTextEndPaddingResource;", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MediaBrowserCompatSearchResultReceiver extends setTextEndPaddingResource {
        public static final MediaBrowserCompatSearchResultReceiver INSTANCE = new MediaBrowserCompatSearchResultReceiver();

        public final int hashCode() {
            return -613882712;
        }

        private MediaBrowserCompatSearchResultReceiver() {
            super(null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof MediaBrowserCompatSearchResultReceiver)) {
                return false;
            }
            return true;
        }

        public final String toString() {
            return "MediaBrowserCompatSearchResultReceiver";
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setTextEndPaddingResource$AudioAttributesCompatParcelizer;", "Lo/setTextEndPaddingResource;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends setTextEndPaddingResource {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class RemoteActionCompatParcelizer extends setTextEndPaddingResource {
        private final long RemoteActionCompatParcelizer;

        public RemoteActionCompatParcelizer(long j) {
            super(null);
            this.RemoteActionCompatParcelizer = j;
        }

        public final long IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }
}
