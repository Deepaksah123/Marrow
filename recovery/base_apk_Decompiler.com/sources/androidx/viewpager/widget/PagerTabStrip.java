package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import kotlin._isNaN;

/* JADX INFO: loaded from: classes4.dex */
public class PagerTabStrip extends PagerTitleStrip {
    private boolean AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatMediaItem;
    private float MediaBrowserCompatSearchResultReceiver;
    private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private int MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private float RatingCompat;
    private final Paint handleMediaPlayPauseIfPendingOnHandler;
    private int onAddQueueItem;
    private int onCommand;
    private int onCustomAction;
    private final Rect onFastForward;
    private int onPlay;

    public PagerTabStrip(Context context) {
        this(context, null);
    }

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.handleMediaPlayPauseIfPendingOnHandler = paint;
        this.onFastForward = new Rect();
        this.onCustomAction = 255;
        this.AudioAttributesImplBaseParcelizer = false;
        this.MediaBrowserCompatCustomActionResultReceiver = false;
        int i = this.AudioAttributesImplApi21Parcelizer;
        this.MediaDescriptionCompat = i;
        paint.setColor(i);
        float f = context.getResources().getDisplayMetrics().density;
        this.MediaBrowserCompatMediaItem = (int) ((3.0f * f) + 0.5f);
        this.MediaMetadataCompat = (int) ((6.0f * f) + 0.5f);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = (int) (64.0f * f);
        this.onCommand = (int) ((16.0f * f) + 0.5f);
        this.MediaBrowserCompatItemReceiver = (int) (f + 0.5f);
        this.onAddQueueItem = (int) ((f * 32.0f) + 0.5f);
        this.onPlay = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(RemoteActionCompatParcelizer());
        setWillNotDraw(false);
        this.IconCompatParcelizer.setFocusable(true);
        this.IconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: androidx.viewpager.widget.PagerTabStrip.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PagerTabStrip.this.AudioAttributesCompatParcelizer.setCurrentItem(PagerTabStrip.this.AudioAttributesCompatParcelizer.write() - 1);
            }
        });
        this.write.setFocusable(true);
        this.write.setOnClickListener(new View.OnClickListener() { // from class: androidx.viewpager.widget.PagerTabStrip.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PagerTabStrip.this.AudioAttributesCompatParcelizer.setCurrentItem(PagerTabStrip.this.AudioAttributesCompatParcelizer.write() + 1);
            }
        });
        if (getBackground() == null) {
            this.AudioAttributesImplBaseParcelizer = true;
        }
    }

    public void setTabIndicatorColor(int i) {
        this.MediaDescriptionCompat = i;
        this.handleMediaPlayPauseIfPendingOnHandler.setColor(i);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i) {
        setTabIndicatorColor(_isNaN.getColor(getContext(), i));
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        int i5 = this.MediaMetadataCompat;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setPadding(i, i2, i3, i4);
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int i) {
        int i2 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (i < i2) {
            i = i2;
        }
        super.setTextSpacing(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.MediaBrowserCompatCustomActionResultReceiver) {
            return;
        }
        this.AudioAttributesImplBaseParcelizer = drawable == null;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        if (this.MediaBrowserCompatCustomActionResultReceiver) {
            return;
        }
        this.AudioAttributesImplBaseParcelizer = (i & (-16777216)) == 0;
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.MediaBrowserCompatCustomActionResultReceiver) {
            return;
        }
        this.AudioAttributesImplBaseParcelizer = i == 0;
    }

    public void setDrawFullUnderline(boolean z) {
        this.AudioAttributesImplBaseParcelizer = z;
        this.MediaBrowserCompatCustomActionResultReceiver = true;
        invalidate();
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    final int write() {
        return Math.max(super.write(), this.onAddQueueItem);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.AudioAttributesImplApi26Parcelizer) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.RatingCompat = x;
            this.MediaBrowserCompatSearchResultReceiver = y;
            this.AudioAttributesImplApi26Parcelizer = false;
        } else if (action != 1) {
            if (action == 2 && (Math.abs(x - this.RatingCompat) > this.onPlay || Math.abs(y - this.MediaBrowserCompatSearchResultReceiver) > this.onPlay)) {
                this.AudioAttributesImplApi26Parcelizer = true;
            }
        } else if (x < this.RemoteActionCompatParcelizer.getLeft() - this.onCommand) {
            this.AudioAttributesCompatParcelizer.setCurrentItem(this.AudioAttributesCompatParcelizer.write() - 1);
        } else if (x > this.RemoteActionCompatParcelizer.getRight() + this.onCommand) {
            this.AudioAttributesCompatParcelizer.setCurrentItem(this.AudioAttributesCompatParcelizer.write() + 1);
        }
        return true;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.RemoteActionCompatParcelizer.getLeft();
        int i = this.onCommand;
        int right = this.RemoteActionCompatParcelizer.getRight();
        int i2 = this.onCommand;
        int i3 = this.MediaBrowserCompatMediaItem;
        this.handleMediaPlayPauseIfPendingOnHandler.setColor((this.onCustomAction << 24) | (this.MediaDescriptionCompat & 16777215));
        float f = height;
        canvas.drawRect(left - i, height - i3, right + i2, f, this.handleMediaPlayPauseIfPendingOnHandler);
        if (this.AudioAttributesImplBaseParcelizer) {
            this.handleMediaPlayPauseIfPendingOnHandler.setColor((this.MediaDescriptionCompat & 16777215) | (-16777216));
            canvas.drawRect(getPaddingLeft(), height - this.MediaBrowserCompatItemReceiver, getWidth() - getPaddingRight(), f, this.handleMediaPlayPauseIfPendingOnHandler);
        }
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    final void read(int i, float f, boolean z) {
        Rect rect = this.onFastForward;
        int height = getHeight();
        int left = this.RemoteActionCompatParcelizer.getLeft();
        int i2 = this.onCommand;
        int right = this.RemoteActionCompatParcelizer.getRight();
        int i3 = this.onCommand;
        int i4 = height - this.MediaBrowserCompatMediaItem;
        rect.set(left - i2, i4, right + i3, height);
        super.read(i, f, z);
        this.onCustomAction = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(this.RemoteActionCompatParcelizer.getLeft() - this.onCommand, i4, this.RemoteActionCompatParcelizer.getRight() + this.onCommand, height);
        invalidate(rect);
    }
}
