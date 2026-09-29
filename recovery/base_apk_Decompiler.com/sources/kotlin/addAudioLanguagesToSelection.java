package kotlin;

import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class addAudioLanguagesToSelection extends DownloadHelperExternalSyntheticLambda4 {
    private String[] AudioAttributesCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private Object[] MediaBrowserCompatItemReceiver;
    private int[] write;
    private static final Reader read = new Reader() { // from class: o.addAudioLanguagesToSelection.1
        @Override // java.io.Reader
        public final int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }
    };
    private static final Object IconCompatParcelizer = new Object();

    public addAudioLanguagesToSelection(getCount getcount) {
        super(read);
        this.MediaBrowserCompatItemReceiver = new Object[32];
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
        this.AudioAttributesCompatParcelizer = new String[32];
        this.write = new int[32];
        write(getcount);
    }

    @Override // kotlin.DownloadHelperExternalSyntheticLambda4
    public final void read() throws IOException {
        read(DownloadHelperExternalSyntheticLambda2.BEGIN_ARRAY);
        write(((moveToPosition) onPause()).iterator());
        this.write[this.MediaBrowserCompatCustomActionResultReceiver - 1] = 0;
    }

    @Override // kotlin.DownloadHelperExternalSyntheticLambda4
    public final void IconCompatParcelizer() throws IOException {
        read(DownloadHelperExternalSyntheticLambda2.END_ARRAY);
        onPlayFromMediaId();
        onPlayFromMediaId();
        int i = this.MediaBrowserCompatCustomActionResultReceiver;
        if (i > 0) {
            int[] iArr = this.write;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // kotlin.DownloadHelperExternalSyntheticLambda4
    public final void AudioAttributesCompatParcelizer() throws IOException {
        read(DownloadHelperExternalSyntheticLambda2.BEGIN_OBJECT);
        write(((createDownloader) onPause()).RatingCompat().iterator());
    }

    @Override // kotlin.DownloadHelperExternalSyntheticLambda4
    public final void RemoteActionCompatParcelizer() throws IOException {
        read(DownloadHelperExternalSyntheticLambda2.END_OBJECT);
        this.AudioAttributesCompatParcelizer[this.MediaBrowserCompatCustomActionResultReceiver - 1] = null;
        onPlayFromMediaId();
        onPlayFromMediaId();
        int i = this.MediaBrowserCompatCustomActionResultReceiver;
        if (i > 0) {
            int[] iArr = this.write;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // kotlin.DownloadHelperExternalSyntheticLambda4
    public final boolean AudioAttributesImplApi21Parcelizer() throws IOException {
        DownloadHelperExternalSyntheticLambda2 downloadHelperExternalSyntheticLambda2OnCustomAction = onCustomAction();
        return (downloadHelperExternalSyntheticLambda2OnCustomAction == DownloadHelperExternalSyntheticLambda2.END_OBJECT || downloadHelperExternalSyntheticLambda2OnCustomAction == DownloadHelperExternalSyntheticLambda2.END_ARRAY || downloadHelperExternalSyntheticLambda2OnCustomAction == DownloadHelperExternalSyntheticLambda2.END_DOCUMENT) ? false : true;
    }

    @Override // kotlin.DownloadHelperExternalSyntheticLambda4
    public final DownloadHelperExternalSyntheticLambda2 onCustomAction() throws IOException {
        if (this.MediaBrowserCompatCustomActionResultReceiver == 0) {
            return DownloadHelperExternalSyntheticLambda2.END_DOCUMENT;
        }
        Object objOnPause = onPause();
        if (objOnPause instanceof Iterator) {
            boolean z = this.MediaBrowserCompatItemReceiver[this.MediaBrowserCompatCustomActionResultReceiver - 2] instanceof createDownloader;
            Iterator it = (Iterator) objOnPause;
            if (!it.hasNext()) {
                return z ? DownloadHelperExternalSyntheticLambda2.END_OBJECT : DownloadHelperExternalSyntheticLambda2.END_ARRAY;
            }
            if (z) {
                return DownloadHelperExternalSyntheticLambda2.NAME;
            }
            write(it.next());
            return onCustomAction();
        }
        if (objOnPause instanceof createDownloader) {
            return DownloadHelperExternalSyntheticLambda2.BEGIN_OBJECT;
        }
        if (objOnPause instanceof moveToPosition) {
            return DownloadHelperExternalSyntheticLambda2.BEGIN_ARRAY;
        }
        if (objOnPause instanceof createDownloaderConstructors) {
            createDownloaderConstructors createdownloaderconstructors = (createDownloaderConstructors) objOnPause;
            if (createdownloaderconstructors.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
                return DownloadHelperExternalSyntheticLambda2.STRING;
            }
            if (createdownloaderconstructors.RatingCompat()) {
                return DownloadHelperExternalSyntheticLambda2.BOOLEAN;
            }
            if (createdownloaderconstructors.MediaDescriptionCompat()) {
                return DownloadHelperExternalSyntheticLambda2.NUMBER;
            }
            throw new AssertionError();
        }
        if (objOnPause instanceof DefaultDownloaderFactory) {
            return DownloadHelperExternalSyntheticLambda2.NULL;
        }
        if (objOnPause == IconCompatParcelizer) {
            throw new IllegalStateException("JsonReader is closed");
        }
        StringBuilder sb = new StringBuilder("Custom JsonElement subclass ");
        sb.append(objOnPause.getClass().getName());
        sb.append(" is not supported");
        throw new DownloadHelperExternalSyntheticLambda6(sb.toString());
    }

    private Object onPause() {
        return this.MediaBrowserCompatItemReceiver[this.MediaBrowserCompatCustomActionResultReceiver - 1];
    }

    private Object onPlayFromMediaId() {
        Object[] objArr = this.MediaBrowserCompatItemReceiver;
        int i = this.MediaBrowserCompatCustomActionResultReceiver - 1;
        this.MediaBrowserCompatCustomActionResultReceiver = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    private void read(DownloadHelperExternalSyntheticLambda2 downloadHelperExternalSyntheticLambda2) throws IOException {
        if (onCustomAction() == downloadHelperExternalSyntheticLambda2) {
            return;
        }
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(downloadHelperExternalSyntheticLambda2);
        sb.append(" but was ");
        sb.append(onCustomAction());
        sb.append(onPlay());
        throw new IllegalStateException(sb.toString());
    }

    private String read(boolean z) throws IOException {
        read(DownloadHelperExternalSyntheticLambda2.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) onPause()).next();
        String str = (String) entry.getKey();
        this.AudioAttributesCompatParcelizer[this.MediaBrowserCompatCustomActionResultReceiver - 1] = z ? "<skipped>" : str;
        write(entry.getValue());
        return str;
    }

    @Override // kotlin.DownloadHelperExternalSyntheticLambda4
    public final String MediaBrowserCompatMediaItem() throws IOException {
        return read(false);
    }

    @Override // kotlin.DownloadHelperExternalSyntheticLambda4
    public final String MediaBrowserCompatSearchResultReceiver() throws IOException {
        DownloadHelperExternalSyntheticLambda2 downloadHelperExternalSyntheticLambda2OnCustomAction = onCustomAction();
        if (downloadHelperExternalSyntheticLambda2OnCustomAction != DownloadHelperExternalSyntheticLambda2.STRING && downloadHelperExternalSyntheticLambda2OnCustomAction != DownloadHelperExternalSyntheticLambda2.NUMBER) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(DownloadHelperExternalSyntheticLambda2.STRING);
            sb.append(" but was ");
            sb.append(downloadHelperExternalSyntheticLambda2OnCustomAction);
            sb.append(onPlay());
            throw new IllegalStateException(sb.toString());
        }
        String strAudioAttributesImplApi26Parcelizer = ((createDownloaderConstructors) onPlayFromMediaId()).AudioAttributesImplApi26Parcelizer();
        int i = this.MediaBrowserCompatCustomActionResultReceiver;
        if (i > 0) {
            int[] iArr = this.write;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return strAudioAttributesImplApi26Parcelizer;
    }

    @Override // kotlin.DownloadHelperExternalSyntheticLambda4
    public final boolean AudioAttributesImplApi26Parcelizer() throws IOException {
        read(DownloadHelperExternalSyntheticLambda2.BOOLEAN);
        boolean z = ((createDownloaderConstructors) onPlayFromMediaId()).read();
        int i = this.MediaBrowserCompatCustomActionResultReceiver;
        if (i > 0) {
            int[] iArr = this.write;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return z;
    }

    @Override // kotlin.DownloadHelperExternalSyntheticLambda4
    public final void MediaDescriptionCompat() throws IOException {
        read(DownloadHelperExternalSyntheticLambda2.NULL);
        onPlayFromMediaId();
        int i = this.MediaBrowserCompatCustomActionResultReceiver;
        if (i > 0) {
            int[] iArr = this.write;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // kotlin.DownloadHelperExternalSyntheticLambda4
    public final double AudioAttributesImplBaseParcelizer() throws IOException {
        DownloadHelperExternalSyntheticLambda2 downloadHelperExternalSyntheticLambda2OnCustomAction = onCustomAction();
        if (downloadHelperExternalSyntheticLambda2OnCustomAction != DownloadHelperExternalSyntheticLambda2.NUMBER && downloadHelperExternalSyntheticLambda2OnCustomAction != DownloadHelperExternalSyntheticLambda2.STRING) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(DownloadHelperExternalSyntheticLambda2.NUMBER);
            sb.append(" but was ");
            sb.append(downloadHelperExternalSyntheticLambda2OnCustomAction);
            sb.append(onPlay());
            throw new IllegalStateException(sb.toString());
        }
        double dAudioAttributesCompatParcelizer = ((createDownloaderConstructors) onPause()).AudioAttributesCompatParcelizer();
        if (!onCommand() && (Double.isNaN(dAudioAttributesCompatParcelizer) || Double.isInfinite(dAudioAttributesCompatParcelizer))) {
            throw new DownloadHelperExternalSyntheticLambda6("JSON forbids NaN and infinities: ".concat(String.valueOf(dAudioAttributesCompatParcelizer)));
        }
        onPlayFromMediaId();
        int i = this.MediaBrowserCompatCustomActionResultReceiver;
        if (i > 0) {
            int[] iArr = this.write;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return dAudioAttributesCompatParcelizer;
    }

    @Override // kotlin.DownloadHelperExternalSyntheticLambda4
    public final long RatingCompat() throws IOException {
        DownloadHelperExternalSyntheticLambda2 downloadHelperExternalSyntheticLambda2OnCustomAction = onCustomAction();
        if (downloadHelperExternalSyntheticLambda2OnCustomAction != DownloadHelperExternalSyntheticLambda2.NUMBER && downloadHelperExternalSyntheticLambda2OnCustomAction != DownloadHelperExternalSyntheticLambda2.STRING) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(DownloadHelperExternalSyntheticLambda2.NUMBER);
            sb.append(" but was ");
            sb.append(downloadHelperExternalSyntheticLambda2OnCustomAction);
            sb.append(onPlay());
            throw new IllegalStateException(sb.toString());
        }
        long jRemoteActionCompatParcelizer = ((createDownloaderConstructors) onPause()).RemoteActionCompatParcelizer();
        onPlayFromMediaId();
        int i = this.MediaBrowserCompatCustomActionResultReceiver;
        if (i > 0) {
            int[] iArr = this.write;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return jRemoteActionCompatParcelizer;
    }

    @Override // kotlin.DownloadHelperExternalSyntheticLambda4
    public final int MediaBrowserCompatItemReceiver() throws IOException {
        DownloadHelperExternalSyntheticLambda2 downloadHelperExternalSyntheticLambda2OnCustomAction = onCustomAction();
        if (downloadHelperExternalSyntheticLambda2OnCustomAction != DownloadHelperExternalSyntheticLambda2.NUMBER && downloadHelperExternalSyntheticLambda2OnCustomAction != DownloadHelperExternalSyntheticLambda2.STRING) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(DownloadHelperExternalSyntheticLambda2.NUMBER);
            sb.append(" but was ");
            sb.append(downloadHelperExternalSyntheticLambda2OnCustomAction);
            sb.append(onPlay());
            throw new IllegalStateException(sb.toString());
        }
        int iIconCompatParcelizer = ((createDownloaderConstructors) onPause()).IconCompatParcelizer();
        onPlayFromMediaId();
        int i = this.MediaBrowserCompatCustomActionResultReceiver;
        if (i > 0) {
            int[] iArr = this.write;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return iIconCompatParcelizer;
    }

    final getCount MediaMetadataCompat() throws IOException {
        DownloadHelperExternalSyntheticLambda2 downloadHelperExternalSyntheticLambda2OnCustomAction = onCustomAction();
        if (downloadHelperExternalSyntheticLambda2OnCustomAction == DownloadHelperExternalSyntheticLambda2.NAME || downloadHelperExternalSyntheticLambda2OnCustomAction == DownloadHelperExternalSyntheticLambda2.END_ARRAY || downloadHelperExternalSyntheticLambda2OnCustomAction == DownloadHelperExternalSyntheticLambda2.END_OBJECT || downloadHelperExternalSyntheticLambda2OnCustomAction == DownloadHelperExternalSyntheticLambda2.END_DOCUMENT) {
            StringBuilder sb = new StringBuilder("Unexpected ");
            sb.append(downloadHelperExternalSyntheticLambda2OnCustomAction);
            sb.append(" when reading a JsonElement.");
            throw new IllegalStateException(sb.toString());
        }
        getCount getcount = (getCount) onPause();
        handleMediaPlayPauseIfPendingOnHandler();
        return getcount;
    }

    @Override // kotlin.DownloadHelperExternalSyntheticLambda4, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.MediaBrowserCompatItemReceiver = new Object[]{IconCompatParcelizer};
        this.MediaBrowserCompatCustomActionResultReceiver = 1;
    }

    /* JADX INFO: renamed from: o.addAudioLanguagesToSelection$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[DownloadHelperExternalSyntheticLambda2.values().length];
            read = iArr;
            try {
                iArr[DownloadHelperExternalSyntheticLambda2.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                read[DownloadHelperExternalSyntheticLambda2.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                read[DownloadHelperExternalSyntheticLambda2.END_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                read[DownloadHelperExternalSyntheticLambda2.END_DOCUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // kotlin.DownloadHelperExternalSyntheticLambda4
    public final void handleMediaPlayPauseIfPendingOnHandler() throws IOException {
        int i = AnonymousClass2.read[onCustomAction().ordinal()];
        if (i == 1) {
            read(true);
            return;
        }
        if (i == 2) {
            IconCompatParcelizer();
            return;
        }
        if (i == 3) {
            RemoteActionCompatParcelizer();
            return;
        }
        if (i != 4) {
            onPlayFromMediaId();
            int i2 = this.MediaBrowserCompatCustomActionResultReceiver;
            if (i2 > 0) {
                int[] iArr = this.write;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
        }
    }

    @Override // kotlin.DownloadHelperExternalSyntheticLambda4
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(onPlay());
        return sb.toString();
    }

    public final void onAddQueueItem() throws IOException {
        read(DownloadHelperExternalSyntheticLambda2.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) onPause()).next();
        write(entry.getValue());
        write(new createDownloaderConstructors((String) entry.getKey()));
    }

    private void write(Object obj) {
        int i = this.MediaBrowserCompatCustomActionResultReceiver;
        Object[] objArr = this.MediaBrowserCompatItemReceiver;
        if (i == objArr.length) {
            int i2 = i << 1;
            this.MediaBrowserCompatItemReceiver = Arrays.copyOf(objArr, i2);
            this.write = Arrays.copyOf(this.write, i2);
            this.AudioAttributesCompatParcelizer = (String[]) Arrays.copyOf(this.AudioAttributesCompatParcelizer, i2);
        }
        Object[] objArr2 = this.MediaBrowserCompatItemReceiver;
        int i3 = this.MediaBrowserCompatCustomActionResultReceiver;
        this.MediaBrowserCompatCustomActionResultReceiver = i3 + 1;
        objArr2[i3] = obj;
    }

    private String IconCompatParcelizer(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.MediaBrowserCompatCustomActionResultReceiver;
            if (i < i2) {
                Object[] objArr = this.MediaBrowserCompatItemReceiver;
                Object obj = objArr[i];
                if (obj instanceof moveToPosition) {
                    i++;
                    if (i < i2 && (objArr[i] instanceof Iterator)) {
                        int i3 = this.write[i];
                        if (z && i3 > 0 && (i == i2 - 1 || i == i2 - 2)) {
                            i3--;
                        }
                        sb.append('[');
                        sb.append(i3);
                        sb.append(']');
                    }
                } else if ((obj instanceof createDownloader) && (i = i + 1) < i2 && (objArr[i] instanceof Iterator)) {
                    sb.append('.');
                    String str = this.AudioAttributesCompatParcelizer[i];
                    if (str != null) {
                        sb.append(str);
                    }
                }
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    @Override // kotlin.DownloadHelperExternalSyntheticLambda4
    public final String MediaBrowserCompatCustomActionResultReceiver() {
        return IconCompatParcelizer(true);
    }

    @Override // kotlin.DownloadHelperExternalSyntheticLambda4
    public final String write() {
        return IconCompatParcelizer(false);
    }

    private String onPlay() {
        StringBuilder sb = new StringBuilder(" at path ");
        sb.append(write());
        return sb.toString();
    }
}
