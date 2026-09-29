package kotlin;

import java.util.HashMap;
import java.util.Map;
import kotlin.ActionBarContainer;

/* JADX INFO: loaded from: classes.dex */
public final class setPrimaryBackground<K, V> extends ActionBarContainer<K, V> {
    private final HashMap<K, ActionBarContainer.IconCompatParcelizer<K, V>> AudioAttributesCompatParcelizer = new HashMap<>();

    @Override // kotlin.ActionBarContainer
    protected final ActionBarContainer.IconCompatParcelizer<K, V> RemoteActionCompatParcelizer(K k) {
        return this.AudioAttributesCompatParcelizer.get(k);
    }

    @Override // kotlin.ActionBarContainer
    public final V read(K k, V v) {
        ActionBarContainer.IconCompatParcelizer<K, V> iconCompatParcelizerRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(k);
        if (iconCompatParcelizerRemoteActionCompatParcelizer != null) {
            return iconCompatParcelizerRemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        }
        this.AudioAttributesCompatParcelizer.put(k, write(k, v));
        return null;
    }

    @Override // kotlin.ActionBarContainer
    public final V AudioAttributesCompatParcelizer(K k) {
        V v = (V) super.AudioAttributesCompatParcelizer(k);
        this.AudioAttributesCompatParcelizer.remove(k);
        return v;
    }

    public final boolean read(K k) {
        return this.AudioAttributesCompatParcelizer.containsKey(k);
    }

    public final Map.Entry<K, V> IconCompatParcelizer(K k) {
        if (read(k)) {
            return this.AudioAttributesCompatParcelizer.get(k).write;
        }
        return null;
    }
}
