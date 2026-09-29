package kotlin;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.HomeLessonIndexV2;

/* JADX INFO: loaded from: classes4.dex */
public final class setStepType {
    private static final setStepType AudioAttributesCompatParcelizer = new setStepType((byte) 0);
    private final Map<AudioAttributesCompatParcelizer, HomeLessonIndexV2.IconCompatParcelizer<?, ?>> read;

    public static setStepType read() {
        return new setStepType();
    }

    public static setStepType write() {
        return AudioAttributesCompatParcelizer;
    }

    public final <ContainingType extends BookReference> HomeLessonIndexV2.IconCompatParcelizer<ContainingType, ?> read(ContainingType containingtype, int i) {
        return (HomeLessonIndexV2.IconCompatParcelizer) this.read.get(new AudioAttributesCompatParcelizer(containingtype, i));
    }

    public final void AudioAttributesCompatParcelizer(HomeLessonIndexV2.IconCompatParcelizer<?, ?> iconCompatParcelizer) {
        this.read.put(new AudioAttributesCompatParcelizer(iconCompatParcelizer.AudioAttributesCompatParcelizer(), iconCompatParcelizer.write()), iconCompatParcelizer);
    }

    setStepType() {
        this.read = new HashMap();
    }

    private setStepType(byte b) {
        this.read = Collections.emptyMap();
    }

    static final class AudioAttributesCompatParcelizer {
        private final Object RemoteActionCompatParcelizer;
        private final int read;

        AudioAttributesCompatParcelizer(Object obj, int i) {
            this.RemoteActionCompatParcelizer = obj;
            this.read = i;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.RemoteActionCompatParcelizer) * 65535) + this.read;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof AudioAttributesCompatParcelizer)) {
                return false;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) obj;
            return this.RemoteActionCompatParcelizer == audioAttributesCompatParcelizer.RemoteActionCompatParcelizer && this.read == audioAttributesCompatParcelizer.read;
        }
    }
}
