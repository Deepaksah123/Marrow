package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import kotlin.AnnotatedClassCreators;
import kotlin._init_lambda5;
import kotlin.setTitle;

/* JADX INFO: loaded from: classes.dex */
class AppCompatPopupWindow extends PopupWindow {
    private static final boolean IconCompatParcelizer = false;
    private boolean write;

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AudioAttributesCompatParcelizer(context, attributeSet, i, 0);
    }

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        AudioAttributesCompatParcelizer(context, attributeSet, i, i2);
    }

    private void AudioAttributesCompatParcelizer(Context context, AttributeSet attributeSet, int i, int i2) {
        setTitle settitle = setTitle.read(context, attributeSet, _init_lambda5.AudioAttributesImplApi26Parcelizer.PopupWindow, i, i2);
        if (settitle.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.PopupWindow_overlapAnchor)) {
            IconCompatParcelizer(settitle.AudioAttributesCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(settitle.IconCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.PopupWindow_android_popupBackground));
        settitle.write();
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (IconCompatParcelizer && this.write) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (IconCompatParcelizer && this.write) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (IconCompatParcelizer && this.write) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    private void IconCompatParcelizer(boolean z) {
        if (IconCompatParcelizer) {
            this.write = z;
        } else {
            AnnotatedClassCreators.read(this, z);
        }
    }
}
