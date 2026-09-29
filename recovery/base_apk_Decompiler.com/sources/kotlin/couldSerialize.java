package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.AnnotatedWithParams;
import kotlin.BasicClassIntrospector;
import kotlin.CollectorBase;
import kotlin._add;
import kotlin._ignorableAnnotation;
import kotlin.forDeserialization;
import kotlin.isPresent;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
final class couldSerialize<T> implements getPrimaryMember<T> {
    private final int[] AudioAttributesImplApi21Parcelizer;
    private final emptyAnnotations<?> AudioAttributesImplApi26Parcelizer;
    private final boolean AudioAttributesImplBaseParcelizer;
    private final constructPropertyCollector IconCompatParcelizer;
    private final forSerialization MediaBrowserCompatCustomActionResultReceiver;
    private final boolean MediaBrowserCompatItemReceiver;
    private final couldDeserialize MediaBrowserCompatMediaItem;
    private final Object[] MediaBrowserCompatSearchResultReceiver;
    private final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final int MediaDescriptionCompat;
    private final _findStdJdkCollectionDesc MediaMetadataCompat;
    private final int RatingCompat;
    private final boolean handleMediaPlayPauseIfPendingOnHandler;
    private final int onAddQueueItem;
    private final hasName<?, ?> onCustomAction;
    private final int read;
    private final int[] write;
    private static final int[] RemoteActionCompatParcelizer = new int[0];
    private static final Unsafe AudioAttributesCompatParcelizer = ClassIntrospectorMixInResolver.read();

    private static boolean AudioAttributesCompatParcelizer(int i) {
        return (i & 268435456) != 0;
    }

    private static int AudioAttributesImplBaseParcelizer(int i) {
        return (i & 267386880) >>> 20;
    }

    private static long MediaBrowserCompatItemReceiver(int i) {
        return i & 1048575;
    }

    private static boolean read(int i) {
        return (i & 536870912) != 0;
    }

    private couldSerialize(int[] iArr, Object[] objArr, int i, int i2, constructPropertyCollector constructpropertycollector, boolean z, boolean z2, int[] iArr2, int i3, int i4, couldDeserialize coulddeserialize, forSerialization forserialization, hasName<?, ?> hasname, emptyAnnotations<?> emptyannotations, _findStdJdkCollectionDesc _findstdjdkcollectiondesc) {
        this.write = iArr;
        this.MediaBrowserCompatSearchResultReceiver = objArr;
        this.RatingCompat = i;
        this.MediaDescriptionCompat = i2;
        this.MediaBrowserCompatItemReceiver = constructpropertycollector instanceof _explicitClassOrOb;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = z;
        this.AudioAttributesImplBaseParcelizer = emptyannotations != null && emptyannotations.AudioAttributesCompatParcelizer(constructpropertycollector);
        this.handleMediaPlayPauseIfPendingOnHandler = z2;
        this.AudioAttributesImplApi21Parcelizer = iArr2;
        this.read = i3;
        this.onAddQueueItem = i4;
        this.MediaBrowserCompatMediaItem = coulddeserialize;
        this.MediaBrowserCompatCustomActionResultReceiver = forserialization;
        this.onCustomAction = hasname;
        this.AudioAttributesImplApi26Parcelizer = emptyannotations;
        this.IconCompatParcelizer = constructpropertycollector;
        this.MediaMetadataCompat = _findstdjdkcollectiondesc;
    }

