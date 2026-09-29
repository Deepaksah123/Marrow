package androidx.media3.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.media3.ui.SubtitleView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.LaissezFaireSubTypeValidator;
import kotlin.PrivateMaxEntriesMap;
import kotlin.PrivateMaxEntriesMapKeySet;
import kotlin.computeNext;
import kotlin.getDefaultImpl;

/* JADX INFO: loaded from: classes4.dex */
final class WebViewSubtitleOutput extends FrameLayout implements SubtitleView.IconCompatParcelizer {
    private computeNext AudioAttributesCompatParcelizer;
    private List<getDefaultImpl> AudioAttributesImplApi26Parcelizer;
    private final WebView AudioAttributesImplBaseParcelizer;
    private float IconCompatParcelizer;
    private final CanvasSubtitleOutput RemoteActionCompatParcelizer;
    private int read;
    private float write;

    private static int RemoteActionCompatParcelizer(int i) {
        if (i != 1) {
            return i != 2 ? 0 : -100;
        }
        return -50;
    }

    public WebViewSubtitleOutput(Context context) {
        this(context, null);
    }

    public WebViewSubtitleOutput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.AudioAttributesImplApi26Parcelizer = Collections.emptyList();
        this.AudioAttributesCompatParcelizer = computeNext.IconCompatParcelizer;
        this.write = 0.0533f;
        this.read = 0;
        this.IconCompatParcelizer = 0.08f;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, attributeSet);
        this.RemoteActionCompatParcelizer = canvasSubtitleOutput;
        WebView webView = new WebView(context, attributeSet) { // from class: androidx.media3.ui.WebViewSubtitleOutput.1
            @Override // android.webkit.WebView, android.view.View
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                super.onTouchEvent(motionEvent);
                return false;
            }

            @Override // android.view.View
            public final boolean performClick() {
                super.performClick();
                return false;
            }
        };
        this.AudioAttributesImplBaseParcelizer = webView;
        webView.setBackgroundColor(0);
        addView(canvasSubtitleOutput);
        addView(webView);
    }

    @Override // androidx.media3.ui.SubtitleView.IconCompatParcelizer
    public final void write(List<getDefaultImpl> list, computeNext computenext, float f, int i, float f2) {
        this.AudioAttributesCompatParcelizer = computenext;
        this.write = f;
        this.read = i;
        this.IconCompatParcelizer = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            getDefaultImpl getdefaultimpl = list.get(i2);
            if (getdefaultimpl.AudioAttributesCompatParcelizer != null) {
                arrayList.add(getdefaultimpl);
            } else {
                arrayList2.add(getdefaultimpl);
            }
        }
        if (!this.AudioAttributesImplApi26Parcelizer.isEmpty() || !arrayList2.isEmpty()) {
            this.AudioAttributesImplApi26Parcelizer = arrayList2;
            IconCompatParcelizer();
        }
        this.RemoteActionCompatParcelizer.write(arrayList, computenext, f, i, f2);
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.AudioAttributesImplApi26Parcelizer.isEmpty()) {
            return;
        }
        IconCompatParcelizer();
    }

    public final void AudioAttributesCompatParcelizer() {
        this.AudioAttributesImplBaseParcelizer.destroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void IconCompatParcelizer() {
        /*
            Method dump skipped, instruction units count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.WebViewSubtitleOutput.IconCompatParcelizer():void");
    }

    private static String IconCompatParcelizer(getDefaultImpl getdefaultimpl) {
        String str;
        if (getdefaultimpl.MediaBrowserCompatItemReceiver != BitmapDescriptorFactory.HUE_RED) {
            if (getdefaultimpl.MediaBrowserCompatSearchResultReceiver == 2 || getdefaultimpl.MediaBrowserCompatSearchResultReceiver == 1) {
                str = "skewY";
            } else {
                str = "skewX";
            }
            return LaissezFaireSubTypeValidator.read("%s(%.2fdeg)", str, Float.valueOf(getdefaultimpl.MediaBrowserCompatItemReceiver));
        }
        return "";
    }

    private String AudioAttributesCompatParcelizer(int i, float f) {
        float fWrite = PrivateMaxEntriesMapKeySet.write(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (fWrite == -3.4028235E38f) {
            return "unset";
        }
        return LaissezFaireSubTypeValidator.read("%.2fpx", Float.valueOf(fWrite / getContext().getResources().getDisplayMetrics().density));
    }

    private static String RemoteActionCompatParcelizer(computeNext computenext) {
        int i = computenext.AudioAttributesCompatParcelizer;
        if (i == 1) {
            return LaissezFaireSubTypeValidator.read("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", PrivateMaxEntriesMap.AudioAttributesCompatParcelizer(computenext.read));
        }
        if (i == 2) {
            return LaissezFaireSubTypeValidator.read("0.1em 0.12em 0.15em %s", PrivateMaxEntriesMap.AudioAttributesCompatParcelizer(computenext.read));
        }
        if (i == 3) {
            return LaissezFaireSubTypeValidator.read("0.06em 0.08em 0.15em %s", PrivateMaxEntriesMap.AudioAttributesCompatParcelizer(computenext.read));
        }
        if (i == 4) {
            return LaissezFaireSubTypeValidator.read("-0.05em -0.05em 0.15em %s", PrivateMaxEntriesMap.AudioAttributesCompatParcelizer(computenext.read));
        }
        return "unset";
    }

    private static String read(int i) {
        if (i == 1) {
            return "vertical-rl";
        }
        if (i == 2) {
            return "vertical-lr";
        }
        return "horizontal-tb";
    }

    private static String AudioAttributesCompatParcelizer(Layout.Alignment alignment) {
        if (alignment == null) {
            return TtmlNode.CENTER;
        }
        int i = AnonymousClass4.write[alignment.ordinal()];
        if (i == 1) {
            return TtmlNode.START;
        }
        if (i != 2) {
            return TtmlNode.CENTER;
        }
        return TtmlNode.END;
    }

    /* JADX INFO: renamed from: androidx.media3.ui.WebViewSubtitleOutput$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            write = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                write[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                write[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
