package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.NumberDeserializersPrimitiveOrWrapperDeserializer;
import kotlin.NumberDeserializersShortDeserializer;
import kotlin._init_lambda5;
import kotlin._isBlank;

/* JADX INFO: loaded from: classes4.dex */
public class MotionLabel extends View implements NumberDeserializersPrimitiveOrWrapperDeserializer {
    private float AudioAttributesCompatParcelizer;
    private String AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private float AudioAttributesImplBaseParcelizer;
    private boolean IconCompatParcelizer;
    private float MediaBrowserCompatCustomActionResultReceiver;
    private float MediaBrowserCompatItemReceiver;
    private Matrix MediaBrowserCompatMediaItem;
    private Layout MediaBrowserCompatSearchResultReceiver;
    private Path MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private int MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private float MediaSessionCompatQueueItem;
    private Paint ParcelableVolumeInfo;
    private int RatingCompat;
    private int RemoteActionCompatParcelizer;
    private int handleMediaPlayPauseIfPendingOnHandler;
    private int onAddQueueItem;
    private RectF onCommand;
    private TextPaint onCustomAction;
    private Paint onFastForward;
    private float onMediaButtonEvent;
    private float onPause;
    private float onPlay;
    private int onPlayFromMediaId;
    private Rect onPlayFromSearch;
    private Bitmap onPlayFromUri;
    private String onPrepare;
    private Rect onPrepareFromMediaId;
    private Drawable onPrepareFromSearch;
    private int onPrepareFromUri;
    private int onRemoveQueueItem;
    private float onRemoveQueueItemAt;
    private float onRewind;
    private float onSeekTo;
    private int onSetCaptioningEnabled;
    private float onSetPlaybackSpeed;
    private float onSetRating;
    private BitmapShader onSetRepeatMode;
    private Matrix onSetShuffleMode;
    private int onSkipToNext;
    private float onSkipToPrevious;
    private ViewOutlineProvider onSkipToQueueItem;
    private float onStop;
    private float read;
    private boolean setSessionImpl;
    private float write;

    public MotionLabel(Context context) {
        super(context);
        this.onCustomAction = new TextPaint();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new Path();
        this.onRemoveQueueItem = 65535;
        this.onPrepareFromUri = 65535;
        this.setSessionImpl = false;
        this.onMediaButtonEvent = BitmapDescriptorFactory.HUE_RED;
        this.onPause = Float.NaN;
        this.onSetRating = 48.0f;
        this.write = Float.NaN;
        this.onRemoveQueueItemAt = BitmapDescriptorFactory.HUE_RED;
        this.onPrepare = "Hello World";
        this.MediaMetadataCompat = true;
        this.onPlayFromSearch = new Rect();
        this.MediaDescriptionCompat = 1;
        this.handleMediaPlayPauseIfPendingOnHandler = 1;
        this.onAddQueueItem = 1;
        this.RatingCompat = 1;
        this.AudioAttributesImplApi26Parcelizer = 8388659;
        this.RemoteActionCompatParcelizer = 0;
        this.IconCompatParcelizer = false;
        this.onSetPlaybackSpeed = Float.NaN;
        this.onSkipToPrevious = Float.NaN;
        this.onRewind = BitmapDescriptorFactory.HUE_RED;
        this.onSeekTo = BitmapDescriptorFactory.HUE_RED;
        this.ParcelableVolumeInfo = new Paint();
        this.onSetCaptioningEnabled = 0;
        this.AudioAttributesCompatParcelizer = Float.NaN;
        this.read = Float.NaN;
        this.onStop = Float.NaN;
        this.onPlay = Float.NaN;
        AudioAttributesCompatParcelizer(context, null);
    }

