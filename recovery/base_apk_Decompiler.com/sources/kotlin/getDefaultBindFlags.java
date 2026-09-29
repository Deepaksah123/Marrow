package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow2.ui.notespurchase.NotesPurchaseActivityViewModel;
import java.lang.reflect.Method;
import kotlin.GmsClient;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin.shouldEscapeCharacter;
import kotlin.validateScopes;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u0019\u0010\r\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0014R\u001b\u0010\u0019\u001a\u00020\u00158CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\r\u001a\u00020\u001a8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lo/getDefaultBindFlags;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatMediaItem", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/Float;)V", "", "p1", "p2", "IconCompatParcelizer", "(ZZZ)V", "()Z", "Lcom/marrow2/ui/notespurchase/NotesPurchaseActivityViewModel;", "Lo/RenewEligible;", "AudioAttributesImplApi21Parcelizer", "()Lcom/marrow2/ui/notespurchase/NotesPurchaseActivityViewModel;", "RemoteActionCompatParcelizer", "Lo/parseProgramInformation;", "Lo/parseProgramInformation;", "", "write", "Ljava/lang/Integer;", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getDefaultBindFlags extends shouldDowngrade {
    private static int AudioAttributesImplApi21Parcelizer;
    private static char AudioAttributesImplApi26Parcelizer;
    private static long IconCompatParcelizer;
    private static int MediaBrowserCompatCustomActionResultReceiver;
    private static int MediaMetadataCompat;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private parseProgramInformation AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private Integer IconCompatParcelizer;
    private static final byte[] $$l = {91, -41, -108, -7};
    private static final int $$m = 132;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {85, -29, -43, -21, 64, -58, 1, -16, 31, -28, -6, 18, -12, 41, -52, 14, -1, 0, -14, 12, 0, 31, -50, 2, 16, -20, 10, -7, 0, 24, -31, 78, -30, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 64, -77, -1, 21, -13, 4, 8, -12, 14};
    private static final int $$k = 170;
    private static final byte[] $$d = {10, TarConstants.LF_PAX_EXTENDED_HEADER_LC, 13, 109, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 224;
    private static int MediaDescriptionCompat = 1;
    private static int MediaBrowserCompatItemReceiver = 0;
    private static int AudioAttributesImplBaseParcelizer = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(byte r5, byte r6, byte r7) {
        /*
            int r6 = r6 * 2
            int r0 = 1 - r6
            int r5 = r5 * 4
            int r5 = r5 + 103
            byte[] r1 = kotlin.getDefaultBindFlags.$$l
            int r7 = r7 * 2
            int r7 = 3 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L19
            r3 = r5
            r5 = r6
            r4 = r2
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L27:
            int r7 = r7 + 1
            r3 = r1[r7]
        L2b:
            int r5 = r5 + r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getDefaultBindFlags.$$n(byte, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r0 = r8 + 4
            int r7 = r7 + 65
            byte[] r1 = kotlin.getDefaultBindFlags.$$d
            byte[] r0 = new byte[r0]
            int r8 = r8 + 3
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L28
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L20:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L28:
            int r6 = r6 + 1
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-1)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getDefaultBindFlags.g(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(byte r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = 119 - r6
            byte[] r0 = kotlin.getDefaultBindFlags.$$j
            int r1 = r5 + 4
            int r7 = 98 - r7
            byte[] r1 = new byte[r1]
            int r5 = r5 + 3
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            r3 = r0[r7]
        L24:
            int r7 = r7 + 1
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-1)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getDefaultBindFlags.h(byte, int, short, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object read(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i5;
        int i8 = ~((~i3) | i7);
        int i9 = ~(i2 | i7);
        int i10 = i8 | i9;
        int i11 = i9 | i3;
        int i12 = ~(i7 | i3);
        int i13 = i5 + i3 + i4 + (1577873432 * i) + (977123338 * i6);
        int i14 = i13 * i13;
        int i15 = (((-1026819430) * i5) - 865599488) + ((-647756440) * i3) + (i10 * 189531495) + ((-189531495) * i11) + (189531495 * i12) + ((-837287936) * i4) + ((-767557632) * i) + (1290797056 * i6) + ((-539361280) * i14);
        int i16 = (i5 * (-1177406726)) + 1326046462 + (i3 * (-1177405720)) + (i10 * 503) + (i11 * (-503)) + (i12 * 503) + (i4 * (-1177406223)) + (i * 1546282648) + (i6 * (-1884272278)) + (i14 * 70909952);
        int i17 = i15 + (i16 * i16 * 451280896);
        return i17 != 1 ? i17 != 2 ? AudioAttributesCompatParcelizer(objArr) : write(objArr) : IconCompatParcelizer(objArr);
    }

    public getDefaultBindFlags() {
        getDefaultBindFlags getdefaultbindflags = this;
        this.RemoteActionCompatParcelizer = new VirtualAnnotatedMember(toMagicModuleMetaDataUcModel.write(NotesPurchaseActivityViewModel.class), new AnonymousClass2(getdefaultbindflags), new AnonymousClass1(getdefaultbindflags), new AnonymousClass5(getdefaultbindflags));
    }

    public static final /* synthetic */ void IconCompatParcelizer(getDefaultBindFlags getdefaultbindflags, boolean z, boolean z2, boolean z3) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 109;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        getdefaultbindflags.IconCompatParcelizer(z, z2, z3);
        if (i3 != 0) {
            throw null;
        }
        int i4 = AudioAttributesImplBaseParcelizer + 71;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ NotesPurchaseActivityViewModel read(getDefaultBindFlags getdefaultbindflags) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 57;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        NotesPurchaseActivityViewModel notesPurchaseActivityViewModelAudioAttributesImplApi21Parcelizer = getdefaultbindflags.AudioAttributesImplApi21Parcelizer();
        int i4 = MediaBrowserCompatItemReceiver + 83;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
        return notesPurchaseActivityViewModelAudioAttributesImplApi21Parcelizer;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        getDefaultBindFlags getdefaultbindflags = (getDefaultBindFlags) objArr[0];
        Float f = (Float) objArr[1];
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 119;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        getdefaultbindflags.AudioAttributesCompatParcelizer(f);
        int i4 = MediaBrowserCompatItemReceiver + 27;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private final NotesPurchaseActivityViewModel AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 123;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        NotesPurchaseActivityViewModel notesPurchaseActivityViewModel = (NotesPurchaseActivityViewModel) this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        if (i3 == 0) {
            return notesPurchaseActivityViewModel;
        }
        throw null;
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<GmsClient> setupdatedstatusAudioAttributesCompatParcelizer = getDefaultBindFlags.read(getDefaultBindFlags.this).AudioAttributesCompatParcelizer();
                final getDefaultBindFlags getdefaultbindflags = getDefaultBindFlags.this;
                this.write = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.getDefaultBindFlags.IconCompatParcelizer.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((GmsClient) obj2);
                    }

                    private Object read(GmsClient gmsClient) {
                        if (gmsClient instanceof GmsClient.write) {
                            getDefaultBindFlags.IconCompatParcelizer(getdefaultbindflags, false, true, false);
                        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(gmsClient, GmsClient.AudioAttributesCompatParcelizer.INSTANCE)) {
                            getDefaultBindFlags.IconCompatParcelizer(getdefaultbindflags, true, false, false);
                        } else {
                            if (!(gmsClient instanceof GmsClient.read)) {
                                throw new RenewEligibleCreator();
                            }
                            getDefaultBindFlags.IconCompatParcelizer(getdefaultbindflags, false, false, true);
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
            throw new PlanDetailsCreator();
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getDefaultBindFlags.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.getDefaultBindFlags$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "write", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ MediaBrowserCompatMediaItem $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            return this.$AudioAttributesCompatParcelizer.getDefaultViewModelProviderFactory();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$AudioAttributesCompatParcelizer = mediaBrowserCompatMediaItem;
        }
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<setDefaultBindExecutor> setupdatedstatusIconCompatParcelizer = getDefaultBindFlags.read(getDefaultBindFlags.this).IconCompatParcelizer();
                final getDefaultBindFlags getdefaultbindflags = getDefaultBindFlags.this;
                this.read = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.getDefaultBindFlags.write.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((setDefaultBindExecutor) obj2);
                    }

                    private Object write(setDefaultBindExecutor setdefaultbindexecutor) {
                        ActionBar actionBarAs_ = getdefaultbindflags.as_();
                        if (actionBarAs_ != null) {
                            actionBarAs_.write(setdefaultbindexecutor.getRead());
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
            throw new PlanDetailsCreator();
        }

        write(SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getDefaultBindFlags.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.getDefaultBindFlags$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "write", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ MediaBrowserCompatMediaItem $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return this.$AudioAttributesCompatParcelizer.getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$AudioAttributesCompatParcelizer = mediaBrowserCompatMediaItem;
        }
    }

    /* JADX INFO: renamed from: o.getDefaultBindFlags$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "IconCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ MediaBrowserCompatMediaItem $IconCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $read = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            return this.$IconCompatParcelizer.getDefaultViewModelCreationExtras();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$IconCompatParcelizer = mediaBrowserCompatMediaItem;
        }
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Float> setupdatedstatus = getDefaultBindFlags.read(getDefaultBindFlags.this).read();
                final getDefaultBindFlags getdefaultbindflags = getDefaultBindFlags.this;
                this.IconCompatParcelizer = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.getDefaultBindFlags.RemoteActionCompatParcelizer.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((Float) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(Float f) {
                        Object[] objArr = {getdefaultbindflags, f};
                        getDefaultBindFlags.read(SimpleBasePlayerExternalSyntheticLambda26.AudioAttributesCompatParcelizer(), SimpleBasePlayerExternalSyntheticLambda26.AudioAttributesCompatParcelizer(), 2019984321, SimpleBasePlayerExternalSyntheticLambda26.AudioAttributesCompatParcelizer(), -2019984319, SimpleBasePlayerExternalSyntheticLambda26.AudioAttributesCompatParcelizer(), objArr);
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
            throw new PlanDetailsCreator();
        }

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getDefaultBindFlags.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.getDefaultBindFlags$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/getDefaultBindFlags$read;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "AudioAttributesCompatParcelizer", "(Landroid/content/Context;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Intent AudioAttributesCompatParcelizer(Context p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new Intent(p0, (Class<?>) getDefaultBindFlags.class);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void e(char[] cArr, int i, char[] cArr2, char[] cArr3, char c, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        notifyDownloadRemoved notifydownloadremoved = new notifyDownloadRemoved();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr6 = new char[length3];
        notifydownloadremoved.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            int i5 = $11 + 73;
            $10 = i5 % 128;
            int i6 = i5 % i3;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getPressedStateDuration() >> 16) + 22748, (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 35, 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {notifydownloadremoved};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (31369 - View.MeasureSpec.getSize(0)), 2721 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 37, 1895162189, false, $$n(b, b2, b2), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) ((-1) - TextUtils.lastIndexOf("", '0')), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 15712, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 64, -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                            if (objRemoteActionCompatParcelizer4 == null) {
                                i2 = 2;
                                objRemoteActionCompatParcelizer4 = startForeground.read((char) ((-16736240) - Color.rgb(0, 0, 0)), 6122 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 29 - (ViewConfiguration.getScrollBarSize() >> 8), -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                            } else {
                                i2 = 2;
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = notifydownloadremoved.write;
                            cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr2[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (IconCompatParcelizer ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) AudioAttributesImplApi21Parcelizer) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) AudioAttributesImplApi26Parcelizer) ^ (-3498762522182953692L)))));
                            notifydownloadremoved.AudioAttributesCompatParcelizer++;
                            int i7 = $10 + 115;
                            $11 = i7 % 128;
                            int i8 = i7 % 2;
                            i3 = i2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static void f(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
        char[] cArr2 = new char[i];
        cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
        while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i) {
            cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
            cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i3 + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
            int i5 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (MotionEvent.axisFromString("") + 1), 23704 - (ViewConfiguration.getScrollBarSize() >> 8), 31 - ImageFormat.getBitsPerPixel(0), -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.getOffsetAfter("", 0) + 44862), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 18944, 28 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -1836173544, false, "c", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                    int i6 = $10 + 9;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        if (i2 > 0) {
            cleardownloadmanagerhelpers.write = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - cleardownloadmanagerhelpers.write, cleardownloadmanagerhelpers.write);
            System.arraycopy(cArr3, cleardownloadmanagerhelpers.write, cArr2, 0, i - cleardownloadmanagerhelpers.write);
            int i8 = $10 + 35;
            $11 = i8 % 128;
            int i9 = i8 % 2;
        }
        if (z) {
            int i10 = $11 + 101;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr4 = new char[i];
            cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i) {
                int i12 = $10 + 59;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (44862 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 18945 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 29 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -1836173544, false, "c", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0107  */
    @Override // kotlin.shouldDowngrade, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getDefaultBindFlags.onCreate(android.os.Bundle):void");
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 55;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        parseProgramInformation parseprograminformation = this.AudioAttributesCompatParcelizer;
        parseProgramInformation parseprograminformation2 = null;
        if (parseprograminformation == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            int i4 = MediaBrowserCompatItemReceiver + 15;
            AudioAttributesImplBaseParcelizer = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 / 3;
            }
            parseprograminformation = null;
        }
        Toolbar toolbar = parseprograminformation.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(toolbar, "");
        getHttpMethodString.read((View) toolbar, true, false, false, false, 0, 62);
        parseProgramInformation parseprograminformation3 = this.AudioAttributesCompatParcelizer;
        if (parseprograminformation3 == null) {
            int i6 = AudioAttributesImplBaseParcelizer + 95;
            MediaBrowserCompatItemReceiver = i6 % 128;
            int i7 = i6 % 2;
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            parseprograminformation2 = parseprograminformation3;
        }
        FrameLayout frameLayout = parseprograminformation2.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
        getHttpMethodString.read((View) frameLayout, false, true, true, true, 0, 49);
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        final getDefaultBindFlags getdefaultbindflags = (getDefaultBindFlags) objArr[0];
        int i = 2 % 2;
        parseProgramInformation parseprograminformation = getdefaultbindflags.AudioAttributesCompatParcelizer;
        if (parseprograminformation == null) {
            int i2 = MediaBrowserCompatItemReceiver + 97;
            AudioAttributesImplBaseParcelizer = i2 % 128;
            int i3 = i2 % 2;
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            if (i3 == 0) {
                int i4 = 9 / 0;
            }
            parseprograminformation = null;
        }
        parseprograminformation.AudioAttributesCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.getClientSettings
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getDefaultBindFlags.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
            }
        });
        int i5 = MediaBrowserCompatItemReceiver + 27;
        AudioAttributesImplBaseParcelizer = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    private static final void IconCompatParcelizer(getDefaultBindFlags getdefaultbindflags) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 45;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        NotesPurchaseActivityViewModel notesPurchaseActivityViewModelAudioAttributesImplApi21Parcelizer = getdefaultbindflags.AudioAttributesImplApi21Parcelizer();
        if (i3 == 0) {
            notesPurchaseActivityViewModelAudioAttributesImplApi21Parcelizer.IconCompatParcelizer(validateScopes.write.INSTANCE);
            int i4 = 90 / 0;
        } else {
            notesPurchaseActivityViewModelAudioAttributesImplApi21Parcelizer.IconCompatParcelizer(validateScopes.write.INSTANCE);
        }
        int i5 = AudioAttributesImplBaseParcelizer + 93;
        MediaBrowserCompatItemReceiver = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private final void MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        getDefaultBindFlags getdefaultbindflags = this;
        CmcdConfigurationRequestConfig.read(getdefaultbindflags, new IconCompatParcelizer(null));
        CmcdConfigurationRequestConfig.read(getdefaultbindflags, new write(null));
        CmcdConfigurationRequestConfig.read(getdefaultbindflags, new RemoteActionCompatParcelizer(null));
        int i2 = MediaBrowserCompatItemReceiver + 125;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void AudioAttributesCompatParcelizer(Float p0) {
        int i = 2 % 2;
        shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
        getDefaultBindFlags getdefaultbindflags = this;
        int iRemoteActionCompatParcelizer = shouldEscapeCharacter.Companion.read(getdefaultbindflags, R.attr.colorSurfaceVariant5, new TypedValue(), true);
        if (p0 != null) {
            iRemoteActionCompatParcelizer = _verifyNumberForScalarCoercion.RemoteActionCompatParcelizer(_isNaN.getColor(getdefaultbindflags, R.color.black), iRemoteActionCompatParcelizer, p0.floatValue());
        }
        Integer num = this.IconCompatParcelizer;
        if (num != null) {
            int i2 = MediaBrowserCompatItemReceiver + 83;
            AudioAttributesImplBaseParcelizer = i2 % 128;
            int i3 = i2 % 2;
            if (num.intValue() == iRemoteActionCompatParcelizer) {
                int i4 = AudioAttributesImplBaseParcelizer + 13;
                MediaBrowserCompatItemReceiver = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 97 / 0;
                    return;
                }
                return;
            }
        }
        this.IconCompatParcelizer = Integer.valueOf(iRemoteActionCompatParcelizer);
        parseProgramInformation parseprograminformation = this.AudioAttributesCompatParcelizer;
        if (parseprograminformation == null) {
            int i6 = MediaBrowserCompatItemReceiver + 69;
            AudioAttributesImplBaseParcelizer = i6 % 128;
            int i7 = i6 % 2;
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            parseprograminformation = null;
        }
        parseprograminformation.IconCompatParcelizer.setBackgroundColor(iRemoteActionCompatParcelizer);
        getWindow().setStatusBarColor(iRemoteActionCompatParcelizer);
    }

    @Override // kotlin.addObserverForBackInvoker
    public final boolean IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 33;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        getIconCompatParcelizer().RemoteActionCompatParcelizer();
        boolean z = i3 != 0;
        int i4 = MediaBrowserCompatItemReceiver + 29;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        throw null;
    }

    private final void IconCompatParcelizer(boolean p0, boolean p1, boolean p2) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = AudioAttributesImplBaseParcelizer;
        int i5 = i4 + 101;
        MediaBrowserCompatItemReceiver = i5 % 128;
        int i6 = i5 % 2;
        parseProgramInformation parseprograminformation = this.AudioAttributesCompatParcelizer;
        parseProgramInformation parseprograminformation2 = null;
        if (parseprograminformation == null) {
            int i7 = i4 + 61;
            MediaBrowserCompatItemReceiver = i7 % 128;
            int i8 = i7 % 2;
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            parseprograminformation = null;
        }
        ProgressBar progressBar = parseprograminformation.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
        ProgressBar progressBar2 = progressBar;
        if (p0) {
            int i9 = AudioAttributesImplBaseParcelizer + 13;
            MediaBrowserCompatItemReceiver = i9 % 128;
            int i10 = i9 % 2;
            i = 0;
        } else {
            i = 8;
        }
        progressBar2.setVisibility(i);
        parseProgramInformation parseprograminformation3 = this.AudioAttributesCompatParcelizer;
        if (parseprograminformation3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            parseprograminformation3 = null;
        }
        LinearLayout linearLayout = parseprograminformation3.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        LinearLayout linearLayout2 = linearLayout;
        if (p1) {
            int i11 = AudioAttributesImplBaseParcelizer + 71;
            MediaBrowserCompatItemReceiver = i11 % 128;
            i2 = i11 % 2 != 0 ? 1 : 0;
        } else {
            i2 = 8;
        }
        linearLayout2.setVisibility(i2);
        parseProgramInformation parseprograminformation4 = this.AudioAttributesCompatParcelizer;
        if (parseprograminformation4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            parseprograminformation2 = parseprograminformation4;
        }
        FrameLayout frameLayout = parseprograminformation2.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
        frameLayout.setVisibility(p2 ? 0 : 8);
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) throws Throwable {
        getDefaultBindFlags getdefaultbindflags = (getDefaultBindFlags) objArr[0];
        int i = 2 % 2;
        Context baseContext = getdefaultbindflags.getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            int i2 = MediaBrowserCompatItemReceiver + 7;
            AudioAttributesImplBaseParcelizer = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr2 = new Object[1];
            e(new char[]{11018, 10060, 2096, 20590}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 119, new char[]{17675, 19748, 38138, 15610, 34627, 187, 35850, 15631, 47620, 56448, 26612, 40794, 13121, 20606, 48691, 43815, 9838, 34332, 23370, 59640, 6279, 32512, 11375, 39659, 15351, 4480}, new char[]{58329, 56996, 58253, 59036}, (char) (40164 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            e(new char[]{11018, 10060, 2096, 20590}, (Process.getThreadPriority(0) + 20) >> 6, new char[]{6942, 6893, 47654, 21370, 23995, 55052, 53050, 25910, 18151, 13179, 64430, 60262, 10640, 64655, 16801, 32374, 35448, 64556}, new char[]{37450, 44639, 6460, 53879}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 30485), objArr3);
            baseContext = (Context) cls.getMethod((String) objArr3[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = MediaBrowserCompatItemReceiver + 27;
            AudioAttributesImplBaseParcelizer = i4 % 128;
            if (i4 % 2 == 0) {
                boolean z = baseContext instanceof ContextWrapper;
                obj.hashCode();
                throw null;
            }
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i5 = AudioAttributesImplBaseParcelizer + 77;
                MediaBrowserCompatItemReceiver = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        if (baseContext != null) {
            int i7 = MediaBrowserCompatItemReceiver + 3;
            AudioAttributesImplBaseParcelizer = i7 % 128;
            try {
                if (i7 % 2 == 0) {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4534 - TextUtils.lastIndexOf("", '0')), TextUtils.getCapsMode("", 0, 0) + 6054, (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr4 = {baseContext};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.argb(0, 0, 0, 0), 6031 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr4);
                    int i8 = 86 / 0;
                } else {
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 4534), 6054 - (ViewConfiguration.getJumpTapTimeout() >> 16), 42 - (ViewConfiguration.getEdgeSlop() >> 16), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                    Object[] objArr5 = {baseContext};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(823471051);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (Color.rgb(0, 0, 0) + BlockingViewModel_HiltModulesKeyModule.OKHTTP_CLIENT_WINDOW_SIZE), Color.alpha(0) + 6030, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 23, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(objInvoke2, objArr5);
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        super.onResume();
        return null;
    }

    @Override // kotlin.shouldDowngrade, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 101;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i4 = MediaBrowserCompatItemReceiver + 113;
            AudioAttributesImplBaseParcelizer = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            e(new char[]{11018, 10060, 2096, 20590}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2) - 36, new char[]{17675, 19748, 38138, 15610, 34627, 187, 35850, 15631, 47620, 56448, 26612, 40794, 13121, 20606, 48691, 43815, 9838, 34332, 23370, 59640, 6279, 32512, 11375, 39659, 15351, 4480}, new char[]{58329, 56996, 58253, 59036}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 40128), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            e(new char[]{11018, 10060, 2096, 20590}, ViewConfiguration.getMinimumFlingVelocity() >> 16, new char[]{6942, 6893, 47654, 21370, 23995, 55052, 53050, 25910, 18151, 13179, 64430, 60262, 10640, 64655, 16801, 32374, 35448, 64556}, new char[]{37450, 44639, 6460, 53879}, (char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 30488), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (Color.blue(0) + 4535), 6054 - Gravity.getAbsoluteGravity(0, 0), 42 - TextUtils.getOffsetAfter("", 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getLongPressTimeout() >> 16) + 6030, 24 - ExpandableListView.getPackedPositionType(0L), -861814097, false, "read", new Class[]{Context.class});
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
        super.onPause();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x044e  */
    @Override // kotlin.shouldDowngrade, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6725
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getDefaultBindFlags.attachBaseContext(android.content.Context):void");
    }

    public static /* synthetic */ void AudioAttributesCompatParcelizer(getDefaultBindFlags getdefaultbindflags) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 55;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        IconCompatParcelizer(getdefaultbindflags);
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
        int i5 = AudioAttributesImplBaseParcelizer + 25;
        MediaBrowserCompatItemReceiver = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        MediaMetadataCompat = 0;
        MediaBrowserCompatItemReceiver();
        INSTANCE = new Companion(null);
        int i = MediaDescriptionCompat + 125;
        MediaMetadataCompat = i % 128;
        int i2 = i % 2;
    }

    public static final /* synthetic */ void write(getDefaultBindFlags getdefaultbindflags, Float f) {
        int iAudioAttributesCompatParcelizer = SimpleBasePlayerExternalSyntheticLambda26.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = SimpleBasePlayerExternalSyntheticLambda26.AudioAttributesCompatParcelizer();
        read(SimpleBasePlayerExternalSyntheticLambda26.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer, 2019984321, iAudioAttributesCompatParcelizer2, -2019984319, SimpleBasePlayerExternalSyntheticLambda26.AudioAttributesCompatParcelizer(), new Object[]{getdefaultbindflags, f});
    }

    private final void AudioAttributesImplBaseParcelizer() {
        int iAudioAttributesCompatParcelizer = SimpleBasePlayerExternalSyntheticLambda26.AudioAttributesCompatParcelizer();
        int iMediaBrowserCompatMediaItem = getStringArray.MediaBrowserCompatMediaItem();
        read(SimpleBasePlayerExternalSyntheticLambda26.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer, -755080552, iMediaBrowserCompatMediaItem, 755080553, getStringArray.MediaBrowserCompatMediaItem(), new Object[]{this});
    }

    @Override // kotlin.shouldDowngrade, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 107;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            int i4 = 78 / 0;
        }
    }

    @Override // kotlin.shouldDowngrade, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onResume() {
        read(getStringArray.MediaBrowserCompatMediaItem(), getStringArray.MediaBrowserCompatMediaItem(), -1276142639, SimpleBasePlayerExternalSyntheticLambda26.AudioAttributesCompatParcelizer(), 1276142639, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 2064094447, new Object[]{this});
    }

    static void MediaBrowserCompatItemReceiver() {
        IconCompatParcelizer = -6980598982500549074L;
        AudioAttributesImplApi21Parcelizer = -136981212;
        AudioAttributesImplApi26Parcelizer = (char) 54564;
        MediaBrowserCompatCustomActionResultReceiver = 1000326263;
    }
}
