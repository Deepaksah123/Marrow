package kotlin;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.Glide;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Map;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class canKeepMediaPeriodHolder implements Handler.Callback {
    private static final write write = new write() { // from class: o.canKeepMediaPeriodHolder.1
        private static int AudioAttributesCompatParcelizer;
        private static long RemoteActionCompatParcelizer;
        private static long read;
        private static int write;
        private static final byte[] $$c = {64, -102, 72, -66};
        private static final int $$d = 5;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {69, 85, TarConstants.LF_DIR, TarConstants.LF_LINK, 26, 12, -1, -43, 44, -2, 3, -15, 19, -36, 17, 17, -15, 2, 7, -3, 17, -21, 13};
        private static final int $$b = 212;
        private static final byte[] IconCompatParcelizer = {20, 28, 18, 12, -14, 9, -15, 2, 5, 4, TarConstants.LF_DIR, -58, -12, 16, -16, 7, -2, 5, -17, 68, -22, -45, 2, -4, -4, -12, -5, 7, 6, -14, 9, -15, 2, 5, 4, TarConstants.LF_DIR, -66, -5, 68, -38, -39, 5, -2, 14, -9, 41, -42, -4, 11, -9, -8, 10, -16, -4, 13, 0, 17, -20, 3, -12, -9, 10, -5, 7, 8, -22, 20, TarConstants.LF_SYMLINK, -63, 10, -14, 6, 56, -38, -34, 1, 8, -6, 6, 2, 3, 2, -12, 8, -22, 20, TarConstants.LF_SYMLINK, -63, 10, -14, 6, 56, -28, -38, -7, 14, -3, 1, -14, 20, -12, -10, 15, 21, -24, -6, -7, 29, -12, -12, -10, 15, 4, -5, 10, -5, 7, 23, -29, -4, -1, 2, -11, 8, -22, 20, TarConstants.LF_SYMLINK, -63, 10, -14, 6, 56, -39, -21, -11, 2, -9, 21, -2, -11, 6, 1, -16, TarConstants.LF_NORMAL, -31, -21, 1, 13, 8, -22, 20, TarConstants.LF_SYMLINK, -63, 10, -14, 6, 56, -34, -20, -9, 4, 1, -18, 8, -22, 20, TarConstants.LF_SYMLINK, -63, 10, -14, 6, 56, -31, -36, 0, 6, -6, 8, 10, 8, -22, 20, TarConstants.LF_SYMLINK, -63, 10, -14, 6, 56, -69, 12, -2, -7, 6, 1, -18, 69, -20, -35, -1, -3, -15, -1, 9, 6, -11, 6, 21, -20, -9, 4, 1, -18, 13, -16, TarConstants.LF_SYMLINK, -35, -1, -3, -15, -1, 9, 6, -11, 6, 8, -22, 20, TarConstants.LF_SYMLINK, -63, 10, -14, 6, 56, -69, 12, -2, -7, 6, 1, -18, 69, -32, -25, -16, 11, -8, 10, -6, -9, 6, 3, 5, 14, -31, 8, -22, 20, TarConstants.LF_SYMLINK, -63, 10, -14, 6, 56, -34, -20, -9, 4, 1, -18, 56};
        private static final int AudioAttributesImplApi26Parcelizer = 160;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$e(int r7, short r8, byte r9) {
            /*
                byte[] r0 = kotlin.canKeepMediaPeriodHolder.AnonymousClass1.$$c
                int r8 = r8 * 3
                int r8 = r8 + 4
                int r7 = r7 * 2
                int r7 = 104 - r7
                int r9 = r9 * 4
                int r9 = 1 - r9
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L17
                r7 = r8
                r3 = r9
                r5 = r2
                goto L2d
            L17:
                r3 = r2
            L18:
                r6 = r8
                r8 = r7
                r7 = r6
                byte r4 = (byte) r8
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r9) goto L28
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L28:
                r3 = r0[r7]
                r6 = r8
                r8 = r7
                r7 = r6
            L2d:
                int r8 = r8 + 1
                int r3 = -r3
                int r7 = r7 + r3
                r3 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.canKeepMediaPeriodHolder.AnonymousClass1.$$e(int, short, byte):java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void d(byte r6, int r7, byte r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 2
                int r0 = 20 - r7
                int r8 = r8 * 4
                int r8 = 4 - r8
                int r6 = r6 * 4
                int r6 = 73 - r6
                byte[] r1 = kotlin.canKeepMediaPeriodHolder.AnonymousClass1.$$a
                byte[] r0 = new byte[r0]
                int r7 = 19 - r7
                r2 = 0
                if (r1 != 0) goto L19
                r3 = r7
                r6 = r8
                r4 = r2
                goto L2e
            L19:
                r3 = r2
                r5 = r8
                r8 = r6
                r6 = r5
            L1d:
                byte r4 = (byte) r8
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L2c
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L2c:
                r3 = r1[r6]
            L2e:
                int r8 = r8 + r3
                int r6 = r6 + 1
                r3 = r4
                goto L1d
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.canKeepMediaPeriodHolder.AnonymousClass1.d(byte, int, byte, java.lang.Object[]):void");
        }

        private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
            buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
            char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer ^ 4027965449757546139L, cArr, i);
            buildsetrequirementsintent.write = 4;
            while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
                buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
                int i2 = buildsetrequirementsintent.write;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(RemoteActionCompatParcelizer)};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) Color.green(0), TextUtils.getCapsMode("", 0, 0) + 12424, 20 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrAudioAttributesCompatParcelizer[i2] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b = (byte) ($$d - 5);
                        byte b2 = b;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getTapTimeout() >> 16), 1868 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 10, 1983509525, false, $$e(b, b2, b2), new Class[]{Object.class, Object.class});
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
            objArr[0] = new String(cArrAudioAttributesCompatParcelizer, 4, cArrAudioAttributesCompatParcelizer.length - 4);
        }

        private static void c(int i, char[] cArr, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
            char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(read ^ 4027965449757546139L, cArr, i);
            buildsetrequirementsintent.write = 4;
            int i3 = $10 + 37;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
                buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
                int i5 = buildsetrequirementsintent.write;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(read)};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 12423 - ((byte) KeyEvent.getModifierMetaStateMask()), 21 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrAudioAttributesCompatParcelizer[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b = (byte) ($$d - 5);
                        byte b2 = b;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ExpandableListView.getPackedPositionType(0L), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1868, 10 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1983509525, false, $$e(b, b2, b2), new Class[]{Object.class, Object.class});
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
            String str = new String(cArrAudioAttributesCompatParcelizer, 4, cArrAudioAttributesCompatParcelizer.length - 4);
            int i6 = $11 + 89;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            objArr[0] = str;
        }

        @Override // o.canKeepMediaPeriodHolder.write
        public final ForwardingPlayer write(Glide glide, setRendererOffset setrendereroffset, copyWithRequestedContentPositionUs copywithrequestedcontentpositionus, Context context) {
            int i = 2 % 2;
            ForwardingPlayer forwardingPlayer = new ForwardingPlayer(glide, setrendereroffset, copywithrequestedcontentpositionus, context);
            int i2 = AudioAttributesCompatParcelizer + 45;
            write = i2 % 128;
            int i3 = i2 % 2;
            return forwardingPlayer;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:172:0x0643  */
        /* JADX WARN: Removed duplicated region for block: B:254:0x0652 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0235 A[Catch: all -> 0x03fe, TryCatch #22 {all -> 0x03fe, blocks: (B:26:0x021f, B:34:0x022f, B:36:0x0235, B:37:0x0236, B:38:0x0237, B:39:0x0243, B:40:0x0247, B:42:0x0272, B:44:0x02b9, B:46:0x02be, B:48:0x02c4, B:49:0x02c5, B:50:0x02c6, B:55:0x02e7, B:56:0x02f4, B:57:0x02f5, B:64:0x0380, B:69:0x038a, B:71:0x0390, B:72:0x0391, B:75:0x0396, B:76:0x03a3, B:77:0x03c0, B:78:0x03d7, B:43:0x0280), top: B:223:0x021f, inners: #20 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0236 A[Catch: all -> 0x03fe, TryCatch #22 {all -> 0x03fe, blocks: (B:26:0x021f, B:34:0x022f, B:36:0x0235, B:37:0x0236, B:38:0x0237, B:39:0x0243, B:40:0x0247, B:42:0x0272, B:44:0x02b9, B:46:0x02be, B:48:0x02c4, B:49:0x02c5, B:50:0x02c6, B:55:0x02e7, B:56:0x02f4, B:57:0x02f5, B:64:0x0380, B:69:0x038a, B:71:0x0390, B:72:0x0391, B:75:0x0396, B:76:0x03a3, B:77:0x03c0, B:78:0x03d7, B:43:0x0280), top: B:223:0x021f, inners: #20 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void AudioAttributesCompatParcelizer(android.content.Context r20, long r21, long r23) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1971
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.canKeepMediaPeriodHolder.AnonymousClass1.AudioAttributesCompatParcelizer(android.content.Context, long, long):void");
        }

        static {
            write();
            write = 0;
            AudioAttributesCompatParcelizer = 1;
            read = -3351596786786544294L;
        }

        static void write() {
            RemoteActionCompatParcelizer = -1348590674122583277L;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(short r6, int r7, byte r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 + 4
                int r0 = 34 - r6
                byte[] r1 = kotlin.canKeepMediaPeriodHolder.AnonymousClass1.IconCompatParcelizer
                int r8 = r8 + 84
                byte[] r0 = new byte[r0]
                int r6 = 33 - r6
                r2 = -1
                if (r1 != 0) goto L12
                r3 = r6
                r4 = r2
                goto L2b
            L12:
                r3 = r2
            L13:
                int r3 = r3 + 1
                byte r4 = (byte) r8
                r0[r3] = r4
                int r7 = r7 + 1
                if (r3 != r6) goto L25
                java.lang.String r6 = new java.lang.String
                r7 = 0
                r6.<init>(r0, r7)
                r9[r7] = r6
                return
            L25:
                r4 = r1[r7]
                r5 = r3
                r3 = r8
                r8 = r4
                r4 = r5
            L2b:
                int r8 = -r8
                int r3 = r3 + r8
                int r8 = r3 + (-1)
                r3 = r4
                goto L13
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.canKeepMediaPeriodHolder.AnonymousClass1.a(short, int, byte, java.lang.Object[]):void");
        }
    };
    private final isFullyBuffered AudioAttributesCompatParcelizer;
    private final setTitleOptional<View, Fragment> AudioAttributesImplApi21Parcelizer = new setTitleOptional<>();
    private final write IconCompatParcelizer;
    private volatile ForwardingPlayer RemoteActionCompatParcelizer;
    private final updateClipping read;

    public interface write {
        ForwardingPlayer write(Glide glide, setRendererOffset setrendereroffset, copyWithRequestedContentPositionUs copywithrequestedcontentpositionus, Context context);
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public final boolean handleMessage(Message message) {
        return false;
    }

    public canKeepMediaPeriodHolder(write writeVar) {
        writeVar = writeVar == null ? write : writeVar;
        this.IconCompatParcelizer = writeVar;
        this.read = new updateClipping(writeVar);
        this.AudioAttributesCompatParcelizer = write();
    }

    private static isFullyBuffered write() {
        if (setCompilation.RemoteActionCompatParcelizer) {
            boolean z = setCompilation.read;
        }
        return new reevaluateBuffer();
    }

    private ForwardingPlayer IconCompatParcelizer(Context context) {
        if (this.RemoteActionCompatParcelizer == null) {
            synchronized (this) {
                if (this.RemoteActionCompatParcelizer == null) {
                    this.RemoteActionCompatParcelizer = this.IconCompatParcelizer.write(Glide.read(context.getApplicationContext()), new getTrackGroups(), new getTrackSelectorResult(), context.getApplicationContext());
                }
            }
        }
        return this.RemoteActionCompatParcelizer;
    }

    public final ForwardingPlayer RemoteActionCompatParcelizer(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (moveMediaSourceRange.IconCompatParcelizer() && !(context instanceof Application)) {
            if (context instanceof maybeGetTypeVariable) {
                return RemoteActionCompatParcelizer((maybeGetTypeVariable) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return RemoteActionCompatParcelizer(contextWrapper.getBaseContext());
                }
            }
        }
        return IconCompatParcelizer(context);
    }

    private ForwardingPlayer RemoteActionCompatParcelizer(maybeGetTypeVariable maybegettypevariable) {
        if (moveMediaSourceRange.read()) {
            return RemoteActionCompatParcelizer(maybegettypevariable.getApplicationContext());
        }
        AudioAttributesCompatParcelizer((Activity) maybegettypevariable);
        boolean zAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer((Context) maybegettypevariable);
        return this.read.AudioAttributesCompatParcelizer(maybegettypevariable, Glide.read(maybegettypevariable.getApplicationContext()), maybegettypevariable.getLifecycle(), maybegettypevariable.getSupportFragmentManager(), zAudioAttributesCompatParcelizer);
    }

    private ForwardingPlayer IconCompatParcelizer(Fragment fragment) {
        moveMediaSource.IconCompatParcelizer(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (moveMediaSourceRange.read()) {
            return RemoteActionCompatParcelizer(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            fragment.getActivity();
        }
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Context context = fragment.getContext();
        return this.read.AudioAttributesCompatParcelizer(context, Glide.read(context.getApplicationContext()), fragment.getLifecycle(), childFragmentManager, fragment.isVisible());
    }

    public final ForwardingPlayer RemoteActionCompatParcelizer(View view) {
        if (moveMediaSourceRange.read()) {
            return RemoteActionCompatParcelizer(view.getContext().getApplicationContext());
        }
        moveMediaSource.AudioAttributesCompatParcelizer(view);
        moveMediaSource.IconCompatParcelizer(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activity = read(view.getContext());
        if (activity == null) {
            return RemoteActionCompatParcelizer(view.getContext().getApplicationContext());
        }
        if (activity instanceof maybeGetTypeVariable) {
            maybeGetTypeVariable maybegettypevariable = (maybeGetTypeVariable) activity;
            Fragment fragment = read(view, maybegettypevariable);
            return fragment != null ? IconCompatParcelizer(fragment) : RemoteActionCompatParcelizer(maybegettypevariable);
        }
        return RemoteActionCompatParcelizer(view.getContext().getApplicationContext());
    }

    private static void read(Collection<Fragment> collection, Map<View, Fragment> map) {
        if (collection != null) {
            for (Fragment fragment : collection) {
                if (fragment != null && fragment.getView() != null) {
                    map.put(fragment.getView(), fragment);
                    read(fragment.getChildFragmentManager().handleMediaPlayPauseIfPendingOnHandler(), map);
                }
            }
        }
    }

    private Fragment read(View view, maybeGetTypeVariable maybegettypevariable) {
        this.AudioAttributesImplApi21Parcelizer.clear();
        read(maybegettypevariable.getSupportFragmentManager().handleMediaPlayPauseIfPendingOnHandler(), this.AudioAttributesImplApi21Parcelizer);
        View viewFindViewById = maybegettypevariable.findViewById(R.id.content);
        Fragment fragment = null;
        while (!view.equals(viewFindViewById) && (fragment = this.AudioAttributesImplApi21Parcelizer.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.AudioAttributesImplApi21Parcelizer.clear();
        return fragment;
    }

    private static Activity read(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return read(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private static void AudioAttributesCompatParcelizer(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static boolean AudioAttributesCompatParcelizer(Context context) {
        Activity activity = read(context);
        return activity == null || !activity.isFinishing();
    }
}
