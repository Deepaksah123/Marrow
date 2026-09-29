package kotlin;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class kotlinModuledefault {
    final Bundle AudioAttributesCompatParcelizer;
    private List<ConstructorValueCreator> write;

    kotlinModuledefault(Bundle bundle, List<ConstructorValueCreator> list) {
        this.AudioAttributesCompatParcelizer = bundle;
        this.write = list;
    }

    public final List<ConstructorValueCreator> read() {
        AudioAttributesCompatParcelizer();
        return this.write;
    }

    private void AudioAttributesCompatParcelizer() {
        if (this.write == null) {
            ArrayList parcelableArrayList = this.AudioAttributesCompatParcelizer.getParcelableArrayList("routes");
            if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
                this.write = Collections.emptyList();
                return;
            }
            int size = parcelableArrayList.size();
            this.write = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                this.write.add(ConstructorValueCreator.IconCompatParcelizer((Bundle) parcelableArrayList.get(i)));
            }
        }
    }

    public final boolean write() {
        AudioAttributesCompatParcelizer();
        int size = this.write.size();
        for (int i = 0; i < size; i++) {
            ConstructorValueCreator constructorValueCreator = this.write.get(i);
            if (constructorValueCreator == null || !constructorValueCreator.onFastForward()) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
        sb.append(Arrays.toString(read().toArray()));
        sb.append(", isValid=");
        sb.append(write());
        sb.append(" }");
        return sb.toString();
    }

    public static kotlinModuledefault IconCompatParcelizer(Bundle bundle) {
        if (bundle != null) {
            return new kotlinModuledefault(bundle, null);
        }
        return null;
    }

    public static final class write {
        private final Bundle AudioAttributesCompatParcelizer = new Bundle();
        private ArrayList<ConstructorValueCreator> IconCompatParcelizer;

        public final write IconCompatParcelizer(ConstructorValueCreator constructorValueCreator) {
            if (constructorValueCreator == null) {
                throw new IllegalArgumentException("route must not be null");
            }
            ArrayList<ConstructorValueCreator> arrayList = this.IconCompatParcelizer;
            if (arrayList == null) {
                this.IconCompatParcelizer = new ArrayList<>();
            } else if (arrayList.contains(constructorValueCreator)) {
                throw new IllegalArgumentException("route descriptor already added");
            }
            this.IconCompatParcelizer.add(constructorValueCreator);
            return this;
        }

        public final kotlinModuledefault RemoteActionCompatParcelizer() {
            ArrayList<ConstructorValueCreator> arrayList = this.IconCompatParcelizer;
            if (arrayList != null) {
                int size = arrayList.size();
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(size);
                for (int i = 0; i < size; i++) {
                    arrayList2.add(this.IconCompatParcelizer.get(i).write());
                }
                this.AudioAttributesCompatParcelizer.putParcelableArrayList("routes", arrayList2);
            }
            return new kotlinModuledefault(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer);
        }
    }
}
