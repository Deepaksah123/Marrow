package kotlin;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class onRenderedFirstFrame {
    private boolean AudioAttributesCompatParcelizer = false;
    private final Set<IconCompatParcelizer> IconCompatParcelizer = new setCustomView();
    private final Map<String, setCryptoType> write = new HashMap();
    private final Comparator<StringArrayDeserializer<String, Float>> read = new Comparator<StringArrayDeserializer<String, Float>>() { // from class: o.onRenderedFirstFrame.2
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(StringArrayDeserializer<String, Float> stringArrayDeserializer, StringArrayDeserializer<String, Float> stringArrayDeserializer2) {
            return IconCompatParcelizer(stringArrayDeserializer, stringArrayDeserializer2);
        }

        private static int IconCompatParcelizer(StringArrayDeserializer<String, Float> stringArrayDeserializer, StringArrayDeserializer<String, Float> stringArrayDeserializer2) {
            float fFloatValue = stringArrayDeserializer.IconCompatParcelizer.floatValue();
            float fFloatValue2 = stringArrayDeserializer2.IconCompatParcelizer.floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    };

    public interface IconCompatParcelizer {
    }

    final void IconCompatParcelizer(boolean z) {
        this.AudioAttributesCompatParcelizer = z;
    }

    public final void RemoteActionCompatParcelizer(String str, float f) {
        if (this.AudioAttributesCompatParcelizer) {
            setCryptoType setcryptotype = this.write.get(str);
            if (setcryptotype == null) {
                setcryptotype = new setCryptoType();
                this.write.put(str, setcryptotype);
            }
            setcryptotype.AudioAttributesCompatParcelizer(f);
            if (str.equals("__container")) {
                for (IconCompatParcelizer iconCompatParcelizer : this.IconCompatParcelizer) {
                }
            }
        }
    }
}
