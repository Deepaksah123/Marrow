package kotlin;

import java.lang.reflect.Field;
import kotlin.getDownloadIndex;

/* JADX INFO: loaded from: classes3.dex */
final class handleMainMessage implements Comparable<handleMainMessage> {
    private final int AudioAttributesCompatParcelizer;
    private final Field AudioAttributesImplApi21Parcelizer;
    private final onContentLengthChanged AudioAttributesImplApi26Parcelizer;
    private final boolean AudioAttributesImplBaseParcelizer;
    private final Field IconCompatParcelizer;
    private final Object MediaBrowserCompatCustomActionResultReceiver;
    private final int MediaBrowserCompatItemReceiver;
    private final setDownloadsPaused MediaBrowserCompatMediaItem;
    private final getDownloadIndex.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer;
    private final Field read;
    private final boolean write;

    public final int read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final Field IconCompatParcelizer() {
        return this.read;
    }

    public final setDownloadsPaused AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final onContentLengthChanged MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final getDownloadIndex.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public int compareTo(handleMainMessage handlemainmessage) {
        int i = handlemainmessage.AudioAttributesCompatParcelizer;
        return 0;
    }

    public final Field AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final Object RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final int AudioAttributesImplBaseParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final boolean MediaBrowserCompatSearchResultReceiver() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final boolean MediaBrowserCompatMediaItem() {
        return this.write;
    }

    public final Field write() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: o.handleMainMessage$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[setDownloadsPaused.values().length];
            write = iArr;
            try {
                iArr[setDownloadsPaused.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                write[setDownloadsPaused.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                write[setDownloadsPaused.MESSAGE_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                write[setDownloadsPaused.GROUP_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public final Class<?> MediaBrowserCompatItemReceiver() {
        int[] iArr = AnonymousClass1.write;
        throw null;
    }
}
