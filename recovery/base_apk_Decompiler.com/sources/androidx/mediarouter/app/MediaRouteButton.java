package androidx.mediarouter.app;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import kotlin.C0185kotlinModule;
import kotlin.ExtensionsKtkotlinModule1;
import kotlin.PrivateMaxEntriesMapNode;
import kotlin.PrivateMaxEntriesMapValues;
import kotlin.findFormatOverrides;
import kotlin.getAccessible;
import kotlin.getCallable;
import kotlin.isAlive;
import kotlin.maybeGetTypeVariable;

/* JADX INFO: loaded from: classes4.dex */
public class MediaRouteButton extends View {
    static final SparseArray<Drawable.ConstantState> AudioAttributesCompatParcelizer = new SparseArray<>(2);
    private static final int[] IconCompatParcelizer = {R.attr.state_checked};
    private static final int[] write = {R.attr.state_checkable};
    private int AudioAttributesImplApi21Parcelizer;
    private final write AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private getCallable MediaBrowserCompatCustomActionResultReceiver;
    private ColorStateList MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatMediaItem;
    private Drawable MediaBrowserCompatSearchResultReceiver;
    private C0185kotlinModule MediaDescriptionCompat;
    private final ExtensionsKtkotlinModule1 MediaMetadataCompat;
    private boolean RatingCompat;
    RemoteActionCompatParcelizer RemoteActionCompatParcelizer;
    private boolean read;

    public MediaRouteButton(Context context) {
        this(context, null);
    }

