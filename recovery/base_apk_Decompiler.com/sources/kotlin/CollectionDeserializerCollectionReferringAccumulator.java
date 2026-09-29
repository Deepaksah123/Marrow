package kotlin;

import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.NioPathSerializer;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u000f\u0010\u0016J#\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00172\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\"\u0010#R\u001a\u0010\f\u001a\u00020\u00068\u0017X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b \u0010&R7\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00182\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00188C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010'\u001a\u0004\b\f\u0010(\"\u0004\b\u000f\u0010)R\u0016\u0010 \u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010*R\u0016\u0010\u000f\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010*R\u0016\u0010\"\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010*R$\u0010,\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n8\u0015@RX\u0095\u000e¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b\u000f\u0010+"}, d2 = {"Lo/CollectionDeserializerCollectionReferringAccumulator;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Lo/resolveForwardReference;", "Lo/finishBranchObject;", "Landroid/content/Context;", "p0", "Landroid/view/Window;", "p1", "<init>", "(Landroid/content/Context;Landroid/view/Window;)V", "", "", "read", "(ZZ)V", "", "write", "(II)V", "RemoteActionCompatParcelizer", "(Landroid/view/Window;I)I", "p2", "p3", "p4", "(ZIIII)V", "Lo/convertNumberToLong;", "Lkotlin/Function0;", "setContent", "(Lo/convertNumberToLong;Lo/MagicModuleSubmissionRequestBody;)V", "Landroid/view/View;", "Landroidx/core/view/WindowInsetsCompat;", "onApplyWindowInsets", "(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;", "Landroid/view/MotionEvent;", "AudioAttributesCompatParcelizer", "(Landroid/view/MotionEvent;)Z", "IconCompatParcelizer", "(Lo/_handleUnrecognizedCharacterEscape;I)V", "MediaBrowserCompatItemReceiver", "Landroid/view/Window;", "()Landroid/view/Window;", "Lo/InputAccessor;", "()Lo/MagicModuleSubmissionRequestBody;", "(Lo/MagicModuleSubmissionRequestBody;)V", "Z", "()Z", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class CollectionDeserializerCollectionReferringAccumulator extends AbstractComposeView implements resolveForwardReference, finishBranchObject {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private boolean write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private boolean AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final Window read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private boolean AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final InputAccessor RemoteActionCompatParcelizer;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(int i) {
            super(2);
            this.write = i;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void AudioAttributesCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            CollectionDeserializerCollectionReferringAccumulator.this.IconCompatParcelizer(_handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(this.write | 1));
        }
    }

    public CollectionDeserializerCollectionReferringAccumulator(Context context, Window window) {
        super(context, null, 0, 6, null);
        this.read = window;
        this.RemoteActionCompatParcelizer = available.RemoteActionCompatParcelizer$default(_deserializeWithObjectId.IconCompatParcelizer.RemoteActionCompatParcelizer(), null, 2, null);
        CollectionDeserializerCollectionReferringAccumulator collectionDeserializerCollectionReferringAccumulator = this;
        InvalidTypeIdException.read(collectionDeserializerCollectionReferringAccumulator, this);
        InvalidTypeIdException.IconCompatParcelizer(collectionDeserializerCollectionReferringAccumulator, new NioPathSerializer.read() { // from class: o.CollectionDeserializerCollectionReferringAccumulator.4
            {
                super(1);
            }

            @Override // o.NioPathSerializer.read
            public final NioPathSerializer.RemoteActionCompatParcelizer write(NioPathSerializer p0, NioPathSerializer.RemoteActionCompatParcelizer p1) {
                CollectionDeserializerCollectionReferringAccumulator collectionDeserializerCollectionReferringAccumulator2 = CollectionDeserializerCollectionReferringAccumulator.this;
                if (!collectionDeserializerCollectionReferringAccumulator2.write) {
                    View childAt = collectionDeserializerCollectionReferringAccumulator2.getChildAt(0);
                    int iMax = Math.max(0, childAt.getLeft());
                    int iMax2 = Math.max(0, childAt.getTop());
                    int iMax3 = Math.max(0, collectionDeserializerCollectionReferringAccumulator2.getWidth() - childAt.getRight());
                    int iMax4 = Math.max(0, collectionDeserializerCollectionReferringAccumulator2.getHeight() - childAt.getBottom());
                    if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                        return p1.read(_verifyEndArrayForSingle.read(iMax, iMax2, iMax3, iMax4));
                    }
                }
                return p1;
            }

            @Override // o.NioPathSerializer.read
            public final WindowInsetsCompat AudioAttributesCompatParcelizer(WindowInsetsCompat p0, List<NioPathSerializer> p1) {
                CollectionDeserializerCollectionReferringAccumulator collectionDeserializerCollectionReferringAccumulator2 = CollectionDeserializerCollectionReferringAccumulator.this;
                if (!collectionDeserializerCollectionReferringAccumulator2.write) {
                    View childAt = collectionDeserializerCollectionReferringAccumulator2.getChildAt(0);
                    int iMax = Math.max(0, childAt.getLeft());
                    int iMax2 = Math.max(0, childAt.getTop());
                    int iMax3 = Math.max(0, collectionDeserializerCollectionReferringAccumulator2.getWidth() - childAt.getRight());
                    int iMax4 = Math.max(0, collectionDeserializerCollectionReferringAccumulator2.getHeight() - childAt.getBottom());
                    if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                        return p0.IconCompatParcelizer(iMax, iMax2, iMax3, iMax4);
                    }
                }
                return p0;
            }
        });
    }

    @Override // kotlin.resolveForwardReference
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final Window getRead() {
        return this.read;
    }

    private final MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> read() {
        return (MagicModuleSubmissionRequestBody) this.RemoteActionCompatParcelizer.getRemoteActionCompatParcelizer();
    }

    private final void write(MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody) {
        this.RemoteActionCompatParcelizer.write(magicModuleSubmissionRequestBody);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final void read(boolean p0, boolean p1) {
        boolean z = (this.IconCompatParcelizer && p0 == this.AudioAttributesCompatParcelizer && p1 == this.write) ? false : true;
        this.AudioAttributesCompatParcelizer = p0;
        this.write = p1;
        if (z) {
            WindowManager.LayoutParams attributes = getRead().getAttributes();
            int i = p0 ? -2 : -1;
            if (i == ((ViewGroup.LayoutParams) attributes).width && this.IconCompatParcelizer) {
                return;
            }
            getRead().setLayout(i, -2);
            this.IconCompatParcelizer = true;
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void write(int p0, int p1) {
        int iRemoteActionCompatParcelizer;
        int iMin;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.write(p0, p1);
            return;
        }
        int size = View.MeasureSpec.getSize(p0);
        int size2 = View.MeasureSpec.getSize(p1);
        int mode = View.MeasureSpec.getMode(p1);
        if (mode == Integer.MIN_VALUE && !this.AudioAttributesCompatParcelizer && ((ViewGroup.LayoutParams) getRead().getAttributes()).height == -2) {
            iRemoteActionCompatParcelizer = this.write ? RemoteActionCompatParcelizer(getRead(), size2) : size2 + 1;
        } else {
            iRemoteActionCompatParcelizer = size2;
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i = size - paddingLeft;
        if (i < 0) {
            i = 0;
        }
        int i2 = iRemoteActionCompatParcelizer - paddingTop;
        int i3 = i2 >= 0 ? i2 : 0;
        int mode2 = View.MeasureSpec.getMode(p0);
        if (mode2 != 0) {
            p0 = View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            p1 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        childAt.measure(p0, p1);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingLeft);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingLeft;
        }
        if (mode == Integer.MIN_VALUE) {
            iMin = Math.min(size2, childAt.getMeasuredHeight() + paddingTop);
        } else {
            iMin = mode != 1073741824 ? childAt.getMeasuredHeight() + paddingTop : size2;
        }
        setMeasuredDimension(size, iMin);
        if (this.write || childAt.getMeasuredHeight() + paddingTop <= size2 || ((ViewGroup.LayoutParams) getRead().getAttributes()).height != -2) {
            return;
        }
        getRead().addFlags(Integer.MIN_VALUE);
        if (this.AudioAttributesCompatParcelizer) {
            return;
        }
        getRead().setLayout(-1, -1);
    }

    private final int RemoteActionCompatParcelizer(Window p0, int p1) {
        if (Build.VERSION.SDK_INT < 30) {
            return BaseNodeDeserializerContainerStack.INSTANCE.RemoteActionCompatParcelizer(p0);
        }
        return Build.VERSION.SDK_INT < 32 ? _deserializeFromString.INSTANCE.AudioAttributesCompatParcelizer(p0) : p1;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void write(boolean p0, int p1, int p2, int p3, int p4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft2 = getPaddingLeft() + ((((p3 - p1) - measuredWidth) - (paddingLeft + paddingRight)) / 2);
        int paddingTop2 = getPaddingTop() + ((((p4 - p2) - measuredHeight) - (paddingTop + paddingBottom)) / 2);
        childAt.layout(paddingLeft2, paddingTop2, measuredWidth + paddingLeft2, measuredHeight + paddingTop2);
    }

    public final void setContent(convertNumberToLong p0, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> p1) {
        setParentCompositionContext(p0);
        write(p1);
        this.AudioAttributesImplBaseParcelizer = true;
        IconCompatParcelizer();
    }

    public final boolean AudioAttributesCompatParcelizer(MotionEvent p0) {
        View childAt;
        int iRemoteActionCompatParcelizer;
        float x = p0.getX();
        if (!Float.isInfinite(x) && !Float.isNaN(x)) {
            float y = p0.getY();
            if (Float.isInfinite(y) || Float.isNaN(y) || (childAt = getChildAt(0)) == null) {
                return false;
            }
            int left = getLeft() + childAt.getLeft();
            int width = childAt.getWidth();
            int top = getTop() + childAt.getTop();
            int height = childAt.getHeight();
            int iRemoteActionCompatParcelizer2 = getOnline.RemoteActionCompatParcelizer(p0.getX());
            if (left <= iRemoteActionCompatParcelizer2 && iRemoteActionCompatParcelizer2 <= width + left && top <= (iRemoteActionCompatParcelizer = getOnline.RemoteActionCompatParcelizer(p0.getY())) && iRemoteActionCompatParcelizer <= height + top) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void IconCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1735448596);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 3) != 2, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1735448596, i2, -1, "androidx.compose.ui.window.DialogLayout.Content (AndroidDialog.android.kt:454)");
            }
            read().invoke(_handleunrecognizedcharacterescapeWrite, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new read(i));
        }
    }

    @Override // kotlin.finishBranchObject
    public final WindowInsetsCompat onApplyWindowInsets(View p0, WindowInsetsCompat p1) {
        if (!this.write) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return p1.IconCompatParcelizer(iMax, iMax2, iMax3, iMax4);
            }
        }
        return p1;
    }
}
