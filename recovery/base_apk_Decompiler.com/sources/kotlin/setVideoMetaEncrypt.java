package kotlin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.BookReference;
import kotlin.LessonSpinnerItem;
import kotlin.getLessonIndex;
import kotlin.isRight;
import o.setVideoMetaEncrypt.RemoteActionCompatParcelizer;

/* JADX INFO: loaded from: classes4.dex */
final class setVideoMetaEncrypt<FieldDescriptorType extends RemoteActionCompatParcelizer<FieldDescriptorType>> {
    private static final setVideoMetaEncrypt RemoteActionCompatParcelizer = new setVideoMetaEncrypt((byte) 0);
    private boolean read;
    private boolean write = false;
    private final getSelectedAnswer<FieldDescriptorType, Object> IconCompatParcelizer = getSelectedAnswer.IconCompatParcelizer(16);

    public interface RemoteActionCompatParcelizer<T extends RemoteActionCompatParcelizer<T>> extends Comparable<T> {
        boolean AudioAttributesCompatParcelizer();

        BookReference.write IconCompatParcelizer(BookReference.write writeVar, BookReference bookReference);

        boolean IconCompatParcelizer();

        isRight.RemoteActionCompatParcelizer RemoteActionCompatParcelizer();

        isRight.IconCompatParcelizer read();

        int write();
    }

    private setVideoMetaEncrypt() {
    }

    private setVideoMetaEncrypt(byte b) {
        AudioAttributesImplApi26Parcelizer();
    }

    public static <T extends RemoteActionCompatParcelizer<T>> setVideoMetaEncrypt<T> AudioAttributesCompatParcelizer() {
        return new setVideoMetaEncrypt<>();
    }

    public static <T extends RemoteActionCompatParcelizer<T>> setVideoMetaEncrypt<T> read() {
        return RemoteActionCompatParcelizer;
    }

    public final void AudioAttributesImplApi26Parcelizer() {
        if (this.read) {
            return;
        }
        this.IconCompatParcelizer.IconCompatParcelizer();
        this.read = true;
    }

    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final setVideoMetaEncrypt<FieldDescriptorType> clone() {
        setVideoMetaEncrypt<FieldDescriptorType> setvideometaencryptAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        for (int i = 0; i < this.IconCompatParcelizer.write(); i++) {
            Map.Entry<K, Object> entryRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer(i);
            setvideometaencryptAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer((RemoteActionCompatParcelizer) entryRemoteActionCompatParcelizer.getKey(), entryRemoteActionCompatParcelizer.getValue());
        }
        Iterator it = this.IconCompatParcelizer.RemoteActionCompatParcelizer().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            setvideometaencryptAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer((RemoteActionCompatParcelizer) entry.getKey(), entry.getValue());
        }
        setvideometaencryptAudioAttributesCompatParcelizer.write = this.write;
        return setvideometaencryptAudioAttributesCompatParcelizer;
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> MediaBrowserCompatItemReceiver() {
        if (this.write) {
            return new getLessonIndex.IconCompatParcelizer(this.IconCompatParcelizer.entrySet().iterator());
        }
        return this.IconCompatParcelizer.entrySet().iterator();
    }

