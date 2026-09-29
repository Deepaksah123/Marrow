package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class PlaybackParameters implements Bundleable {
    public final float pitch;
    private final int scaledUsPerMs;
    public final float speed;
    public static final PlaybackParameters DEFAULT = new PlaybackParameters(1.0f);
    private static final String FIELD_SPEED = Util.intToStringMaxRadix(0);
    private static final String FIELD_PITCH = Util.intToStringMaxRadix(1);
    public static final Bundleable.Creator<PlaybackParameters> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.PlaybackParameters$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return PlaybackParameters.lambda$static$0(bundle);
        }
    };

    public PlaybackParameters(float f) {
        this(f, 1.0f);
    }

    public PlaybackParameters(float f, float f2) {
        Assertions.checkArgument(f > BitmapDescriptorFactory.HUE_RED);
        Assertions.checkArgument(f2 > BitmapDescriptorFactory.HUE_RED);
        this.speed = f;
        this.pitch = f2;
        this.scaledUsPerMs = Math.round(f * 1000.0f);
    }

    public final long getMediaTimeUsForPlayoutTimeMs(long j) {
        return j * ((long) this.scaledUsPerMs);
    }

    public final PlaybackParameters withSpeed(float f) {
        return new PlaybackParameters(f, this.pitch);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PlaybackParameters playbackParameters = (PlaybackParameters) obj;
        return this.speed == playbackParameters.speed && this.pitch == playbackParameters.pitch;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.speed) + 527) * 31) + Float.floatToRawIntBits(this.pitch);
    }

    public final String toString() {
        return Util.formatInvariant("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.speed), Float.valueOf(this.pitch));
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putFloat(FIELD_SPEED, this.speed);
        bundle.putFloat(FIELD_PITCH, this.pitch);
        return bundle;
    }

    static /* synthetic */ PlaybackParameters lambda$static$0(Bundle bundle) {
        return new PlaybackParameters(bundle.getFloat(FIELD_SPEED, 1.0f), bundle.getFloat(FIELD_PITCH, 1.0f));
    }
}
