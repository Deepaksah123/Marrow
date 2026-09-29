package kotlin;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.Property;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import kotlin.calculateNextSearchBytePosition;

/* JADX INFO: loaded from: classes5.dex */
public final class sampleMetadata extends sampleData {
    private StateListAnimator onCommand;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.sampleData
    public final void AudioAttributesImplBaseParcelizer() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.sampleData
    public final void RemoteActionCompatParcelizer(int[] iArr) {
    }

    @Override // kotlin.sampleData
    final boolean handleMediaPlayPauseIfPendingOnHandler() {
        return false;
    }

    @Override // kotlin.sampleData
    final void onCommand() {
    }

    public sampleMetadata(FloatingActionButton floatingActionButton, readVorbisModes readvorbismodes) {
        super(floatingActionButton, readvorbismodes);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.sampleData
    public final void read(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable layerDrawable;
        this.handleMediaPlayPauseIfPendingOnHandler = AudioAttributesCompatParcelizer();
        this.handleMediaPlayPauseIfPendingOnHandler.setTintList(colorStateList);
        if (mode != null) {
            this.handleMediaPlayPauseIfPendingOnHandler.setTintMode(mode);
        }
        this.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(this.onAddQueueItem.getContext());
        if (i > 0) {
            this.AudioAttributesImplApi21Parcelizer = IconCompatParcelizer(i, colorStateList);
            layerDrawable = new LayerDrawable(new Drawable[]{(Drawable) StringCollectionDeserializer.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer), (Drawable) StringCollectionDeserializer.RemoteActionCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler)});
        } else {
            this.AudioAttributesImplApi21Parcelizer = null;
            layerDrawable = this.handleMediaPlayPauseIfPendingOnHandler;
        }
        this.MediaBrowserCompatMediaItem = new RippleDrawable(outputPendingSampleMetadata.RemoteActionCompatParcelizer(colorStateList2), layerDrawable, null);
        this.AudioAttributesImplApi26Parcelizer = this.MediaBrowserCompatMediaItem;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.sampleData
    public final void AudioAttributesCompatParcelizer(ColorStateList colorStateList) {
        if (this.MediaBrowserCompatMediaItem instanceof RippleDrawable) {
            ((RippleDrawable) this.MediaBrowserCompatMediaItem).setColor(outputPendingSampleMetadata.RemoteActionCompatParcelizer(colorStateList));
        } else {
            super.AudioAttributesCompatParcelizer(colorStateList);
        }
    }

    @Override // kotlin.sampleData
    final void RemoteActionCompatParcelizer(float f, float f2, float f3) {
        if (this.onAddQueueItem.getStateListAnimator() == this.onCommand) {
            this.onCommand = IconCompatParcelizer(f, f2, f3);
            this.onAddQueueItem.setStateListAnimator(this.onCommand);
        }
        if (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            onMediaButtonEvent();
        }
    }

    private StateListAnimator IconCompatParcelizer(float f, float f2, float f3) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(MediaBrowserCompatItemReceiver, RemoteActionCompatParcelizer(f, f3));
        stateListAnimator.addState(MediaBrowserCompatCustomActionResultReceiver, RemoteActionCompatParcelizer(f, f2));
        stateListAnimator.addState(read, RemoteActionCompatParcelizer(f, f2));
        stateListAnimator.addState(AudioAttributesCompatParcelizer, RemoteActionCompatParcelizer(f, f2));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.onAddQueueItem, "elevation", f).setDuration(0L));
        arrayList.add(ObjectAnimator.ofFloat(this.onAddQueueItem, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, BitmapDescriptorFactory.HUE_RED).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(RemoteActionCompatParcelizer);
        stateListAnimator.addState(IconCompatParcelizer, animatorSet);
        stateListAnimator.addState(write, RemoteActionCompatParcelizer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
        return stateListAnimator;
    }

    private Animator RemoteActionCompatParcelizer(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.onAddQueueItem, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.onAddQueueItem, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(RemoteActionCompatParcelizer);
        return animatorSet;
    }

    @Override // kotlin.sampleData
    public final float read() {
        return this.onAddQueueItem.getElevation();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.sampleData
    public final void MediaDescriptionCompat() {
        onMediaButtonEvent();
    }

    @Override // kotlin.sampleData
    final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.MediaMetadataCompat.RemoteActionCompatParcelizer() || !onAddQueueItem();
    }

    private seek IconCompatParcelizer(int i, ColorStateList colorStateList) {
        Context context = this.onAddQueueItem.getContext();
        seek seekVar = new seek((isValidFrameType) StringCollectionDeserializer.RemoteActionCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver));
        seekVar.write(_isNaN.getColor(context, calculateNextSearchBytePosition.read.design_fab_stroke_top_outer_color), _isNaN.getColor(context, calculateNextSearchBytePosition.read.design_fab_stroke_top_inner_color), _isNaN.getColor(context, calculateNextSearchBytePosition.read.design_fab_stroke_end_inner_color), _isNaN.getColor(context, calculateNextSearchBytePosition.read.design_fab_stroke_end_outer_color));
        seekVar.AudioAttributesCompatParcelizer(i);
        seekVar.RemoteActionCompatParcelizer(colorStateList);
        return seekVar;
    }

    @Override // kotlin.sampleData
    final frameSizeBytesByTypeNb AudioAttributesCompatParcelizer() {
        return new RemoteActionCompatParcelizer((isValidFrameType) StringCollectionDeserializer.RemoteActionCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver));
    }

    @Override // kotlin.sampleData
    final void write(Rect rect) {
        if (this.MediaMetadataCompat.RemoteActionCompatParcelizer()) {
            super.write(rect);
        } else if (!onAddQueueItem()) {
            int iMediaBrowserCompatCustomActionResultReceiver = (this.MediaBrowserCompatSearchResultReceiver - this.onAddQueueItem.MediaBrowserCompatCustomActionResultReceiver()) / 2;
            rect.set(iMediaBrowserCompatCustomActionResultReceiver, iMediaBrowserCompatCustomActionResultReceiver, iMediaBrowserCompatCustomActionResultReceiver, iMediaBrowserCompatCustomActionResultReceiver);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    static class RemoteActionCompatParcelizer extends frameSizeBytesByTypeNb {
        @Override // kotlin.frameSizeBytesByTypeNb, android.graphics.drawable.Drawable
        public final boolean isStateful() {
            return true;
        }

        RemoteActionCompatParcelizer(isValidFrameType isvalidframetype) {
            super(isvalidframetype);
        }
    }
}
