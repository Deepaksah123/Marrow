package kotlin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class typeProperty<E> implements Iterable<E> {
    private final Object RemoteActionCompatParcelizer = new Object();
    private final Map<E, Integer> IconCompatParcelizer = new HashMap();
    private Set<E> write = Collections.emptySet();
    private List<E> AudioAttributesCompatParcelizer = Collections.emptyList();

    public final void AudioAttributesCompatParcelizer(E e) {
        synchronized (this.RemoteActionCompatParcelizer) {
            ArrayList arrayList = new ArrayList(this.AudioAttributesCompatParcelizer);
            arrayList.add(e);
            this.AudioAttributesCompatParcelizer = Collections.unmodifiableList(arrayList);
            Integer num = this.IconCompatParcelizer.get(e);
            if (num == null) {
                HashSet hashSet = new HashSet(this.write);
                hashSet.add(e);
                this.write = Collections.unmodifiableSet(hashSet);
            }
            this.IconCompatParcelizer.put(e, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    public final void RemoteActionCompatParcelizer(E e) {
        synchronized (this.RemoteActionCompatParcelizer) {
            Integer num = this.IconCompatParcelizer.get(e);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.AudioAttributesCompatParcelizer);
            arrayList.remove(e);
            this.AudioAttributesCompatParcelizer = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.IconCompatParcelizer.remove(e);
                HashSet hashSet = new HashSet(this.write);
                hashSet.remove(e);
                this.write = Collections.unmodifiableSet(hashSet);
            } else {
                this.IconCompatParcelizer.put(e, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    public final Set<E> read() {
        Set<E> set;
        synchronized (this.RemoteActionCompatParcelizer) {
            set = this.write;
        }
        return set;
    }

    @Override // java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.RemoteActionCompatParcelizer) {
            it = this.AudioAttributesCompatParcelizer.iterator();
        }
        return it;
    }

    public final int write(E e) {
        int iIntValue;
        synchronized (this.RemoteActionCompatParcelizer) {
            iIntValue = this.IconCompatParcelizer.containsKey(e) ? this.IconCompatParcelizer.get(e).intValue() : 0;
        }
        return iIntValue;
    }
}
