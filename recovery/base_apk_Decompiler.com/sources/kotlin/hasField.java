package kotlin;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.forDeserialization;
import kotlin.isPresent;

/* JADX INFO: loaded from: classes4.dex */
final class hasField {
    private static final Class<?> AudioAttributesCompatParcelizer = IconCompatParcelizer();
    private static final hasName<?, ?> RemoteActionCompatParcelizer = AudioAttributesCompatParcelizer(false);
    private static final hasName<?, ?> IconCompatParcelizer = AudioAttributesCompatParcelizer(true);
    private static final hasName<?, ?> write = new isExplicitlyNamed();

    public static void read(Class<?> cls) {
        Class<?> cls2;
        if (!_explicitClassOrOb.class.isAssignableFrom(cls) && (cls2 = AudioAttributesCompatParcelizer) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void AudioAttributesCompatParcelizer(int i, List<Double> list, CollectorBase collectorBase, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        collectorBase.read(i, list, z);
    }

    public static void AudioAttributesImplApi26Parcelizer(int i, List<Float> list, CollectorBase collectorBase, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        collectorBase.AudioAttributesImplApi21Parcelizer(i, list, z);
    }

    public static void AudioAttributesImplApi21Parcelizer(int i, List<Long> list, CollectorBase collectorBase, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        collectorBase.AudioAttributesImplBaseParcelizer(i, list, z);
    }

    public static void MediaBrowserCompatSearchResultReceiver(int i, List<Long> list, CollectorBase collectorBase, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        collectorBase.RatingCompat(i, list, z);
    }

    public static void MediaDescriptionCompat(int i, List<Long> list, CollectorBase collectorBase, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        collectorBase.MediaMetadataCompat(i, list, z);
    }

    public static void RemoteActionCompatParcelizer(int i, List<Long> list, CollectorBase collectorBase, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        collectorBase.IconCompatParcelizer(i, list, z);
    }

    public static void MediaBrowserCompatItemReceiver(int i, List<Long> list, CollectorBase collectorBase, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        collectorBase.MediaBrowserCompatItemReceiver(i, list, z);
    }

    public static void MediaBrowserCompatCustomActionResultReceiver(int i, List<Integer> list, CollectorBase collectorBase, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        collectorBase.MediaBrowserCompatCustomActionResultReceiver(i, list, z);
    }

    public static void MediaMetadataCompat(int i, List<Integer> list, CollectorBase collectorBase, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        collectorBase.MediaBrowserCompatSearchResultReceiver(i, list, z);
    }

    public static void MediaBrowserCompatMediaItem(int i, List<Integer> list, CollectorBase collectorBase, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        collectorBase.MediaDescriptionCompat(i, list, z);
    }

    public static void write(int i, List<Integer> list, CollectorBase collectorBase, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        collectorBase.RemoteActionCompatParcelizer(i, list, z);
    }

    public static void AudioAttributesImplBaseParcelizer(int i, List<Integer> list, CollectorBase collectorBase, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        collectorBase.AudioAttributesImplApi26Parcelizer(i, list, z);
    }

    public static void read(int i, List<Integer> list, CollectorBase collectorBase, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        collectorBase.AudioAttributesCompatParcelizer(i, list, z);
    }

    public static void IconCompatParcelizer(int i, List<Boolean> list, CollectorBase collectorBase, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        collectorBase.write(i, list, z);
    }

    public static void write(int i, List<String> list, CollectorBase collectorBase) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        collectorBase.write(i, list);
    }

    public static void IconCompatParcelizer(int i, List<AnnotatedWithParams> list, CollectorBase collectorBase) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        collectorBase.RemoteActionCompatParcelizer(i, list);
    }

