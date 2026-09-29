package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class FullSegmentEncryptionKeyCache1 implements getApplicationLabel {
    private static final byte[] $$a = {19, -74, 60, -114, 19, 10, 3, -20, 6, -5};
    private static final int $$b = 31;
    private static int AudioAttributesImplApi21Parcelizer = 0;
    private static int AudioAttributesImplApi26Parcelizer = 1;
    public final TextView AudioAttributesCompatParcelizer;
    private TextView AudioAttributesImplBaseParcelizer;
    private ImageView IconCompatParcelizer;
    private final FrameLayout MediaBrowserCompatCustomActionResultReceiver;
    private TextView MediaBrowserCompatItemReceiver;
    public final FrameLayout RemoteActionCompatParcelizer;
    private FrameLayout read;
    public final Button write;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 39
            int r6 = 114 - r6
            int r5 = r5 * 3
            int r5 = 7 - r5
            int r7 = r7 * 2
            int r0 = r7 + 4
            byte[] r1 = kotlin.FullSegmentEncryptionKeyCache1.$$a
            byte[] r0 = new byte[r0]
            int r7 = r7 + 3
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r6
            r4 = r2
            r6 = r5
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L29:
            r3 = r1[r5]
        L2b:
            int r3 = -r3
            int r5 = r5 + 1
            int r6 = r6 + r3
            int r6 = r6 + 6
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.FullSegmentEncryptionKeyCache1.a(byte, short, short, java.lang.Object[]):void");
    }

    private FullSegmentEncryptionKeyCache1(FrameLayout frameLayout, Button button, FrameLayout frameLayout2, ImageView imageView, FrameLayout frameLayout3, TextView textView, TextView textView2, TextView textView3) {
        this.MediaBrowserCompatCustomActionResultReceiver = frameLayout;
        this.write = button;
        this.read = frameLayout2;
        this.IconCompatParcelizer = imageView;
        this.RemoteActionCompatParcelizer = frameLayout3;
        this.AudioAttributesCompatParcelizer = textView;
        this.AudioAttributesImplBaseParcelizer = textView2;
        this.MediaBrowserCompatItemReceiver = textView3;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final FrameLayout IconCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public static FullSegmentEncryptionKeyCache1 RemoteActionCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return RemoteActionCompatParcelizer(layoutInflater.inflate(R.layout.fragment_device_level_kyc_landing, viewGroup, false));
    }

    private static FullSegmentEncryptionKeyCache1 RemoteActionCompatParcelizer(View view) {
        int i = R.id.btVerifyNow;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btVerifyNow);
        if (button != null) {
            i = R.id.container;
            FrameLayout frameLayout = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.container);
            if (frameLayout != null) {
                i = R.id.ivIcon;
                ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivIcon);
                if (imageView != null) {
                    FrameLayout frameLayout2 = (FrameLayout) view;
                    i = R.id.tvLogout;
                    TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvLogout);
                    if (textView != null) {
                        i = R.id.tvSubTitle;
                        TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSubTitle);
                        if (textView2 != null) {
                            i = R.id.tvTitle;
                            TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvTitle);
                            if (textView3 != null) {
                                return new FullSegmentEncryptionKeyCache1(frameLayout2, button, frameLayout, imageView, frameLayout2, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0681 A[PHI: r3
      0x0681: PHI (r3v88 int) = (r3v87 int), (r3v98 int) binds: [B:54:0x067f, B:51:0x0648] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x06d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] write(int r40, int r41, int r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.FullSegmentEncryptionKeyCache1.write(int, int, int):java.lang.Object[]");
    }
}
