package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.parseSmta;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class PercentageRating extends Rating {
    private static final int TYPE = 1;
    private final float percent;
    private static final String FIELD_PERCENT = Util.intToStringMaxRadix(1);
    public static final Bundleable.Creator<PercentageRating> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.PercentageRating$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return PercentageRating.fromBundle(bundle);
        }
    };

    public PercentageRating() {
        this.percent = -1.0f;
    }

    public PercentageRating(float f) {
        Assertions.checkArgument(f >= BitmapDescriptorFactory.HUE_RED && f <= 100.0f, "percent must be in the range of [0, 100]");
        this.percent = f;
    }

    @Override // com.google.android.exoplayer2.Rating
    public final boolean isRated() {
        return this.percent != -1.0f;
    }

    public final float getPercent() {
        return this.percent;
    }

    public final int hashCode() {
        return parseSmta.read(Float.valueOf(this.percent));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof PercentageRating) && this.percent == ((PercentageRating) obj).percent;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(FIELD_RATING_TYPE, 1);
        bundle.putFloat(FIELD_PERCENT, this.percent);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static PercentageRating fromBundle(Bundle bundle) {
        Assertions.checkArgument(bundle.getInt(FIELD_RATING_TYPE, -1) == 1);
        float f = bundle.getFloat(FIELD_PERCENT, -1.0f);
        return f == -1.0f ? new PercentageRating() : new PercentageRating(f);
    }
}
