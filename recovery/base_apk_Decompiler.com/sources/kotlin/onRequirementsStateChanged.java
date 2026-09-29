package kotlin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.DownloadManagerExternalSyntheticLambda0;
import kotlin.DownloadRequest;
import kotlin.getDownloadIndex;
import kotlin.getDownloadsPaused;
import o.onRequirementsStateChanged.RemoteActionCompatParcelizer;

/* JADX INFO: loaded from: classes3.dex */
final class onRequirementsStateChanged<T extends RemoteActionCompatParcelizer<T>> {
    private static final onRequirementsStateChanged write = new onRequirementsStateChanged((byte) 0);
    private boolean AudioAttributesCompatParcelizer;
    private boolean RemoteActionCompatParcelizer;
    private final onDownloadChanged<T, Object> read;

    public interface RemoteActionCompatParcelizer<T extends RemoteActionCompatParcelizer<T>> extends Comparable<T> {
        int AudioAttributesCompatParcelizer();

        DownloadManagerExternalSyntheticLambda0.read IconCompatParcelizer(DownloadManagerExternalSyntheticLambda0.read readVar, DownloadManagerExternalSyntheticLambda0 downloadManagerExternalSyntheticLambda0);

        DownloadRequest.read IconCompatParcelizer();

        boolean RemoteActionCompatParcelizer();

        boolean read();

        DownloadRequest.IconCompatParcelizer write();
    }

    private onRequirementsStateChanged() {
        this.read = onDownloadChanged.read(16);
    }

    private onRequirementsStateChanged(byte b) {
        this(onDownloadChanged.read(0));
        AudioAttributesImplApi21Parcelizer();
    }

    private onRequirementsStateChanged(onDownloadChanged<T, Object> ondownloadchanged) {
        this.read = ondownloadchanged;
        AudioAttributesImplApi21Parcelizer();
    }

    private static <T extends RemoteActionCompatParcelizer<T>> onRequirementsStateChanged<T> RatingCompat() {
        return new onRequirementsStateChanged<>();
    }

    public static <T extends RemoteActionCompatParcelizer<T>> onRequirementsStateChanged<T> AudioAttributesCompatParcelizer() {
        return write;
    }

    final boolean MediaBrowserCompatItemReceiver() {
        return this.read.isEmpty();
    }