    static <T> couldSerialize<T> RemoteActionCompatParcelizer(_resolveAnnotatedClass _resolveannotatedclass, couldDeserialize coulddeserialize, forSerialization forserialization, hasName<?, ?> hasname, emptyAnnotations<?> emptyannotations, _findStdJdkCollectionDesc _findstdjdkcollectiondesc) {
        if (_resolveannotatedclass instanceof getMutator) {
            return RemoteActionCompatParcelizer((getMutator) _resolveannotatedclass, coulddeserialize, forserialization, hasname, emptyannotations, _findstdjdkcollectiondesc);
        }
        return AudioAttributesCompatParcelizer((getRawPrimaryType) _resolveannotatedclass, coulddeserialize, forserialization, hasname, emptyannotations, _findstdjdkcollectiondesc);
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x037f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static <T> kotlin.couldSerialize<T> RemoteActionCompatParcelizer(kotlin.getMutator r33, kotlin.couldDeserialize r34, kotlin.forSerialization r35, kotlin.hasName<?, ?> r36, kotlin.emptyAnnotations<?> r37, kotlin._findStdJdkCollectionDesc r38) {
        /*
            Method dump skipped, instruction units count: 1014
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.couldSerialize.RemoteActionCompatParcelizer(o.getMutator, o.couldDeserialize, o.forSerialization, o.hasName, o.emptyAnnotations, o._findStdJdkCollectionDesc):o.couldSerialize");
    }

    private static Field IconCompatParcelizer(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sb = new StringBuilder("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(cls.getName());
            sb.append(" not found. Known fields are ");
            sb.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sb.toString());
        }
    }

    private static <T> couldSerialize<T> AudioAttributesCompatParcelizer(getRawPrimaryType getrawprimarytype, couldDeserialize coulddeserialize, forSerialization forserialization, hasName<?, ?> hasname, emptyAnnotations<?> emptyannotations, _findStdJdkCollectionDesc _findstdjdkcollectiondesc) {
        int i;
        int i2;
        int i3;
        boolean z = getrawprimarytype.RemoteActionCompatParcelizer() == getConstructorParameter.PROTO3;
        AnnotationCollectorOneAnnotation[] annotationCollectorOneAnnotationArr = getrawprimarytype.read();
        if (annotationCollectorOneAnnotationArr.length == 0) {
            i = 0;
            i2 = 0;
        } else {
            i = annotationCollectorOneAnnotationArr[0].read();
            i2 = annotationCollectorOneAnnotationArr[annotationCollectorOneAnnotationArr.length - 1].read();
        }
        int length = annotationCollectorOneAnnotationArr.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length << 1];
        int i4 = 0;
        int i5 = 0;
        for (AnnotationCollectorOneAnnotation annotationCollectorOneAnnotation : annotationCollectorOneAnnotationArr) {
            if (annotationCollectorOneAnnotation.AudioAttributesImplApi26Parcelizer() == AnnotationCollectorNCollector.MAP) {
                i4++;
            } else if (annotationCollectorOneAnnotation.AudioAttributesImplApi26Parcelizer().read() >= 18 && annotationCollectorOneAnnotation.AudioAttributesImplApi26Parcelizer().read() <= 49) {
                i5++;
            }
        }
        int[] iArr2 = i4 > 0 ? new int[i4] : null;
        int[] iArr3 = i5 > 0 ? new int[i5] : null;
        int[] iArrWrite = getrawprimarytype.write();
        if (iArrWrite == null) {
            iArrWrite = RemoteActionCompatParcelizer;
        }
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i6 < annotationCollectorOneAnnotationArr.length) {
            AnnotationCollectorOneAnnotation annotationCollectorOneAnnotation2 = annotationCollectorOneAnnotationArr[i6];
            int i11 = annotationCollectorOneAnnotation2.read();
            IconCompatParcelizer(annotationCollectorOneAnnotation2, iArr, i7, z, objArr);
            if (i8 < iArrWrite.length && iArrWrite[i8] == i11) {
                iArrWrite[i8] = i7;
                i8++;
            }
            if (annotationCollectorOneAnnotation2.AudioAttributesImplApi26Parcelizer() == AnnotationCollectorNCollector.MAP) {
                iArr2[i9] = i7;
                i9++;
            } else {
                if (annotationCollectorOneAnnotation2.AudioAttributesImplApi26Parcelizer().read() >= 18 && annotationCollectorOneAnnotation2.AudioAttributesImplApi26Parcelizer().read() <= 49) {
                    i3 = i7;
                    iArr3[i10] = (int) ClassIntrospectorMixInResolver.RemoteActionCompatParcelizer(annotationCollectorOneAnnotation2.RemoteActionCompatParcelizer());
                    i10++;
                }
                i6++;
                i7 = i3 + 3;
            }
            i3 = i7;
            i6++;
            i7 = i3 + 3;
        }
        if (iArr2 == null) {
            iArr2 = RemoteActionCompatParcelizer;
        }
        if (iArr3 == null) {
            iArr3 = RemoteActionCompatParcelizer;
        }
        int[] iArr4 = new int[iArrWrite.length + iArr2.length + iArr3.length];
        System.arraycopy(iArrWrite, 0, iArr4, 0, iArrWrite.length);
        System.arraycopy(iArr2, 0, iArr4, iArrWrite.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, iArrWrite.length + iArr2.length, iArr3.length);
        return new couldSerialize<>(iArr, objArr, i, i2, getrawprimarytype.IconCompatParcelizer(), z, true, iArr4, iArrWrite.length, iArrWrite.length + iArr2.length, coulddeserialize, forserialization, hasname, emptyannotations, _findstdjdkcollectiondesc);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void IconCompatParcelizer(kotlin.AnnotationCollectorOneAnnotation r6, int[] r7, int r8, boolean r9, java.lang.Object[] r10) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.couldSerialize.IconCompatParcelizer(o.AnnotationCollectorOneAnnotation, int[], int, boolean, java.lang.Object[]):void");
    }

    @Override // kotlin.getPrimaryMember
    public final T write() {
        return (T) this.MediaBrowserCompatMediaItem.IconCompatParcelizer(this.IconCompatParcelizer);
    }

    @Override // kotlin.getPrimaryMember
    public final boolean RemoteActionCompatParcelizer(T t, T t2) {
        int length = this.write.length;
        for (int i = 0; i < length; i += 3) {
            if (!RemoteActionCompatParcelizer(t, t2, i)) {
                return false;
            }
        }
        if (!this.onCustomAction.RemoteActionCompatParcelizer(t).equals(this.onCustomAction.RemoteActionCompatParcelizer(t2))) {
            return false;
        }
        if (this.AudioAttributesImplBaseParcelizer) {
            return this.AudioAttributesImplApi26Parcelizer.read(t).equals(this.AudioAttributesImplApi26Parcelizer.read(t2));
        }
        return true;
    }

    private boolean RemoteActionCompatParcelizer(T t, T t2, int i) {
        int iMediaDescriptionCompat = MediaDescriptionCompat(i);
        long jMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(iMediaDescriptionCompat);
        switch (AudioAttributesImplBaseParcelizer(iMediaDescriptionCompat)) {
            case 0:
                if (!IconCompatParcelizer(t, t2, i) || Double.doubleToLongBits(ClassIntrospectorMixInResolver.AudioAttributesImplApi26Parcelizer(t, jMediaBrowserCompatItemReceiver)) != Double.doubleToLongBits(ClassIntrospectorMixInResolver.AudioAttributesImplApi26Parcelizer(t2, jMediaBrowserCompatItemReceiver))) {
                }
                break;
            case 1:
                if (!IconCompatParcelizer(t, t2, i) || Float.floatToIntBits(ClassIntrospectorMixInResolver.AudioAttributesImplBaseParcelizer(t, jMediaBrowserCompatItemReceiver)) != Float.floatToIntBits(ClassIntrospectorMixInResolver.AudioAttributesImplBaseParcelizer(t2, jMediaBrowserCompatItemReceiver))) {
                }
                break;
            case 2:
                if (!IconCompatParcelizer(t, t2, i) || ClassIntrospectorMixInResolver.MediaBrowserCompatItemReceiver(t, jMediaBrowserCompatItemReceiver) != ClassIntrospectorMixInResolver.MediaBrowserCompatItemReceiver(t2, jMediaBrowserCompatItemReceiver)) {
                }
                break;
            case 3:
                if (!IconCompatParcelizer(t, t2, i) || ClassIntrospectorMixInResolver.MediaBrowserCompatItemReceiver(t, jMediaBrowserCompatItemReceiver) != ClassIntrospectorMixInResolver.MediaBrowserCompatItemReceiver(t2, jMediaBrowserCompatItemReceiver)) {
                }
                break;
            case 4:
                if (!IconCompatParcelizer(t, t2, i) || ClassIntrospectorMixInResolver.MediaBrowserCompatCustomActionResultReceiver(t, jMediaBrowserCompatItemReceiver) != ClassIntrospectorMixInResolver.MediaBrowserCompatCustomActionResultReceiver(t2, jMediaBrowserCompatItemReceiver)) {
                }
                break;
            case 5:
                if (!IconCompatParcelizer(t, t2, i) || ClassIntrospectorMixInResolver.MediaBrowserCompatItemReceiver(t, jMediaBrowserCompatItemReceiver) != ClassIntrospectorMixInResolver.MediaBrowserCompatItemReceiver(t2, jMediaBrowserCompatItemReceiver)) {
                }
                break;
            case 6:
                if (!IconCompatParcelizer(t, t2, i) || ClassIntrospectorMixInResolver.MediaBrowserCompatCustomActionResultReceiver(t, jMediaBrowserCompatItemReceiver) != ClassIntrospectorMixInResolver.MediaBrowserCompatCustomActionResultReceiver(t2, jMediaBrowserCompatItemReceiver)) {
                }
                break;
            case 7:
                if (!IconCompatParcelizer(t, t2, i) || ClassIntrospectorMixInResolver.write(t, jMediaBrowserCompatItemReceiver) != ClassIntrospectorMixInResolver.write(t2, jMediaBrowserCompatItemReceiver)) {
                }
                break;
            case 8:
                if (!IconCompatParcelizer(t, t2, i) || !hasField.read(ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t, jMediaBrowserCompatItemReceiver), ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t2, jMediaBrowserCompatItemReceiver))) {
                }
                break;
            case 9:
                if (!IconCompatParcelizer(t, t2, i) || !hasField.read(ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t, jMediaBrowserCompatItemReceiver), ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t2, jMediaBrowserCompatItemReceiver))) {
                }
                break;
            case 10:
                if (!IconCompatParcelizer(t, t2, i) || !hasField.read(ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t, jMediaBrowserCompatItemReceiver), ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t2, jMediaBrowserCompatItemReceiver))) {
                }
                break;
            case 11:
                if (!IconCompatParcelizer(t, t2, i) || ClassIntrospectorMixInResolver.MediaBrowserCompatCustomActionResultReceiver(t, jMediaBrowserCompatItemReceiver) != ClassIntrospectorMixInResolver.MediaBrowserCompatCustomActionResultReceiver(t2, jMediaBrowserCompatItemReceiver)) {
                }
                break;
            case 12:
                if (!IconCompatParcelizer(t, t2, i) || ClassIntrospectorMixInResolver.MediaBrowserCompatCustomActionResultReceiver(t, jMediaBrowserCompatItemReceiver) != ClassIntrospectorMixInResolver.MediaBrowserCompatCustomActionResultReceiver(t2, jMediaBrowserCompatItemReceiver)) {
                }
                break;
            case 13:
                if (!IconCompatParcelizer(t, t2, i) || ClassIntrospectorMixInResolver.MediaBrowserCompatCustomActionResultReceiver(t, jMediaBrowserCompatItemReceiver) != ClassIntrospectorMixInResolver.MediaBrowserCompatCustomActionResultReceiver(t2, jMediaBrowserCompatItemReceiver)) {
                }
                break;
            case 14:
                if (!IconCompatParcelizer(t, t2, i) || ClassIntrospectorMixInResolver.MediaBrowserCompatItemReceiver(t, jMediaBrowserCompatItemReceiver) != ClassIntrospectorMixInResolver.MediaBrowserCompatItemReceiver(t2, jMediaBrowserCompatItemReceiver)) {
                }
                break;
            case 15:
                if (!IconCompatParcelizer(t, t2, i) || ClassIntrospectorMixInResolver.MediaBrowserCompatCustomActionResultReceiver(t, jMediaBrowserCompatItemReceiver) != ClassIntrospectorMixInResolver.MediaBrowserCompatCustomActionResultReceiver(t2, jMediaBrowserCompatItemReceiver)) {
                }
                break;
            case 16:
                if (!IconCompatParcelizer(t, t2, i) || ClassIntrospectorMixInResolver.MediaBrowserCompatItemReceiver(t, jMediaBrowserCompatItemReceiver) != ClassIntrospectorMixInResolver.MediaBrowserCompatItemReceiver(t2, jMediaBrowserCompatItemReceiver)) {
                }
                break;
            case 17:
                if (!IconCompatParcelizer(t, t2, i) || !hasField.read(ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t, jMediaBrowserCompatItemReceiver), ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t2, jMediaBrowserCompatItemReceiver))) {
                }
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (!read(t, t2, i) || !hasField.read(ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t, jMediaBrowserCompatItemReceiver), ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t2, jMediaBrowserCompatItemReceiver))) {
                }
                break;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01c0  */
    @Override // kotlin.getPrimaryMember
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int read(T r8) {
        /*
            Method dump skipped, instruction units count: 728
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.couldSerialize.read(java.lang.Object):int");
    }

    @Override // kotlin.getPrimaryMember
    public final void IconCompatParcelizer(T t, T t2) {
        for (int i = 0; i < this.write.length; i += 3) {
            MediaBrowserCompatItemReceiver(t, t2, i);
        }
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            return;
        }
        hasField.IconCompatParcelizer(this.onCustomAction, t, t2);
        if (this.AudioAttributesImplBaseParcelizer) {
            hasField.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, t, t2);
        }
    }

    private void MediaBrowserCompatItemReceiver(T t, T t2, int i) {
        int iMediaDescriptionCompat = MediaDescriptionCompat(i);
        long jMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(iMediaDescriptionCompat);
        int iAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(i);
        switch (AudioAttributesImplBaseParcelizer(iMediaDescriptionCompat)) {
            case 0:
                if (IconCompatParcelizer((Object) t2, i)) {
                    ClassIntrospectorMixInResolver.read(t, jMediaBrowserCompatItemReceiver, ClassIntrospectorMixInResolver.AudioAttributesImplApi26Parcelizer(t2, jMediaBrowserCompatItemReceiver));
                    AudioAttributesCompatParcelizer((Object) t, i);
                }
                break;
            case 1:
                if (IconCompatParcelizer((Object) t2, i)) {
                    ClassIntrospectorMixInResolver.write(t, jMediaBrowserCompatItemReceiver, ClassIntrospectorMixInResolver.AudioAttributesImplBaseParcelizer(t2, jMediaBrowserCompatItemReceiver));
                    AudioAttributesCompatParcelizer((Object) t, i);
                }
                break;
            case 2:
                if (IconCompatParcelizer((Object) t2, i)) {
                    ClassIntrospectorMixInResolver.read((Object) t, jMediaBrowserCompatItemReceiver, ClassIntrospectorMixInResolver.MediaBrowserCompatItemReceiver(t2, jMediaBrowserCompatItemReceiver));
                    AudioAttributesCompatParcelizer((Object) t, i);
                }
                break;
            case 3:
                if (IconCompatParcelizer((Object) t2, i)) {
                    ClassIntrospectorMixInResolver.read((Object) t, jMediaBrowserCompatItemReceiver, ClassIntrospectorMixInResolver.MediaBrowserCompatItemReceiver(t2, jMediaBrowserCompatItemReceiver));
                    AudioAttributesCompatParcelizer((Object) t, i);
                }
                break;
            case 4:
                if (IconCompatParcelizer((Object) t2, i)) {
                    ClassIntrospectorMixInResolver.write((Object) t, jMediaBrowserCompatItemReceiver, ClassIntrospectorMixInResolver.MediaBrowserCompatCustomActionResultReceiver(t2, jMediaBrowserCompatItemReceiver));
                    AudioAttributesCompatParcelizer((Object) t, i);
                }
                break;
            case 5:
                if (IconCompatParcelizer((Object) t2, i)) {
                    ClassIntrospectorMixInResolver.read((Object) t, jMediaBrowserCompatItemReceiver, ClassIntrospectorMixInResolver.MediaBrowserCompatItemReceiver(t2, jMediaBrowserCompatItemReceiver));
                    AudioAttributesCompatParcelizer((Object) t, i);
                }
                break;
            case 6:
                if (IconCompatParcelizer((Object) t2, i)) {
                    ClassIntrospectorMixInResolver.write((Object) t, jMediaBrowserCompatItemReceiver, ClassIntrospectorMixInResolver.MediaBrowserCompatCustomActionResultReceiver(t2, jMediaBrowserCompatItemReceiver));
                    AudioAttributesCompatParcelizer((Object) t, i);
                }
                break;
            case 7:
                if (IconCompatParcelizer((Object) t2, i)) {
                    ClassIntrospectorMixInResolver.RemoteActionCompatParcelizer(t, jMediaBrowserCompatItemReceiver, ClassIntrospectorMixInResolver.write(t2, jMediaBrowserCompatItemReceiver));
                    AudioAttributesCompatParcelizer((Object) t, i);
                }
                break;
            case 8:
                if (IconCompatParcelizer((Object) t2, i)) {
                    ClassIntrospectorMixInResolver.read(t, jMediaBrowserCompatItemReceiver, ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t2, jMediaBrowserCompatItemReceiver));
                    AudioAttributesCompatParcelizer((Object) t, i);
                }
                break;
            case 9:
                write(t, t2, i);
                break;
            case 10:
                if (IconCompatParcelizer((Object) t2, i)) {
                    ClassIntrospectorMixInResolver.read(t, jMediaBrowserCompatItemReceiver, ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t2, jMediaBrowserCompatItemReceiver));
                    AudioAttributesCompatParcelizer((Object) t, i);
                }
                break;
            case 11:
                if (IconCompatParcelizer((Object) t2, i)) {
                    ClassIntrospectorMixInResolver.write((Object) t, jMediaBrowserCompatItemReceiver, ClassIntrospectorMixInResolver.MediaBrowserCompatCustomActionResultReceiver(t2, jMediaBrowserCompatItemReceiver));
                    AudioAttributesCompatParcelizer((Object) t, i);
                }
                break;
            case 12:
                if (IconCompatParcelizer((Object) t2, i)) {
                    ClassIntrospectorMixInResolver.write((Object) t, jMediaBrowserCompatItemReceiver, ClassIntrospectorMixInResolver.MediaBrowserCompatCustomActionResultReceiver(t2, jMediaBrowserCompatItemReceiver));
                    AudioAttributesCompatParcelizer((Object) t, i);
                }
                break;
            case 13:
                if (IconCompatParcelizer((Object) t2, i)) {
                    ClassIntrospectorMixInResolver.write((Object) t, jMediaBrowserCompatItemReceiver, ClassIntrospectorMixInResolver.MediaBrowserCompatCustomActionResultReceiver(t2, jMediaBrowserCompatItemReceiver));
                    AudioAttributesCompatParcelizer((Object) t, i);
                }
                break;
            case 14:
                if (IconCompatParcelizer((Object) t2, i)) {
                    ClassIntrospectorMixInResolver.read((Object) t, jMediaBrowserCompatItemReceiver, ClassIntrospectorMixInResolver.MediaBrowserCompatItemReceiver(t2, jMediaBrowserCompatItemReceiver));
                    AudioAttributesCompatParcelizer((Object) t, i);
                }
                break;
            case 15:
                if (IconCompatParcelizer((Object) t2, i)) {
                    ClassIntrospectorMixInResolver.write((Object) t, jMediaBrowserCompatItemReceiver, ClassIntrospectorMixInResolver.MediaBrowserCompatCustomActionResultReceiver(t2, jMediaBrowserCompatItemReceiver));
                    AudioAttributesCompatParcelizer((Object) t, i);
                }
                break;
            case 16:
                if (IconCompatParcelizer((Object) t2, i)) {
                    ClassIntrospectorMixInResolver.read((Object) t, jMediaBrowserCompatItemReceiver, ClassIntrospectorMixInResolver.MediaBrowserCompatItemReceiver(t2, jMediaBrowserCompatItemReceiver));
                    AudioAttributesCompatParcelizer((Object) t, i);
                }
                break;
            case 17:
                write(t, t2, i);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.MediaBrowserCompatCustomActionResultReceiver.read(t, t2, jMediaBrowserCompatItemReceiver);
                break;
            case 50:
                hasField.write(this.MediaMetadataCompat, t, t2, jMediaBrowserCompatItemReceiver);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (IconCompatParcelizer(t2, iAudioAttributesImplApi26Parcelizer, i)) {
                    ClassIntrospectorMixInResolver.read(t, jMediaBrowserCompatItemReceiver, ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t2, jMediaBrowserCompatItemReceiver));
                    read(t, iAudioAttributesImplApi26Parcelizer, i);
                }
                break;
            case 60:
                AudioAttributesCompatParcelizer(t, t2, i);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (IconCompatParcelizer(t2, iAudioAttributesImplApi26Parcelizer, i)) {
                    ClassIntrospectorMixInResolver.read(t, jMediaBrowserCompatItemReceiver, ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t2, jMediaBrowserCompatItemReceiver));
                    read(t, iAudioAttributesImplApi26Parcelizer, i);
                }
                break;
            case 68:
                AudioAttributesCompatParcelizer(t, t2, i);
                break;
        }
    }

    private void write(T t, T t2, int i) {
        long jMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(MediaDescriptionCompat(i));
        if (IconCompatParcelizer((Object) t2, i)) {
            Object objAudioAttributesImplApi21Parcelizer = ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t, jMediaBrowserCompatItemReceiver);
            Object objAudioAttributesImplApi21Parcelizer2 = ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t2, jMediaBrowserCompatItemReceiver);
            if (objAudioAttributesImplApi21Parcelizer != null && objAudioAttributesImplApi21Parcelizer2 != null) {
                ClassIntrospectorMixInResolver.read(t, jMediaBrowserCompatItemReceiver, forDeserialization.RemoteActionCompatParcelizer(objAudioAttributesImplApi21Parcelizer, objAudioAttributesImplApi21Parcelizer2));
                AudioAttributesCompatParcelizer((Object) t, i);
            } else if (objAudioAttributesImplApi21Parcelizer2 != null) {
                ClassIntrospectorMixInResolver.read(t, jMediaBrowserCompatItemReceiver, objAudioAttributesImplApi21Parcelizer2);
                AudioAttributesCompatParcelizer((Object) t, i);
            }
        }
    }

    private void AudioAttributesCompatParcelizer(T t, T t2, int i) {
        int iMediaDescriptionCompat = MediaDescriptionCompat(i);
        int iAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(i);
        long jMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(iMediaDescriptionCompat);
        if (IconCompatParcelizer(t2, iAudioAttributesImplApi26Parcelizer, i)) {
            Object objAudioAttributesImplApi21Parcelizer = ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t, jMediaBrowserCompatItemReceiver);
            Object objAudioAttributesImplApi21Parcelizer2 = ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t2, jMediaBrowserCompatItemReceiver);
            if (objAudioAttributesImplApi21Parcelizer != null && objAudioAttributesImplApi21Parcelizer2 != null) {
                ClassIntrospectorMixInResolver.read(t, jMediaBrowserCompatItemReceiver, forDeserialization.RemoteActionCompatParcelizer(objAudioAttributesImplApi21Parcelizer, objAudioAttributesImplApi21Parcelizer2));
                read(t, iAudioAttributesImplApi26Parcelizer, i);
            } else if (objAudioAttributesImplApi21Parcelizer2 != null) {
                ClassIntrospectorMixInResolver.read(t, jMediaBrowserCompatItemReceiver, objAudioAttributesImplApi21Parcelizer2);
                read(t, iAudioAttributesImplApi26Parcelizer, i);
            }
        }
    }

    @Override // kotlin.getPrimaryMember
    public final int AudioAttributesCompatParcelizer(T t) {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver ? MediaBrowserCompatCustomActionResultReceiver(t) : IconCompatParcelizer(t);
    }

    private int IconCompatParcelizer(T t) {
        int i;
        int i2;
        int iIconCompatParcelizer;
        int iAudioAttributesCompatParcelizer;
        int iMediaBrowserCompatSearchResultReceiver;
        int iMediaDescriptionCompat;
        Unsafe unsafe = AudioAttributesCompatParcelizer;
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < this.write.length; i6 += 3) {
            int iMediaDescriptionCompat2 = MediaDescriptionCompat(i6);
            int iAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(i6);
            int iAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(iMediaDescriptionCompat2);
            if (iAudioAttributesImplBaseParcelizer <= 17) {
                i = this.write[i6 + 2];
                int i7 = 1048575 & i;
                if (i7 != i3) {
                    i5 = unsafe.getInt(t, i7);
                    i3 = i7;
                }
                i2 = 1 << (i >>> 20);
            } else {
                i = (!this.handleMediaPlayPauseIfPendingOnHandler || iAudioAttributesImplBaseParcelizer < AnnotationCollectorNCollector.DOUBLE_LIST_PACKED.read() || iAudioAttributesImplBaseParcelizer > AnnotationCollectorNCollector.SINT64_LIST_PACKED.read()) ? 0 : this.write[i6 + 2] & 1048575;
                i2 = 0;
            }
            long jMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(iMediaDescriptionCompat2);
            switch (iAudioAttributesImplBaseParcelizer) {
                case 0:
                    if ((i5 & i2) != 0) {
                        iIconCompatParcelizer = getParameterAnnotations.IconCompatParcelizer(iAudioAttributesImplApi26Parcelizer);
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 1:
                    if ((i5 & i2) != 0) {
                        iIconCompatParcelizer = getParameterAnnotations.AudioAttributesImplBaseParcelizer(iAudioAttributesImplApi26Parcelizer);
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 2:
                    if ((i5 & i2) != 0) {
                        iIconCompatParcelizer = getParameterAnnotations.IconCompatParcelizer(iAudioAttributesImplApi26Parcelizer, unsafe.getLong(t, jMediaBrowserCompatItemReceiver));
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 3:
                    if ((i5 & i2) != 0) {
                        iIconCompatParcelizer = getParameterAnnotations.read(iAudioAttributesImplApi26Parcelizer, unsafe.getLong(t, jMediaBrowserCompatItemReceiver));
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 4:
                    if ((i5 & i2) != 0) {
                        iIconCompatParcelizer = getParameterAnnotations.write(iAudioAttributesImplApi26Parcelizer, unsafe.getInt(t, jMediaBrowserCompatItemReceiver));
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 5:
                    if ((i5 & i2) != 0) {
                        iIconCompatParcelizer = getParameterAnnotations.RemoteActionCompatParcelizer(iAudioAttributesImplApi26Parcelizer);
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 6:
                    if ((i5 & i2) != 0) {
                        iIconCompatParcelizer = getParameterAnnotations.AudioAttributesCompatParcelizer(iAudioAttributesImplApi26Parcelizer);
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 7:
                    if ((i5 & i2) != 0) {
                        iIconCompatParcelizer = getParameterAnnotations.read(iAudioAttributesImplApi26Parcelizer);
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 8:
                    if ((i5 & i2) != 0) {
                        Object object = unsafe.getObject(t, jMediaBrowserCompatItemReceiver);
                        if (object instanceof AnnotatedWithParams) {
                            iIconCompatParcelizer = getParameterAnnotations.IconCompatParcelizer(iAudioAttributesImplApi26Parcelizer, (AnnotatedWithParams) object);
                        } else {
                            iIconCompatParcelizer = getParameterAnnotations.AudioAttributesCompatParcelizer(iAudioAttributesImplApi26Parcelizer, (String) object);
                        }
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 9:
                    if ((i5 & i2) != 0) {
                        iIconCompatParcelizer = hasField.read(iAudioAttributesImplApi26Parcelizer, unsafe.getObject(t, jMediaBrowserCompatItemReceiver), RemoteActionCompatParcelizer(i6));
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 10:
                    if ((i5 & i2) != 0) {
                        iIconCompatParcelizer = getParameterAnnotations.IconCompatParcelizer(iAudioAttributesImplApi26Parcelizer, (AnnotatedWithParams) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 11:
                    if ((i5 & i2) != 0) {
                        iIconCompatParcelizer = getParameterAnnotations.RemoteActionCompatParcelizer(iAudioAttributesImplApi26Parcelizer, unsafe.getInt(t, jMediaBrowserCompatItemReceiver));
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 12:
                    if ((i5 & i2) != 0) {
                        iIconCompatParcelizer = getParameterAnnotations.IconCompatParcelizer(iAudioAttributesImplApi26Parcelizer, unsafe.getInt(t, jMediaBrowserCompatItemReceiver));
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 13:
                    if ((i5 & i2) != 0) {
                        iIconCompatParcelizer = getParameterAnnotations.RatingCompat(iAudioAttributesImplApi26Parcelizer);
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 14:
                    if ((i5 & i2) != 0) {
                        iIconCompatParcelizer = getParameterAnnotations.MediaMetadataCompat(iAudioAttributesImplApi26Parcelizer);
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 15:
                    if ((i5 & i2) != 0) {
                        iIconCompatParcelizer = getParameterAnnotations.read(iAudioAttributesImplApi26Parcelizer, unsafe.getInt(t, jMediaBrowserCompatItemReceiver));
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 16:
                    if ((i5 & i2) != 0) {
                        iIconCompatParcelizer = getParameterAnnotations.RemoteActionCompatParcelizer(iAudioAttributesImplApi26Parcelizer, unsafe.getLong(t, jMediaBrowserCompatItemReceiver));
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 17:
                    if ((i5 & i2) != 0) {
                        iIconCompatParcelizer = getParameterAnnotations.AudioAttributesCompatParcelizer(iAudioAttributesImplApi26Parcelizer, (constructPropertyCollector) unsafe.getObject(t, jMediaBrowserCompatItemReceiver), RemoteActionCompatParcelizer(i6));
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 18:
                    iIconCompatParcelizer = hasField.RemoteActionCompatParcelizer(iAudioAttributesImplApi26Parcelizer, (List) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    i4 += iIconCompatParcelizer;
                    break;
                case 19:
                    iIconCompatParcelizer = hasField.write(iAudioAttributesImplApi26Parcelizer, (List) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    i4 += iIconCompatParcelizer;
                    break;
                case 20:
                    iIconCompatParcelizer = hasField.MediaBrowserCompatItemReceiver(iAudioAttributesImplApi26Parcelizer, (List) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    i4 += iIconCompatParcelizer;
                    break;
                case 21:
                    iIconCompatParcelizer = hasField.MediaDescriptionCompat(iAudioAttributesImplApi26Parcelizer, (List) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    i4 += iIconCompatParcelizer;
                    break;
                case 22:
                    iIconCompatParcelizer = hasField.AudioAttributesImplApi21Parcelizer(iAudioAttributesImplApi26Parcelizer, (List) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    i4 += iIconCompatParcelizer;
                    break;
                case 23:
                    iIconCompatParcelizer = hasField.RemoteActionCompatParcelizer(iAudioAttributesImplApi26Parcelizer, (List) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    i4 += iIconCompatParcelizer;
                    break;
                case 24:
                    iIconCompatParcelizer = hasField.write(iAudioAttributesImplApi26Parcelizer, (List) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    i4 += iIconCompatParcelizer;
                    break;
                case 25:
                    iIconCompatParcelizer = hasField.IconCompatParcelizer(iAudioAttributesImplApi26Parcelizer, (List) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    i4 += iIconCompatParcelizer;
                    break;
                case 26:
                    iIconCompatParcelizer = hasField.AudioAttributesImplBaseParcelizer(iAudioAttributesImplApi26Parcelizer, (List) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    i4 += iIconCompatParcelizer;
                    break;
                case 27:
                    iIconCompatParcelizer = hasField.read(iAudioAttributesImplApi26Parcelizer, (List<?>) unsafe.getObject(t, jMediaBrowserCompatItemReceiver), RemoteActionCompatParcelizer(i6));
                    i4 += iIconCompatParcelizer;
                    break;
                case 28:
                    iIconCompatParcelizer = hasField.AudioAttributesCompatParcelizer(iAudioAttributesImplApi26Parcelizer, (List) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    i4 += iIconCompatParcelizer;
                    break;
                case 29:
                    iIconCompatParcelizer = hasField.MediaBrowserCompatSearchResultReceiver(iAudioAttributesImplApi26Parcelizer, (List) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    i4 += iIconCompatParcelizer;
                    break;
                case 30:
                    iIconCompatParcelizer = hasField.read(iAudioAttributesImplApi26Parcelizer, (List<Integer>) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    i4 += iIconCompatParcelizer;
                    break;
                case 31:
                    iIconCompatParcelizer = hasField.write(iAudioAttributesImplApi26Parcelizer, (List) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    i4 += iIconCompatParcelizer;
                    break;
                case 32:
                    iIconCompatParcelizer = hasField.RemoteActionCompatParcelizer(iAudioAttributesImplApi26Parcelizer, (List) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    i4 += iIconCompatParcelizer;
                    break;
                case 33:
                    iIconCompatParcelizer = hasField.AudioAttributesImplApi26Parcelizer(iAudioAttributesImplApi26Parcelizer, (List) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    i4 += iIconCompatParcelizer;
                    break;
                case 34:
                    iIconCompatParcelizer = hasField.MediaBrowserCompatCustomActionResultReceiver(iAudioAttributesImplApi26Parcelizer, (List) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    i4 += iIconCompatParcelizer;
                    break;
                case 35:
                    iAudioAttributesCompatParcelizer = hasField.AudioAttributesCompatParcelizer((List<?>) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    if (iAudioAttributesCompatParcelizer > 0) {
                        if (this.handleMediaPlayPauseIfPendingOnHandler) {
                            unsafe.putInt(t, i, iAudioAttributesCompatParcelizer);
                        }
                        iMediaBrowserCompatSearchResultReceiver = getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(iAudioAttributesImplApi26Parcelizer);
                        iMediaDescriptionCompat = getParameterAnnotations.MediaDescriptionCompat(iAudioAttributesCompatParcelizer);
                        iIconCompatParcelizer = iAudioAttributesCompatParcelizer + iMediaBrowserCompatSearchResultReceiver + iMediaDescriptionCompat;
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 36:
                    iAudioAttributesCompatParcelizer = hasField.write((List) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    if (iAudioAttributesCompatParcelizer > 0) {
                        if (this.handleMediaPlayPauseIfPendingOnHandler) {
                            unsafe.putInt(t, i, iAudioAttributesCompatParcelizer);
                        }
                        iMediaBrowserCompatSearchResultReceiver = getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(iAudioAttributesImplApi26Parcelizer);
                        iMediaDescriptionCompat = getParameterAnnotations.MediaDescriptionCompat(iAudioAttributesCompatParcelizer);
                        iIconCompatParcelizer = iAudioAttributesCompatParcelizer + iMediaBrowserCompatSearchResultReceiver + iMediaDescriptionCompat;
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 37:
                    iAudioAttributesCompatParcelizer = hasField.AudioAttributesImplBaseParcelizer((List) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    if (iAudioAttributesCompatParcelizer > 0) {
                        if (this.handleMediaPlayPauseIfPendingOnHandler) {
                            unsafe.putInt(t, i, iAudioAttributesCompatParcelizer);
                        }
                        iMediaBrowserCompatSearchResultReceiver = getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(iAudioAttributesImplApi26Parcelizer);
                        iMediaDescriptionCompat = getParameterAnnotations.MediaDescriptionCompat(iAudioAttributesCompatParcelizer);
                        iIconCompatParcelizer = iAudioAttributesCompatParcelizer + iMediaBrowserCompatSearchResultReceiver + iMediaDescriptionCompat;
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 38:
                    iAudioAttributesCompatParcelizer = hasField.MediaBrowserCompatItemReceiver((List) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    if (iAudioAttributesCompatParcelizer > 0) {
                        if (this.handleMediaPlayPauseIfPendingOnHandler) {
                            unsafe.putInt(t, i, iAudioAttributesCompatParcelizer);
                        }
                        iMediaBrowserCompatSearchResultReceiver = getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(iAudioAttributesImplApi26Parcelizer);
                        iMediaDescriptionCompat = getParameterAnnotations.MediaDescriptionCompat(iAudioAttributesCompatParcelizer);
                        iIconCompatParcelizer = iAudioAttributesCompatParcelizer + iMediaBrowserCompatSearchResultReceiver + iMediaDescriptionCompat;
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 39:
                    iAudioAttributesCompatParcelizer = hasField.IconCompatParcelizer((List) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    if (iAudioAttributesCompatParcelizer > 0) {
                        if (this.handleMediaPlayPauseIfPendingOnHandler) {
                            unsafe.putInt(t, i, iAudioAttributesCompatParcelizer);
                        }
                        iMediaBrowserCompatSearchResultReceiver = getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(iAudioAttributesImplApi26Parcelizer);
                        iMediaDescriptionCompat = getParameterAnnotations.MediaDescriptionCompat(iAudioAttributesCompatParcelizer);
                        iIconCompatParcelizer = iAudioAttributesCompatParcelizer + iMediaBrowserCompatSearchResultReceiver + iMediaDescriptionCompat;
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 40:
                    iAudioAttributesCompatParcelizer = hasField.AudioAttributesCompatParcelizer((List<?>) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    if (iAudioAttributesCompatParcelizer > 0) {
                        if (this.handleMediaPlayPauseIfPendingOnHandler) {
                            unsafe.putInt(t, i, iAudioAttributesCompatParcelizer);
                        }
                        iMediaBrowserCompatSearchResultReceiver = getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(iAudioAttributesImplApi26Parcelizer);
                        iMediaDescriptionCompat = getParameterAnnotations.MediaDescriptionCompat(iAudioAttributesCompatParcelizer);
                        iIconCompatParcelizer = iAudioAttributesCompatParcelizer + iMediaBrowserCompatSearchResultReceiver + iMediaDescriptionCompat;
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 41:
                    iAudioAttributesCompatParcelizer = hasField.write((List) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    if (iAudioAttributesCompatParcelizer > 0) {
                        if (this.handleMediaPlayPauseIfPendingOnHandler) {
                            unsafe.putInt(t, i, iAudioAttributesCompatParcelizer);
                        }
                        iMediaBrowserCompatSearchResultReceiver = getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(iAudioAttributesImplApi26Parcelizer);
                        iMediaDescriptionCompat = getParameterAnnotations.MediaDescriptionCompat(iAudioAttributesCompatParcelizer);
                        iIconCompatParcelizer = iAudioAttributesCompatParcelizer + iMediaBrowserCompatSearchResultReceiver + iMediaDescriptionCompat;
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 42:
                    iAudioAttributesCompatParcelizer = hasField.RemoteActionCompatParcelizer((List) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    if (iAudioAttributesCompatParcelizer > 0) {
                        if (this.handleMediaPlayPauseIfPendingOnHandler) {
                            unsafe.putInt(t, i, iAudioAttributesCompatParcelizer);
                        }
                        iMediaBrowserCompatSearchResultReceiver = getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(iAudioAttributesImplApi26Parcelizer);
                        iMediaDescriptionCompat = getParameterAnnotations.MediaDescriptionCompat(iAudioAttributesCompatParcelizer);
                        iIconCompatParcelizer = iAudioAttributesCompatParcelizer + iMediaBrowserCompatSearchResultReceiver + iMediaDescriptionCompat;
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 43:
                    iAudioAttributesCompatParcelizer = hasField.AudioAttributesImplApi26Parcelizer((List) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    if (iAudioAttributesCompatParcelizer > 0) {
                        if (this.handleMediaPlayPauseIfPendingOnHandler) {
                            unsafe.putInt(t, i, iAudioAttributesCompatParcelizer);
                        }
                        iMediaBrowserCompatSearchResultReceiver = getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(iAudioAttributesImplApi26Parcelizer);
                        iMediaDescriptionCompat = getParameterAnnotations.MediaDescriptionCompat(iAudioAttributesCompatParcelizer);
                        iIconCompatParcelizer = iAudioAttributesCompatParcelizer + iMediaBrowserCompatSearchResultReceiver + iMediaDescriptionCompat;
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 44:
                    iAudioAttributesCompatParcelizer = hasField.read((List<Integer>) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    if (iAudioAttributesCompatParcelizer > 0) {
                        if (this.handleMediaPlayPauseIfPendingOnHandler) {
                            unsafe.putInt(t, i, iAudioAttributesCompatParcelizer);
                        }
                        iMediaBrowserCompatSearchResultReceiver = getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(iAudioAttributesImplApi26Parcelizer);
                        iMediaDescriptionCompat = getParameterAnnotations.MediaDescriptionCompat(iAudioAttributesCompatParcelizer);
                        iIconCompatParcelizer = iAudioAttributesCompatParcelizer + iMediaBrowserCompatSearchResultReceiver + iMediaDescriptionCompat;
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 45:
                    iAudioAttributesCompatParcelizer = hasField.write((List) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    if (iAudioAttributesCompatParcelizer > 0) {
                        if (this.handleMediaPlayPauseIfPendingOnHandler) {
                            unsafe.putInt(t, i, iAudioAttributesCompatParcelizer);
                        }
                        iMediaBrowserCompatSearchResultReceiver = getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(iAudioAttributesImplApi26Parcelizer);
                        iMediaDescriptionCompat = getParameterAnnotations.MediaDescriptionCompat(iAudioAttributesCompatParcelizer);
                        iIconCompatParcelizer = iAudioAttributesCompatParcelizer + iMediaBrowserCompatSearchResultReceiver + iMediaDescriptionCompat;
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 46:
                    iAudioAttributesCompatParcelizer = hasField.AudioAttributesCompatParcelizer((List<?>) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    if (iAudioAttributesCompatParcelizer > 0) {
                        if (this.handleMediaPlayPauseIfPendingOnHandler) {
                            unsafe.putInt(t, i, iAudioAttributesCompatParcelizer);
                        }
                        iMediaBrowserCompatSearchResultReceiver = getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(iAudioAttributesImplApi26Parcelizer);
                        iMediaDescriptionCompat = getParameterAnnotations.MediaDescriptionCompat(iAudioAttributesCompatParcelizer);
                        iIconCompatParcelizer = iAudioAttributesCompatParcelizer + iMediaBrowserCompatSearchResultReceiver + iMediaDescriptionCompat;
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 47:
                    iAudioAttributesCompatParcelizer = hasField.AudioAttributesImplApi21Parcelizer((List) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    if (iAudioAttributesCompatParcelizer > 0) {
                        if (this.handleMediaPlayPauseIfPendingOnHandler) {
                            unsafe.putInt(t, i, iAudioAttributesCompatParcelizer);
                        }
                        iMediaBrowserCompatSearchResultReceiver = getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(iAudioAttributesImplApi26Parcelizer);
                        iMediaDescriptionCompat = getParameterAnnotations.MediaDescriptionCompat(iAudioAttributesCompatParcelizer);
                        iIconCompatParcelizer = iAudioAttributesCompatParcelizer + iMediaBrowserCompatSearchResultReceiver + iMediaDescriptionCompat;
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 48:
                    iAudioAttributesCompatParcelizer = hasField.MediaBrowserCompatCustomActionResultReceiver((List) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    if (iAudioAttributesCompatParcelizer > 0) {
                        if (this.handleMediaPlayPauseIfPendingOnHandler) {
                            unsafe.putInt(t, i, iAudioAttributesCompatParcelizer);
                        }
                        iMediaBrowserCompatSearchResultReceiver = getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(iAudioAttributesImplApi26Parcelizer);
                        iMediaDescriptionCompat = getParameterAnnotations.MediaDescriptionCompat(iAudioAttributesCompatParcelizer);
                        iIconCompatParcelizer = iAudioAttributesCompatParcelizer + iMediaBrowserCompatSearchResultReceiver + iMediaDescriptionCompat;
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 49:
                    iIconCompatParcelizer = hasField.write(iAudioAttributesImplApi26Parcelizer, (List<constructPropertyCollector>) unsafe.getObject(t, jMediaBrowserCompatItemReceiver), RemoteActionCompatParcelizer(i6));
                    i4 += iIconCompatParcelizer;
                    break;
                case 50:
                    iIconCompatParcelizer = this.MediaMetadataCompat.read(iAudioAttributesImplApi26Parcelizer, unsafe.getObject(t, jMediaBrowserCompatItemReceiver), write(i6));
                    i4 += iIconCompatParcelizer;
                    break;
                case 51:
                    if (IconCompatParcelizer(t, iAudioAttributesImplApi26Parcelizer, i6)) {
                        iIconCompatParcelizer = getParameterAnnotations.IconCompatParcelizer(iAudioAttributesImplApi26Parcelizer);
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 52:
                    if (IconCompatParcelizer(t, iAudioAttributesImplApi26Parcelizer, i6)) {
                        iIconCompatParcelizer = getParameterAnnotations.AudioAttributesImplBaseParcelizer(iAudioAttributesImplApi26Parcelizer);
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 53:
                    if (IconCompatParcelizer(t, iAudioAttributesImplApi26Parcelizer, i6)) {
                        iIconCompatParcelizer = getParameterAnnotations.IconCompatParcelizer(iAudioAttributesImplApi26Parcelizer, MediaMetadataCompat(t, jMediaBrowserCompatItemReceiver));
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 54:
                    if (IconCompatParcelizer(t, iAudioAttributesImplApi26Parcelizer, i6)) {
                        iIconCompatParcelizer = getParameterAnnotations.read(iAudioAttributesImplApi26Parcelizer, MediaMetadataCompat(t, jMediaBrowserCompatItemReceiver));
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 55:
                    if (IconCompatParcelizer(t, iAudioAttributesImplApi26Parcelizer, i6)) {
                        iIconCompatParcelizer = getParameterAnnotations.write(iAudioAttributesImplApi26Parcelizer, MediaBrowserCompatItemReceiver(t, jMediaBrowserCompatItemReceiver));
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 56:
                    if (IconCompatParcelizer(t, iAudioAttributesImplApi26Parcelizer, i6)) {
                        iIconCompatParcelizer = getParameterAnnotations.RemoteActionCompatParcelizer(iAudioAttributesImplApi26Parcelizer);
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 57:
                    if (IconCompatParcelizer(t, iAudioAttributesImplApi26Parcelizer, i6)) {
                        iIconCompatParcelizer = getParameterAnnotations.AudioAttributesCompatParcelizer(iAudioAttributesImplApi26Parcelizer);
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 58:
                    if (IconCompatParcelizer(t, iAudioAttributesImplApi26Parcelizer, i6)) {
                        iIconCompatParcelizer = getParameterAnnotations.read(iAudioAttributesImplApi26Parcelizer);
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 59:
                    if (IconCompatParcelizer(t, iAudioAttributesImplApi26Parcelizer, i6)) {
                        Object object2 = unsafe.getObject(t, jMediaBrowserCompatItemReceiver);
                        if (object2 instanceof AnnotatedWithParams) {
                            iIconCompatParcelizer = getParameterAnnotations.IconCompatParcelizer(iAudioAttributesImplApi26Parcelizer, (AnnotatedWithParams) object2);
                        } else {
                            iIconCompatParcelizer = getParameterAnnotations.AudioAttributesCompatParcelizer(iAudioAttributesImplApi26Parcelizer, (String) object2);
                        }
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 60:
                    if (IconCompatParcelizer(t, iAudioAttributesImplApi26Parcelizer, i6)) {
                        iIconCompatParcelizer = hasField.read(iAudioAttributesImplApi26Parcelizer, unsafe.getObject(t, jMediaBrowserCompatItemReceiver), RemoteActionCompatParcelizer(i6));
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 61:
                    if (IconCompatParcelizer(t, iAudioAttributesImplApi26Parcelizer, i6)) {
                        iIconCompatParcelizer = getParameterAnnotations.IconCompatParcelizer(iAudioAttributesImplApi26Parcelizer, (AnnotatedWithParams) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 62:
                    if (IconCompatParcelizer(t, iAudioAttributesImplApi26Parcelizer, i6)) {
                        iIconCompatParcelizer = getParameterAnnotations.RemoteActionCompatParcelizer(iAudioAttributesImplApi26Parcelizer, MediaBrowserCompatItemReceiver(t, jMediaBrowserCompatItemReceiver));
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 63:
                    if (IconCompatParcelizer(t, iAudioAttributesImplApi26Parcelizer, i6)) {
                        iIconCompatParcelizer = getParameterAnnotations.IconCompatParcelizer(iAudioAttributesImplApi26Parcelizer, MediaBrowserCompatItemReceiver(t, jMediaBrowserCompatItemReceiver));
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 64:
                    if (IconCompatParcelizer(t, iAudioAttributesImplApi26Parcelizer, i6)) {
                        iIconCompatParcelizer = getParameterAnnotations.RatingCompat(iAudioAttributesImplApi26Parcelizer);
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 65:
                    if (IconCompatParcelizer(t, iAudioAttributesImplApi26Parcelizer, i6)) {
                        iIconCompatParcelizer = getParameterAnnotations.MediaMetadataCompat(iAudioAttributesImplApi26Parcelizer);
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 66:
                    if (IconCompatParcelizer(t, iAudioAttributesImplApi26Parcelizer, i6)) {
                        iIconCompatParcelizer = getParameterAnnotations.read(iAudioAttributesImplApi26Parcelizer, MediaBrowserCompatItemReceiver(t, jMediaBrowserCompatItemReceiver));
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 67:
                    if (IconCompatParcelizer(t, iAudioAttributesImplApi26Parcelizer, i6)) {
                        iIconCompatParcelizer = getParameterAnnotations.RemoteActionCompatParcelizer(iAudioAttributesImplApi26Parcelizer, MediaMetadataCompat(t, jMediaBrowserCompatItemReceiver));
                        i4 += iIconCompatParcelizer;
                    }
                    break;
                case 68:
                    if (IconCompatParcelizer(t, iAudioAttributesImplApi26Parcelizer, i6)) {
                        iIconCompatParcelizer = getParameterAnnotations.AudioAttributesCompatParcelizer(iAudioAttributesImplApi26Parcelizer, (constructPropertyCollector) unsafe.getObject(t, jMediaBrowserCompatItemReceiver), RemoteActionCompatParcelizer(i6));
                        i4 += iIconCompatParcelizer;
                    }
                    break;
            }
        }
        int i8 = i4 + read(this.onCustomAction, t);
        return this.AudioAttributesImplBaseParcelizer ? i8 + this.AudioAttributesImplApi26Parcelizer.read(t).RemoteActionCompatParcelizer() : i8;
    }

    private int MediaBrowserCompatCustomActionResultReceiver(T t) {
        int iIconCompatParcelizer;
        int iAudioAttributesCompatParcelizer;
        int iMediaBrowserCompatSearchResultReceiver;
        int iMediaDescriptionCompat;
        Unsafe unsafe = AudioAttributesCompatParcelizer;
        int i = 0;
        for (int i2 = 0; i2 < this.write.length; i2 += 3) {
            int iMediaDescriptionCompat2 = MediaDescriptionCompat(i2);
            int iAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(iMediaDescriptionCompat2);
            int iAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(i2);
            long jMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(iMediaDescriptionCompat2);
            int i3 = (iAudioAttributesImplBaseParcelizer < AnnotationCollectorNCollector.DOUBLE_LIST_PACKED.read() || iAudioAttributesImplBaseParcelizer > AnnotationCollectorNCollector.SINT64_LIST_PACKED.read()) ? 0 : this.write[i2 + 2] & 1048575;
            switch (iAudioAttributesImplBaseParcelizer) {
                case 0:
                    if (IconCompatParcelizer((Object) t, i2)) {
                        iIconCompatParcelizer = getParameterAnnotations.IconCompatParcelizer(iAudioAttributesImplApi26Parcelizer);
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 1:
                    if (IconCompatParcelizer((Object) t, i2)) {
                        iIconCompatParcelizer = getParameterAnnotations.AudioAttributesImplBaseParcelizer(iAudioAttributesImplApi26Parcelizer);
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 2:
                    if (IconCompatParcelizer((Object) t, i2)) {
                        iIconCompatParcelizer = getParameterAnnotations.IconCompatParcelizer(iAudioAttributesImplApi26Parcelizer, ClassIntrospectorMixInResolver.MediaBrowserCompatItemReceiver(t, jMediaBrowserCompatItemReceiver));
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 3:
                    if (IconCompatParcelizer((Object) t, i2)) {
                        iIconCompatParcelizer = getParameterAnnotations.read(iAudioAttributesImplApi26Parcelizer, ClassIntrospectorMixInResolver.MediaBrowserCompatItemReceiver(t, jMediaBrowserCompatItemReceiver));
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 4:
                    if (IconCompatParcelizer((Object) t, i2)) {
                        iIconCompatParcelizer = getParameterAnnotations.write(iAudioAttributesImplApi26Parcelizer, ClassIntrospectorMixInResolver.MediaBrowserCompatCustomActionResultReceiver(t, jMediaBrowserCompatItemReceiver));
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 5:
                    if (IconCompatParcelizer((Object) t, i2)) {
                        iIconCompatParcelizer = getParameterAnnotations.RemoteActionCompatParcelizer(iAudioAttributesImplApi26Parcelizer);
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 6:
                    if (IconCompatParcelizer((Object) t, i2)) {
                        iIconCompatParcelizer = getParameterAnnotations.AudioAttributesCompatParcelizer(iAudioAttributesImplApi26Parcelizer);
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 7:
                    if (IconCompatParcelizer((Object) t, i2)) {
                        iIconCompatParcelizer = getParameterAnnotations.read(iAudioAttributesImplApi26Parcelizer);
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 8:
                    if (IconCompatParcelizer((Object) t, i2)) {
                        Object objAudioAttributesImplApi21Parcelizer = ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t, jMediaBrowserCompatItemReceiver);
                        if (objAudioAttributesImplApi21Parcelizer instanceof AnnotatedWithParams) {
                            iIconCompatParcelizer = getParameterAnnotations.IconCompatParcelizer(iAudioAttributesImplApi26Parcelizer, (AnnotatedWithParams) objAudioAttributesImplApi21Parcelizer);
                        } else {
                            iIconCompatParcelizer = getParameterAnnotations.AudioAttributesCompatParcelizer(iAudioAttributesImplApi26Parcelizer, (String) objAudioAttributesImplApi21Parcelizer);
                        }
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 9:
                    if (IconCompatParcelizer((Object) t, i2)) {
                        iIconCompatParcelizer = hasField.read(iAudioAttributesImplApi26Parcelizer, ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t, jMediaBrowserCompatItemReceiver), RemoteActionCompatParcelizer(i2));
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 10:
                    if (IconCompatParcelizer((Object) t, i2)) {
                        iIconCompatParcelizer = getParameterAnnotations.IconCompatParcelizer(iAudioAttributesImplApi26Parcelizer, (AnnotatedWithParams) ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t, jMediaBrowserCompatItemReceiver));
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 11:
                    if (IconCompatParcelizer((Object) t, i2)) {
                        iIconCompatParcelizer = getParameterAnnotations.RemoteActionCompatParcelizer(iAudioAttributesImplApi26Parcelizer, ClassIntrospectorMixInResolver.MediaBrowserCompatCustomActionResultReceiver(t, jMediaBrowserCompatItemReceiver));
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 12:
                    if (IconCompatParcelizer((Object) t, i2)) {
                        iIconCompatParcelizer = getParameterAnnotations.IconCompatParcelizer(iAudioAttributesImplApi26Parcelizer, ClassIntrospectorMixInResolver.MediaBrowserCompatCustomActionResultReceiver(t, jMediaBrowserCompatItemReceiver));
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 13:
                    if (IconCompatParcelizer((Object) t, i2)) {
                        iIconCompatParcelizer = getParameterAnnotations.RatingCompat(iAudioAttributesImplApi26Parcelizer);
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 14:
                    if (IconCompatParcelizer((Object) t, i2)) {
                        iIconCompatParcelizer = getParameterAnnotations.MediaMetadataCompat(iAudioAttributesImplApi26Parcelizer);
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 15:
                    if (IconCompatParcelizer((Object) t, i2)) {
                        iIconCompatParcelizer = getParameterAnnotations.read(iAudioAttributesImplApi26Parcelizer, ClassIntrospectorMixInResolver.MediaBrowserCompatCustomActionResultReceiver(t, jMediaBrowserCompatItemReceiver));
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 16:
                    if (IconCompatParcelizer((Object) t, i2)) {
                        iIconCompatParcelizer = getParameterAnnotations.RemoteActionCompatParcelizer(iAudioAttributesImplApi26Parcelizer, ClassIntrospectorMixInResolver.MediaBrowserCompatItemReceiver(t, jMediaBrowserCompatItemReceiver));
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 17:
                    if (IconCompatParcelizer((Object) t, i2)) {
                        iIconCompatParcelizer = getParameterAnnotations.AudioAttributesCompatParcelizer(iAudioAttributesImplApi26Parcelizer, (constructPropertyCollector) ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t, jMediaBrowserCompatItemReceiver), RemoteActionCompatParcelizer(i2));
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 18:
                    iIconCompatParcelizer = hasField.RemoteActionCompatParcelizer(iAudioAttributesImplApi26Parcelizer, RemoteActionCompatParcelizer(t, jMediaBrowserCompatItemReceiver));
                    i += iIconCompatParcelizer;
                    break;
                case 19:
                    iIconCompatParcelizer = hasField.write(iAudioAttributesImplApi26Parcelizer, RemoteActionCompatParcelizer(t, jMediaBrowserCompatItemReceiver));
                    i += iIconCompatParcelizer;
                    break;
                case 20:
                    iIconCompatParcelizer = hasField.MediaBrowserCompatItemReceiver(iAudioAttributesImplApi26Parcelizer, RemoteActionCompatParcelizer(t, jMediaBrowserCompatItemReceiver));
                    i += iIconCompatParcelizer;
                    break;
                case 21:
                    iIconCompatParcelizer = hasField.MediaDescriptionCompat(iAudioAttributesImplApi26Parcelizer, RemoteActionCompatParcelizer(t, jMediaBrowserCompatItemReceiver));
                    i += iIconCompatParcelizer;
                    break;
                case 22:
                    iIconCompatParcelizer = hasField.AudioAttributesImplApi21Parcelizer(iAudioAttributesImplApi26Parcelizer, RemoteActionCompatParcelizer(t, jMediaBrowserCompatItemReceiver));
                    i += iIconCompatParcelizer;
                    break;
                case 23:
                    iIconCompatParcelizer = hasField.RemoteActionCompatParcelizer(iAudioAttributesImplApi26Parcelizer, RemoteActionCompatParcelizer(t, jMediaBrowserCompatItemReceiver));
                    i += iIconCompatParcelizer;
                    break;
                case 24:
                    iIconCompatParcelizer = hasField.write(iAudioAttributesImplApi26Parcelizer, RemoteActionCompatParcelizer(t, jMediaBrowserCompatItemReceiver));
                    i += iIconCompatParcelizer;
                    break;
                case 25:
                    iIconCompatParcelizer = hasField.IconCompatParcelizer(iAudioAttributesImplApi26Parcelizer, RemoteActionCompatParcelizer(t, jMediaBrowserCompatItemReceiver));
                    i += iIconCompatParcelizer;
                    break;
                case 26:
                    iIconCompatParcelizer = hasField.AudioAttributesImplBaseParcelizer(iAudioAttributesImplApi26Parcelizer, RemoteActionCompatParcelizer(t, jMediaBrowserCompatItemReceiver));
                    i += iIconCompatParcelizer;
                    break;
                case 27:
                    iIconCompatParcelizer = hasField.read(iAudioAttributesImplApi26Parcelizer, RemoteActionCompatParcelizer(t, jMediaBrowserCompatItemReceiver), RemoteActionCompatParcelizer(i2));
                    i += iIconCompatParcelizer;
                    break;
                case 28:
                    iIconCompatParcelizer = hasField.AudioAttributesCompatParcelizer(iAudioAttributesImplApi26Parcelizer, RemoteActionCompatParcelizer(t, jMediaBrowserCompatItemReceiver));
                    i += iIconCompatParcelizer;
                    break;
                case 29:
                    iIconCompatParcelizer = hasField.MediaBrowserCompatSearchResultReceiver(iAudioAttributesImplApi26Parcelizer, RemoteActionCompatParcelizer(t, jMediaBrowserCompatItemReceiver));
                    i += iIconCompatParcelizer;
                    break;
                case 30:
                    iIconCompatParcelizer = hasField.read(iAudioAttributesImplApi26Parcelizer, (List<Integer>) RemoteActionCompatParcelizer(t, jMediaBrowserCompatItemReceiver));
                    i += iIconCompatParcelizer;
                    break;
                case 31:
                    iIconCompatParcelizer = hasField.write(iAudioAttributesImplApi26Parcelizer, RemoteActionCompatParcelizer(t, jMediaBrowserCompatItemReceiver));
                    i += iIconCompatParcelizer;
                    break;
                case 32:
                    iIconCompatParcelizer = hasField.RemoteActionCompatParcelizer(iAudioAttributesImplApi26Parcelizer, RemoteActionCompatParcelizer(t, jMediaBrowserCompatItemReceiver));
                    i += iIconCompatParcelizer;
                    break;
                case 33:
                    iIconCompatParcelizer = hasField.AudioAttributesImplApi26Parcelizer(iAudioAttributesImplApi26Parcelizer, RemoteActionCompatParcelizer(t, jMediaBrowserCompatItemReceiver));
                    i += iIconCompatParcelizer;
                    break;
                case 34:
                    iIconCompatParcelizer = hasField.MediaBrowserCompatCustomActionResultReceiver(iAudioAttributesImplApi26Parcelizer, RemoteActionCompatParcelizer(t, jMediaBrowserCompatItemReceiver));
                    i += iIconCompatParcelizer;
                    break;
                case 35:
                    iAudioAttributesCompatParcelizer = hasField.AudioAttributesCompatParcelizer((List<?>) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    if (iAudioAttributesCompatParcelizer > 0) {
                        if (this.handleMediaPlayPauseIfPendingOnHandler) {
                            unsafe.putInt(t, i3, iAudioAttributesCompatParcelizer);
                        }
                        iMediaBrowserCompatSearchResultReceiver = getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(iAudioAttributesImplApi26Parcelizer);
                        iMediaDescriptionCompat = getParameterAnnotations.MediaDescriptionCompat(iAudioAttributesCompatParcelizer);
                        iIconCompatParcelizer = iMediaBrowserCompatSearchResultReceiver + iMediaDescriptionCompat + iAudioAttributesCompatParcelizer;
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 36:
                    iAudioAttributesCompatParcelizer = hasField.write((List) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    if (iAudioAttributesCompatParcelizer > 0) {
                        if (this.handleMediaPlayPauseIfPendingOnHandler) {
                            unsafe.putInt(t, i3, iAudioAttributesCompatParcelizer);
                        }
                        iMediaBrowserCompatSearchResultReceiver = getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(iAudioAttributesImplApi26Parcelizer);
                        iMediaDescriptionCompat = getParameterAnnotations.MediaDescriptionCompat(iAudioAttributesCompatParcelizer);
                        iIconCompatParcelizer = iMediaBrowserCompatSearchResultReceiver + iMediaDescriptionCompat + iAudioAttributesCompatParcelizer;
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 37:
                    iAudioAttributesCompatParcelizer = hasField.AudioAttributesImplBaseParcelizer((List) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    if (iAudioAttributesCompatParcelizer > 0) {
                        if (this.handleMediaPlayPauseIfPendingOnHandler) {
                            unsafe.putInt(t, i3, iAudioAttributesCompatParcelizer);
                        }
                        iMediaBrowserCompatSearchResultReceiver = getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(iAudioAttributesImplApi26Parcelizer);
                        iMediaDescriptionCompat = getParameterAnnotations.MediaDescriptionCompat(iAudioAttributesCompatParcelizer);
                        iIconCompatParcelizer = iMediaBrowserCompatSearchResultReceiver + iMediaDescriptionCompat + iAudioAttributesCompatParcelizer;
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 38:
                    iAudioAttributesCompatParcelizer = hasField.MediaBrowserCompatItemReceiver((List) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    if (iAudioAttributesCompatParcelizer > 0) {
                        if (this.handleMediaPlayPauseIfPendingOnHandler) {
                            unsafe.putInt(t, i3, iAudioAttributesCompatParcelizer);
                        }
                        iMediaBrowserCompatSearchResultReceiver = getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(iAudioAttributesImplApi26Parcelizer);
                        iMediaDescriptionCompat = getParameterAnnotations.MediaDescriptionCompat(iAudioAttributesCompatParcelizer);
                        iIconCompatParcelizer = iMediaBrowserCompatSearchResultReceiver + iMediaDescriptionCompat + iAudioAttributesCompatParcelizer;
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 39:
                    iAudioAttributesCompatParcelizer = hasField.IconCompatParcelizer((List) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    if (iAudioAttributesCompatParcelizer > 0) {
                        if (this.handleMediaPlayPauseIfPendingOnHandler) {
                            unsafe.putInt(t, i3, iAudioAttributesCompatParcelizer);
                        }
                        iMediaBrowserCompatSearchResultReceiver = getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(iAudioAttributesImplApi26Parcelizer);
                        iMediaDescriptionCompat = getParameterAnnotations.MediaDescriptionCompat(iAudioAttributesCompatParcelizer);
                        iIconCompatParcelizer = iMediaBrowserCompatSearchResultReceiver + iMediaDescriptionCompat + iAudioAttributesCompatParcelizer;
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 40:
                    iAudioAttributesCompatParcelizer = hasField.AudioAttributesCompatParcelizer((List<?>) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    if (iAudioAttributesCompatParcelizer > 0) {
                        if (this.handleMediaPlayPauseIfPendingOnHandler) {
                            unsafe.putInt(t, i3, iAudioAttributesCompatParcelizer);
                        }
                        iMediaBrowserCompatSearchResultReceiver = getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(iAudioAttributesImplApi26Parcelizer);
                        iMediaDescriptionCompat = getParameterAnnotations.MediaDescriptionCompat(iAudioAttributesCompatParcelizer);
                        iIconCompatParcelizer = iMediaBrowserCompatSearchResultReceiver + iMediaDescriptionCompat + iAudioAttributesCompatParcelizer;
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 41:
                    iAudioAttributesCompatParcelizer = hasField.write((List) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    if (iAudioAttributesCompatParcelizer > 0) {
                        if (this.handleMediaPlayPauseIfPendingOnHandler) {
                            unsafe.putInt(t, i3, iAudioAttributesCompatParcelizer);
                        }
                        iMediaBrowserCompatSearchResultReceiver = getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(iAudioAttributesImplApi26Parcelizer);
                        iMediaDescriptionCompat = getParameterAnnotations.MediaDescriptionCompat(iAudioAttributesCompatParcelizer);
                        iIconCompatParcelizer = iMediaBrowserCompatSearchResultReceiver + iMediaDescriptionCompat + iAudioAttributesCompatParcelizer;
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 42:
                    iAudioAttributesCompatParcelizer = hasField.RemoteActionCompatParcelizer((List) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    if (iAudioAttributesCompatParcelizer > 0) {
                        if (this.handleMediaPlayPauseIfPendingOnHandler) {
                            unsafe.putInt(t, i3, iAudioAttributesCompatParcelizer);
                        }
                        iMediaBrowserCompatSearchResultReceiver = getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(iAudioAttributesImplApi26Parcelizer);
                        iMediaDescriptionCompat = getParameterAnnotations.MediaDescriptionCompat(iAudioAttributesCompatParcelizer);
                        iIconCompatParcelizer = iMediaBrowserCompatSearchResultReceiver + iMediaDescriptionCompat + iAudioAttributesCompatParcelizer;
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 43:
                    iAudioAttributesCompatParcelizer = hasField.AudioAttributesImplApi26Parcelizer((List) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    if (iAudioAttributesCompatParcelizer > 0) {
                        if (this.handleMediaPlayPauseIfPendingOnHandler) {
                            unsafe.putInt(t, i3, iAudioAttributesCompatParcelizer);
                        }
                        iMediaBrowserCompatSearchResultReceiver = getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(iAudioAttributesImplApi26Parcelizer);
                        iMediaDescriptionCompat = getParameterAnnotations.MediaDescriptionCompat(iAudioAttributesCompatParcelizer);
                        iIconCompatParcelizer = iMediaBrowserCompatSearchResultReceiver + iMediaDescriptionCompat + iAudioAttributesCompatParcelizer;
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 44:
                    iAudioAttributesCompatParcelizer = hasField.read((List<Integer>) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    if (iAudioAttributesCompatParcelizer > 0) {
                        if (this.handleMediaPlayPauseIfPendingOnHandler) {
                            unsafe.putInt(t, i3, iAudioAttributesCompatParcelizer);
                        }
                        iMediaBrowserCompatSearchResultReceiver = getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(iAudioAttributesImplApi26Parcelizer);
                        iMediaDescriptionCompat = getParameterAnnotations.MediaDescriptionCompat(iAudioAttributesCompatParcelizer);
                        iIconCompatParcelizer = iMediaBrowserCompatSearchResultReceiver + iMediaDescriptionCompat + iAudioAttributesCompatParcelizer;
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 45:
                    iAudioAttributesCompatParcelizer = hasField.write((List) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    if (iAudioAttributesCompatParcelizer > 0) {
                        if (this.handleMediaPlayPauseIfPendingOnHandler) {
                            unsafe.putInt(t, i3, iAudioAttributesCompatParcelizer);
                        }
                        iMediaBrowserCompatSearchResultReceiver = getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(iAudioAttributesImplApi26Parcelizer);
                        iMediaDescriptionCompat = getParameterAnnotations.MediaDescriptionCompat(iAudioAttributesCompatParcelizer);
                        iIconCompatParcelizer = iMediaBrowserCompatSearchResultReceiver + iMediaDescriptionCompat + iAudioAttributesCompatParcelizer;
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 46:
                    iAudioAttributesCompatParcelizer = hasField.AudioAttributesCompatParcelizer((List<?>) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    if (iAudioAttributesCompatParcelizer > 0) {
                        if (this.handleMediaPlayPauseIfPendingOnHandler) {
                            unsafe.putInt(t, i3, iAudioAttributesCompatParcelizer);
                        }
                        iMediaBrowserCompatSearchResultReceiver = getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(iAudioAttributesImplApi26Parcelizer);
                        iMediaDescriptionCompat = getParameterAnnotations.MediaDescriptionCompat(iAudioAttributesCompatParcelizer);
                        iIconCompatParcelizer = iMediaBrowserCompatSearchResultReceiver + iMediaDescriptionCompat + iAudioAttributesCompatParcelizer;
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 47:
                    iAudioAttributesCompatParcelizer = hasField.AudioAttributesImplApi21Parcelizer((List) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    if (iAudioAttributesCompatParcelizer > 0) {
                        if (this.handleMediaPlayPauseIfPendingOnHandler) {
                            unsafe.putInt(t, i3, iAudioAttributesCompatParcelizer);
                        }
                        iMediaBrowserCompatSearchResultReceiver = getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(iAudioAttributesImplApi26Parcelizer);
                        iMediaDescriptionCompat = getParameterAnnotations.MediaDescriptionCompat(iAudioAttributesCompatParcelizer);
                        iIconCompatParcelizer = iMediaBrowserCompatSearchResultReceiver + iMediaDescriptionCompat + iAudioAttributesCompatParcelizer;
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 48:
                    iAudioAttributesCompatParcelizer = hasField.MediaBrowserCompatCustomActionResultReceiver((List) unsafe.getObject(t, jMediaBrowserCompatItemReceiver));
                    if (iAudioAttributesCompatParcelizer > 0) {
                        if (this.handleMediaPlayPauseIfPendingOnHandler) {
                            unsafe.putInt(t, i3, iAudioAttributesCompatParcelizer);
                        }
                        iMediaBrowserCompatSearchResultReceiver = getParameterAnnotations.MediaBrowserCompatSearchResultReceiver(iAudioAttributesImplApi26Parcelizer);
                        iMediaDescriptionCompat = getParameterAnnotations.MediaDescriptionCompat(iAudioAttributesCompatParcelizer);
                        iIconCompatParcelizer = iMediaBrowserCompatSearchResultReceiver + iMediaDescriptionCompat + iAudioAttributesCompatParcelizer;
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 49:
                    iIconCompatParcelizer = hasField.write(iAudioAttributesImplApi26Parcelizer, (List<constructPropertyCollector>) RemoteActionCompatParcelizer(t, jMediaBrowserCompatItemReceiver), RemoteActionCompatParcelizer(i2));
                    i += iIconCompatParcelizer;
                    break;
                case 50:
                    iIconCompatParcelizer = this.MediaMetadataCompat.read(iAudioAttributesImplApi26Parcelizer, ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t, jMediaBrowserCompatItemReceiver), write(i2));
                    i += iIconCompatParcelizer;
                    break;
                case 51:
                    if (IconCompatParcelizer(t, iAudioAttributesImplApi26Parcelizer, i2)) {
                        iIconCompatParcelizer = getParameterAnnotations.IconCompatParcelizer(iAudioAttributesImplApi26Parcelizer);
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 52:
                    if (IconCompatParcelizer(t, iAudioAttributesImplApi26Parcelizer, i2)) {
                        iIconCompatParcelizer = getParameterAnnotations.AudioAttributesImplBaseParcelizer(iAudioAttributesImplApi26Parcelizer);
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 53:
                    if (IconCompatParcelizer(t, iAudioAttributesImplApi26Parcelizer, i2)) {
                        iIconCompatParcelizer = getParameterAnnotations.IconCompatParcelizer(iAudioAttributesImplApi26Parcelizer, MediaMetadataCompat(t, jMediaBrowserCompatItemReceiver));
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 54:
                    if (IconCompatParcelizer(t, iAudioAttributesImplApi26Parcelizer, i2)) {
                        iIconCompatParcelizer = getParameterAnnotations.read(iAudioAttributesImplApi26Parcelizer, MediaMetadataCompat(t, jMediaBrowserCompatItemReceiver));
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 55:
                    if (IconCompatParcelizer(t, iAudioAttributesImplApi26Parcelizer, i2)) {
                        iIconCompatParcelizer = getParameterAnnotations.write(iAudioAttributesImplApi26Parcelizer, MediaBrowserCompatItemReceiver(t, jMediaBrowserCompatItemReceiver));
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 56:
                    if (IconCompatParcelizer(t, iAudioAttributesImplApi26Parcelizer, i2)) {
                        iIconCompatParcelizer = getParameterAnnotations.RemoteActionCompatParcelizer(iAudioAttributesImplApi26Parcelizer);
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 57:
                    if (IconCompatParcelizer(t, iAudioAttributesImplApi26Parcelizer, i2)) {
                        iIconCompatParcelizer = getParameterAnnotations.AudioAttributesCompatParcelizer(iAudioAttributesImplApi26Parcelizer);
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 58:
                    if (IconCompatParcelizer(t, iAudioAttributesImplApi26Parcelizer, i2)) {
                        iIconCompatParcelizer = getParameterAnnotations.read(iAudioAttributesImplApi26Parcelizer);
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 59:
                    if (IconCompatParcelizer(t, iAudioAttributesImplApi26Parcelizer, i2)) {
                        Object objAudioAttributesImplApi21Parcelizer2 = ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t, jMediaBrowserCompatItemReceiver);
                        if (objAudioAttributesImplApi21Parcelizer2 instanceof AnnotatedWithParams) {
                            iIconCompatParcelizer = getParameterAnnotations.IconCompatParcelizer(iAudioAttributesImplApi26Parcelizer, (AnnotatedWithParams) objAudioAttributesImplApi21Parcelizer2);
                        } else {
                            iIconCompatParcelizer = getParameterAnnotations.AudioAttributesCompatParcelizer(iAudioAttributesImplApi26Parcelizer, (String) objAudioAttributesImplApi21Parcelizer2);
                        }
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 60:
                    if (IconCompatParcelizer(t, iAudioAttributesImplApi26Parcelizer, i2)) {
                        iIconCompatParcelizer = hasField.read(iAudioAttributesImplApi26Parcelizer, ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t, jMediaBrowserCompatItemReceiver), RemoteActionCompatParcelizer(i2));
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 61:
                    if (IconCompatParcelizer(t, iAudioAttributesImplApi26Parcelizer, i2)) {
                        iIconCompatParcelizer = getParameterAnnotations.IconCompatParcelizer(iAudioAttributesImplApi26Parcelizer, (AnnotatedWithParams) ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t, jMediaBrowserCompatItemReceiver));
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 62:
                    if (IconCompatParcelizer(t, iAudioAttributesImplApi26Parcelizer, i2)) {
                        iIconCompatParcelizer = getParameterAnnotations.RemoteActionCompatParcelizer(iAudioAttributesImplApi26Parcelizer, MediaBrowserCompatItemReceiver(t, jMediaBrowserCompatItemReceiver));
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 63:
                    if (IconCompatParcelizer(t, iAudioAttributesImplApi26Parcelizer, i2)) {
                        iIconCompatParcelizer = getParameterAnnotations.IconCompatParcelizer(iAudioAttributesImplApi26Parcelizer, MediaBrowserCompatItemReceiver(t, jMediaBrowserCompatItemReceiver));
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 64:
                    if (IconCompatParcelizer(t, iAudioAttributesImplApi26Parcelizer, i2)) {
                        iIconCompatParcelizer = getParameterAnnotations.RatingCompat(iAudioAttributesImplApi26Parcelizer);
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 65:
                    if (IconCompatParcelizer(t, iAudioAttributesImplApi26Parcelizer, i2)) {
                        iIconCompatParcelizer = getParameterAnnotations.MediaMetadataCompat(iAudioAttributesImplApi26Parcelizer);
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 66:
                    if (IconCompatParcelizer(t, iAudioAttributesImplApi26Parcelizer, i2)) {
                        iIconCompatParcelizer = getParameterAnnotations.read(iAudioAttributesImplApi26Parcelizer, MediaBrowserCompatItemReceiver(t, jMediaBrowserCompatItemReceiver));
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 67:
                    if (IconCompatParcelizer(t, iAudioAttributesImplApi26Parcelizer, i2)) {
                        iIconCompatParcelizer = getParameterAnnotations.RemoteActionCompatParcelizer(iAudioAttributesImplApi26Parcelizer, MediaMetadataCompat(t, jMediaBrowserCompatItemReceiver));
                        i += iIconCompatParcelizer;
                    }
                    break;
                case 68:
                    if (IconCompatParcelizer(t, iAudioAttributesImplApi26Parcelizer, i2)) {
                        iIconCompatParcelizer = getParameterAnnotations.AudioAttributesCompatParcelizer(iAudioAttributesImplApi26Parcelizer, (constructPropertyCollector) ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t, jMediaBrowserCompatItemReceiver), RemoteActionCompatParcelizer(i2));
                        i += iIconCompatParcelizer;
                    }
                    break;
            }
        }
        return i + read(this.onCustomAction, t);
    }

    private static <UT, UB> int read(hasName<UT, UB> hasname, T t) {
        return hasname.read(hasname.RemoteActionCompatParcelizer(t));
    }

    private static List<?> RemoteActionCompatParcelizer(Object obj, long j) {
        return (List) ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(obj, j);
    }

    @Override // kotlin.getPrimaryMember
    public final void AudioAttributesCompatParcelizer(T t, CollectorBase collectorBase) throws IOException {
        if (collectorBase.write() == CollectorBase.IconCompatParcelizer.DESCENDING) {
            read(t, collectorBase);
        } else if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            RemoteActionCompatParcelizer((Object) t, collectorBase);
        } else {
            write(t, collectorBase);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void write(T r18, kotlin.CollectorBase r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.couldSerialize.write(java.lang.Object, o.CollectorBase):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void RemoteActionCompatParcelizer(T r13, kotlin.CollectorBase r14) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.couldSerialize.RemoteActionCompatParcelizer(java.lang.Object, o.CollectorBase):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void read(T r11, kotlin.CollectorBase r12) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.couldSerialize.read(java.lang.Object, o.CollectorBase):void");
    }

    private <K, V> void IconCompatParcelizer(CollectorBase collectorBase, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            collectorBase.write(i, this.MediaMetadataCompat.write(write(i2)), this.MediaMetadataCompat.IconCompatParcelizer(obj));
        }
    }

    private static <UT, UB> void IconCompatParcelizer(hasName<UT, UB> hasname, T t, CollectorBase collectorBase) throws IOException {
        hasname.read(hasname.RemoteActionCompatParcelizer(t), collectorBase);
    }

    @Override // kotlin.getPrimaryMember
    public final void AudioAttributesCompatParcelizer(T t, getGetter getgetter, asAnnotations asannotations) throws IOException {
        read(this.onCustomAction, this.AudioAttributesImplApi26Parcelizer, t, getgetter, asannotations);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends isPresent.read<ET>> void read(hasName<UT, UB> hasname, emptyAnnotations<ET> emptyannotations, T t, getGetter getgetter, asAnnotations asannotations) throws IOException {
        Object objIconCompatParcelizer;
        Object objWrite = null;
        Object objRemoteActionCompatParcelizer = null;
        while (true) {
            try {
                int iIconCompatParcelizer = getgetter.IconCompatParcelizer();
                int iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(iIconCompatParcelizer);
                if (iAudioAttributesImplApi21Parcelizer >= 0) {
                    int iMediaDescriptionCompat = MediaDescriptionCompat(iAudioAttributesImplApi21Parcelizer);
                    try {
                    } catch (_add.RemoteActionCompatParcelizer unused) {
                        if (objWrite == null) {
                            objWrite = hasname.IconCompatParcelizer(t);
                        }
                        if (!hasname.RemoteActionCompatParcelizer(objWrite, getgetter)) {
                            for (int i = this.read; i < this.onAddQueueItem; i++) {
                                objWrite = write(t, this.AudioAttributesImplApi21Parcelizer[i], objWrite, hasname);
                            }
                            if (objWrite == null) {
                                return;
                            }
                            hasname.AudioAttributesCompatParcelizer(t, objWrite);
                            return;
                        }
                    }
                    switch (AudioAttributesImplBaseParcelizer(iMediaDescriptionCompat)) {
                        case 0:
                            ClassIntrospectorMixInResolver.read(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat), getgetter.RemoteActionCompatParcelizer());
                            AudioAttributesCompatParcelizer((Object) t, iAudioAttributesImplApi21Parcelizer);
                            break;
                        case 1:
                            ClassIntrospectorMixInResolver.write(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat), getgetter.MediaBrowserCompatItemReceiver());
                            AudioAttributesCompatParcelizer((Object) t, iAudioAttributesImplApi21Parcelizer);
                            break;
                        case 2:
                            ClassIntrospectorMixInResolver.read((Object) t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat), getgetter.MediaBrowserCompatMediaItem());
                            AudioAttributesCompatParcelizer((Object) t, iAudioAttributesImplApi21Parcelizer);
                            break;
                        case 3:
                            ClassIntrospectorMixInResolver.read((Object) t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat), getgetter.handleMediaPlayPauseIfPendingOnHandler());
                            AudioAttributesCompatParcelizer((Object) t, iAudioAttributesImplApi21Parcelizer);
                            break;
                        case 4:
                            ClassIntrospectorMixInResolver.write((Object) t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat), getgetter.AudioAttributesImplApi26Parcelizer());
                            AudioAttributesCompatParcelizer((Object) t, iAudioAttributesImplApi21Parcelizer);
                            break;
                        case 5:
                            ClassIntrospectorMixInResolver.read((Object) t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat), getgetter.MediaBrowserCompatCustomActionResultReceiver());
                            AudioAttributesCompatParcelizer((Object) t, iAudioAttributesImplApi21Parcelizer);
                            break;
                        case 6:
                            ClassIntrospectorMixInResolver.write((Object) t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat), getgetter.AudioAttributesImplBaseParcelizer());
                            AudioAttributesCompatParcelizer((Object) t, iAudioAttributesImplApi21Parcelizer);
                            break;
                        case 7:
                            ClassIntrospectorMixInResolver.RemoteActionCompatParcelizer(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat), getgetter.write());
                            AudioAttributesCompatParcelizer((Object) t, iAudioAttributesImplApi21Parcelizer);
                            break;
                        case 8:
                            RemoteActionCompatParcelizer(t, iMediaDescriptionCompat, getgetter);
                            AudioAttributesCompatParcelizer((Object) t, iAudioAttributesImplApi21Parcelizer);
                            break;
                        case 9:
                            if (IconCompatParcelizer((Object) t, iAudioAttributesImplApi21Parcelizer)) {
                                ClassIntrospectorMixInResolver.read(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat), forDeserialization.RemoteActionCompatParcelizer(ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat)), getgetter.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(iAudioAttributesImplApi21Parcelizer), asannotations)));
                            } else {
                                ClassIntrospectorMixInResolver.read(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat), getgetter.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(iAudioAttributesImplApi21Parcelizer), asannotations));
                                AudioAttributesCompatParcelizer((Object) t, iAudioAttributesImplApi21Parcelizer);
                            }
                            break;
                        case 10:
                            ClassIntrospectorMixInResolver.read(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat), getgetter.AudioAttributesCompatParcelizer());
                            AudioAttributesCompatParcelizer((Object) t, iAudioAttributesImplApi21Parcelizer);
                            break;
                        case 11:
                            ClassIntrospectorMixInResolver.write((Object) t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat), getgetter.onAddQueueItem());
                            AudioAttributesCompatParcelizer((Object) t, iAudioAttributesImplApi21Parcelizer);
                            break;
                        case 12:
                            int iAudioAttributesImplApi21Parcelizer2 = getgetter.AudioAttributesImplApi21Parcelizer();
                            forDeserialization.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerIconCompatParcelizer = IconCompatParcelizer(iAudioAttributesImplApi21Parcelizer);
                            if (audioAttributesCompatParcelizerIconCompatParcelizer == null || audioAttributesCompatParcelizerIconCompatParcelizer.AudioAttributesCompatParcelizer()) {
                                ClassIntrospectorMixInResolver.write((Object) t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat), iAudioAttributesImplApi21Parcelizer2);
                                AudioAttributesCompatParcelizer((Object) t, iAudioAttributesImplApi21Parcelizer);
                            } else {
                                objWrite = hasField.AudioAttributesCompatParcelizer(iIconCompatParcelizer, iAudioAttributesImplApi21Parcelizer2, objWrite, hasname);
                            }
                            break;
                        case 13:
                            ClassIntrospectorMixInResolver.write((Object) t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat), getgetter.MediaDescriptionCompat());
                            AudioAttributesCompatParcelizer((Object) t, iAudioAttributesImplApi21Parcelizer);
                            break;
                        case 14:
                            ClassIntrospectorMixInResolver.read((Object) t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat), getgetter.MediaMetadataCompat());
                            AudioAttributesCompatParcelizer((Object) t, iAudioAttributesImplApi21Parcelizer);
                            break;
                        case 15:
                            ClassIntrospectorMixInResolver.write((Object) t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat), getgetter.RatingCompat());
                            AudioAttributesCompatParcelizer((Object) t, iAudioAttributesImplApi21Parcelizer);
                            break;
                        case 16:
                            ClassIntrospectorMixInResolver.read((Object) t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat), getgetter.MediaBrowserCompatSearchResultReceiver());
                            AudioAttributesCompatParcelizer((Object) t, iAudioAttributesImplApi21Parcelizer);
                            break;
                        case 17:
                            if (IconCompatParcelizer((Object) t, iAudioAttributesImplApi21Parcelizer)) {
                                ClassIntrospectorMixInResolver.read(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat), forDeserialization.RemoteActionCompatParcelizer(ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat)), getgetter.read(RemoteActionCompatParcelizer(iAudioAttributesImplApi21Parcelizer), asannotations)));
                            } else {
                                ClassIntrospectorMixInResolver.read(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat), getgetter.read(RemoteActionCompatParcelizer(iAudioAttributesImplApi21Parcelizer), asannotations));
                                AudioAttributesCompatParcelizer((Object) t, iAudioAttributesImplApi21Parcelizer);
                            }
                            break;
                        case 18:
                            getgetter.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat)));
                            break;
                        case 19:
                            getgetter.AudioAttributesImplApi26Parcelizer(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat)));
                            break;
                        case 20:
                            getgetter.AudioAttributesImplBaseParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat)));
                            break;
                        case 21:
                            getgetter.onCommand(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat)));
                            break;
                        case 22:
                            getgetter.MediaBrowserCompatItemReceiver(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat)));
                            break;
                        case 23:
                            getgetter.AudioAttributesImplApi21Parcelizer(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat)));
                            break;
                        case 24:
                            getgetter.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat)));
                            break;
                        case 25:
                            getgetter.write(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat)));
                            break;
                        case 26:
                            AudioAttributesCompatParcelizer(t, iMediaDescriptionCompat, getgetter);
                            break;
                        case 27:
                            read(t, iMediaDescriptionCompat, getgetter, RemoteActionCompatParcelizer(iAudioAttributesImplApi21Parcelizer), asannotations);
                            break;
                        case 28:
                            getgetter.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat)));
                            break;
                        case 29:
                            getgetter.handleMediaPlayPauseIfPendingOnHandler(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat)));
                            break;
                        case 30:
                            List<Integer> listIconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat));
                            getgetter.read(listIconCompatParcelizer);
                            objIconCompatParcelizer = hasField.IconCompatParcelizer(iIconCompatParcelizer, listIconCompatParcelizer, IconCompatParcelizer(iAudioAttributesImplApi21Parcelizer), objWrite, hasname);
                            objWrite = objIconCompatParcelizer;
                            break;
                        case 31:
                            getgetter.MediaBrowserCompatCustomActionResultReceiver(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat)));
                            break;
                        case 32:
                            getgetter.MediaMetadataCompat(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat)));
                            break;
                        case 33:
                            getgetter.MediaDescriptionCompat(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat)));
                            break;
                        case 34:
                            getgetter.MediaBrowserCompatSearchResultReceiver(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat)));
                            break;
                        case 35:
                            getgetter.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat)));
                            break;
                        case 36:
                            getgetter.AudioAttributesImplApi26Parcelizer(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat)));
                            break;
                        case 37:
                            getgetter.AudioAttributesImplBaseParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat)));
                            break;
                        case 38:
                            getgetter.onCommand(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat)));
                            break;
                        case 39:
                            getgetter.MediaBrowserCompatItemReceiver(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat)));
                            break;
                        case 40:
                            getgetter.AudioAttributesImplApi21Parcelizer(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat)));
                            break;
                        case 41:
                            getgetter.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat)));
                            break;
                        case 42:
                            getgetter.write(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat)));
                            break;
                        case 43:
                            getgetter.handleMediaPlayPauseIfPendingOnHandler(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat)));
                            break;
                        case 44:
                            List<Integer> listIconCompatParcelizer2 = this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat));
                            getgetter.read(listIconCompatParcelizer2);
                            objIconCompatParcelizer = hasField.IconCompatParcelizer(iIconCompatParcelizer, listIconCompatParcelizer2, IconCompatParcelizer(iAudioAttributesImplApi21Parcelizer), objWrite, hasname);
                            objWrite = objIconCompatParcelizer;
                            break;
                        case 45:
                            getgetter.MediaBrowserCompatCustomActionResultReceiver(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat)));
                            break;
                        case 46:
                            getgetter.MediaMetadataCompat(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat)));
                            break;
                        case 47:
                            getgetter.MediaDescriptionCompat(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat)));
                            break;
                        case 48:
                            getgetter.MediaBrowserCompatSearchResultReceiver(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat)));
                            break;
                        case 49:
                            RemoteActionCompatParcelizer(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat), getgetter, RemoteActionCompatParcelizer(iAudioAttributesImplApi21Parcelizer), asannotations);
                            break;
                        case 50:
                            read(t, iAudioAttributesImplApi21Parcelizer, write(iAudioAttributesImplApi21Parcelizer), asannotations, getgetter);
                            break;
                        case 51:
                            ClassIntrospectorMixInResolver.read(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat), Double.valueOf(getgetter.RemoteActionCompatParcelizer()));
                            read(t, iIconCompatParcelizer, iAudioAttributesImplApi21Parcelizer);
                            break;
                        case 52:
                            ClassIntrospectorMixInResolver.read(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat), Float.valueOf(getgetter.MediaBrowserCompatItemReceiver()));
                            read(t, iIconCompatParcelizer, iAudioAttributesImplApi21Parcelizer);
                            break;
                        case 53:
                            ClassIntrospectorMixInResolver.read(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat), Long.valueOf(getgetter.MediaBrowserCompatMediaItem()));
                            read(t, iIconCompatParcelizer, iAudioAttributesImplApi21Parcelizer);
                            break;
                        case 54:
                            ClassIntrospectorMixInResolver.read(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat), Long.valueOf(getgetter.handleMediaPlayPauseIfPendingOnHandler()));
                            read(t, iIconCompatParcelizer, iAudioAttributesImplApi21Parcelizer);
                            break;
                        case 55:
                            ClassIntrospectorMixInResolver.read(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat), Integer.valueOf(getgetter.AudioAttributesImplApi26Parcelizer()));
                            read(t, iIconCompatParcelizer, iAudioAttributesImplApi21Parcelizer);
                            break;
                        case 56:
                            ClassIntrospectorMixInResolver.read(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat), Long.valueOf(getgetter.MediaBrowserCompatCustomActionResultReceiver()));
                            read(t, iIconCompatParcelizer, iAudioAttributesImplApi21Parcelizer);
                            break;
                        case 57:
                            ClassIntrospectorMixInResolver.read(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat), Integer.valueOf(getgetter.AudioAttributesImplBaseParcelizer()));
                            read(t, iIconCompatParcelizer, iAudioAttributesImplApi21Parcelizer);
                            break;
                        case 58:
                            ClassIntrospectorMixInResolver.read(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat), Boolean.valueOf(getgetter.write()));
                            read(t, iIconCompatParcelizer, iAudioAttributesImplApi21Parcelizer);
                            break;
                        case 59:
                            RemoteActionCompatParcelizer(t, iMediaDescriptionCompat, getgetter);
                            read(t, iIconCompatParcelizer, iAudioAttributesImplApi21Parcelizer);
                            break;
                        case 60:
                            if (IconCompatParcelizer(t, iIconCompatParcelizer, iAudioAttributesImplApi21Parcelizer)) {
                                ClassIntrospectorMixInResolver.read(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat), forDeserialization.RemoteActionCompatParcelizer(ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat)), getgetter.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(iAudioAttributesImplApi21Parcelizer), asannotations)));
                            } else {
                                ClassIntrospectorMixInResolver.read(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat), getgetter.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(iAudioAttributesImplApi21Parcelizer), asannotations));
                                AudioAttributesCompatParcelizer((Object) t, iAudioAttributesImplApi21Parcelizer);
                            }
                            read(t, iIconCompatParcelizer, iAudioAttributesImplApi21Parcelizer);
                            break;
                        case 61:
                            ClassIntrospectorMixInResolver.read(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat), getgetter.AudioAttributesCompatParcelizer());
                            read(t, iIconCompatParcelizer, iAudioAttributesImplApi21Parcelizer);
                            break;
                        case 62:
                            ClassIntrospectorMixInResolver.read(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat), Integer.valueOf(getgetter.onAddQueueItem()));
                            read(t, iIconCompatParcelizer, iAudioAttributesImplApi21Parcelizer);
                            break;
                        case 63:
                            int iAudioAttributesImplApi21Parcelizer3 = getgetter.AudioAttributesImplApi21Parcelizer();
                            forDeserialization.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerIconCompatParcelizer2 = IconCompatParcelizer(iAudioAttributesImplApi21Parcelizer);
                            if (audioAttributesCompatParcelizerIconCompatParcelizer2 == null || audioAttributesCompatParcelizerIconCompatParcelizer2.AudioAttributesCompatParcelizer()) {
                                ClassIntrospectorMixInResolver.read(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat), Integer.valueOf(iAudioAttributesImplApi21Parcelizer3));
                                read(t, iIconCompatParcelizer, iAudioAttributesImplApi21Parcelizer);
                            } else {
                                objWrite = hasField.AudioAttributesCompatParcelizer(iIconCompatParcelizer, iAudioAttributesImplApi21Parcelizer3, objWrite, hasname);
                            }
                            break;
                        case 64:
                            ClassIntrospectorMixInResolver.read(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat), Integer.valueOf(getgetter.MediaDescriptionCompat()));
                            read(t, iIconCompatParcelizer, iAudioAttributesImplApi21Parcelizer);
                            break;
                        case 65:
                            ClassIntrospectorMixInResolver.read(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat), Long.valueOf(getgetter.MediaMetadataCompat()));
                            read(t, iIconCompatParcelizer, iAudioAttributesImplApi21Parcelizer);
                            break;
                        case 66:
                            ClassIntrospectorMixInResolver.read(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat), Integer.valueOf(getgetter.RatingCompat()));
                            read(t, iIconCompatParcelizer, iAudioAttributesImplApi21Parcelizer);
                            break;
                        case 67:
                            ClassIntrospectorMixInResolver.read(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat), Long.valueOf(getgetter.MediaBrowserCompatSearchResultReceiver()));
                            read(t, iIconCompatParcelizer, iAudioAttributesImplApi21Parcelizer);
                            break;
                        case 68:
                            ClassIntrospectorMixInResolver.read(t, MediaBrowserCompatItemReceiver(iMediaDescriptionCompat), getgetter.read(RemoteActionCompatParcelizer(iAudioAttributesImplApi21Parcelizer), asannotations));
                            read(t, iIconCompatParcelizer, iAudioAttributesImplApi21Parcelizer);
                            break;
                        default:
                            if (objWrite == null) {
                                objWrite = hasname.RemoteActionCompatParcelizer();
                            }
                            if (!hasname.RemoteActionCompatParcelizer(objWrite, getgetter)) {
                                for (int i2 = this.read; i2 < this.onAddQueueItem; i2++) {
                                    objWrite = write(t, this.AudioAttributesImplApi21Parcelizer[i2], objWrite, hasname);
                                }
                                if (objWrite == null) {
                                    return;
                                }
                            }
                            break;
                    }
                } else if (iIconCompatParcelizer == Integer.MAX_VALUE) {
                    for (int i3 = this.read; i3 < this.onAddQueueItem; i3++) {
                        objWrite = write(t, this.AudioAttributesImplApi21Parcelizer[i3], objWrite, hasname);
                    }
                    if (objWrite == null) {
                        return;
                    }
                } else {
                    Object objIconCompatParcelizer2 = !this.AudioAttributesImplBaseParcelizer ? null : emptyannotations.IconCompatParcelizer(asannotations, this.IconCompatParcelizer, iIconCompatParcelizer);
                    if (objIconCompatParcelizer2 != null) {
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = emptyannotations.RemoteActionCompatParcelizer(t);
                        }
                        objWrite = emptyannotations.AudioAttributesCompatParcelizer(getgetter, objIconCompatParcelizer2, asannotations, objRemoteActionCompatParcelizer, objWrite, hasname);
                    } else {
                        if (objWrite == null) {
                            objWrite = hasname.IconCompatParcelizer(t);
                        }
                        if (!hasname.RemoteActionCompatParcelizer(objWrite, getgetter)) {
                            for (int i4 = this.read; i4 < this.onAddQueueItem; i4++) {
                                objWrite = write(t, this.AudioAttributesImplApi21Parcelizer[i4], objWrite, hasname);
                            }
                            if (objWrite == null) {
                                return;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i5 = this.read; i5 < this.onAddQueueItem; i5++) {
                    objWrite = write(t, this.AudioAttributesImplApi21Parcelizer[i5], objWrite, hasname);
                }
                if (objWrite != null) {
                    hasname.AudioAttributesCompatParcelizer(t, objWrite);
                }
                throw th;
            }
        }
    }

    private getPrimaryMember RemoteActionCompatParcelizer(int i) {
        int i2 = (i / 3) << 1;
        getPrimaryMember getprimarymember = (getPrimaryMember) this.MediaBrowserCompatSearchResultReceiver[i2];
        if (getprimarymember != null) {
            return getprimarymember;
        }
        getPrimaryMember<T> getprimarymember2 = getAccessor.IconCompatParcelizer().read((Class) this.MediaBrowserCompatSearchResultReceiver[i2 + 1]);
        this.MediaBrowserCompatSearchResultReceiver[i2] = getprimarymember2;
        return getprimarymember2;
    }

    private Object write(int i) {
        return this.MediaBrowserCompatSearchResultReceiver[(i / 3) << 1];
    }

    private forDeserialization.AudioAttributesCompatParcelizer IconCompatParcelizer(int i) {
        return (forDeserialization.AudioAttributesCompatParcelizer) this.MediaBrowserCompatSearchResultReceiver[((i / 3) << 1) + 1];
    }

    @Override // kotlin.getPrimaryMember
    public final void RemoteActionCompatParcelizer(T t) {
        int i;
        int i2 = this.read;
        while (true) {
            i = this.onAddQueueItem;
            if (i2 >= i) {
                break;
            }
            long jMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(MediaDescriptionCompat(this.AudioAttributesImplApi21Parcelizer[i2]));
            Object objAudioAttributesImplApi21Parcelizer = ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t, jMediaBrowserCompatItemReceiver);
            if (objAudioAttributesImplApi21Parcelizer != null) {
                ClassIntrospectorMixInResolver.read(t, jMediaBrowserCompatItemReceiver, this.MediaMetadataCompat.read(objAudioAttributesImplApi21Parcelizer));
            }
            i2++;
        }
        int length = this.AudioAttributesImplApi21Parcelizer.length;
        while (i < length) {
            this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(t, this.AudioAttributesImplApi21Parcelizer[i]);
            i++;
        }
        this.onCustomAction.write(t);
        if (this.AudioAttributesImplBaseParcelizer) {
            this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(t);
        }
    }

    private final <K, V> void read(Object obj, int i, Object obj2, asAnnotations asannotations, getGetter getgetter) throws IOException {
        long jMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(MediaDescriptionCompat(i));
        Object objAudioAttributesImplApi21Parcelizer = ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(obj, jMediaBrowserCompatItemReceiver);
        if (objAudioAttributesImplApi21Parcelizer == null) {
            objAudioAttributesImplApi21Parcelizer = this.MediaMetadataCompat.IconCompatParcelizer();
            ClassIntrospectorMixInResolver.read(obj, jMediaBrowserCompatItemReceiver, objAudioAttributesImplApi21Parcelizer);
        } else if (this.MediaMetadataCompat.AudioAttributesCompatParcelizer(objAudioAttributesImplApi21Parcelizer)) {
            Object objIconCompatParcelizer = this.MediaMetadataCompat.IconCompatParcelizer();
            this.MediaMetadataCompat.RemoteActionCompatParcelizer(objIconCompatParcelizer, objAudioAttributesImplApi21Parcelizer);
            ClassIntrospectorMixInResolver.read(obj, jMediaBrowserCompatItemReceiver, objIconCompatParcelizer);
            objAudioAttributesImplApi21Parcelizer = objIconCompatParcelizer;
        }
        getgetter.write(this.MediaMetadataCompat.RemoteActionCompatParcelizer(objAudioAttributesImplApi21Parcelizer), this.MediaMetadataCompat.write(obj2), asannotations);
    }

    private final <UT, UB> UB write(Object obj, int i, UB ub, hasName<UT, UB> hasname) {
        forDeserialization.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerIconCompatParcelizer;
        int iAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(i);
        Object objAudioAttributesImplApi21Parcelizer = ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(obj, MediaBrowserCompatItemReceiver(MediaDescriptionCompat(i)));
        return (objAudioAttributesImplApi21Parcelizer == null || (audioAttributesCompatParcelizerIconCompatParcelizer = IconCompatParcelizer(i)) == null) ? ub : (UB) RemoteActionCompatParcelizer(i, iAudioAttributesImplApi26Parcelizer, this.MediaMetadataCompat.RemoteActionCompatParcelizer(objAudioAttributesImplApi21Parcelizer), audioAttributesCompatParcelizerIconCompatParcelizer, ub, hasname);
    }

    private final <K, V, UT, UB> UB RemoteActionCompatParcelizer(int i, int i2, Map<K, V> map, forDeserialization.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, UB ub, hasName<UT, UB> hasname) {
        BasicClassIntrospector.AudioAttributesCompatParcelizer<?, ?> audioAttributesCompatParcelizerWrite = this.MediaMetadataCompat.write(write(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer()) {
                if (ub == null) {
                    ub = hasname.RemoteActionCompatParcelizer();
                }
                AnnotatedWithParams.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = AnnotatedWithParams.read(BasicClassIntrospector.IconCompatParcelizer(audioAttributesCompatParcelizerWrite, next.getKey(), next.getValue()));
                try {
                    BasicClassIntrospector.AudioAttributesCompatParcelizer(audioAttributesImplApi21Parcelizer.read(), audioAttributesCompatParcelizerWrite, next.getKey(), next.getValue());
                    hasname.read(ub, i2, audioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    @Override // kotlin.getPrimaryMember
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean write(T r13) {
        /*
            r12 = this;
            r0 = -1
            r1 = 0
            r2 = r1
            r3 = r2
        L4:
            int r4 = r12.read
            r5 = 1
            if (r2 >= r4) goto L93
            int[] r4 = r12.AudioAttributesImplApi21Parcelizer
            r4 = r4[r2]
            int r6 = r12.AudioAttributesImplApi26Parcelizer(r4)
            int r7 = r12.MediaDescriptionCompat(r4)
            boolean r8 = r12.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver
            if (r8 != 0) goto L31
            int[] r8 = r12.write
            int r9 = r4 + 2
            r8 = r8[r9]
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r9 & r8
            int r8 = r8 >>> 20
            int r5 = r5 << r8
            if (r9 == r0) goto L32
            sun.misc.Unsafe r0 = kotlin.couldSerialize.AudioAttributesCompatParcelizer
            long r10 = (long) r9
            int r3 = r0.getInt(r13, r10)
            r0 = r9
            goto L32
        L31:
            r5 = r1
        L32:
            boolean r8 = AudioAttributesCompatParcelizer(r7)
            if (r8 == 0) goto L3f
            boolean r8 = r12.RemoteActionCompatParcelizer(r13, r4, r3, r5)
            if (r8 != 0) goto L3f
            return r1
        L3f:
            int r8 = AudioAttributesImplBaseParcelizer(r7)
            r9 = 9
            if (r8 == r9) goto L7e
            r9 = 17
            if (r8 == r9) goto L7e
            r5 = 27
            if (r8 == r5) goto L77
            r5 = 60
            if (r8 == r5) goto L66
            r5 = 68
            if (r8 == r5) goto L66
            r5 = 49
            if (r8 == r5) goto L77
            r5 = 50
            if (r8 != r5) goto L8f
            boolean r4 = r12.write(r13, r7, r4)
            if (r4 != 0) goto L8f
            return r1
        L66:
            boolean r5 = r12.IconCompatParcelizer(r13, r6, r4)
            if (r5 == 0) goto L8f
            o.getPrimaryMember r4 = r12.RemoteActionCompatParcelizer(r4)
            boolean r4 = write(r13, r7, r4)
            if (r4 != 0) goto L8f
            return r1
        L77:
            boolean r4 = r12.AudioAttributesCompatParcelizer(r13, r7, r4)
            if (r4 != 0) goto L8f
            return r1
        L7e:
            boolean r5 = r12.RemoteActionCompatParcelizer(r13, r4, r3, r5)
            if (r5 == 0) goto L8f
            o.getPrimaryMember r4 = r12.RemoteActionCompatParcelizer(r4)
            boolean r4 = write(r13, r7, r4)
            if (r4 != 0) goto L8f
            return r1
        L8f:
            int r2 = r2 + 1
            goto L4
        L93:
            boolean r0 = r12.AudioAttributesImplBaseParcelizer
            if (r0 == 0) goto La4
            o.emptyAnnotations<?> r12 = r12.AudioAttributesImplApi26Parcelizer
            o.isPresent r12 = r12.read(r13)
            boolean r12 = r12.MediaBrowserCompatItemReceiver()
            if (r12 != 0) goto La4
            return r1
        La4:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.couldSerialize.write(java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean write(Object obj, int i, getPrimaryMember getprimarymember) {
        return getprimarymember.write(ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(obj, MediaBrowserCompatItemReceiver(i)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean AudioAttributesCompatParcelizer(Object obj, int i, int i2) {
        List list = (List) ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(obj, MediaBrowserCompatItemReceiver(i));
        if (list.isEmpty()) {
            return true;
        }
        getPrimaryMember getprimarymemberRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!getprimarymemberRemoteActionCompatParcelizer.write(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [o.getPrimaryMember] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    private boolean write(T t, int i, int i2) {
        Map<?, ?> mapIconCompatParcelizer = this.MediaMetadataCompat.IconCompatParcelizer(ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t, MediaBrowserCompatItemReceiver(i)));
        if (mapIconCompatParcelizer.isEmpty()) {
            return true;
        }
        if (this.MediaMetadataCompat.write(write(i2)).write.IconCompatParcelizer() != _ignorableAnnotation.AudioAttributesCompatParcelizer.MESSAGE) {
            return true;
        }
        ?? r4 = 0;
        for (Object obj : mapIconCompatParcelizer.values()) {
            r4 = r4;
            if (r4 == 0) {
                r4 = getAccessor.IconCompatParcelizer().read(obj.getClass());
            }
            if (!r4.write(obj)) {
                return false;
            }
        }
        return true;
    }

    private static void read(int i, Object obj, CollectorBase collectorBase) throws IOException {
        if (obj instanceof String) {
            collectorBase.IconCompatParcelizer(i, (String) obj);
        } else {
            collectorBase.IconCompatParcelizer(i, (AnnotatedWithParams) obj);
        }
    }

    private void RemoteActionCompatParcelizer(Object obj, int i, getGetter getgetter) throws IOException {
        if (read(i)) {
            ClassIntrospectorMixInResolver.read(obj, MediaBrowserCompatItemReceiver(i), getgetter.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
        } else if (this.MediaBrowserCompatItemReceiver) {
            ClassIntrospectorMixInResolver.read(obj, MediaBrowserCompatItemReceiver(i), getgetter.onCustomAction());
        } else {
            ClassIntrospectorMixInResolver.read(obj, MediaBrowserCompatItemReceiver(i), getgetter.AudioAttributesCompatParcelizer());
        }
    }

    private void AudioAttributesCompatParcelizer(Object obj, int i, getGetter getgetter) throws IOException {
        if (read(i)) {
            getgetter.MediaBrowserCompatMediaItem(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(obj, MediaBrowserCompatItemReceiver(i)));
        } else {
            getgetter.RatingCompat(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(obj, MediaBrowserCompatItemReceiver(i)));
        }
    }

    private <E> void read(Object obj, int i, getGetter getgetter, getPrimaryMember<E> getprimarymember, asAnnotations asannotations) throws IOException {
        getgetter.read(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(obj, MediaBrowserCompatItemReceiver(i)), getprimarymember, asannotations);
    }

    private <E> void RemoteActionCompatParcelizer(Object obj, long j, getGetter getgetter, getPrimaryMember<E> getprimarymember, asAnnotations asannotations) throws IOException {
        getgetter.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(obj, j), getprimarymember, asannotations);
    }

    private int AudioAttributesImplApi26Parcelizer(int i) {
        return this.write[i];
    }

    private int MediaDescriptionCompat(int i) {
        return this.write[i + 1];
    }

    private int MediaBrowserCompatCustomActionResultReceiver(int i) {
        return this.write[i + 2];
    }

    private static <T> double write(T t, long j) {
        return ClassIntrospectorMixInResolver.AudioAttributesImplApi26Parcelizer(t, j);
    }

    private static <T> float AudioAttributesCompatParcelizer(T t, long j) {
        return ClassIntrospectorMixInResolver.AudioAttributesImplBaseParcelizer(t, j);
    }

    private static <T> int read(T t, long j) {
        return ClassIntrospectorMixInResolver.MediaBrowserCompatCustomActionResultReceiver(t, j);
    }

    private static <T> long AudioAttributesImplBaseParcelizer(T t, long j) {
        return ClassIntrospectorMixInResolver.MediaBrowserCompatItemReceiver(t, j);
    }

    private static <T> boolean IconCompatParcelizer(T t, long j) {
        return ClassIntrospectorMixInResolver.write(t, j);
    }

    private static <T> double MediaBrowserCompatCustomActionResultReceiver(T t, long j) {
        return ((Double) ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t, j)).doubleValue();
    }

    private static <T> float AudioAttributesImplApi21Parcelizer(T t, long j) {
        return ((Float) ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t, j)).floatValue();
    }

    private static <T> int MediaBrowserCompatItemReceiver(T t, long j) {
        return ((Integer) ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t, j)).intValue();
    }

    private static <T> long MediaMetadataCompat(T t, long j) {
        return ((Long) ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t, j)).longValue();
    }

    private static <T> boolean AudioAttributesImplApi26Parcelizer(T t, long j) {
        return ((Boolean) ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t, j)).booleanValue();
    }

    private boolean IconCompatParcelizer(T t, T t2, int i) {
        return IconCompatParcelizer((Object) t, i) == IconCompatParcelizer((Object) t2, i);
    }

    private boolean RemoteActionCompatParcelizer(T t, int i, int i2, int i3) {
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            return IconCompatParcelizer((Object) t, i);
        }
        return (i2 & i3) != 0;
    }

    private boolean IconCompatParcelizer(T t, int i) {
        boolean zEquals;
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            int iMediaDescriptionCompat = MediaDescriptionCompat(i);
            long jMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(iMediaDescriptionCompat);
            switch (AudioAttributesImplBaseParcelizer(iMediaDescriptionCompat)) {
                case 0:
                    return ClassIntrospectorMixInResolver.AudioAttributesImplApi26Parcelizer(t, jMediaBrowserCompatItemReceiver) != 0.0d;
                case 1:
                    return ClassIntrospectorMixInResolver.AudioAttributesImplBaseParcelizer(t, jMediaBrowserCompatItemReceiver) != BitmapDescriptorFactory.HUE_RED;
                case 2:
                    return ClassIntrospectorMixInResolver.MediaBrowserCompatItemReceiver(t, jMediaBrowserCompatItemReceiver) != 0;
                case 3:
                    return ClassIntrospectorMixInResolver.MediaBrowserCompatItemReceiver(t, jMediaBrowserCompatItemReceiver) != 0;
                case 4:
                    return ClassIntrospectorMixInResolver.MediaBrowserCompatCustomActionResultReceiver(t, jMediaBrowserCompatItemReceiver) != 0;
                case 5:
                    return ClassIntrospectorMixInResolver.MediaBrowserCompatItemReceiver(t, jMediaBrowserCompatItemReceiver) != 0;
                case 6:
                    return ClassIntrospectorMixInResolver.MediaBrowserCompatCustomActionResultReceiver(t, jMediaBrowserCompatItemReceiver) != 0;
                case 7:
                    return ClassIntrospectorMixInResolver.write(t, jMediaBrowserCompatItemReceiver);
                case 8:
                    Object objAudioAttributesImplApi21Parcelizer = ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t, jMediaBrowserCompatItemReceiver);
                    if (objAudioAttributesImplApi21Parcelizer instanceof String) {
                        zEquals = ((String) objAudioAttributesImplApi21Parcelizer).isEmpty();
                    } else if (objAudioAttributesImplApi21Parcelizer instanceof AnnotatedWithParams) {
                        zEquals = AnnotatedWithParams.AudioAttributesCompatParcelizer.equals(objAudioAttributesImplApi21Parcelizer);
                    } else {
                        throw new IllegalArgumentException();
                    }
                    break;
                case 9:
                    return ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t, jMediaBrowserCompatItemReceiver) != null;
                case 10:
                    zEquals = AnnotatedWithParams.AudioAttributesCompatParcelizer.equals(ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t, jMediaBrowserCompatItemReceiver));
                    break;
                case 11:
                    return ClassIntrospectorMixInResolver.MediaBrowserCompatCustomActionResultReceiver(t, jMediaBrowserCompatItemReceiver) != 0;
                case 12:
                    return ClassIntrospectorMixInResolver.MediaBrowserCompatCustomActionResultReceiver(t, jMediaBrowserCompatItemReceiver) != 0;
                case 13:
                    return ClassIntrospectorMixInResolver.MediaBrowserCompatCustomActionResultReceiver(t, jMediaBrowserCompatItemReceiver) != 0;
                case 14:
                    return ClassIntrospectorMixInResolver.MediaBrowserCompatItemReceiver(t, jMediaBrowserCompatItemReceiver) != 0;
                case 15:
                    return ClassIntrospectorMixInResolver.MediaBrowserCompatCustomActionResultReceiver(t, jMediaBrowserCompatItemReceiver) != 0;
                case 16:
                    return ClassIntrospectorMixInResolver.MediaBrowserCompatItemReceiver(t, jMediaBrowserCompatItemReceiver) != 0;
                case 17:
                    return ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(t, jMediaBrowserCompatItemReceiver) != null;
                default:
                    throw new IllegalArgumentException();
            }
            return !zEquals;
        }
        int iMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(i);
        return ((1 << (iMediaBrowserCompatCustomActionResultReceiver >>> 20)) & ClassIntrospectorMixInResolver.MediaBrowserCompatCustomActionResultReceiver(t, (long) (1048575 & iMediaBrowserCompatCustomActionResultReceiver))) != 0;
    }

    private void AudioAttributesCompatParcelizer(T t, int i) {
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            return;
        }
        int iMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(i);
        long j = 1048575 & iMediaBrowserCompatCustomActionResultReceiver;
        ClassIntrospectorMixInResolver.write((Object) t, j, (1 << (iMediaBrowserCompatCustomActionResultReceiver >>> 20)) | ClassIntrospectorMixInResolver.MediaBrowserCompatCustomActionResultReceiver(t, j));
    }

    private boolean IconCompatParcelizer(T t, int i, int i2) {
        return ClassIntrospectorMixInResolver.MediaBrowserCompatCustomActionResultReceiver(t, (long) (MediaBrowserCompatCustomActionResultReceiver(i2) & 1048575)) == i;
    }

    private boolean read(T t, T t2, int i) {
        long jMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(i) & 1048575;
        return ClassIntrospectorMixInResolver.MediaBrowserCompatCustomActionResultReceiver(t, jMediaBrowserCompatCustomActionResultReceiver) == ClassIntrospectorMixInResolver.MediaBrowserCompatCustomActionResultReceiver(t2, jMediaBrowserCompatCustomActionResultReceiver);
    }

    private void read(T t, int i, int i2) {
        ClassIntrospectorMixInResolver.write((Object) t, MediaBrowserCompatCustomActionResultReceiver(i2) & 1048575, i);
    }

    private int AudioAttributesImplApi21Parcelizer(int i) {
        if (i < this.RatingCompat || i > this.MediaDescriptionCompat) {
            return -1;
        }
        return AudioAttributesCompatParcelizer(i, 0);
    }

    private int AudioAttributesCompatParcelizer(int i, int i2) {
        int length = (this.write.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int iAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(i4);
            if (i == iAudioAttributesImplApi26Parcelizer) {
                return i4;
            }
            if (i < iAudioAttributesImplApi26Parcelizer) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }
}
