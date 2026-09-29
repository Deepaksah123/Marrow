package kotlin;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import kotlin._init_lambda5;

/* JADX INFO: loaded from: classes.dex */
class setEnabledChangedCallbackactivity_release {
    private final Context AudioAttributesImplBaseParcelizer;
    private TextPaint MediaBrowserCompatMediaItem;
    private final TextView MediaBrowserCompatSearchResultReceiver;
    private static final RectF IconCompatParcelizer = new RectF();
    private static ConcurrentHashMap<String, Method> AudioAttributesCompatParcelizer = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, Field> write = new ConcurrentHashMap<>();
    private int MediaBrowserCompatCustomActionResultReceiver = 0;
    private boolean MediaMetadataCompat = false;
    private float AudioAttributesImplApi26Parcelizer = -1.0f;
    private float RemoteActionCompatParcelizer = -1.0f;
    private float read = -1.0f;
    private int[] MediaBrowserCompatItemReceiver = new int[0];
    private boolean AudioAttributesImplApi21Parcelizer = false;
    private final read RatingCompat = new MediaBrowserCompatCustomActionResultReceiver();

    static class read {
        void RemoteActionCompatParcelizer(StaticLayout.Builder builder, TextView textView) {
        }

        read() {
        }

        boolean RemoteActionCompatParcelizer(TextView textView) {
            return ((Boolean) setEnabledChangedCallbackactivity_release.AudioAttributesCompatParcelizer(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    static class RemoteActionCompatParcelizer extends read {
        RemoteActionCompatParcelizer() {
        }

        @Override // o.setEnabledChangedCallbackactivity_release.read
        void RemoteActionCompatParcelizer(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) setEnabledChangedCallbackactivity_release.AudioAttributesCompatParcelizer(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    static class MediaBrowserCompatCustomActionResultReceiver extends RemoteActionCompatParcelizer {
        MediaBrowserCompatCustomActionResultReceiver() {
        }

        @Override // o.setEnabledChangedCallbackactivity_release.read
        boolean RemoteActionCompatParcelizer(TextView textView) {
            return textView.isHorizontallyScrollable();
        }

        @Override // o.setEnabledChangedCallbackactivity_release.RemoteActionCompatParcelizer, o.setEnabledChangedCallbackactivity_release.read
        void RemoteActionCompatParcelizer(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }
    }

    setEnabledChangedCallbackactivity_release(TextView textView) {
        this.MediaBrowserCompatSearchResultReceiver = textView;
        this.AudioAttributesImplBaseParcelizer = textView.getContext();
    }

    void read(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = this.AudioAttributesImplBaseParcelizer.obtainStyledAttributes(attributeSet, _init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextView, i, 0);
        TextView textView = this.MediaBrowserCompatSearchResultReceiver;
        InvalidTypeIdException.IconCompatParcelizer(textView, textView.getContext(), _init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextView, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        if (typedArrayObtainStyledAttributes.hasValue(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextView_autoSizeTextType)) {
            this.MediaBrowserCompatCustomActionResultReceiver = typedArrayObtainStyledAttributes.getInt(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextView_autoSizeStepGranularity) ? typedArrayObtainStyledAttributes.getDimension(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextView_autoSizeMinTextSize) ? typedArrayObtainStyledAttributes.getDimension(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextView_autoSizeMaxTextSize) ? typedArrayObtainStyledAttributes.getDimension(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextView_autoSizePresetSizes) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            AudioAttributesCompatParcelizer(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (MediaBrowserCompatMediaItem()) {
            if (this.MediaBrowserCompatCustomActionResultReceiver == 1) {
                if (!this.AudioAttributesImplApi21Parcelizer) {
                    DisplayMetrics displayMetrics = this.AudioAttributesImplBaseParcelizer.getResources().getDisplayMetrics();
                    if (dimension2 == -1.0f) {
                        dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    }
                    if (dimension3 == -1.0f) {
                        dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                    }
                    if (dimension == -1.0f) {
                        dimension = 1.0f;
                    }
                    IconCompatParcelizer(dimension2, dimension3, dimension);
                }
                MediaBrowserCompatCustomActionResultReceiver();
                return;
            }
            return;
        }
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
    }

    void IconCompatParcelizer(int i) {
        if (MediaBrowserCompatMediaItem()) {
            if (i == 0) {
                AudioAttributesImplApi26Parcelizer();
                return;
            }
            if (i == 1) {
                DisplayMetrics displayMetrics = this.AudioAttributesImplBaseParcelizer.getResources().getDisplayMetrics();
                IconCompatParcelizer(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (MediaBrowserCompatCustomActionResultReceiver()) {
                    read();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Unknown auto-size text type: ".concat(String.valueOf(i)));
        }
    }

    void AudioAttributesCompatParcelizer(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (MediaBrowserCompatMediaItem()) {
            DisplayMetrics displayMetrics = this.AudioAttributesImplBaseParcelizer.getResources().getDisplayMetrics();
            IconCompatParcelizer(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (MediaBrowserCompatCustomActionResultReceiver()) {
                read();
            }
        }
    }

    void write(int[] iArr, int i) throws IllegalArgumentException {
        if (MediaBrowserCompatMediaItem()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.AudioAttributesImplBaseParcelizer.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                this.MediaBrowserCompatItemReceiver = IconCompatParcelizer(iArrCopyOf);
                if (!AudioAttributesImplApi21Parcelizer()) {
                    StringBuilder sb = new StringBuilder("None of the preset sizes is valid: ");
                    sb.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                this.AudioAttributesImplApi21Parcelizer = false;
            }
            if (MediaBrowserCompatCustomActionResultReceiver()) {
                read();
            }
        }
    }

    int MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    int IconCompatParcelizer() {
        return Math.round(this.AudioAttributesImplApi26Parcelizer);
    }

    int write() {
        return Math.round(this.RemoteActionCompatParcelizer);
    }

    int RemoteActionCompatParcelizer() {
        return Math.round(this.read);
    }

    int[] AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    private void AudioAttributesCompatParcelizer(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.MediaBrowserCompatItemReceiver = IconCompatParcelizer(iArr);
            AudioAttributesImplApi21Parcelizer();
        }
    }

    private boolean AudioAttributesImplApi21Parcelizer() {
        boolean z = this.MediaBrowserCompatItemReceiver.length > 0;
        this.AudioAttributesImplApi21Parcelizer = z;
        if (z) {
            this.MediaBrowserCompatCustomActionResultReceiver = 1;
            this.RemoteActionCompatParcelizer = r0[0];
            this.read = r0[r1 - 1];
            this.AudioAttributesImplApi26Parcelizer = -1.0f;
        }
        return z;
    }

    private int[] IconCompatParcelizer(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                iArr = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
                }
            }
        }
        return iArr;
    }

    private void IconCompatParcelizer(float f, float f2, float f3) throws IllegalArgumentException {
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            StringBuilder sb = new StringBuilder("Minimum auto-size text size (");
            sb.append(f);
            sb.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(sb.toString());
        }
        if (f2 <= f) {
            StringBuilder sb2 = new StringBuilder("Maximum auto-size text size (");
            sb2.append(f2);
            sb2.append("px) is less or equal to minimum auto-size text size (");
            sb2.append(f);
            sb2.append("px)");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (f3 <= BitmapDescriptorFactory.HUE_RED) {
            StringBuilder sb3 = new StringBuilder("The auto-size step granularity (");
            sb3.append(f3);
            sb3.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(sb3.toString());
        }
        this.MediaBrowserCompatCustomActionResultReceiver = 1;
        this.RemoteActionCompatParcelizer = f;
        this.read = f2;
        this.AudioAttributesImplApi26Parcelizer = f3;
        this.AudioAttributesImplApi21Parcelizer = false;
    }

    private boolean MediaBrowserCompatCustomActionResultReceiver() {
        if (MediaBrowserCompatMediaItem() && this.MediaBrowserCompatCustomActionResultReceiver == 1) {
            if (!this.AudioAttributesImplApi21Parcelizer || this.MediaBrowserCompatItemReceiver.length == 0) {
                int iFloor = ((int) Math.floor((this.read - this.RemoteActionCompatParcelizer) / this.AudioAttributesImplApi26Parcelizer)) + 1;
                int[] iArr = new int[iFloor];
                for (int i = 0; i < iFloor; i++) {
                    iArr[i] = Math.round(this.RemoteActionCompatParcelizer + (i * this.AudioAttributesImplApi26Parcelizer));
                }
                this.MediaBrowserCompatItemReceiver = IconCompatParcelizer(iArr);
            }
            this.MediaMetadataCompat = true;
        } else {
            this.MediaMetadataCompat = false;
        }
        return this.MediaMetadataCompat;
    }

    void read() {
        int measuredWidth;
        if (AudioAttributesImplBaseParcelizer()) {
            if (this.MediaMetadataCompat) {
                if (this.MediaBrowserCompatSearchResultReceiver.getMeasuredHeight() <= 0 || this.MediaBrowserCompatSearchResultReceiver.getMeasuredWidth() <= 0) {
                    return;
                }
                if (this.RatingCompat.RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver)) {
                    measuredWidth = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    measuredWidth = (this.MediaBrowserCompatSearchResultReceiver.getMeasuredWidth() - this.MediaBrowserCompatSearchResultReceiver.getTotalPaddingLeft()) - this.MediaBrowserCompatSearchResultReceiver.getTotalPaddingRight();
                }
                int height = (this.MediaBrowserCompatSearchResultReceiver.getHeight() - this.MediaBrowserCompatSearchResultReceiver.getCompoundPaddingBottom()) - this.MediaBrowserCompatSearchResultReceiver.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = IconCompatParcelizer;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float fIconCompatParcelizer = IconCompatParcelizer(rectF);
                    if (fIconCompatParcelizer != this.MediaBrowserCompatSearchResultReceiver.getTextSize()) {
                        write(0, fIconCompatParcelizer);
                    }
                }
            }
            this.MediaMetadataCompat = true;
        }
    }

    private void AudioAttributesImplApi26Parcelizer() {
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
        this.RemoteActionCompatParcelizer = -1.0f;
        this.read = -1.0f;
        this.AudioAttributesImplApi26Parcelizer = -1.0f;
        this.MediaBrowserCompatItemReceiver = new int[0];
        this.MediaMetadataCompat = false;
    }

    void write(int i, float f) {
        Resources resources;
        Context context = this.AudioAttributesImplBaseParcelizer;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        IconCompatParcelizer(TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
    }

    private void IconCompatParcelizer(float f) {
        if (f != this.MediaBrowserCompatSearchResultReceiver.getPaint().getTextSize()) {
            this.MediaBrowserCompatSearchResultReceiver.getPaint().setTextSize(f);
            boolean zRemoteActionCompatParcelizer = write.RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver);
            if (this.MediaBrowserCompatSearchResultReceiver.getLayout() != null) {
                this.MediaMetadataCompat = false;
                try {
                    Method methodWrite = write("nullLayouts");
                    if (methodWrite != null) {
                        methodWrite.invoke(this.MediaBrowserCompatSearchResultReceiver, new Object[0]);
                    }
                } catch (Exception unused) {
                }
                if (!zRemoteActionCompatParcelizer) {
                    this.MediaBrowserCompatSearchResultReceiver.requestLayout();
                } else {
                    this.MediaBrowserCompatSearchResultReceiver.forceLayout();
                }
                this.MediaBrowserCompatSearchResultReceiver.invalidate();
            }
        }
    }

    private int IconCompatParcelizer(RectF rectF) {
        int length = this.MediaBrowserCompatItemReceiver.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = 1;
        int i2 = length - 1;
        int i3 = 0;
        while (i <= i2) {
            int i4 = (i + i2) / 2;
            if (IconCompatParcelizer(this.MediaBrowserCompatItemReceiver[i4], rectF)) {
                int i5 = i4 + 1;
                i3 = i;
                i = i5;
            } else {
                i3 = i4 - 1;
                i2 = i3;
            }
        }
        return this.MediaBrowserCompatItemReceiver[i3];
    }

    void AudioAttributesCompatParcelizer(int i) {
        TextPaint textPaint = this.MediaBrowserCompatMediaItem;
        if (textPaint == null) {
            this.MediaBrowserCompatMediaItem = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.MediaBrowserCompatMediaItem.set(this.MediaBrowserCompatSearchResultReceiver.getPaint());
        this.MediaBrowserCompatMediaItem.setTextSize(i);
    }

    StaticLayout RemoteActionCompatParcelizer(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        return AudioAttributesCompatParcelizer.write(charSequence, alignment, i, i2, this.MediaBrowserCompatSearchResultReceiver, this.MediaBrowserCompatMediaItem, this.RatingCompat);
    }

    private boolean IconCompatParcelizer(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.MediaBrowserCompatSearchResultReceiver.getText();
        TransformationMethod transformationMethod = this.MediaBrowserCompatSearchResultReceiver.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.MediaBrowserCompatSearchResultReceiver)) != null) {
            text = transformation;
        }
        int iRemoteActionCompatParcelizer = IconCompatParcelizer.RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver);
        AudioAttributesCompatParcelizer(i);
        StaticLayout staticLayoutRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(text, (Layout.Alignment) AudioAttributesCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), iRemoteActionCompatParcelizer);
        return (iRemoteActionCompatParcelizer == -1 || (staticLayoutRemoteActionCompatParcelizer.getLineCount() <= iRemoteActionCompatParcelizer && staticLayoutRemoteActionCompatParcelizer.getLineEnd(staticLayoutRemoteActionCompatParcelizer.getLineCount() - 1) == text.length())) && ((float) staticLayoutRemoteActionCompatParcelizer.getHeight()) <= rectF.bottom;
    }

    static <T> T AudioAttributesCompatParcelizer(Object obj, String str, T t) {
        try {
            return (T) write(str).invoke(obj, new Object[0]);
        } catch (Exception unused) {
            return t;
        }
    }

    private static Method write(String str) {
        try {
            Method declaredMethod = AudioAttributesCompatParcelizer.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                AudioAttributesCompatParcelizer.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception unused) {
            return null;
        }
    }

    boolean AudioAttributesImplBaseParcelizer() {
        return MediaBrowserCompatMediaItem() && this.MediaBrowserCompatCustomActionResultReceiver != 0;
    }

    private boolean MediaBrowserCompatMediaItem() {
        return !(this.MediaBrowserCompatSearchResultReceiver instanceof AppCompatEditText);
    }

    static final class AudioAttributesCompatParcelizer {
        static StaticLayout write(CharSequence charSequence, Layout.Alignment alignment, int i, int i2, TextView textView, TextPaint textPaint, read readVar) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i2 == -1) {
                i2 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i2);
            try {
                readVar.RemoteActionCompatParcelizer(builderObtain, textView);
            } catch (ClassCastException unused) {
            }
            return builderObtain.build();
        }
    }

    static final class write {
        static boolean RemoteActionCompatParcelizer(View view) {
            return view.isInLayout();
        }
    }

    static final class IconCompatParcelizer {
        static int RemoteActionCompatParcelizer(TextView textView) {
            return textView.getMaxLines();
        }
    }
}
