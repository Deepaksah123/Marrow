package kotlin;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: o.track, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC0213track implements Extractor {
    private BinarySearchSeekerSeekTimestampConverter AudioAttributesCompatParcelizer;
    private final DummyTrackOutput AudioAttributesImplApi21Parcelizer;
    private final Context IconCompatParcelizer;
    private final ArrayList<Animator.AnimatorListener> RemoteActionCompatParcelizer = new ArrayList<>();
    private BinarySearchSeekerSeekTimestampConverter read;
    private final ExtendedFloatingActionButton write;

    public AbstractC0213track(ExtendedFloatingActionButton extendedFloatingActionButton, DummyTrackOutput dummyTrackOutput) {
        this.write = extendedFloatingActionButton;
        this.IconCompatParcelizer = extendedFloatingActionButton.getContext();
        this.AudioAttributesImplApi21Parcelizer = dummyTrackOutput;
    }

    @Override // kotlin.Extractor
    public final void AudioAttributesCompatParcelizer(BinarySearchSeekerSeekTimestampConverter binarySearchSeekerSeekTimestampConverter) {
        this.AudioAttributesCompatParcelizer = binarySearchSeekerSeekTimestampConverter;
    }

    public final BinarySearchSeekerSeekTimestampConverter write() {
        BinarySearchSeekerSeekTimestampConverter binarySearchSeekerSeekTimestampConverter = this.AudioAttributesCompatParcelizer;
        if (binarySearchSeekerSeekTimestampConverter != null) {
            return binarySearchSeekerSeekTimestampConverter;
        }
        if (this.read == null) {
            this.read = BinarySearchSeekerSeekTimestampConverter.write(this.IconCompatParcelizer, MediaBrowserCompatCustomActionResultReceiver());
        }
        return (BinarySearchSeekerSeekTimestampConverter) StringCollectionDeserializer.RemoteActionCompatParcelizer(this.read);
    }

    @Override // kotlin.Extractor
    public final List<Animator.AnimatorListener> RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.Extractor
    public void write(Animator animator) {
        this.AudioAttributesImplApi21Parcelizer.read(animator);
    }

    @Override // kotlin.Extractor
    public void read() {
        this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.Extractor
    public void IconCompatParcelizer() {
        this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.Extractor
    public AnimatorSet AudioAttributesCompatParcelizer() {
        return read(write());
    }

    public final AnimatorSet read(BinarySearchSeekerSeekTimestampConverter binarySearchSeekerSeekTimestampConverter) {
        ArrayList arrayList = new ArrayList();
        if (binarySearchSeekerSeekTimestampConverter.IconCompatParcelizer("opacity")) {
            arrayList.add(binarySearchSeekerSeekTimestampConverter.read("opacity", this.write, View.ALPHA));
        }
        if (binarySearchSeekerSeekTimestampConverter.IconCompatParcelizer("scale")) {
            arrayList.add(binarySearchSeekerSeekTimestampConverter.read("scale", this.write, View.SCALE_Y));
            arrayList.add(binarySearchSeekerSeekTimestampConverter.read("scale", this.write, View.SCALE_X));
        }
        if (binarySearchSeekerSeekTimestampConverter.IconCompatParcelizer("width")) {
            arrayList.add(binarySearchSeekerSeekTimestampConverter.read("width", this.write, ExtendedFloatingActionButton.write));
        }
        if (binarySearchSeekerSeekTimestampConverter.IconCompatParcelizer("height")) {
            arrayList.add(binarySearchSeekerSeekTimestampConverter.read("height", this.write, ExtendedFloatingActionButton.read));
        }
        if (binarySearchSeekerSeekTimestampConverter.IconCompatParcelizer("paddingStart")) {
            arrayList.add(binarySearchSeekerSeekTimestampConverter.read("paddingStart", this.write, ExtendedFloatingActionButton.AudioAttributesCompatParcelizer));
        }
        if (binarySearchSeekerSeekTimestampConverter.IconCompatParcelizer("paddingEnd")) {
            arrayList.add(binarySearchSeekerSeekTimestampConverter.read("paddingEnd", this.write, ExtendedFloatingActionButton.RemoteActionCompatParcelizer));
        }
        if (binarySearchSeekerSeekTimestampConverter.IconCompatParcelizer("labelOpacity")) {
            arrayList.add(binarySearchSeekerSeekTimestampConverter.read("labelOpacity", this.write, new Property<ExtendedFloatingActionButton, Float>(Float.class, "LABEL_OPACITY_PROPERTY") { // from class: o.track.2
                /* JADX INFO: Access modifiers changed from: private */
                @Override // android.util.Property
                /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
                    return Float.valueOf(BinarySearchSeekerSeekOperationParams.read(BitmapDescriptorFactory.HUE_RED, 1.0f, (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.IconCompatParcelizer.getColorForState(extendedFloatingActionButton.getDrawableState(), AbstractC0213track.this.write.IconCompatParcelizer.getDefaultColor()))));
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // android.util.Property
                /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f) {
                    int colorForState = extendedFloatingActionButton.IconCompatParcelizer.getColorForState(extendedFloatingActionButton.getDrawableState(), AbstractC0213track.this.write.IconCompatParcelizer.getDefaultColor());
                    ColorStateList colorStateListValueOf = ColorStateList.valueOf(Color.argb((int) (BinarySearchSeekerSeekOperationParams.read(BitmapDescriptorFactory.HUE_RED, Color.alpha(colorForState) / 255.0f, f.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
                    if (f.floatValue() == 1.0f) {
                        extendedFloatingActionButton.AudioAttributesCompatParcelizer(extendedFloatingActionButton.IconCompatParcelizer);
                    } else {
                        extendedFloatingActionButton.AudioAttributesCompatParcelizer(colorStateListValueOf);
                    }
                }
            }));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        getCeilingBytePosition.IconCompatParcelizer(animatorSet, arrayList);
        return animatorSet;
    }
}