    public MediaRouteButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, PrivateMaxEntriesMapNode.RemoteActionCompatParcelizer.mediaRouteButtonStyle);
    }

    public MediaRouteButton(Context context, AttributeSet attributeSet, int i) {
        super(getAccessible.read(context), attributeSet, i);
        this.MediaDescriptionCompat = C0185kotlinModule.read;
        this.MediaBrowserCompatCustomActionResultReceiver = getCallable.write();
        Context context2 = getContext();
        this.MediaMetadataCompat = ExtensionsKtkotlinModule1.write(context2);
        this.AudioAttributesImplApi26Parcelizer = new write();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, PrivateMaxEntriesMapNode.AudioAttributesImplApi21Parcelizer.MediaRouteButton, i, 0);
        this.MediaBrowserCompatItemReceiver = typedArrayObtainStyledAttributes.getColorStateList(PrivateMaxEntriesMapNode.AudioAttributesImplApi21Parcelizer.MediaRouteButton_mediaRouteButtonTint);
        this.MediaBrowserCompatMediaItem = typedArrayObtainStyledAttributes.getDimensionPixelSize(PrivateMaxEntriesMapNode.AudioAttributesImplApi21Parcelizer.MediaRouteButton_android_minWidth, 0);
        this.AudioAttributesImplApi21Parcelizer = typedArrayObtainStyledAttributes.getDimensionPixelSize(PrivateMaxEntriesMapNode.AudioAttributesImplApi21Parcelizer.MediaRouteButton_android_minHeight, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(PrivateMaxEntriesMapNode.AudioAttributesImplApi21Parcelizer.MediaRouteButton_externalRouteEnabledDrawable, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (resourceId != 0) {
            Drawable.ConstantState constantState = AudioAttributesCompatParcelizer.get(resourceId);
            if (constantState != null) {
                setRemoteIndicatorDrawable(constantState.newDrawable());
            } else {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(resourceId);
                this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
                remoteActionCompatParcelizer.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            }
        }
        read();
        setClickable(true);
    }

    public void setRouteSelector(C0185kotlinModule c0185kotlinModule) {
        if (c0185kotlinModule == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.MediaDescriptionCompat.equals(c0185kotlinModule)) {
            return;
        }
        if (this.read) {
            if (!this.MediaDescriptionCompat.write()) {
                this.MediaMetadataCompat.read(this.AudioAttributesImplApi26Parcelizer);
            }
            if (!c0185kotlinModule.write()) {
                this.MediaMetadataCompat.RemoteActionCompatParcelizer(c0185kotlinModule, this.AudioAttributesImplApi26Parcelizer);
            }
        }
        this.MediaDescriptionCompat = c0185kotlinModule;
        RemoteActionCompatParcelizer();
    }

    public void setDialogFactory(getCallable getcallable) {
        if (getcallable == null) {
            throw new IllegalArgumentException("factory must not be null");
        }
        this.MediaBrowserCompatCustomActionResultReceiver = getcallable;
    }

    private boolean AudioAttributesCompatParcelizer() {
        if (!this.read) {
            return false;
        }
        FragmentManager fragmentManagerWrite = write();
        if (fragmentManagerWrite == null) {
            throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
        }
        ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = ExtensionsKtkotlinModule1.read();
        if (mediaBrowserCompatCustomActionResultReceiver.handleMediaPlayPauseIfPendingOnHandler() || !mediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(this.MediaDescriptionCompat)) {
            if (fragmentManagerWrite.findFragmentByTag("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") != null) {
                return false;
            }
            isAlive isalive = getCallable.read();
            isalive.RemoteActionCompatParcelizer(this.MediaDescriptionCompat);
            isalive.show(fragmentManagerWrite, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment");
            return true;
        }
        if (fragmentManagerWrite.findFragmentByTag("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") != null) {
            return false;
        }
        PrivateMaxEntriesMapValues privateMaxEntriesMapValuesRemoteActionCompatParcelizer = getCallable.RemoteActionCompatParcelizer();
        privateMaxEntriesMapValuesRemoteActionCompatParcelizer.write(this.MediaDescriptionCompat);
        privateMaxEntriesMapValuesRemoteActionCompatParcelizer.show(fragmentManagerWrite, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment");
        return true;
    }

    private FragmentManager write() {
        Activity activityIconCompatParcelizer = IconCompatParcelizer();
        if (activityIconCompatParcelizer instanceof maybeGetTypeVariable) {
            return ((maybeGetTypeVariable) activityIconCompatParcelizer).getSupportFragmentManager();
        }
        return null;
    }

    private Activity IconCompatParcelizer() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    @Override // android.view.View
    public boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        return AudioAttributesCompatParcelizer() || zPerformClick;
    }

    @Override // android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.AudioAttributesImplBaseParcelizer) {
            mergeDrawableStates(iArrOnCreateDrawableState, write);
            return iArrOnCreateDrawableState;
        }
        if (this.RatingCompat) {
            mergeDrawableStates(iArrOnCreateDrawableState, IconCompatParcelizer);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.MediaBrowserCompatSearchResultReceiver != null) {
            this.MediaBrowserCompatSearchResultReceiver.setState(getDrawableState());
            invalidate();
        }
    }

    public void setRemoteIndicatorDrawable(Drawable drawable) {
        Drawable drawable2;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.RemoteActionCompatParcelizer;
        if (remoteActionCompatParcelizer != null) {
            remoteActionCompatParcelizer.cancel(false);
        }
        Drawable drawable3 = this.MediaBrowserCompatSearchResultReceiver;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.MediaBrowserCompatSearchResultReceiver);
        }
        if (drawable != null) {
            if (this.MediaBrowserCompatItemReceiver != null) {
                drawable = findFormatOverrides.AudioAttributesImplApi26Parcelizer(drawable.mutate());
                findFormatOverrides.AudioAttributesCompatParcelizer(drawable, this.MediaBrowserCompatItemReceiver);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
        }
        this.MediaBrowserCompatSearchResultReceiver = drawable;
        refreshDrawableState();
        if (this.read && (drawable2 = this.MediaBrowserCompatSearchResultReceiver) != null && (drawable2.getCurrent() instanceof AnimationDrawable)) {
            AnimationDrawable animationDrawable = (AnimationDrawable) this.MediaBrowserCompatSearchResultReceiver.getCurrent();
            if (this.AudioAttributesImplBaseParcelizer) {
                if (animationDrawable.isRunning()) {
                    return;
                }
                animationDrawable.start();
            } else if (this.RatingCompat) {
                if (animationDrawable.isRunning()) {
                    animationDrawable.stop();
                }
                animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
            }
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.MediaBrowserCompatSearchResultReceiver;
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        if (getBackground() != null) {
            findFormatOverrides.AudioAttributesImplBaseParcelizer(getBackground());
        }
        Drawable drawable = this.MediaBrowserCompatSearchResultReceiver;
        if (drawable != null) {
            findFormatOverrides.AudioAttributesImplBaseParcelizer(drawable);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        Drawable drawable = this.MediaBrowserCompatSearchResultReceiver;
        if (drawable != null) {
            drawable.setVisible(getVisibility() == 0, false);
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.read = true;
        if (!this.MediaDescriptionCompat.write()) {
            this.MediaMetadataCompat.RemoteActionCompatParcelizer(this.MediaDescriptionCompat, this.AudioAttributesImplApi26Parcelizer);
        }
        RemoteActionCompatParcelizer();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        this.read = false;
        if (!this.MediaDescriptionCompat.write()) {
            this.MediaMetadataCompat.read(this.AudioAttributesImplApi26Parcelizer);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i3 = this.MediaBrowserCompatMediaItem;
        Drawable drawable = this.MediaBrowserCompatSearchResultReceiver;
        int iMax = Math.max(i3, drawable != null ? drawable.getIntrinsicWidth() + getPaddingLeft() + getPaddingRight() : 0);
        int i4 = this.AudioAttributesImplApi21Parcelizer;
        Drawable drawable2 = this.MediaBrowserCompatSearchResultReceiver;
        int iMax2 = Math.max(i4, drawable2 != null ? drawable2.getIntrinsicHeight() + getPaddingTop() + getPaddingBottom() : 0);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, iMax);
        } else if (mode != 1073741824) {
            size = iMax;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, iMax2);
        } else if (mode2 != 1073741824) {
            size2 = iMax2;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.MediaBrowserCompatSearchResultReceiver != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth();
            int paddingRight = getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight();
            int paddingBottom = getPaddingBottom();
            int intrinsicWidth = this.MediaBrowserCompatSearchResultReceiver.getIntrinsicWidth();
            int intrinsicHeight = this.MediaBrowserCompatSearchResultReceiver.getIntrinsicHeight();
            int i = paddingLeft + ((((width - paddingRight) - paddingLeft) - intrinsicWidth) / 2);
            int i2 = paddingTop + ((((height - paddingBottom) - paddingTop) - intrinsicHeight) / 2);
            this.MediaBrowserCompatSearchResultReceiver.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.MediaBrowserCompatSearchResultReceiver.draw(canvas);
        }
    }

    final void RemoteActionCompatParcelizer() {
        ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = ExtensionsKtkotlinModule1.read();
        boolean z = false;
        boolean z2 = !mediaBrowserCompatCustomActionResultReceiver.handleMediaPlayPauseIfPendingOnHandler() && mediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(this.MediaDescriptionCompat);
        boolean z3 = z2 && mediaBrowserCompatCustomActionResultReceiver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        if (this.RatingCompat != z2) {
            this.RatingCompat = z2;
            z = true;
        }
        if (this.AudioAttributesImplBaseParcelizer != z3) {
            this.AudioAttributesImplBaseParcelizer = z3;
            z = true;
        }
        if (z) {
            read();
            refreshDrawableState();
        }
        if (this.read) {
            setEnabled(ExtensionsKtkotlinModule1.RemoteActionCompatParcelizer(this.MediaDescriptionCompat));
        }
        Drawable drawable = this.MediaBrowserCompatSearchResultReceiver;
        if (drawable == null || !(drawable.getCurrent() instanceof AnimationDrawable)) {
            return;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) this.MediaBrowserCompatSearchResultReceiver.getCurrent();
        if (this.read) {
            if ((z || z3) && !animationDrawable.isRunning()) {
                animationDrawable.start();
                return;
            }
            return;
        }
        if (!z2 || z3) {
            return;
        }
        if (animationDrawable.isRunning()) {
            animationDrawable.stop();
        }
        animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
    }

    private void read() {
        int i;
        if (this.AudioAttributesImplBaseParcelizer) {
            i = PrivateMaxEntriesMapNode.MediaBrowserCompatItemReceiver.mr_cast_button_connecting;
        } else if (this.RatingCompat) {
            i = PrivateMaxEntriesMapNode.MediaBrowserCompatItemReceiver.mr_cast_button_connected;
        } else {
            i = PrivateMaxEntriesMapNode.MediaBrowserCompatItemReceiver.mr_cast_button_disconnected;
        }
        setContentDescription(getContext().getString(i));
    }

    final class write extends ExtensionsKtkotlinModule1.IconCompatParcelizer {
        write() {
        }

        @Override // o.ExtensionsKtkotlinModule1.IconCompatParcelizer
        public final void read() {
            MediaRouteButton.this.RemoteActionCompatParcelizer();
        }

        @Override // o.ExtensionsKtkotlinModule1.IconCompatParcelizer
        public final void MediaBrowserCompatItemReceiver() {
            MediaRouteButton.this.RemoteActionCompatParcelizer();
        }

        @Override // o.ExtensionsKtkotlinModule1.IconCompatParcelizer
        public final void AudioAttributesCompatParcelizer() {
            MediaRouteButton.this.RemoteActionCompatParcelizer();
        }

        @Override // o.ExtensionsKtkotlinModule1.IconCompatParcelizer
        public final void MediaBrowserCompatCustomActionResultReceiver() {
            MediaRouteButton.this.RemoteActionCompatParcelizer();
        }

        @Override // o.ExtensionsKtkotlinModule1.IconCompatParcelizer
        public final void AudioAttributesImplBaseParcelizer() {
            MediaRouteButton.this.RemoteActionCompatParcelizer();
        }

        @Override // o.ExtensionsKtkotlinModule1.IconCompatParcelizer
        public final void IconCompatParcelizer() {
            MediaRouteButton.this.RemoteActionCompatParcelizer();
        }

        @Override // o.ExtensionsKtkotlinModule1.IconCompatParcelizer
        public final void write() {
            MediaRouteButton.this.RemoteActionCompatParcelizer();
        }

        @Override // o.ExtensionsKtkotlinModule1.IconCompatParcelizer
        public final void RemoteActionCompatParcelizer() {
            MediaRouteButton.this.RemoteActionCompatParcelizer();
        }
    }

    final class RemoteActionCompatParcelizer extends AsyncTask<Void, Void, Drawable> {
        private final int AudioAttributesCompatParcelizer;

        @Override // android.os.AsyncTask
        protected final /* synthetic */ Drawable doInBackground(Void[] voidArr) {
            return write();
        }

        RemoteActionCompatParcelizer(int i) {
            this.AudioAttributesCompatParcelizer = i;
        }

        private Drawable write() {
            return MediaRouteButton.this.getContext().getResources().getDrawable(this.AudioAttributesCompatParcelizer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Drawable drawable) {
            IconCompatParcelizer(drawable);
            MediaRouteButton.this.setRemoteIndicatorDrawable(drawable);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public void onCancelled(Drawable drawable) {
            IconCompatParcelizer(drawable);
        }

        private void IconCompatParcelizer(Drawable drawable) {
            if (drawable != null) {
                MediaRouteButton.AudioAttributesCompatParcelizer.put(this.AudioAttributesCompatParcelizer, drawable.getConstantState());
            }
            MediaRouteButton.this.RemoteActionCompatParcelizer = null;
        }
    }
}
