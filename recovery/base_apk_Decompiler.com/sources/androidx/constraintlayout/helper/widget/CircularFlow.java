package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import java.util.Arrays;
import kotlin._isBlank;

/* JADX INFO: loaded from: classes4.dex */
public class CircularFlow extends VirtualLayout {
    private static int AudioAttributesImplApi26Parcelizer;
    private static float MediaBrowserCompatCustomActionResultReceiver;
    private ConstraintLayout AudioAttributesImplApi21Parcelizer;
    private float[] AudioAttributesImplBaseParcelizer;
    private String MediaBrowserCompatMediaItem;
    private Float MediaBrowserCompatSearchResultReceiver;
    private String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private int MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private int[] RatingCompat;
    private int handleMediaPlayPauseIfPendingOnHandler;
    private Integer onAddQueueItem;

    public CircularFlow(Context context) {
        super(context);
    }

    public CircularFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircularFlow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private int[] IconCompatParcelizer() {
        return Arrays.copyOf(this.RatingCompat, this.MediaDescriptionCompat);
    }

    private float[] read() {
        return Arrays.copyOf(this.AudioAttributesImplBaseParcelizer, this.MediaMetadataCompat);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void AudioAttributesCompatParcelizer(AttributeSet attributeSet) {
        super.AudioAttributesCompatParcelizer(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, _isBlank.read.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == _isBlank.read.ConstraintLayout_Layout_circularflow_viewCenter) {
                    this.handleMediaPlayPauseIfPendingOnHandler = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                } else if (index == _isBlank.read.ConstraintLayout_Layout_circularflow_angles) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.MediaBrowserCompatMediaItem = string;
                    RemoteActionCompatParcelizer(string);
                } else if (index == _isBlank.read.ConstraintLayout_Layout_circularflow_radiusInDP) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = string2;
                    read(string2);
                } else if (index == _isBlank.read.ConstraintLayout_Layout_circularflow_defaultAngle) {
                    Float fValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, MediaBrowserCompatCustomActionResultReceiver));
                    this.MediaBrowserCompatSearchResultReceiver = fValueOf;
                    setDefaultAngle(fValueOf.floatValue());
                } else if (index == _isBlank.read.ConstraintLayout_Layout_circularflow_defaultRadius) {
                    Integer numValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, AudioAttributesImplApi26Parcelizer));
                    this.onAddQueueItem = numValueOf;
                    setDefaultRadius(numValueOf.intValue());
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.MediaBrowserCompatMediaItem;
        if (str != null) {
            this.AudioAttributesImplBaseParcelizer = new float[1];
            RemoteActionCompatParcelizer(str);
        }
        String str2 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (str2 != null) {
            this.RatingCompat = new int[1];
            read(str2);
        }
        Float f = this.MediaBrowserCompatSearchResultReceiver;
        if (f != null) {
            setDefaultAngle(f.floatValue());
        }
        Integer num = this.onAddQueueItem;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        AudioAttributesCompatParcelizer();
    }

    private void AudioAttributesCompatParcelizer() {
        this.AudioAttributesImplApi21Parcelizer = (ConstraintLayout) getParent();
        for (int i = 0; i < this.write; i++) {
            View viewMediaBrowserCompatItemReceiver = this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatItemReceiver(this.IconCompatParcelizer[i]);
            if (viewMediaBrowserCompatItemReceiver != null) {
                int i2 = AudioAttributesImplApi26Parcelizer;
                float f = MediaBrowserCompatCustomActionResultReceiver;
                int[] iArr = this.RatingCompat;
                if (iArr != null && i < iArr.length) {
                    i2 = iArr[i];
                } else {
                    Integer num = this.onAddQueueItem;
                    if (num != null && num.intValue() != -1) {
                        this.MediaDescriptionCompat++;
                        if (this.RatingCompat == null) {
                            this.RatingCompat = new int[1];
                        }
                        int[] iArrIconCompatParcelizer = IconCompatParcelizer();
                        this.RatingCompat = iArrIconCompatParcelizer;
                        iArrIconCompatParcelizer[this.MediaDescriptionCompat - 1] = i2;
                    } else {
                        this.read.get(Integer.valueOf(viewMediaBrowserCompatItemReceiver.getId()));
                    }
                }
                float[] fArr = this.AudioAttributesImplBaseParcelizer;
                if (fArr != null && i < fArr.length) {
                    f = fArr[i];
                } else {
                    Float f2 = this.MediaBrowserCompatSearchResultReceiver;
                    if (f2 != null && f2.floatValue() != -1.0f) {
                        this.MediaMetadataCompat++;
                        if (this.AudioAttributesImplBaseParcelizer == null) {
                            this.AudioAttributesImplBaseParcelizer = new float[1];
                        }
                        float[] fArr2 = read();
                        this.AudioAttributesImplBaseParcelizer = fArr2;
                        fArr2[this.MediaMetadataCompat - 1] = f;
                    } else {
                        this.read.get(Integer.valueOf(viewMediaBrowserCompatItemReceiver.getId()));
                    }
                }
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) viewMediaBrowserCompatItemReceiver.getLayoutParams();
                layoutParams.AudioAttributesImplBaseParcelizer = f;
                layoutParams.MediaBrowserCompatItemReceiver = this.handleMediaPlayPauseIfPendingOnHandler;
                layoutParams.MediaBrowserCompatCustomActionResultReceiver = i2;
                viewMediaBrowserCompatItemReceiver.setLayoutParams(layoutParams);
            }
        }
        AudioAttributesImplBaseParcelizer();
    }

    public void setDefaultAngle(float f) {
        MediaBrowserCompatCustomActionResultReceiver = f;
    }

    public void setDefaultRadius(int i) {
        AudioAttributesImplApi26Parcelizer = i;
    }

    private void RemoteActionCompatParcelizer(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        this.MediaMetadataCompat = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                IconCompatParcelizer(str.substring(i).trim());
                return;
            } else {
                IconCompatParcelizer(str.substring(i, iIndexOf).trim());
                i = iIndexOf + 1;
            }
        }
    }

    private void read(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        this.MediaDescriptionCompat = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                write(str.substring(i).trim());
                return;
            } else {
                write(str.substring(i, iIndexOf).trim());
                i = iIndexOf + 1;
            }
        }
    }

    private void IconCompatParcelizer(String str) {
        float[] fArr;
        if (str == null || str.length() == 0 || this.MediaBrowserCompatItemReceiver == null || (fArr = this.AudioAttributesImplBaseParcelizer) == null) {
            return;
        }
        if (this.MediaMetadataCompat + 1 > fArr.length) {
            this.AudioAttributesImplBaseParcelizer = Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.AudioAttributesImplBaseParcelizer[this.MediaMetadataCompat] = Integer.parseInt(str);
        this.MediaMetadataCompat++;
    }

    private void write(String str) {
        int[] iArr;
        if (str == null || str.length() == 0 || this.MediaBrowserCompatItemReceiver == null || (iArr = this.RatingCompat) == null) {
            return;
        }
        if (this.MediaDescriptionCompat + 1 > iArr.length) {
            this.RatingCompat = Arrays.copyOf(iArr, iArr.length + 1);
        }
        this.RatingCompat[this.MediaDescriptionCompat] = (int) (Integer.parseInt(str) * this.MediaBrowserCompatItemReceiver.getResources().getDisplayMetrics().density);
        this.MediaDescriptionCompat++;
    }
}
