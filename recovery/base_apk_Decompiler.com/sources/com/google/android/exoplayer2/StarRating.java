package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.parseSmta;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class StarRating extends Rating {
    private static final int MAX_STARS_DEFAULT = 5;
    private static final int TYPE = 2;
    private final int maxStars;
    private final float starRating;
    private static final String FIELD_MAX_STARS = Util.intToStringMaxRadix(1);
    private static final String FIELD_STAR_RATING = Util.intToStringMaxRadix(2);
    public static final Bundleable.Creator<StarRating> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.StarRating$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return StarRating.fromBundle(bundle);
        }
    };

    public StarRating(int i) {
        Assertions.checkArgument(i > 0, "maxStars must be a positive integer");
        this.maxStars = i;
        this.starRating = -1.0f;
    }

    public StarRating(int i, float f) {
        Assertions.checkArgument(i > 0, "maxStars must be a positive integer");
        Assertions.checkArgument(f >= BitmapDescriptorFactory.HUE_RED && f <= ((float) i), "starRating is out of range [0, maxStars]");
        this.maxStars = i;
        this.starRating = f;
    }

    @Override // com.google.android.exoplayer2.Rating
    public final boolean isRated() {
        return this.starRating != -1.0f;
    }

    public final int getMaxStars() {
        return this.maxStars;
    }

    public final float getStarRating() {
        return this.starRating;
    }

    public final int hashCode() {
        return parseSmta.read(Integer.valueOf(this.maxStars), Float.valueOf(this.starRating));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof StarRating)) {
            return false;
        }
        StarRating starRating = (StarRating) obj;
        return this.maxStars == starRating.maxStars && this.starRating == starRating.starRating;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(FIELD_RATING_TYPE, 2);
        bundle.putInt(FIELD_MAX_STARS, this.maxStars);
        bundle.putFloat(FIELD_STAR_RATING, this.starRating);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static StarRating fromBundle(Bundle bundle) {
        Assertions.checkArgument(bundle.getInt(FIELD_RATING_TYPE, -1) == 2);
        int i = bundle.getInt(FIELD_MAX_STARS, 5);
        float f = bundle.getFloat(FIELD_STAR_RATING, -1.0f);
        if (f == -1.0f) {
            return new StarRating(i);
        }
        return new StarRating(i, f);
    }
}
