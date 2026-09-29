package kotlin;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getBufferedPositionUs {
    private final List<IconCompatParcelizer<?, ?>> IconCompatParcelizer = new ArrayList();

    public final <Z, R> void read(Class<Z> cls, Class<R> cls2, releaseMediaPeriod<Z, R> releasemediaperiod) {
        synchronized (this) {
            this.IconCompatParcelizer.add(new IconCompatParcelizer<>(cls, cls2, releasemediaperiod));
        }
    }

    public final <Z, R> releaseMediaPeriod<Z, R> IconCompatParcelizer(Class<Z> cls, Class<R> cls2) {
        synchronized (this) {
            if (cls2.isAssignableFrom(cls)) {
                return getNextLoadPositionUs.read();
            }
            for (IconCompatParcelizer<?, ?> iconCompatParcelizer : this.IconCompatParcelizer) {
                if (iconCompatParcelizer.IconCompatParcelizer(cls, cls2)) {
                    return (releaseMediaPeriod<Z, R>) iconCompatParcelizer.AudioAttributesCompatParcelizer;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("No transcoder registered to transcode from ");
            sb.append(cls);
            sb.append(" to ");
            sb.append(cls2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final <Z, R> List<Class<R>> AudioAttributesCompatParcelizer(Class<Z> cls, Class<R> cls2) {
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            if (cls2.isAssignableFrom(cls)) {
                arrayList.add(cls2);
                return arrayList;
            }
            for (IconCompatParcelizer<?, ?> iconCompatParcelizer : this.IconCompatParcelizer) {
                if (iconCompatParcelizer.IconCompatParcelizer(cls, cls2) && !arrayList.contains(iconCompatParcelizer.RemoteActionCompatParcelizer)) {
                    arrayList.add(iconCompatParcelizer.RemoteActionCompatParcelizer);
                }
            }
            return arrayList;
        }
    }

    static final class IconCompatParcelizer<Z, R> {
        final releaseMediaPeriod<Z, R> AudioAttributesCompatParcelizer;
        final Class<R> RemoteActionCompatParcelizer;
        private Class<Z> read;

        IconCompatParcelizer(Class<Z> cls, Class<R> cls2, releaseMediaPeriod<Z, R> releasemediaperiod) {
            this.read = cls;
            this.RemoteActionCompatParcelizer = cls2;
            this.AudioAttributesCompatParcelizer = releasemediaperiod;
        }

        public final boolean IconCompatParcelizer(Class<?> cls, Class<?> cls2) {
            return this.read.isAssignableFrom(cls) && cls2.isAssignableFrom(this.RemoteActionCompatParcelizer);
        }
    }
}
