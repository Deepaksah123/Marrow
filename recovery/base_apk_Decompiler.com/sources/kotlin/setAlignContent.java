package kotlin;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow2.domain.custom_module.model.CustomModuleSubjectListModel;
import java.lang.reflect.Method;
import kotlin.setAlignContent;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class setAlignContent extends deserializeIymvxus<CustomModuleSubjectListModel, write> {
    private final boolean IconCompatParcelizer;
    private final IconCompatParcelizer RemoteActionCompatParcelizer;
    private static final byte[] $$c = {10, -79, -66, -51};
    private static final int $$f = 254;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {105, -128, TarConstants.LF_BLK, -25, 19, 10, 3, 8, -9, -20, 6, -5};
    private static final int $$e = 7;
    private static final byte[] $$a = {67, -110, -113, 74, -11, 19, -23, -53, 60, -13, 11, -9, -59, 36, 18, 8, -15, -6, 1, -1, -21, 15, 0};
    private static final int $$b = 253;
    private static int MediaBrowserCompatItemReceiver = 0;
    private static int AudioAttributesImplApi21Parcelizer = 1;
    private static long write = -770839392197336899L;
    private static char[] read = {56355, 56113, 53960, 51815, 49475, 63709, 61554, 61197, 59064, 40507, 38160, 36008, 33863, 33552, 47857, 45632, 43497, 41142, 22601, 22499, 20107, 18005, 32254, 29832, 27689, 27578, 25230, 6695, 54504, 54189, 55812, 49910, 51615, 61504, 63743, 59285, 60989, 38627, 40328, 33854, 36063, 4012, 63404, 61671, 63757, 57772, 60099, 54034, 61479, 63346, 65170, 58917, 60738, 54431, 46475, 45780, 47931, 41886, 43183, 37182, 39319, 34536, 36695, 63389, 64700, 58712, 60833, 56421, 56123, 53960, 51819, 49436, 56421, 56100, 53977, 51830, 49418, 63623, 29384, 30098, 31847, 25814, 28603, 22127, 24260, 16828, 18461, 12483, 15292, 8724, 6079, 4327, 56447, 56097, 23828, 23127, 21414, 19200, 16495, 31165, 28974, 28282, 26584, 7956, 5235, 3526, 1325, 618, 56355, 56103, 53957, 51831, 49475, 63698, 61551, 61259, 59071, 40561, 38160, 36013, 33858, 33537, 47780, 45579, 43497, 41146, 22618, 22507, 20126, 18007, 32249, 55773, 57049, 55099, 53129, 50406, 64815, 62863, 60085, 58192, 39811, 37100, 56355, 56103, 53957, 51831, 49432, 63697, 61553, 61259, 59071, 40566, 38165, 36010, 56355, 56103, 53982, 51821, 49410, 56355, 56113, 53960, 51815, 10450, 12183, 9790, 16074, 13749, 3185, 1244, 7084, 4686, 27344, 25023, 30747, 28916, 56421, 56122, 53973, 51824, 49474, 63687, 61546, 61191, 59106, 40551, 38153, 35995, 33864, 33557, 47801, 45641, 43491, 41146, 61375, 59634, 57613, 63924, 62150, 51972, 50091, 56457, 54652, 44462, 42700, 48937, 47005, 45272, 35184, 33171, 39440, 37750, 27548, 25636, 32074, 30084, 20012, 56355, 56112, 53981, 51824, 49421, 63643, 61552, 61195, 59055, 40565, 38160, 36075, 56355, 56112, 53981, 51824, 49421, 63643, 61552, 61195, 59055, 40565, 38160, 36075, 33876, 33558, 47797, 45642, 43427, 56355, 56103, 53957, 51831, 49432, 63697, 61553, 61259, 59065, 40551, 38158, 36075, 33883, 33553, 47857, 45642, 43497, 41137, 22616, 22441, 20126, 18011, 32243, 29840, 27747, 56355, 56097, 53967, 51830, 49475, 63702, 61557, 61194, 59107, 27491, 27751, 25993, 32107, 30286, 20381, 18226, 22539, 56355, 56100, 53966, 51819, 49423, 63643, 61551, 61185, 59040, 40562, 38227, 36009, 33859, 33537, 47794, 45648, 43519};
    private static long AudioAttributesImplBaseParcelizer = 2706880952337226580L;

    public interface IconCompatParcelizer {
        void IconCompatParcelizer(CustomModuleSubjectListModel customModuleSubjectListModel, boolean z);

        void read(CustomModuleSubjectListModel customModuleSubjectListModel);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(short r6, short r7, int r8) {
        /*
            byte[] r0 = kotlin.setAlignContent.$$c
            int r8 = r8 * 2
            int r8 = r8 + 101
            int r6 = r6 * 4
            int r6 = 1 - r6
            int r7 = r7 * 2
            int r7 = 3 - r7
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2c:
            int r7 = r7 + r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setAlignContent.$$g(short, short, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.setAlignContent.$$d
            int r1 = r8 + 3
            int r6 = r6 + 75
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            int r8 = r8 + 2
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L2a
        L12:
            r3 = r2
        L13:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r7 = r7 + r6
            int r6 = r7 + 6
            r7 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setAlignContent.a(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(short r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 15
            int r6 = 19 - r6
            byte[] r0 = kotlin.setAlignContent.$$a
            int r5 = r5 * 11
            int r1 = r5 + 5
            int r7 = r7 * 9
            int r7 = 115 - r7
            byte[] r1 = new byte[r1]
            int r5 = r5 + 4
            r2 = 0
            if (r0 != 0) goto L19
            r7 = r5
            r3 = r6
            r4 = r2
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L29
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L29:
            r3 = r0[r6]
        L2b:
            int r6 = r6 + 1
            int r7 = r7 + r3
            int r7 = r7 + 2
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setAlignContent.d(short, byte, byte, java.lang.Object[]):void");
    }

    public final boolean IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver;
        int i3 = i2 + 19;
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.IconCompatParcelizer;
        int i5 = i2 + 29;
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final /* synthetic */ void onBindViewHolder(RecyclerView.onMediaButtonEvent onmediabuttonevent, int i) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplApi21Parcelizer + 3;
        MediaBrowserCompatItemReceiver = i3 % 128;
        int i4 = i3 % 2;
        IconCompatParcelizer((write) onmediabuttonevent, i);
        int i5 = AudioAttributesImplApi21Parcelizer + 23;
        MediaBrowserCompatItemReceiver = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final /* synthetic */ RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatItemReceiver + 53;
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        write writeVarAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(viewGroup);
        if (i4 != 0) {
            return writeVarAudioAttributesCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final IconCompatParcelizer write() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 13;
        int i3 = i2 % 128;
        MediaBrowserCompatItemReceiver = i3;
        int i4 = i2 % 2;
        IconCompatParcelizer iconCompatParcelizer = this.RemoteActionCompatParcelizer;
        int i5 = i3 + 33;
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        if (i5 % 2 != 0) {
            return iconCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setAlignContent(IconCompatParcelizer iconCompatParcelizer, boolean z) {
        super(new setDividerDrawableVertical());
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        this.RemoteActionCompatParcelizer = iconCompatParcelizer;
        this.IconCompatParcelizer = z;
    }

    private write AudioAttributesCompatParcelizer(ViewGroup viewGroup) {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cm_subject_list, viewGroup, false);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewInflate, "");
        write writeVar = new write(this, viewInflate);
        int i2 = MediaBrowserCompatItemReceiver + 87;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            return writeVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void IconCompatParcelizer(write writeVar, int i) {
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatItemReceiver + 109;
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        toMagicModuleMetaRepoModel.write(writeVar, "");
        CustomModuleSubjectListModel customModuleSubjectListModel = read(i);
        toMagicModuleMetaRepoModel.write(customModuleSubjectListModel);
        writeVar.RemoteActionCompatParcelizer(customModuleSubjectListModel);
        int i5 = AudioAttributesImplApi21Parcelizer + 27;
        MediaBrowserCompatItemReceiver = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public class write extends RecyclerView.onMediaButtonEvent {
        private /* synthetic */ setAlignContent AudioAttributesCompatParcelizer;
        private final CheckBox IconCompatParcelizer;
        private final LinearLayout RemoteActionCompatParcelizer;
        private final TextView write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(setAlignContent setaligncontent, View view) {
            super(view);
            toMagicModuleMetaRepoModel.write(view, "");
            this.AudioAttributesCompatParcelizer = setaligncontent;
            this.RemoteActionCompatParcelizer = (LinearLayout) view.findViewById(R.id.llSubjectItem);
            this.IconCompatParcelizer = (CheckBox) view.findViewById(R.id.cbSubjectItem);
            this.write = (TextView) view.findViewById(R.id.tvSubjectTopics);
        }

        public final void RemoteActionCompatParcelizer(final CustomModuleSubjectListModel customModuleSubjectListModel) {
            String string;
            toMagicModuleMetaRepoModel.write(customModuleSubjectListModel, "");
            this.IconCompatParcelizer.setText(customModuleSubjectListModel.getIconCompatParcelizer());
            this.IconCompatParcelizer.setChecked(customModuleSubjectListModel.getWrite());
            if (this.AudioAttributesCompatParcelizer.IconCompatParcelizer()) {
                if (this.IconCompatParcelizer.isChecked()) {
                    this.write.setVisibility(0);
                } else {
                    this.write.setVisibility(4);
                }
            } else {
                this.write.setVisibility(8);
            }
            LinearLayout linearLayout = this.RemoteActionCompatParcelizer;
            final setAlignContent setaligncontent = this.AudioAttributesCompatParcelizer;
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: o.setDividerDrawableHorizontal
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    setAlignContent.write.IconCompatParcelizer(setaligncontent, customModuleSubjectListModel, this);
                }
            });
            if (!customModuleSubjectListModel.write().isEmpty()) {
                TextView textView = this.write;
                if (customModuleSubjectListModel.write().size() == 1) {
                    string = "1 Topic";
                } else {
                    int size = customModuleSubjectListModel.write().size();
                    StringBuilder sb = new StringBuilder();
                    sb.append(size);
                    sb.append(" Topics");
                    string = sb.toString();
                }
                textView.setText(string);
            } else {
                this.write.setText("All topics");
            }
            this.IconCompatParcelizer.setClickable(false);
            TextView textView2 = this.write;
            final setAlignContent setaligncontent2 = this.AudioAttributesCompatParcelizer;
            textView2.setOnClickListener(new View.OnClickListener() { // from class: o.FlexboxLayout
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    setAlignContent.write.RemoteActionCompatParcelizer(this.IconCompatParcelizer, setaligncontent2, customModuleSubjectListModel);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void IconCompatParcelizer(setAlignContent setaligncontent, CustomModuleSubjectListModel customModuleSubjectListModel, write writeVar) {
            setaligncontent.write().IconCompatParcelizer(customModuleSubjectListModel, writeVar.IconCompatParcelizer.isChecked());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void RemoteActionCompatParcelizer(write writeVar, setAlignContent setaligncontent, CustomModuleSubjectListModel customModuleSubjectListModel) {
            TextView textView = writeVar.write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
            if (textView.getVisibility() == 0) {
                setaligncontent.write().read(customModuleSubjectListModel);
            }
        }
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadChanged notifydownloadchanged = new notifyDownloadChanged();
        notifydownloadchanged.read = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i3 = notifydownloadchanged.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1435583294);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 38462), 532 - TextUtils.getTrimmedLength(""), 8 - Gravity.getAbsoluteGravity(0, 0), -735610793, false, $$g(b, b, $$c[0]), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() ^ (write ^ 2192498202983240651L);
                Object[] objArr3 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (36621 - View.getDefaultSize(0, 0)), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 2340, 28 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 188119637, false, $$g(b2, b3, (byte) (b3 | 9)), new Class[]{Object.class, Object.class});
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
            int i4 = $10 + 33;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
            Object[] objArr4 = {notifydownloadchanged, notifydownloadchanged};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1971306176);
            if (objRemoteActionCompatParcelizer3 == null) {
                byte b4 = (byte) 0;
                byte b5 = b4;
                objRemoteActionCompatParcelizer3 = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 36622), 2340 - View.getDefaultSize(0, 0), 28 - (ViewConfiguration.getLongPressTimeout() >> 16), 188119637, false, $$g(b4, b5, (byte) (b5 | 9)), new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            int i6 = $11 + 109;
            $10 = i6 % 128;
            int i7 = i6 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    private static void c(int i, char c, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i];
        downloadService.write = 0;
        int i4 = $10 + 57;
        $11 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 % 5;
        }
        while (downloadService.write < i) {
            int i6 = $10 + 7;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = downloadService.write;
            try {
                Object[] objArr2 = {Integer.valueOf(read[i2 + i8])};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read((char) (36621 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 2340 - View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 28, 480654850, false, $$g(b, b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(AudioAttributesImplBaseParcelizer), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) Gravity.getAbsoluteGravity(0, 0), 9701 - Color.green(0), Color.red(0) + 26, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) Gravity.getAbsoluteGravity(0, 0), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 23784, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
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
        char[] cArr = new char[i];
        downloadService.write = 0;
        while (downloadService.write < i) {
            int i9 = $11 + 55;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            try {
                Object[] objArr5 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((Process.getThreadPriority(0) + 20) >> 6), 23784 - TextUtils.getOffsetBefore("", 0), 32 - TextUtils.indexOf((CharSequence) "", '0'), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                int i11 = $10 + 51;
                $11 = i11 % 128;
                int i12 = i11 % 2;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(76:0|2|547|3|4|(1:6)|7|8|(1:10)(1:11)|12|13|(1:15)(1:16)|17|18|(63:20|(5:22|23|(1:25)|26|27)(4:28|29|(1:31)(1:32)|33)|34|(10:36|37|(1:39)|40|41|42|(1:44)|45|(2:47|(7:49|(1:51)|52|53|(1:55)|93|(6:95|96|(1:98)|99|100|(1:111))(6:103|104|(1:106)(1:107)|108|109|(0)))(8:56|57|(1:59)|60|61|(0)|93|(0)(0)))(1:64)|(8:66|67|(1:69)|70|71|(3:(6:76|77|(1:79)|80|81|(0))(1:84)|(6:86|87|(1:89)|90|91|(0))|112)(1:74)|93|(0)(0))(0))(1:112)|115|116|(1:118)|119|(7:121|(3:124|(13:579|126|127|(1:129)|130|131|132|(1:134)(1:135)|136|(4:138|(1:140)|141|(1:143)(6:144|153|(3:156|(6:158|159|(1:161)|162|163|(3:165|(2:167|584)(2:168|583)|169)(3:580|170|171))(3:582|172|173)|154)|581|174|(1:176)(1:181)))(1:145)|(6:147|(1:149)|150|151|(5:153|(1:154)|581|174|(0)(0))|181)(1:179)|180|181)(1:177)|122)|578|178|179|180|181)(4:178|179|180|181)|182|183|(1:185)|186|187|188|(1:190)(1:191)|192|193|(1:200)(1:199)|201|202|(1:204)|205|206|207|(1:209)(1:210)|211|212|(1:219)(1:218)|220|(2:221|(6:223|224|(1:226)(1:227)|228|229|(2:585|231)(1:232))(2:586|233))|234|567|235|557|236|(1:238)|239|(12:241|242|243|244|559|245|(1:247)|248|249|250|(1:252)(6:258|549|259|(1:261)|262|(2:264|(1:266)(6:267|568|268|(1:270)|271|(0)(1:275))))|291)(0)|292|293|(1:295)|296|(24:298|299|(1:301)|302|303|(2:305|(3:310|(6:312|313|(1:315)|316|317|(2:601|319)(1:320))|600)(0))(2:308|(0)(0))|323|324|(1:326)|327|328|(3:330|(1:332)(1:333)|334)(3:335|(1:337)(2:338|(3:340|(4:345|(1:596)(7:351|574|352|353|(4:551|354|355|(4:357|(5:543|360|361|(5:598|363|565|364|(2:592|366))(1:367)|358)|599|368)(2:597|369))|383|593)|384|341)|591)(0))|385)|386|572|387|388|(4:576|389|390|(2:392|(3:394|(5:397|398|399|(5:588|401|545|402|(1:404))(1:405)|395)|589)(1:587))(2:570|408))|423|424|425|(1:427)|428|429|(63:431|(1:433)(1:434)|435|436|(1:438)|439|440|(1:442)(1:443)|444|445|(1:447)|448|449|450|(1:452)|453|454|455|(1:457)|458|459|(1:461)|462|463|(1:465)|466|467|468|(1:470)|471|472|473|(1:475)|476|477|478|(1:480)|481|482|(1:484)(1:485)|486|487|(1:489)|490|491|(1:493)(1:494)|495|(5:497|498|(1:500)|501|502)(1:503)|504|505|(1:507)|508|509|(1:511)(1:513)|512|514|515|(1:517)|518|555|519|520|521)(2:527|528))(1:321)|322|323|324|(0)|327|328|(0)(0)|386|572|387|388|(5:576|389|390|(0)(0)|589)|423|424|425|(0)|428|429|(0)(0))(1:113)|114|115|116|(0)|119|(0)(0)|182|183|(0)|186|187|188|(0)(0)|192|193|(2:195|200)(0)|201|202|(0)|205|206|207|(0)(0)|211|212|(2:214|219)(0)|220|(3:221|(0)(0)|232)|234|567|235|557|236|(0)|239|(0)(0)|292|293|(0)|296|(0)(0)|322|323|324|(0)|327|328|(0)(0)|386|572|387|388|(5:576|389|390|(0)(0)|589)|423|424|425|(0)|428|429|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x2eb7, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x2ec0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x2ec1, code lost:
    
        r1 = r0;
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x2ede, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0bc5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0c84 A[PHI: r4
      0x0c84: PHI (r4v562 java.lang.String) = (r4v560 java.lang.String), (r4v580 java.lang.String) binds: [B:110:0x0c82, B:101:0x0bc1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x139f A[Catch: all -> 0x3f22, TryCatch #4 {all -> 0x3f22, blocks: (B:3:0x0008, B:6:0x0019, B:7:0x004c, B:13:0x013d, B:15:0x014a, B:17:0x01a5, B:23:0x0287, B:25:0x0294, B:26:0x02e0, B:37:0x0427, B:39:0x0434, B:40:0x047c, B:42:0x04a4, B:44:0x04b1, B:45:0x04fa, B:49:0x0512, B:51:0x0529, B:52:0x0576, B:67:0x0746, B:69:0x075d, B:70:0x07ad, B:77:0x0879, B:79:0x0890, B:80:0x08dc, B:87:0x098a, B:89:0x09a1, B:90:0x09ea, B:96:0x0ad7, B:98:0x0ae4, B:99:0x0b24, B:116:0x1392, B:118:0x139f, B:119:0x13e7, B:127:0x145a, B:129:0x1467, B:130:0x14ab, B:132:0x14cd, B:134:0x14da, B:136:0x1523, B:138:0x152c, B:140:0x1544, B:141:0x158b, B:147:0x1649, B:149:0x1661, B:150:0x16af, B:159:0x1799, B:161:0x17a6, B:162:0x17e6, B:183:0x19a0, B:185:0x19ad, B:186:0x19ed, B:188:0x1abf, B:190:0x1acc, B:192:0x1b15, B:202:0x1c10, B:204:0x1c1d, B:205:0x1c60, B:207:0x1d73, B:209:0x1d80, B:211:0x1dd1, B:224:0x202f, B:226:0x203c, B:228:0x2086, B:293:0x2574, B:295:0x2581, B:296:0x25bf, B:299:0x25f6, B:301:0x2603, B:302:0x264f, B:324:0x2baa, B:326:0x2bcd, B:327:0x2c26, B:425:0x2f0b, B:427:0x2f11, B:428:0x2f56, B:436:0x3022, B:438:0x3028, B:439:0x3068, B:445:0x3127, B:447:0x312d, B:448:0x3168, B:450:0x3226, B:452:0x322c, B:453:0x326b, B:455:0x332e, B:457:0x3334, B:458:0x3376, B:463:0x345f, B:465:0x346c, B:466:0x34ae, B:468:0x3627, B:470:0x363a, B:471:0x367b, B:473:0x373f, B:475:0x3745, B:476:0x377f, B:478:0x38a3, B:480:0x38c7, B:481:0x391c, B:487:0x3a49, B:489:0x3a56, B:490:0x3a9a, B:498:0x3b84, B:500:0x3b8a, B:501:0x3bca, B:505:0x3cb4, B:507:0x3cba, B:508:0x3cfe, B:515:0x3dc3, B:517:0x3df1, B:518:0x3e58, B:313:0x2a1a, B:315:0x2a27, B:316:0x2a71, B:104:0x0bef, B:106:0x0bfc, B:108:0x0c43, B:57:0x062b, B:59:0x0642, B:60:0x068f, B:29:0x030c, B:31:0x0319, B:33:0x036b), top: B:547:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x13f2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x175b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x192e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x194c A[PHI: r4
      0x194c: PHI (r4v7 java.lang.String) = (r4v6 java.lang.String), (r4v456 java.lang.String) binds: [B:120:0x13f0, B:578:0x194c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x19ad A[Catch: all -> 0x3f22, TryCatch #4 {all -> 0x3f22, blocks: (B:3:0x0008, B:6:0x0019, B:7:0x004c, B:13:0x013d, B:15:0x014a, B:17:0x01a5, B:23:0x0287, B:25:0x0294, B:26:0x02e0, B:37:0x0427, B:39:0x0434, B:40:0x047c, B:42:0x04a4, B:44:0x04b1, B:45:0x04fa, B:49:0x0512, B:51:0x0529, B:52:0x0576, B:67:0x0746, B:69:0x075d, B:70:0x07ad, B:77:0x0879, B:79:0x0890, B:80:0x08dc, B:87:0x098a, B:89:0x09a1, B:90:0x09ea, B:96:0x0ad7, B:98:0x0ae4, B:99:0x0b24, B:116:0x1392, B:118:0x139f, B:119:0x13e7, B:127:0x145a, B:129:0x1467, B:130:0x14ab, B:132:0x14cd, B:134:0x14da, B:136:0x1523, B:138:0x152c, B:140:0x1544, B:141:0x158b, B:147:0x1649, B:149:0x1661, B:150:0x16af, B:159:0x1799, B:161:0x17a6, B:162:0x17e6, B:183:0x19a0, B:185:0x19ad, B:186:0x19ed, B:188:0x1abf, B:190:0x1acc, B:192:0x1b15, B:202:0x1c10, B:204:0x1c1d, B:205:0x1c60, B:207:0x1d73, B:209:0x1d80, B:211:0x1dd1, B:224:0x202f, B:226:0x203c, B:228:0x2086, B:293:0x2574, B:295:0x2581, B:296:0x25bf, B:299:0x25f6, B:301:0x2603, B:302:0x264f, B:324:0x2baa, B:326:0x2bcd, B:327:0x2c26, B:425:0x2f0b, B:427:0x2f11, B:428:0x2f56, B:436:0x3022, B:438:0x3028, B:439:0x3068, B:445:0x3127, B:447:0x312d, B:448:0x3168, B:450:0x3226, B:452:0x322c, B:453:0x326b, B:455:0x332e, B:457:0x3334, B:458:0x3376, B:463:0x345f, B:465:0x346c, B:466:0x34ae, B:468:0x3627, B:470:0x363a, B:471:0x367b, B:473:0x373f, B:475:0x3745, B:476:0x377f, B:478:0x38a3, B:480:0x38c7, B:481:0x391c, B:487:0x3a49, B:489:0x3a56, B:490:0x3a9a, B:498:0x3b84, B:500:0x3b8a, B:501:0x3bca, B:505:0x3cb4, B:507:0x3cba, B:508:0x3cfe, B:515:0x3dc3, B:517:0x3df1, B:518:0x3e58, B:313:0x2a1a, B:315:0x2a27, B:316:0x2a71, B:104:0x0bef, B:106:0x0bfc, B:108:0x0c43, B:57:0x062b, B:59:0x0642, B:60:0x068f, B:29:0x030c, B:31:0x0319, B:33:0x036b), top: B:547:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x1acc A[Catch: all -> 0x3f22, TryCatch #4 {all -> 0x3f22, blocks: (B:3:0x0008, B:6:0x0019, B:7:0x004c, B:13:0x013d, B:15:0x014a, B:17:0x01a5, B:23:0x0287, B:25:0x0294, B:26:0x02e0, B:37:0x0427, B:39:0x0434, B:40:0x047c, B:42:0x04a4, B:44:0x04b1, B:45:0x04fa, B:49:0x0512, B:51:0x0529, B:52:0x0576, B:67:0x0746, B:69:0x075d, B:70:0x07ad, B:77:0x0879, B:79:0x0890, B:80:0x08dc, B:87:0x098a, B:89:0x09a1, B:90:0x09ea, B:96:0x0ad7, B:98:0x0ae4, B:99:0x0b24, B:116:0x1392, B:118:0x139f, B:119:0x13e7, B:127:0x145a, B:129:0x1467, B:130:0x14ab, B:132:0x14cd, B:134:0x14da, B:136:0x1523, B:138:0x152c, B:140:0x1544, B:141:0x158b, B:147:0x1649, B:149:0x1661, B:150:0x16af, B:159:0x1799, B:161:0x17a6, B:162:0x17e6, B:183:0x19a0, B:185:0x19ad, B:186:0x19ed, B:188:0x1abf, B:190:0x1acc, B:192:0x1b15, B:202:0x1c10, B:204:0x1c1d, B:205:0x1c60, B:207:0x1d73, B:209:0x1d80, B:211:0x1dd1, B:224:0x202f, B:226:0x203c, B:228:0x2086, B:293:0x2574, B:295:0x2581, B:296:0x25bf, B:299:0x25f6, B:301:0x2603, B:302:0x264f, B:324:0x2baa, B:326:0x2bcd, B:327:0x2c26, B:425:0x2f0b, B:427:0x2f11, B:428:0x2f56, B:436:0x3022, B:438:0x3028, B:439:0x3068, B:445:0x3127, B:447:0x312d, B:448:0x3168, B:450:0x3226, B:452:0x322c, B:453:0x326b, B:455:0x332e, B:457:0x3334, B:458:0x3376, B:463:0x345f, B:465:0x346c, B:466:0x34ae, B:468:0x3627, B:470:0x363a, B:471:0x367b, B:473:0x373f, B:475:0x3745, B:476:0x377f, B:478:0x38a3, B:480:0x38c7, B:481:0x391c, B:487:0x3a49, B:489:0x3a56, B:490:0x3a9a, B:498:0x3b84, B:500:0x3b8a, B:501:0x3bca, B:505:0x3cb4, B:507:0x3cba, B:508:0x3cfe, B:515:0x3dc3, B:517:0x3df1, B:518:0x3e58, B:313:0x2a1a, B:315:0x2a27, B:316:0x2a71, B:104:0x0bef, B:106:0x0bfc, B:108:0x0c43, B:57:0x062b, B:59:0x0642, B:60:0x068f, B:29:0x030c, B:31:0x0319, B:33:0x036b), top: B:547:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x1b13  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x1bb9  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x1c1d A[Catch: all -> 0x3f22, TryCatch #4 {all -> 0x3f22, blocks: (B:3:0x0008, B:6:0x0019, B:7:0x004c, B:13:0x013d, B:15:0x014a, B:17:0x01a5, B:23:0x0287, B:25:0x0294, B:26:0x02e0, B:37:0x0427, B:39:0x0434, B:40:0x047c, B:42:0x04a4, B:44:0x04b1, B:45:0x04fa, B:49:0x0512, B:51:0x0529, B:52:0x0576, B:67:0x0746, B:69:0x075d, B:70:0x07ad, B:77:0x0879, B:79:0x0890, B:80:0x08dc, B:87:0x098a, B:89:0x09a1, B:90:0x09ea, B:96:0x0ad7, B:98:0x0ae4, B:99:0x0b24, B:116:0x1392, B:118:0x139f, B:119:0x13e7, B:127:0x145a, B:129:0x1467, B:130:0x14ab, B:132:0x14cd, B:134:0x14da, B:136:0x1523, B:138:0x152c, B:140:0x1544, B:141:0x158b, B:147:0x1649, B:149:0x1661, B:150:0x16af, B:159:0x1799, B:161:0x17a6, B:162:0x17e6, B:183:0x19a0, B:185:0x19ad, B:186:0x19ed, B:188:0x1abf, B:190:0x1acc, B:192:0x1b15, B:202:0x1c10, B:204:0x1c1d, B:205:0x1c60, B:207:0x1d73, B:209:0x1d80, B:211:0x1dd1, B:224:0x202f, B:226:0x203c, B:228:0x2086, B:293:0x2574, B:295:0x2581, B:296:0x25bf, B:299:0x25f6, B:301:0x2603, B:302:0x264f, B:324:0x2baa, B:326:0x2bcd, B:327:0x2c26, B:425:0x2f0b, B:427:0x2f11, B:428:0x2f56, B:436:0x3022, B:438:0x3028, B:439:0x3068, B:445:0x3127, B:447:0x312d, B:448:0x3168, B:450:0x3226, B:452:0x322c, B:453:0x326b, B:455:0x332e, B:457:0x3334, B:458:0x3376, B:463:0x345f, B:465:0x346c, B:466:0x34ae, B:468:0x3627, B:470:0x363a, B:471:0x367b, B:473:0x373f, B:475:0x3745, B:476:0x377f, B:478:0x38a3, B:480:0x38c7, B:481:0x391c, B:487:0x3a49, B:489:0x3a56, B:490:0x3a9a, B:498:0x3b84, B:500:0x3b8a, B:501:0x3bca, B:505:0x3cb4, B:507:0x3cba, B:508:0x3cfe, B:515:0x3dc3, B:517:0x3df1, B:518:0x3e58, B:313:0x2a1a, B:315:0x2a27, B:316:0x2a71, B:104:0x0bef, B:106:0x0bfc, B:108:0x0c43, B:57:0x062b, B:59:0x0642, B:60:0x068f, B:29:0x030c, B:31:0x0319, B:33:0x036b), top: B:547:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x1d80 A[Catch: all -> 0x3f22, TryCatch #4 {all -> 0x3f22, blocks: (B:3:0x0008, B:6:0x0019, B:7:0x004c, B:13:0x013d, B:15:0x014a, B:17:0x01a5, B:23:0x0287, B:25:0x0294, B:26:0x02e0, B:37:0x0427, B:39:0x0434, B:40:0x047c, B:42:0x04a4, B:44:0x04b1, B:45:0x04fa, B:49:0x0512, B:51:0x0529, B:52:0x0576, B:67:0x0746, B:69:0x075d, B:70:0x07ad, B:77:0x0879, B:79:0x0890, B:80:0x08dc, B:87:0x098a, B:89:0x09a1, B:90:0x09ea, B:96:0x0ad7, B:98:0x0ae4, B:99:0x0b24, B:116:0x1392, B:118:0x139f, B:119:0x13e7, B:127:0x145a, B:129:0x1467, B:130:0x14ab, B:132:0x14cd, B:134:0x14da, B:136:0x1523, B:138:0x152c, B:140:0x1544, B:141:0x158b, B:147:0x1649, B:149:0x1661, B:150:0x16af, B:159:0x1799, B:161:0x17a6, B:162:0x17e6, B:183:0x19a0, B:185:0x19ad, B:186:0x19ed, B:188:0x1abf, B:190:0x1acc, B:192:0x1b15, B:202:0x1c10, B:204:0x1c1d, B:205:0x1c60, B:207:0x1d73, B:209:0x1d80, B:211:0x1dd1, B:224:0x202f, B:226:0x203c, B:228:0x2086, B:293:0x2574, B:295:0x2581, B:296:0x25bf, B:299:0x25f6, B:301:0x2603, B:302:0x264f, B:324:0x2baa, B:326:0x2bcd, B:327:0x2c26, B:425:0x2f0b, B:427:0x2f11, B:428:0x2f56, B:436:0x3022, B:438:0x3028, B:439:0x3068, B:445:0x3127, B:447:0x312d, B:448:0x3168, B:450:0x3226, B:452:0x322c, B:453:0x326b, B:455:0x332e, B:457:0x3334, B:458:0x3376, B:463:0x345f, B:465:0x346c, B:466:0x34ae, B:468:0x3627, B:470:0x363a, B:471:0x367b, B:473:0x373f, B:475:0x3745, B:476:0x377f, B:478:0x38a3, B:480:0x38c7, B:481:0x391c, B:487:0x3a49, B:489:0x3a56, B:490:0x3a9a, B:498:0x3b84, B:500:0x3b8a, B:501:0x3bca, B:505:0x3cb4, B:507:0x3cba, B:508:0x3cfe, B:515:0x3dc3, B:517:0x3df1, B:518:0x3e58, B:313:0x2a1a, B:315:0x2a27, B:316:0x2a71, B:104:0x0bef, B:106:0x0bfc, B:108:0x0c43, B:57:0x062b, B:59:0x0642, B:60:0x068f, B:29:0x030c, B:31:0x0319, B:33:0x036b), top: B:547:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x1dcd  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x1e9c  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x202d  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x2213 A[Catch: all -> 0x24ef, TryCatch #11 {all -> 0x24ef, blocks: (B:236:0x2206, B:238:0x2213, B:239:0x2254), top: B:557:0x2206, outer: #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x225d  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x239a A[Catch: Exception -> 0x24f9, TRY_LEAVE, TryCatch #16 {Exception -> 0x24f9, blocks: (B:235:0x214c, B:242:0x225e, B:244:0x227d, B:250:0x22fd, B:254:0x2391, B:256:0x2398, B:257:0x2399, B:258:0x239a, B:264:0x2420, B:267:0x2444, B:273:0x24d2, B:275:0x24d8, B:277:0x24dc, B:279:0x24e3, B:280:0x24e4, B:282:0x24e6, B:284:0x24ed, B:285:0x24ee, B:287:0x24f0, B:289:0x24f7, B:290:0x24f8, B:259:0x23c8, B:261:0x23d5, B:262:0x2417, B:236:0x2206, B:238:0x2213, B:239:0x2254, B:245:0x228e, B:247:0x229b, B:248:0x22ec, B:268:0x2476, B:270:0x2483, B:271:0x24c7), top: B:567:0x214c, inners: #5, #11, #12, #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x2581 A[Catch: all -> 0x3f22, TryCatch #4 {all -> 0x3f22, blocks: (B:3:0x0008, B:6:0x0019, B:7:0x004c, B:13:0x013d, B:15:0x014a, B:17:0x01a5, B:23:0x0287, B:25:0x0294, B:26:0x02e0, B:37:0x0427, B:39:0x0434, B:40:0x047c, B:42:0x04a4, B:44:0x04b1, B:45:0x04fa, B:49:0x0512, B:51:0x0529, B:52:0x0576, B:67:0x0746, B:69:0x075d, B:70:0x07ad, B:77:0x0879, B:79:0x0890, B:80:0x08dc, B:87:0x098a, B:89:0x09a1, B:90:0x09ea, B:96:0x0ad7, B:98:0x0ae4, B:99:0x0b24, B:116:0x1392, B:118:0x139f, B:119:0x13e7, B:127:0x145a, B:129:0x1467, B:130:0x14ab, B:132:0x14cd, B:134:0x14da, B:136:0x1523, B:138:0x152c, B:140:0x1544, B:141:0x158b, B:147:0x1649, B:149:0x1661, B:150:0x16af, B:159:0x1799, B:161:0x17a6, B:162:0x17e6, B:183:0x19a0, B:185:0x19ad, B:186:0x19ed, B:188:0x1abf, B:190:0x1acc, B:192:0x1b15, B:202:0x1c10, B:204:0x1c1d, B:205:0x1c60, B:207:0x1d73, B:209:0x1d80, B:211:0x1dd1, B:224:0x202f, B:226:0x203c, B:228:0x2086, B:293:0x2574, B:295:0x2581, B:296:0x25bf, B:299:0x25f6, B:301:0x2603, B:302:0x264f, B:324:0x2baa, B:326:0x2bcd, B:327:0x2c26, B:425:0x2f0b, B:427:0x2f11, B:428:0x2f56, B:436:0x3022, B:438:0x3028, B:439:0x3068, B:445:0x3127, B:447:0x312d, B:448:0x3168, B:450:0x3226, B:452:0x322c, B:453:0x326b, B:455:0x332e, B:457:0x3334, B:458:0x3376, B:463:0x345f, B:465:0x346c, B:466:0x34ae, B:468:0x3627, B:470:0x363a, B:471:0x367b, B:473:0x373f, B:475:0x3745, B:476:0x377f, B:478:0x38a3, B:480:0x38c7, B:481:0x391c, B:487:0x3a49, B:489:0x3a56, B:490:0x3a9a, B:498:0x3b84, B:500:0x3b8a, B:501:0x3bca, B:505:0x3cb4, B:507:0x3cba, B:508:0x3cfe, B:515:0x3dc3, B:517:0x3df1, B:518:0x3e58, B:313:0x2a1a, B:315:0x2a27, B:316:0x2a71, B:104:0x0bef, B:106:0x0bfc, B:108:0x0c43, B:57:0x062b, B:59:0x0642, B:60:0x068f, B:29:0x030c, B:31:0x0319, B:33:0x036b), top: B:547:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x25c8  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x2735  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x2b39  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x2bcd A[Catch: all -> 0x3f22, TryCatch #4 {all -> 0x3f22, blocks: (B:3:0x0008, B:6:0x0019, B:7:0x004c, B:13:0x013d, B:15:0x014a, B:17:0x01a5, B:23:0x0287, B:25:0x0294, B:26:0x02e0, B:37:0x0427, B:39:0x0434, B:40:0x047c, B:42:0x04a4, B:44:0x04b1, B:45:0x04fa, B:49:0x0512, B:51:0x0529, B:52:0x0576, B:67:0x0746, B:69:0x075d, B:70:0x07ad, B:77:0x0879, B:79:0x0890, B:80:0x08dc, B:87:0x098a, B:89:0x09a1, B:90:0x09ea, B:96:0x0ad7, B:98:0x0ae4, B:99:0x0b24, B:116:0x1392, B:118:0x139f, B:119:0x13e7, B:127:0x145a, B:129:0x1467, B:130:0x14ab, B:132:0x14cd, B:134:0x14da, B:136:0x1523, B:138:0x152c, B:140:0x1544, B:141:0x158b, B:147:0x1649, B:149:0x1661, B:150:0x16af, B:159:0x1799, B:161:0x17a6, B:162:0x17e6, B:183:0x19a0, B:185:0x19ad, B:186:0x19ed, B:188:0x1abf, B:190:0x1acc, B:192:0x1b15, B:202:0x1c10, B:204:0x1c1d, B:205:0x1c60, B:207:0x1d73, B:209:0x1d80, B:211:0x1dd1, B:224:0x202f, B:226:0x203c, B:228:0x2086, B:293:0x2574, B:295:0x2581, B:296:0x25bf, B:299:0x25f6, B:301:0x2603, B:302:0x264f, B:324:0x2baa, B:326:0x2bcd, B:327:0x2c26, B:425:0x2f0b, B:427:0x2f11, B:428:0x2f56, B:436:0x3022, B:438:0x3028, B:439:0x3068, B:445:0x3127, B:447:0x312d, B:448:0x3168, B:450:0x3226, B:452:0x322c, B:453:0x326b, B:455:0x332e, B:457:0x3334, B:458:0x3376, B:463:0x345f, B:465:0x346c, B:466:0x34ae, B:468:0x3627, B:470:0x363a, B:471:0x367b, B:473:0x373f, B:475:0x3745, B:476:0x377f, B:478:0x38a3, B:480:0x38c7, B:481:0x391c, B:487:0x3a49, B:489:0x3a56, B:490:0x3a9a, B:498:0x3b84, B:500:0x3b8a, B:501:0x3bca, B:505:0x3cb4, B:507:0x3cba, B:508:0x3cfe, B:515:0x3dc3, B:517:0x3df1, B:518:0x3e58, B:313:0x2a1a, B:315:0x2a27, B:316:0x2a71, B:104:0x0bef, B:106:0x0bfc, B:108:0x0c43, B:57:0x062b, B:59:0x0642, B:60:0x068f, B:29:0x030c, B:31:0x0319, B:33:0x036b), top: B:547:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x2cd4  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x2ce9  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x2e7b  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x2f11 A[Catch: all -> 0x3f22, TryCatch #4 {all -> 0x3f22, blocks: (B:3:0x0008, B:6:0x0019, B:7:0x004c, B:13:0x013d, B:15:0x014a, B:17:0x01a5, B:23:0x0287, B:25:0x0294, B:26:0x02e0, B:37:0x0427, B:39:0x0434, B:40:0x047c, B:42:0x04a4, B:44:0x04b1, B:45:0x04fa, B:49:0x0512, B:51:0x0529, B:52:0x0576, B:67:0x0746, B:69:0x075d, B:70:0x07ad, B:77:0x0879, B:79:0x0890, B:80:0x08dc, B:87:0x098a, B:89:0x09a1, B:90:0x09ea, B:96:0x0ad7, B:98:0x0ae4, B:99:0x0b24, B:116:0x1392, B:118:0x139f, B:119:0x13e7, B:127:0x145a, B:129:0x1467, B:130:0x14ab, B:132:0x14cd, B:134:0x14da, B:136:0x1523, B:138:0x152c, B:140:0x1544, B:141:0x158b, B:147:0x1649, B:149:0x1661, B:150:0x16af, B:159:0x1799, B:161:0x17a6, B:162:0x17e6, B:183:0x19a0, B:185:0x19ad, B:186:0x19ed, B:188:0x1abf, B:190:0x1acc, B:192:0x1b15, B:202:0x1c10, B:204:0x1c1d, B:205:0x1c60, B:207:0x1d73, B:209:0x1d80, B:211:0x1dd1, B:224:0x202f, B:226:0x203c, B:228:0x2086, B:293:0x2574, B:295:0x2581, B:296:0x25bf, B:299:0x25f6, B:301:0x2603, B:302:0x264f, B:324:0x2baa, B:326:0x2bcd, B:327:0x2c26, B:425:0x2f0b, B:427:0x2f11, B:428:0x2f56, B:436:0x3022, B:438:0x3028, B:439:0x3068, B:445:0x3127, B:447:0x312d, B:448:0x3168, B:450:0x3226, B:452:0x322c, B:453:0x326b, B:455:0x332e, B:457:0x3334, B:458:0x3376, B:463:0x345f, B:465:0x346c, B:466:0x34ae, B:468:0x3627, B:470:0x363a, B:471:0x367b, B:473:0x373f, B:475:0x3745, B:476:0x377f, B:478:0x38a3, B:480:0x38c7, B:481:0x391c, B:487:0x3a49, B:489:0x3a56, B:490:0x3a9a, B:498:0x3b84, B:500:0x3b8a, B:501:0x3bca, B:505:0x3cb4, B:507:0x3cba, B:508:0x3cfe, B:515:0x3dc3, B:517:0x3df1, B:518:0x3e58, B:313:0x2a1a, B:315:0x2a27, B:316:0x2a71, B:104:0x0bef, B:106:0x0bfc, B:108:0x0c43, B:57:0x062b, B:59:0x0642, B:60:0x068f, B:29:0x030c, B:31:0x0319, B:33:0x036b), top: B:547:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:431:0x2feb  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x3f19  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x2eb8 A[EXC_TOP_SPLITTER, PHI: r9
      0x2eb8: PHI (r9v30 java.io.BufferedInputStream) = (r9v29 java.io.BufferedInputStream), (r9v262 java.io.BufferedInputStream) binds: [B:421:0x2edf, B:391:0x2e79] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:586:0x212d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0876  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0aa8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] AudioAttributesCompatParcelizer$102327b9(int r74, java.lang.Object r75) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 17001
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setAlignContent.AudioAttributesCompatParcelizer$102327b9(int, java.lang.Object):java.lang.Object[]");
    }
}
