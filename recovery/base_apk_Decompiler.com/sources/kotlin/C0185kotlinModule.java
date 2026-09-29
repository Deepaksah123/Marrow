package kotlin;

import android.content.IntentFilter;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o.kotlinModule, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0185kotlinModule {
    public static final C0185kotlinModule read = new C0185kotlinModule(new Bundle(), null);
    private final Bundle IconCompatParcelizer;
    List<String> write;

    C0185kotlinModule(Bundle bundle, List<String> list) {
        this.IconCompatParcelizer = bundle;
        this.write = list;
    }

    public final List<String> AudioAttributesCompatParcelizer() {
        RemoteActionCompatParcelizer();
        return this.write;
    }

    final void RemoteActionCompatParcelizer() {
        if (this.write == null) {
            ArrayList<String> stringArrayList = this.IconCompatParcelizer.getStringArrayList("controlCategories");
            this.write = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.write = Collections.emptyList();
            }
        }
    }

    public final boolean write(List<IntentFilter> list) {
        if (list != null) {
            RemoteActionCompatParcelizer();
            int size = this.write.size();
            if (size != 0) {
                int size2 = list.size();
                for (int i = 0; i < size2; i++) {
                    IntentFilter intentFilter = list.get(i);
                    if (intentFilter != null) {
                        for (int i2 = 0; i2 < size; i2++) {
                            if (intentFilter.hasCategory(this.write.get(i2))) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean AudioAttributesCompatParcelizer(C0185kotlinModule c0185kotlinModule) {
        if (c0185kotlinModule == null) {
            return false;
        }
        RemoteActionCompatParcelizer();
        c0185kotlinModule.RemoteActionCompatParcelizer();
        return this.write.containsAll(c0185kotlinModule.write);
    }

    public final boolean write() {
        RemoteActionCompatParcelizer();
        return this.write.isEmpty();
    }

    public final boolean read() {
        RemoteActionCompatParcelizer();
        return !this.write.contains(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0185kotlinModule)) {
            return false;
        }
        C0185kotlinModule c0185kotlinModule = (C0185kotlinModule) obj;
        RemoteActionCompatParcelizer();
        c0185kotlinModule.RemoteActionCompatParcelizer();
        return this.write.equals(c0185kotlinModule.write);
    }

    public final int hashCode() {
        RemoteActionCompatParcelizer();
        return this.write.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaRouteSelector{ controlCategories=");
        sb.append(Arrays.toString(AudioAttributesCompatParcelizer().toArray()));
        sb.append(" }");
        return sb.toString();
    }

    public final Bundle IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static C0185kotlinModule RemoteActionCompatParcelizer(Bundle bundle) {
        if (bundle != null) {
            return new C0185kotlinModule(bundle, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: o.kotlinModule$AudioAttributesCompatParcelizer */
    public static final class AudioAttributesCompatParcelizer {
        private ArrayList<String> IconCompatParcelizer;

        public AudioAttributesCompatParcelizer() {
        }

        public AudioAttributesCompatParcelizer(C0185kotlinModule c0185kotlinModule) {
            if (c0185kotlinModule == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            c0185kotlinModule.RemoteActionCompatParcelizer();
            if (c0185kotlinModule.write.isEmpty()) {
                return;
            }
            this.IconCompatParcelizer = new ArrayList<>(c0185kotlinModule.write);
        }

        private AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(String str) {
            if (str == null) {
                throw new IllegalArgumentException("category must not be null");
            }
            if (this.IconCompatParcelizer == null) {
                this.IconCompatParcelizer = new ArrayList<>();
            }
            if (!this.IconCompatParcelizer.contains(str)) {
                this.IconCompatParcelizer.add(str);
            }
            return this;
        }

        private AudioAttributesCompatParcelizer write(Collection<String> collection) {
            if (collection == null) {
                throw new IllegalArgumentException("categories must not be null");
            }
            if (!collection.isEmpty()) {
                Iterator<String> it = collection.iterator();
                while (it.hasNext()) {
                    AudioAttributesCompatParcelizer(it.next());
                }
            }
            return this;
        }

        public final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(C0185kotlinModule c0185kotlinModule) {
            if (c0185kotlinModule == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            write(c0185kotlinModule.AudioAttributesCompatParcelizer());
            return this;
        }

        public final C0185kotlinModule IconCompatParcelizer() {
            if (this.IconCompatParcelizer == null) {
                return C0185kotlinModule.read;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("controlCategories", this.IconCompatParcelizer);
            return new C0185kotlinModule(bundle, this.IconCompatParcelizer);
        }
    }
}