    public final void AudioAttributesImplApi21Parcelizer() {
        if (this.RemoteActionCompatParcelizer) {
            return;
        }
        for (int i = 0; i < this.read.read(); i++) {
            Map.Entry<K, Object> entryAudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer(i);
            if (entryAudioAttributesCompatParcelizer.getValue() instanceof updateWaitingForRequirements) {
                ((updateWaitingForRequirements) entryAudioAttributesCompatParcelizer.getValue()).onRewind();
            }
        }
        this.read.RemoteActionCompatParcelizer();
        this.RemoteActionCompatParcelizer = true;
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof onRequirementsStateChanged) {
            return this.read.equals(((onRequirementsStateChanged) obj).read);
        }
        return false;
    }

    public final int hashCode() {
        return this.read.hashCode();
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final onRequirementsStateChanged<T> clone() {
        onRequirementsStateChanged<T> onrequirementsstatechangedRatingCompat = RatingCompat();
        for (int i = 0; i < this.read.read(); i++) {
            Map.Entry<K, Object> entryAudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer(i);
            onrequirementsstatechangedRatingCompat.read((RemoteActionCompatParcelizer) entryAudioAttributesCompatParcelizer.getKey(), entryAudioAttributesCompatParcelizer.getValue());
        }
        Iterator it = this.read.AudioAttributesCompatParcelizer().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            onrequirementsstatechangedRatingCompat.read((RemoteActionCompatParcelizer) entry.getKey(), entry.getValue());
        }
        onrequirementsstatechangedRatingCompat.AudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer;
        return onrequirementsstatechangedRatingCompat;
    }

    public final Iterator<Map.Entry<T, Object>> AudioAttributesImplApi26Parcelizer() {
        if (this.AudioAttributesCompatParcelizer) {
            return new getDownloadsPaused.RemoteActionCompatParcelizer(this.read.entrySet().iterator());
        }
        return this.read.entrySet().iterator();
    }

    final Iterator<Map.Entry<T, Object>> write() {
        if (this.AudioAttributesCompatParcelizer) {
            return new getDownloadsPaused.RemoteActionCompatParcelizer(this.read.IconCompatParcelizer().iterator());
        }
        return this.read.IconCompatParcelizer().iterator();
    }

    private Object write(T t) {
        Object obj = this.read.get(t);
        return obj instanceof getDownloadsPaused ? ((getDownloadsPaused) obj).write() : obj;
    }

    private void read(T t, Object obj) {
        if (t.RemoteActionCompatParcelizer()) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                IconCompatParcelizer(t, it.next());
            }
            obj = arrayList;
        } else {
            IconCompatParcelizer(t, obj);
        }
        if (obj instanceof getDownloadsPaused) {
            this.AudioAttributesCompatParcelizer = true;
        }
        this.read.put(t, obj);
    }

    private static void IconCompatParcelizer(T t, Object obj) {
        if (read(t.IconCompatParcelizer(), obj)) {
            return;
        }
        int iAudioAttributesCompatParcelizer = t.AudioAttributesCompatParcelizer();
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(iAudioAttributesCompatParcelizer), t.IconCompatParcelizer().write(), obj.getClass().getName()));
    }

    private static boolean read(DownloadRequest.read readVar, Object obj) {
        getDownloadIndex.RemoteActionCompatParcelizer(obj);
        switch (AnonymousClass1.AudioAttributesCompatParcelizer[readVar.write().ordinal()]) {
            case 7:
                if ((obj instanceof DownloadIndex) || (obj instanceof byte[])) {
                }
                break;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof getDownloadIndex.write)) {
                }
                break;
            case 9:
                if ((obj instanceof DownloadManagerExternalSyntheticLambda0) || (obj instanceof getDownloadsPaused)) {
                }
                break;
        }
        return false;
    }

    public final boolean AudioAttributesImplBaseParcelizer() {
        for (int i = 0; i < this.read.read(); i++) {
            if (!IconCompatParcelizer((Map.Entry) this.read.AudioAttributesCompatParcelizer(i))) {
                return false;
            }
        }
        Iterator it = this.read.AudioAttributesCompatParcelizer().iterator();
        while (it.hasNext()) {
            if (!IconCompatParcelizer((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private static <T extends RemoteActionCompatParcelizer<T>> boolean IconCompatParcelizer(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.write() != DownloadRequest.IconCompatParcelizer.MESSAGE) {
            return true;
        }
        if (key.RemoteActionCompatParcelizer()) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (!RemoteActionCompatParcelizer(it.next())) {
                    return false;
                }
            }
            return true;
        }
        return RemoteActionCompatParcelizer(entry.getValue());
    }

    private static boolean RemoteActionCompatParcelizer(Object obj) {
        if (obj instanceof setRequirements) {
            return ((setRequirements) obj).onSeekTo();
        }
        if (obj instanceof getDownloadsPaused) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static int IconCompatParcelizer(DownloadRequest.read readVar) {
        return readVar.AudioAttributesCompatParcelizer();
    }

    public final void RemoteActionCompatParcelizer(onRequirementsStateChanged<T> onrequirementsstatechanged) {
        for (int i = 0; i < onrequirementsstatechanged.read.read(); i++) {
            write(onrequirementsstatechanged.read.AudioAttributesCompatParcelizer(i));
        }
        Iterator it = onrequirementsstatechanged.read.AudioAttributesCompatParcelizer().iterator();
        while (it.hasNext()) {
            write((Map.Entry) it.next());
        }
    }

    private static Object IconCompatParcelizer(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private void write(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof getDownloadsPaused) {
            value = ((getDownloadsPaused) value).write();
        }
        if (key.RemoteActionCompatParcelizer()) {
            Object objWrite = write(key);
            if (objWrite == null) {
                objWrite = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objWrite).add(IconCompatParcelizer(it.next()));
            }
            this.read.put(key, objWrite);
            return;
        }
        if (key.write() == DownloadRequest.IconCompatParcelizer.MESSAGE) {
            Object objWrite2 = write(key);
            if (objWrite2 == null) {
                this.read.put(key, IconCompatParcelizer(value));
                return;
            } else {
                this.read.put(key, key.IconCompatParcelizer(((DownloadManagerExternalSyntheticLambda0) objWrite2).onSetRating(), (DownloadManagerExternalSyntheticLambda0) value).MediaBrowserCompatMediaItem());
                return;
            }
        }
        this.read.put(key, IconCompatParcelizer(value));
    }

    static void read(DownloadManager downloadManager, DownloadRequest.read readVar, int i, Object obj) throws IOException {
        if (readVar == DownloadRequest.read.GROUP) {
            downloadManager.AudioAttributesCompatParcelizer(i, (DownloadManagerExternalSyntheticLambda0) obj);
        } else {
            downloadManager.MediaBrowserCompatCustomActionResultReceiver(i, IconCompatParcelizer(readVar));
            IconCompatParcelizer(downloadManager, readVar, obj);
        }
    }

    /* JADX INFO: renamed from: o.onRequirementsStateChanged$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] AudioAttributesCompatParcelizer;
        static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[DownloadRequest.read.values().length];
            IconCompatParcelizer = iArr;
            try {
                iArr[DownloadRequest.read.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IconCompatParcelizer[DownloadRequest.read.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                IconCompatParcelizer[DownloadRequest.read.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                IconCompatParcelizer[DownloadRequest.read.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                IconCompatParcelizer[DownloadRequest.read.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                IconCompatParcelizer[DownloadRequest.read.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                IconCompatParcelizer[DownloadRequest.read.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                IconCompatParcelizer[DownloadRequest.read.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                IconCompatParcelizer[DownloadRequest.read.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                IconCompatParcelizer[DownloadRequest.read.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                IconCompatParcelizer[DownloadRequest.read.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                IconCompatParcelizer[DownloadRequest.read.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                IconCompatParcelizer[DownloadRequest.read.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                IconCompatParcelizer[DownloadRequest.read.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                IconCompatParcelizer[DownloadRequest.read.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                IconCompatParcelizer[DownloadRequest.read.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                IconCompatParcelizer[DownloadRequest.read.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                IconCompatParcelizer[DownloadRequest.read.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[DownloadRequest.IconCompatParcelizer.values().length];
            AudioAttributesCompatParcelizer = iArr2;
            try {
                iArr2[DownloadRequest.IconCompatParcelizer.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                AudioAttributesCompatParcelizer[DownloadRequest.IconCompatParcelizer.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                AudioAttributesCompatParcelizer[DownloadRequest.IconCompatParcelizer.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                AudioAttributesCompatParcelizer[DownloadRequest.IconCompatParcelizer.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                AudioAttributesCompatParcelizer[DownloadRequest.IconCompatParcelizer.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                AudioAttributesCompatParcelizer[DownloadRequest.IconCompatParcelizer.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                AudioAttributesCompatParcelizer[DownloadRequest.IconCompatParcelizer.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                AudioAttributesCompatParcelizer[DownloadRequest.IconCompatParcelizer.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                AudioAttributesCompatParcelizer[DownloadRequest.IconCompatParcelizer.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    private static void IconCompatParcelizer(DownloadManager downloadManager, DownloadRequest.read readVar, Object obj) throws IOException {
        switch (AnonymousClass1.IconCompatParcelizer[readVar.ordinal()]) {
            case 1:
                downloadManager.RemoteActionCompatParcelizer(((Double) obj).doubleValue());
                break;
            case 2:
                downloadManager.read(((Float) obj).floatValue());
                break;
            case 3:
                downloadManager.RemoteActionCompatParcelizer(((Long) obj).longValue());
                break;
            case 4:
                downloadManager.AudioAttributesImplBaseParcelizer(((Long) obj).longValue());
                break;
            case 5:
                downloadManager.onAddQueueItem(((Integer) obj).intValue());
                break;
            case 6:
                downloadManager.read(((Long) obj).longValue());
                break;
            case 7:
                downloadManager.MediaBrowserCompatMediaItem(((Integer) obj).intValue());
                break;
            case 8:
                downloadManager.read(((Boolean) obj).booleanValue());
                break;
            case 9:
                downloadManager.write((DownloadManagerExternalSyntheticLambda0) obj);
                break;
            case 10:
                downloadManager.read((DownloadManagerExternalSyntheticLambda0) obj);
                break;
            case 11:
                if (obj instanceof DownloadIndex) {
                    downloadManager.IconCompatParcelizer((DownloadIndex) obj);
                } else {
                    downloadManager.RemoteActionCompatParcelizer((String) obj);
                }
                break;
            case 12:
                if (obj instanceof DownloadIndex) {
                    downloadManager.IconCompatParcelizer((DownloadIndex) obj);
                } else {
                    downloadManager.IconCompatParcelizer((byte[]) obj);
                }
                break;
            case 13:
                downloadManager.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(((Integer) obj).intValue());
                break;
            case 14:
                downloadManager.handleMediaPlayPauseIfPendingOnHandler(((Integer) obj).intValue());
                break;
            case 15:
                downloadManager.AudioAttributesImplApi26Parcelizer(((Long) obj).longValue());
                break;
            case 16:
                downloadManager.onCommand(((Integer) obj).intValue());
                break;
            case 17:
                downloadManager.MediaBrowserCompatCustomActionResultReceiver(((Long) obj).longValue());
                break;
            case 18:
                if (obj instanceof getDownloadIndex.write) {
                    downloadManager.MediaDescriptionCompat(((getDownloadIndex.write) obj).AudioAttributesCompatParcelizer());
                } else {
                    downloadManager.MediaDescriptionCompat(((Integer) obj).intValue());
                }
                break;
        }
    }

    public final int IconCompatParcelizer() {
        int iAudioAttributesCompatParcelizer = 0;
        for (int i = 0; i < this.read.read(); i++) {
            Map.Entry<K, Object> entryAudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer(i);
            iAudioAttributesCompatParcelizer += AudioAttributesCompatParcelizer((RemoteActionCompatParcelizer<?>) entryAudioAttributesCompatParcelizer.getKey(), entryAudioAttributesCompatParcelizer.getValue());
        }
        Iterator it = this.read.AudioAttributesCompatParcelizer().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iAudioAttributesCompatParcelizer += AudioAttributesCompatParcelizer((RemoteActionCompatParcelizer<?>) entry.getKey(), entry.getValue());
        }
        return iAudioAttributesCompatParcelizer;
    }

    public final int read() {
        int iRemoteActionCompatParcelizer = 0;
        for (int i = 0; i < this.read.read(); i++) {
            iRemoteActionCompatParcelizer += RemoteActionCompatParcelizer((Map.Entry) this.read.AudioAttributesCompatParcelizer(i));
        }
        Iterator it = this.read.AudioAttributesCompatParcelizer().iterator();
        while (it.hasNext()) {
            iRemoteActionCompatParcelizer += RemoteActionCompatParcelizer((Map.Entry) it.next());
        }
        return iRemoteActionCompatParcelizer;
    }

    private static int RemoteActionCompatParcelizer(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.write() == DownloadRequest.IconCompatParcelizer.MESSAGE && !key.RemoteActionCompatParcelizer() && !key.read()) {
            if (value instanceof getDownloadsPaused) {
                return DownloadManager.AudioAttributesCompatParcelizer(entry.getKey().AudioAttributesCompatParcelizer(), (getDownloadsPaused) value);
            }
            return DownloadManager.write(entry.getKey().AudioAttributesCompatParcelizer(), (DownloadManagerExternalSyntheticLambda0) value);
        }
        return AudioAttributesCompatParcelizer((RemoteActionCompatParcelizer<?>) key, value);
    }

    static int AudioAttributesCompatParcelizer(DownloadRequest.read readVar, int i, Object obj) {
        int iMediaBrowserCompatSearchResultReceiver = DownloadManager.MediaBrowserCompatSearchResultReceiver(i);
        if (readVar == DownloadRequest.read.GROUP) {
            iMediaBrowserCompatSearchResultReceiver <<= 1;
        }
        return iMediaBrowserCompatSearchResultReceiver + AudioAttributesCompatParcelizer(readVar, obj);
    }

    private static int AudioAttributesCompatParcelizer(DownloadRequest.read readVar, Object obj) {
        switch (AnonymousClass1.IconCompatParcelizer[readVar.ordinal()]) {
            case 1:
                return DownloadManager.RemoteActionCompatParcelizer();
            case 2:
                return DownloadManager.AudioAttributesImplBaseParcelizer();
            case 3:
                return DownloadManager.IconCompatParcelizer(((Long) obj).longValue());
            case 4:
                return DownloadManager.write(((Long) obj).longValue());
            case 5:
                return DownloadManager.AudioAttributesImplApi26Parcelizer(((Integer) obj).intValue());
            case 6:
                return DownloadManager.read();
            case 7:
                return DownloadManager.AudioAttributesCompatParcelizer();
            case 8:
                return DownloadManager.write();
            case 9:
                return DownloadManager.IconCompatParcelizer((DownloadManagerExternalSyntheticLambda0) obj);
            case 10:
                if (obj instanceof getDownloadsPaused) {
                    return DownloadManager.AudioAttributesCompatParcelizer((getDownloadsPaused) obj);
                }
                return DownloadManager.RemoteActionCompatParcelizer((DownloadManagerExternalSyntheticLambda0) obj);
            case 11:
                if (obj instanceof DownloadIndex) {
                    return DownloadManager.AudioAttributesCompatParcelizer((DownloadIndex) obj);
                }
                return DownloadManager.write((String) obj);
            case 12:
                if (obj instanceof DownloadIndex) {
                    return DownloadManager.AudioAttributesCompatParcelizer((DownloadIndex) obj);
                }
                return DownloadManager.RemoteActionCompatParcelizer((byte[]) obj);
            case 13:
                return DownloadManager.MediaMetadataCompat(((Integer) obj).intValue());
            case 14:
                return DownloadManager.MediaBrowserCompatCustomActionResultReceiver();
            case 15:
                return DownloadManager.AudioAttributesImplApi26Parcelizer();
            case 16:
                return DownloadManager.RatingCompat(((Integer) obj).intValue());
            case 17:
                return DownloadManager.AudioAttributesCompatParcelizer(((Long) obj).longValue());
            case 18:
                if (obj instanceof getDownloadIndex.write) {
                    return DownloadManager.IconCompatParcelizer(((getDownloadIndex.write) obj).AudioAttributesCompatParcelizer());
                }
                return DownloadManager.IconCompatParcelizer(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static int AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer<?> remoteActionCompatParcelizer, Object obj) {
        DownloadRequest.read readVarIconCompatParcelizer = remoteActionCompatParcelizer.IconCompatParcelizer();
        int iAudioAttributesCompatParcelizer = remoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        if (remoteActionCompatParcelizer.RemoteActionCompatParcelizer()) {
            int iAudioAttributesCompatParcelizer2 = 0;
            if (remoteActionCompatParcelizer.read()) {
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    iAudioAttributesCompatParcelizer2 += AudioAttributesCompatParcelizer(readVarIconCompatParcelizer, it.next());
                }
                return DownloadManager.MediaBrowserCompatSearchResultReceiver(iAudioAttributesCompatParcelizer) + iAudioAttributesCompatParcelizer2 + DownloadManager.MediaMetadataCompat(iAudioAttributesCompatParcelizer2);
            }
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                iAudioAttributesCompatParcelizer2 += AudioAttributesCompatParcelizer(readVarIconCompatParcelizer, iAudioAttributesCompatParcelizer, it2.next());
            }
            return iAudioAttributesCompatParcelizer2;
        }
        return AudioAttributesCompatParcelizer(readVarIconCompatParcelizer, iAudioAttributesCompatParcelizer, obj);
    }
}
