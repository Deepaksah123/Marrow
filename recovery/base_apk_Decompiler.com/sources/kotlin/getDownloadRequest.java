package kotlin;

import android.os.Process;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.DownloadFailureReason;

/* JADX INFO: loaded from: classes.dex */
public final class getDownloadRequest implements isAfterLast {
    private final List<DownloadFailureReason> AudioAttributesCompatParcelizer;
    private final moveToLast IconCompatParcelizer;
    private final assertPreparedWithMedia RemoteActionCompatParcelizer;
    private final addTrackSelectionForSingleRenderer read;
    private final setStopReason write;

    public getDownloadRequest(moveToLast movetolast, setStopReason setstopreason, assertPreparedWithMedia assertpreparedwithmedia, addTrackSelectionForSingleRenderer addtrackselectionforsinglerenderer, List<DownloadFailureReason> list) {
        this.IconCompatParcelizer = movetolast;
        this.write = setstopreason;
        this.RemoteActionCompatParcelizer = assertpreparedwithmedia;
        this.read = addtrackselectionforsinglerenderer;
        this.AudioAttributesCompatParcelizer = list;
    }

    private boolean RemoteActionCompatParcelizer(Field field, boolean z) {
        return (this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(field.getType(), z) || this.RemoteActionCompatParcelizer.IconCompatParcelizer(field, z)) ? false : true;
    }

    private List<String> read(Field field) {
        isFirst isfirst = (isFirst) field.getAnnotation(isFirst.class);
        if (isfirst == null) {
            return Collections.singletonList(this.write.write(field));
        }
        String strRemoteActionCompatParcelizer = isfirst.RemoteActionCompatParcelizer();
        String[] strArr = isfirst.read();
        if (strArr.length == 0) {
            return Collections.singletonList(strRemoteActionCompatParcelizer);
        }
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(strRemoteActionCompatParcelizer);
        Collections.addAll(arrayList, strArr);
        return arrayList;
    }

