package kotlin;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\r\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u0015*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0014\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0019J\u0017\u0010\t\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0013J/\u0010\r\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\r\u0010\u001dR\u0016\u0010\u0014\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001fR\u0014\u0010\u0016\u001a\u00020 8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010!R\u0014\u0010\r\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010#R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u001c0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010%R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0016\u0010+\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010*"}, d2 = {"Lo/initialize;", "", "<init>", "()V", "Landroid/view/MotionEvent;", "p0", "Lo/handleWeirdKey;", "p1", "Lo/getAnnotationIntrospector;", "IconCompatParcelizer", "(Landroid/view/MotionEvent;Lo/handleWeirdKey;)Lo/getAnnotationIntrospector;", "Lo/getWrapperName;", "Lo/BeanPropertyBogus;", "AudioAttributesCompatParcelizer", "(Landroid/view/MotionEvent;Lo/getWrapperName;)Lo/BeanPropertyBogus;", "", "", "write", "(I)V", "(Landroid/view/MotionEvent;)V", "RemoteActionCompatParcelizer", "", "read", "(Landroid/view/MotionEvent;I)Z", "Lo/findClass;", "(I)J", "p2", "p3", "Lo/findRootValueDeserializer;", "(Lo/handleWeirdKey;Landroid/view/MotionEvent;IZ)Lo/findRootValueDeserializer;", "", "J", "Landroid/util/SparseLongArray;", "Landroid/util/SparseLongArray;", "Landroid/util/SparseBooleanArray;", "Landroid/util/SparseBooleanArray;", "", "Ljava/util/List;", "Lo/setPresenter;", "Lo/initialize$IconCompatParcelizer;", "Lo/setPresenter;", "AudioAttributesImplBaseParcelizer", "I", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatCustomActionResultReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class initialize {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private long RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final SparseLongArray read = new SparseLongArray();

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final SparseBooleanArray AudioAttributesCompatParcelizer = new SparseBooleanArray();

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final List<findRootValueDeserializer> write = new ArrayList();
    private final setPresenter<IconCompatParcelizer> IconCompatParcelizer = new setPresenter<>(0, 1, null);

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private int AudioAttributesImplApi21Parcelizer = -1;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private int MediaBrowserCompatCustomActionResultReceiver = -1;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0083@\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0014\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\u0017R\u0011\u0010\f\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0005\u0088\u0001\u0018\u0092\u0001\u00020\u0002"}, d2 = {"Lo/initialize$IconCompatParcelizer;", "", "", "p0", "RemoteActionCompatParcelizer", "(J)J", "Lo/getReferencedType;", "p1", "", "p2", "read", "(JJZ)J", "IconCompatParcelizer", "(JLjava/lang/Object;)Z", "", "AudioAttributesImplApi26Parcelizer", "(J)I", "", "MediaBrowserCompatItemReceiver", "(J)Ljava/lang/String;", "AudioAttributesCompatParcelizer", "J", "write", "(J)Z", "packedValue"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @submitMagicModule
    static final class IconCompatParcelizer {

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final long write;

        public static final boolean IconCompatParcelizer(long j) {
            return (j & 1) != 0;
        }

        public static long RemoteActionCompatParcelizer(long j) {
            return j;
        }

        public static final long write(long j) {
            return (j >> 1) & 2147483647L;
        }

        private /* synthetic */ IconCompatParcelizer(long j) {
            this.write = j;
        }

        public static long read(long j, long j2, boolean z) {
            return RemoteActionCompatParcelizer(((j & 2147483647L) << 1) | (z ? 1L : 0L) | (((long) INSTANCE.RemoteActionCompatParcelizer((short) Float.intBitsToFloat((int) (j2 >> 32)), (short) Float.intBitsToFloat((int) j2))) << 32));
        }

        public static final long read(long j) {
            Companion companion = INSTANCE;
            long j2 = -1;
            return getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(companion.AudioAttributesCompatParcelizer(r9))) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) | (((long) Float.floatToRawIntBits(companion.read((int) (j >>> 32)))) << 32));
        }

        /* JADX INFO: renamed from: o.initialize$IconCompatParcelizer$write, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u000b"}, d2 = {"Lo/initialize$IconCompatParcelizer$write;", "", "<init>", "()V", "", "p0", "p1", "", "RemoteActionCompatParcelizer", "(SS)I", "read", "(I)S", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            /* JADX INFO: Access modifiers changed from: private */
            public final short AudioAttributesCompatParcelizer(int p0) {
                return (short) (65535 & p0);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int RemoteActionCompatParcelizer(short p0, short p1) {
                return (p0 << 16) | (65535 & p1);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final short read(int p0) {
                return (short) (p0 >>> 16);
            }

            private Companion() {
            }

            public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }
        }

        public static final /* synthetic */ IconCompatParcelizer AudioAttributesCompatParcelizer(long j) {
            return new IconCompatParcelizer(j);
        }

        public static boolean IconCompatParcelizer(long j, Object obj) {
            return (obj instanceof IconCompatParcelizer) && j == ((IconCompatParcelizer) obj).getWrite();
        }

        public static int AudioAttributesImplApi26Parcelizer(long j) {
            return Long.hashCode(j);
        }

        public static String MediaBrowserCompatItemReceiver(long j) {
            StringBuilder sb = new StringBuilder("IndirectPointerEventData(packedValue=");
            sb.append(j);
            sb.append(')');
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            return IconCompatParcelizer(this.write, obj);
        }

        public final int hashCode() {
            return AudioAttributesImplApi26Parcelizer(this.write);
        }

        public final String toString() {
            return MediaBrowserCompatItemReceiver(this.write);
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final /* synthetic */ long getWrite() {
            return this.write;
        }
    }

    public final getAnnotationIntrospector IconCompatParcelizer(MotionEvent p0, handleWeirdKey p1) {
        int actionIndex;
        int actionMasked = p0.getActionMasked();
        if (actionMasked == 3 || actionMasked == 4) {
            this.read.clear();
            this.AudioAttributesCompatParcelizer.clear();
            return null;
        }
        IconCompatParcelizer(p0);
        AudioAttributesCompatParcelizer(p0);
        boolean z = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z2 = actionMasked == 8;
        if (z) {
            this.AudioAttributesCompatParcelizer.put(p0.getPointerId(p0.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            actionIndex = actionMasked != 6 ? -1 : p0.getActionIndex();
        } else {
            actionIndex = 0;
        }
        this.write.clear();
        int pointerCount = p0.getPointerCount();
        int i = 0;
        while (i < pointerCount) {
            this.write.add(AudioAttributesCompatParcelizer(p1, p0, i, (z || i == actionIndex || (z2 && p0.getButtonState() == 0)) ? false : true));
            i++;
        }
        RemoteActionCompatParcelizer(p0);
        return new getAnnotationIntrospector(p0.getEventTime(), this.write, p0);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.BeanPropertyBogus AudioAttributesCompatParcelizer(android.view.MotionEvent r30, kotlin.getWrapperName r31) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.initialize.AudioAttributesCompatParcelizer(android.view.MotionEvent, o.getWrapperName):o.BeanPropertyBogus");
    }

    public final void write(int p0) {
        this.AudioAttributesCompatParcelizer.delete(p0);
        this.read.delete(p0);
    }

    private final void AudioAttributesCompatParcelizer(MotionEvent p0) {
        int actionMasked = p0.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked == 9) {
                int pointerId = p0.getPointerId(0);
                if (this.read.indexOfKey(pointerId) < 0) {
                    SparseLongArray sparseLongArray = this.read;
                    long j = this.RemoteActionCompatParcelizer;
                    this.RemoteActionCompatParcelizer = 1 + j;
                    sparseLongArray.put(pointerId, j);
                    return;
                }
                return;
            }
            return;
        }
        int actionIndex = p0.getActionIndex();
        int pointerId2 = p0.getPointerId(actionIndex);
        if (this.read.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.read;
            long j2 = this.RemoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = 1 + j2;
            sparseLongArray2.put(pointerId2, j2);
            if (p0.getToolType(actionIndex) == 3) {
                this.AudioAttributesCompatParcelizer.put(pointerId2, true);
            }
        }
    }

    private final void RemoteActionCompatParcelizer(MotionEvent p0) {
        int actionMasked = p0.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = p0.getPointerId(p0.getActionIndex());
            if (!this.AudioAttributesCompatParcelizer.get(pointerId, false)) {
                this.read.delete(pointerId);
                this.AudioAttributesCompatParcelizer.delete(pointerId);
            }
        }
        if (this.read.size() > p0.getPointerCount()) {
            for (int size = this.read.size() - 1; size >= 0; size--) {
                int iKeyAt = this.read.keyAt(size);
                if (!read(p0, iKeyAt)) {
                    this.read.removeAt(size);
                    this.AudioAttributesCompatParcelizer.delete(iKeyAt);
                }
            }
        }
    }

    private final boolean read(MotionEvent motionEvent, int i) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            if (motionEvent.getPointerId(i2) == i) {
                return true;
            }
        }
        return false;
    }

    private final long RemoteActionCompatParcelizer(int p0) {
        long jValueAt;
        int iIndexOfKey = this.read.indexOfKey(p0);
        if (iIndexOfKey >= 0) {
            jValueAt = this.read.valueAt(iIndexOfKey);
        } else {
            long j = this.RemoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = 1 + j;
            this.read.put(p0, j);
            jValueAt = j;
        }
        return findClass.RemoteActionCompatParcelizer(jValueAt);
    }

    private final void IconCompatParcelizer(MotionEvent p0) {
        if (p0.getPointerCount() == 1) {
            int toolType = p0.getToolType(0);
            int source = p0.getSource();
            if (toolType == this.AudioAttributesImplApi21Parcelizer && source == this.MediaBrowserCompatCustomActionResultReceiver) {
                return;
            }
            this.AudioAttributesImplApi21Parcelizer = toolType;
            this.MediaBrowserCompatCustomActionResultReceiver = source;
            this.AudioAttributesCompatParcelizer.clear();
            this.read.clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final kotlin.findRootValueDeserializer AudioAttributesCompatParcelizer(kotlin.handleWeirdKey r38, android.view.MotionEvent r39, int r40, boolean r41) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.initialize.AudioAttributesCompatParcelizer(o.handleWeirdKey, android.view.MotionEvent, int, boolean):o.findRootValueDeserializer");
    }
}
