package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin._isBlank;
import kotlin._readAndBindStringKeyMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class VirtualLayout extends ConstraintHelper {
    private boolean AudioAttributesImplApi26Parcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;

    public void read(_readAndBindStringKeyMap _readandbindstringkeymap, int i, int i2) {
    }

    public VirtualLayout(Context context) {
        super(context);
    }

    public VirtualLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void AudioAttributesCompatParcelizer(AttributeSet attributeSet) {
        super.AudioAttributesCompatParcelizer(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, _isBlank.read.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == _isBlank.read.ConstraintLayout_Layout_android_visibility) {
                    this.AudioAttributesImplApi26Parcelizer = true;
                } else if (index == _isBlank.read.ConstraintLayout_Layout_android_elevation) {
                    this.MediaBrowserCompatCustomActionResultReceiver = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.AudioAttributesImplApi26Parcelizer || this.MediaBrowserCompatCustomActionResultReceiver) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.write; i++) {
                    View viewMediaBrowserCompatItemReceiver = constraintLayout.MediaBrowserCompatItemReceiver(this.IconCompatParcelizer[i]);
                    if (viewMediaBrowserCompatItemReceiver != null) {
                        if (this.AudioAttributesImplApi26Parcelizer) {
                            viewMediaBrowserCompatItemReceiver.setVisibility(visibility);
                        }
                        if (this.MediaBrowserCompatCustomActionResultReceiver && elevation > BitmapDescriptorFactory.HUE_RED) {
                            viewMediaBrowserCompatItemReceiver.setTranslationZ(viewMediaBrowserCompatItemReceiver.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        AudioAttributesImplBaseParcelizer();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        AudioAttributesImplBaseParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void IconCompatParcelizer(ConstraintLayout constraintLayout) {
        read(constraintLayout);
    }
}
