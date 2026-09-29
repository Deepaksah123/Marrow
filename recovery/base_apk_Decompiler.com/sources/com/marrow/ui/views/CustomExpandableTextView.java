package com.marrow.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.marrow.R;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.MediaPeriodId;
import kotlin.Metadata;
import kotlin._isNaN;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0002\u0013\u0019B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0015J\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\nR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0016\u0010\u000f\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0013\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0016R\u0018\u0010 \u001a\u00060\"R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010!\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0014\u0010\u001e\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR\u0014\u0010\u0011\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001fR\u0016\u0010#\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001fR\u0014\u0010'\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001fR\u0016\u0010&\u001a\u0004\u0018\u00010\u000b8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0012"}, d2 = {"Lcom/marrow/ui/views/CustomExpandableTextView;", "Lcom/marrow/ui/views/CustomTextView;", "Landroid/content/Context;", "p0", "Landroid/util/AttributeSet;", "p1", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "RemoteActionCompatParcelizer", "()V", "", "Landroid/widget/TextView$BufferType;", "setText", "(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V", "read", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "AudioAttributesImplApi26Parcelizer", "()Ljava/lang/CharSequence;", "write", "Landroid/text/SpannableStringBuilder;", "(Landroid/text/SpannableStringBuilder;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "Ljava/lang/CharSequence;", "AudioAttributesCompatParcelizer", "Landroid/widget/TextView$BufferType;", "IconCompatParcelizer", "", "MediaBrowserCompatCustomActionResultReceiver", "Z", "", "AudioAttributesImplBaseParcelizer", "I", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatItemReceiver", "Lcom/marrow/ui/views/CustomExpandableTextView$write;", "MediaBrowserCompatSearchResultReceiver", "Lcom/marrow/ui/views/CustomExpandableTextView$write;", "RatingCompat", "MediaMetadataCompat", "MediaDescriptionCompat"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CustomExpandableTextView extends CustomTextView {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private int MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final CharSequence write;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final boolean AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private boolean read;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final CharSequence MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final write AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final int MediaDescriptionCompat;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final int AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private TextView.BufferType IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private CharSequence AudioAttributesCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomExpandableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        toMagicModuleMetaRepoModel.write(context, "");
        this.read = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, MediaPeriodId.AudioAttributesCompatParcelizer.CustomExpandableTextView);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(typedArrayObtainStyledAttributes, "");
        this.RemoteActionCompatParcelizer = typedArrayObtainStyledAttributes.getInt(4, PsExtractor.VIDEO_STREAM_MASK);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(2, R.string.read_more);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(3, R.string.read_less);
        String string = getResources().getString(resourceId);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        this.write = string;
        String string2 = getResources().getString(resourceId2);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        this.MediaBrowserCompatCustomActionResultReceiver = string2;
        this.MediaDescriptionCompat = typedArrayObtainStyledAttributes.getInt(5, 2);
        this.MediaBrowserCompatItemReceiver = typedArrayObtainStyledAttributes.getColor(0, _isNaN.getColor(context, R.color.colorAccent));
        this.AudioAttributesImplBaseParcelizer = typedArrayObtainStyledAttributes.getBoolean(1, true);
        this.AudioAttributesImplApi26Parcelizer = typedArrayObtainStyledAttributes.getInt(6, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.AudioAttributesImplApi21Parcelizer = new write();
    }

    public /* synthetic */ CustomExpandableTextView(Context context, AttributeSet attributeSet, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer() {
        super.setText(IconCompatParcelizer(), this.IconCompatParcelizer);
        setMovementMethod(LinkMovementMethod.getInstance());
        setHighlightColor(0);
    }

    private final CharSequence IconCompatParcelizer() {
        CharSequence charSequence = this.AudioAttributesCompatParcelizer;
        if (charSequence != null) {
            return read(charSequence);
        }
        return null;
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence p0, TextView.BufferType p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        this.AudioAttributesCompatParcelizer = p0;
        this.IconCompatParcelizer = p1;
        read();
        RemoteActionCompatParcelizer();
    }

    private final CharSequence read(CharSequence p0) {
        if (this.AudioAttributesImplApi26Parcelizer == 1 && p0.length() > this.RemoteActionCompatParcelizer) {
            if (this.read) {
                return AudioAttributesImplApi26Parcelizer();
            }
            return write(p0);
        }
        if (this.AudioAttributesImplApi26Parcelizer == 0 && this.MediaBrowserCompatSearchResultReceiver > 0) {
            if (this.read) {
                Layout layout = getLayout();
                if (layout != null && layout.getLineCount() > this.MediaDescriptionCompat) {
                    return AudioAttributesImplApi26Parcelizer();
                }
            } else {
                return write(p0);
            }
        }
        return p0;
    }

    private final CharSequence AudioAttributesImplApi26Parcelizer() {
        CharSequence charSequence = this.AudioAttributesCompatParcelizer;
        int length = charSequence != null ? charSequence.length() : 0;
        int i = this.AudioAttributesImplApi26Parcelizer;
        if (i == 0 ? (length = this.MediaBrowserCompatSearchResultReceiver - (this.write.length() + 5)) < 0 : i == 1) {
            length = this.RemoteActionCompatParcelizer + 1;
        }
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(this.AudioAttributesCompatParcelizer, 0, length).append((CharSequence) "... ").append(this.write);
        toMagicModuleMetaRepoModel.write(spannableStringBuilderAppend);
        return read(spannableStringBuilderAppend, this.write);
    }

    private final CharSequence write(CharSequence p0) {
        if (!this.AudioAttributesImplBaseParcelizer) {
            return p0;
        }
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(p0, 0, p0.length()).append(this.MediaBrowserCompatCustomActionResultReceiver);
        toMagicModuleMetaRepoModel.write(spannableStringBuilderAppend);
        return read(spannableStringBuilderAppend, this.MediaBrowserCompatCustomActionResultReceiver);
    }

    private final CharSequence read(SpannableStringBuilder p0, CharSequence p1) {
        p0.setSpan(this.AudioAttributesImplApi21Parcelizer, p0.length() - p1.length(), p0.length(), 33);
        return p0;
    }

    final class write extends ClickableSpan {
        public write() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            toMagicModuleMetaRepoModel.write(view, "");
            CustomExpandableTextView.this.read = !r2.read;
            CustomExpandableTextView.this.RemoteActionCompatParcelizer();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            toMagicModuleMetaRepoModel.write(textPaint, "");
            textPaint.setColor(CustomExpandableTextView.this.MediaBrowserCompatItemReceiver);
        }
    }

    public static final class RemoteActionCompatParcelizer implements ViewTreeObserver.OnGlobalLayoutListener {
        RemoteActionCompatParcelizer() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            CustomExpandableTextView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            CustomExpandableTextView.this.write();
            CustomExpandableTextView.this.RemoteActionCompatParcelizer();
        }
    }

    private final void read() {
        CharSequence charSequence;
        if (this.AudioAttributesImplApi26Parcelizer != 0 || (charSequence = this.AudioAttributesCompatParcelizer) == null || charSequence.length() == 0) {
            return;
        }
        getViewTreeObserver().addOnGlobalLayoutListener(new RemoteActionCompatParcelizer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write() {
        int lineEnd;
        try {
            int i = this.MediaDescriptionCompat;
            if (i == 0) {
                lineEnd = getLayout().getLineEnd(0);
            } else {
                lineEnd = (i <= 0 || i > getLineCount()) ? -1 : getLayout().getLineEnd(this.MediaDescriptionCompat - 1);
            }
            this.MediaBrowserCompatSearchResultReceiver = lineEnd;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CustomExpandableTextView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        toMagicModuleMetaRepoModel.write(context, "");
    }
}