    @Override // kotlin.isAfterLast
    public final <T> isBeforeFirst<T> write(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda3<T> downloadHelperExternalSyntheticLambda3) {
        Class<? super T> clsAudioAttributesCompatParcelizer = downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer();
        if (!Object.class.isAssignableFrom(clsAudioAttributesCompatParcelizer)) {
            return null;
        }
        DownloadFailureReason.read readVarRemoteActionCompatParcelizer = forMediaItem.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, clsAudioAttributesCompatParcelizer);
        if (readVarRemoteActionCompatParcelizer == DownloadFailureReason.read.BLOCK_ALL) {
            StringBuilder sb = new StringBuilder("ReflectionAccessFilter does not permit using reflection for ");
            sb.append(clsAudioAttributesCompatParcelizer);
            sb.append(". Register a TypeAdapter for this type or adjust the access filter.");
            throw new getDownloaderConstructor(sb.toString());
        }
        boolean z = readVarRemoteActionCompatParcelizer == DownloadFailureReason.read.BLOCK_INACCESSIBLE;
        if (getTracks.read(clsAudioAttributesCompatParcelizer)) {
            return new write(clsAudioAttributesCompatParcelizer, AudioAttributesCompatParcelizer(setdownloadingstatestoqueued, downloadHelperExternalSyntheticLambda3, clsAudioAttributesCompatParcelizer, z, true), z);
        }
        return new RemoteActionCompatParcelizer(this.IconCompatParcelizer.write(downloadHelperExternalSyntheticLambda3), AudioAttributesCompatParcelizer(setdownloadingstatestoqueued, downloadHelperExternalSyntheticLambda3, clsAudioAttributesCompatParcelizer, z, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <M extends AccessibleObject & Member> void IconCompatParcelizer(Object obj, M m) {
        if (Modifier.isStatic(m.getModifiers())) {
            obj = null;
        }
        if (forMediaItem.IconCompatParcelizer(m, obj)) {
            return;
        }
        String strWrite = getTracks.write(m, true);
        StringBuilder sb = new StringBuilder();
        sb.append(strWrite);
        sb.append(" is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
        throw new getDownloaderConstructor(sb.toString());
    }

    private AudioAttributesCompatParcelizer IconCompatParcelizer(final setDownloadingStatesToQueued setdownloadingstatestoqueued, Field field, final Method method, String str, final DownloadHelperExternalSyntheticLambda3<?> downloadHelperExternalSyntheticLambda3, boolean z, boolean z2, final boolean z3) {
        final boolean zWrite = lambdacreateMediaSourceInternal6.write(downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer());
        int modifiers = field.getModifiers();
        final boolean z4 = Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers);
        isLast islast = (isLast) field.getAnnotation(isLast.class);
        isBeforeFirst<?> isbeforefirstWrite = islast != null ? addTrackSelectionForSingleRenderer.write(this.IconCompatParcelizer, setdownloadingstatestoqueued, downloadHelperExternalSyntheticLambda3, islast) : null;
        final boolean z5 = isbeforefirstWrite != null;
        if (isbeforefirstWrite == null) {
            isbeforefirstWrite = setdownloadingstatestoqueued.IconCompatParcelizer(downloadHelperExternalSyntheticLambda3);
        }
        final isBeforeFirst<?> isbeforefirst = isbeforefirstWrite;
        return new AudioAttributesCompatParcelizer(str, field, z, z2) { // from class: o.getDownloadRequest.2
            @Override // o.getDownloadRequest.AudioAttributesCompatParcelizer
            final void read(DownloadHelper2 downloadHelper2, Object obj) throws IllegalAccessException, IOException {
                Object objInvoke;
                if (this.write) {
                    if (z3) {
                        Method method2 = method;
                        if (method2 == null) {
                            getDownloadRequest.IconCompatParcelizer(obj, this.RemoteActionCompatParcelizer);
                        } else {
                            getDownloadRequest.IconCompatParcelizer(obj, method2);
                        }
                    }
                    Method method3 = method;
                    if (method3 != null) {
                        try {
                            objInvoke = method3.invoke(obj, new Object[0]);
                        } catch (InvocationTargetException e) {
                            String strWrite = getTracks.write(method, false);
                            StringBuilder sb = new StringBuilder("Accessor ");
                            sb.append(strWrite);
                            sb.append(" threw exception");
                            throw new getDownloaderConstructor(sb.toString(), e.getCause());
                        }
                    } else {
                        objInvoke = this.RemoteActionCompatParcelizer.get(obj);
                    }
                    if (objInvoke == obj) {
                        return;
                    }
                    downloadHelper2.read(this.IconCompatParcelizer);
                    (z5 ? isbeforefirst : new getTrackSelections(setdownloadingstatestoqueued, isbeforefirst, downloadHelperExternalSyntheticLambda3.RemoteActionCompatParcelizer())).read(downloadHelper2, objInvoke);
                }
            }

            @Override // o.getDownloadRequest.AudioAttributesCompatParcelizer
            final void write(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, int i, Object[] objArr) throws IOException, Download {
                Object objAudioAttributesCompatParcelizer = isbeforefirst.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
                if (objAudioAttributesCompatParcelizer == null && zWrite) {
                    StringBuilder sb = new StringBuilder("null is not allowed as value for record component '");
                    sb.append(this.read);
                    sb.append("' of primitive type; at path ");
                    sb.append(downloadHelperExternalSyntheticLambda4.write());
                    throw new Download(sb.toString());
                }
                objArr[i] = objAudioAttributesCompatParcelizer;
            }

            @Override // o.getDownloadRequest.AudioAttributesCompatParcelizer
            final void IconCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, Object obj) throws IllegalAccessException, IOException {
                Object objAudioAttributesCompatParcelizer = isbeforefirst.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
                if (objAudioAttributesCompatParcelizer == null && zWrite) {
                    return;
                }
                if (z3) {
                    getDownloadRequest.IconCompatParcelizer(obj, this.RemoteActionCompatParcelizer);
                } else if (z4) {
                    throw new getDownloaderConstructor("Cannot set value of 'static final' ".concat(String.valueOf(getTracks.write(this.RemoteActionCompatParcelizer, false))));
                }
                this.RemoteActionCompatParcelizer.set(obj, objAudioAttributesCompatParcelizer);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r22v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.Map<java.lang.String, o.getDownloadRequest.AudioAttributesCompatParcelizer> AudioAttributesCompatParcelizer(kotlin.setDownloadingStatesToQueued r29, kotlin.DownloadHelperExternalSyntheticLambda3<?> r30, java.lang.Class<?> r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getDownloadRequest.AudioAttributesCompatParcelizer(o.setDownloadingStatesToQueued, o.DownloadHelperExternalSyntheticLambda3, java.lang.Class, boolean, boolean):java.util.Map");
    }

    public static abstract class AudioAttributesCompatParcelizer {
        public static int MediaBrowserCompatCustomActionResultReceiver;
        public static int MediaBrowserCompatItemReceiver;
        final boolean AudioAttributesCompatParcelizer;
        final String IconCompatParcelizer;
        final Field RemoteActionCompatParcelizer;
        final String read;
        final boolean write;

        abstract void IconCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, Object obj) throws IllegalAccessException, IOException;

        abstract void read(DownloadHelper2 downloadHelper2, Object obj) throws IllegalAccessException, IOException;

        abstract void write(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, int i, Object[] objArr) throws IOException, Download;

        protected AudioAttributesCompatParcelizer(String str, Field field, boolean z, boolean z2) {
            this.IconCompatParcelizer = str;
            this.RemoteActionCompatParcelizer = field;
            this.read = field.getName();
            this.write = z;
            this.AudioAttributesCompatParcelizer = z2;
        }

        public static int RemoteActionCompatParcelizer() {
            int i = MediaBrowserCompatCustomActionResultReceiver;
            int i2 = i % 7042789;
            MediaBrowserCompatCustomActionResultReceiver = i + 1;
            if (i2 != 0) {
                return MediaBrowserCompatItemReceiver;
            }
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            MediaBrowserCompatItemReceiver = elapsedCpuTime;
            return elapsedCpuTime;
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static abstract class read<T, A> extends isBeforeFirst<T> {
        private Map<String, AudioAttributesCompatParcelizer> write;

        abstract void IconCompatParcelizer(A a, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) throws IllegalAccessException, IOException;

        abstract A RemoteActionCompatParcelizer();

        abstract T read(A a);

        read(Map<String, AudioAttributesCompatParcelizer> map) {
            this.write = map;
        }

        @Override // kotlin.isBeforeFirst
        public final void read(DownloadHelper2 downloadHelper2, T t) throws IOException {
            if (t == null) {
                downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
                return;
            }
            downloadHelper2.RemoteActionCompatParcelizer();
            try {
                Iterator<AudioAttributesCompatParcelizer> it = this.write.values().iterator();
                while (it.hasNext()) {
                    it.next().read(downloadHelper2, t);
                }
                downloadHelper2.IconCompatParcelizer();
            } catch (IllegalAccessException e) {
                throw getTracks.read(e);
            }
        }

        @Override // kotlin.isBeforeFirst
        public final T AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
            if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return null;
            }
            A aRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            try {
                downloadHelperExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
                while (downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer()) {
                    AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.write.get(downloadHelperExternalSyntheticLambda4.MediaBrowserCompatMediaItem());
                    if (audioAttributesCompatParcelizer == null || !audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer) {
                        downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
                    } else {
                        IconCompatParcelizer(aRemoteActionCompatParcelizer, downloadHelperExternalSyntheticLambda4, audioAttributesCompatParcelizer);
                    }
                }
                downloadHelperExternalSyntheticLambda4.RemoteActionCompatParcelizer();
                return read(aRemoteActionCompatParcelizer);
            } catch (IllegalAccessException e) {
                throw getTracks.read(e);
            } catch (IllegalStateException e2) {
                throw new getPercentDownloaded(e2);
            }
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class RemoteActionCompatParcelizer<T> extends read<T, T> {
        private final getRendererCapabilities<T> RemoteActionCompatParcelizer;

        @Override // o.getDownloadRequest.read
        final T read(T t) {
            return t;
        }

        RemoteActionCompatParcelizer(getRendererCapabilities<T> getrenderercapabilities, Map<String, AudioAttributesCompatParcelizer> map) {
            super(map);
            this.RemoteActionCompatParcelizer = getrenderercapabilities;
        }

        @Override // o.getDownloadRequest.read
        final T RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer.write();
        }

        @Override // o.getDownloadRequest.read
        final void IconCompatParcelizer(T t, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) throws IllegalAccessException, IOException {
            audioAttributesCompatParcelizer.IconCompatParcelizer(downloadHelperExternalSyntheticLambda4, t);
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class write<T> extends read<T, Object[]> {
        private static Map<Class<?>, Object> AudioAttributesCompatParcelizer = IconCompatParcelizer();
        private final Object[] IconCompatParcelizer;
        private final Map<String, Integer> RemoteActionCompatParcelizer;
        private final Constructor<T> write;

        write(Class<T> cls, Map<String, AudioAttributesCompatParcelizer> map, boolean z) {
            super(map);
            this.RemoteActionCompatParcelizer = new HashMap();
            Constructor<T> constructorWrite = getTracks.write(cls);
            this.write = constructorWrite;
            if (z) {
                getDownloadRequest.IconCompatParcelizer(null, constructorWrite);
            } else {
                getTracks.write(constructorWrite);
            }
            String[] strArrIconCompatParcelizer = getTracks.IconCompatParcelizer(cls);
            for (int i = 0; i < strArrIconCompatParcelizer.length; i++) {
                this.RemoteActionCompatParcelizer.put(strArrIconCompatParcelizer[i], Integer.valueOf(i));
            }
            Class<?>[] parameterTypes = this.write.getParameterTypes();
            this.IconCompatParcelizer = new Object[parameterTypes.length];
            for (int i2 = 0; i2 < parameterTypes.length; i2++) {
                this.IconCompatParcelizer[i2] = AudioAttributesCompatParcelizer.get(parameterTypes[i2]);
            }
        }

        private static Map<Class<?>, Object> IconCompatParcelizer() {
            HashMap map = new HashMap();
            map.put(Byte.TYPE, (byte) 0);
            map.put(Short.TYPE, (short) 0);
            map.put(Integer.TYPE, 0);
            map.put(Long.TYPE, 0L);
            map.put(Float.TYPE, Float.valueOf(BitmapDescriptorFactory.HUE_RED));
            map.put(Double.TYPE, Double.valueOf(0.0d));
            map.put(Character.TYPE, (char) 0);
            map.put(Boolean.TYPE, Boolean.FALSE);
            return map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.getDownloadRequest.read
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object[] RemoteActionCompatParcelizer() {
            return (Object[]) this.IconCompatParcelizer.clone();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.getDownloadRequest.read
        public void IconCompatParcelizer(Object[] objArr, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) throws IOException {
            Integer num = this.RemoteActionCompatParcelizer.get(audioAttributesCompatParcelizer.read);
            if (num == null) {
                StringBuilder sb = new StringBuilder("Could not find the index in the constructor '");
                sb.append(getTracks.RemoteActionCompatParcelizer((Constructor<?>) this.write));
                sb.append("' for field with name '");
                sb.append(audioAttributesCompatParcelizer.read);
                sb.append("', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
                throw new IllegalStateException(sb.toString());
            }
            audioAttributesCompatParcelizer.write(downloadHelperExternalSyntheticLambda4, num.intValue(), objArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.getDownloadRequest.read
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public T read(Object[] objArr) {
            try {
                return this.write.newInstance(objArr);
            } catch (IllegalAccessException e) {
                throw getTracks.read(e);
            } catch (IllegalArgumentException | InstantiationException e2) {
                StringBuilder sb = new StringBuilder("Failed to invoke constructor '");
                sb.append(getTracks.RemoteActionCompatParcelizer((Constructor<?>) this.write));
                sb.append("' with args ");
                sb.append(Arrays.toString(objArr));
                throw new RuntimeException(sb.toString(), e2);
            } catch (InvocationTargetException e3) {
                StringBuilder sb2 = new StringBuilder("Failed to invoke constructor '");
                sb2.append(getTracks.RemoteActionCompatParcelizer((Constructor<?>) this.write));
                sb2.append("' with args ");
                sb2.append(Arrays.toString(objArr));
                throw new RuntimeException(sb2.toString(), e3.getCause());
            }
        }
    }
}
