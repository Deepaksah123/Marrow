package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e"}, d2 = {"Lo/setTextClassifier;", "", "<init>", "()V", "", "p0", "Lo/setTextClassifier$AudioAttributesCompatParcelizer;", "RemoteActionCompatParcelizer", "(F)Lo/setTextClassifier$AudioAttributesCompatParcelizer;", "p1", "", "AudioAttributesCompatParcelizer", "(FF)D", "", "[F", "write", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setTextClassifier {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private static final float[] write;
    public static final setTextClassifier INSTANCE = new setTextClassifier();
    private static final float[] IconCompatParcelizer;
    public static final int write;

    private setTextClassifier() {
    }

    static {
        float[] fArr = new float[101];
        write = fArr;
        float[] fArr2 = new float[101];
        IconCompatParcelizer = fArr2;
        ContentFrameLayout.IconCompatParcelizer(fArr, fArr2, 100);
        write = 8;
    }

    public final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(float p0) {
        float f = BitmapDescriptorFactory.HUE_RED;
        float f2 = 1.0f;
        float f3 = getQues.read(p0, BitmapDescriptorFactory.HUE_RED, 1.0f);
        int i = (int) (f3 * 100.0f);
        if (i < 100) {
            float f4 = i / 100.0f;
            int i2 = i + 1;
            float[] fArr = write;
            float f5 = fArr[i];
            float f6 = (fArr[i2] - f5) / ((i2 / 100.0f) - f4);
            f2 = f5 + ((f3 - f4) * f6);
            f = f6;
        }
        return new AudioAttributesCompatParcelizer(f2, f);
    }

    public final double AudioAttributesCompatParcelizer(float p0, float p1) {
        return Math.log(((double) (Math.abs(p0) * 0.35f)) / ((double) p1));
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0010\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013"}, d2 = {"Lo/setTextClassifier$AudioAttributesCompatParcelizer;", "", "", "p0", "p1", "<init>", "(FF)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "F", "read", "()F", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AudioAttributesCompatParcelizer {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final float IconCompatParcelizer;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final float read;

        public AudioAttributesCompatParcelizer(float f, float f2) {
            this.read = f;
            this.IconCompatParcelizer = f2;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final float getRead() {
            return this.read;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final float getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof AudioAttributesCompatParcelizer)) {
                return false;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) p0;
            return Float.compare(this.read, audioAttributesCompatParcelizer.read) == 0 && Float.compare(this.IconCompatParcelizer, audioAttributesCompatParcelizer.IconCompatParcelizer) == 0;
        }

        public final int hashCode() {
            return (Float.hashCode(this.read) * 31) + Float.hashCode(this.IconCompatParcelizer);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AudioAttributesCompatParcelizer(read=");
            sb.append(this.read);
            sb.append(", IconCompatParcelizer=");
            sb.append(this.IconCompatParcelizer);
            sb.append(')');
            return sb.toString();
        }
    }
}
