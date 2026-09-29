package kotlin;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin._explicitClassOrOb;

/* JADX INFO: loaded from: classes4.dex */
public class asAnnotations {
    private static volatile asAnnotations read;
    static final asAnnotations write;
    private final Map<write, _explicitClassOrOb.write<?, ?>> RemoteActionCompatParcelizer;

    private static Class<?> AudioAttributesCompatParcelizer() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    static {
        AudioAttributesCompatParcelizer();
        write = new asAnnotations((byte) 0);
    }

    public static asAnnotations read() {
        asAnnotations asannotationsIconCompatParcelizer;
        asAnnotations asannotations = read;
        if (asannotations != null) {
            return asannotations;
        }
        synchronized (asAnnotations.class) {
            asannotationsIconCompatParcelizer = read;
            if (asannotationsIconCompatParcelizer == null) {
                asannotationsIconCompatParcelizer = addOrOverride.IconCompatParcelizer();
                read = asannotationsIconCompatParcelizer;
            }
        }
        return asannotationsIconCompatParcelizer;
    }

    public final <ContainingType extends constructPropertyCollector> _explicitClassOrOb.write<ContainingType, ?> write(ContainingType containingtype, int i) {
        return (_explicitClassOrOb.write) this.RemoteActionCompatParcelizer.get(new write(containingtype, i));
    }

    asAnnotations() {
        this.RemoteActionCompatParcelizer = new HashMap();
    }

    private asAnnotations(byte b) {
        this.RemoteActionCompatParcelizer = Collections.emptyMap();
    }

    static final class write {
        private final int AudioAttributesCompatParcelizer;
        private final Object IconCompatParcelizer;

        write(Object obj, int i) {
            this.IconCompatParcelizer = obj;
            this.AudioAttributesCompatParcelizer = i;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.IconCompatParcelizer) * 65535) + this.AudioAttributesCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof write)) {
                return false;
            }
            write writeVar = (write) obj;
            return this.IconCompatParcelizer == writeVar.IconCompatParcelizer && this.AudioAttributesCompatParcelizer == writeVar.AudioAttributesCompatParcelizer;
        }
    }
}
