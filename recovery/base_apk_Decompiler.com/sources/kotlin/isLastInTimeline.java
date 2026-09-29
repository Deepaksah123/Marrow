package kotlin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class isLastInTimeline {
    private final List<String> read = new ArrayList();
    private final Map<String, List<RemoteActionCompatParcelizer<?, ?>>> IconCompatParcelizer = new HashMap();

    public final void AudioAttributesCompatParcelizer(List<String> list) {
        synchronized (this) {
            ArrayList<String> arrayList = new ArrayList(this.read);
            this.read.clear();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.read.add(it.next());
            }
            for (String str : arrayList) {
                if (!list.contains(str)) {
                    this.read.add(str);
                }
            }
        }
    }

    public final <T, R> List<IllegalSeekPositionException<T, R>> AudioAttributesCompatParcelizer(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList();
            Iterator<String> it = this.read.iterator();
            while (it.hasNext()) {
                List<RemoteActionCompatParcelizer<?, ?>> list = this.IconCompatParcelizer.get(it.next());
                if (list != null) {
                    for (RemoteActionCompatParcelizer<?, ?> remoteActionCompatParcelizer : list) {
                        if (remoteActionCompatParcelizer.IconCompatParcelizer(cls, cls2)) {
                            arrayList.add(remoteActionCompatParcelizer.IconCompatParcelizer);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final <T, R> List<Class<R>> RemoteActionCompatParcelizer(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList();
            Iterator<String> it = this.read.iterator();
            while (it.hasNext()) {
                List<RemoteActionCompatParcelizer<?, ?>> list = this.IconCompatParcelizer.get(it.next());
                if (list != null) {
                    for (RemoteActionCompatParcelizer<?, ?> remoteActionCompatParcelizer : list) {
                        if (remoteActionCompatParcelizer.IconCompatParcelizer(cls, cls2) && !arrayList.contains(remoteActionCompatParcelizer.write)) {
                            arrayList.add(remoteActionCompatParcelizer.write);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final <T, R> void write(String str, IllegalSeekPositionException<T, R> illegalSeekPositionException, Class<T> cls, Class<R> cls2) {
        synchronized (this) {
            write(str).add(new RemoteActionCompatParcelizer<>(cls, cls2, illegalSeekPositionException));
        }
    }

    private List<RemoteActionCompatParcelizer<?, ?>> write(String str) {
        List<RemoteActionCompatParcelizer<?, ?>> arrayList;
        synchronized (this) {
            if (!this.read.contains(str)) {
                this.read.add(str);
            }
            arrayList = this.IconCompatParcelizer.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.IconCompatParcelizer.put(str, arrayList);
            }
        }
        return arrayList;
    }

    static class RemoteActionCompatParcelizer<T, R> {
        private final Class<T> AudioAttributesCompatParcelizer;
        final IllegalSeekPositionException<T, R> IconCompatParcelizer;
        final Class<R> write;

        public RemoteActionCompatParcelizer(Class<T> cls, Class<R> cls2, IllegalSeekPositionException<T, R> illegalSeekPositionException) {
            this.AudioAttributesCompatParcelizer = cls;
            this.write = cls2;
            this.IconCompatParcelizer = illegalSeekPositionException;
        }

        public final boolean IconCompatParcelizer(Class<?> cls, Class<?> cls2) {
            return this.AudioAttributesCompatParcelizer.isAssignableFrom(cls) && cls2.isAssignableFrom(this.write);
        }
    }
}
