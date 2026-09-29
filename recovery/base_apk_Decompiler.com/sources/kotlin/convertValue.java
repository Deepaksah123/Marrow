package kotlin;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class convertValue {
    private SparseIntArray read = new SparseIntArray();
    private HashMap<Integer, HashSet<WeakReference<AudioAttributesCompatParcelizer>>> write = new HashMap<>();

    public interface AudioAttributesCompatParcelizer {
    }

    public final void RemoteActionCompatParcelizer(int i, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        HashSet<WeakReference<AudioAttributesCompatParcelizer>> hashSet = this.write.get(Integer.valueOf(i));
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.write.put(Integer.valueOf(i), hashSet);
        }
        hashSet.add(new WeakReference<>(audioAttributesCompatParcelizer));
    }

    public final void AudioAttributesCompatParcelizer(int i, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        HashSet<WeakReference<AudioAttributesCompatParcelizer>> hashSet = this.write.get(Integer.valueOf(i));
        if (hashSet == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (WeakReference<AudioAttributesCompatParcelizer> weakReference : hashSet) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = weakReference.get();
            if (audioAttributesCompatParcelizer2 == null || audioAttributesCompatParcelizer2 == audioAttributesCompatParcelizer) {
                arrayList.add(weakReference);
            }
        }
        hashSet.removeAll(arrayList);
    }
}
