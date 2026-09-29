package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import kotlin.JdkDeserializers;
import kotlin.JsonNodeDeserializerArrayDeserializer;
import kotlin.JsonNodeDeserializerObjectDeserializer;
import kotlin.ReferenceTypeDeserializer;
import kotlin._isBlank;
import kotlin._readAndBindStringKeyMap;

/* JADX INFO: loaded from: classes4.dex */
public class Flow extends VirtualLayout {
    private JsonNodeDeserializerObjectDeserializer AudioAttributesImplBaseParcelizer;

    public Flow(Context context) {
        super(context);
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void read(JdkDeserializers jdkDeserializers, boolean z) {
        this.AudioAttributesImplBaseParcelizer.write(z);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onMeasure(int i, int i2) {
        read(this.AudioAttributesImplBaseParcelizer, i, i2);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public final void read(_readAndBindStringKeyMap _readandbindstringkeymap, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (_readandbindstringkeymap != null) {
            _readandbindstringkeymap.read(mode, size, mode2, size2);
            setMeasuredDimension(_readandbindstringkeymap.RemoteActionCompatParcelizer(), _readandbindstringkeymap.IconCompatParcelizer());
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void read(ReferenceTypeDeserializer.write writeVar, JsonNodeDeserializerArrayDeserializer jsonNodeDeserializerArrayDeserializer, ConstraintLayout.LayoutParams layoutParams, SparseArray<JdkDeserializers> sparseArray) {
        super.read(writeVar, jsonNodeDeserializerArrayDeserializer, layoutParams, sparseArray);
        if (jsonNodeDeserializerArrayDeserializer instanceof JsonNodeDeserializerObjectDeserializer) {
            JsonNodeDeserializerObjectDeserializer jsonNodeDeserializerObjectDeserializer = (JsonNodeDeserializerObjectDeserializer) jsonNodeDeserializerArrayDeserializer;
            if (layoutParams.PlaybackStateCompat != -1) {
                jsonNodeDeserializerObjectDeserializer.onRewind(layoutParams.PlaybackStateCompat);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void AudioAttributesCompatParcelizer(AttributeSet attributeSet) {
        super.AudioAttributesCompatParcelizer(attributeSet);
        this.AudioAttributesImplBaseParcelizer = new JsonNodeDeserializerObjectDeserializer();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, _isBlank.read.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == _isBlank.read.ConstraintLayout_Layout_android_orientation) {
                    this.AudioAttributesImplBaseParcelizer.onRewind(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == _isBlank.read.ConstraintLayout_Layout_android_padding) {
                    this.AudioAttributesImplBaseParcelizer.onSetCaptioningEnabled(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == _isBlank.read.ConstraintLayout_Layout_android_paddingStart) {
                    this.AudioAttributesImplBaseParcelizer.onSkipToQueueItem(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == _isBlank.read.ConstraintLayout_Layout_android_paddingEnd) {
                    this.AudioAttributesImplBaseParcelizer.onSetShuffleMode(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == _isBlank.read.ConstraintLayout_Layout_android_paddingLeft) {
                    this.AudioAttributesImplBaseParcelizer.onSetRepeatMode(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == _isBlank.read.ConstraintLayout_Layout_android_paddingTop) {
                    this.AudioAttributesImplBaseParcelizer.onStop(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == _isBlank.read.ConstraintLayout_Layout_android_paddingRight) {
                    this.AudioAttributesImplBaseParcelizer.onSkipToPrevious(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == _isBlank.read.ConstraintLayout_Layout_android_paddingBottom) {
                    this.AudioAttributesImplBaseParcelizer.onSetPlaybackSpeed(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == _isBlank.read.ConstraintLayout_Layout_flow_wrapMode) {
                    this.AudioAttributesImplBaseParcelizer.onSeekTo(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == _isBlank.read.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.AudioAttributesImplBaseParcelizer.onPrepareFromSearch(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == _isBlank.read.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.AudioAttributesImplBaseParcelizer.onRemoveQueueItem(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == _isBlank.read.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.AudioAttributesImplBaseParcelizer.read(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == _isBlank.read.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.AudioAttributesImplBaseParcelizer.onPrepare(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == _isBlank.read.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == _isBlank.read.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.AudioAttributesImplBaseParcelizer.onPlayFromSearch(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == _isBlank.read.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi26Parcelizer(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == _isBlank.read.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == _isBlank.read.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == _isBlank.read.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.AudioAttributesImplBaseParcelizer.MediaBrowserCompatCustomActionResultReceiver(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == _isBlank.read.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.AudioAttributesImplBaseParcelizer.AudioAttributesImplBaseParcelizer(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == _isBlank.read.ConstraintLayout_Layout_flow_verticalBias) {
                    this.AudioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == _isBlank.read.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.AudioAttributesImplBaseParcelizer.onPause(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == _isBlank.read.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.AudioAttributesImplBaseParcelizer.onPrepareFromUri(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == _isBlank.read.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.AudioAttributesImplBaseParcelizer.onPlayFromUri(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == _isBlank.read.ConstraintLayout_Layout_flow_verticalGap) {
                    this.AudioAttributesImplBaseParcelizer.onRemoveQueueItemAt(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == _isBlank.read.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.AudioAttributesImplBaseParcelizer.onPrepareFromMediaId(typedArrayObtainStyledAttributes.getInt(index, -1));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.RemoteActionCompatParcelizer = this.AudioAttributesImplBaseParcelizer;
        MediaBrowserCompatCustomActionResultReceiver();
    }

    public void setOrientation(int i) {
        this.AudioAttributesImplBaseParcelizer.onRewind(i);
        requestLayout();
    }

    public void setPadding(int i) {
        this.AudioAttributesImplBaseParcelizer.onSetCaptioningEnabled(i);
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.AudioAttributesImplBaseParcelizer.onSetRepeatMode(i);
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.AudioAttributesImplBaseParcelizer.onStop(i);
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.AudioAttributesImplBaseParcelizer.onSkipToPrevious(i);
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.AudioAttributesImplBaseParcelizer.onSetPlaybackSpeed(i);
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.AudioAttributesImplBaseParcelizer.onPrepare(i);
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.AudioAttributesImplBaseParcelizer.onPlayFromSearch(i);
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer(f);
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.AudioAttributesImplBaseParcelizer.AudioAttributesImplBaseParcelizer(f);
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.AudioAttributesImplBaseParcelizer.onSeekTo(i);
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.AudioAttributesImplBaseParcelizer.onPrepareFromSearch(i);
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.AudioAttributesImplBaseParcelizer.onRemoveQueueItem(i);
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi26Parcelizer(f);
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.AudioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver(f);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.AudioAttributesImplBaseParcelizer.read(i);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(i);
        requestLayout();
    }

    public void setFirstHorizontalBias(float f) {
        this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(f);
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.AudioAttributesImplBaseParcelizer.MediaBrowserCompatCustomActionResultReceiver(f);
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.AudioAttributesImplBaseParcelizer.onPause(i);
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.AudioAttributesImplBaseParcelizer.onPrepareFromUri(i);
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.AudioAttributesImplBaseParcelizer.onPlayFromUri(i);
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.AudioAttributesImplBaseParcelizer.onRemoveQueueItemAt(i);
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.AudioAttributesImplBaseParcelizer.onPrepareFromMediaId(i);
        requestLayout();
    }
}
