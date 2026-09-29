package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import kotlin.parseSmta;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class HeartRating extends Rating {
    private static final int TYPE = 0;
    private final boolean isHeart;
    private final boolean rated;
    private static final String FIELD_RATED = Util.intToStringMaxRadix(1);
    private static final String FIELD_IS_HEART = Util.intToStringMaxRadix(2);
    public static final Bundleable.Creator<HeartRating> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.HeartRating$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return HeartRating.fromBundle(bundle);
        }
    };

    public HeartRating() {
        this.rated = false;
        this.isHeart = false;
    }

    public HeartRating(boolean z) {
        this.rated = true;
        this.isHeart = z;
    }

    @Override // com.google.android.exoplayer2.Rating
    public final boolean isRated() {
        return this.rated;
    }

    public final boolean isHeart() {
        return this.isHeart;
    }

    public final int hashCode() {
        return parseSmta.read(Boolean.valueOf(this.rated), Boolean.valueOf(this.isHeart));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof HeartRating)) {
            return false;
        }
        HeartRating heartRating = (HeartRating) obj;
        return this.isHeart == heartRating.isHeart && this.rated == heartRating.rated;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(FIELD_RATING_TYPE, 0);
        bundle.putBoolean(FIELD_RATED, this.rated);
        bundle.putBoolean(FIELD_IS_HEART, this.isHeart);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HeartRating fromBundle(Bundle bundle) {
        Assertions.checkArgument(bundle.getInt(FIELD_RATING_TYPE, -1) == 0);
        if (bundle.getBoolean(FIELD_RATED, false)) {
            return new HeartRating(bundle.getBoolean(FIELD_IS_HEART, false));
        }
        return new HeartRating();
    }
}
