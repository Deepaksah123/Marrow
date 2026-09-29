package com.marrow.ui.views;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.marrow.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.getOrderDetails;
import kotlin.scrubIncrementally;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0011R\u0016\u0010\u0018\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0010\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/marrow/ui/views/DottedProgressView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "p1", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "p2", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "setProgress", "(I)V", "(II)V", "read", "()V", "", "setStatuses", "([I)V", "write", "IconCompatParcelizer", "I", "AudioAttributesCompatParcelizer", "", "RemoteActionCompatParcelizer", "Ljava/util/List;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DottedProgressView extends AppCompatTextView {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private int AudioAttributesCompatParcelizer;
    private List<Integer> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DottedProgressView(Context context) {
        super(context);
        toMagicModuleMetaRepoModel.write(context, "");
        this.AudioAttributesCompatParcelizer = 30;
        this.RemoteActionCompatParcelizer = new ArrayList();
        scrubIncrementally.IconCompatParcelizer(this, context, null);
        read();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DottedProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        toMagicModuleMetaRepoModel.write(context, "");
        this.AudioAttributesCompatParcelizer = 30;
        this.RemoteActionCompatParcelizer = new ArrayList();
        scrubIncrementally.IconCompatParcelizer(this, context, attributeSet);
        read();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DottedProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        toMagicModuleMetaRepoModel.write(context, "");
        this.AudioAttributesCompatParcelizer = 30;
        this.RemoteActionCompatParcelizer = new ArrayList();
        scrubIncrementally.IconCompatParcelizer(this, context, attributeSet);
        read();
    }

    public final void setProgress(int p0) {
        this.read = p0;
        if (this.AudioAttributesCompatParcelizer > 0) {
            read();
        }
    }

    public final void setProgress(int p0, int p1) {
        if (p0 >= this.AudioAttributesCompatParcelizer || this.RemoteActionCompatParcelizer.isEmpty()) {
            return;
        }
        this.RemoteActionCompatParcelizer.set(p0, Integer.valueOf(p1));
        write();
    }

    private final void read() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = this.AudioAttributesCompatParcelizer;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            spannableStringBuilder.append((CharSequence) " ");
        }
        int i4 = this.read;
        while (i2 < i4) {
            int i5 = i2 + 1;
            spannableStringBuilder.setSpan(new ImageSpan(getContext(), R.drawable.ic_circle_mcq_correct), i2, i5, 17);
            i2 = i5;
        }
        int i6 = this.read;
        int i7 = this.AudioAttributesCompatParcelizer;
        while (i6 < i7) {
            int i8 = i6 + 1;
            spannableStringBuilder.setSpan(new ImageSpan(getContext(), R.drawable.ic_circle_mcq_unattempted), i6, i8, 17);
            i6 = i8;
        }
        setText(spannableStringBuilder);
    }

    public final void setStatuses(int[] p0) {
        if (p0 != null) {
            this.RemoteActionCompatParcelizer = getOrderDetails.MediaDescriptionCompat(p0);
        }
        this.AudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.size();
        write();
    }

    private final void write() {
        if (this.RemoteActionCompatParcelizer.isEmpty()) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size = this.RemoteActionCompatParcelizer.size();
        for (int i = 0; i < size; i++) {
            spannableStringBuilder.append((CharSequence) "X ");
        }
        for (int i2 = 0; i2 < (size << 1); i2 += 2) {
            int iIntValue = this.RemoteActionCompatParcelizer.get(i2 / 2).intValue();
            int i3 = R.drawable.ic_circle_mcq_unattempted;
            if (iIntValue != -2) {
                if (iIntValue == -1) {
                    i3 = R.drawable.ic_circle_mcq_wrong;
                } else if (iIntValue == 0) {
                    i3 = R.drawable.ic_circle_mcq_skipped;
                } else if (iIntValue == 1) {
                    i3 = R.drawable.ic_circle_mcq_correct;
                }
            }
            spannableStringBuilder.setSpan(new ImageSpan(getContext(), i3), i2, i2 + 1, 17);
        }
        setText(spannableStringBuilder);
    }
}
