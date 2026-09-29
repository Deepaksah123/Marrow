package kotlin;

import android.R;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.calculateNextSearchBytePosition;

/* JADX INFO: loaded from: classes5.dex */
public final class searchForTimestamp {
    private static final int[] RemoteActionCompatParcelizer = {R.attr.stateListAnimator};

    searchForTimestamp() {
    }

    public static void RemoteActionCompatParcelizer(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    public static void read(View view, AttributeSet attributeSet, int i, int i2) {
        Context context = view.getContext();
        TypedArray typedArrayWrite = readId3Metadata.write(context, attributeSet, RemoteActionCompatParcelizer, i, i2, new int[0]);
        try {
            if (typedArrayWrite.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, typedArrayWrite.getResourceId(0, 0)));
            }
        } finally {
            typedArrayWrite.recycle();
        }
    }

    public static void AudioAttributesCompatParcelizer(View view, float f) {
        int integer = view.getResources().getInteger(calculateNextSearchBytePosition.AudioAttributesImplApi21Parcelizer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, calculateNextSearchBytePosition.IconCompatParcelizer.state_liftable, -calculateNextSearchBytePosition.IconCompatParcelizer.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", BitmapDescriptorFactory.HUE_RED).setDuration(j));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(view, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", BitmapDescriptorFactory.HUE_RED).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}
