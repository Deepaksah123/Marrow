package kotlin;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.Random;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\t\n\u000b\f\r\u000e\u000f\b\u0010\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\t\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019"}, d2 = {"Lo/getBody;", "", "", "p0", "<init>", "(Z)V", "IconCompatParcelizer", "Z", "RemoteActionCompatParcelizer", "()Z", "AudioAttributesCompatParcelizer", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplBaseParcelizer", "write", "MediaBrowserCompatCustomActionResultReceiver", "read", "Lo/getBody$read;", "Lo/getBody$write;", "Lo/getBody$RemoteActionCompatParcelizer;", "Lo/getBody$IconCompatParcelizer;", "Lo/getBody$AudioAttributesCompatParcelizer;", "Lo/getBody$MediaBrowserCompatItemReceiver;", "Lo/getBody$MediaBrowserCompatCustomActionResultReceiver;", "Lo/getBody$AudioAttributesImplBaseParcelizer;", "Lo/getBody$AudioAttributesImplApi26Parcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class getBody {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final boolean AudioAttributesCompatParcelizer;

    private getBody(boolean z) {
        this.AudioAttributesCompatParcelizer = z;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006!"}, d2 = {"Lcom/marrow2/ui/test/landing/model/TestListAdapterItemTypeModel$MonthNameModel;", "Lcom/marrow2/ui/test/landing/model/TestListAdapterItemTypeModel;", "name", "", "isExpanded", "", "showMonthTypeLabel", "monthType", "Lcom/marrow2/ui/test/landing/model/MonthType;", "yearString", "<init>", "(Ljava/lang/String;ZZLcom/marrow2/ui/test/landing/model/MonthType;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "()Z", "setExpanded", "(Z)V", "getShowMonthTypeLabel", "getMonthType", "()Lcom/marrow2/ui/test/landing/model/MonthType;", "getYearString", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AudioAttributesCompatParcelizer extends getBody {
        private final LoyaltyPointsBalanceBuilder AudioAttributesCompatParcelizer;
        private final String IconCompatParcelizer;
        private final String RemoteActionCompatParcelizer;
        private boolean read;
        private final boolean write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(String str, boolean z, boolean z2, LoyaltyPointsBalanceBuilder loyaltyPointsBalanceBuilder, String str2) {
            super(z, null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(loyaltyPointsBalanceBuilder, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.IconCompatParcelizer = str;
            this.read = z;
            this.write = z2;
            this.AudioAttributesCompatParcelizer = loyaltyPointsBalanceBuilder;
            this.RemoteActionCompatParcelizer = str2;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final String getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final boolean getWrite() {
            return this.write;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final LoyaltyPointsBalanceBuilder getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final String getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(String str, boolean z, boolean z2, LoyaltyPointsBalanceBuilder loyaltyPointsBalanceBuilder, String str2) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(loyaltyPointsBalanceBuilder, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            return new AudioAttributesCompatParcelizer(str, true, z2, loyaltyPointsBalanceBuilder, str2);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AudioAttributesCompatParcelizer)) {
                return false;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) other;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) audioAttributesCompatParcelizer.IconCompatParcelizer) && this.read == audioAttributesCompatParcelizer.read && this.write == audioAttributesCompatParcelizer.write && this.AudioAttributesCompatParcelizer == audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) audioAttributesCompatParcelizer.RemoteActionCompatParcelizer);
        }

        public final int hashCode() {
            return (((((((this.IconCompatParcelizer.hashCode() * 31) + Boolean.hashCode(this.read)) * 31) + Boolean.hashCode(this.write)) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode();
        }

        public final String toString() {
            String str = this.IconCompatParcelizer;
            boolean z = this.read;
            boolean z2 = this.write;
            LoyaltyPointsBalanceBuilder loyaltyPointsBalanceBuilder = this.AudioAttributesCompatParcelizer;
            String str2 = this.RemoteActionCompatParcelizer;
            StringBuilder sb = new StringBuilder("MonthNameModel(name=");
            sb.append(str);
            sb.append(", isExpanded=");
            sb.append(z);
            sb.append(", showMonthTypeLabel=");
            sb.append(z2);
            sb.append(", monthType=");
            sb.append(loyaltyPointsBalanceBuilder);
            sb.append(", yearString=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }
    }

    public /* synthetic */ getBody(boolean z, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(z);
    }

    public static final class MediaBrowserCompatItemReceiver extends getBody {
        private final boolean AudioAttributesCompatParcelizer;
        private final getBigEndianInt IconCompatParcelizer;
        private final LoyaltyPointsBalanceBuilder RemoteActionCompatParcelizer;
        private boolean read;
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatItemReceiver(boolean z, getBigEndianInt getbigendianint, String str, LoyaltyPointsBalanceBuilder loyaltyPointsBalanceBuilder, boolean z2) {
            super(z, null);
            toMagicModuleMetaRepoModel.write(getbigendianint, "");
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(loyaltyPointsBalanceBuilder, "");
            this.read = z;
            this.IconCompatParcelizer = getbigendianint;
            this.write = str;
            this.RemoteActionCompatParcelizer = loyaltyPointsBalanceBuilder;
            this.AudioAttributesCompatParcelizer = z2;
        }

        public final getBigEndianInt IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static MediaBrowserCompatItemReceiver RemoteActionCompatParcelizer(boolean z, getBigEndianInt getbigendianint, String str, LoyaltyPointsBalanceBuilder loyaltyPointsBalanceBuilder, boolean z2) {
            toMagicModuleMetaRepoModel.write(getbigendianint, "");
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(loyaltyPointsBalanceBuilder, "");
            return new MediaBrowserCompatItemReceiver(true, getbigendianint, str, loyaltyPointsBalanceBuilder, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaBrowserCompatItemReceiver)) {
                return false;
            }
            MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = (MediaBrowserCompatItemReceiver) obj;
            return this.read == mediaBrowserCompatItemReceiver.read && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, mediaBrowserCompatItemReceiver.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) mediaBrowserCompatItemReceiver.write) && this.RemoteActionCompatParcelizer == mediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer && this.AudioAttributesCompatParcelizer == mediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer;
        }

        public final int hashCode() {
            return (((((((Boolean.hashCode(this.read) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.write.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer);
        }

        public final String toString() {
            boolean z = this.read;
            getBigEndianInt getbigendianint = this.IconCompatParcelizer;
            String str = this.write;
            LoyaltyPointsBalanceBuilder loyaltyPointsBalanceBuilder = this.RemoteActionCompatParcelizer;
            boolean z2 = this.AudioAttributesCompatParcelizer;
            StringBuilder sb = new StringBuilder("MonthTestModel(isExpanded=");
            sb.append(z);
            sb.append(", test=");
            sb.append(getbigendianint);
            sb.append(", monthName=");
            sb.append(str);
            sb.append(", monthType=");
            sb.append(loyaltyPointsBalanceBuilder);
            sb.append(", showMonthTypeLabel=");
            sb.append(z2);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class AudioAttributesImplApi26Parcelizer extends getBody {
        private final LoyaltyPointsBalanceBuilder AudioAttributesCompatParcelizer;
        private final boolean IconCompatParcelizer;
        private final String RemoteActionCompatParcelizer;
        private final String read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplApi26Parcelizer(String str, LoyaltyPointsBalanceBuilder loyaltyPointsBalanceBuilder, String str2) {
            super(true, null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(loyaltyPointsBalanceBuilder, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.RemoteActionCompatParcelizer = str;
            this.IconCompatParcelizer = false;
            this.AudioAttributesCompatParcelizer = loyaltyPointsBalanceBuilder;
            this.read = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioAttributesImplApi26Parcelizer)) {
                return false;
            }
            AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer = (AudioAttributesImplApi26Parcelizer) obj;
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) audioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer)) {
                return false;
            }
            boolean z = audioAttributesImplApi26Parcelizer.IconCompatParcelizer;
            return this.AudioAttributesCompatParcelizer == audioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) audioAttributesImplApi26Parcelizer.read);
        }

        public final int hashCode() {
            return (((((this.RemoteActionCompatParcelizer.hashCode() * 31) + Boolean.hashCode(this.IconCompatParcelizer)) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.read.hashCode();
        }

        public final String toString() {
            String str = this.RemoteActionCompatParcelizer;
            LoyaltyPointsBalanceBuilder loyaltyPointsBalanceBuilder = this.AudioAttributesCompatParcelizer;
            String str2 = this.read;
            StringBuilder sb = new StringBuilder("YearMonthStickyHeaderModel(monthName=");
            sb.append(str);
            sb.append(", showMonthTypeLabel=false");
            sb.append(", monthType=");
            sb.append(loyaltyPointsBalanceBuilder);
            sb.append(", yearName=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class AudioAttributesImplBaseParcelizer extends getBody {
        private static final byte[] $$a = {36, -60, 17, 26, -19, -10, -3, 20, -6, 5};
        private static final int $$b = 67;
        private static int read = 0;
        private static int write = 1;
        private final String RemoteActionCompatParcelizer;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(byte r7, short r8, short r9, java.lang.Object[] r10) {
            /*
                int r9 = r9 * 3
                int r9 = 6 - r9
                byte[] r0 = o.getBody.AudioAttributesImplBaseParcelizer.$$a
                int r8 = r8 * 39
                int r8 = 114 - r8
                int r7 = r7 * 4
                int r7 = r7 + 4
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L17
                r8 = r7
                r3 = r9
                r4 = r2
                goto L2e
            L17:
                r3 = r2
            L18:
                int r9 = r9 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r7) goto L29
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L29:
                r3 = r0[r9]
                r6 = r3
                r3 = r9
                r9 = r6
            L2e:
                int r8 = r8 + r9
                int r8 = r8 + 6
                r9 = r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getBody.AudioAttributesImplBaseParcelizer.a(byte, short, short, java.lang.Object[]):void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplBaseParcelizer(String str) {
            super(true, null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.RemoteActionCompatParcelizer = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) ((AudioAttributesImplBaseParcelizer) obj).RemoteActionCompatParcelizer);
        }

        public final int hashCode() {
            return this.RemoteActionCompatParcelizer.hashCode();
        }

        public final String toString() {
            String str = this.RemoteActionCompatParcelizer;
            StringBuilder sb = new StringBuilder("TextLabelHeader(name=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public static Object[] write(int i, int i2, int i3) throws Throwable {
            int i4;
            long j;
            int i5;
            CharSequence charSequence;
            long j2;
            CharSequence charSequence2;
            int i6;
            int i7;
            int i8;
            long j3;
            int i9;
            int i10;
            int i11 = 2 % 2;
            int i12 = write + 75;
            read = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(2136229562);
                if (objRemoteActionCompatParcelizer == null) {
                    int i14 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1503;
                    int iResolveSizeAndState = 21 - View.resolveSizeAndState(0, 0, 0);
                    byte b = (byte) 0;
                    byte b2 = b;
                    Object[] objArr = new Object[1];
                    a(b, b2, (byte) (b2 + 1), objArr);
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), i14, iResolveSizeAndState, 18711087, false, (String) objArr[0], new Class[0]);
                }
                long jLongValue = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, null)).longValue();
                long j4 = 991297899;
                long j5 = -743;
                long j6 = -744;
                long j7 = j4 | jLongValue;
                long j8 = -1;
                long jNextInt = new Random().nextInt(1682605445);
                long j9 = 744;
                long j10 = (j5 * j4) + (j5 * jLongValue) + (((j7 ^ j8) | ((j4 | jNextInt) ^ j8) | ((jLongValue | jNextInt) ^ j8)) * j6) + (((jNextInt ^ j8) | (((jLongValue ^ j8) | (j4 ^ j8)) ^ j8)) * j9) + ((j7 | jNextInt) * j9) + ((long) (-1457295101));
                int i15 = write;
                int i16 = (i15 & 19) + (i15 | 19);
                int i17 = i16 % 128;
                read = i17;
                int i18 = i16 % 2;
                int i19 = (-1830164317) + (((-408413774) | (~(1845640184 | i))) * 191);
                int i20 = ~i;
                int i21 = ((int) (j10 >> 32)) & (i19 + (((-2119696382) | (~(1845640184 | i20))) * 191));
                int i22 = 2065697293 + (((~(1172352499 | i20)) | 538202112) * (-1188));
                int i23 = (~((-1172352500) | i)) | 538202112;
                int i24 = ~(1685388386 | i20);
                int i25 = ((int) j10) & (i22 + ((i23 | i24) * 594) + (((~((-1172352500) | i20)) | 25166225 | i24) * 594));
                if (((i25 & i21) | (i21 ^ i25)) != 0) {
                    int i26 = (i15 ^ 35) + ((i15 & 35) << 1);
                    read = i26 % 128;
                    int i27 = i26 % 2;
                    i4 = 1;
                } else {
                    int i28 = i17 + 19;
                    write = i28 % 128;
                    int i29 = i28 % 2;
                    i4 = 0;
                }
                int i30 = -i4;
                int i31 = ((i4 & i30) | (i4 ^ i30)) >> 31;
                int i32 = (~i31) & i;
                int i33 = i31 & ((i & (-265)) | (i20 & 264));
                int i34 = (i33 & i32) | (i32 ^ i33);
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1907585030);
                if (objRemoteActionCompatParcelizer2 == null) {
                    char cRgb = (char) (Color.rgb(0, 0, 0) + BlockingViewModel_HiltModulesKeyModule.OKHTTP_CLIENT_WINDOW_SIZE);
                    int iNormalizeMetaState = 4118 - KeyEvent.normalizeMetaState(0);
                    int i35 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 40;
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    j = j9;
                    Object[] objArr2 = new Object[1];
                    a(b3, b4, (byte) (b4 + 1), objArr2);
                    objRemoteActionCompatParcelizer2 = startForeground.read(cRgb, iNormalizeMetaState, i35, 268088467, false, (String) objArr2[0], new Class[0]);
                } else {
                    j = j9;
                }
                long jLongValue2 = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, null)).longValue();
                long j11 = 1813734329;
                long j12 = -518;
                long j13 = (j12 * j11) + (j12 * jLongValue2);
                long j14 = 519;
                long j15 = i;
                long j16 = j15 ^ j8;
                long j17 = (j11 ^ j8) | j16;
                long j18 = j13 + ((jLongValue2 | (j17 ^ j8)) * j14) + (((long) (-519)) * (((j17 | jLongValue2) ^ j8) | (((j11 | jLongValue2) | j15) ^ j8))) + (j14 * (((jLongValue2 | j15) ^ j8) | j11)) + ((long) 166271553);
                int i36 = ~((~((int) SystemClock.elapsedRealtime())) | (-279983357));
                int i37 = ((int) (j18 >> 32)) & ((((-1996144384) | i36) * (-374)) + 309439304 + ((i36 | 1716161027) * 374));
                int i38 = ((int) j18) & ((-1026606522) + (((~((-2029108435) | i20)) | (~((-828632452) | i))) * 217) + (((~((-2029108435) | i)) | 811707522) * 217) + (((~((-828632452) | i20)) | 2029108434) * 217));
                if (((i38 & i37) | (i37 ^ i38)) != 0) {
                    int i39 = i | (-2145123455);
                    int i40 = 253395082 - (~(-(-(((i39 & 310460424) | (i39 ^ 310460424)) * 614))));
                    int i41 = (-2145123455) | (~((1003603992 & i20) | (1003603992 ^ i20)));
                    int i42 = ~((i20 ^ 1451979886) | (i20 & 1451979886));
                    int i43 = (i40 - (~(((i41 & i42) | (i41 ^ i42)) * (-1228)))) - 1;
                    int i44 = ~(((-1141519463) & i20) | ((-1141519463) ^ i20));
                    int i45 = ((-1003603993) & i20) | (i20 ^ (-1003603993));
                    int i46 = ~((1451979886 & i45) | (i45 ^ 1451979886));
                    int i47 = ((i44 & i46) | (i44 ^ i46)) * 614;
                    int i48 = (i43 ^ i47) + ((i47 & i43) << 1);
                    int i49 = getHasMultipleThemes.read();
                    int i50 = ~((113436463 & i49) | (113436463 ^ i49));
                    int i51 = -(-(((i50 & 1587908485) | (1587908485 ^ i50)) * 262));
                    int i52 = ((-1459137783) ^ i51) + ((i51 & (-1459137783)) << 1);
                    int i53 = ~i49;
                    int i54 = ~((i53 & 113436463) | (113436463 ^ i53));
                    int i55 = (i54 & 109086469) | (i54 ^ 109086469);
                    if (i48 <= ((((i52 | 1582032640) << 1) - (1582032640 ^ i52)) - (~(((i55 & 1478822016) | (i55 ^ 1478822016)) * 262))) - 1) {
                        i9 = i & (-26935);
                        i10 = i20 & 26934;
                    } else {
                        i9 = i & (-282);
                        i10 = i20 & 281;
                    }
                    i5 = i9 | i10;
                } else {
                    int i56 = write + 11;
                    read = i56 % 128;
                    int i57 = i56 % 2;
                    i5 = i;
                }
                int i58 = i ^ i34;
                int i59 = -i58;
                int i60 = ((i58 & i59) | (i58 ^ i59)) >> 31;
                int i61 = i5 & (~i60);
                int i62 = i60 & i34;
                int i63 = (i61 & i62) | (i61 ^ i62);
                if ((i2 & 16384) == 0) {
                    int i64 = read;
                    int i65 = ((i64 | 63) << 1) - (i64 ^ 63);
                    write = i65 % 128;
                    if (i65 % 2 == 0) {
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1491817860);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            char size = (char) View.MeasureSpec.getSize(0);
                            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 4019;
                            int i66 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 18;
                            byte b5 = (byte) 0;
                            byte b6 = (byte) (b5 + 1);
                            Object[] objArr3 = new Object[1];
                            a(b5, b6, (byte) (b6 - 1), objArr3);
                            objRemoteActionCompatParcelizer3 = startForeground.read(size, windowTouchSlop, i66, -648188183, false, (String) objArr3[0], new Class[0]);
                        }
                        long jLongValue3 = ((Long) ((Method) objRemoteActionCompatParcelizer3).invoke(null, null)).longValue();
                        long j19 = -150607780;
                        long j20 = 628;
                        long j21 = (j20 * j19) + (j20 * jLongValue3);
                        long j22 = -627;
                        long j23 = j21 + ((jLongValue3 | j15 | (j19 ^ j8)) * j22) + (j22 * (j19 | (((jLongValue3 ^ j8) | j15) ^ j8))) + (((long) 627) * (((j16 | jLongValue3) ^ j8) | ((j19 | j15) ^ j8))) + ((long) (-861236207));
                        i7 = (int) (j23 << 66);
                        i8 = 384374654 + (((~((-1224368231) | i20)) | 145383492) * 446) + (((~((-1078984739) | i)) | 67474688) * 446) + 416527992;
                        charSequence = "";
                        j3 = j23;
                        j2 = j15;
                    } else {
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1491817860);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            char c = (char) (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 4019;
                            int iIndexOf = TextUtils.indexOf("", "", 0) + 19;
                            byte b7 = (byte) 0;
                            byte b8 = (byte) (b7 + 1);
                            Object[] objArr4 = new Object[1];
                            a(b7, b8, (byte) (b8 - 1), objArr4);
                            objRemoteActionCompatParcelizer4 = startForeground.read(c, maxKeyCode, iIndexOf, -648188183, false, (String) objArr4[0], new Class[0]);
                        }
                        long jLongValue4 = ((Long) ((Method) objRemoteActionCompatParcelizer4).invoke(null, null)).longValue();
                        long j24 = 669242368;
                        j2 = j15;
                        long j25 = j24 ^ j8;
                        charSequence = "";
                        long jFreeMemory = (int) Runtime.getRuntime().freeMemory();
                        long j26 = (j25 | (jFreeMemory ^ j8)) ^ j8;
                        long j27 = 338;
                        long j28 = ((long) (-1681086355)) + (((long) (-337)) * j24) + (((long) 339) * jLongValue4) + (((long) (-338)) * (j26 | (((jLongValue4 ^ j8) | j24) ^ j8) | ((j24 | jFreeMemory) ^ j8))) + (((j25 | jLongValue4) ^ j8) * j27) + (j27 * (j26 | (((jLongValue4 | j24) | jFreeMemory) ^ j8)));
                        int startUptimeMillis = (int) Process.getStartUptimeMillis();
                        int i67 = ~startUptimeMillis;
                        i7 = (int) (j28 >> 32);
                        i8 = (((~(startUptimeMillis | (-613276164))) | 537680387 | (~(i67 | 899546023))) * 164) + 1628037818 + (((~(613276163 | i67)) | 823950247) * (-328)) + ((823950247 | startUptimeMillis) * 164);
                        j3 = j28;
                    }
                    int i68 = i7 & i8;
                    int i69 = ((int) j3) & (((1019428157 + (((~((-33687557) | i20)) | (~((-541606226) | i20))) * (-184))) + ((((~((-1174911109) | i20)) | 1141223552) | (~((-1682829778) | i20))) * 184)) - 1988390632);
                    int i70 = (i68 & i69) | (i68 ^ i69);
                    int i71 = (~(i & 268)) & (i | 268);
                    int i72 = write;
                    int i73 = i72 + 17;
                    read = i73 % 128;
                    int i74 = i73 % 2;
                    int i75 = (i70 | (-i70)) >> 31;
                    int i76 = (~i75) & i;
                    int i77 = i75 & i71;
                    int i78 = (i77 & i76) | (i76 ^ i77);
                    int i79 = ((~i63) & i) | (i63 & i20);
                    int i80 = -i79;
                    int i81 = ((i79 & i80) | (i79 ^ i80)) >> 31;
                    int i82 = i78 & (~i81);
                    int i83 = i63 & i81;
                    i63 = (i83 & i82) | (i82 ^ i83);
                    int i84 = i72 + 79;
                    read = i84 % 128;
                    int i85 = i84 % 2;
                } else {
                    charSequence = "";
                    j2 = j15;
                }
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-375411667);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char c2 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    int maximumDrawingCacheSize = 4019 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int i86 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 18;
                    byte b9 = (byte) 0;
                    byte b10 = b9;
                    Object[] objArr5 = new Object[1];
                    a(b9, b10, (byte) (b10 + 1), objArr5);
                    objRemoteActionCompatParcelizer5 = startForeground.read(c2, maximumDrawingCacheSize, i86, -1747556168, false, (String) objArr5[0], new Class[0]);
                }
                long jLongValue5 = ((Long) ((Method) objRemoteActionCompatParcelizer5).invoke(null, null)).longValue();
                long j29 = 834341494;
                long j30 = (((long) (-129)) * j29) + (((long) TarConstants.PREFIXLEN_XSTAR) * jLongValue5);
                long j31 = TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
                long j32 = jLongValue5 ^ j8;
                long j33 = j30 + ((((j32 | j16) | j29) ^ j8) * j31);
                CharSequence charSequence3 = charSequence;
                int i87 = i63;
                long j34 = j32 | j29;
                long j35 = j33 + (((long) (-260)) * (j34 ^ j8)) + (j31 * ((((j29 ^ j8) | jLongValue5) ^ j8) | ((j34 | j2) ^ j8))) + ((long) 113219474);
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i88 = ~startElapsedRealtime;
                int i89 = ((int) (j35 >> 32)) & ((-1227930062) + ((4793788 | startElapsedRealtime) * 140) + (((~(4793788 | i88)) | 1428163138) * (-280)) + (((~(startElapsedRealtime | (-1428163139))) | (~(1432432622 | i88)) | 524304) * 140));
                int i90 = ((int) j35) & ((-340389966) + (((~(i20 | 772443728)) | 2085297157) * (-1042)) + ((772443728 | i) * 521) + (((~((-2085297158) | i)) | 738855936 | (~(2118884949 | i20))) * 521));
                int i91 = (i89 & i90) | (i89 ^ i90);
                int i92 = (i & (-267)) | (i20 & 266);
                int i93 = read + 77;
                write = i93 % 128;
                int i94 = i93 % 2 == 0 ? (i91 | (-i91)) >>> 29 : (i91 | (-i91)) >> 31;
                int i95 = (~i94) & i;
                int i96 = i94 & i92;
                int i97 = (i96 & i95) | (i95 ^ i96);
                int i98 = (~(i & i87)) & (i | i87);
                int i99 = -i98;
                getHasMultipleThemes.read();
                int i100 = ((i98 & i99) | (i98 ^ i99)) >> 31;
                int i101 = i97 & (~i100);
                int i102 = write;
                int i103 = (i102 ^ 27) + ((i102 & 27) << 1);
                read = i103 % 128;
                int i104 = i103 % 2;
                int i105 = i87 & i100;
                int i106 = (i101 & i105) | (i101 ^ i105);
                if ((i2 & 524288) == 0) {
                    int i107 = (i102 ^ 105) + ((i102 & 105) << 1);
                    read = i107 % 128;
                    int i108 = i107 % 2;
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(1878396060);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 31603);
                        int pressedStateDuration = 3694 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        charSequence2 = charSequence3;
                        int iIndexOf2 = TextUtils.indexOf(charSequence2, charSequence2, 0, 0) + 27;
                        byte b11 = (byte) 0;
                        byte b12 = b11;
                        Object[] objArr6 = new Object[1];
                        a(b11, b12, (byte) (b12 + 1), objArr6);
                        objRemoteActionCompatParcelizer6 = startForeground.read(fadingEdgeLength, pressedStateDuration, iIndexOf2, 297781257, false, (String) objArr6[0], new Class[0]);
                    } else {
                        charSequence2 = charSequence3;
                    }
                    long jLongValue6 = ((Long) ((Method) objRemoteActionCompatParcelizer6).invoke(null, null)).longValue();
                    long j36 = -637240958;
                    long j37 = j36 | jLongValue6;
                    long j38 = (j5 * j36) + (j5 * jLongValue6) + (((j37 ^ j8) | ((j36 | j2) ^ j8) | ((jLongValue6 | j2) ^ j8)) * j6) + ((j16 | (((jLongValue6 ^ j8) | (j36 ^ j8)) ^ j8)) * j) + ((j37 | j2) * j) + ((long) (-524046646));
                    int i109 = ((int) (j38 >> 32)) & ((-2088991750) + ((1991671479 | i) * 376) + (((~((-428315791) | i20)) | 277222534) * (-376)) + (((~(428315790 | i)) | 1865542201) * 376));
                    int i110 = ((int) j38) & (2141866205 + (((-21234769) | i20) * 184) + (((~((-695108859) | i20)) | (-89478230)) * 184));
                    int i111 = (i109 & i110) | (i109 ^ i110);
                    if (i111 > 0 && (i111 != 3 || (i2 & 268435456) == 0)) {
                        int i112 = ((~i106) & i) | (i106 & i20);
                        int i113 = -i112;
                        int i114 = ((i112 & i113) | (i112 ^ i113)) >> 31;
                        int i115 = ((i & (-281)) | (i20 & 280)) & (~i114);
                        int i116 = write;
                        int i117 = ((i116 | 97) << 1) - (i116 ^ 97);
                        int i118 = i117 % 128;
                        read = i118;
                        int i119 = i117 % 2;
                        int i120 = i106 & i114;
                        i106 = (i120 & i115) | (i115 ^ i120);
                        int i121 = ((i118 | 7) << 1) - (i118 ^ 7);
                        write = i121 % 128;
                        int i122 = i121 % 2;
                    }
                    int i123 = (i & (-288)) | (i20 & 287);
                    int i124 = write;
                    int i125 = i124 + 81;
                    read = i125 % 128;
                    int i126 = i125 % 2;
                    int i127 = ~i111;
                    if (i126 != 0) {
                        int i128 = -i127;
                        i6 = ((i127 & i128) | (i127 ^ i128)) % 87;
                    } else {
                        int i129 = -i127;
                        i6 = ((i127 & i129) | (i127 ^ i129)) >> 31;
                    }
                    int i130 = (i124 ^ 51) + ((i124 & 51) << 1);
                    int i131 = i130 % 128;
                    read = i131;
                    int i132 = i130 % 2;
                    int i133 = (i6 & i) | (i123 & (~i6));
                    int i134 = i ^ i106;
                    int i135 = -i134;
                    int i136 = i131 + 87;
                    write = i136 % 128;
                    int i137 = i136 % 2 == 0 ? ((i134 & i135) | (i134 ^ i135)) << 67 : ((i134 & i135) | (i134 ^ i135)) >> 31;
                    int i138 = ((i131 | 11) << 1) - (i131 ^ 11);
                    write = i138 % 128;
                    int i139 = i138 % 2;
                    int i140 = i133 & (i137 ^ (-1));
                    int i141 = i106 & i137;
                    i106 = (i141 & i140) | (i140 ^ i141);
                } else {
                    charSequence2 = charSequence3;
                }
                byte[] bArr = new byte[16];
                Object[] objArr7 = {bArr};
                Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-1196681127);
                if (objRemoteActionCompatParcelizer7 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf(charSequence2, '0', 0) + 1);
                    int i142 = 1905 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                    int threadPriority = 43 - ((Process.getThreadPriority(0) + 20) >> 6);
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr8 = new Object[1];
                    a(b13, b14, (byte) (b14 + 1), objArr8);
                    objRemoteActionCompatParcelizer7 = startForeground.read(cLastIndexOf, i142, threadPriority, -958014260, false, (String) objArr8[0], new Class[]{byte[].class});
                }
                long jLongValue7 = ((Long) ((Method) objRemoteActionCompatParcelizer7).invoke(null, objArr7)).longValue();
                long j39 = -150761927;
                int i143 = i106;
                long j40 = 988;
                long j41 = jLongValue7 ^ j8;
                long j42 = (((long) 989) * j39) + (((long) (-987)) * jLongValue7) + (((((j41 | j16) | j39) ^ j8) | (((j39 | jLongValue7) | j2) ^ j8)) * j40) + (((long) (-988)) * (j39 | j41)) + (j40 * ((((j39 ^ j8) | j41) ^ j8) | ((j41 | j2) ^ j8) | (j8 ^ ((j16 | j39) | jLongValue7)))) + ((long) 1020818498);
                int i144 = ((int) (j42 >> 32)) & ((((-818884594) + ((2885139 | i20) * 1324)) + (((~(7210515 | i)) | (~(1430015895 | i))) * (-1324))) - 1563813032);
                int i145 = ~((int) SystemClock.uptimeMillis());
                int i146 = ((int) j42) & (((1019428157 + (((~(i145 | (-555762722))) | (~(2071851003 | i145))) * (-184))) + (((39430936 | (~(2032420067 | i145))) | (~((-595193658) | i145))) * 184)) - 1122012200);
                int i147 = (i144 & i146) | (i144 ^ i146);
                int i148 = -i147;
                int i149 = ((i147 & i148) | (i147 ^ i148)) >> 31;
                int i150 = (~i149) & i;
                int i151 = i149 & ((i & (-314)) | (i20 & 313));
                int i152 = (i151 & i150) | (i150 ^ i151);
                String[] strArr = {Base64.encodeToString(bArr, 0)};
                Object[] objArr9 = new Object[2];
                int i153 = ((~i143) & i) | (i143 & i20);
                int i154 = -i153;
                int i155 = (((i153 & i154) | (i153 ^ i154)) >> 31) & 1;
                int i156 = read;
                int i157 = i156 + 49;
                write = i157 % 128;
                int i158 = i157 % 2;
                int i159 = -i155;
                int i160 = (~(((i159 & i155) | (i155 ^ i159)) >> 31)) & 1;
                objArr9[i155] = strArr;
                objArr9[i160] = null;
                String[] strArr2 = (String[]) objArr9[0];
                int i161 = i ^ i143;
                int i162 = (i161 | (-i161)) >> 31;
                int i163 = i156 + 9;
                write = i163 % 128;
                int i164 = i163 % 2;
                int i165 = i152 & (~i162);
                int i166 = i162 & i143;
                int i167 = (i165 & i166) | (i165 ^ i166);
                Object[] objArr10 = {strArr2, new int[1], new int[]{i}, new int[]{i167}};
                int i168 = i ^ i167;
                int i169 = -i168;
                int i170 = ((i168 & i169) | (i168 ^ i169)) >> 31;
                int i171 = (i156 & 3) + (i156 | 3);
                write = i171 % 128;
                int i172 = i171 % 2;
                int i173 = i170 & 16;
                int i174 = (i156 ^ 15) + ((i156 & 15) << 1);
                write = i174 % 128;
                int i175 = i174 % 2;
                int iNextInt = new Random().nextInt();
                int i176 = 1803153880 + (((~((-163743175) | iNextInt)) | (~(1810812383 | iNextInt))) * 69) + (((~(iNextInt | 1237503431)) | (~((-737052127) | iNextInt)) | 573308952) * (-69)) + 1075013701;
                int i177 = ((i176 | i173) << 1) - (i176 ^ i173);
                int i178 = getHasMultipleThemes.read();
                int i179 = (i177 * 615) + (i3 * (-613));
                int i180 = ~i177;
                int i181 = ~((i180 & i3) | (i180 ^ i3));
                int i182 = (i178 ^ i181) | (i178 & i181);
                int i183 = ~i3;
                int i184 = ~((i183 ^ i177) | (i183 & i177));
                int i185 = ((i182 & i184) | (i182 ^ i184)) * 614;
                int i186 = (i179 & i185) + (i179 | i185);
                int i187 = ~i177;
                int i188 = ~i178;
                int i189 = i181 | (~((i187 ^ i188) | (i187 & i188)));
                int i190 = ~((i188 ^ i3) | (i188 & i3));
                int i191 = i186 + (((i189 & i190) | (i189 ^ i190)) * (-1228));
                int i192 = read + 49;
                write = i192 % 128;
                if (i192 % 2 == 0) {
                    int i193 = (i187 ^ i183) | (i187 & i183);
                    int i194 = ~((i193 & i188) | (i193 ^ i188));
                    int i195 = (i177 & i188) | (i188 ^ i177);
                    int i196 = ~((i195 & i3) | (i195 ^ i3));
                    int i197 = i191 << (614 << ((i196 & i194) | (i194 ^ i196)));
                    int i198 = i197 + 86;
                    int i199 = (i197 | i198) & (~(i197 & i198));
                    int i200 = i199 * 75;
                    int i201 = ((~i199) & i200) | ((~i200) & i199);
                    int i202 = ((i201 | 3) << 1) - (i201 ^ 3);
                    ((int[]) objArr10[1])[0] = ((~i201) & i202) | ((~i202) & i201);
                } else {
                    int i203 = (i187 & i183) | (i187 ^ i183);
                    int i204 = ~i178;
                    int i205 = ~((i203 & i204) | (i203 ^ i204));
                    int i206 = ~((i177 & i204) | (i204 ^ i177) | i3);
                    int i207 = ((i206 & i205) | (i205 ^ i206)) * 614;
                    int i208 = (i191 ^ i207) + ((i207 & i191) << 1);
                    int i209 = (i208 << 13) ^ i208;
                    int i210 = i209 ^ (i209 >>> 17);
                    int i211 = i210 << 5;
                    ((int[]) objArr10[1])[0] = (i210 | i211) & (~(i210 & i211));
                }
                return objArr10;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    public static final class write extends getBody {
        private final String IconCompatParcelizer;
        private final boolean write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(String str, boolean z) {
            super(z, null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.IconCompatParcelizer = str;
            this.write = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static write write(String str, boolean z) {
            toMagicModuleMetaRepoModel.write(str, "");
            return new write(str, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof write)) {
                return false;
            }
            write writeVar = (write) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) writeVar.IconCompatParcelizer) && this.write == writeVar.write;
        }

        public final int hashCode() {
            return (this.IconCompatParcelizer.hashCode() * 31) + Boolean.hashCode(this.write);
        }

        public final String toString() {
            String str = this.IconCompatParcelizer;
            boolean z = this.write;
            StringBuilder sb = new StringBuilder("ExpandAllHeader(id=");
            sb.append(str);
            sb.append(", isExpanded=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0014\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000f"}, d2 = {"Lo/getBody$MediaBrowserCompatCustomActionResultReceiver;", "Lo/getBody;", "", "p0", "", "p1", "<init>", "(ILjava/lang/String;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "I", "RemoteActionCompatParcelizer", "Ljava/lang/String;", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MediaBrowserCompatCustomActionResultReceiver extends getBody {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final int RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final String read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatCustomActionResultReceiver(int i, String str) {
            super(true, null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.RemoteActionCompatParcelizer = i;
            this.read = str;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final int getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final String getRead() {
            return this.read;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof MediaBrowserCompatCustomActionResultReceiver)) {
                return false;
            }
            MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = (MediaBrowserCompatCustomActionResultReceiver) p0;
            return this.RemoteActionCompatParcelizer == mediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) mediaBrowserCompatCustomActionResultReceiver.read);
        }

        public final int hashCode() {
            return (Integer.hashCode(this.RemoteActionCompatParcelizer) * 31) + this.read.hashCode();
        }

        public final String toString() {
            int i = this.RemoteActionCompatParcelizer;
            String str = this.read;
            StringBuilder sb = new StringBuilder("MediaBrowserCompatCustomActionResultReceiver(RemoteActionCompatParcelizer=");
            sb.append(i);
            sb.append(", read=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/getBody$RemoteActionCompatParcelizer;", "Lo/getBody;", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "Ljava/lang/String;", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RemoteActionCompatParcelizer extends getBody {

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final String IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private RemoteActionCompatParcelizer(String str) {
            super(true, null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.IconCompatParcelizer = str;
        }

        public /* synthetic */ RemoteActionCompatParcelizer(String str, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this((i & 1) != 0 ? "" : str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RemoteActionCompatParcelizer() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) ((RemoteActionCompatParcelizer) p0).IconCompatParcelizer);
        }

        public final int hashCode() {
            return this.IconCompatParcelizer.hashCode();
        }

        public final String toString() {
            String str = this.IconCompatParcelizer;
            StringBuilder sb = new StringBuilder("RemoteActionCompatParcelizer(IconCompatParcelizer=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class read extends getBody {
        private final boolean IconCompatParcelizer;
        private final long read;

        public read(boolean z, long j) {
            super(z, null);
            this.IconCompatParcelizer = z;
            this.read = j;
        }

        public final long IconCompatParcelizer() {
            return this.read;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static read AudioAttributesCompatParcelizer(boolean z, long j) {
            return new read(true, j);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof read)) {
                return false;
            }
            read readVar = (read) obj;
            return this.IconCompatParcelizer == readVar.IconCompatParcelizer && this.read == readVar.read;
        }

        public final int hashCode() {
            return (Boolean.hashCode(this.IconCompatParcelizer) * 31) + Long.hashCode(this.read);
        }

        public final String toString() {
            boolean z = this.IconCompatParcelizer;
            long j = this.read;
            StringBuilder sb = new StringBuilder("EmptyHeader(isExpanded=");
            sb.append(z);
            sb.append(", monthTimeStamp=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class IconCompatParcelizer extends getBody {
        private final String AudioAttributesCompatParcelizer;
        private final boolean write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(String str, boolean z) {
            super(z, null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.AudioAttributesCompatParcelizer = str;
            this.write = z;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) iconCompatParcelizer.AudioAttributesCompatParcelizer) && this.write == iconCompatParcelizer.write;
        }

        public final int hashCode() {
            return (this.AudioAttributesCompatParcelizer.hashCode() * 31) + Boolean.hashCode(this.write);
        }

        public final String toString() {
            String str = this.AudioAttributesCompatParcelizer;
            boolean z = this.write;
            StringBuilder sb = new StringBuilder("GTNudgeBanner(title=");
            sb.append(str);
            sb.append(", visible=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }
    }
}
