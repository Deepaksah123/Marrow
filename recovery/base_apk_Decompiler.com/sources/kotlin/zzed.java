package kotlin;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow2.ui.qbank.score.model.RevisionSubjectUIModel;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lo/zzed;", "", "<init>", "()V", "IconCompatParcelizer", "write", "RemoteActionCompatParcelizer", "read", "AudioAttributesCompatParcelizer", "Lo/zzed$write;", "Lo/zzed$IconCompatParcelizer;", "Lo/zzed$AudioAttributesCompatParcelizer;", "Lo/zzed$read;", "Lo/zzed$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class zzed {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {TarConstants.LF_SYMLINK, -51, -30, -2, 7, 11, -9, 17, -50, 19, -3, -4, TarConstants.LF_NORMAL, -49, 2, 4, 11, 9, -17, 3, 17, -12, TarConstants.LF_SYMLINK, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11, -24, -10, 3, 45, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11, 15, 6, -1, 4, -13};
    private static final int $$b = TsExtractor.TS_STREAM_TYPE_DTS;
    private static int read = 0;
    private static int write = 1;
    private static int AudioAttributesCompatParcelizer = 1000326188;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(short r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = 60 - r7
            int r9 = r9 + 3
            byte[] r0 = kotlin.zzed.$$a
            int r8 = 119 - r8
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r8
            r5 = r2
            r8 = r7
            goto L27
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L21
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L21:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L27:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + 2
            int r8 = r8 + 1
            r3 = r5
            r6 = r8
            r8 = r7
            r7 = r6
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzed.b(short, int, int, java.lang.Object[]):void");
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/zzed$IconCompatParcelizer;", "Lo/zzed;", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IconCompatParcelizer extends zzed {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        public final int hashCode() {
            return 588084751;
        }

        private IconCompatParcelizer() {
            super(null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof IconCompatParcelizer)) {
                return false;
            }
            return true;
        }

        public final String toString() {
            return "IconCompatParcelizer";
        }
    }

    private zzed() {
    }

    public static final class write extends zzed {
        private final String read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.read = str;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.read;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) ((write) obj).read);
        }

        public final int hashCode() {
            return this.read.hashCode();
        }

        public final String toString() {
            String str = this.read;
            StringBuilder sb = new StringBuilder("Error(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/zzed$RemoteActionCompatParcelizer;", "Lo/zzed;", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RemoteActionCompatParcelizer extends zzed {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        public final int hashCode() {
            return 981259476;
        }

        private RemoteActionCompatParcelizer() {
            super(null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof RemoteActionCompatParcelizer)) {
                return false;
            }
            return true;
        }

        public final String toString() {
            return "RemoteActionCompatParcelizer";
        }
    }

    public static final class read extends zzed {
        private final RevisionSubjectUIModel RemoteActionCompatParcelizer;
        private final zzdz read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(zzdz zzdzVar, RevisionSubjectUIModel revisionSubjectUIModel) {
            super(null);
            toMagicModuleMetaRepoModel.write(zzdzVar, "");
            toMagicModuleMetaRepoModel.write(revisionSubjectUIModel, "");
            this.read = zzdzVar;
            this.RemoteActionCompatParcelizer = revisionSubjectUIModel;
        }

        public final RevisionSubjectUIModel AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final zzdz RemoteActionCompatParcelizer() {
            return this.read;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof read)) {
                return false;
            }
            read readVar = (read) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, readVar.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, readVar.RemoteActionCompatParcelizer);
        }

        public final int hashCode() {
            return (this.read.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode();
        }

        public final String toString() {
            zzdz zzdzVar = this.read;
            RevisionSubjectUIModel revisionSubjectUIModel = this.RemoteActionCompatParcelizer;
            StringBuilder sb = new StringBuilder("SecondAnimating(data=");
            sb.append(zzdzVar);
            sb.append(", revisionSubject=");
            sb.append(revisionSubjectUIModel);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class AudioAttributesCompatParcelizer extends zzed {
        private final zzdz IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(zzdz zzdzVar) {
            super(null);
            toMagicModuleMetaRepoModel.write(zzdzVar, "");
            this.IconCompatParcelizer = zzdzVar;
        }

        public final zzdz IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, ((AudioAttributesCompatParcelizer) obj).IconCompatParcelizer);
        }

        public final int hashCode() {
            return this.IconCompatParcelizer.hashCode();
        }

        public final String toString() {
            zzdz zzdzVar = this.IconCompatParcelizer;
            StringBuilder sb = new StringBuilder("Score(data=");
            sb.append(zzdzVar);
            sb.append(")");
            return sb.toString();
        }
    }

    private static void a(int i, boolean z, char[] cArr, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
        char[] cArr2 = new char[i2];
        cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
        while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
            cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
            cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i3 + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
            int i5 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(AudioAttributesCompatParcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getTouchSlop() >> 8), 23704 - (ViewConfiguration.getScrollBarSize() >> 8), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 31, -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (44861 - ((byte) KeyEvent.getModifierMetaStateMask())), 18992 - AndroidCharacter.getMirror('0'), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 28, -1836173544, false, "c", new Class[]{Object.class, Object.class});
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
        if (i > 0) {
            int i6 = $11 + 53;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cleardownloadmanagerhelpers.write = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - cleardownloadmanagerhelpers.write, cleardownloadmanagerhelpers.write);
            System.arraycopy(cArr3, cleardownloadmanagerhelpers.write, cArr2, 0, i2 - cleardownloadmanagerhelpers.write);
        }
        if (z) {
            int i8 = $10 + 89;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr4 = new char[i2];
            cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            int i10 = $10 + 37;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
                int i12 = $10 + 15;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[i2 << cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
                    Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (ExpandableListView.getPackedPositionChild(0L) + 44863), 18944 - (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 28, -1836173544, false, "c", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                } else {
                    cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i2 - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                    Object[] objArr5 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-322440307);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 44861), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 18943, TextUtils.getCapsMode("", 0, 0) + 28, -1836173544, false, "c", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public /* synthetic */ zzed(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x03f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x03de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] write(android.content.Context r28, int r29, int r30, int r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2679
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzed.write(android.content.Context, int, int, int):java.lang.Object[]");
    }
}
