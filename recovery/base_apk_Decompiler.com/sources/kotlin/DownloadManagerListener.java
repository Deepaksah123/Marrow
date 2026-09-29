package kotlin;

import java.io.IOException;
import java.util.List;
import kotlin.onRequirementsStateChanged;

/* JADX INFO: loaded from: classes3.dex */
final class DownloadManagerListener {
    private static final Class<?> AudioAttributesCompatParcelizer = write();
    private static final DownloadManagerTask<?, ?> write = RemoteActionCompatParcelizer(false);
    private static final DownloadManagerTask<?, ?> RemoteActionCompatParcelizer = RemoteActionCompatParcelizer(true);
    private static final DownloadManagerTask<?, ?> IconCompatParcelizer = new onDownloadsPausedChanged();

    public static void AudioAttributesCompatParcelizer(Class<?> cls) {
        Class<?> cls2;
        if (!updateWaitingForRequirements.class.isAssignableFrom(cls) && (cls2 = AudioAttributesCompatParcelizer) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    public static void write(int i, List<Double> list, getRetryDelayMillis getretrydelaymillis, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        getretrydelaymillis.RemoteActionCompatParcelizer(i, list, z);
    }

    public static void MediaBrowserCompatItemReceiver(int i, List<Float> list, getRetryDelayMillis getretrydelaymillis, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        getretrydelaymillis.MediaBrowserCompatCustomActionResultReceiver(i, list, z);
    }

    public static void MediaBrowserCompatCustomActionResultReceiver(int i, List<Long> list, getRetryDelayMillis getretrydelaymillis, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        getretrydelaymillis.MediaBrowserCompatItemReceiver(i, list, z);
    }

    public static void MediaDescriptionCompat(int i, List<Long> list, getRetryDelayMillis getretrydelaymillis, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        getretrydelaymillis.MediaMetadataCompat(i, list, z);
    }

    public static void MediaBrowserCompatSearchResultReceiver(int i, List<Long> list, getRetryDelayMillis getretrydelaymillis, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        getretrydelaymillis.RatingCompat(i, list, z);
    }

    public static void AudioAttributesCompatParcelizer(int i, List<Long> list, getRetryDelayMillis getretrydelaymillis, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        getretrydelaymillis.AudioAttributesCompatParcelizer(i, list, z);
    }

    public static void AudioAttributesImplApi21Parcelizer(int i, List<Long> list, getRetryDelayMillis getretrydelaymillis, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        getretrydelaymillis.AudioAttributesImplApi21Parcelizer(i, list, z);
    }

    public static void AudioAttributesImplBaseParcelizer(int i, List<Integer> list, getRetryDelayMillis getretrydelaymillis, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        getretrydelaymillis.AudioAttributesImplApi26Parcelizer(i, list, z);
    }

    public static void RatingCompat(int i, List<Integer> list, getRetryDelayMillis getretrydelaymillis, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        getretrydelaymillis.MediaBrowserCompatSearchResultReceiver(i, list, z);
    }

    public static void MediaBrowserCompatMediaItem(int i, List<Integer> list, getRetryDelayMillis getretrydelaymillis, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        getretrydelaymillis.MediaBrowserCompatMediaItem(i, list, z);
    }

    public static void read(int i, List<Integer> list, getRetryDelayMillis getretrydelaymillis, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        getretrydelaymillis.IconCompatParcelizer(i, list, z);
    }

    public static void AudioAttributesImplApi26Parcelizer(int i, List<Integer> list, getRetryDelayMillis getretrydelaymillis, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        getretrydelaymillis.AudioAttributesImplBaseParcelizer(i, list, z);
    }

    public static void RemoteActionCompatParcelizer(int i, List<Integer> list, getRetryDelayMillis getretrydelaymillis, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        getretrydelaymillis.write(i, list, z);
    }

    public static void IconCompatParcelizer(int i, List<Boolean> list, getRetryDelayMillis getretrydelaymillis, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        getretrydelaymillis.read(i, list, z);
    }

    public static void RemoteActionCompatParcelizer(int i, List<String> list, getRetryDelayMillis getretrydelaymillis) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        getretrydelaymillis.read(i, list);
    }

    public static void AudioAttributesCompatParcelizer(int i, List<DownloadIndex> list, getRetryDelayMillis getretrydelaymillis) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        getretrydelaymillis.write(i, list);
    }

