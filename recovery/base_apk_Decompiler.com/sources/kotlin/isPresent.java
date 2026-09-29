package kotlin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin._ignorableAnnotation;
import kotlin.constructPropertyCollector;
import kotlin.forDeserialization;
import kotlin.forOtherUse;
import o.isPresent.read;

/* JADX INFO: loaded from: classes4.dex */
final class isPresent<T extends read<T>> {
    private static final isPresent read = new isPresent((byte) 0);
    private final getPrimaryType<T, Object> AudioAttributesCompatParcelizer;
    private boolean IconCompatParcelizer;
    private boolean RemoteActionCompatParcelizer;

    public interface read<T extends read<T>> extends Comparable<T> {
        _ignorableAnnotation.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer();

        constructPropertyCollector.RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(constructPropertyCollector.RemoteActionCompatParcelizer remoteActionCompatParcelizer, constructPropertyCollector constructpropertycollector);

        _ignorableAnnotation.IconCompatParcelizer IconCompatParcelizer();

        boolean RemoteActionCompatParcelizer();

        int read();

        boolean write();
    }

    private isPresent() {
        this.AudioAttributesCompatParcelizer = getPrimaryType.write(16);
    }

    private isPresent(byte b) {
        this(getPrimaryType.write(0));
        AudioAttributesImplApi21Parcelizer();
    }

    private isPresent(getPrimaryType<T, Object> getprimarytype) {
        this.AudioAttributesCompatParcelizer = getprimarytype;
        AudioAttributesImplApi21Parcelizer();
    }

    private static <T extends read<T>> isPresent<T> MediaDescriptionCompat() {
        return new isPresent<>();
    }

    public static <T extends read<T>> isPresent<T> write() {
        return read;
    }

