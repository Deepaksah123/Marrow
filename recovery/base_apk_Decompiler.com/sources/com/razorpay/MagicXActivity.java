package com.razorpay;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.DownloadService;
import kotlin.Metadata;
import kotlin.notifyDownloadChanged;
import kotlin.startForeground;
import kotlin.toMagicModuleMetaRepoModel;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\nH\u0007J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\nH\u0002J\u0012\u0010\u0015\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0010H\u0002J\b\u0010\u0019\u001a\u00020\u0010H\u0002J\b\u0010\u001a\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/razorpay/MagicXActivity;", "Landroid/app/Activity;", "()V", "itemsToBeAddedToCart", "Lorg/json/JSONArray;", "magicxLoaded", "", "parentContainer", "Landroid/view/ViewGroup;", "storefrontUrl", "", "viewCover", "Landroid/view/View;", "webView", "Landroid/webkit/WebView;", "dismissHalfTransparentPage", "", "errorFromJs", "error", "handleShouldInterceptRequest", "url", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setSettingsForWebView", "setWebViewClientForMagicX", "showHalfTransparentPage", "Companion", "checkout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class MagicXActivity extends Activity {
    private static long AudioAttributesCompatParcelizer = 0;
    private static int AudioAttributesImplApi21Parcelizer = 0;
    public static final MagicXActivity$O$$$__o0Oo Companion;
    private static char[] IconCompatParcelizer = null;
    public static final int MAGICX_REQUEST_CODE = 98001;
    public static final int MAGICX_RESPONSE_CODE = 99002;
    private static final String TAG = "MagicXActivity";
    private static long write;
    private JSONArray itemsToBeAddedToCart;
    private boolean magicxLoaded;
    private ViewGroup parentContainer;
    private String storefrontUrl;
    private View viewCover;
    private WebView webView;
    private static final byte[] $$c = {61, 46, 102, -127};
    private static final int $$f = 246;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {TarConstants.LF_SYMLINK, 124, -128, 125, -18, -4, 57, -62, -1, -24, -7, 9, -19, -12, 5, -5, 56, -66, 3, -8, -14, -14, -2, -5, 58, -60, -3, -25, 13, -7, -13, -11, 4, TarConstants.LF_NORMAL, -66, 0, -13, TarConstants.LF_BLK, -9, 0, -34, 0, -13, 20, -9, -39, -37, 5, -9, 66, -52, -21, -28, 29, -43, 3, 5, 17, -25, -18, 2, -58, 11, -11, -12, 40, -57, -6, -4, 3, 1, -25, -5, 9, -20, 42, -50, -4, -9, 9, -25, 30, -23, -23, 9, -8, -13, -3, -23, 15, -19, -25, -14, -8, -11, 9, 30, -40, -23, 5, -12, -5, 37, -50, -4, -9, 9, -25, 30, -23, -23, 9, -8, -13, -3, -23, 15, -19, 59, -29, -57, 3, 25, -34, 5, -30, 14, -19, 35, -42, -9, -2, 35, -50, -4, -9, -5, -5, 3, -15, -12, 34, -35, -16, -7, 9, -15, 3, -19, 39, -57, -2, 9, -19, -2, 7, -17, 19, -44, 5, -12, 6, -3, -21, 5, 0, 17, -27, -18, 5, -8, -3, 41, -32, -18, -5, 37, -50, -4, -9, 9, -25, 30, -23, -23, 9, -8, -13, -3, -23, 15, -19};
    private static final int $$e = 64;
    private static final byte[] $$a = {TarConstants.LF_SYMLINK, -51, -30, -2, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 127;
    private static int MediaBrowserCompatItemReceiver = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;

    private static String $$g(short s, byte b, int i) {
        int i2 = b * 4;
        int i3 = 121 - (i * 2);
        byte[] bArr = $$c;
        int i4 = 3 - (s * 4);
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i6 = -1;
            i3 = i4 + i5;
            i4 = i4;
        }
        while (true) {
            int i7 = i6 + 1;
            int i8 = i4 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            i6 = i7;
            i3 = bArr[i8] + i3;
            i4 = i8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0023). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = 44 - r5
            int r6 = r6 + 4
            int r7 = r7 + 65
            byte[] r0 = com.razorpay.MagicXActivity.$$a
            byte[] r1 = new byte[r5]
            r2 = 0
            if (r0 != 0) goto L11
            r4 = r7
            r3 = r2
            r7 = r5
            goto L23
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r5) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L21:
            r4 = r0[r6]
        L23:
            int r7 = r7 + r4
            int r6 = r6 + 1
            int r7 = r7 + (-1)
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.MagicXActivity.c(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = 172 - r7
            int r6 = r6 + 65
            byte[] r0 = com.razorpay.MagicXActivity.$$d
            int r1 = 58 - r8
            byte[] r1 = new byte[r1]
            int r8 = 57 - r8
            r2 = 0
            if (r0 != 0) goto L13
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2a
        L13:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            int r6 = r6 + 1
            r4 = r0[r6]
        L2a:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-6)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.MagicXActivity.d(int, short, int, java.lang.Object[]):void");
    }

    public static final /* synthetic */ void access$dismissHalfTransparentPage(MagicXActivity magicXActivity) {
        int i = 2 % 2;
        int i2 = read + 55;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        magicXActivity.dismissHalfTransparentPage();
        int i4 = RemoteActionCompatParcelizer + 101;
        read = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ JSONArray access$getItemsToBeAddedToCart$p(MagicXActivity magicXActivity) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 65;
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        JSONArray jSONArray = magicXActivity.itemsToBeAddedToCart;
        int i5 = i2 + 75;
        RemoteActionCompatParcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            return jSONArray;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ boolean access$getMagicxLoaded$p(MagicXActivity magicXActivity) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 81;
        read = i3 % 128;
        int i4 = i3 % 2;
        boolean z = magicXActivity.magicxLoaded;
        if (i4 == 0) {
            int i5 = 29 / 0;
        }
        int i6 = i2 + 15;
        read = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 51 / 0;
        }
        return z;
    }

    public static final /* synthetic */ String access$getStorefrontUrl$p(MagicXActivity magicXActivity) {
        int i = 2 % 2;
        int i2 = read + 7;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        String str = magicXActivity.storefrontUrl;
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    public static final /* synthetic */ WebView access$getWebView$p(MagicXActivity magicXActivity) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 23;
        int i3 = i2 % 128;
        read = i3;
        int i4 = i2 % 2;
        WebView webView = magicXActivity.webView;
        int i5 = i3 + 15;
        RemoteActionCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
        return webView;
    }

    public static final /* synthetic */ void access$setMagicxLoaded$p(MagicXActivity magicXActivity, boolean z) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 53;
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        magicXActivity.magicxLoaded = z;
        int i5 = i2 + 41;
        RemoteActionCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void showHalfTransparentPage() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 41;
        read = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.viewCover != null) {
            runOnUiThread(new Runnable() { // from class: com.razorpay.MagicXActivity$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MagicXActivity.$r8$lambda$S0o1cf8qZE3MhWelPCCABOETX0k(this.f$0);
                }
            });
        }
        int i3 = RemoteActionCompatParcelizer + 117;
        read = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 29 / 0;
        }
    }

    /* JADX INFO: renamed from: showHalfTransparentPage$lambda-0, reason: not valid java name */
    private static final void m218showHalfTransparentPage$lambda0(MagicXActivity magicXActivity) {
        int i = 2 % 2;
        int i2 = read + 113;
        RemoteActionCompatParcelizer = i2 % 128;
        View view = null;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(magicXActivity, "");
            ViewGroup viewGroup = magicXActivity.parentContainer;
            throw null;
        }
        toMagicModuleMetaRepoModel.write(magicXActivity, "");
        ViewGroup viewGroup2 = magicXActivity.parentContainer;
        if (viewGroup2 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            viewGroup2 = null;
        }
        View view2 = magicXActivity.viewCover;
        if (view2 == null) {
            int i3 = RemoteActionCompatParcelizer + 35;
            read = i3 % 128;
            int i4 = i3 % 2;
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            if (i4 == 0) {
                int i5 = 11 / 0;
            }
        } else {
            view = view2;
        }
        viewGroup2.addView(view);
        CheckoutUtils.showLoaderForMagicX(magicXActivity, "#000000");
    }

    private final void dismissHalfTransparentPage() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 51;
        read = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 75 / 0;
            if (this.viewCover == null) {
                return;
            }
        } else if (this.viewCover == null) {
            return;
        }
        this.magicxLoaded = true;
        runOnUiThread(new Runnable() { // from class: com.razorpay.MagicXActivity$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                MagicXActivity.$r8$lambda$k407g0tYW5eMZfyIrwTM4ajdOdI(this.f$0);
            }
        });
        int i4 = RemoteActionCompatParcelizer + 123;
        read = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadChanged notifydownloadchanged = new notifyDownloadChanged();
        notifydownloadchanged.read = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        int i3 = $10 + 67;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i5 = notifydownloadchanged.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1435583294);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 38461), TextUtils.indexOf("", "", 0, 0) + 532, (-16777208) - Color.rgb(0, 0, 0), -735610793, false, $$g(b, b2, b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() ^ (AudioAttributesCompatParcelizer ^ 2192498202983240651L);
                Object[] objArr3 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (36621 - KeyEvent.getDeadChar(0, 0)), TextUtils.lastIndexOf("", '0') + 2341, 28 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 188119637, false, $$g(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i6 = $10 + 111;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
            Object[] objArr4 = {notifydownloadchanged, notifydownloadchanged};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1971306176);
            if (objRemoteActionCompatParcelizer3 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 36620), Color.red(0) + 2340, 28 - TextUtils.getCapsMode("", 0, 0), 188119637, false, $$g(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX INFO: renamed from: dismissHalfTransparentPage$lambda-1, reason: not valid java name */
    private static final void m217dismissHalfTransparentPage$lambda1(MagicXActivity magicXActivity) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 97;
        read = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(magicXActivity, "");
        ViewGroup viewGroup = magicXActivity.parentContainer;
        View view = null;
        if (viewGroup == null) {
            int i4 = read + 113;
            RemoteActionCompatParcelizer = i4 % 128;
            if (i4 % 2 != 0) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                view.hashCode();
                throw null;
            }
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            viewGroup = null;
        }
        View view2 = magicXActivity.viewCover;
        if (view2 == null) {
            int i5 = RemoteActionCompatParcelizer + 99;
            read = i5 % 128;
            if (i5 % 2 == 0) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                int i6 = 10 / 0;
            } else {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            }
            int i7 = RemoteActionCompatParcelizer + 51;
            read = i7 % 128;
            int i8 = i7 % 2;
        } else {
            view = view2;
        }
        viewGroup.removeView(view);
        CheckoutUtils.dismissLoader();
    }

    private static void a(char c, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i2];
        downloadService.write = 0;
        int i4 = $10 + 65;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (downloadService.write < i2) {
            int i6 = downloadService.write;
            try {
                Object[] objArr2 = {Integer.valueOf(IconCompatParcelizer[i + i6])};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.indexOf("", "") + 36621), ExpandableListView.getPackedPositionType(0L) + 2340, (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 27, 480654850, false, $$g(b, b2, (byte) (b2 | 10)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(write), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 9701 - TextUtils.getCapsMode("", 0, 0), 25 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (TextUtils.lastIndexOf("", '0') + 1), TextUtils.lastIndexOf("", '0') + 23785, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            int i7 = $11 + 99;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr5 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) Gravity.getAbsoluteGravity(0, 0), TextUtils.indexOf("", "") + 23784, (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0195  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2697
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.MagicXActivity.onCreate(android.os.Bundle):void");
    }

    @JavascriptInterface
    public final void errorFromJs(String error) {
        int i = 2 % 2;
        int i2 = read + 59;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(error, "");
        Toast.makeText(this, error, 1).show();
        int i4 = RemoteActionCompatParcelizer + 99;
        read = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void setWebViewClientForMagicX() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 19;
        read = i2 % 128;
        WebView webView = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        WebView webView2 = this.webView;
        if (webView2 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            webView = webView2;
        }
        webView.setWebViewClient(new MagicXActivity$_$O0_o(this));
        int i3 = read + 55;
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void setSettingsForWebView() {
        int i = 2 % 2;
        WebView webView = this.webView;
        WebView webView2 = null;
        if (webView == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            int i2 = RemoteActionCompatParcelizer + 121;
            read = i2 % 128;
            int i3 = i2 % 2;
            webView = null;
        }
        webView.getSettings().setJavaScriptEnabled(true);
        WebView webView3 = this.webView;
        if (webView3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            webView3 = null;
        }
        webView3.getSettings().setDomStorageEnabled(true);
        WebView webView4 = this.webView;
        if (webView4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            int i4 = RemoteActionCompatParcelizer + 109;
            read = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 / 5;
            }
        } else {
            webView2 = webView4;
        }
        webView2.addJavascriptInterface(this, "MagicXBridge");
    }

    @Override // android.app.Activity
    protected final void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 19;
        read = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            a((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 58174), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(com.marrow.R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 17, 'J' - AndroidCharacter.getMirror('0'), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(((byte) KeyEvent.getModifierMetaStateMask()) + 38394, new char[]{53678, 17473, 64077, 4180, 34380, 15486, 21103, 51267, 32373, 38012, 2587, 40983, 54786, 19465, 57895, 6195, 36402, 9258}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = RemoteActionCompatParcelizer + 53;
            read = i4 % 128;
            int i5 = i4 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i6 = RemoteActionCompatParcelizer + 45;
            read = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 4535), 6054 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 42 - Color.green(0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.argb(0, 0, 0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 6030, (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 23, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onResume();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c7  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.MagicXActivity.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00dc  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5597
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.MagicXActivity.attachBaseContext(android.content.Context):void");
    }

    public static /* synthetic */ void $r8$lambda$S0o1cf8qZE3MhWelPCCABOETX0k(MagicXActivity magicXActivity) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 1;
        read = i2 % 128;
        int i3 = i2 % 2;
        m218showHalfTransparentPage$lambda0(magicXActivity);
        int i4 = RemoteActionCompatParcelizer + 33;
        read = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void $r8$lambda$k407g0tYW5eMZfyIrwTM4ajdOdI(MagicXActivity magicXActivity) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 61;
        read = i2 % 128;
        int i3 = i2 % 2;
        m217dismissHalfTransparentPage$lambda1(magicXActivity);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = read + 5;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        AudioAttributesImplApi21Parcelizer = 0;
        read();
        Companion = new MagicXActivity$O$$$__o0Oo(null);
        int i = MediaBrowserCompatItemReceiver + 5;
        AudioAttributesImplApi21Parcelizer = i % 128;
        if (i % 2 != 0) {
            int i2 = 6 / 0;
        }
    }

    private final void handleShouldInterceptRequest(String url) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 119;
        read = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 67;
        read = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            throw null;
        }
        int i4 = read + 89;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    static void read() {
        IconCompatParcelizer = new char[]{56429, 26815, 46546, 49897, 3863, 21556, 57670, 11817, 31371, 34746, 52352, 6435, 42530, 62298, 14457, 17562, 37295, 57042, 16140, 35806, 22195, 8584, 60534, 46933, 551, 52552, 39396, 25816, 12223, 64060, 17776, 4151, 56079, 42999, 29387, 15785, 34963, 21363, 7805, 59684, 46561, 211, 52148, 38556, 56380, 26802, 46549, 49835, 3919, 21564, 57621, 11825, 31441, 34814, 52426, 6417, 42592, 62212, 14462, 17609, 37309, 57028, 27623, 45138, 64894, 2581, 22214, 58350, 10454, 30120, 33359, 53107, 5145, 41266, 60888, 15103, 18332, 35909, 55604, 26120, 45950, 65487, 1265, 20887, 40636, 11102, 28716, 48503, 51604, 5811, 41867, 59643, 13644, 17016, 36627, 54331, 24793, 44532, 64166, 1858, 19564, 39263, 9851, 29312, 49141, 50368, 4537, 24152, 64613, 18667, 38364, 58100, 12098, 29796, 49482, 3636, 23179, 42918, 60560, 14665, 34403, 54111, 6261, 25744, 45551, 65227, 19439, 36945, 56689, 10775, 30410, 50158, 2182, 22007, 41489, 61297, 13336, 33080, 52688, 6908, 26515, 44059, 63850, 18005, 37746, 57235, 9466, 29130, 48830, 2896, 20512, 40232, 59800, 14060, 33665, 51445, 5442, 25134, 44875, 62561, 16594, 36336, 55978, 10015, 27758, 47440, 1568, 21130, 40957, 58521, 12727, 32348, 56420, 26789, 46530, 49899, 3851, 21607, 57613, 11816, 31360, 34728, 52423, 6431, 42537, 62279, 14453, 17546, 37298, 57029, 27637, 45125, 64828, 2629, 22144, 58290, 10453, 30189, 33309, 53026, 5203, 41329, 60868, 15016, 18393, 35856, 55588, 26207, 45931, 65420, 1207, 20934, 40694, 11020, 28768, 48496, 51615, 5816, 41877, 59646, 13580, 16936, 36617, 54370, 24710, 44458, 64247, 1796, 19488, 39190, 9832, 29393, 49135, 50368, 4604, 24074, 60194, 12389, 31877, 56421, 26805, 46547, 49909, 3852, 21556, 57686, 11902, 31404, 34728, 52445, 6427, 42515, 62298, 14462, 17562, 56429, 26815, 46546, 49897, 3863, 21556, 57670, 11817, 31371, 34746, 52352, 6432, 42537, 62278, 14446, 17562, 37297, 57058, 27626, 45060, 64811, 2630, 56376, 26851, 46479, 49839, 3905, 21611, 57621, 11829, 31453, 34815, 52382, 56372, 26848, 46464, 49835, 3916, 21614, 57621, 11839, 31442, 34811, 52378};
        write = -9780501156697903L;
        AudioAttributesCompatParcelizer = -9052454517240217082L;
    }
}
