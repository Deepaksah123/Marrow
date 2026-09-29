package kotlin;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class onExperimentalOffloadedPlayback extends lambdasetMediaSourceFactory17 {
    private final float AudioAttributesCompatParcelizer;

    public onExperimentalOffloadedPlayback(lambdasetLoadControl19 lambdasetloadcontrol19, float f) {
        super(lambdasetloadcontrol19);
        this.AudioAttributesCompatParcelizer = f;
    }

    @Override // kotlin.lambdasetMediaSourceFactory17, kotlin.lambdanew10
    public boolean equals(Object obj) {
        if (obj instanceof onExperimentalOffloadedPlayback) {
            return super.equals(obj) && this.AudioAttributesCompatParcelizer == ((onExperimentalOffloadedPlayback) obj).AudioAttributesCompatParcelizer;
        }
        return false;
    }

    @Override // kotlin.lambdasetMediaSourceFactory17, kotlin.lambdanew10
    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.AudioAttributesCompatParcelizer)) ^ super.hashCode();
    }
}