    public static void IconCompatParcelizer(int i, List<?> list, CollectorBase collectorBase, getPrimaryMember getprimarymember) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        collectorBase.AudioAttributesCompatParcelizer(i, list, getprimarymember);
    }

    public static void AudioAttributesCompatParcelizer(int i, List<?> list, CollectorBase collectorBase, getPrimaryMember getprimarymember) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        collectorBase.read(i, list, getprimarymember);
    }

    static int AudioAttributesImplBaseParcelizer(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof findFactoryMethodMetadata)) {
            int iWrite = 0;
            while (i < size) {
                iWrite += getParameterAnnotations.write(list.get(i).longValue());
                i++;
            }
            return iWrite;
        }
        findFactoryMethodMetadata findfactorymethodmetadata = (findFactoryMethodMetadata) list;
        int iWrite2 = 0;
        while (i < size) {
            iWrite2 += getParameterAnnotations.write(findfactorymethodmetadata.read(i));
            i++;
        }
        return iWrite2;
    }

    static int MediaBrowserCompatItemReceiver(int i, List<Long> list) {
        if (list.size() == 0) {
            return 0;
        }
        return AudioAttributesImplBaseParcelizer(list) + (list.size() * getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(i));
    }

    static int MediaBrowserCompatItemReceiver(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof findFactoryMethodMetadata)) {
            int iIconCompatParcelizer = 0;
            while (i < size) {
                iIconCompatParcelizer += getParameterAnnotations.IconCompatParcelizer(list.get(i).longValue());
                i++;
            }
            return iIconCompatParcelizer;
        }
        findFactoryMethodMetadata findfactorymethodmetadata = (findFactoryMethodMetadata) list;
        int iIconCompatParcelizer2 = 0;
        while (i < size) {
            iIconCompatParcelizer2 += getParameterAnnotations.IconCompatParcelizer(findfactorymethodmetadata.read(i));
            i++;
        }
        return iIconCompatParcelizer2;
    }

    static int MediaDescriptionCompat(int i, List<Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return MediaBrowserCompatItemReceiver(list) + (size * getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(i));
    }

    static int MediaBrowserCompatCustomActionResultReceiver(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof findFactoryMethodMetadata)) {
            int iRemoteActionCompatParcelizer = 0;
            while (i < size) {
                iRemoteActionCompatParcelizer += getParameterAnnotations.RemoteActionCompatParcelizer(list.get(i).longValue());
                i++;
            }
            return iRemoteActionCompatParcelizer;
        }
        findFactoryMethodMetadata findfactorymethodmetadata = (findFactoryMethodMetadata) list;
        int iRemoteActionCompatParcelizer2 = 0;
        while (i < size) {
            iRemoteActionCompatParcelizer2 += getParameterAnnotations.RemoteActionCompatParcelizer(findfactorymethodmetadata.read(i));
            i++;
        }
        return iRemoteActionCompatParcelizer2;
    }

    static int MediaBrowserCompatCustomActionResultReceiver(int i, List<Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return MediaBrowserCompatCustomActionResultReceiver(list) + (size * getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(i));
    }

    static int read(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AnnotationCollectorOneCollector)) {
            int iWrite = 0;
            while (i < size) {
                iWrite += getParameterAnnotations.write(list.get(i).intValue());
                i++;
            }
            return iWrite;
        }
        AnnotationCollectorOneCollector annotationCollectorOneCollector = (AnnotationCollectorOneCollector) list;
        int iWrite2 = 0;
        while (i < size) {
            iWrite2 += getParameterAnnotations.write(annotationCollectorOneCollector.RemoteActionCompatParcelizer(i));
            i++;
        }
        return iWrite2;
    }

    static int read(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return read(list) + (size * getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(i));
    }

    static int IconCompatParcelizer(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AnnotationCollectorOneCollector)) {
            int iMediaBrowserCompatCustomActionResultReceiver = 0;
            while (i < size) {
                iMediaBrowserCompatCustomActionResultReceiver += getParameterAnnotations.MediaBrowserCompatCustomActionResultReceiver(list.get(i).intValue());
                i++;
            }
            return iMediaBrowserCompatCustomActionResultReceiver;
        }
        AnnotationCollectorOneCollector annotationCollectorOneCollector = (AnnotationCollectorOneCollector) list;
        int iMediaBrowserCompatCustomActionResultReceiver2 = 0;
        while (i < size) {
            iMediaBrowserCompatCustomActionResultReceiver2 += getParameterAnnotations.MediaBrowserCompatCustomActionResultReceiver(annotationCollectorOneCollector.RemoteActionCompatParcelizer(i));
            i++;
        }
        return iMediaBrowserCompatCustomActionResultReceiver2;
    }

    static int AudioAttributesImplApi21Parcelizer(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return IconCompatParcelizer(list) + (size * getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(i));
    }

    static int AudioAttributesImplApi26Parcelizer(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AnnotationCollectorOneCollector)) {
            int iMediaDescriptionCompat = 0;
            while (i < size) {
                iMediaDescriptionCompat += getParameterAnnotations.MediaDescriptionCompat(list.get(i).intValue());
                i++;
            }
            return iMediaDescriptionCompat;
        }
        AnnotationCollectorOneCollector annotationCollectorOneCollector = (AnnotationCollectorOneCollector) list;
        int iMediaDescriptionCompat2 = 0;
        while (i < size) {
            iMediaDescriptionCompat2 += getParameterAnnotations.MediaDescriptionCompat(annotationCollectorOneCollector.RemoteActionCompatParcelizer(i));
            i++;
        }
        return iMediaDescriptionCompat2;
    }

    static int MediaBrowserCompatSearchResultReceiver(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AudioAttributesImplApi26Parcelizer(list) + (size * getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(i));
    }

    static int AudioAttributesImplApi21Parcelizer(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AnnotationCollectorOneCollector)) {
            int iMediaBrowserCompatMediaItem = 0;
            while (i < size) {
                iMediaBrowserCompatMediaItem += getParameterAnnotations.MediaBrowserCompatMediaItem(list.get(i).intValue());
                i++;
            }
            return iMediaBrowserCompatMediaItem;
        }
        AnnotationCollectorOneCollector annotationCollectorOneCollector = (AnnotationCollectorOneCollector) list;
        int iMediaBrowserCompatMediaItem2 = 0;
        while (i < size) {
            iMediaBrowserCompatMediaItem2 += getParameterAnnotations.MediaBrowserCompatMediaItem(annotationCollectorOneCollector.RemoteActionCompatParcelizer(i));
            i++;
        }
        return iMediaBrowserCompatMediaItem2;
    }

    static int AudioAttributesImplApi26Parcelizer(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AudioAttributesImplApi21Parcelizer(list) + (size * getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(i));
    }

    static int write(List<?> list) {
        return list.size() << 2;
    }

    static int write(int i, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * getParameterAnnotations.AudioAttributesCompatParcelizer(i);
    }

    static int AudioAttributesCompatParcelizer(List<?> list) {
        return list.size() << 3;
    }

    static int RemoteActionCompatParcelizer(int i, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * getParameterAnnotations.RemoteActionCompatParcelizer(i);
    }

    static int RemoteActionCompatParcelizer(List<?> list) {
        return list.size();
    }

    static int IconCompatParcelizer(int i, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * getParameterAnnotations.read(i);
    }

    static int AudioAttributesImplBaseParcelizer(int i, List<?> list) {
        int iRemoteActionCompatParcelizer;
        int iRemoteActionCompatParcelizer2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iMediaBrowserCompatSearchResultReceiver = getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(i) * size;
        if (!(list instanceof isFactoryMethod)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof AnnotatedWithParams) {
                    iRemoteActionCompatParcelizer = getParameterAnnotations.RemoteActionCompatParcelizer((AnnotatedWithParams) obj);
                } else {
                    iRemoteActionCompatParcelizer = getParameterAnnotations.RemoteActionCompatParcelizer((String) obj);
                }
                iMediaBrowserCompatSearchResultReceiver += iRemoteActionCompatParcelizer;
                i2++;
            }
            return iMediaBrowserCompatSearchResultReceiver;
        }
        isFactoryMethod isfactorymethod = (isFactoryMethod) list;
        while (i2 < size) {
            Object objRemoteActionCompatParcelizer = isfactorymethod.RemoteActionCompatParcelizer(i2);
            if (objRemoteActionCompatParcelizer instanceof AnnotatedWithParams) {
                iRemoteActionCompatParcelizer2 = getParameterAnnotations.RemoteActionCompatParcelizer((AnnotatedWithParams) objRemoteActionCompatParcelizer);
            } else {
                iRemoteActionCompatParcelizer2 = getParameterAnnotations.RemoteActionCompatParcelizer((String) objRemoteActionCompatParcelizer);
            }
            iMediaBrowserCompatSearchResultReceiver += iRemoteActionCompatParcelizer2;
            i2++;
        }
        return iMediaBrowserCompatSearchResultReceiver;
    }

    static int read(int i, Object obj, getPrimaryMember getprimarymember) {
        if (obj instanceof BasicBeanDescription) {
            return getParameterAnnotations.IconCompatParcelizer(i, (BasicBeanDescription) obj);
        }
        return getParameterAnnotations.RemoteActionCompatParcelizer(i, (constructPropertyCollector) obj, getprimarymember);
    }

    static int read(int i, List<?> list, getPrimaryMember getprimarymember) {
        int iAudioAttributesCompatParcelizer;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iMediaBrowserCompatSearchResultReceiver = getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof BasicBeanDescription) {
                iAudioAttributesCompatParcelizer = getParameterAnnotations.AudioAttributesCompatParcelizer((BasicBeanDescription) obj);
            } else {
                iAudioAttributesCompatParcelizer = getParameterAnnotations.read((constructPropertyCollector) obj, getprimarymember);
            }
            iMediaBrowserCompatSearchResultReceiver += iAudioAttributesCompatParcelizer;
        }
        return iMediaBrowserCompatSearchResultReceiver;
    }

    static int AudioAttributesCompatParcelizer(int i, List<AnnotatedWithParams> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iMediaBrowserCompatSearchResultReceiver = size * getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            iMediaBrowserCompatSearchResultReceiver += getParameterAnnotations.RemoteActionCompatParcelizer(list.get(i2));
        }
        return iMediaBrowserCompatSearchResultReceiver;
    }

    static int write(int i, List<constructPropertyCollector> list, getPrimaryMember getprimarymember) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iAudioAttributesCompatParcelizer = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iAudioAttributesCompatParcelizer += getParameterAnnotations.AudioAttributesCompatParcelizer(i, list.get(i2), getprimarymember);
        }
        return iAudioAttributesCompatParcelizer;
    }

    public static hasName<?, ?> RemoteActionCompatParcelizer() {
        return RemoteActionCompatParcelizer;
    }

    public static hasName<?, ?> AudioAttributesCompatParcelizer() {
        return IconCompatParcelizer;
    }

    public static hasName<?, ?> read() {
        return write;
    }

    private static hasName<?, ?> AudioAttributesCompatParcelizer(boolean z) {
        try {
            Class<?> clsWrite = write();
            if (clsWrite == null) {
                return null;
            }
            return (hasName) clsWrite.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> IconCompatParcelizer() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> write() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean read(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static <T> void write(_findStdJdkCollectionDesc _findstdjdkcollectiondesc, T t, T t2, long j) {
        ClassIntrospectorMixInResolver.read(t, j, _findstdjdkcollectiondesc.RemoteActionCompatParcelizer(ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t, j), ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t2, j)));
    }

    static <T, FT extends isPresent.read<FT>> void AudioAttributesCompatParcelizer(emptyAnnotations<FT> emptyannotations, T t, T t2) {
        isPresent<T> ispresent = emptyannotations.read(t2);
        if (ispresent.AudioAttributesImplBaseParcelizer()) {
            return;
        }
        emptyannotations.RemoteActionCompatParcelizer(t).write(ispresent);
    }

    static <T, UT, UB> void IconCompatParcelizer(hasName<UT, UB> hasname, T t, T t2) {
        hasname.IconCompatParcelizer(t, hasname.RemoteActionCompatParcelizer(hasname.RemoteActionCompatParcelizer(t), hasname.RemoteActionCompatParcelizer(t2)));
    }

    static <UT, UB> UB read(int i, List<Integer> list, forDeserialization.RemoteActionCompatParcelizer<?> remoteActionCompatParcelizer, UB ub, hasName<UT, UB> hasname) {
        if (remoteActionCompatParcelizer == null) {
            return ub;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int iIntValue = list.get(i3).intValue();
            if (remoteActionCompatParcelizer.IconCompatParcelizer() != null) {
                if (i3 != i2) {
                    list.set(i2, Integer.valueOf(iIntValue));
                }
                i2++;
            } else {
                ub = (UB) AudioAttributesCompatParcelizer(i, iIntValue, ub, hasname);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return ub;
    }

    static <UT, UB> UB IconCompatParcelizer(int i, List<Integer> list, forDeserialization.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, UB ub, hasName<UT, UB> hasname) {
        if (audioAttributesCompatParcelizer == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int iIntValue = list.get(i3).intValue();
                if (audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer()) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(iIntValue));
                    }
                    i2++;
                } else {
                    ub = (UB) AudioAttributesCompatParcelizer(i, iIntValue, ub, hasname);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
            return ub;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int iIntValue2 = it.next().intValue();
            if (!audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer()) {
                ub = (UB) AudioAttributesCompatParcelizer(i, iIntValue2, ub, hasname);
                it.remove();
            }
        }
        return ub;
    }

    static <UT, UB> UB AudioAttributesCompatParcelizer(int i, int i2, UB ub, hasName<UT, UB> hasname) {
        if (ub == null) {
            ub = hasname.RemoteActionCompatParcelizer();
        }
        hasname.RemoteActionCompatParcelizer(ub, i, i2);
        return ub;
    }
}