    public MotionLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.onCustomAction = new TextPaint();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new Path();
        this.onRemoveQueueItem = 65535;
        this.onPrepareFromUri = 65535;
        this.setSessionImpl = false;
        this.onMediaButtonEvent = BitmapDescriptorFactory.HUE_RED;
        this.onPause = Float.NaN;
        this.onSetRating = 48.0f;
        this.write = Float.NaN;
        this.onRemoveQueueItemAt = BitmapDescriptorFactory.HUE_RED;
        this.onPrepare = "Hello World";
        this.MediaMetadataCompat = true;
        this.onPlayFromSearch = new Rect();
        this.MediaDescriptionCompat = 1;
        this.handleMediaPlayPauseIfPendingOnHandler = 1;
        this.onAddQueueItem = 1;
        this.RatingCompat = 1;
        this.AudioAttributesImplApi26Parcelizer = 8388659;
        this.RemoteActionCompatParcelizer = 0;
        this.IconCompatParcelizer = false;
        this.onSetPlaybackSpeed = Float.NaN;
        this.onSkipToPrevious = Float.NaN;
        this.onRewind = BitmapDescriptorFactory.HUE_RED;
        this.onSeekTo = BitmapDescriptorFactory.HUE_RED;
        this.ParcelableVolumeInfo = new Paint();
        this.onSetCaptioningEnabled = 0;
        this.AudioAttributesCompatParcelizer = Float.NaN;
        this.read = Float.NaN;
        this.onStop = Float.NaN;
        this.onPlay = Float.NaN;
        AudioAttributesCompatParcelizer(context, attributeSet);
    }

    public MotionLabel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.onCustomAction = new TextPaint();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new Path();
        this.onRemoveQueueItem = 65535;
        this.onPrepareFromUri = 65535;
        this.setSessionImpl = false;
        this.onMediaButtonEvent = BitmapDescriptorFactory.HUE_RED;
        this.onPause = Float.NaN;
        this.onSetRating = 48.0f;
        this.write = Float.NaN;
        this.onRemoveQueueItemAt = BitmapDescriptorFactory.HUE_RED;
        this.onPrepare = "Hello World";
        this.MediaMetadataCompat = true;
        this.onPlayFromSearch = new Rect();
        this.MediaDescriptionCompat = 1;
        this.handleMediaPlayPauseIfPendingOnHandler = 1;
        this.onAddQueueItem = 1;
        this.RatingCompat = 1;
        this.AudioAttributesImplApi26Parcelizer = 8388659;
        this.RemoteActionCompatParcelizer = 0;
        this.IconCompatParcelizer = false;
        this.onSetPlaybackSpeed = Float.NaN;
        this.onSkipToPrevious = Float.NaN;
        this.onRewind = BitmapDescriptorFactory.HUE_RED;
        this.onSeekTo = BitmapDescriptorFactory.HUE_RED;
        this.ParcelableVolumeInfo = new Paint();
        this.onSetCaptioningEnabled = 0;
        this.AudioAttributesCompatParcelizer = Float.NaN;
        this.read = Float.NaN;
        this.onStop = Float.NaN;
        this.onPlay = Float.NaN;
        AudioAttributesCompatParcelizer(context, attributeSet);
    }

    private void AudioAttributesCompatParcelizer(Context context, AttributeSet attributeSet) {
        IconCompatParcelizer(context);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, _isBlank.read.MotionLabel);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == _isBlank.read.MotionLabel_android_text) {
                    setText(typedArrayObtainStyledAttributes.getText(index));
                } else if (index == _isBlank.read.MotionLabel_android_fontFamily) {
                    this.AudioAttributesImplApi21Parcelizer = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == _isBlank.read.MotionLabel_scaleFromTextSize) {
                    this.write = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.write);
                } else if (index == _isBlank.read.MotionLabel_android_textSize) {
                    this.onSetRating = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.onSetRating);
                } else if (index == _isBlank.read.MotionLabel_android_textStyle) {
                    this.onPlayFromMediaId = typedArrayObtainStyledAttributes.getInt(index, this.onPlayFromMediaId);
                } else if (index == _isBlank.read.MotionLabel_android_typeface) {
                    this.onSkipToNext = typedArrayObtainStyledAttributes.getInt(index, this.onSkipToNext);
                } else if (index == _isBlank.read.MotionLabel_android_textColor) {
                    this.onRemoveQueueItem = typedArrayObtainStyledAttributes.getColor(index, this.onRemoveQueueItem);
                } else if (index == _isBlank.read.MotionLabel_borderRound) {
                    float dimension = typedArrayObtainStyledAttributes.getDimension(index, this.onPause);
                    this.onPause = dimension;
                    setRound(dimension);
                } else if (index == _isBlank.read.MotionLabel_borderRoundPercent) {
                    float f = typedArrayObtainStyledAttributes.getFloat(index, this.onMediaButtonEvent);
                    this.onMediaButtonEvent = f;
                    setRoundPercent(f);
                } else if (index == _isBlank.read.MotionLabel_android_gravity) {
                    setGravity(typedArrayObtainStyledAttributes.getInt(index, -1));
                } else if (index == _isBlank.read.MotionLabel_android_autoSizeTextType) {
                    this.RemoteActionCompatParcelizer = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == _isBlank.read.MotionLabel_textOutlineColor) {
                    this.onPrepareFromUri = typedArrayObtainStyledAttributes.getInt(index, this.onPrepareFromUri);
                    this.setSessionImpl = true;
                } else if (index == _isBlank.read.MotionLabel_textOutlineThickness) {
                    this.onRemoveQueueItemAt = typedArrayObtainStyledAttributes.getDimension(index, this.onRemoveQueueItemAt);
                    this.setSessionImpl = true;
                } else if (index == _isBlank.read.MotionLabel_textBackground) {
                    this.onPrepareFromSearch = typedArrayObtainStyledAttributes.getDrawable(index);
                    this.setSessionImpl = true;
                } else if (index == _isBlank.read.MotionLabel_textBackgroundPanX) {
                    this.AudioAttributesCompatParcelizer = typedArrayObtainStyledAttributes.getFloat(index, this.AudioAttributesCompatParcelizer);
                } else if (index == _isBlank.read.MotionLabel_textBackgroundPanY) {
                    this.read = typedArrayObtainStyledAttributes.getFloat(index, this.read);
                } else if (index == _isBlank.read.MotionLabel_textPanX) {
                    this.onRewind = typedArrayObtainStyledAttributes.getFloat(index, this.onRewind);
                } else if (index == _isBlank.read.MotionLabel_textPanY) {
                    this.onSeekTo = typedArrayObtainStyledAttributes.getFloat(index, this.onSeekTo);
                } else if (index == _isBlank.read.MotionLabel_textBackgroundRotate) {
                    this.onPlay = typedArrayObtainStyledAttributes.getFloat(index, this.onPlay);
                } else if (index == _isBlank.read.MotionLabel_textBackgroundZoom) {
                    this.onStop = typedArrayObtainStyledAttributes.getFloat(index, this.onStop);
                } else if (index == _isBlank.read.MotionLabel_textureHeight) {
                    this.onSetPlaybackSpeed = typedArrayObtainStyledAttributes.getDimension(index, this.onSetPlaybackSpeed);
                } else if (index == _isBlank.read.MotionLabel_textureWidth) {
                    this.onSkipToPrevious = typedArrayObtainStyledAttributes.getDimension(index, this.onSkipToPrevious);
                } else if (index == _isBlank.read.MotionLabel_textureEffect) {
                    this.onSetCaptioningEnabled = typedArrayObtainStyledAttributes.getInt(index, this.onSetCaptioningEnabled);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        AudioAttributesCompatParcelizer();
        write();
    }

    private static Bitmap read(Bitmap bitmap) {
        int width = bitmap.getWidth() / 2;
        int height = bitmap.getHeight() / 2;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
        for (int i = 0; i < 4 && width >= 32 && height >= 32; i++) {
            width /= 2;
            height /= 2;
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, width, height, true);
        }
        return bitmapCreateScaledBitmap;
    }

    private void AudioAttributesCompatParcelizer() {
        if (this.onPrepareFromSearch != null) {
            this.onSetShuffleMode = new Matrix();
            int intrinsicWidth = this.onPrepareFromSearch.getIntrinsicWidth();
            int intrinsicHeight = this.onPrepareFromSearch.getIntrinsicHeight();
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                intrinsicWidth = Float.isNaN(this.onSkipToPrevious) ? 128 : (int) this.onSkipToPrevious;
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                intrinsicHeight = Float.isNaN(this.onSetPlaybackSpeed) ? 128 : (int) this.onSetPlaybackSpeed;
            }
            if (this.onSetCaptioningEnabled != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.onPlayFromUri = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.onPlayFromUri);
            this.onPrepareFromSearch.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.onPrepareFromSearch.setFilterBitmap(true);
            this.onPrepareFromSearch.draw(canvas);
            if (this.onSetCaptioningEnabled != 0) {
                this.onPlayFromUri = read(this.onPlayFromUri);
            }
            Bitmap bitmap = this.onPlayFromUri;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.onSetRepeatMode = new BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    private void IconCompatParcelizer(float f, float f2, float f3, float f4) {
        if (this.onSetShuffleMode == null) {
            return;
        }
        this.MediaBrowserCompatItemReceiver = f3 - f;
        this.AudioAttributesImplBaseParcelizer = f4 - f2;
        RemoteActionCompatParcelizer();
    }

    public void setGravity(int i) {
        if ((i & 8388615) == 0) {
            i |= 8388611;
        }
        if ((i & 112) == 0) {
            i |= 48;
        }
        if (i != this.AudioAttributesImplApi26Parcelizer) {
            invalidate();
        }
        this.AudioAttributesImplApi26Parcelizer = i;
        int i2 = i & 112;
        if (i2 == 48) {
            this.onSeekTo = -1.0f;
        } else if (i2 == 80) {
            this.onSeekTo = 1.0f;
        } else {
            this.onSeekTo = BitmapDescriptorFactory.HUE_RED;
        }
        int i3 = i & 8388615;
        if (i3 != 3) {
            if (i3 != 5) {
                if (i3 != 8388611) {
                    if (i3 != 8388613) {
                        this.onRewind = BitmapDescriptorFactory.HUE_RED;
                        return;
                    }
                }
            }
            this.onRewind = 1.0f;
            return;
        }
        this.onRewind = -1.0f;
    }

    private float read() {
        float f = Float.isNaN(this.write) ? 1.0f : this.onSetRating / this.write;
        TextPaint textPaint = this.onCustomAction;
        String str = this.onPrepare;
        return (((((Float.isNaN(this.MediaBrowserCompatItemReceiver) ? getMeasuredWidth() : this.MediaBrowserCompatItemReceiver) - getPaddingLeft()) - getPaddingRight()) - (f * textPaint.measureText(str, 0, str.length()))) * (this.onRewind + 1.0f)) / 2.0f;
    }

    private float IconCompatParcelizer() {
        float f = Float.isNaN(this.write) ? 1.0f : this.onSetRating / this.write;
        Paint.FontMetrics fontMetrics = this.onCustomAction.getFontMetrics();
        return ((((((Float.isNaN(this.AudioAttributesImplBaseParcelizer) ? getMeasuredHeight() : this.AudioAttributesImplBaseParcelizer) - getPaddingTop()) - getPaddingBottom()) - ((fontMetrics.descent - fontMetrics.ascent) * f)) * (1.0f - this.onSeekTo)) / 2.0f) - (f * fontMetrics.ascent);
    }

    private void IconCompatParcelizer(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(_init_lambda5.read.colorPrimary, typedValue, true);
        TextPaint textPaint = this.onCustomAction;
        int i = typedValue.data;
        this.onRemoveQueueItem = i;
        textPaint.setColor(i);
    }

    public void setText(CharSequence charSequence) {
        this.onPrepare = charSequence.toString();
        invalidate();
    }

    private void write() {
        this.MediaDescriptionCompat = getPaddingLeft();
        this.handleMediaPlayPauseIfPendingOnHandler = getPaddingRight();
        this.onAddQueueItem = getPaddingTop();
        this.RatingCompat = getPaddingBottom();
        RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, this.onSkipToNext, this.onPlayFromMediaId);
        this.onCustomAction.setColor(this.onRemoveQueueItem);
        this.onCustomAction.setStrokeWidth(this.onRemoveQueueItemAt);
        this.onCustomAction.setStyle(Paint.Style.FILL_AND_STROKE);
        this.onCustomAction.setFlags(128);
        setTextSize(this.onSetRating);
        this.onCustomAction.setAntiAlias(true);
    }

    private void RemoteActionCompatParcelizer(float f) {
        if (this.setSessionImpl || f != 1.0f) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.reset();
            String str = this.onPrepare;
            int length = str.length();
            this.onCustomAction.getTextBounds(str, 0, length, this.onPlayFromSearch);
            this.onCustomAction.getTextPath(str, 0, length, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            if (f != 1.0f) {
                NumberDeserializersShortDeserializer.read();
                Matrix matrix = new Matrix();
                matrix.postScale(f, f);
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.transform(matrix);
            }
            Rect rect = this.onPlayFromSearch;
            rect.right--;
            this.onPlayFromSearch.left++;
            this.onPlayFromSearch.bottom++;
            Rect rect2 = this.onPlayFromSearch;
            rect2.top--;
            RectF rectF = new RectF();
            rectF.bottom = getHeight();
            rectF.right = getWidth();
            this.MediaMetadataCompat = false;
        }
    }

    @Override // android.view.View
    public void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        boolean zIsNaN = Float.isNaN(this.write);
        float f = zIsNaN ? 1.0f : this.onSetRating / this.write;
        this.MediaBrowserCompatItemReceiver = i3 - i;
        this.AudioAttributesImplBaseParcelizer = i4 - i2;
        if (this.IconCompatParcelizer) {
            if (this.onPrepareFromMediaId == null) {
                this.onFastForward = new Paint();
                this.onPrepareFromMediaId = new Rect();
                this.onFastForward.set(this.onCustomAction);
                this.MediaSessionCompatQueueItem = this.onFastForward.getTextSize();
            }
            Paint paint = this.onFastForward;
            String str = this.onPrepare;
            paint.getTextBounds(str, 0, str.length(), this.onPrepareFromMediaId);
            int iWidth = this.onPrepareFromMediaId.width();
            int iHeight = (int) (this.onPrepareFromMediaId.height() * 1.3f);
            float f2 = (this.MediaBrowserCompatItemReceiver - this.handleMediaPlayPauseIfPendingOnHandler) - this.MediaDescriptionCompat;
            float f3 = (this.AudioAttributesImplBaseParcelizer - this.RatingCompat) - this.onAddQueueItem;
            if (zIsNaN) {
                float f4 = iWidth;
                float f5 = iHeight;
                if (f4 * f3 > f5 * f2) {
                    this.onCustomAction.setTextSize((this.MediaSessionCompatQueueItem * f2) / f4);
                } else {
                    this.onCustomAction.setTextSize((this.MediaSessionCompatQueueItem * f3) / f5);
                }
            } else {
                float f6 = iWidth;
                float f7 = iHeight;
                f = f6 * f3 > f7 * f2 ? f2 / f6 : f3 / f7;
            }
        }
        if (this.setSessionImpl || !zIsNaN) {
            IconCompatParcelizer(i, i2, i3, i4);
            RemoteActionCompatParcelizer(f);
        }
    }

    @Override // kotlin.NumberDeserializersPrimitiveOrWrapperDeserializer
    public final void AudioAttributesCompatParcelizer(float f, float f2, float f3, float f4) {
        int i = (int) (f + 0.5f);
        this.MediaBrowserCompatCustomActionResultReceiver = f - i;
        int i2 = (int) (f3 + 0.5f);
        int i3 = i2 - i;
        int i4 = (int) (f4 + 0.5f);
        int i5 = (int) (0.5f + f2);
        int i6 = i4 - i5;
        float f5 = f3 - f;
        this.MediaBrowserCompatItemReceiver = f5;
        float f6 = f4 - f2;
        this.AudioAttributesImplBaseParcelizer = f6;
        IconCompatParcelizer(f, f2, f3, f4);
        if (getMeasuredHeight() != i6 || getMeasuredWidth() != i3) {
            measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            super.layout(i, i5, i2, i4);
        } else {
            super.layout(i, i5, i2, i4);
        }
        if (this.IconCompatParcelizer) {
            if (this.onPrepareFromMediaId == null) {
                this.onFastForward = new Paint();
                this.onPrepareFromMediaId = new Rect();
                this.onFastForward.set(this.onCustomAction);
                this.MediaSessionCompatQueueItem = this.onFastForward.getTextSize();
            }
            this.MediaBrowserCompatItemReceiver = f5;
            this.AudioAttributesImplBaseParcelizer = f6;
            Paint paint = this.onFastForward;
            String str = this.onPrepare;
            paint.getTextBounds(str, 0, str.length(), this.onPrepareFromMediaId);
            float fHeight = this.onPrepareFromMediaId.height() * 1.3f;
            float f7 = (f5 - this.handleMediaPlayPauseIfPendingOnHandler) - this.MediaDescriptionCompat;
            float f8 = (f6 - this.RatingCompat) - this.onAddQueueItem;
            float fWidth = this.onPrepareFromMediaId.width();
            if (fWidth * f8 > fHeight * f7) {
                this.onCustomAction.setTextSize((this.MediaSessionCompatQueueItem * f7) / fWidth);
            } else {
                this.onCustomAction.setTextSize((this.MediaSessionCompatQueueItem * f8) / fHeight);
            }
            if (this.setSessionImpl || !Float.isNaN(this.write)) {
                RemoteActionCompatParcelizer(Float.isNaN(this.write) ? 1.0f : this.onSetRating / this.write);
            }
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f = Float.isNaN(this.write) ? 1.0f : this.onSetRating / this.write;
        super.onDraw(canvas);
        if (!this.setSessionImpl && f == 1.0f) {
            canvas.drawText(this.onPrepare, this.MediaBrowserCompatCustomActionResultReceiver + this.MediaDescriptionCompat + read(), this.onAddQueueItem + IconCompatParcelizer(), this.onCustomAction);
            return;
        }
        if (this.MediaMetadataCompat) {
            RemoteActionCompatParcelizer(f);
        }
        if (this.MediaBrowserCompatMediaItem == null) {
            this.MediaBrowserCompatMediaItem = new Matrix();
        }
        if (this.setSessionImpl) {
            this.ParcelableVolumeInfo.set(this.onCustomAction);
            this.MediaBrowserCompatMediaItem.reset();
            float f2 = this.MediaDescriptionCompat + read();
            float fIconCompatParcelizer = this.onAddQueueItem + IconCompatParcelizer();
            this.MediaBrowserCompatMediaItem.postTranslate(f2, fIconCompatParcelizer);
            this.MediaBrowserCompatMediaItem.preScale(f, f);
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.transform(this.MediaBrowserCompatMediaItem);
            if (this.onSetRepeatMode != null) {
                this.onCustomAction.setFilterBitmap(true);
                this.onCustomAction.setShader(this.onSetRepeatMode);
            } else {
                this.onCustomAction.setColor(this.onRemoveQueueItem);
            }
            this.onCustomAction.setStyle(Paint.Style.FILL);
            this.onCustomAction.setStrokeWidth(this.onRemoveQueueItemAt);
            canvas.drawPath(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.onCustomAction);
            if (this.onSetRepeatMode != null) {
                this.onCustomAction.setShader(null);
            }
            this.onCustomAction.setColor(this.onPrepareFromUri);
            this.onCustomAction.setStyle(Paint.Style.STROKE);
            this.onCustomAction.setStrokeWidth(this.onRemoveQueueItemAt);
            canvas.drawPath(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.onCustomAction);
            this.MediaBrowserCompatMediaItem.reset();
            this.MediaBrowserCompatMediaItem.postTranslate(-f2, -fIconCompatParcelizer);
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.transform(this.MediaBrowserCompatMediaItem);
            this.onCustomAction.set(this.ParcelableVolumeInfo);
            return;
        }
        float f3 = this.MediaDescriptionCompat + read();
        float fIconCompatParcelizer2 = this.onAddQueueItem + IconCompatParcelizer();
        this.MediaBrowserCompatMediaItem.reset();
        this.MediaBrowserCompatMediaItem.preTranslate(f3, fIconCompatParcelizer2);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.transform(this.MediaBrowserCompatMediaItem);
        this.onCustomAction.setColor(this.onRemoveQueueItem);
        this.onCustomAction.setStyle(Paint.Style.FILL_AND_STROKE);
        this.onCustomAction.setStrokeWidth(this.onRemoveQueueItemAt);
        canvas.drawPath(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.onCustomAction);
        this.MediaBrowserCompatMediaItem.reset();
        this.MediaBrowserCompatMediaItem.preTranslate(-f3, -fIconCompatParcelizer2);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.transform(this.MediaBrowserCompatMediaItem);
    }

    public void setTextOutlineThickness(float f) {
        this.onRemoveQueueItemAt = f;
        this.setSessionImpl = true;
        if (Float.isNaN(f)) {
            this.onRemoveQueueItemAt = 1.0f;
            this.setSessionImpl = false;
        }
        invalidate();
    }

    public void setTextFillColor(int i) {
        this.onRemoveQueueItem = i;
        invalidate();
    }

    public void setTextOutlineColor(int i) {
        this.onPrepareFromUri = i;
        this.setSessionImpl = true;
        invalidate();
    }

    private void RemoteActionCompatParcelizer(String str, int i, int i2) {
        Typeface typefaceCreate;
        Typeface typefaceCreate2;
        if (str != null) {
            typefaceCreate = Typeface.create(str, i2);
            if (typefaceCreate != null) {
                setTypeface(typefaceCreate);
                return;
            }
        } else {
            typefaceCreate = null;
        }
        if (i == 1) {
            typefaceCreate = Typeface.SANS_SERIF;
        } else if (i == 2) {
            typefaceCreate = Typeface.SERIF;
        } else if (i == 3) {
            typefaceCreate = Typeface.MONOSPACE;
        }
        float f = BitmapDescriptorFactory.HUE_RED;
        if (i2 > 0) {
            if (typefaceCreate == null) {
                typefaceCreate2 = Typeface.defaultFromStyle(i2);
            } else {
                typefaceCreate2 = Typeface.create(typefaceCreate, i2);
            }
            setTypeface(typefaceCreate2);
            int i3 = (~(typefaceCreate2 != null ? typefaceCreate2.getStyle() : 0)) & i2;
            this.onCustomAction.setFakeBoldText((i3 & 1) != 0);
            TextPaint textPaint = this.onCustomAction;
            if ((i3 & 2) != 0) {
                f = -0.25f;
            }
            textPaint.setTextSkewX(f);
            return;
        }
        this.onCustomAction.setFakeBoldText(false);
        this.onCustomAction.setTextSkewX(BitmapDescriptorFactory.HUE_RED);
        setTypeface(typefaceCreate);
    }

    public void setTypeface(Typeface typeface) {
        if (this.onCustomAction.getTypeface() != typeface) {
            this.onCustomAction.setTypeface(typeface);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.IconCompatParcelizer = false;
        this.MediaDescriptionCompat = getPaddingLeft();
        this.handleMediaPlayPauseIfPendingOnHandler = getPaddingRight();
        this.onAddQueueItem = getPaddingTop();
        this.RatingCompat = getPaddingBottom();
        if (mode != 1073741824 || mode2 != 1073741824) {
            TextPaint textPaint = this.onCustomAction;
            String str = this.onPrepare;
            textPaint.getTextBounds(str, 0, str.length(), this.onPlayFromSearch);
            if (mode != 1073741824) {
                size = (int) (this.onPlayFromSearch.width() + 0.99999f);
            }
            size += this.MediaDescriptionCompat + this.handleMediaPlayPauseIfPendingOnHandler;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (this.onCustomAction.getFontMetricsInt(null) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.onAddQueueItem + this.RatingCompat + fontMetricsInt;
            }
        } else if (this.RemoteActionCompatParcelizer != 0) {
            this.IconCompatParcelizer = true;
        }
        setMeasuredDimension(size, size2);
    }

    public void setRoundPercent(float f) {
        boolean z = this.onMediaButtonEvent != f;
        this.onMediaButtonEvent = f;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == null) {
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new Path();
            }
            if (this.onCommand == null) {
                this.onCommand = new RectF();
            }
            if (this.onSkipToQueueItem == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.MotionLabel.4
                    @Override // android.view.ViewOutlineProvider
                    public final void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), (Math.min(r3, r4) * MotionLabel.this.onMediaButtonEvent) / 2.0f);
                    }
                };
                this.onSkipToQueueItem = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.onMediaButtonEvent) / 2.0f;
            this.onCommand.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width, height);
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.reset();
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.addRoundRect(this.onCommand, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.onPause = f;
            float f2 = this.onMediaButtonEvent;
            this.onMediaButtonEvent = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.onPause != f;
        this.onPause = f;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == null) {
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new Path();
            }
            if (this.onCommand == null) {
                this.onCommand = new RectF();
            }
            if (this.onSkipToQueueItem == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.MotionLabel.2
                    @Override // android.view.ViewOutlineProvider
                    public final void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), MotionLabel.this.onPause);
                    }
                };
                this.onSkipToQueueItem = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            this.onCommand.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getWidth(), getHeight());
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.reset();
            Path path = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            RectF rectF = this.onCommand;
            float f3 = this.onPause;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setTextSize(float f) {
        this.onSetRating = f;
        NumberDeserializersShortDeserializer.read();
        float f2 = this.write;
        TextPaint textPaint = this.onCustomAction;
        if (!Float.isNaN(f2)) {
            f = this.write;
        }
        textPaint.setTextSize(f);
        RemoteActionCompatParcelizer(Float.isNaN(this.write) ? 1.0f : this.onSetRating / this.write);
        requestLayout();
        invalidate();
    }

    public void setTextBackgroundPanX(float f) {
        this.AudioAttributesCompatParcelizer = f;
        RemoteActionCompatParcelizer();
        invalidate();
    }

    public void setTextBackgroundPanY(float f) {
        this.read = f;
        RemoteActionCompatParcelizer();
        invalidate();
    }

    public void setTextBackgroundZoom(float f) {
        this.onStop = f;
        RemoteActionCompatParcelizer();
        invalidate();
    }

    public void setTextBackgroundRotate(float f) {
        this.onPlay = f;
        RemoteActionCompatParcelizer();
        invalidate();
    }

    private void RemoteActionCompatParcelizer() {
        boolean zIsNaN = Float.isNaN(this.AudioAttributesCompatParcelizer);
        float f = BitmapDescriptorFactory.HUE_RED;
        float f2 = zIsNaN ? 0.0f : this.AudioAttributesCompatParcelizer;
        float f3 = Float.isNaN(this.read) ? 0.0f : this.read;
        float f4 = Float.isNaN(this.onStop) ? 1.0f : this.onStop;
        if (!Float.isNaN(this.onPlay)) {
            f = this.onPlay;
        }
        this.onSetShuffleMode.reset();
        float width = this.onPlayFromUri.getWidth();
        float height = this.onPlayFromUri.getHeight();
        float f5 = Float.isNaN(this.onSkipToPrevious) ? this.MediaBrowserCompatItemReceiver : this.onSkipToPrevious;
        float f6 = Float.isNaN(this.onSetPlaybackSpeed) ? this.AudioAttributesImplBaseParcelizer : this.onSetPlaybackSpeed;
        float f7 = f4 * (width * f6 < height * f5 ? f5 / width : f6 / height);
        this.onSetShuffleMode.postScale(f7, f7);
        float f8 = width * f7;
        float f9 = f5 - f8;
        float f10 = f7 * height;
        float f11 = f6 - f10;
        if (!Float.isNaN(this.onSetPlaybackSpeed)) {
            f11 = this.onSetPlaybackSpeed / 2.0f;
        }
        if (!Float.isNaN(this.onSkipToPrevious)) {
            f9 = this.onSkipToPrevious / 2.0f;
        }
        this.onSetShuffleMode.postTranslate((((f2 * f9) + f5) - f8) * 0.5f, (((f3 * f11) + f6) - f10) * 0.5f);
        this.onSetShuffleMode.postRotate(f, f5 / 2.0f, f6 / 2.0f);
        this.onSetRepeatMode.setLocalMatrix(this.onSetShuffleMode);
    }

    public void setTextPanX(float f) {
        this.onRewind = f;
        invalidate();
    }

    public void setTextPanY(float f) {
        this.onSeekTo = f;
        invalidate();
    }

    public void setTextureHeight(float f) {
        this.onSetPlaybackSpeed = f;
        RemoteActionCompatParcelizer();
        invalidate();
    }

    public void setTextureWidth(float f) {
        this.onSkipToPrevious = f;
        RemoteActionCompatParcelizer();
        invalidate();
    }

    public void setScaleFromTextSize(float f) {
        this.write = f;
    }
}
