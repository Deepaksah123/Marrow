package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import kotlin.addCancellable;
import kotlin.handleOnBackCancelled;
import kotlin.setCheckable;
import kotlin.setPositiveButton;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageView extends ImageView {
    private final handleOnBackCancelled RemoteActionCompatParcelizer;
    private final addCancellable read;
    private boolean write;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(setCheckable.read(context), attributeSet, i);
        this.write = false;
        setPositiveButton.IconCompatParcelizer(this, getContext());
        addCancellable addcancellable = new addCancellable(this);
        this.read = addcancellable;
        addcancellable.IconCompatParcelizer(attributeSet, i);
        handleOnBackCancelled handleonbackcancelled = new handleOnBackCancelled(this);
        this.RemoteActionCompatParcelizer = handleonbackcancelled;
        handleonbackcancelled.RemoteActionCompatParcelizer(attributeSet, i);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        handleOnBackCancelled handleonbackcancelled = this.RemoteActionCompatParcelizer;
        if (handleonbackcancelled != null) {
            handleonbackcancelled.IconCompatParcelizer(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        handleOnBackCancelled handleonbackcancelled = this.RemoteActionCompatParcelizer;
        if (handleonbackcancelled != null && drawable != null && !this.write) {
            handleonbackcancelled.AudioAttributesCompatParcelizer(drawable);
        }
        super.setImageDrawable(drawable);
        handleOnBackCancelled handleonbackcancelled2 = this.RemoteActionCompatParcelizer;
        if (handleonbackcancelled2 != null) {
            handleonbackcancelled2.IconCompatParcelizer();
            if (this.write) {
                return;
            }
            this.RemoteActionCompatParcelizer.read();
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        handleOnBackCancelled handleonbackcancelled = this.RemoteActionCompatParcelizer;
        if (handleonbackcancelled != null) {
            handleonbackcancelled.IconCompatParcelizer();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        handleOnBackCancelled handleonbackcancelled = this.RemoteActionCompatParcelizer;
        if (handleonbackcancelled != null) {
            handleonbackcancelled.IconCompatParcelizer();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        addCancellable addcancellable = this.read;
        if (addcancellable != null) {
            addcancellable.write(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        addCancellable addcancellable = this.read;
        if (addcancellable != null) {
            addcancellable.AudioAttributesCompatParcelizer(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        addCancellable addcancellable = this.read;
        if (addcancellable != null) {
            addcancellable.AudioAttributesCompatParcelizer(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        addCancellable addcancellable = this.read;
        if (addcancellable != null) {
            addcancellable.RemoteActionCompatParcelizer(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        handleOnBackCancelled handleonbackcancelled = this.RemoteActionCompatParcelizer;
        if (handleonbackcancelled != null) {
            handleonbackcancelled.RemoteActionCompatParcelizer(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        handleOnBackCancelled handleonbackcancelled = this.RemoteActionCompatParcelizer;
        if (handleonbackcancelled != null) {
            handleonbackcancelled.IconCompatParcelizer(mode);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        addCancellable addcancellable = this.read;
        if (addcancellable != null) {
            addcancellable.read();
        }
        handleOnBackCancelled handleonbackcancelled = this.RemoteActionCompatParcelizer;
        if (handleonbackcancelled != null) {
            handleonbackcancelled.IconCompatParcelizer();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer() && super.hasOverlappingRendering();
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.write = true;
    }
}
