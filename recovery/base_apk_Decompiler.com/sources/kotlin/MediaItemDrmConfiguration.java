package kotlin;

import android.graphics.Bitmap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaItemDrmConfiguration implements setEndPositionMs {
    private static final Bitmap.Config[] AudioAttributesCompatParcelizer;
    private static final Bitmap.Config[] IconCompatParcelizer;
    private static final Bitmap.Config[] RemoteActionCompatParcelizer;
    private static final Bitmap.Config[] read;
    private static final Bitmap.Config[] write;
    private final RemoteActionCompatParcelizer MediaBrowserCompatCustomActionResultReceiver = new RemoteActionCompatParcelizer();
    private final access3800<write, Bitmap> AudioAttributesImplBaseParcelizer = new access3800<>();
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> AudioAttributesImplApi26Parcelizer = new HashMap();

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        read = configArr;
        RemoteActionCompatParcelizer = configArr;
        IconCompatParcelizer = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        AudioAttributesCompatParcelizer = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        write = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    @Override // kotlin.setEndPositionMs
    public final void AudioAttributesCompatParcelizer(Bitmap bitmap) {
        write writeVarIconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(moveMediaSourceRange.RemoteActionCompatParcelizer(bitmap), bitmap.getConfig());
        this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(writeVarIconCompatParcelizer, bitmap);
        NavigableMap<Integer, Integer> navigableMapRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bitmap.getConfig());
        Integer num = (Integer) navigableMapRemoteActionCompatParcelizer.get(Integer.valueOf(writeVarIconCompatParcelizer.read));
        navigableMapRemoteActionCompatParcelizer.put(Integer.valueOf(writeVarIconCompatParcelizer.read), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // kotlin.setEndPositionMs
    public final Bitmap read(int i, int i2, Bitmap.Config config) {
        write writeVarWrite = write(moveMediaSourceRange.AudioAttributesCompatParcelizer(i, i2, config), config);
        Bitmap bitmap = this.AudioAttributesImplBaseParcelizer.read(writeVarWrite);
        if (bitmap != null) {
            AudioAttributesCompatParcelizer(Integer.valueOf(writeVarWrite.read), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        return bitmap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private o.MediaItemDrmConfiguration.write write(int r9, android.graphics.Bitmap.Config r10) {
        /*
            r8 = this;
            o.MediaItemDrmConfiguration$RemoteActionCompatParcelizer r0 = r8.MediaBrowserCompatCustomActionResultReceiver
            o.MediaItemDrmConfiguration$write r0 = r0.IconCompatParcelizer(r9, r10)
            android.graphics.Bitmap$Config[] r1 = write(r10)
            int r2 = r1.length
            r3 = 0
        Lc:
            if (r3 >= r2) goto L4c
            r4 = r1[r3]
            java.util.NavigableMap r5 = r8.RemoteActionCompatParcelizer(r4)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            java.lang.Object r5 = r5.ceilingKey(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L49
            int r6 = r5.intValue()
            int r7 = r9 << 3
            if (r6 > r7) goto L49
            int r1 = r5.intValue()
            if (r1 != r9) goto L39
            if (r4 != 0) goto L33
            if (r10 == 0) goto L4c
            goto L39
        L33:
            boolean r9 = r4.equals(r10)
            if (r9 != 0) goto L4c
        L39:
            o.MediaItemDrmConfiguration$RemoteActionCompatParcelizer r9 = r8.MediaBrowserCompatCustomActionResultReceiver
            r9.read(r0)
            o.MediaItemDrmConfiguration$RemoteActionCompatParcelizer r8 = r8.MediaBrowserCompatCustomActionResultReceiver
            int r9 = r5.intValue()
            o.MediaItemDrmConfiguration$write r8 = r8.IconCompatParcelizer(r9, r4)
            return r8
        L49:
            int r3 = r3 + 1
            goto Lc
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.MediaItemDrmConfiguration.write(int, android.graphics.Bitmap$Config):o.MediaItemDrmConfiguration$write");
    }

    @Override // kotlin.setEndPositionMs
    public final Bitmap write() {
        Bitmap bitmap = this.AudioAttributesImplBaseParcelizer.read();
        if (bitmap != null) {
            AudioAttributesCompatParcelizer(Integer.valueOf(moveMediaSourceRange.RemoteActionCompatParcelizer(bitmap)), bitmap);
        }
        return bitmap;
    }

    private void AudioAttributesCompatParcelizer(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> navigableMapRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapRemoteActionCompatParcelizer.get(num);
        if (num2 == null) {
            StringBuilder sb = new StringBuilder("Tried to decrement empty size, size: ");
            sb.append(num);
            sb.append(", removed: ");
            sb.append(IconCompatParcelizer(bitmap));
            sb.append(", this: ");
            sb.append(this);
            throw new NullPointerException(sb.toString());
        }
        if (num2.intValue() == 1) {
            navigableMapRemoteActionCompatParcelizer.remove(num);
        } else {
            navigableMapRemoteActionCompatParcelizer.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    private NavigableMap<Integer, Integer> RemoteActionCompatParcelizer(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.AudioAttributesImplApi26Parcelizer.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.AudioAttributesImplApi26Parcelizer.put(config, treeMap);
        return treeMap;
    }

    @Override // kotlin.setEndPositionMs
    public final String IconCompatParcelizer(Bitmap bitmap) {
        return read(moveMediaSourceRange.RemoteActionCompatParcelizer(bitmap), bitmap.getConfig());
    }

    @Override // kotlin.setEndPositionMs
    public final String AudioAttributesCompatParcelizer(int i, int i2, Bitmap.Config config) {
        return read(moveMediaSourceRange.AudioAttributesCompatParcelizer(i, i2, config), config);
    }

    @Override // kotlin.setEndPositionMs
    public final int write(Bitmap bitmap) {
        return moveMediaSourceRange.RemoteActionCompatParcelizer(bitmap);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SizeConfigStrategy{groupedMap=");
        sb.append(this.AudioAttributesImplBaseParcelizer);
        sb.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.AudioAttributesImplApi26Parcelizer.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.AudioAttributesImplApi26Parcelizer.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }

    static class RemoteActionCompatParcelizer extends access4000<write> {
        RemoteActionCompatParcelizer() {
        }

        public final write IconCompatParcelizer(int i, Bitmap.Config config) {
            write writeVarWrite = write();
            writeVarWrite.read(i, config);
            return writeVarWrite;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.access4000
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public write read() {
            return new write(this);
        }
    }

    static final class write implements setRelativeToDefaultPosition {
        private Bitmap.Config AudioAttributesCompatParcelizer;
        int read;
        private final RemoteActionCompatParcelizer write;

        public write(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.write = remoteActionCompatParcelizer;
        }

        public final void read(int i, Bitmap.Config config) {
            this.read = i;
            this.AudioAttributesCompatParcelizer = config;
        }

        @Override // kotlin.setRelativeToDefaultPosition
        public final void RemoteActionCompatParcelizer() {
            this.write.read(this);
        }

        public final String toString() {
            return MediaItemDrmConfiguration.read(this.read, this.AudioAttributesCompatParcelizer);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof write)) {
                return false;
            }
            write writeVar = (write) obj;
            return this.read == writeVar.read && moveMediaSourceRange.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, writeVar.AudioAttributesCompatParcelizer);
        }

        public final int hashCode() {
            int i = this.read;
            Bitmap.Config config = this.AudioAttributesCompatParcelizer;
            return (i * 31) + (config != null ? config.hashCode() : 0);
        }
    }

    static String read(int i, Bitmap.Config config) {
        StringBuilder sb = new StringBuilder("[");
        sb.append(i);
        sb.append("](");
        sb.append(config);
        sb.append(")");
        return sb.toString();
    }

    private static Bitmap.Config[] write(Bitmap.Config config) {
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            return RemoteActionCompatParcelizer;
        }
        int i = AnonymousClass1.read[config.ordinal()];
        if (i == 1) {
            return read;
        }
        if (i == 2) {
            return IconCompatParcelizer;
        }
        if (i == 3) {
            return AudioAttributesCompatParcelizer;
        }
        if (i == 4) {
            return write;
        }
        return new Bitmap.Config[]{config};
    }

    /* JADX INFO: renamed from: o.MediaItemDrmConfiguration$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            read = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                read[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                read[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                read[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }
}
