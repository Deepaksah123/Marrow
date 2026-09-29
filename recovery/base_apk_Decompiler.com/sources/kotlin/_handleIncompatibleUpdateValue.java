package kotlin;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.rewrapCtorProblem;

/* JADX INFO: loaded from: classes2.dex */
public final class _handleIncompatibleUpdateValue<T> {
    private final rewrapCtorProblem.IconCompatParcelizer<ArrayList<T>> write = new rewrapCtorProblem.AudioAttributesCompatParcelizer(10);
    private final AppCompatCheckBox<T, ArrayList<T>> AudioAttributesCompatParcelizer = new AppCompatCheckBox<>();
    private final ArrayList<T> read = new ArrayList<>();
    private final HashSet<T> IconCompatParcelizer = new HashSet<>();

    public final void IconCompatParcelizer(T t) {
        if (this.AudioAttributesCompatParcelizer.containsKey(t)) {
            return;
        }
        this.AudioAttributesCompatParcelizer.put(t, null);
    }

    public final boolean RemoteActionCompatParcelizer(T t) {
        return this.AudioAttributesCompatParcelizer.containsKey(t);
    }

    public final void RemoteActionCompatParcelizer(T t, T t2) {
        if (!this.AudioAttributesCompatParcelizer.containsKey(t) || !this.AudioAttributesCompatParcelizer.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayListRemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.get(t);
        if (arrayListRemoteActionCompatParcelizer == null) {
            arrayListRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            this.AudioAttributesCompatParcelizer.put(t, arrayListRemoteActionCompatParcelizer);
        }
        arrayListRemoteActionCompatParcelizer.add(t2);
    }

    public final List read(T t) {
        return this.AudioAttributesCompatParcelizer.get(t);
    }

    public final List<T> write(T t) {
        int remoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer();
        ArrayList arrayList = null;
        for (int i = 0; i < remoteActionCompatParcelizer; i++) {
            ArrayList<T> arrayListIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer(i);
            if (arrayListIconCompatParcelizer != null && arrayListIconCompatParcelizer.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.AudioAttributesCompatParcelizer.write(i));
            }
        }
        return arrayList;
    }

    public final boolean AudioAttributesCompatParcelizer(T t) {
        int remoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer();
        for (int i = 0; i < remoteActionCompatParcelizer; i++) {
            ArrayList<T> arrayListIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer(i);
            if (arrayListIconCompatParcelizer != null && arrayListIconCompatParcelizer.contains(t)) {
                return true;
            }
        }
        return false;
    }

    public final void read() {
        int remoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer();
        for (int i = 0; i < remoteActionCompatParcelizer; i++) {
            ArrayList<T> arrayListIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer(i);
            if (arrayListIconCompatParcelizer != null) {
                IconCompatParcelizer((ArrayList) arrayListIconCompatParcelizer);
            }
        }
        this.AudioAttributesCompatParcelizer.clear();
    }

    public final ArrayList<T> write() {
        this.read.clear();
        this.IconCompatParcelizer.clear();
        int remoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer();
        for (int i = 0; i < remoteActionCompatParcelizer; i++) {
            AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.write(i), this.read, this.IconCompatParcelizer);
        }
        return this.read;
    }

    private void AudioAttributesCompatParcelizer(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (hashSet.contains(t)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t);
        ArrayList<T> arrayList2 = this.AudioAttributesCompatParcelizer.get(t);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                AudioAttributesCompatParcelizer(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(t);
        arrayList.add(t);
    }

    private ArrayList<T> RemoteActionCompatParcelizer() {
        ArrayList<T> arrayListRemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer();
        return arrayListRemoteActionCompatParcelizer == null ? new ArrayList<>() : arrayListRemoteActionCompatParcelizer;
    }

    private void IconCompatParcelizer(ArrayList<T> arrayList) {
        arrayList.clear();
        this.write.RemoteActionCompatParcelizer(arrayList);
    }
}
