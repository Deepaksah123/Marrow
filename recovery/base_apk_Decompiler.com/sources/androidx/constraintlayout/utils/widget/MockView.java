package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin._isBlank;

/* JADX INFO: loaded from: classes4.dex */
public class MockView extends View {
    private boolean AudioAttributesCompatParcelizer;
    private Rect AudioAttributesImplApi21Parcelizer;
    private Paint AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private int IconCompatParcelizer;
    private Paint MediaBrowserCompatCustomActionResultReceiver;
    private Paint MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatSearchResultReceiver;
    private boolean RemoteActionCompatParcelizer;
    protected String read;
    private int write;

    public MockView(Context context) {
        super(context);
        this.MediaBrowserCompatCustomActionResultReceiver = new Paint();
        this.AudioAttributesImplApi26Parcelizer = new Paint();
        this.MediaBrowserCompatItemReceiver = new Paint();
        this.RemoteActionCompatParcelizer = true;
        this.AudioAttributesCompatParcelizer = true;
        this.read = null;
        this.AudioAttributesImplApi21Parcelizer = new Rect();
        this.IconCompatParcelizer = Color.argb(255, 0, 0, 0);
        this.MediaBrowserCompatSearchResultReceiver = Color.argb(255, 200, 200, 200);
        this.AudioAttributesImplBaseParcelizer = Color.argb(255, 50, 50, 50);
        this.write = 4;
        AudioAttributesCompatParcelizer(context, null);
    }

    public MockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.MediaBrowserCompatCustomActionResultReceiver = new Paint();
        this.AudioAttributesImplApi26Parcelizer = new Paint();
        this.MediaBrowserCompatItemReceiver = new Paint();
        this.RemoteActionCompatParcelizer = true;
        this.AudioAttributesCompatParcelizer = true;
        this.read = null;
        this.AudioAttributesImplApi21Parcelizer = new Rect();
        this.IconCompatParcelizer = Color.argb(255, 0, 0, 0);
        this.MediaBrowserCompatSearchResultReceiver = Color.argb(255, 200, 200, 200);
        this.AudioAttributesImplBaseParcelizer = Color.argb(255, 50, 50, 50);
        this.write = 4;
        AudioAttributesCompatParcelizer(context, attributeSet);
    }

    public MockView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MediaBrowserCompatCustomActionResultReceiver = new Paint();
        this.AudioAttributesImplApi26Parcelizer = new Paint();
        this.MediaBrowserCompatItemReceiver = new Paint();
        this.RemoteActionCompatParcelizer = true;
        this.AudioAttributesCompatParcelizer = true;
        this.read = null;
        this.AudioAttributesImplApi21Parcelizer = new Rect();
        this.IconCompatParcelizer = Color.argb(255, 0, 0, 0);
        this.MediaBrowserCompatSearchResultReceiver = Color.argb(255, 200, 200, 200);
        this.AudioAttributesImplBaseParcelizer = Color.argb(255, 50, 50, 50);
        this.write = 4;
        AudioAttributesCompatParcelizer(context, attributeSet);
    }

    private void AudioAttributesCompatParcelizer(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, _isBlank.read.MockView);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == _isBlank.read.MockView_mock_label) {
                    this.read = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == _isBlank.read.MockView_mock_showDiagonals) {
                    this.RemoteActionCompatParcelizer = typedArrayObtainStyledAttributes.getBoolean(index, this.RemoteActionCompatParcelizer);
                } else if (index == _isBlank.read.MockView_mock_diagonalsColor) {
                    this.IconCompatParcelizer = typedArrayObtainStyledAttributes.getColor(index, this.IconCompatParcelizer);
                } else if (index == _isBlank.read.MockView_mock_labelBackgroundColor) {
                    this.AudioAttributesImplBaseParcelizer = typedArrayObtainStyledAttributes.getColor(index, this.AudioAttributesImplBaseParcelizer);
                } else if (index == _isBlank.read.MockView_mock_labelColor) {
                    this.MediaBrowserCompatSearchResultReceiver = typedArrayObtainStyledAttributes.getColor(index, this.MediaBrowserCompatSearchResultReceiver);
                } else if (index == _isBlank.read.MockView_mock_showLabel) {
                    this.AudioAttributesCompatParcelizer = typedArrayObtainStyledAttributes.getBoolean(index, this.AudioAttributesCompatParcelizer);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.read == null) {
            try {
                this.read = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        this.MediaBrowserCompatCustomActionResultReceiver.setColor(this.IconCompatParcelizer);
        this.MediaBrowserCompatCustomActionResultReceiver.setAntiAlias(true);
        this.AudioAttributesImplApi26Parcelizer.setColor(this.MediaBrowserCompatSearchResultReceiver);
        this.AudioAttributesImplApi26Parcelizer.setAntiAlias(true);
        this.MediaBrowserCompatItemReceiver.setColor(this.AudioAttributesImplBaseParcelizer);
        this.write = Math.round(this.write * (getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.RemoteActionCompatParcelizer) {
            width--;
            height--;
            float f = width;
            float f2 = height;
            canvas.drawLine(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, f2, this.MediaBrowserCompatCustomActionResultReceiver);
            canvas.drawLine(BitmapDescriptorFactory.HUE_RED, f2, f, BitmapDescriptorFactory.HUE_RED, this.MediaBrowserCompatCustomActionResultReceiver);
            canvas.drawLine(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, this.MediaBrowserCompatCustomActionResultReceiver);
            canvas.drawLine(f, BitmapDescriptorFactory.HUE_RED, f, f2, this.MediaBrowserCompatCustomActionResultReceiver);
            canvas.drawLine(f, f2, BitmapDescriptorFactory.HUE_RED, f2, this.MediaBrowserCompatCustomActionResultReceiver);
            canvas.drawLine(BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.MediaBrowserCompatCustomActionResultReceiver);
        }
        String str = this.read;
        if (str == null || !this.AudioAttributesCompatParcelizer) {
            return;
        }
        this.AudioAttributesImplApi26Parcelizer.getTextBounds(str, 0, str.length(), this.AudioAttributesImplApi21Parcelizer);
        float fWidth = (width - this.AudioAttributesImplApi21Parcelizer.width()) / 2.0f;
        float fHeight = ((height - this.AudioAttributesImplApi21Parcelizer.height()) / 2.0f) + this.AudioAttributesImplApi21Parcelizer.height();
        this.AudioAttributesImplApi21Parcelizer.offset((int) fWidth, (int) fHeight);
        Rect rect = this.AudioAttributesImplApi21Parcelizer;
        rect.set(rect.left - this.write, this.AudioAttributesImplApi21Parcelizer.top - this.write, this.AudioAttributesImplApi21Parcelizer.right + this.write, this.AudioAttributesImplApi21Parcelizer.bottom + this.write);
        canvas.drawRect(this.AudioAttributesImplApi21Parcelizer, this.MediaBrowserCompatItemReceiver);
        canvas.drawText(this.read, fWidth, fHeight, this.AudioAttributesImplApi26Parcelizer);
    }
}
