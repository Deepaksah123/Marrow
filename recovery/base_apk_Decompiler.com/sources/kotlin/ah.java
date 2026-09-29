package kotlin;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow2.ui.video.lesson_list.VideoLessonListActivityViewModel;
import java.lang.reflect.Method;
import kotlin.FirebaseSessionsRegistrar;
import kotlin.Metadata;
import kotlin.ReviewInfo;
import kotlin.VisibilityChecker;
import kotlin.am;
import kotlin.z;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lo/ah;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/marrow2/ui/video/lesson_list/VideoLessonListActivityViewModel;", "AudioAttributesCompatParcelizer", "Lo/RenewEligible;", "AudioAttributesImplBaseParcelizer", "()Lcom/marrow2/ui/video/lesson_list/VideoLessonListActivityViewModel;", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ah extends setRequestHash {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int RemoteActionCompatParcelizer;
    private static int[] read;
    private static long write;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible IconCompatParcelizer;
    private static final byte[] $$l = {64, TarConstants.LF_GNUTYPE_LONGLINK, 61, -128};
    private static final int $$m = 112;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {123, -91, -44, 22, -61, 61, 2, 19, -34, 27, 19, 7, -4, 7, -3, -19, 41, -5, -7, -27, TarConstants.LF_NORMAL, 1, 2, -38, TarConstants.LF_NORMAL, 3, 4, -5, 2, 21, -7, 17, -9, 15, 9, -40, 24, 17, -9, 10, 2, 17, -1, -5, 15, -11, 23, 12, 6, 9, -11, -32, 38, 21, -7, 10, 3, -39, TarConstants.LF_NORMAL, 2, 7, -11, 23, -32, 21, 21, -11, 6, 11, 1, 21, -17, 17, -61, 61, 2, 19, -30, 19, 23, -7, 9, -3, -9, 0, 7};
    private static final int $$k = 21;
    private static final byte[] $$d = {3, -120, 17, 23, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$e = 247;
    private static int AudioAttributesImplApi26Parcelizer = 0;
    private static int MediaBrowserCompatItemReceiver = 1;
    private static int AudioAttributesImplBaseParcelizer = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(byte r6, byte r7, byte r8) {
        /*
            int r8 = r8 * 4
            int r8 = 4 - r8
            int r7 = r7 * 4
            int r0 = 1 - r7
            int r6 = r6 * 2
            int r6 = r6 + 119
            byte[] r1 = kotlin.ah.$$l
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L19
            r4 = r7
            r6 = r8
            r3 = r2
            goto L2c
        L19:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1d:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L28:
            int r3 = r3 + 1
            r4 = r1[r6]
        L2c:
            int r8 = r8 + r4
            int r6 = r6 + 1
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ah.$$n(byte, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(short r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = kotlin.ah.$$d
            int r8 = r8 + 65
            int r7 = r7 + 4
            int r9 = 44 - r9
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L11
            r8 = r7
            r3 = r9
            r5 = r2
            goto L29
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            int r7 = r7 + 1
            if (r5 != r9) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L29:
            int r3 = r3 + r7
            int r7 = r3 + (-1)
            r3 = r5
            r6 = r8
            r8 = r7
            r7 = r6
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ah.g(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = 83 - r6
            byte[] r0 = kotlin.ah.$$j
            int r8 = 119 - r8
            int r1 = 39 - r7
            byte[] r1 = new byte[r1]
            int r7 = 38 - r7
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r6
            goto L28
        L13:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r8]
        L28:
            int r6 = r6 + r3
            int r6 = r6 + (-4)
            int r8 = r8 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ah.h(byte, int, int, java.lang.Object[]):void");
    }

    public ah() {
        ah ahVar = this;
        this.IconCompatParcelizer = new VirtualAnnotatedMember(toMagicModuleMetaDataUcModel.write(VideoLessonListActivityViewModel.class), new AnonymousClass2(ahVar), new AnonymousClass3(ahVar), new AnonymousClass5(ahVar));
    }

    public static final /* synthetic */ VideoLessonListActivityViewModel RemoteActionCompatParcelizer(ah ahVar) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 41;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        VideoLessonListActivityViewModel videoLessonListActivityViewModelAudioAttributesImplBaseParcelizer = ahVar.AudioAttributesImplBaseParcelizer();
        int i4 = AudioAttributesImplApi26Parcelizer + 29;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            return videoLessonListActivityViewModelAudioAttributesImplBaseParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final VideoLessonListActivityViewModel AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 33;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        VideoLessonListActivityViewModel videoLessonListActivityViewModel = (VideoLessonListActivityViewModel) this.IconCompatParcelizer.RemoteActionCompatParcelizer();
        int i4 = MediaBrowserCompatItemReceiver + 9;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
        return videoLessonListActivityViewModel;
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ toAttestationRequestBody RemoteActionCompatParcelizer;
        private /* synthetic */ Bundle read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                NewNumberOtpResendRequest<z> newNumberOtpResendRequestAudioAttributesCompatParcelizer = ah.RemoteActionCompatParcelizer(ah.this).AudioAttributesCompatParcelizer();
                final Bundle bundle = this.read;
                final ah ahVar = ah.this;
                final toAttestationRequestBody toattestationrequestbody = this.RemoteActionCompatParcelizer;
                this.AudioAttributesCompatParcelizer = 1;
                if (newNumberOtpResendRequestAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.ah.read.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((z) obj2);
                    }

                    private Object read(z zVar) {
                        if (zVar instanceof z.AudioAttributesCompatParcelizer) {
                            if (bundle == null) {
                                ah ahVar2 = ahVar;
                                FirebaseSessionsRegistrar.Companion audioAttributesCompatParcelizer = FirebaseSessionsRegistrar.INSTANCE;
                                CmcdConfigurationRequestConfig.write(ahVar2, R.id.container, FirebaseSessionsRegistrar.Companion.write(new toAttestationRequestBody(toattestationrequestbody.getRemoteActionCompatParcelizer(), ((z.AudioAttributesCompatParcelizer) zVar).write())));
                            }
                        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(zVar, z.write.INSTANCE)) {
                            ReviewInfo.Companion companion = ReviewInfo.INSTANCE;
                            Intent intent = ahVar.getIntent();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(intent, "");
                            ReviewInfo reviewInfoAudioAttributesCompatParcelizer = ReviewInfo.Companion.AudioAttributesCompatParcelizer(intent);
                            if (reviewInfoAudioAttributesCompatParcelizer != null) {
                                Bundle bundle2 = bundle;
                                ah ahVar3 = ahVar;
                                if (bundle2 == null) {
                                    am.Companion remoteActionCompatParcelizer = am.INSTANCE;
                                    CmcdConfigurationRequestConfig.write(ahVar3, R.id.container, am.Companion.AudioAttributesCompatParcelizer(reviewInfoAudioAttributesCompatParcelizer));
                                }
                            }
                        } else if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(zVar, z.read.INSTANCE)) {
                            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(zVar, z.RemoteActionCompatParcelizer.INSTANCE)) {
                                throw new RenewEligibleCreator();
                            }
                            ahVar.finish();
                        }
                        return getShowPopup.INSTANCE;
                    }
                }, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(Bundle bundle, toAttestationRequestBody toattestationrequestbody, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.read = bundle;
            this.RemoteActionCompatParcelizer = toattestationrequestbody;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return ah.this.new read(this.read, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.ah$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/ah$IconCompatParcelizer;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lo/ReviewInfo;", "p1", "Landroid/content/Intent;", "read", "(Landroid/content/Context;Lo/ReviewInfo;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Intent read(Context p0, ReviewInfo p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            Intent intent = new Intent(p0, (Class<?>) ah.class);
            p1.AudioAttributesCompatParcelizer(intent);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void f(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadChanged notifydownloadchanged = new notifyDownloadChanged();
        notifydownloadchanged.read = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i3 = $10 + 43;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = notifydownloadchanged.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1435583294);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 1;
                    byte b2 = (byte) (b - 1);
                    objRemoteActionCompatParcelizer = startForeground.read((char) (38461 - (ViewConfiguration.getPressedStateDuration() >> 16)), 532 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) + 8, -735610793, false, $$n(b, b2, b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() ^ (write ^ 2192498202983240651L);
                Object[] objArr3 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (36621 - KeyEvent.getDeadChar(0, 0)), 2340 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 28, 188119637, false, $$n(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                int i6 = $11 + 39;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 2 / 4;
                }
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
            cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
            Object[] objArr4 = {notifydownloadchanged, notifydownloadchanged};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1971306176);
            if (objRemoteActionCompatParcelizer3 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objRemoteActionCompatParcelizer3 = startForeground.read((char) (36621 - KeyEvent.getDeadChar(0, 0)), 2340 - ExpandableListView.getPackedPositionGroup(0L), 28 - (ViewConfiguration.getTouchSlop() >> 8), 188119637, false, $$n(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX INFO: renamed from: o.ah$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "AudioAttributesCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ MediaBrowserCompatMediaItem $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            return this.$read.getDefaultViewModelProviderFactory();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$read = mediaBrowserCompatMediaItem;
        }
    }

    /* JADX INFO: renamed from: o.ah$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "read", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ MediaBrowserCompatMediaItem $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return this.$IconCompatParcelizer.getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$IconCompatParcelizer = mediaBrowserCompatMediaItem;
        }
    }

    /* JADX INFO: renamed from: o.ah$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "write", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $AudioAttributesCompatParcelizer = null;
        private /* synthetic */ MediaBrowserCompatMediaItem $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            return this.$RemoteActionCompatParcelizer.getDefaultViewModelCreationExtras();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$RemoteActionCompatParcelizer = mediaBrowserCompatMediaItem;
        }
    }

    private static void e(int i, int[] iArr, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int length2;
        int[] iArr3;
        int i2;
        int i3 = 2 % 2;
        buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr4 = read;
        int i4 = -470782045;
        int i5 = 43695;
        int i6 = 16;
        if (iArr4 != null) {
            int i7 = $11 + 15;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                length2 = iArr4.length;
                iArr3 = new int[length2];
                i2 = 1;
            } else {
                length2 = iArr4.length;
                iArr3 = new int[length2];
                i2 = 0;
            }
            while (i2 < length2) {
                int i8 = $11 + 45;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr4[i2])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-470782045);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getScrollBarFadeDuration() >> i6) + i5), ExpandableListView.getPackedPositionGroup(0L) + 23297, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 15, -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr3[i2] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                    i2++;
                    i5 = 43695;
                    i6 = 16;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr4 = iArr3;
        }
        int length3 = iArr4.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = read;
        if (iArr6 != null) {
            int i10 = $11 + 29;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i11 = 0;
            while (i11 < length) {
                try {
                    Object[] objArr3 = {Integer.valueOf(iArr6[i11])};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(i4);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (43695 - Color.argb(0, 0, 0, 0)), Color.argb(0, 0, 0, 0) + 23297, (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 14, -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr2[i11] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                    i11++;
                    i4 = -470782045;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        buildremovealldownloadsintent.RemoteActionCompatParcelizer = 0;
        while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
            int i12 = $10 + 95;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            cArr[0] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
            cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
            cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
            cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
            buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
            buildRemoveAllDownloadsIntent.read(iArr5);
            int i14 = 0;
            for (int i15 = 16; i14 < i15; i15 = 16) {
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr5[i14];
                Object[] objArr4 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (43695 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 23297, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 15, -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                buildremovealldownloadsintent.read = iIntValue;
                i14++;
            }
            int i16 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
            buildremovealldownloadsintent.read = i16;
            buildremovealldownloadsintent.read ^= iArr5[16];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr5[17];
            int i17 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            int i18 = buildremovealldownloadsintent.read;
            cArr[0] = (char) (buildremovealldownloadsintent.AudioAttributesCompatParcelizer >>> 16);
            cArr[1] = (char) buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            cArr[2] = (char) (buildremovealldownloadsintent.read >>> 16);
            cArr[3] = (char) buildremovealldownloadsintent.read;
            buildRemoveAllDownloadsIntent.read(iArr5);
            cArr2[buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2] = cArr[0];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 1] = cArr[1];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 2] = cArr[2];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 3] = cArr[3];
            Object[] objArr5 = {buildremovealldownloadsintent, buildremovealldownloadsintent};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(516305436);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (48194 - Color.blue(0)), (-16757090) - Color.rgb(0, 0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 20, 1620047497, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00ba  */
    @Override // kotlin.setRequestHash, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ah.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0098  */
    @Override // kotlin.setRequestHash, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ah.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // kotlin.setRequestHash, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ah.onPause():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0a20 A[Catch: all -> 0x02c8, TryCatch #6 {all -> 0x02c8, blocks: (B:179:0x0a1a, B:181:0x0a20, B:182:0x0a51, B:212:0x0e37, B:214:0x0e3d, B:215:0x0e6e, B:255:0x12b7, B:257:0x12bd, B:258:0x12e5, B:236:0x109e, B:238:0x10c1, B:239:0x1112, B:70:0x0418, B:72:0x041e, B:73:0x044e, B:21:0x00ef, B:23:0x00f5, B:24:0x011c, B:26:0x0237, B:28:0x0268, B:29:0x02c2, B:35:0x02d8, B:37:0x02dd, B:41:0x02f3, B:56:0x03c3, B:58:0x03c9, B:59:0x03ca, B:61:0x03cc, B:63:0x03d3, B:64:0x03d4), top: B:291:0x00ef, inners: #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00c1  */
    @Override // kotlin.setRequestHash, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ah.attachBaseContext(android.content.Context):void");
    }

    static {
        RemoteActionCompatParcelizer = 0;
        AudioAttributesImplApi21Parcelizer();
        INSTANCE = new Companion(null);
        int i = AudioAttributesImplBaseParcelizer + 125;
        RemoteActionCompatParcelizer = i % 128;
        int i2 = i % 2;
    }

    @Override // kotlin.setRequestHash, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 39;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = AudioAttributesImplApi26Parcelizer + 5;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
    }

    static void AudioAttributesImplApi21Parcelizer() {
        read = new int[]{-1175036064, 1551002352, -883720035, -1925825174, -1926187607, 1628866404, 739664222, -1140634327, -480726627, 1170767801, -1669631699, 1141611672, 539965390, -434217996, -569344218, -197877814, 463005488, -929501722};
        write = 6603096599683919191L;
    }
}
