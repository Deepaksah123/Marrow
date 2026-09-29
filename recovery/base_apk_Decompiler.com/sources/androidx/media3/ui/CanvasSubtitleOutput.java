package androidx.media3.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import androidx.media3.ui.SubtitleView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.PrivateMaxEntriesMapEntrySet;
import kotlin.PrivateMaxEntriesMapKeySet;
import kotlin.computeNext;
import kotlin.getDefaultImpl;

/* JADX INFO: loaded from: classes4.dex */
final class CanvasSubtitleOutput extends View implements SubtitleView.IconCompatParcelizer {
    private computeNext AudioAttributesCompatParcelizer;
    private float IconCompatParcelizer;
    private int MediaBrowserCompatItemReceiver;
    private final List<PrivateMaxEntriesMapEntrySet> RemoteActionCompatParcelizer;
    private float read;
    private List<getDefaultImpl> write;

    public CanvasSubtitleOutput(Context context) {
        this(context, null);
    }

    public CanvasSubtitleOutput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.RemoteActionCompatParcelizer = new ArrayList();
        this.write = Collections.emptyList();
        this.MediaBrowserCompatItemReceiver = 0;
        this.read = 0.0533f;
        this.AudioAttributesCompatParcelizer = computeNext.IconCompatParcelizer;
        this.IconCompatParcelizer = 0.08f;
    }

    @Override // androidx.media3.ui.SubtitleView.IconCompatParcelizer
    public final void write(List<getDefaultImpl> list, computeNext computenext, float f, int i, float f2) {
        this.write = list;
        this.AudioAttributesCompatParcelizer = computenext;
        this.read = f;
        this.MediaBrowserCompatItemReceiver = i;
        this.IconCompatParcelizer = f2;
        while (this.RemoteActionCompatParcelizer.size() < list.size()) {
            this.RemoteActionCompatParcelizer.add(new PrivateMaxEntriesMapEntrySet(getContext()));
        }
        invalidate();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        List<getDefaultImpl> list = this.write;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i = paddingBottom - paddingTop;
        float fWrite = PrivateMaxEntriesMapKeySet.write(this.MediaBrowserCompatItemReceiver, this.read, height, i);
        if (fWrite > BitmapDescriptorFactory.HUE_RED) {
            int size = list.size();
            int i2 = 0;
            while (i2 < size) {
                getDefaultImpl getdefaultimpl = list.get(i2);
                if (getdefaultimpl.MediaBrowserCompatSearchResultReceiver != Integer.MIN_VALUE) {
                    getdefaultimpl = read(getdefaultimpl);
                }
                getDefaultImpl getdefaultimpl2 = getdefaultimpl;
                int i3 = paddingBottom;
                this.RemoteActionCompatParcelizer.get(i2).write(getdefaultimpl2, this.AudioAttributesCompatParcelizer, fWrite, PrivateMaxEntriesMapKeySet.write(getdefaultimpl2.MediaMetadataCompat, getdefaultimpl2.MediaDescriptionCompat, height, i), this.IconCompatParcelizer, canvas, paddingLeft, paddingTop, width, i3);
                i2++;
                size = size;
                i = i;
                paddingBottom = i3;
                width = width;
            }
        }
    }

    private static getDefaultImpl read(getDefaultImpl getdefaultimpl) {
        getDefaultImpl.write writeVarAudioAttributesCompatParcelizer = getdefaultimpl.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(-3.4028235E38f).IconCompatParcelizer(Integer.MIN_VALUE).AudioAttributesCompatParcelizer((Layout.Alignment) null);
        if (getdefaultimpl.read == 0) {
            writeVarAudioAttributesCompatParcelizer.write(1.0f - getdefaultimpl.IconCompatParcelizer, 0);
        } else {
            writeVarAudioAttributesCompatParcelizer.write((-getdefaultimpl.IconCompatParcelizer) - 1.0f, 1);
        }
        int i = getdefaultimpl.write;
        if (i == 0) {
            writeVarAudioAttributesCompatParcelizer.read(2);
        } else if (i == 2) {
            writeVarAudioAttributesCompatParcelizer.read(0);
        }
        return writeVarAudioAttributesCompatParcelizer.write();
    }
}
