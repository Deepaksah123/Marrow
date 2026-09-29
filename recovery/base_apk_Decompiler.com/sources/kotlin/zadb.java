package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.marrow.R;
import com.marrow.TrainingApplication;
import com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin.moveToLast;
import kotlin.zadb;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003R\u001b\u0010\u000f\u001a\u00020\n8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lo/zadb;", "Lo/zaay;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "MediaDescriptionCompat", "Lcom/marrow2/ui/main/viewmodel/RevampHomeActivityViewModel;", "read", "Lo/RenewEligible;", "MediaBrowserCompatSearchResultReceiver", "()Lcom/marrow2/ui/main/viewmodel/RevampHomeActivityViewModel;", "IconCompatParcelizer", "RemoteActionCompatParcelizer_"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zadb extends zaaz {
    private static int AudioAttributesCompatParcelizer;
    private static int AudioAttributesImplApi21Parcelizer;
    private static boolean AudioAttributesImplApi26Parcelizer;
    private static boolean AudioAttributesImplBaseParcelizer;
    private static long IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer_, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char[] write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final RenewEligible IconCompatParcelizer;
    private static final byte[] $$K = {TarConstants.LF_PAX_EXTENDED_HEADER_UC, -92, 37, 22};
    private static final int $$L = 167;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$H = {118, 56, TarConstants.LF_SYMLINK, 93, 58, -64, -5, -22, 41, -56, -4, 10, -26, 4, -13, -6, 26, -35, -10, -7, -4, -17, -33, -19, -6, 36, -51, -5, -10, 8, -26, 29, -24, -24, 8, -9, -14, -4, -24, 14, -20, -26, -15, -9, -12, 8, 29, -41, -24, 4, -13, -6, 36, -51, -5, -10, 8, -26, 29, -24, -24, 8, -9, -14, -4, -24, 14, -20, 58, -64, -5, -22, 25, -27, -20, 1, 4, -19, 6, -15, -10, 16, -36, -1, 65, -53, -26, -15, -9, -12, 8, 29, -41, -24, 4, -13, -6, 36, -51, -5, -10, 8, -26, 29, -24, -24, 8, -9, -14, -4, -24, 14, -20};
    private static final int $$I = 194;
    private static final byte[] $$p = {118, 56, TarConstants.LF_SYMLINK, 93, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$q = 97;
    private static int MediaBrowserCompatItemReceiver = 0;
    private static int MediaMetadataCompat = 1;
    private static int MediaBrowserCompatCustomActionResultReceiver = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$M(int r6, int r7, int r8) {
        /*
            int r7 = r7 * 3
            int r7 = 3 - r7
            byte[] r0 = kotlin.zadb.$$K
            int r6 = r6 * 4
            int r1 = 1 - r6
            int r8 = r8 * 2
            int r8 = 121 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L19
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2e
        L19:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1d:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L2c
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L2c:
            r3 = r0[r8]
        L2e:
            int r7 = r7 + r3
            r3 = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zadb.$$M(int, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void w(int r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r0 = r6 + 4
            int r7 = r7 + 65
            int r5 = r5 + 4
            byte[] r1 = kotlin.zadb.$$p
            byte[] r0 = new byte[r0]
            int r6 = r6 + 3
            r2 = -1
            if (r1 != 0) goto L12
            r4 = r6
            r3 = r2
            goto L25
        L12:
            r3 = r2
        L13:
            int r3 = r3 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L23:
            r4 = r1[r5]
        L25:
            int r4 = -r4
            int r5 = r5 + 1
            int r7 = r7 + r4
            int r7 = r7 + r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zadb.w(int, int, byte, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object write(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i;
        int i9 = i4 | i7 | i8;
        int i10 = (~(i7 | i)) | (~(i8 | i4));
        int i11 = (~(i | i4)) | (~(i7 | (~i4) | i8));
        int i12 = i4 + i5 + i2 + ((-160716491) * i3) + (1883135422 * i6);
        int i13 = i12 * i12;
        int i14 = (((-1835184368) * i4) - 666828800) + ((-962678542) * i5) + ((-1711230735) * i9) + (i10 * 1711230735) + (1711230735 * i11) + (748552192 * i2) + ((-1967783936) * i3) + ((-2092695552) * i6) + ((-870252544) * i13);
        int i15 = (i4 * 1975847376) + 750996803 + (i5 * 1975845642) + (i9 * (-867)) + (i10 * 867) + (i11 * 867) + (i2 * 1975846509) + (i3 * (-526956143)) + (i6 * 972447206) + (i13 * (-1341325312));
        return i14 + ((i15 * i15) * 1929838592) != 1 ? RemoteActionCompatParcelizer(objArr) : AudioAttributesCompatParcelizer(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void x(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r7 = 111 - r7
            byte[] r0 = kotlin.zadb.$$H
            int r1 = r6 + 19
            byte[] r1 = new byte[r1]
            int r6 = r6 + 18
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r8 = r8 + 1
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2a:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-7)
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zadb.x(int, short, int, java.lang.Object[]):void");
    }

    public zadb() {
        zadb zadbVar = this;
        this.IconCompatParcelizer = new VirtualAnnotatedMember(toMagicModuleMetaDataUcModel.write(RevampHomeActivityViewModel.class), new AnonymousClass1(zadbVar), new AnonymousClass5(zadbVar), new AnonymousClass2(zadbVar));
    }

    public static final /* synthetic */ RevampHomeActivityViewModel RemoteActionCompatParcelizer(zadb zadbVar) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 117;
        MediaMetadataCompat = i2 % 128;
        if (i2 % 2 == 0) {
            zadbVar.MediaBrowserCompatSearchResultReceiver();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        RevampHomeActivityViewModel revampHomeActivityViewModelMediaBrowserCompatSearchResultReceiver = zadbVar.MediaBrowserCompatSearchResultReceiver();
        int i3 = MediaBrowserCompatItemReceiver + 53;
        MediaMetadataCompat = i3 % 128;
        int i4 = i3 % 2;
        return revampHomeActivityViewModelMediaBrowserCompatSearchResultReceiver;
    }

    private final RevampHomeActivityViewModel MediaBrowserCompatSearchResultReceiver() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 35;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        RevampHomeActivityViewModel revampHomeActivityViewModel = (RevampHomeActivityViewModel) this.IconCompatParcelizer.RemoteActionCompatParcelizer();
        int i4 = MediaMetadataCompat + 119;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
        return revampHomeActivityViewModel;
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: o.zadb$IconCompatParcelizer$2, reason: invalid class name */
        static final class AnonymousClass2<T> implements getValidationToken {
            private /* synthetic */ zadb AudioAttributesCompatParcelizer;

            @Override // kotlin.getValidationToken
            public final /* synthetic */ Object IconCompatParcelizer(Object obj, SampleVideos sampleVideos) {
                return RemoteActionCompatParcelizer((RevampHomeActivityViewModel.IconCompatParcelizer) obj);
            }

            private Object RemoteActionCompatParcelizer(RevampHomeActivityViewModel.IconCompatParcelizer iconCompatParcelizer) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(iconCompatParcelizer, RevampHomeActivityViewModel.IconCompatParcelizer.AudioAttributesCompatParcelizer.INSTANCE)) {
                    needsDisableAdaptationWorkaround needsdisableadaptationworkaroundRemoteActionCompatParcelizer = needsDisableAdaptationWorkaround.RemoteActionCompatParcelizer();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(needsdisableadaptationworkaroundRemoteActionCompatParcelizer, "");
                    Task<String> taskIconCompatParcelizer = needsdisableadaptationworkaroundRemoteActionCompatParcelizer.IconCompatParcelizer();
                    final zadb zadbVar = this.AudioAttributesCompatParcelizer;
                    taskIconCompatParcelizer.addOnCompleteListener(new OnCompleteListener() { // from class: o.zadc
                        @Override // com.google.android.gms.tasks.OnCompleteListener
                        public final void onComplete(Task task) throws Throwable {
                            zadb.IconCompatParcelizer.AnonymousClass2.RemoteActionCompatParcelizer(zadbVar, task);
                        }
                    });
                } else if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(iconCompatParcelizer, RevampHomeActivityViewModel.IconCompatParcelizer.read.INSTANCE)) {
                    throw new RenewEligibleCreator();
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void RemoteActionCompatParcelizer(zadb zadbVar, Task task) throws Throwable {
                toMagicModuleMetaRepoModel.write(task, "");
                if (task.isSuccessful()) {
                    zadb zadbVar2 = zadbVar;
                    String strRemoteActionCompatParcelizer = updateButton.RemoteActionCompatParcelizer(zadbVar2);
                    String strIconCompatParcelizer = parseDuration.IconCompatParcelizer(zadbVar2);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strIconCompatParcelizer, "");
                    RevampHomeActivityViewModel revampHomeActivityViewModelRemoteActionCompatParcelizer = zadb.RemoteActionCompatParcelizer(zadbVar);
                    Object result = task.getResult();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(result, "");
                    revampHomeActivityViewModelRemoteActionCompatParcelizer.read(new RevampHomeActivityViewModel.write.IconCompatParcelizer(strRemoteActionCompatParcelizer, strIconCompatParcelizer, (String) result));
                }
            }

            AnonymousClass2(zadb zadbVar) {
                this.AudioAttributesCompatParcelizer = zadbVar;
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (zadb.RemoteActionCompatParcelizer(zadb.this).AudioAttributesCompatParcelizer().write(new AnonymousClass2(zadb.this), this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            throw new PlanDetailsCreator();
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return zadb.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.zadb$RemoteActionCompatParcelizer_, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/zadb$RemoteActionCompatParcelizer_;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lo/onDataRangeRemoved;", "p1", "Landroid/content/Intent;", "AudioAttributesCompatParcelizer", "(Landroid/content/Context;Lo/onDataRangeRemoved;)Landroid/content/Intent;", "write", "(Landroid/content/Context;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent AudioAttributesCompatParcelizer(Context p0, onDataRangeRemoved p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            Intent intent = new Intent(p0, (Class<?>) zadb.class);
            p1.write(intent);
            return intent;
        }

        @getMagicModuleMeta
        public static Intent write(Context p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new Intent(p0, (Class<?>) zadb.class);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void u(int i, char[] cArr, Object[] objArr) throws Throwable {
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
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read((char) (KeyEvent.getDeadChar(0, 0) + 38461), View.MeasureSpec.getSize(0) + 532, 8 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -735610793, false, $$M(b, b2, b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() ^ (IconCompatParcelizer ^ 2192498202983240651L);
                Object[] objArr3 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (36621 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), TextUtils.lastIndexOf("", '0') + 2341, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 28, 188119637, false, $$M(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                int i4 = $10 + 57;
                $11 = i4 % 128;
                int i5 = i4 % 2;
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
        int i6 = $11 + 57;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 5 % 4;
        }
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i8 = $10 + 103;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
            Object[] objArr4 = {notifydownloadchanged, notifydownloadchanged};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1971306176);
            if (objRemoteActionCompatParcelizer3 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 36621), 2340 - (ViewConfiguration.getTouchSlop() >> 8), 28 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 188119637, false, $$M(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX INFO: renamed from: o.zadb$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "RemoteActionCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ MediaBrowserCompatMediaItem $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            return this.$read.getDefaultViewModelProviderFactory();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$read = mediaBrowserCompatMediaItem;
        }
    }

    /* JADX INFO: renamed from: o.zadb$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "AudioAttributesCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ MediaBrowserCompatMediaItem $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return this.$RemoteActionCompatParcelizer.getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$RemoteActionCompatParcelizer = mediaBrowserCompatMediaItem;
        }
    }

    /* JADX INFO: renamed from: o.zadb$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "write", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $IconCompatParcelizer = null;
        private /* synthetic */ MediaBrowserCompatMediaItem $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            return this.$write.getDefaultViewModelCreationExtras();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$write = mediaBrowserCompatMediaItem;
        }
    }

    private static void v(byte[] bArr, char[] cArr, int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr2 = write;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $10 + 43;
                $11 = i5 % 128;
                if (i5 % i2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) (KeyEvent.normalizeMetaState(0) + 44862), View.MeasureSpec.getMode(0) + 18944, (ViewConfiguration.getEdgeSlop() >> 16) + 28, -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i4])};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-298077624);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) (44862 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 18945 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 28 - TextUtils.getOffsetBefore("", 0), -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                        i4++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i2 = 2;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(AudioAttributesCompatParcelizer)};
        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(680566917);
        if (objRemoteActionCompatParcelizer3 == null) {
            objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (Process.myPid() >> 22) + 19033, 74 - ((byte) KeyEvent.getModifierMetaStateMask()), 1457087504, false, "r", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
        if (AudioAttributesImplApi26Parcelizer) {
            notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
            char[] cArr4 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr2[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                Object[] objArr5 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) TextUtils.getOffsetBefore("", 0), 11439 - (Process.myPid() >> 22), View.getDefaultSize(0, 0) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!AudioAttributesImplBaseParcelizer) {
            notifydownloads.AudioAttributesCompatParcelizer = iArr.length;
            char[] cArr5 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr2[iArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                notifydownloads.IconCompatParcelizer++;
                int i6 = $10 + 61;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
        char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
        notifydownloads.IconCompatParcelizer = 0;
        int i8 = $11 + 79;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
            int i10 = $11 + 105;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr2[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
            Object[] objArr6 = {notifydownloads, notifydownloads};
            Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1593953308);
            if (objRemoteActionCompatParcelizer5 == null) {
                objRemoteActionCompatParcelizer5 = startForeground.read((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 11439, (ViewConfiguration.getWindowTouchSlop() >> 8) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr6);
    }

    @Override // kotlin.zaaz, kotlin.zaay, kotlin.zabz, kotlin.zaO, kotlin.zabr, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 45;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr2 = new Object[1];
        u(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 42498, new char[]{22128, 61530, 6719, 41996, 52970, 26817, 45739, 56636, 26454, 33071, 11085, 30166, 40927, 14751, 16500, 59999, 13362, 24087}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        u(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 57963, new char[]{22140, 46109, 37550, 61735, 57249}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                v(new byte[]{-125, -127, -112, -124, -113, -114, -115, -117, -122, -116, -122, -117, -118, -119, -121, -120, -120, -127, -121, -125, -122, -123, -124, -125, -126, -127}, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 92, null, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                v(new byte[]{-126, -123, -122, -117, -127, -118, -122, -110, -120, -120, -119, -117, -126, -112, -124, -124, -111, -118}, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 92, null, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                int i4 = MediaBrowserCompatItemReceiver + 81;
                MediaMetadataCompat = i4 % 128;
                int i5 = i4 % 2;
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0') + 4536), MotionEvent.axisFromString("") + 6055, MotionEvent.axisFromString("") + 43, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    v(new byte[]{-112, -107, -102, -101, -109, -102, -103, -125, -98, -106, -118, -106, -112, -104, -99, -112, -108, -99, -100, -103, -127, -105, -107, -101, -102, -107, -112, -103, -108, -118, -112, -108, -109, -125, -107, -112, -102, -103, -104, -105, -106, -127, -125, -118, -107, -108, -109, -118}, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(0) + 90, null, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    v(new byte[]{-98, -103, -112, -109, -118, -112, -107, -101, -109, -105, -102, -100, -108, -109, -102, -108, -125, -100, -107, -125, -125, -106, -98, -101, -108, -103, -99, -107, -103, -106, -105, -108, -108, -99, -98, -102, -108, -100, -100, -106, -102, -105, -101, -104, -102, -127, -112, -127, -104, -125, -100, -108, -106, -125, -98, -109, -104, -98, -127, -98, -108, -118, -118, -108}, null, 126 - TextUtils.lastIndexOf("", '0', 0, 0), null, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    u(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 20396, new char[]{22131, 6639, 51694, 47384, 26908, 55592, 34984, 30848, 10253, 38962, 18482, 15301, 60317, 23539, 2855, 64340, 43737, 6863, 51965, 47741, 27151, 56795, 36328, 32186, 11584, 40259, 19827, 15613, 60550, 23636, 3170, 64568, 44997, 8159, 53080, 48953, 28524, 56991, 36504, 32510, 11896, 40452, 16770, 12772, 57830, 20800, 275, 61809, 41204, 4330, 49177, 45133, 24620, 54268, 33672, 29451, 9064, 37732, 17090, 12998, 58019, 21109, 517, 62936}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    v(new byte[]{-97, -117, -126, -112, -116, -112, -95, -99, -116, -95, -117, -97, -112, -94, -126, -122, -95, -122, -120, -127, -95, -92, -123, -118, -121, -112, -124, -127, -111, -93, -97, -125, -124, -127, -111, -94, -121, -117, -97, -127, -118, -117, -127, -112, -124, -113, -117, -121, -97, -125, -126, -111, -123, -124, -115, -110, -122, -127, -125, -95, -95, -96, -97, -120, -117, -117, -113}, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 92, null, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    v(new byte[]{-99, -121, -105, -100, -121, -102}, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 81, null, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    v(new byte[]{-104, -104, -127, -100, -107, -118, -112, -98, -99, -127, -98, -107, -91, -108, -99, -106, -102, -91, -98, -105, -104, -105, -91, -107, -101, -107, -101, -91, -100, -100, -99, -104, -98, -106, -100, -99}, null, ((byte) KeyEvent.getModifierMetaStateMask()) + 128, null, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 6030, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 24, 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr12);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer3 == null) {
            char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 13183);
            int i6 = 1649 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
            int mode = View.MeasureSpec.getMode(0) + 26;
            short s = $$p[5];
            Object[] objArr13 = new Object[1];
            w(s, (byte) (s | 40), r0[140], objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(cResolveOpacity, i6, mode, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            int i7 = MediaBrowserCompatItemReceiver + 81;
            MediaMetadataCompat = i7 % 128;
            if (i7 % 2 == 0) {
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 13183);
                    int i8 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1648;
                    int i9 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 26;
                    byte[] bArr = $$p;
                    Object[] objArr14 = new Object[1];
                    w(bArr[27], bArr[8], bArr[5], objArr14);
                    objRemoteActionCompatParcelizer4 = startForeground.read(cKeyCodeFromString, i8, i9, -1033747278, false, (String) objArr14[0], null);
                }
                obj.hashCode();
                throw null;
            }
            Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer5 == null) {
                char threadPriority = (char) (13183 - ((Process.getThreadPriority(0) + 20) >> 6));
                int mirror = 1697 - AndroidCharacter.getMirror('0');
                int iResolveOpacity = 26 - Drawable.resolveOpacity(0, 0);
                byte[] bArr2 = $$p;
                Object[] objArr15 = new Object[1];
                w(bArr2[27], bArr2[8], bArr2[5], objArr15);
                objRemoteActionCompatParcelizer5 = startForeground.read(threadPriority, mirror, iResolveOpacity, -1033747278, false, (String) objArr15[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer5).get(null);
        } else {
            Object[] objArr16 = new Object[1];
            u((ViewConfiguration.getKeyRepeatDelay() >> 16) + 38543, new char[]{22139, 49407, 31609, 38365, 3075, 42678, 53546, 19350, 57870, 7480, 47060, 11853, 22742, 62246, 28070, 33821}, objArr16);
            Class<?> cls3 = Class.forName((String) objArr16[0]);
            Object[] objArr17 = new Object[1];
            u((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 2458, new char[]{22136, 24558, 17730, 19118, 28681, 26239, 28615, 5461, 6785, 3, 13932, 16336, 9494, 10913, 53263, 50785}, objArr17);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr17[0], Object.class).invoke(null, this)).intValue();
            int i10 = MediaBrowserCompatItemReceiver + 99;
            MediaMetadataCompat = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr18 = {Integer.valueOf(iIntValue2), 0, -1074877061};
                byte[] bArr3 = $$H;
                byte b = (byte) (bArr3[75] - 1);
                Object[] objArr19 = new Object[1];
                x(b, b, bArr3[83], objArr19);
                Class<?> cls4 = Class.forName((String) objArr19[0]);
                Object[] objArr20 = new Object[1];
                x(bArr3[75], (byte) 38, (byte) (-bArr3[21]), objArr20);
                objArr = (Object[]) cls4.getMethod((String) objArr20[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr18);
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer6 == null) {
                    char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 13183);
                    int maximumDrawingCacheSize = 1649 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int i12 = 27 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                    byte[] bArr4 = $$p;
                    Object[] objArr21 = new Object[1];
                    w(bArr4[27], bArr4[8], bArr4[5], objArr21);
                    objRemoteActionCompatParcelizer6 = startForeground.read(cCombineMeasuredStates, maximumDrawingCacheSize, i12, -1033747278, false, (String) objArr21[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer6).set(null, objArr);
                try {
                    Object[] objArr22 = new Object[1];
                    u(Process.getGidForName("") + 37988, new char[]{22128, 49692, 32435, 60234, 2034, 45975, 11303, 22666, 62822, 24857, 40417, 13827, 41676, 57189, 19215, 59321, 4172, 36033, 14475, 21799, 49614, 31333}, objArr22);
                    Class<?> cls5 = Class.forName((String) objArr22[0]);
                    Object[] objArr23 = new Object[1];
                    u((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 26140, new char[]{22132, 12384, 39498, 25654, 52758, 43237, 13019, 40072, 26268, 49525, 43871, 13658, 40740, 30981, 50146}, objArr23);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr23[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 13183);
                        int deadChar = 1649 - KeyEvent.getDeadChar(0, 0);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 27;
                        byte[] bArr5 = $$p;
                        Object[] objArr24 = new Object[1];
                        w((short) 76, bArr5[8], bArr5[5], objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(absoluteGravity, deadChar, iLastIndexOf, 54351865, false, (String) objArr24[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer8 == null) {
                        char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 13183);
                        int iAxisFromString = 1648 - MotionEvent.axisFromString("");
                        int modifierMetaStateMask = 25 - ((byte) KeyEvent.getModifierMetaStateMask());
                        short s2 = $$p[5];
                        Object[] objArr25 = new Object[1];
                        w(s2, (byte) (s2 | 40), r6[140], objArr25);
                        objRemoteActionCompatParcelizer8 = startForeground.read(scrollDefaultDelay, iAxisFromString, modifierMetaStateMask, -133433128, false, (String) objArr25[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer8).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i13 = ((int[]) objArr[3])[0];
        int i14 = ((int[]) objArr[2])[0];
        if (i14 != i13) {
            long j = -1;
            long j2 = ((long) (i14 ^ i13)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer9 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer9 == null) {
                objRemoteActionCompatParcelizer9 = startForeground.read((char) (KeyEvent.getDeadChar(0, 0) + 4535), 6054 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer9).invoke(null, null);
            try {
                Object[] objArr26 = {211754148, Long.valueOf(j4), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getLongPressTimeout() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 6030, 24 - (KeyEvent.getMaxKeyCode() >> 16));
                Object[] objArr27 = new Object[1];
                x((byte) (-$$H[35]), r6[31], r6[25], objArr27);
                cls6.getMethod((String) objArr27[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr26);
                int i15 = MediaBrowserCompatItemReceiver + 11;
                MediaMetadataCompat = i15 % 128;
                int i16 = i15 % 2;
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        CmcdConfigurationRequestConfig.write(this, null, 0, 0, false, 15);
        super.onCreate(p0);
        write((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 1948621582, shouldConsumePacketPayload.write(), new Object[]{this}, moveToLast.AnonymousClass7.IconCompatParcelizer(), 1595774818, -1595774818, shouldConsumePacketPayload.write());
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        zadb zadbVar = (zadb) objArr[0];
        int i = 2 % 2;
        Object obj = null;
        CmcdConfigurationRequestConfig.RemoteActionCompatParcelizer(zadbVar, zadbVar.new IconCompatParcelizer(null));
        int i2 = MediaMetadataCompat + 21;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.zaaz, kotlin.zaay, kotlin.zabz, kotlin.zaO, kotlin.zabr, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 105;
        MediaBrowserCompatItemReceiver = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getBaseContext();
            obj.hashCode();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i3 = MediaBrowserCompatItemReceiver + 45;
            MediaMetadataCompat = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            v(new byte[]{-125, -127, -112, -124, -113, -114, -115, -117, -122, -116, -122, -117, -118, -119, -121, -120, -120, -127, -121, -125, -122, -123, -124, -125, -126, -127}, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 92, null, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            v(new byte[]{-126, -123, -122, -117, -127, -118, -122, -110, -120, -120, -119, -117, -126, -112, -124, -124, -111, -118}, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 92, null, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i5 = MediaBrowserCompatItemReceiver + 81;
            MediaMetadataCompat = i5 % 128;
            int i6 = i5 % 2;
            baseContext = (((baseContext instanceof ContextWrapper) ^ true) || ((ContextWrapper) baseContext).getBaseContext() != null) ? baseContext.getApplicationContext() : null;
        }
        if (baseContext != null) {
            int i7 = MediaMetadataCompat + 27;
            MediaBrowserCompatItemReceiver = i7 % 128;
            try {
                if (i7 % 2 != 0) {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (Process.myTid() >> 22)), 6053 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 6030 - KeyEvent.normalizeMetaState(0), 24 - View.MeasureSpec.getSize(0), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                    int i8 = 71 / 0;
                } else {
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (TextUtils.indexOf("", "", 0, 0) + 4535), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6053, 42 - Color.alpha(0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                    Object[] objArr4 = {baseContext};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(823471051);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 6031 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 24 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(objInvoke2, objArr4);
                }
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object AudioAttributesCompatParcelizer(java.lang.Object[] r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zadb.AudioAttributesCompatParcelizer(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(30:(28:38|272|39|(3:41|42|(2:44|46)(1:45))(1:46)|82|281|83|(1:85)|86|87|(4:89|90|(1:92)|93)(19:94|95|273|96|(1:98)|99|100|288|101|(1:103)|104|105|106|(1:108)|109|(1:111)|112|(1:114)|115)|116|(6:121|122|(12:124|(5:126|(1:128)(1:129)|296|(3:132|133|130)|295)|134|279|135|(1:137)|138|139|140|270|141|294)(1:293)|154|117|118)|292|177|(1:179)|180|(3:182|(1:184)|185)(13:187|286|188|189|(1:191)|192|265|193|194|(1:196)|197|(1:199)|200)|186|201|(6:203|204|(1:206)|207|208|209)|210|(1:212)|213|(3:215|(1:217)|218)(14:220|221|(1:223)|224|225|(1:227)|228|277|229|230|(1:232)|233|(1:235)|236)|219|237|(7:239|240|(1:242)|243|244|245|246)(1:297))|290|55|(1:57)|58|59|82|281|83|(0)|86|87|(0)(0)|116|(2:117|118)|292|177|(0)|180|(0)(0)|186|201|(0)|210|(0)|213|(0)(0)|219|237|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x09ac, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x09ad, code lost:
    
        r6 = new java.lang.Object[1];
        v(new byte[]{-108, -104, -102, -99, -98, -104, -102, -105, -102, -99, -105}, null, 127 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), null, r6);
        r4 = (java.lang.String) r6[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x09ca, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r5 = new java.io.PrintStream(r2);
        r0.printStackTrace(r5);
        r5.close();
        r1 = r2.toString(org.apache.commons.compress.utils.CharsetNames.UTF_8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x09e1, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x09e5, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x09f4, code lost:
    
        r1 = kotlin.startForeground.RemoteActionCompatParcelizer(-1407079962);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x09f8, code lost:
    
        if (r1 == null) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x09fa, code lost:
    
        r1 = kotlin.startForeground.read((char) (4535 - (android.view.KeyEvent.getMaxKeyCode() >> 16)), 6055 - (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)), android.text.TextUtils.lastIndexOf("", '0', 0) + 43, -764908173, false, "IconCompatParcelizer", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0a2a, code lost:
    
        r1 = ((java.lang.reflect.Method) r1).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0a36, code lost:
    
        r6 = new java.lang.Object[]{2095007487, 81604378625L, r2, com.marrow.TrainingApplication.RemoteActionCompatParcelizer(), false};
        r2 = (java.lang.Class) kotlin.startForeground.IconCompatParcelizer((char) android.view.View.resolveSize(0, 0), android.view.View.resolveSizeAndState(0, 0, 0) + 6030, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 24);
        r10 = new java.lang.Object[1];
        x((byte) (-kotlin.zadb.$$H[35]), r4[31], r4[25], r10);
        r2.getMethod((java.lang.String) r10[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r1, r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x084f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0abe  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0b0e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0b65  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0dab  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0e94  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0ee1  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0f32  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x116c  */
    /* JADX WARN: Removed duplicated region for block: B:297:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x04b2 A[Catch: all -> 0x09ac, TryCatch #9 {all -> 0x09ac, blocks: (B:83:0x04ac, B:85:0x04b2, B:86:0x04f8, B:90:0x0511, B:92:0x0517, B:93:0x0561, B:116:0x0842, B:117:0x0846, B:122:0x0859, B:124:0x086f, B:130:0x0889, B:132:0x088c, B:139:0x08f9, B:145:0x0983, B:147:0x0989, B:148:0x098a, B:150:0x098c, B:152:0x0993, B:153:0x0994, B:94:0x056b, B:106:0x06c8, B:108:0x06ce, B:109:0x0715, B:111:0x0797, B:112:0x07de, B:114:0x07f4, B:115:0x083c, B:156:0x0999, B:158:0x09a0, B:159:0x09a1, B:161:0x09a3, B:163:0x09aa, B:164:0x09ab, B:141:0x0908, B:96:0x05f8, B:98:0x060c, B:99:0x063c, B:135:0x08bb, B:137:0x08c1, B:138:0x08f2, B:101:0x0643, B:103:0x0657, B:104:0x06bd), top: B:281:0x04ac, outer: #1, inners: #3, #5, #8, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x056b A[Catch: all -> 0x09ac, TRY_LEAVE, TryCatch #9 {all -> 0x09ac, blocks: (B:83:0x04ac, B:85:0x04b2, B:86:0x04f8, B:90:0x0511, B:92:0x0517, B:93:0x0561, B:116:0x0842, B:117:0x0846, B:122:0x0859, B:124:0x086f, B:130:0x0889, B:132:0x088c, B:139:0x08f9, B:145:0x0983, B:147:0x0989, B:148:0x098a, B:150:0x098c, B:152:0x0993, B:153:0x0994, B:94:0x056b, B:106:0x06c8, B:108:0x06ce, B:109:0x0715, B:111:0x0797, B:112:0x07de, B:114:0x07f4, B:115:0x083c, B:156:0x0999, B:158:0x09a0, B:159:0x09a1, B:161:0x09a3, B:163:0x09aa, B:164:0x09ab, B:141:0x0908, B:96:0x05f8, B:98:0x060c, B:99:0x063c, B:135:0x08bb, B:137:0x08c1, B:138:0x08f2, B:101:0x0643, B:103:0x0657, B:104:0x06bd), top: B:281:0x04ac, outer: #1, inners: #3, #5, #8, #13 }] */
    @Override // kotlin.zaaz, kotlin.zaay, kotlin.zabz, kotlin.zaO, kotlin.zabr, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zadb.attachBaseContext(android.content.Context):void");
    }

    static {
        AudioAttributesImplApi21Parcelizer = 1;
        RatingCompat();
        INSTANCE = new Companion(null);
        int i = MediaBrowserCompatCustomActionResultReceiver + 37;
        AudioAttributesImplApi21Parcelizer = i % 128;
        int i2 = i % 2;
    }

    @getMagicModuleMeta
    public static final Intent RemoteActionCompatParcelizer(Context context) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 31;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        Intent intentWrite = Companion.write(context);
        int i4 = MediaMetadataCompat + 107;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return intentWrite;
        }
        throw null;
    }

    @getMagicModuleMeta
    public static final Intent RemoteActionCompatParcelizer(Context context, onDataRangeRemoved ondatarangeremoved) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 13;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            Companion.AudioAttributesCompatParcelizer(context, ondatarangeremoved);
            throw null;
        }
        Intent intentAudioAttributesCompatParcelizer = Companion.AudioAttributesCompatParcelizer(context, ondatarangeremoved);
        int i3 = MediaBrowserCompatItemReceiver + 29;
        MediaMetadataCompat = i3 % 128;
        if (i3 % 2 != 0) {
            return intentAudioAttributesCompatParcelizer;
        }
        throw null;
    }

    private final void MediaDescriptionCompat() {
        write((-1948621582) + (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)), shouldConsumePacketPayload.write(), new Object[]{this}, moveToLast.AnonymousClass7.IconCompatParcelizer(), 1595774818, -1595774818, shouldConsumePacketPayload.write());
    }

    @Override // kotlin.zaaz, kotlin.zaay, kotlin.zabz, kotlin.zaO, kotlin.zabr, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 73;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            int i4 = 76 / 0;
        }
        int i5 = MediaMetadataCompat + 107;
        MediaBrowserCompatItemReceiver = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.zaaz, kotlin.zaay, kotlin.zabz, kotlin.zaO, kotlin.zabr, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onPause() {
        write(moveToLast.AnonymousClass7.IconCompatParcelizer(), shouldConsumePacketPayload.write(), new Object[]{this}, moveToLast.AnonymousClass7.IconCompatParcelizer(), -2092402003, 2092402004, moveToLast.AnonymousClass7.IconCompatParcelizer());
    }

    static void RatingCompat() {
        IconCompatParcelizer = 1105720227774645722L;
        write = new char[]{28325, 28342, 28320, 28338, 28343, 28349, 28406, 28340, 28293, 28323, 28336, 28238, 28237, 28304, 28348, 28321, 28337, 28344, 28401, 28404, 28350, 28322, 28400, 28302, 28403, 28301, 28300, 28405, 28402, 28303, 28339, 28298, 28407, 28351, 28341, 28345, 28409};
        AudioAttributesCompatParcelizer = 411397828;
        AudioAttributesImplBaseParcelizer = true;
        AudioAttributesImplApi26Parcelizer = true;
    }
}
