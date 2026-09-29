package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.ReferenceTypeDeserializer;
import kotlin._isBlank;

/* JADX INFO: loaded from: classes2.dex */
public class Constraints extends ViewGroup {
    private ReferenceTypeDeserializer write;

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return RemoteActionCompatParcelizer();
    }

    public Constraints(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public static class LayoutParams extends ConstraintLayout.LayoutParams {
        public boolean addContentView;
        public float addMenuProvider;
        public float addOnConfigurationChangedListener;
        public float addOnContextAvailableListener;
        public float addOnMultiWindowModeChangedListener;
        public float addOnNewIntentListener;
        public float addOnPictureInPictureModeChangedListener;
        public float addOnTrimMemoryListener;
        public float addOnUserLeaveHintListener;
        public float getActivityResultRegistry;
        public float getDefaultViewModelCreationExtras;
        public float getDefaultViewModelProviderFactory;
        public float menuHostHelperlambda0;

        public LayoutParams() {
            super(-2, -2);
            this.addMenuProvider = 1.0f;
            this.addContentView = false;
            this.menuHostHelperlambda0 = BitmapDescriptorFactory.HUE_RED;
            this.addOnMultiWindowModeChangedListener = BitmapDescriptorFactory.HUE_RED;
            this.addOnContextAvailableListener = BitmapDescriptorFactory.HUE_RED;
            this.addOnPictureInPictureModeChangedListener = BitmapDescriptorFactory.HUE_RED;
            this.addOnConfigurationChangedListener = 1.0f;
            this.addOnNewIntentListener = 1.0f;
            this.addOnUserLeaveHintListener = BitmapDescriptorFactory.HUE_RED;
            this.getDefaultViewModelCreationExtras = BitmapDescriptorFactory.HUE_RED;
            this.addOnTrimMemoryListener = BitmapDescriptorFactory.HUE_RED;
            this.getDefaultViewModelProviderFactory = BitmapDescriptorFactory.HUE_RED;
            this.getActivityResultRegistry = BitmapDescriptorFactory.HUE_RED;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.addMenuProvider = 1.0f;
            this.addContentView = false;
            this.menuHostHelperlambda0 = BitmapDescriptorFactory.HUE_RED;
            this.addOnMultiWindowModeChangedListener = BitmapDescriptorFactory.HUE_RED;
            this.addOnContextAvailableListener = BitmapDescriptorFactory.HUE_RED;
            this.addOnPictureInPictureModeChangedListener = BitmapDescriptorFactory.HUE_RED;
            this.addOnConfigurationChangedListener = 1.0f;
            this.addOnNewIntentListener = 1.0f;
            this.addOnUserLeaveHintListener = BitmapDescriptorFactory.HUE_RED;
            this.getDefaultViewModelCreationExtras = BitmapDescriptorFactory.HUE_RED;
            this.addOnTrimMemoryListener = BitmapDescriptorFactory.HUE_RED;
            this.getDefaultViewModelProviderFactory = BitmapDescriptorFactory.HUE_RED;
            this.getActivityResultRegistry = BitmapDescriptorFactory.HUE_RED;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, _isBlank.read.ConstraintSet);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == _isBlank.read.ConstraintSet_android_alpha) {
                    this.addMenuProvider = typedArrayObtainStyledAttributes.getFloat(index, this.addMenuProvider);
                } else if (index == _isBlank.read.ConstraintSet_android_elevation) {
                    this.menuHostHelperlambda0 = typedArrayObtainStyledAttributes.getFloat(index, this.menuHostHelperlambda0);
                    this.addContentView = true;
                } else if (index == _isBlank.read.ConstraintSet_android_rotationX) {
                    this.addOnContextAvailableListener = typedArrayObtainStyledAttributes.getFloat(index, this.addOnContextAvailableListener);
                } else if (index == _isBlank.read.ConstraintSet_android_rotationY) {
                    this.addOnPictureInPictureModeChangedListener = typedArrayObtainStyledAttributes.getFloat(index, this.addOnPictureInPictureModeChangedListener);
                } else if (index == _isBlank.read.ConstraintSet_android_rotation) {
                    this.addOnMultiWindowModeChangedListener = typedArrayObtainStyledAttributes.getFloat(index, this.addOnMultiWindowModeChangedListener);
                } else if (index == _isBlank.read.ConstraintSet_android_scaleX) {
                    this.addOnConfigurationChangedListener = typedArrayObtainStyledAttributes.getFloat(index, this.addOnConfigurationChangedListener);
                } else if (index == _isBlank.read.ConstraintSet_android_scaleY) {
                    this.addOnNewIntentListener = typedArrayObtainStyledAttributes.getFloat(index, this.addOnNewIntentListener);
                } else if (index == _isBlank.read.ConstraintSet_android_transformPivotX) {
                    this.addOnUserLeaveHintListener = typedArrayObtainStyledAttributes.getFloat(index, this.addOnUserLeaveHintListener);
                } else if (index == _isBlank.read.ConstraintSet_android_transformPivotY) {
                    this.getDefaultViewModelCreationExtras = typedArrayObtainStyledAttributes.getFloat(index, this.getDefaultViewModelCreationExtras);
                } else if (index == _isBlank.read.ConstraintSet_android_translationX) {
                    this.addOnTrimMemoryListener = typedArrayObtainStyledAttributes.getFloat(index, this.addOnTrimMemoryListener);
                } else if (index == _isBlank.read.ConstraintSet_android_translationY) {
                    this.getDefaultViewModelProviderFactory = typedArrayObtainStyledAttributes.getFloat(index, this.getDefaultViewModelProviderFactory);
                } else if (index == _isBlank.read.ConstraintSet_android_translationZ) {
                    this.getActivityResultRegistry = typedArrayObtainStyledAttributes.getFloat(index, this.getActivityResultRegistry);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private static LayoutParams RemoteActionCompatParcelizer() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.LayoutParams(layoutParams);
    }

    public final ReferenceTypeDeserializer IconCompatParcelizer() {
        if (this.write == null) {
            this.write = new ReferenceTypeDeserializer();
        }
        this.write.RemoteActionCompatParcelizer(this);
        return this.write;
    }
}