    public static void RemoteActionCompatParcelizer(int i, List<?> list, getRetryDelayMillis getretrydelaymillis, setNotMetRequirements setnotmetrequirements) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        getretrydelaymillis.write(i, list, setnotmetrequirements);
    }

    public static void write(int i, List<?> list, getRetryDelayMillis getretrydelaymillis, setNotMetRequirements setnotmetrequirements) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        getretrydelaymillis.RemoteActionCompatParcelizer(i, list, setnotmetrequirements);
    }

    static int AudioAttributesImplBaseParcelizer(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof getNotMetRequirements)) {
            int iIconCompatParcelizer = 0;
            while (i < size) {
                iIconCompatParcelizer += DownloadManager.IconCompatParcelizer(list.get(i).longValue());
                i++;
            }
            return iIconCompatParcelizer;
        }
        getNotMetRequirements getnotmetrequirements = (getNotMetRequirements) list;
        int iIconCompatParcelizer2 = 0;
        while (i < size) {
            iIconCompatParcelizer2 += DownloadManager.IconCompatParcelizer(getnotmetrequirements.RemoteActionCompatParcelizer(i));
            i++;
        }
        return iIconCompatParcelizer2;
    }

    static int AudioAttributesImplApi26Parcelizer(int i, List<Long> list) {
        if (list.size() == 0) {
            return 0;
        }
        return AudioAttributesImplBaseParcelizer(list) + (list.size() * DownloadManager.MediaBrowserCompatSearchResultReceiver(i));
    }

    static int AudioAttributesImplApi21Parcelizer(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof getNotMetRequirements)) {
            int iWrite = 0;
            while (i < size) {
                iWrite += DownloadManager.write(list.get(i).longValue());
                i++;
            }
            return iWrite;
        }
        getNotMetRequirements getnotmetrequirements = (getNotMetRequirements) list;
        int iWrite2 = 0;
        while (i < size) {
            iWrite2 += DownloadManager.write(getnotmetrequirements.RemoteActionCompatParcelizer(i));
            i++;
        }
        return iWrite2;
    }

    static int RatingCompat(int i, List<Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AudioAttributesImplApi21Parcelizer(list) + (size * DownloadManager.MediaBrowserCompatSearchResultReceiver(i));
    }

    static int MediaBrowserCompatItemReceiver(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof getNotMetRequirements)) {
            int iAudioAttributesCompatParcelizer = 0;
            while (i < size) {
                iAudioAttributesCompatParcelizer += DownloadManager.AudioAttributesCompatParcelizer(list.get(i).longValue());
                i++;
            }
            return iAudioAttributesCompatParcelizer;
        }
        getNotMetRequirements getnotmetrequirements = (getNotMetRequirements) list;
        int iAudioAttributesCompatParcelizer2 = 0;
        while (i < size) {
            iAudioAttributesCompatParcelizer2 += DownloadManager.AudioAttributesCompatParcelizer(getnotmetrequirements.RemoteActionCompatParcelizer(i));
            i++;
        }
        return iAudioAttributesCompatParcelizer2;
    }

    static int MediaBrowserCompatCustomActionResultReceiver(int i, List<Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return MediaBrowserCompatItemReceiver(list) + (size * DownloadManager.MediaBrowserCompatSearchResultReceiver(i));
    }

    static int read(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof getMinRetryCount)) {
            int iIconCompatParcelizer = 0;
            while (i < size) {
                iIconCompatParcelizer += DownloadManager.IconCompatParcelizer(list.get(i).intValue());
                i++;
            }
            return iIconCompatParcelizer;
        }
        getMinRetryCount getminretrycount = (getMinRetryCount) list;
        int iIconCompatParcelizer2 = 0;
        while (i < size) {
            iIconCompatParcelizer2 += DownloadManager.IconCompatParcelizer(getminretrycount.write(i));
            i++;
        }
        return iIconCompatParcelizer2;
    }

    static int write(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return read(list) + (size * DownloadManager.MediaBrowserCompatSearchResultReceiver(i));
    }

    static int IconCompatParcelizer(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof getMinRetryCount)) {
            int iAudioAttributesImplApi26Parcelizer = 0;
            while (i < size) {
                iAudioAttributesImplApi26Parcelizer += DownloadManager.AudioAttributesImplApi26Parcelizer(list.get(i).intValue());
                i++;
            }
            return iAudioAttributesImplApi26Parcelizer;
        }
        getMinRetryCount getminretrycount = (getMinRetryCount) list;
        int iAudioAttributesImplApi26Parcelizer2 = 0;
        while (i < size) {
            iAudioAttributesImplApi26Parcelizer2 += DownloadManager.AudioAttributesImplApi26Parcelizer(getminretrycount.write(i));
            i++;
        }
        return iAudioAttributesImplApi26Parcelizer2;
    }

    static int MediaBrowserCompatItemReceiver(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return IconCompatParcelizer(list) + (size * DownloadManager.MediaBrowserCompatSearchResultReceiver(i));
    }

    static int MediaBrowserCompatCustomActionResultReceiver(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof getMinRetryCount)) {
            int iMediaMetadataCompat = 0;
            while (i < size) {
                iMediaMetadataCompat += DownloadManager.MediaMetadataCompat(list.get(i).intValue());
                i++;
            }
            return iMediaMetadataCompat;
        }
        getMinRetryCount getminretrycount = (getMinRetryCount) list;
        int iMediaMetadataCompat2 = 0;
        while (i < size) {
            iMediaMetadataCompat2 += DownloadManager.MediaMetadataCompat(getminretrycount.write(i));
            i++;
        }
        return iMediaMetadataCompat2;
    }

    static int MediaBrowserCompatMediaItem(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return MediaBrowserCompatCustomActionResultReceiver(list) + (size * DownloadManager.MediaBrowserCompatSearchResultReceiver(i));
    }

    static int AudioAttributesImplApi26Parcelizer(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof getMinRetryCount)) {
            int iRatingCompat = 0;
            while (i < size) {
                iRatingCompat += DownloadManager.RatingCompat(list.get(i).intValue());
                i++;
            }
            return iRatingCompat;
        }
        getMinRetryCount getminretrycount = (getMinRetryCount) list;
        int iRatingCompat2 = 0;
        while (i < size) {
            iRatingCompat2 += DownloadManager.RatingCompat(getminretrycount.write(i));
            i++;
        }
        return iRatingCompat2;
    }

    static int AudioAttributesImplApi21Parcelizer(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AudioAttributesImplApi26Parcelizer(list) + (size * DownloadManager.MediaBrowserCompatSearchResultReceiver(i));
    }

    static int AudioAttributesCompatParcelizer(List<?> list) {
        return list.size() << 2;
    }

    static int read(int i, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * DownloadManager.RemoteActionCompatParcelizer(i);
    }

    static int write(List<?> list) {
        return list.size() << 3;
    }

    static int IconCompatParcelizer(int i, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * DownloadManager.read(i);
    }

    static int RemoteActionCompatParcelizer(List<?> list) {
        return list.size();
    }

    static int RemoteActionCompatParcelizer(int i, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * DownloadManager.AudioAttributesCompatParcelizer(i);
    }

    static int AudioAttributesImplBaseParcelizer(int i, List<?> list) {
        int iWrite;
        int iWrite2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iMediaBrowserCompatSearchResultReceiver = DownloadManager.MediaBrowserCompatSearchResultReceiver(i) * size;
        if (!(list instanceof isInitialized)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof DownloadIndex) {
                    iWrite = DownloadManager.AudioAttributesCompatParcelizer((DownloadIndex) obj);
                } else {
                    iWrite = DownloadManager.write((String) obj);
                }
                iMediaBrowserCompatSearchResultReceiver += iWrite;
                i2++;
            }
            return iMediaBrowserCompatSearchResultReceiver;
        }
        isInitialized isinitialized = (isInitialized) list;
        while (i2 < size) {
            Object objIconCompatParcelizer = isinitialized.IconCompatParcelizer(i2);
            if (objIconCompatParcelizer instanceof DownloadIndex) {
                iWrite2 = DownloadManager.AudioAttributesCompatParcelizer((DownloadIndex) objIconCompatParcelizer);
            } else {
                iWrite2 = DownloadManager.write((String) objIconCompatParcelizer);
            }
            iMediaBrowserCompatSearchResultReceiver += iWrite2;
            i2++;
        }
        return iMediaBrowserCompatSearchResultReceiver;
    }

    static int IconCompatParcelizer(int i, Object obj, setNotMetRequirements setnotmetrequirements) {
        if (obj instanceof isWaitingForRequirements) {
            return DownloadManager.write(i, (isWaitingForRequirements) obj);
        }
        return DownloadManager.write(i, (DownloadManagerExternalSyntheticLambda0) obj, setnotmetrequirements);
    }

    static int RemoteActionCompatParcelizer(int i, List<?> list, setNotMetRequirements setnotmetrequirements) {
        int iWrite;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iMediaBrowserCompatSearchResultReceiver = DownloadManager.MediaBrowserCompatSearchResultReceiver(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof isWaitingForRequirements) {
                iWrite = DownloadManager.AudioAttributesCompatParcelizer((isWaitingForRequirements) obj);
            } else {
                iWrite = DownloadManager.write((DownloadManagerExternalSyntheticLambda0) obj, setnotmetrequirements);
            }
            iMediaBrowserCompatSearchResultReceiver += iWrite;
        }
        return iMediaBrowserCompatSearchResultReceiver;
    }

    static int AudioAttributesCompatParcelizer(int i, List<DownloadIndex> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iMediaBrowserCompatSearchResultReceiver = size * DownloadManager.MediaBrowserCompatSearchResultReceiver(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            iMediaBrowserCompatSearchResultReceiver += DownloadManager.AudioAttributesCompatParcelizer(list.get(i2));
        }
        return iMediaBrowserCompatSearchResultReceiver;
    }

    static int write(int i, List<DownloadManagerExternalSyntheticLambda0> list, setNotMetRequirements setnotmetrequirements) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iIconCompatParcelizer = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iIconCompatParcelizer += DownloadManager.IconCompatParcelizer(i, list.get(i2), setnotmetrequirements);
        }
        return iIconCompatParcelizer;
    }

    public static DownloadManagerTask<?, ?> IconCompatParcelizer() {
        return write;
    }

    public static DownloadManagerTask<?, ?> RemoteActionCompatParcelizer() {
        return RemoteActionCompatParcelizer;
    }

    public static DownloadManagerTask<?, ?> AudioAttributesCompatParcelizer() {
        return IconCompatParcelizer;
    }

    private static DownloadManagerTask<?, ?> RemoteActionCompatParcelizer(boolean z) {
        try {
            Class<?> cls = read();
            if (cls == null) {
                return null;
            }
            return (DownloadManagerTask) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> write() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> read() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean IconCompatParcelizer(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static <T> void AudioAttributesCompatParcelizer(removeAllDownloads removealldownloads, T t, T t2, long j) {
        DownloadProgress.write(t, j, removealldownloads.RemoteActionCompatParcelizer(DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(t, j), DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(t2, j)));
    }

    static <T, FT extends onRequirementsStateChanged.RemoteActionCompatParcelizer<FT>> void IconCompatParcelizer(notifyWaitingForRequirementsChanged<FT> notifywaitingforrequirementschanged, T t, T t2) {
        onRequirementsStateChanged<T> onrequirementsstatechangedAudioAttributesCompatParcelizer = notifywaitingforrequirementschanged.AudioAttributesCompatParcelizer(t2);
        if (onrequirementsstatechangedAudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver()) {
            return;
        }
        notifywaitingforrequirementschanged.IconCompatParcelizer(t).RemoteActionCompatParcelizer((onRequirementsStateChanged) onrequirementsstatechangedAudioAttributesCompatParcelizer);
    }

    static <T, UT, UB> void AudioAttributesCompatParcelizer(DownloadManagerTask<UT, UB> downloadManagerTask, T t, T t2) {
        downloadManagerTask.RemoteActionCompatParcelizer(t, downloadManagerTask.IconCompatParcelizer(downloadManagerTask.AudioAttributesCompatParcelizer(t), downloadManagerTask.AudioAttributesCompatParcelizer(t2)));
    }
}