    final boolean AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesCompatParcelizer.isEmpty();
    }

    public final void AudioAttributesImplApi21Parcelizer() {
        if (this.RemoteActionCompatParcelizer) {
            return;
        }
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        this.RemoteActionCompatParcelizer = true;
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof isPresent) {
            return this.AudioAttributesCompatParcelizer.equals(((isPresent) obj).AudioAttributesCompatParcelizer);
        }
        return false;
    }

    public final int hashCode() {
        return this.AudioAttributesCompatParcelizer.hashCode();
    }

    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final isPresent<T> clone() {
        isPresent<T> ispresentMediaDescriptionCompat = MediaDescriptionCompat();
        for (int i = 0; i < this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(); i++) {
            Map.Entry<K, Object> entryRemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i);
            ispresentMediaDescriptionCompat.AudioAttributesCompatParcelizer((read) entryRemoteActionCompatParcelizer.getKey(), entryRemoteActionCompatParcelizer.getValue());
        }
        Iterator it = this.AudioAttributesCompatParcelizer.IconCompatParcelizer().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ispresentMediaDescriptionCompat.AudioAttributesCompatParcelizer((read) entry.getKey(), entry.getValue());
        }
        ispresentMediaDescriptionCompat.IconCompatParcelizer = this.IconCompatParcelizer;
        return ispresentMediaDescriptionCompat;
    }

    public final Iterator<Map.Entry<T, Object>> AudioAttributesImplApi26Parcelizer() {
        if (this.IconCompatParcelizer) {
            return new forOtherUse.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.entrySet().iterator());
        }
        return this.AudioAttributesCompatParcelizer.entrySet().iterator();
    }

    final Iterator<Map.Entry<T, Object>> IconCompatParcelizer() {
        if (this.IconCompatParcelizer) {
            return new forOtherUse.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.read().iterator());
        }
        return this.AudioAttributesCompatParcelizer.read().iterator();
    }

    public final Object IconCompatParcelizer(T t) {
        Object obj = this.AudioAttributesCompatParcelizer.get(t);
        return obj instanceof forOtherUse ? ((forOtherUse) obj).read() : obj;
    }

    public final void AudioAttributesCompatParcelizer(T t, Object obj) {
        if (t.RemoteActionCompatParcelizer()) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                read(t.IconCompatParcelizer(), it.next());
            }
            obj = arrayList;
        } else {
            read(t.IconCompatParcelizer(), obj);
        }
        if (obj instanceof forOtherUse) {
            this.IconCompatParcelizer = true;
        }
        this.AudioAttributesCompatParcelizer.put(t, obj);
    }

    public final void write(T t, Object obj) {
        List arrayList;
        if (!t.RemoteActionCompatParcelizer()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        read(t.IconCompatParcelizer(), obj);
        Object objIconCompatParcelizer = IconCompatParcelizer(t);
        if (objIconCompatParcelizer == null) {
            arrayList = new ArrayList();
            this.AudioAttributesCompatParcelizer.put(t, arrayList);
        } else {
            arrayList = (List) objIconCompatParcelizer;
        }
        arrayList.add(obj);
    }

    private static void read(_ignorableAnnotation.IconCompatParcelizer iconCompatParcelizer, Object obj) {
        if (!write(iconCompatParcelizer, obj)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    private static boolean write(_ignorableAnnotation.IconCompatParcelizer iconCompatParcelizer, Object obj) {
        forDeserialization.read(obj);
        switch (AnonymousClass3.RemoteActionCompatParcelizer[iconCompatParcelizer.IconCompatParcelizer().ordinal()]) {
            case 7:
                if ((obj instanceof AnnotatedWithParams) || (obj instanceof byte[])) {
                }
                break;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof forDeserialization.IconCompatParcelizer)) {
                }
                break;
            case 9:
                if ((obj instanceof constructPropertyCollector) || (obj instanceof forOtherUse)) {
                }
                break;
        }
        return false;
    }

    public final boolean MediaBrowserCompatItemReceiver() {
        for (int i = 0; i < this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(); i++) {
            if (!IconCompatParcelizer(this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i))) {
                return false;
            }
        }
        Iterator it = this.AudioAttributesCompatParcelizer.IconCompatParcelizer().iterator();
        while (it.hasNext()) {
            if (!IconCompatParcelizer((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private static <T extends read<T>> boolean IconCompatParcelizer(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.AudioAttributesCompatParcelizer() == _ignorableAnnotation.AudioAttributesCompatParcelizer.MESSAGE) {
            if (key.RemoteActionCompatParcelizer()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((constructPropertyCollector) it.next()).onFastForward()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof constructPropertyCollector) {
                    if (!((constructPropertyCollector) value).onFastForward()) {
                        return false;
                    }
                } else {
                    if (value instanceof forOtherUse) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    private static int read(_ignorableAnnotation.IconCompatParcelizer iconCompatParcelizer) {
        return iconCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    public final void write(isPresent<T> ispresent) {
        for (int i = 0; i < ispresent.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(); i++) {
            write(ispresent.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i));
        }
        Iterator it = ispresent.AudioAttributesCompatParcelizer.IconCompatParcelizer().iterator();
        while (it.hasNext()) {
            write((Map.Entry) it.next());
        }
    }

    private static Object read(Object obj) {
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
        if (value instanceof forOtherUse) {
            value = ((forOtherUse) value).read();
        }
        if (key.RemoteActionCompatParcelizer()) {
            Object objIconCompatParcelizer = IconCompatParcelizer(key);
            if (objIconCompatParcelizer == null) {
                objIconCompatParcelizer = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objIconCompatParcelizer).add(read(it.next()));
            }
            this.AudioAttributesCompatParcelizer.put(key, objIconCompatParcelizer);
            return;
        }
        if (key.AudioAttributesCompatParcelizer() == _ignorableAnnotation.AudioAttributesCompatParcelizer.MESSAGE) {
            Object objIconCompatParcelizer2 = IconCompatParcelizer(key);
            if (objIconCompatParcelizer2 == null) {
                this.AudioAttributesCompatParcelizer.put(key, read(value));
                return;
            } else {
                this.AudioAttributesCompatParcelizer.put(key, key.AudioAttributesCompatParcelizer(((constructPropertyCollector) objIconCompatParcelizer2).onPrepareFromMediaId(), (constructPropertyCollector) value).write());
                return;
            }
        }
        this.AudioAttributesCompatParcelizer.put(key, read(value));
    }

    static void IconCompatParcelizer(getParameterAnnotations getparameterannotations, _ignorableAnnotation.IconCompatParcelizer iconCompatParcelizer, int i, Object obj) throws IOException {
        if (iconCompatParcelizer == _ignorableAnnotation.IconCompatParcelizer.GROUP) {
            getparameterannotations.RemoteActionCompatParcelizer(i, (constructPropertyCollector) obj);
        } else {
            getparameterannotations.AudioAttributesImplBaseParcelizer(i, read(iconCompatParcelizer));
            AudioAttributesCompatParcelizer(getparameterannotations, iconCompatParcelizer, obj);
        }
    }

    /* JADX INFO: renamed from: o.isPresent$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] IconCompatParcelizer;
        static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[_ignorableAnnotation.IconCompatParcelizer.values().length];
            IconCompatParcelizer = iArr;
            try {
                iArr[_ignorableAnnotation.IconCompatParcelizer.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IconCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                IconCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                IconCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                IconCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                IconCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                IconCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                IconCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                IconCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                IconCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                IconCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                IconCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                IconCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                IconCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                IconCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                IconCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                IconCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                IconCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[_ignorableAnnotation.AudioAttributesCompatParcelizer.values().length];
            RemoteActionCompatParcelizer = iArr2;
            try {
                iArr2[_ignorableAnnotation.AudioAttributesCompatParcelizer.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                RemoteActionCompatParcelizer[_ignorableAnnotation.AudioAttributesCompatParcelizer.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                RemoteActionCompatParcelizer[_ignorableAnnotation.AudioAttributesCompatParcelizer.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                RemoteActionCompatParcelizer[_ignorableAnnotation.AudioAttributesCompatParcelizer.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                RemoteActionCompatParcelizer[_ignorableAnnotation.AudioAttributesCompatParcelizer.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                RemoteActionCompatParcelizer[_ignorableAnnotation.AudioAttributesCompatParcelizer.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                RemoteActionCompatParcelizer[_ignorableAnnotation.AudioAttributesCompatParcelizer.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                RemoteActionCompatParcelizer[_ignorableAnnotation.AudioAttributesCompatParcelizer.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                RemoteActionCompatParcelizer[_ignorableAnnotation.AudioAttributesCompatParcelizer.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    private static void AudioAttributesCompatParcelizer(getParameterAnnotations getparameterannotations, _ignorableAnnotation.IconCompatParcelizer iconCompatParcelizer, Object obj) throws IOException {
        switch (AnonymousClass3.IconCompatParcelizer[iconCompatParcelizer.ordinal()]) {
            case 1:
                getparameterannotations.write(((Double) obj).doubleValue());
                break;
            case 2:
                getparameterannotations.write(((Float) obj).floatValue());
                break;
            case 3:
                getparameterannotations.read(((Long) obj).longValue());
                break;
            case 4:
                getparameterannotations.AudioAttributesImplApi26Parcelizer(((Long) obj).longValue());
                break;
            case 5:
                getparameterannotations.onCommand(((Integer) obj).intValue());
                break;
            case 6:
                getparameterannotations.AudioAttributesCompatParcelizer(((Long) obj).longValue());
                break;
            case 7:
                getparameterannotations.onCustomAction(((Integer) obj).intValue());
                break;
            case 8:
                getparameterannotations.RemoteActionCompatParcelizer(((Boolean) obj).booleanValue());
                break;
            case 9:
                getparameterannotations.RemoteActionCompatParcelizer((constructPropertyCollector) obj);
                break;
            case 10:
                getparameterannotations.IconCompatParcelizer((constructPropertyCollector) obj);
                break;
            case 11:
                if (obj instanceof AnnotatedWithParams) {
                    getparameterannotations.read((AnnotatedWithParams) obj);
                } else {
                    getparameterannotations.write((String) obj);
                }
                break;
            case 12:
                if (obj instanceof AnnotatedWithParams) {
                    getparameterannotations.read((AnnotatedWithParams) obj);
                } else {
                    getparameterannotations.write((byte[]) obj);
                }
                break;
            case 13:
                getparameterannotations.onFastForward(((Integer) obj).intValue());
                break;
            case 14:
                getparameterannotations.onAddQueueItem(((Integer) obj).intValue());
                break;
            case 15:
                getparameterannotations.MediaBrowserCompatCustomActionResultReceiver(((Long) obj).longValue());
                break;
            case 16:
                getparameterannotations.handleMediaPlayPauseIfPendingOnHandler(((Integer) obj).intValue());
                break;
            case 17:
                getparameterannotations.AudioAttributesImplBaseParcelizer(((Long) obj).longValue());
                break;
            case 18:
                if (obj instanceof forDeserialization.IconCompatParcelizer) {
                    getparameterannotations.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(((forDeserialization.IconCompatParcelizer) obj).read());
                } else {
                    getparameterannotations.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(((Integer) obj).intValue());
                }
                break;
        }
    }

    public final int RemoteActionCompatParcelizer() {
        int iIconCompatParcelizer = 0;
        for (int i = 0; i < this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(); i++) {
            Map.Entry<K, Object> entryRemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i);
            iIconCompatParcelizer += IconCompatParcelizer((read<?>) entryRemoteActionCompatParcelizer.getKey(), entryRemoteActionCompatParcelizer.getValue());
        }
        Iterator it = this.AudioAttributesCompatParcelizer.IconCompatParcelizer().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iIconCompatParcelizer += IconCompatParcelizer((read<?>) entry.getKey(), entry.getValue());
        }
        return iIconCompatParcelizer;
    }

    public final int AudioAttributesCompatParcelizer() {
        int i = 0;
        for (int i2 = 0; i2 < this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(); i2++) {
            i += read((Map.Entry) this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i2));
        }
        Iterator it = this.AudioAttributesCompatParcelizer.IconCompatParcelizer().iterator();
        while (it.hasNext()) {
            i += read((Map.Entry) it.next());
        }
        return i;
    }

    private static int read(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.AudioAttributesCompatParcelizer() == _ignorableAnnotation.AudioAttributesCompatParcelizer.MESSAGE && !key.RemoteActionCompatParcelizer() && !key.write()) {
            if (value instanceof forOtherUse) {
                return getParameterAnnotations.RemoteActionCompatParcelizer(entry.getKey().read(), (forOtherUse) value);
            }
            return getParameterAnnotations.write(entry.getKey().read(), (constructPropertyCollector) value);
        }
        return IconCompatParcelizer((read<?>) key, value);
    }

    static int AudioAttributesCompatParcelizer(_ignorableAnnotation.IconCompatParcelizer iconCompatParcelizer, int i, Object obj) {
        int iMediaBrowserCompatSearchResultReceiver = getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(i);
        if (iconCompatParcelizer == _ignorableAnnotation.IconCompatParcelizer.GROUP) {
            iMediaBrowserCompatSearchResultReceiver <<= 1;
        }
        return iMediaBrowserCompatSearchResultReceiver + IconCompatParcelizer(iconCompatParcelizer, obj);
    }

    private static int IconCompatParcelizer(_ignorableAnnotation.IconCompatParcelizer iconCompatParcelizer, Object obj) {
        switch (AnonymousClass3.IconCompatParcelizer[iconCompatParcelizer.ordinal()]) {
            case 1:
                return getParameterAnnotations.IconCompatParcelizer();
            case 2:
                return getParameterAnnotations.AudioAttributesImplBaseParcelizer();
            case 3:
                return getParameterAnnotations.write(((Long) obj).longValue());
            case 4:
                return getParameterAnnotations.IconCompatParcelizer(((Long) obj).longValue());
            case 5:
                return getParameterAnnotations.MediaBrowserCompatCustomActionResultReceiver(((Integer) obj).intValue());
            case 6:
                return getParameterAnnotations.RemoteActionCompatParcelizer();
            case 7:
                return getParameterAnnotations.write();
            case 8:
                return getParameterAnnotations.AudioAttributesCompatParcelizer();
            case 9:
                return getParameterAnnotations.write((constructPropertyCollector) obj);
            case 10:
                if (obj instanceof forOtherUse) {
                    return getParameterAnnotations.AudioAttributesCompatParcelizer((forOtherUse) obj);
                }
                return getParameterAnnotations.AudioAttributesCompatParcelizer((constructPropertyCollector) obj);
            case 11:
                if (obj instanceof AnnotatedWithParams) {
                    return getParameterAnnotations.RemoteActionCompatParcelizer((AnnotatedWithParams) obj);
                }
                return getParameterAnnotations.RemoteActionCompatParcelizer((String) obj);
            case 12:
                if (obj instanceof AnnotatedWithParams) {
                    return getParameterAnnotations.RemoteActionCompatParcelizer((AnnotatedWithParams) obj);
                }
                return getParameterAnnotations.IconCompatParcelizer((byte[]) obj);
            case 13:
                return getParameterAnnotations.MediaDescriptionCompat(((Integer) obj).intValue());
            case 14:
                return getParameterAnnotations.AudioAttributesImplApi21Parcelizer();
            case 15:
                return getParameterAnnotations.AudioAttributesImplApi26Parcelizer();
            case 16:
                return getParameterAnnotations.MediaBrowserCompatMediaItem(((Integer) obj).intValue());
            case 17:
                return getParameterAnnotations.RemoteActionCompatParcelizer(((Long) obj).longValue());
            case 18:
                if (obj instanceof forDeserialization.IconCompatParcelizer) {
                    return getParameterAnnotations.write(((forDeserialization.IconCompatParcelizer) obj).read());
                }
                return getParameterAnnotations.write(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static int IconCompatParcelizer(read<?> readVar, Object obj) {
        _ignorableAnnotation.IconCompatParcelizer IconCompatParcelizer = readVar.IconCompatParcelizer();
        int i = readVar.read();
        if (readVar.RemoteActionCompatParcelizer()) {
            int iAudioAttributesCompatParcelizer = 0;
            if (readVar.write()) {
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    iAudioAttributesCompatParcelizer += IconCompatParcelizer(IconCompatParcelizer, it.next());
                }
                return getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(i) + iAudioAttributesCompatParcelizer + getParameterAnnotations.AudioAttributesImplApi26Parcelizer(iAudioAttributesCompatParcelizer);
            }
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                iAudioAttributesCompatParcelizer += AudioAttributesCompatParcelizer(IconCompatParcelizer, i, it2.next());
            }
            return iAudioAttributesCompatParcelizer;
        }
        return AudioAttributesCompatParcelizer(IconCompatParcelizer, i, obj);
    }
}
