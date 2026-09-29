package kotlin;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ExpandableListView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import com.marrow.designsystem.theme.AppTheme;
import com.marrow.designsystem.theme.ThemeKt;
import com.marrow2.ui.dialogs.new_edition.NewEditionDialogViewModel;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.SignInConfiguration;
import kotlin.VisibilityChecker;
import kotlin.addObject;
import kotlin.getEncryptedLicenseTimeInfo;
import kotlin.setLogger;
import kotlin.withFieldVisibility;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u000bH\u0016J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002"}, d2 = {"Lcom/marrow2/ui/dialogs/new_edition/NewEditionDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "viewModel", "Lcom/marrow2/ui/dialogs/new_edition/NewEditionDialogViewModel;", "getViewModel", "()Lcom/marrow2/ui/dialogs/new_edition/NewEditionDialogViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "listenActions", "onStart", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "Companion", "app_release", "uiState", "Lcom/marrow2/ui/dialogs/new_edition/NewEditionDialogUiState;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class hash extends isSuccess {
    private static int AudioAttributesCompatParcelizer;
    private static short[] AudioAttributesImplApi21Parcelizer;
    private static int AudioAttributesImplApi26Parcelizer;
    private static byte[] AudioAttributesImplBaseParcelizer;
    public static final AudioAttributesCompatParcelizer IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer;
    private static int read;
    private final RenewEligible write;
    private static final byte[] $$c = {59, 77, -89, -73};
    private static final int $$f = 219;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {36, 33, 122, TarConstants.LF_DIR, -18, -4, 57, -62, -1, -24, -7, 9, -19, -12, 5, -5, 56, -66, 3, -8, -14, -14, -2, -5, 58, -60, -3, -25, 13, -7, -13, -11, 4, TarConstants.LF_NORMAL, -66, 0, -13, TarConstants.LF_BLK, -9, 0, -34, 0, -13, 20, -9, -39, -37, 5, -9, 66, -52, -21, -28, 29, -43, 3, 5, 17, -25, -18, 2, -58, 11, -11, -12, 40, -57, -6, -4, 3, 1, -25, -5, 9, -20, 42, -50, -4, -9, 9, -25, 30, -23, -23, 9, -8, -13, -3, -23, 15, -19, -25, -14, -8, -11, 9, 30, -40, -23, 5, -12, -5, 37, -50, -4, -9, 9, -25, 30, -23, -23, 9, -8, -13, -3, -23, 15, -19};
    private static final int $$e = 96;
    private static final byte[] $$a = {0, -75, -45, -77, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 78;
    private static int RatingCompat = 1;
    private static int MediaBrowserCompatCustomActionResultReceiver = 0;
    private static int MediaBrowserCompatItemReceiver = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(byte r5, int r6, short r7) {
        /*
            byte[] r0 = kotlin.hash.$$c
            int r7 = r7 * 2
            int r1 = 1 - r7
            int r6 = r6 + 4
            int r5 = r5 * 4
            int r5 = r5 + 112
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L17
            r4 = r5
            r5 = r7
            r3 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L23:
            int r6 = r6 + 1
            r4 = r0[r6]
            int r3 = r3 + 1
        L29:
            int r5 = r5 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.hash.$$g(byte, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = 80 - r9
            int r7 = r7 * 10
            int r7 = 44 - r7
            byte[] r0 = kotlin.hash.$$a
            int r8 = r8 * 12
            int r8 = r8 + 65
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r7
            r3 = r9
            r5 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2a:
            int r9 = -r9
            int r8 = r8 + r9
            int r8 = r8 + (-1)
            int r9 = r3 + 1
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.hash.a(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 17
            int r5 = 99 - r5
            byte[] r0 = kotlin.hash.$$d
            int r6 = r6 * 3
            int r1 = r6 + 28
            int r7 = r7 * 3
            int r7 = 90 - r7
            byte[] r1 = new byte[r1]
            int r6 = r6 + 27
            r2 = 0
            if (r0 != 0) goto L18
            r4 = r6
            r3 = r2
            goto L2c
        L18:
            r3 = r2
        L19:
            int r7 = r7 + 1
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r6) goto L28
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L28:
            int r3 = r3 + 1
            r4 = r0[r7]
        L2c:
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + (-6)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.hash.c(short, short, short, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object write(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i2;
        int i9 = (~(i7 | i8 | (~i3))) | (~(i6 | i2 | i3));
        int i10 = (~(i8 | i3)) | (~(i8 | i6));
        int i11 = (~(i3 | i2)) | i6;
        int i12 = i6 + i2 + i5 + (1661237432 * i4) + (961048624 * i);
        int i13 = i12 * i12;
        int i14 = ((119520104 * i6) - 281083904) + ((-1329838950) * i2) + (i9 * 724679527) + (724679527 * i10) + ((-724679527) * i11) + ((-605159424) * i5) + ((-1559232512) * i4) + (1553989632 * i) + (2020540416 * i13);
        int i15 = (i6 * (-2040814728)) + 92927091 + (i2 * (-2040813538)) + (i9 * (-595)) + (i10 * (-595)) + (i11 * 595) + (i5 * (-2040814133)) + (i4 * (-1614655000)) + (i * 500164112) + (i13 * 184877056);
        int i16 = i14 + (i15 * i15 * 1800994816);
        return i16 != 1 ? i16 != 2 ? RemoteActionCompatParcelizer(objArr) : read(objArr) : IconCompatParcelizer(objArr);
    }

    public hash() {
        hash hashVar = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass5(new AnonymousClass3(hashVar)));
        this.write = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(NewEditionDialogViewModel.class), new AnonymousClass2(renewEligibleWrite), new AnonymousClass1(renewEligibleWrite), new AnonymousClass4(hashVar, renewEligibleWrite));
    }

    public static final /* synthetic */ NewEditionDialogViewModel write(hash hashVar) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 37;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        NewEditionDialogViewModel newEditionDialogViewModelAudioAttributesCompatParcelizer = hashVar.AudioAttributesCompatParcelizer();
        int i4 = MediaBrowserCompatItemReceiver + 33;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return newEditionDialogViewModelAudioAttributesCompatParcelizer;
    }

    private final NewEditionDialogViewModel AudioAttributesCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 95;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        NewEditionDialogViewModel newEditionDialogViewModel = (NewEditionDialogViewModel) this.write.RemoteActionCompatParcelizer();
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 101;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            return newEditionDialogViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                NewNumberOtpResendRequest<SignInConfiguration> newNumberOtpResendRequestIconCompatParcelizer = hash.write(hash.this).IconCompatParcelizer();
                final hash hashVar = hash.this;
                this.write = 1;
                if (newNumberOtpResendRequestIconCompatParcelizer.write(new getValidationToken() { // from class: o.hash.write.3
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((SignInConfiguration) obj2);
                    }

                    private Object IconCompatParcelizer(SignInConfiguration signInConfiguration) {
                        if (signInConfiguration instanceof SignInConfiguration.RemoteActionCompatParcelizer) {
                            withAlwaysAsId.read(hashVar, "new_edition_dialog_key", _getIndexResolver.write(setAction.write("cta_key_press", QBankStatsResponse.AudioAttributesCompatParcelizer(true)), setAction.write("switch_edition_key_press", QBankStatsResponse.AudioAttributesCompatParcelizer(((SignInConfiguration.RemoteActionCompatParcelizer) signInConfiguration).read()))));
                        } else {
                            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(signInConfiguration, SignInConfiguration.IconCompatParcelizer.INSTANCE)) {
                                throw new RenewEligibleCreator();
                            }
                            hashVar.dismissAllowingStateLoss();
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

        write(SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return hash.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/hash$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/setLogger$write;", "p0", "Lo/hash;", "RemoteActionCompatParcelizer", "(Lo/setLogger$write;)Lo/hash;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer {
        private AudioAttributesCompatParcelizer() {
        }

        public static hash RemoteActionCompatParcelizer(setLogger.write p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            hash hashVar = new hash();
            hashVar.setArguments(_getIndexResolver.write(setAction.write(CourseConfigKeyConstantsKt.KEY_EDITION_UPDATE_POPUP_VARIANT, p0.name())));
            return hashVar;
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: renamed from: o.hash$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "RemoteActionCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$AudioAttributesCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.hash$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "write", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$IconCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$IconCompatParcelizer = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.hash$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "IconCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$write).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(RenewEligible renewEligible) {
            super(0);
            this.$write = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.hash$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "write", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $AudioAttributesCompatParcelizer = null;
        private /* synthetic */ RenewEligible $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$read);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RenewEligible renewEligible) {
            super(0);
            this.$read = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.hash$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "AudioAttributesCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ RenewEligible $RemoteActionCompatParcelizer;
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$RemoteActionCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$write.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$write = fragment;
            this.$RemoteActionCompatParcelizer = renewEligible;
        }
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onCreate(Bundle savedInstanceState) throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char cCombineMeasuredStates = (char) (13183 - View.combineMeasuredStates(0, 0));
            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 1649;
            int keyRepeatDelay = 26 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[0], bArr[17], (byte) ($$b - 2), objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(cCombineMeasuredStates, tapTimeout, keyRepeatDelay, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            int i2 = MediaBrowserCompatItemReceiver + 103;
            MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
            int i3 = i2 % 2;
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer2 == null) {
                char c2 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 13182);
                int keyRepeatTimeout = 1649 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int iAlpha = 26 - Color.alpha(0);
                byte[] bArr2 = $$a;
                byte b = bArr2[17];
                byte b2 = bArr2[0];
                byte b3 = bArr2[39];
                Object[] objArr3 = new Object[1];
                a(b, b2, b3, objArr3);
                objRemoteActionCompatParcelizer2 = startForeground.read(c2, keyRepeatTimeout, iAlpha, -1033747278, false, (String) objArr3[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer2).get(null);
            c = 3;
        } else {
            Object[] objArr4 = new Object[1];
            b((byte) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 1995993015 - (KeyEvent.getMaxKeyCode() >> 16), (-850036957) - (ViewConfiguration.getTapTimeout() >> 16), (short) (Process.getGidForName("") + 1), (-25) - (Process.myTid() >> 22), objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b((byte) KeyEvent.normalizeMetaState(0), 1995993014 - TextUtils.getOffsetAfter("", 0), (-866814158) - Color.rgb(0, 0, 0), (short) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 24, objArr5);
            int iIntValue = ((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue();
            int i4 = MediaBrowserCompatItemReceiver;
            int i5 = i4 + 11;
            MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 85;
            MediaBrowserCompatCustomActionResultReceiver = i7 % 128;
            int i8 = i7 % 2;
            try {
                Object[] objArr6 = {Integer.valueOf(iIntValue), 0, -436412952};
                byte[] bArr3 = $$d;
                byte b4 = bArr3[35];
                Object[] objArr7 = new Object[1];
                c(b4, (byte) (b4 | 10), bArr3[53], objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                Object[] objArr8 = new Object[1];
                c(bArr3[60], bArr3[70], (byte) (bArr3[62] - 1), objArr8);
                Object[] objArr9 = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 13183);
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1649;
                    int iMakeMeasureSpec = 26 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    byte[] bArr4 = $$a;
                    byte b5 = bArr4[17];
                    byte b6 = bArr4[0];
                    byte b7 = bArr4[39];
                    Object[] objArr10 = new Object[1];
                    a(b5, b6, b7, objArr10);
                    objRemoteActionCompatParcelizer3 = startForeground.read(touchSlop, doubleTapTimeout, iMakeMeasureSpec, -1033747278, false, (String) objArr10[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer3).set(null, objArr9);
                try {
                    Object[] objArr11 = new Object[1];
                    b((byte) (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), Color.blue(0) + 1995993006, View.MeasureSpec.getMode(0) - 850036927, (short) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (-20) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    b((byte) View.resolveSize(0, 0), ExpandableListView.getPackedPositionType(0L) + 1995993010, KeyEvent.keyCodeFromString("") - 850036906, (short) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-26) - KeyEvent.keyCodeFromString(""), objArr12);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char gidForName = (char) (Process.getGidForName("") + 13184);
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1649;
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 26;
                        byte[] bArr5 = $$a;
                        byte b8 = bArr5[17];
                        byte b9 = bArr5[0];
                        Object[] objArr13 = new Object[1];
                        a(b8, b9, b9, objArr13);
                        objRemoteActionCompatParcelizer4 = startForeground.read(gidForName, jumpTapTimeout, scrollBarSize, 54351865, false, (String) objArr13[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char c3 = (char) (13183 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                        int i9 = 1648 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 27;
                        byte[] bArr6 = $$a;
                        Object[] objArr14 = new Object[1];
                        a(bArr6[0], bArr6[17], (byte) ($$b - 2), objArr14);
                        objRemoteActionCompatParcelizer5 = startForeground.read(c3, i9, iIndexOf, -133433128, false, (String) objArr14[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf2);
                    objArr = objArr9;
                    c = 3;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i10 = ((int[]) objArr[c])[0];
        int i11 = ((int[]) objArr[2])[0];
        if (i11 != i10) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i10 ^ i11)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (View.resolveSize(0, 0) + 4535), (ViewConfiguration.getEdgeSlop() >> 16) + 6054, 42 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(null, null);
                ArrayList arrayList = new ArrayList();
                String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                int i12 = MediaBrowserCompatCustomActionResultReceiver + 69;
                MediaBrowserCompatItemReceiver = i12 % 128;
                int i13 = i12 % 2;
                try {
                    Object[] objArr15 = {1037419877, Long.valueOf(j3), arrayList, strRemoteActionCompatParcelizer, true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), View.resolveSizeAndState(0, 0, 0) + 6030, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 23);
                    byte[] bArr7 = $$d;
                    byte b10 = bArr7[70];
                    byte b11 = bArr7[35];
                    Object[] objArr16 = new Object[1];
                    c(b10, b11, b11, objArr16);
                    cls4.getMethod((String) objArr16[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke, objArr15);
                    int i14 = MediaBrowserCompatItemReceiver + 125;
                    MediaBrowserCompatCustomActionResultReceiver = i14 % 128;
                    int i15 = i14 % 2;
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
        }
        super.onCreate(savedInstanceState);
        setCancelable(false);
        setStyle(0, R.style.NewEditionDialogTheme);
        RemoteActionCompatParcelizer();
    }

    private final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        setBitrateKbps.read(this, new write(null));
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 15;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        hash hashVar = (hash) objArr[0];
        int i = 2 % 2;
        super.onStart();
        Dialog dialog = hashVar.getDialog();
        Object obj = null;
        if (dialog != null) {
            int i2 = MediaBrowserCompatCustomActionResultReceiver + 61;
            MediaBrowserCompatItemReceiver = i2 % 128;
            int i3 = i2 % 2;
            Window window = dialog.getWindow();
            if (window != null) {
                int i4 = MediaBrowserCompatCustomActionResultReceiver + 81;
                MediaBrowserCompatItemReceiver = i4 % 128;
                int i5 = i4 % 2;
                window.setLayout(-1, -1);
                if (i5 == 0) {
                    obj.hashCode();
                    throw null;
                }
            }
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(inflater, "");
        ComposeView composeViewAudioAttributesCompatParcelizer = setBitrateKbps.AudioAttributesCompatParcelizer(this, multiplyFft.IconCompatParcelizer(-738532871, true, new MagicModuleSubmissionRequestBody() { // from class: o.Storage
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return hash.read(this.IconCompatParcelizer, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
            }
        }));
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 7;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            return composeViewAudioAttributesCompatParcelizer;
        }
        throw null;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        hash hashVar = (hash) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 5;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        hashVar.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(addObject.IconCompatParcelizer.INSTANCE);
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 27;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            return getshowpopup;
        }
        throw null;
    }

    private static final getShowPopup IconCompatParcelizer(hash hashVar) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 111;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        hashVar.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(addObject.write.INSTANCE);
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = MediaBrowserCompatItemReceiver + 39;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopup;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final kotlin.getShowPopup RemoteActionCompatParcelizer(final kotlin.hash r11, kotlin._handleUnrecognizedCharacterEscape r12, int r13) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.hash.RemoteActionCompatParcelizer(o.hash, o._handleUnrecognizedCharacterEscape, int):o.getShowPopup");
    }

    private static final getShowPopup IconCompatParcelizer(final hash hashVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = MediaBrowserCompatItemReceiver + 105;
            MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(z, i & 1)) {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-738532871, i, -1, "com.marrow2.ui.dialogs.new_edition.NewEditionDialogFragment.onCreateView.<anonymous> (NewEditionDialogFragment.kt:62)");
            }
            ThemeKt.read((AppTheme) null, false, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) multiplyFft.AudioAttributesCompatParcelizer(-1469375367, true, new MagicModuleSubmissionRequestBody() { // from class: o.getSavedDefaultGoogleSignInAccount
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    Object[] objArr = {this.write, (_handleUnrecognizedCharacterEscape) obj, Integer.valueOf(((Integer) obj2).intValue())};
                    int iWrite = getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write();
                    int iWrite2 = getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write();
                    return (getShowPopup) hash.write(objArr, getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write(), 1100373780, iWrite, getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write(), iWrite2, -1100373780);
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, RendererCapabilities.MODE_SUPPORT_MASK, 3);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                int i5 = MediaBrowserCompatItemReceiver + 81;
                MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
                int i6 = i5 % 2;
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        } else {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        }
        return getShowPopup.INSTANCE;
    }

    private static void b(byte b, int i, int i2, short s, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2;
        int i6 = 2 % 2;
        buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(RemoteActionCompatParcelizer)};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (Process.myPid() >> 22), (ViewConfiguration.getScrollBarSize() >> 8) + 24297, 13 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
            }
            Object obj = null;
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $10 + 63;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                int i9 = $11 + 69;
                int i10 = i9 % 128;
                $10 = i10;
                if (i9 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                byte[] bArr = AudioAttributesImplBaseParcelizer;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i11 = i10 + 71;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    int i13 = 0;
                    while (i13 < length) {
                        int i14 = $10 + 79;
                        $11 = i14 % 128;
                        int i15 = i14 % i5;
                        Object[] objArr3 = {Integer.valueOf(bArr[i13])};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(28234468);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 - 1);
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) (ImageFormat.getBitsPerPixel(0) + 1), 3081 - MotionEvent.axisFromString(""), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 128, 2145850993, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i13] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                        i13++;
                        i5 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = AudioAttributesImplBaseParcelizer;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(AudioAttributesCompatParcelizer)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(559968424);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 24298, 12 - (ViewConfiguration.getEdgeSlop() >> 16), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) RemoteActionCompatParcelizer) ^ 7899112766888837815L)));
                } else {
                    iIntValue = (short) (((short) (((long) AudioAttributesImplApi21Parcelizer[i2 + ((int) (((long) AudioAttributesCompatParcelizer) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) RemoteActionCompatParcelizer) ^ 7899112766888837815L)));
                }
            }
            if (iIntValue > 0) {
                buildresumedownloadsintent.read = ((i2 + iIntValue) - 2) + ((int) (((long) AudioAttributesCompatParcelizer) ^ 7899112766888837815L)) + i4;
                Object[] objArr5 = {buildresumedownloadsintent, Integer.valueOf(i), Integer.valueOf(read), sb};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(107629512);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (34134 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 13432 - KeyEvent.normalizeMetaState(0), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 21, 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).append(buildresumedownloadsintent.IconCompatParcelizer);
                buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                byte[] bArr4 = AudioAttributesImplBaseParcelizer;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i16 = $10 + 55;
                    $11 = i16 % 128;
                    int i17 = i16 % 2;
                    for (int i18 = 0; i18 < length2; i18++) {
                        bArr5[i18] = (byte) (((long) bArr4[i18]) ^ 7899112766888837815L);
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                buildresumedownloadsintent.AudioAttributesCompatParcelizer = 1;
                while (buildresumedownloadsintent.AudioAttributesCompatParcelizer < iIntValue) {
                    if (z) {
                        byte[] bArr6 = AudioAttributesImplBaseParcelizer;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((byte) (((byte) (((long) bArr6[r7]) ^ 7899112766888837815L)) + s)) ^ b));
                    } else {
                        short[] sArr = AudioAttributesImplApi21Parcelizer;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((short) (((short) (((long) sArr[r7]) ^ 7899112766888837815L)) + s)) ^ b));
                    }
                    sb.append(buildresumedownloadsintent.IconCompatParcelizer);
                    buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                    buildresumedownloadsintent.AudioAttributesCompatParcelizer++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static final getMinApkVersion AudioAttributesCompatParcelizer(parseDouble<? extends getMinApkVersion> parsedouble) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 113;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        getMinApkVersion remoteActionCompatParcelizer = parsedouble.getRemoteActionCompatParcelizer();
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 47;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
        return remoteActionCompatParcelizer;
    }

    public static /* synthetic */ getShowPopup RemoteActionCompatParcelizer(hash hashVar) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 87;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            return IconCompatParcelizer(hashVar);
        }
        IconCompatParcelizer(hashVar);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getShowPopup write(hash hashVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        Object[] objArr = {hashVar, _handleunrecognizedcharacterescape, Integer.valueOf(i)};
        int iWrite = getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write();
        int iWrite2 = getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write();
        return (getShowPopup) write(objArr, getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write(), 1100373780, iWrite, getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write(), iWrite2, -1100373780);
    }

    public static /* synthetic */ getShowPopup read(hash hashVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatItemReceiver + 111;
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            IconCompatParcelizer(hashVar, _handleunrecognizedcharacterescape, i);
            obj.hashCode();
            throw null;
        }
        getShowPopup getshowpopupIconCompatParcelizer = IconCompatParcelizer(hashVar, _handleunrecognizedcharacterescape, i);
        int i4 = MediaBrowserCompatItemReceiver + 23;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return getshowpopupIconCompatParcelizer;
        }
        throw null;
    }

    public static /* synthetic */ getShowPopup AudioAttributesCompatParcelizer(hash hashVar) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 29;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {hashVar};
        int iWrite = getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write();
        int iWrite2 = getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write();
        int iWrite3 = getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write();
        int iWrite4 = getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        getShowPopup getshowpopup = (getShowPopup) write(objArr, iWrite4, 1846532718, iWrite, iWrite3, iWrite2, -1846532717);
        int i4 = MediaBrowserCompatItemReceiver + 89;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return getshowpopup;
        }
        obj.hashCode();
        throw null;
    }

    static {
        AudioAttributesImplApi26Parcelizer = 0;
        write();
        IconCompatParcelizer = new AudioAttributesCompatParcelizer(null);
        int i = RatingCompat + 67;
        AudioAttributesImplApi26Parcelizer = i % 128;
        int i2 = i % 2;
    }

    private static final getShowPopup read(hash hashVar) {
        int iWrite = getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write();
        int iWrite2 = getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write();
        return (getShowPopup) write(new Object[]{hashVar}, getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write(), 1846532718, iWrite, getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write(), iWrite2, -1846532717);
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onStart() {
        int iWrite = getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write();
        int iWrite2 = getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write();
        write(new Object[]{this}, getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write(), -196049684, iWrite, getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write(), iWrite2, 196049686);
    }

    static void write() {
        AudioAttributesCompatParcelizer = -41743766;
        RemoteActionCompatParcelizer = -819363170;
        read = 1177424388;
        AudioAttributesImplBaseParcelizer = new byte[]{-65, 70, -74, 77, -111, -110, 112, 78, -70, 66, -119, 122, 92, -94, 64, -74, 66, -101, 108, 66, -91, -82, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -78, -68, 66, -79, -66, -74, TarConstants.LF_GNUTYPE_LONGNAME, -65, 67, -76, -98, 97, -65, 70, -74, 77, -111, -110, 12, -77, -10, 125, TarConstants.LF_GNUTYPE_LONGNAME, 77, 74, -71, 65, -70, 79, -77, 66, -65, -68, TarConstants.LF_GNUTYPE_LONGLINK, -92, 89, 72, 69, -76, -72, 66, -80, -73, -73, -73, -73};
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        hash hashVar = (hash) objArr[0];
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape = (_handleUnrecognizedCharacterEscape) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 41;
        MediaBrowserCompatItemReceiver = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            RemoteActionCompatParcelizer(hashVar, _handleunrecognizedcharacterescape, iIntValue);
            obj.hashCode();
            throw null;
        }
        getShowPopup getshowpopupRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(hashVar, _handleunrecognizedcharacterescape, iIntValue);
        int i3 = MediaBrowserCompatItemReceiver + 43;
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        if (i3 % 2 == 0) {
            return getshowpopupRemoteActionCompatParcelizer;
        }
        throw null;
    }
}
