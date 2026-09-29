package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002B\u001d\b\u0016\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\u0002\u0010\u0005B\u0019\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u0016\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0017\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010\u0018J\u001d\u0010\u0019\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u0001¢\u0006\u0002\u0010\u001bJ\u0015\u0010\u001c\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0017\u001a\u00028\u0000¢\u0006\u0002\u0010\u0018R#\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r0\f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R*\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Landroidx/collection/internal/LruHashMap;", "K", "", "V", "original", "(Landroidx/collection/internal/LruHashMap;)V", "initialCapacity", "", "loadFactor", "", "(IF)V", "entries", "", "", "getEntries", "()Ljava/util/Set;", "isEmpty", "", "()Z", "map", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "get", "key", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", AppMeasurementSdk.ConditionalUserProperty.VALUE, "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AppCompatEditText<K, V> {
    private final LinkedHashMap<K, V> IconCompatParcelizer;

    public AppCompatEditText(int i, float f) {
        this.IconCompatParcelizer = new LinkedHashMap<>(i, f, true);
    }

    public /* synthetic */ AppCompatEditText(int i, float f, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 16 : i, (i2 & 2) != 0 ? 0.75f : f);
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer.isEmpty();
    }

    public final Set<Map.Entry<K, V>> RemoteActionCompatParcelizer() {
        Set<Map.Entry<K, V>> setEntrySet = this.IconCompatParcelizer.entrySet();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setEntrySet, "");
        return setEntrySet;
    }

    public final V RemoteActionCompatParcelizer(K k) {
        toMagicModuleMetaRepoModel.write(k, "");
        return this.IconCompatParcelizer.get(k);
    }

    public final V read(K k, V v) {
        toMagicModuleMetaRepoModel.write(k, "");
        toMagicModuleMetaRepoModel.write(v, "");
        return this.IconCompatParcelizer.put(k, v);
    }

    public final V AudioAttributesCompatParcelizer(K k) {
        toMagicModuleMetaRepoModel.write(k, "");
        return this.IconCompatParcelizer.remove(k);
    }

    public AppCompatEditText() {
        this(0, BitmapDescriptorFactory.HUE_RED, 3, null);
    }
}
