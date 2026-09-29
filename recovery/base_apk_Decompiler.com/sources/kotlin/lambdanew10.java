package kotlin;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class lambdanew10 {
    private lambdasetTrackSelector18 AudioAttributesCompatParcelizer;
    private final lambdanew3 write;

    protected lambdanew10(lambdanew3 lambdanew3Var) {
        this.write = lambdanew3Var;
        Objects.requireNonNull(lambdanew3Var, "majorType is null");
    }

    public final lambdanew3 read() {
        return this.write;
    }

    public final void write(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("tag number must be 0 or greater");
        }
        this.AudioAttributesCompatParcelizer = new lambdasetTrackSelector18(j);
    }

    public final void AudioAttributesCompatParcelizer(lambdasetTrackSelector18 lambdasettrackselector18) {
        Objects.requireNonNull(lambdasettrackselector18, "tag is null");
        this.AudioAttributesCompatParcelizer = lambdasettrackselector18;
    }

    public final lambdasetTrackSelector18 AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesCompatParcelizer != null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof lambdanew10) {
            lambdanew10 lambdanew10Var = (lambdanew10) obj;
            lambdasetTrackSelector18 lambdasettrackselector18 = this.AudioAttributesCompatParcelizer;
            if (lambdasettrackselector18 != null) {
                return lambdasettrackselector18.equals(lambdanew10Var.AudioAttributesCompatParcelizer) && this.write == lambdanew10Var.write;
            }
            if (lambdanew10Var.AudioAttributesCompatParcelizer == null && this.write == lambdanew10Var.write) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.write, this.AudioAttributesCompatParcelizer);
    }
}
