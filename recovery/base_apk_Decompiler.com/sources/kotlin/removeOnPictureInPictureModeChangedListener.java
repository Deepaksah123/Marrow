package kotlin;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin._init_lambda5;

/* JADX INFO: loaded from: classes.dex */
public abstract class removeOnPictureInPictureModeChangedListener extends ViewGroup {
    protected final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    protected findTransient AudioAttributesImplBaseParcelizer;
    public ActionMenuView IconCompatParcelizer;
    private boolean MediaBrowserCompatItemReceiver;
    public int RemoteActionCompatParcelizer;
    public final Context read;
    public ActionMenuPresenter write;

    protected static int IconCompatParcelizer(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public removeOnPictureInPictureModeChangedListener(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(_init_lambda5.read.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.read = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.read = context;
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, _init_lambda5.AudioAttributesImplApi26Parcelizer.ActionBar, _init_lambda5.read.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(_init_lambda5.AudioAttributesImplApi26Parcelizer.ActionBar_height, 0));
        typedArrayObtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.write;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.MediaBrowserCompatCustomActionResultReceiver();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.AudioAttributesImplApi26Parcelizer = false;
        }
        if (!this.AudioAttributesImplApi26Parcelizer) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.AudioAttributesImplApi26Parcelizer = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.AudioAttributesImplApi26Parcelizer = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.MediaBrowserCompatItemReceiver = false;
        }
        if (!this.MediaBrowserCompatItemReceiver) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.MediaBrowserCompatItemReceiver = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.MediaBrowserCompatItemReceiver = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.RemoteActionCompatParcelizer = i;
        requestLayout();
    }

    public findTransient write(int i, long j) {
        findTransient findtransient = this.AudioAttributesImplBaseParcelizer;
        if (findtransient != null) {
            findtransient.write();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(BitmapDescriptorFactory.HUE_RED);
            }
            findTransient findtransient2 = InvalidTypeIdException.AudioAttributesCompatParcelizer(this).read(1.0f);
            findtransient2.write(j);
            findtransient2.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.write(findtransient2, i));
            return findtransient2;
        }
        findTransient findtransient3 = InvalidTypeIdException.AudioAttributesCompatParcelizer(this).read(BitmapDescriptorFactory.HUE_RED);
        findtransient3.write(j);
        findtransient3.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.write(findtransient3, i));
        return findtransient3;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            findTransient findtransient = this.AudioAttributesImplBaseParcelizer;
            if (findtransient != null) {
                findtransient.write();
            }
            super.setVisibility(i);
        }
    }

    public boolean read() {
        ActionMenuPresenter actionMenuPresenter = this.write;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.MediaBrowserCompatSearchResultReceiver();
        }
        return false;
    }

    protected static int write(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    protected static int read(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    protected class RemoteActionCompatParcelizer implements NioPathDeserializer {
        private int AudioAttributesCompatParcelizer;
        private boolean RemoteActionCompatParcelizer = false;

        protected RemoteActionCompatParcelizer() {
        }

        public final RemoteActionCompatParcelizer write(findTransient findtransient, int i) {
            removeOnPictureInPictureModeChangedListener.this.AudioAttributesImplBaseParcelizer = findtransient;
            this.AudioAttributesCompatParcelizer = i;
            return this;
        }

        @Override // kotlin.NioPathDeserializer
        public final void read(View view) {
            removeOnPictureInPictureModeChangedListener.super.setVisibility(0);
            this.RemoteActionCompatParcelizer = false;
        }

        @Override // kotlin.NioPathDeserializer
        public final void RemoteActionCompatParcelizer(View view) {
            if (this.RemoteActionCompatParcelizer) {
                return;
            }
            removeOnPictureInPictureModeChangedListener.this.AudioAttributesImplBaseParcelizer = null;
            removeOnPictureInPictureModeChangedListener.super.setVisibility(this.AudioAttributesCompatParcelizer);
        }

        @Override // kotlin.NioPathDeserializer
        public final void IconCompatParcelizer(View view) {
            this.RemoteActionCompatParcelizer = true;
        }
    }
}