    public final boolean RemoteActionCompatParcelizer(FieldDescriptorType fielddescriptortype) {
        if (fielddescriptortype.IconCompatParcelizer()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.IconCompatParcelizer.get(fielddescriptortype) != null;
    }

    public final Object write(FieldDescriptorType fielddescriptortype) {
        Object obj = this.IconCompatParcelizer.get(fielddescriptortype);
        return obj instanceof getLessonIndex ? ((getLessonIndex) obj).IconCompatParcelizer() : obj;
    }

    public final void AudioAttributesCompatParcelizer(FieldDescriptorType fielddescriptortype, Object obj) {
        if (fielddescriptortype.IconCompatParcelizer()) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                RemoteActionCompatParcelizer(fielddescriptortype.read(), it.next());
            }
            obj = arrayList;
        } else {
            RemoteActionCompatParcelizer(fielddescriptortype.read(), obj);
        }
        if (obj instanceof getLessonIndex) {
            this.write = true;
        }
        this.IconCompatParcelizer.put(fielddescriptortype, obj);
    }

    public final int read(FieldDescriptorType fielddescriptortype) {
        if (!fielddescriptortype.IconCompatParcelizer()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objWrite = write(fielddescriptortype);
        if (objWrite == null) {
            return 0;
        }
        return ((List) objWrite).size();
    }

    public final Object write(FieldDescriptorType fielddescriptortype, int i) {
        if (!fielddescriptortype.IconCompatParcelizer()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objWrite = write(fielddescriptortype);
        if (objWrite == null) {
            throw new IndexOutOfBoundsException();
        }
        return ((List) objWrite).get(i);
    }

    public final void RemoteActionCompatParcelizer(FieldDescriptorType fielddescriptortype, Object obj) {
        List arrayList;
        if (!fielddescriptortype.IconCompatParcelizer()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        RemoteActionCompatParcelizer(fielddescriptortype.read(), obj);
        Object objWrite = write(fielddescriptortype);
        if (objWrite == null) {
            arrayList = new ArrayList();
            this.IconCompatParcelizer.put(fielddescriptortype, arrayList);
        } else {
            arrayList = (List) objWrite;
        }
        arrayList.add(obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void RemoteActionCompatParcelizer(o.isRight.IconCompatParcelizer r1, java.lang.Object r2) {
        /*
            int[] r0 = kotlin.setVideoMetaEncrypt.AnonymousClass3.read
            o.isRight$RemoteActionCompatParcelizer r1 = r1.IconCompatParcelizer()
            int r1 = r1.ordinal()
            r1 = r0[r1]
            switch(r1) {
                case 1: goto L3a;
                case 2: goto L37;
                case 3: goto L34;
                case 4: goto L31;
                case 5: goto L2e;
                case 6: goto L2b;
                case 7: goto L22;
                case 8: goto L19;
                case 9: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L3f
        L10:
            boolean r1 = r2 instanceof kotlin.BookReference
            if (r1 != 0) goto L3e
            boolean r1 = r2 instanceof kotlin.getLessonIndex
            if (r1 == 0) goto L3f
            goto L3e
        L19:
            boolean r1 = r2 instanceof java.lang.Integer
            if (r1 != 0) goto L3e
            boolean r1 = r2 instanceof o.LessonSpinnerItem.AudioAttributesCompatParcelizer
            if (r1 == 0) goto L3f
            goto L3e
        L22:
            boolean r1 = r2 instanceof kotlin.setVideoAspectRatio
            if (r1 != 0) goto L3e
            boolean r1 = r2 instanceof byte[]
            if (r1 == 0) goto L3f
            goto L3e
        L2b:
            boolean r1 = r2 instanceof java.lang.String
            goto L3c
        L2e:
            boolean r1 = r2 instanceof java.lang.Boolean
            goto L3c
        L31:
            boolean r1 = r2 instanceof java.lang.Double
            goto L3c
        L34:
            boolean r1 = r2 instanceof java.lang.Float
            goto L3c
        L37:
            boolean r1 = r2 instanceof java.lang.Long
            goto L3c
        L3a:
            boolean r1 = r2 instanceof java.lang.Integer
        L3c:
            if (r1 == 0) goto L3f
        L3e:
            return
        L3f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Wrong object type used with protocol message reflection."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setVideoMetaEncrypt.RemoteActionCompatParcelizer(o.isRight$IconCompatParcelizer, java.lang.Object):void");
    }

    public final boolean IconCompatParcelizer() {
        for (int i = 0; i < this.IconCompatParcelizer.write(); i++) {
            if (!AudioAttributesCompatParcelizer(this.IconCompatParcelizer.RemoteActionCompatParcelizer(i))) {
                return false;
            }
        }
        Iterator it = this.IconCompatParcelizer.RemoteActionCompatParcelizer().iterator();
        while (it.hasNext()) {
            if (!AudioAttributesCompatParcelizer((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean AudioAttributesCompatParcelizer(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.RemoteActionCompatParcelizer() == isRight.RemoteActionCompatParcelizer.MESSAGE) {
            if (key.IconCompatParcelizer()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((BookReference) it.next()).MediaBrowserCompatCustomActionResultReceiver()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof BookReference) {
                    if (!((BookReference) value).MediaBrowserCompatCustomActionResultReceiver()) {
                        return false;
                    }
                } else {
                    if (value instanceof getLessonIndex) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    static int IconCompatParcelizer(isRight.IconCompatParcelizer iconCompatParcelizer, boolean z) {
        if (z) {
            return 2;
        }
        return iconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    public final void write(setVideoMetaEncrypt<FieldDescriptorType> setvideometaencrypt) {
        for (int i = 0; i < setvideometaencrypt.IconCompatParcelizer.write(); i++) {
            read((Map.Entry) setvideometaencrypt.IconCompatParcelizer.RemoteActionCompatParcelizer(i));
        }
        Iterator it = setvideometaencrypt.IconCompatParcelizer.RemoteActionCompatParcelizer().iterator();
        while (it.hasNext()) {
            read((Map.Entry) it.next());
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

    private void read(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof getLessonIndex) {
            value = ((getLessonIndex) value).IconCompatParcelizer();
        }
        if (key.IconCompatParcelizer()) {
            Object objWrite = write(key);
            if (objWrite == null) {
                objWrite = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objWrite).add(read(it.next()));
            }
            this.IconCompatParcelizer.put(key, objWrite);
            return;
        }
        if (key.RemoteActionCompatParcelizer() == isRight.RemoteActionCompatParcelizer.MESSAGE) {
            Object objWrite2 = write(key);
            if (objWrite2 == null) {
                this.IconCompatParcelizer.put(key, read(value));
                return;
            } else {
                this.IconCompatParcelizer.put(key, key.IconCompatParcelizer(((BookReference) objWrite2).RatingCompat(), (BookReference) value).write());
                return;
            }
        }
        this.IconCompatParcelizer.put(key, read(value));
    }

    /* JADX INFO: renamed from: o.setVideoMetaEncrypt$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] IconCompatParcelizer;
        static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[isRight.IconCompatParcelizer.values().length];
            IconCompatParcelizer = iArr;
            try {
                iArr[isRight.IconCompatParcelizer.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IconCompatParcelizer[isRight.IconCompatParcelizer.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                IconCompatParcelizer[isRight.IconCompatParcelizer.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                IconCompatParcelizer[isRight.IconCompatParcelizer.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                IconCompatParcelizer[isRight.IconCompatParcelizer.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                IconCompatParcelizer[isRight.IconCompatParcelizer.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                IconCompatParcelizer[isRight.IconCompatParcelizer.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                IconCompatParcelizer[isRight.IconCompatParcelizer.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                IconCompatParcelizer[isRight.IconCompatParcelizer.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                IconCompatParcelizer[isRight.IconCompatParcelizer.BYTES.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                IconCompatParcelizer[isRight.IconCompatParcelizer.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                IconCompatParcelizer[isRight.IconCompatParcelizer.SFIXED32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                IconCompatParcelizer[isRight.IconCompatParcelizer.SFIXED64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                IconCompatParcelizer[isRight.IconCompatParcelizer.SINT32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                IconCompatParcelizer[isRight.IconCompatParcelizer.SINT64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                IconCompatParcelizer[isRight.IconCompatParcelizer.GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                IconCompatParcelizer[isRight.IconCompatParcelizer.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                IconCompatParcelizer[isRight.IconCompatParcelizer.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[isRight.RemoteActionCompatParcelizer.values().length];
            read = iArr2;
            try {
                iArr2[isRight.RemoteActionCompatParcelizer.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                read[isRight.RemoteActionCompatParcelizer.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                read[isRight.RemoteActionCompatParcelizer.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                read[isRight.RemoteActionCompatParcelizer.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                read[isRight.RemoteActionCompatParcelizer.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                read[isRight.RemoteActionCompatParcelizer.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                read[isRight.RemoteActionCompatParcelizer.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                read[isRight.RemoteActionCompatParcelizer.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                read[isRight.RemoteActionCompatParcelizer.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public static Object read(setSlidesCount setslidescount, isRight.IconCompatParcelizer iconCompatParcelizer) throws IOException {
        switch (AnonymousClass3.IconCompatParcelizer[iconCompatParcelizer.ordinal()]) {
            case 1:
                return Double.valueOf(setslidescount.IconCompatParcelizer());
            case 2:
                return Float.valueOf(setslidescount.AudioAttributesImplApi21Parcelizer());
            case 3:
                return Long.valueOf(setslidescount.AudioAttributesImplBaseParcelizer());
            case 4:
                return Long.valueOf(setslidescount.onAddQueueItem());
            case 5:
                return Integer.valueOf(setslidescount.AudioAttributesImplApi26Parcelizer());
            case 6:
                return Long.valueOf(setslidescount.MediaBrowserCompatCustomActionResultReceiver());
            case 7:
                return Integer.valueOf(setslidescount.MediaBrowserCompatItemReceiver());
            case 8:
                return Boolean.valueOf(setslidescount.read());
            case 9:
                return setslidescount.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            case 10:
                return setslidescount.RemoteActionCompatParcelizer();
            case 11:
                return Integer.valueOf(setslidescount.onCustomAction());
            case 12:
                return Integer.valueOf(setslidescount.RatingCompat());
            case 13:
                return Long.valueOf(setslidescount.MediaDescriptionCompat());
            case 14:
                return Integer.valueOf(setslidescount.MediaBrowserCompatSearchResultReceiver());
            case 15:
                return Long.valueOf(setslidescount.MediaBrowserCompatMediaItem());
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static void write(setResumeExplanation setresumeexplanation, isRight.IconCompatParcelizer iconCompatParcelizer, int i, Object obj) throws IOException {
        if (iconCompatParcelizer == isRight.IconCompatParcelizer.GROUP) {
            setresumeexplanation.write(i, (BookReference) obj);
        } else {
            setresumeexplanation.read(i, IconCompatParcelizer(iconCompatParcelizer, false));
            IconCompatParcelizer(setresumeexplanation, iconCompatParcelizer, obj);
        }
    }

    private static void IconCompatParcelizer(setResumeExplanation setresumeexplanation, isRight.IconCompatParcelizer iconCompatParcelizer, Object obj) throws IOException {
        switch (AnonymousClass3.IconCompatParcelizer[iconCompatParcelizer.ordinal()]) {
            case 1:
                setresumeexplanation.AudioAttributesCompatParcelizer(((Double) obj).doubleValue());
                break;
            case 2:
                setresumeexplanation.AudioAttributesCompatParcelizer(((Float) obj).floatValue());
                break;
            case 3:
                setresumeexplanation.AudioAttributesImplBaseParcelizer(((Long) obj).longValue());
                break;
            case 4:
                setresumeexplanation.AudioAttributesImplApi21Parcelizer(((Long) obj).longValue());
                break;
            case 5:
                setresumeexplanation.AudioAttributesImplApi26Parcelizer(((Integer) obj).intValue());
                break;
            case 6:
                setresumeexplanation.IconCompatParcelizer(((Long) obj).longValue());
                break;
            case 7:
                setresumeexplanation.AudioAttributesImplApi21Parcelizer(((Integer) obj).intValue());
                break;
            case 8:
                setresumeexplanation.read(((Boolean) obj).booleanValue());
                break;
            case 9:
                setresumeexplanation.write((String) obj);
                break;
            case 10:
                if (obj instanceof setVideoAspectRatio) {
                    setresumeexplanation.AudioAttributesCompatParcelizer((setVideoAspectRatio) obj);
                } else {
                    setresumeexplanation.read((byte[]) obj);
                }
                break;
            case 11:
                setresumeexplanation.MediaDescriptionCompat(((Integer) obj).intValue());
                break;
            case 12:
                setresumeexplanation.MediaBrowserCompatMediaItem(((Integer) obj).intValue());
                break;
            case 13:
                setresumeexplanation.MediaBrowserCompatItemReceiver(((Long) obj).longValue());
                break;
            case 14:
                setresumeexplanation.RatingCompat(((Integer) obj).intValue());
                break;
            case 15:
                setresumeexplanation.MediaBrowserCompatCustomActionResultReceiver(((Long) obj).longValue());
                break;
            case 16:
                setresumeexplanation.read((BookReference) obj);
                break;
            case 17:
                setresumeexplanation.AudioAttributesCompatParcelizer((BookReference) obj);
                break;
            case 18:
                if (obj instanceof LessonSpinnerItem.AudioAttributesCompatParcelizer) {
                    setresumeexplanation.AudioAttributesImplBaseParcelizer(((LessonSpinnerItem.AudioAttributesCompatParcelizer) obj).RemoteActionCompatParcelizer());
                } else {
                    setresumeexplanation.AudioAttributesImplBaseParcelizer(((Integer) obj).intValue());
                }
                break;
        }
    }

    public static void read(RemoteActionCompatParcelizer<?> remoteActionCompatParcelizer, Object obj, setResumeExplanation setresumeexplanation) throws IOException {
        isRight.IconCompatParcelizer iconCompatParcelizer = remoteActionCompatParcelizer.read();
        int iWrite = remoteActionCompatParcelizer.write();
        if (remoteActionCompatParcelizer.IconCompatParcelizer()) {
            List list = (List) obj;
            if (remoteActionCompatParcelizer.AudioAttributesCompatParcelizer()) {
                setresumeexplanation.read(iWrite, 2);
                Iterator it = list.iterator();
                int iWrite2 = 0;
                while (it.hasNext()) {
                    iWrite2 += write(iconCompatParcelizer, it.next());
                }
                setresumeexplanation.MediaMetadataCompat(iWrite2);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    IconCompatParcelizer(setresumeexplanation, iconCompatParcelizer, it2.next());
                }
                return;
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                write(setresumeexplanation, iconCompatParcelizer, iWrite, it3.next());
            }
            return;
        }
        if (obj instanceof getLessonIndex) {
            write(setresumeexplanation, iconCompatParcelizer, iWrite, ((getLessonIndex) obj).IconCompatParcelizer());
        } else {
            write(setresumeexplanation, iconCompatParcelizer, iWrite, obj);
        }
    }

    public final int RemoteActionCompatParcelizer() {
        int iIconCompatParcelizer = 0;
        for (int i = 0; i < this.IconCompatParcelizer.write(); i++) {
            Map.Entry<K, Object> entryRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer(i);
            iIconCompatParcelizer += IconCompatParcelizer((RemoteActionCompatParcelizer<?>) entryRemoteActionCompatParcelizer.getKey(), entryRemoteActionCompatParcelizer.getValue());
        }
        Iterator it = this.IconCompatParcelizer.RemoteActionCompatParcelizer().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iIconCompatParcelizer += IconCompatParcelizer((RemoteActionCompatParcelizer<?>) entry.getKey(), entry.getValue());
        }
        return iIconCompatParcelizer;
    }

    private static int RemoteActionCompatParcelizer(isRight.IconCompatParcelizer iconCompatParcelizer, int i, Object obj) {
        int iMediaBrowserCompatItemReceiver = setResumeExplanation.MediaBrowserCompatItemReceiver(i);
        if (iconCompatParcelizer == isRight.IconCompatParcelizer.GROUP) {
            iMediaBrowserCompatItemReceiver <<= 1;
        }
        return iMediaBrowserCompatItemReceiver + write(iconCompatParcelizer, obj);
    }

    private static int write(isRight.IconCompatParcelizer iconCompatParcelizer, Object obj) {
        switch (AnonymousClass3.IconCompatParcelizer[iconCompatParcelizer.ordinal()]) {
            case 1:
                return 8;
            case 2:
                return 4;
            case 3:
                return setResumeExplanation.read(((Long) obj).longValue());
            case 4:
                return setResumeExplanation.RemoteActionCompatParcelizer(((Long) obj).longValue());
            case 5:
                return setResumeExplanation.read(((Integer) obj).intValue());
            case 6:
                return 8;
            case 7:
                return 4;
            case 8:
                return 1;
            case 9:
                return setResumeExplanation.read((String) obj);
            case 10:
                if (obj instanceof setVideoAspectRatio) {
                    return setResumeExplanation.RemoteActionCompatParcelizer((setVideoAspectRatio) obj);
                }
                return setResumeExplanation.AudioAttributesCompatParcelizer((byte[]) obj);
            case 11:
                return setResumeExplanation.MediaBrowserCompatCustomActionResultReceiver(((Integer) obj).intValue());
            case 12:
                return 4;
            case 13:
                return 8;
            case 14:
                return setResumeExplanation.RemoteActionCompatParcelizer(((Integer) obj).intValue());
            case 15:
                return setResumeExplanation.AudioAttributesCompatParcelizer(((Long) obj).longValue());
            case 16:
                return setResumeExplanation.RemoteActionCompatParcelizer((BookReference) obj);
            case 17:
                if (obj instanceof getLessonIndex) {
                    return setResumeExplanation.write((getLessonIndex) obj);
                }
                return setResumeExplanation.write((BookReference) obj);
            case 18:
                if (obj instanceof LessonSpinnerItem.AudioAttributesCompatParcelizer) {
                    return setResumeExplanation.IconCompatParcelizer(((LessonSpinnerItem.AudioAttributesCompatParcelizer) obj).RemoteActionCompatParcelizer());
                }
                return setResumeExplanation.IconCompatParcelizer(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static int IconCompatParcelizer(RemoteActionCompatParcelizer<?> remoteActionCompatParcelizer, Object obj) {
        isRight.IconCompatParcelizer iconCompatParcelizer = remoteActionCompatParcelizer.read();
        int iWrite = remoteActionCompatParcelizer.write();
        if (remoteActionCompatParcelizer.IconCompatParcelizer()) {
            int iRemoteActionCompatParcelizer = 0;
            if (remoteActionCompatParcelizer.AudioAttributesCompatParcelizer()) {
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    iRemoteActionCompatParcelizer += write(iconCompatParcelizer, it.next());
                }
                return setResumeExplanation.MediaBrowserCompatItemReceiver(iWrite) + iRemoteActionCompatParcelizer + setResumeExplanation.write(iRemoteActionCompatParcelizer);
            }
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                iRemoteActionCompatParcelizer += RemoteActionCompatParcelizer(iconCompatParcelizer, iWrite, it2.next());
            }
            return iRemoteActionCompatParcelizer;
        }
        return RemoteActionCompatParcelizer(iconCompatParcelizer, iWrite, obj);
    }
}
