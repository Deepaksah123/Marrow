package kotlin;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.skipFullyQuietly;

/* JADX INFO: loaded from: classes3.dex */
public final class sniff<T extends skipFullyQuietly<T>> {
    private boolean IconCompatParcelizer;
    private RemoteActionCompatParcelizer read;
    private boolean write;
    private final Map<Integer, T> AudioAttributesCompatParcelizer = new HashMap();
    private final Set<Integer> RemoteActionCompatParcelizer = new HashSet();

    public interface RemoteActionCompatParcelizer {
        void write();
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        if (this.IconCompatParcelizer != z) {
            this.IconCompatParcelizer = z;
            AudioAttributesCompatParcelizer();
        }
    }

    public final boolean IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final void read(boolean z) {
        this.write = z;
    }

    public final void IconCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.read = remoteActionCompatParcelizer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void IconCompatParcelizer(T t) {
        this.AudioAttributesCompatParcelizer.put(Integer.valueOf(t.getId()), t);
        if (t.isChecked()) {
            write(t);
        }
        t.setInternalOnCheckedChangeListener(new skipFullyQuietly.RemoteActionCompatParcelizer<T>() { // from class: o.sniff.3
            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.skipFullyQuietly.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public void AudioAttributesCompatParcelizer(T t2, boolean z) {
                if (z) {
                    if (!sniff.this.write(t2)) {
                        return;
                    }
                } else {
                    sniff sniffVar = sniff.this;
                    if (!sniffVar.read(t2, sniffVar.write)) {
                        return;
                    }
                }
                sniff.this.write();
            }
        });
    }

    public final void AudioAttributesCompatParcelizer(T t) {
        t.setInternalOnCheckedChangeListener(null);
        this.AudioAttributesCompatParcelizer.remove(Integer.valueOf(t.getId()));
        this.RemoteActionCompatParcelizer.remove(Integer.valueOf(t.getId()));
    }

    public final void read(int i) {
        T t = this.AudioAttributesCompatParcelizer.get(Integer.valueOf(i));
        if (t == null || !write(t)) {
            return;
        }
        write();
    }

    private void AudioAttributesCompatParcelizer() {
        boolean zIsEmpty = this.RemoteActionCompatParcelizer.isEmpty();
        Iterator<T> it = this.AudioAttributesCompatParcelizer.values().iterator();
        while (it.hasNext()) {
            read(it.next(), false);
        }
        if (zIsEmpty) {
            return;
        }
        write();
    }

    public final int RemoteActionCompatParcelizer() {
        if (!this.IconCompatParcelizer || this.RemoteActionCompatParcelizer.isEmpty()) {
            return -1;
        }
        return this.RemoteActionCompatParcelizer.iterator().next().intValue();
    }

    private Set<Integer> read() {
        return new HashSet(this.RemoteActionCompatParcelizer);
    }

    public final List<Integer> AudioAttributesCompatParcelizer(ViewGroup viewGroup) {
        Set<Integer> set = read();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof skipFullyQuietly) && set.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean write(skipFullyQuietly<T> skipfullyquietly) {
        int id = skipfullyquietly.getId();
        if (this.RemoteActionCompatParcelizer.contains(Integer.valueOf(id))) {
            return false;
        }
        T t = this.AudioAttributesCompatParcelizer.get(Integer.valueOf(RemoteActionCompatParcelizer()));
        if (t != null) {
            read(t, false);
        }
        boolean zAdd = this.RemoteActionCompatParcelizer.add(Integer.valueOf(id));
        if (!skipfullyquietly.isChecked()) {
            skipfullyquietly.setChecked(true);
        }
        return zAdd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean read(skipFullyQuietly<T> skipfullyquietly, boolean z) {
        int id = skipfullyquietly.getId();
        if (!this.RemoteActionCompatParcelizer.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z && this.RemoteActionCompatParcelizer.size() == 1 && this.RemoteActionCompatParcelizer.contains(Integer.valueOf(id))) {
            skipfullyquietly.setChecked(true);
            return false;
        }
        boolean zRemove = this.RemoteActionCompatParcelizer.remove(Integer.valueOf(id));
        if (skipfullyquietly.isChecked()) {
            skipfullyquietly.setChecked(false);
        }
        return zRemove;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void write() {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.read;
        if (remoteActionCompatParcelizer != null) {
            read();
            remoteActionCompatParcelizer.write();
        }
    }
}
