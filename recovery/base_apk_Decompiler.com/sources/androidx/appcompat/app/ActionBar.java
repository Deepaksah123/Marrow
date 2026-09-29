package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin._init_lambda5;
import kotlin.onActivityResult;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActionBar {

    public interface read {
    }

    @Deprecated
    public static abstract class write {
        public abstract View AudioAttributesCompatParcelizer();

        public abstract CharSequence IconCompatParcelizer();

        public abstract Drawable RemoteActionCompatParcelizer();

        public abstract CharSequence write();
    }

    public abstract void AudioAttributesCompatParcelizer(int i);

    public void AudioAttributesCompatParcelizer(CharSequence charSequence) {
    }

    public void AudioAttributesCompatParcelizer(boolean z) {
    }

    public boolean AudioAttributesCompatParcelizer() {
        return false;
    }

    public void AudioAttributesImplBaseParcelizer() {
    }

    public Context IconCompatParcelizer() {
        return null;
    }

    public void IconCompatParcelizer(Configuration configuration) {
    }

    public void IconCompatParcelizer(boolean z) {
    }

    public void MediaBrowserCompatCustomActionResultReceiver() {
    }

    public boolean MediaBrowserCompatItemReceiver() {
        return false;
    }

    public abstract void RemoteActionCompatParcelizer(boolean z);

    public boolean RemoteActionCompatParcelizer() {
        return false;
    }

    public boolean RemoteActionCompatParcelizer(int i, KeyEvent keyEvent) {
        return false;
    }

    public abstract int read();

    public boolean read(KeyEvent keyEvent) {
        return false;
    }

    public onActivityResult write(onActivityResult.write writeVar) {
        return null;
    }

    public abstract void write(CharSequence charSequence);

    public void write(boolean z) {
    }

    public boolean write() {
        return false;
    }

    public void AudioAttributesImplApi21Parcelizer() {
        throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
    }

    public void AudioAttributesCompatParcelizer(float f) {
        if (f != BitmapDescriptorFactory.HUE_RED) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int write;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.write = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, _init_lambda5.AudioAttributesImplApi26Parcelizer.ActionBarLayout);
            this.write = typedArrayObtainStyledAttributes.getInt(_init_lambda5.AudioAttributesImplApi26Parcelizer.ActionBarLayout_android_layout_gravity, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(-2, -2);
            this.write = 8388627;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.write = 0;
            this.write = layoutParams.write;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.write = 0;
        }
    }
}
