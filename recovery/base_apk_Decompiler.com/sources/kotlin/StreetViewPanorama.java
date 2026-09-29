package kotlin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.util.DeviceProperties;
import com.marrow.R;
import com.marrow.data.models.common.CourseConfigV2;
import com.marrow.designsystem.theme.AppTheme;
import com.marrow.designsystem.theme.AppThemeManager;
import com.marrow.ui.activities.base.BaseActivity;
import com.marrow.ui.activities.plan.PlanActivity;
import com.marrow2.ui.settings.landing.ProfileLandingViewModel;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NavigationViewSavedState;
import kotlin.StreetViewPanoramaFragmentzzb;
import kotlin.VisibilityChecker;
import kotlin._init_lambda4;
import kotlin.createFloatList;
import kotlin.getAutofillClient;
import kotlin.getStreetViewPanoramaAsync;
import kotlin.getStreetViewPanoramaCamera;
import kotlin.packageManager;
import kotlin.setClientDataHash;
import kotlin.setSmallestDisplacement;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u0003J!\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0015\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u0003J\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u0011\u0010\u001bJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u0011\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\u0015\u0010 J\u000f\u0010!\u001a\u00020\rH\u0002¢\u0006\u0004\b!\u0010\u0003J\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001e\u0010\u0018J\u0017\u0010\"\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010 J\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020#H\u0002¢\u0006\u0004\b\u001e\u0010$J\u001f\u0010%\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010\"\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\"\u0010\u0018R\u001b\u0010%\u001a\u00020'8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010(\u001a\u0004\b\u001e\u0010)R\u0018\u0010\u0015\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010+R\u0014\u0010\u0011\u001a\u00020*8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010,R\u001e\u0010\u001e\u001a\f\u0012\b\u0012\u0006*\u00020.0.0-8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010/R\u001e\u0010\"\u001a\f\u0012\b\u0012\u0006*\u00020.0.0-8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010/R\u001e\u0010\u0016\u001a\f\u0012\b\u0012\u0006*\u00020.0.0-8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010/"}, d2 = {"Lo/StreetViewPanorama;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onDestroyView", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "write", "MediaBrowserCompatItemReceiver", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi26Parcelizer", "read", "AudioAttributesImplApi21Parcelizer", "", "(Ljava/lang/String;)V", "MediaBrowserCompatMediaItem", "Lcom/marrow/data/models/common/CourseConfigV2$SettingsItem;", "(Lcom/marrow/data/models/common/CourseConfigV2$SettingsItem;)V", "Lo/StreetViewPanoramaFragment;", "(Lo/StreetViewPanoramaFragment;)V", "RemoteActionCompatParcelizer", "", "(Z)V", "AudioAttributesImplBaseParcelizer", "AudioAttributesCompatParcelizer", "", "(I)V", "IconCompatParcelizer", "(II)V", "Lcom/marrow2/ui/settings/landing/ProfileLandingViewModel;", "Lo/RenewEligible;", "()Lcom/marrow2/ui/settings/landing/ProfileLandingViewModel;", "Lo/isIndependent;", "Lo/isIndependent;", "()Lo/isIndependent;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;", "Landroid/content/Intent;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StreetViewPanorama extends fromScreenLocation {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final RenewEligible IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private isIndependent read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> AudioAttributesCompatParcelizer;

    public static final /* synthetic */ class IconCompatParcelizer {
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
        public static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[CourseConfigV2.SettingsItem.values().length];
            try {
                iArr[CourseConfigV2.SettingsItem.PLAN_PAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CourseConfigV2.SettingsItem.THEME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CourseConfigV2.SettingsItem.VIBRATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CourseConfigV2.SettingsItem.RESET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CourseConfigV2.SettingsItem.CHANGE_PASSWORD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CourseConfigV2.SettingsItem.CHANGE_PH_NO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CourseConfigV2.SettingsItem.KYC_VERIFICATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            read = iArr;
            int[] iArr2 = new int[AppTheme.values().length];
            try {
                iArr2[AppTheme.RemoteActionCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[AppTheme.read.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[AppTheme.AudioAttributesCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            RemoteActionCompatParcelizer = iArr2;
        }
    }

    public StreetViewPanorama() {
        StreetViewPanorama streetViewPanorama = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass2(new AnonymousClass3(streetViewPanorama)));
        this.IconCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(ProfileLandingViewModel.class), new AnonymousClass1(renewEligibleWrite), new AnonymousClass4(renewEligibleWrite), new AnonymousClass5(streetViewPanorama, renewEligibleWrite));
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult = registerForActivityResult(new _init_lambda4.AudioAttributesImplApi26Parcelizer(), new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() { // from class: o.getPanoramaCamera
            @Override // kotlin.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
            public final void IconCompatParcelizer(Object obj) {
                StreetViewPanorama.MediaBrowserCompatItemReceiver(this.write, (ActivityResult) obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult, "");
        this.RemoteActionCompatParcelizer = r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult;
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult2 = registerForActivityResult(new _init_lambda4.AudioAttributesImplApi26Parcelizer(), new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() { // from class: o.setStreetNamesEnabled
            @Override // kotlin.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
            public final void IconCompatParcelizer(Object obj) {
                StreetViewPanorama.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, (ActivityResult) obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult2, "");
        this.AudioAttributesCompatParcelizer = r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult2;
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult3 = registerForActivityResult(new _init_lambda4.AudioAttributesImplApi26Parcelizer(), new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() { // from class: o.setZoomGesturesEnabled
            @Override // kotlin.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
            public final void IconCompatParcelizer(Object obj) {
                StreetViewPanorama.write(this.IconCompatParcelizer, (ActivityResult) obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult3, "");
        this.AudioAttributesImplApi21Parcelizer = r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProfileLandingViewModel RemoteActionCompatParcelizer() {
        return (ProfileLandingViewModel) this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final isIndependent AudioAttributesCompatParcelizer() {
        isIndependent isindependent = this.read;
        toMagicModuleMetaRepoModel.write(isindependent);
        return isindependent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatItemReceiver(StreetViewPanorama streetViewPanorama, ActivityResult activityResult) {
        toMagicModuleMetaRepoModel.write(activityResult, "");
        if (activityResult.getRemoteActionCompatParcelizer() == -1) {
            streetViewPanorama.RemoteActionCompatParcelizer().read(StreetViewPanoramaFragmentzzb.write.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(StreetViewPanorama streetViewPanorama, ActivityResult activityResult) {
        maybeGetTypeVariable activity;
        toMagicModuleMetaRepoModel.write(activityResult, "");
        if (activityResult.getRemoteActionCompatParcelizer() != -1 || (activity = streetViewPanorama.getActivity()) == null) {
            return;
        }
        activity.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(StreetViewPanorama streetViewPanorama, ActivityResult activityResult) {
        toMagicModuleMetaRepoModel.write(activityResult, "");
        streetViewPanorama.RemoteActionCompatParcelizer().read(StreetViewPanoramaFragmentzzb.write.INSTANCE);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.read = isIndependent.AudioAttributesCompatParcelizer(p0, p1);
        ConstraintLayout constraintLayoutIconCompatParcelizer = AudioAttributesCompatParcelizer().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer, "");
        return constraintLayoutIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.read = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        write();
        MediaBrowserCompatCustomActionResultReceiver();
        read();
        MediaBrowserCompatItemReceiver();
    }

    private final void write() {
        ConstraintLayout constraintLayout = AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        getHttpMethodString.read((View) constraintLayout, true, false, true, true, 0, 50);
        ScrollView scrollView = AudioAttributesCompatParcelizer().MediaMetadataCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollView, "");
        getHttpMethodString.read((View) scrollView, false, true, true, true, 0, 49);
    }

    /* JADX INFO: renamed from: o.StreetViewPanorama$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "IconCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$AudioAttributesCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.StreetViewPanorama$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "IconCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$RemoteActionCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$RemoteActionCompatParcelizer = getcreatedondatems;
        }
    }

    private final void MediaBrowserCompatItemReceiver() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            LinearLayout linearLayout = AudioAttributesCompatParcelizer().MediaBrowserCompatMediaItem;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            PlayerControlViewExternalSyntheticLambda1.IconCompatParcelizer(contextRequireContext, linearLayout);
        }
    }

    /* JADX INFO: renamed from: o.StreetViewPanorama$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "write", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.StreetViewPanorama$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "write", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ RenewEligible $read;
        private /* synthetic */ getCreatedOnDateMs $write = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$read);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(RenewEligible renewEligible) {
            super(0);
            this.$read = renewEligible;
        }
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isDark<CourseConfigV2.SettingsItems> isdark = StreetViewPanorama.this.RemoteActionCompatParcelizer().read();
                final StreetViewPanorama streetViewPanorama = StreetViewPanorama.this;
                this.RemoteActionCompatParcelizer = 1;
                if (isdark.write(new getValidationToken() { // from class: o.StreetViewPanorama.AudioAttributesCompatParcelizer.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((CourseConfigV2.SettingsItems) obj2);
                    }

                    private Object read(CourseConfigV2.SettingsItems settingsItems) {
                        List<CourseConfigV2.SettingsItem> allSettings = settingsItems.getAllSettings();
                        StreetViewPanorama streetViewPanorama2 = streetViewPanorama;
                        Iterator<T> it = allSettings.iterator();
                        while (it.hasNext()) {
                            streetViewPanorama2.write((CourseConfigV2.SettingsItem) it.next());
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

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return StreetViewPanorama.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        StreetViewPanorama streetViewPanorama = this;
        setBitrateKbps.read(streetViewPanorama, new AudioAttributesCompatParcelizer(null));
        setBitrateKbps.read(streetViewPanorama, new read(null));
        setBitrateKbps.RemoteActionCompatParcelizer(streetViewPanorama, new write(null));
        setBitrateKbps.RemoteActionCompatParcelizer(streetViewPanorama, new MediaBrowserCompatItemReceiver(null));
    }

    /* JADX INFO: renamed from: o.StreetViewPanorama$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "write", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $read;
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$write);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$read.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$read = fragment;
            this.$write = renewEligible;
        }
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Boolean> setupdatedstatusAudioAttributesImplApi21Parcelizer = StreetViewPanorama.this.RemoteActionCompatParcelizer().AudioAttributesImplApi21Parcelizer();
                final StreetViewPanorama streetViewPanorama = StreetViewPanorama.this;
                this.read = 1;
                if (setupdatedstatusAudioAttributesImplApi21Parcelizer.write(new getValidationToken() { // from class: o.StreetViewPanorama.read.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read(((Boolean) obj2).booleanValue());
                    }

                    private Object read(boolean z) {
                        ProgressBar progressBar = streetViewPanorama.AudioAttributesCompatParcelizer().MediaDescriptionCompat;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
                        progressBar.setVisibility(z ? 0 : 8);
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

        read(SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return StreetViewPanorama.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<StreetViewPanoramaFragment>> setupdatedstatusAudioAttributesCompatParcelizer = StreetViewPanorama.this.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer();
                final StreetViewPanorama streetViewPanorama = StreetViewPanorama.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.StreetViewPanorama.write.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((DataSourceBitmapLoaderExternalSyntheticLambda0) obj2);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    private Object read(DataSourceBitmapLoaderExternalSyntheticLambda0<StreetViewPanoramaFragment> dataSourceBitmapLoaderExternalSyntheticLambda0) {
                        if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof setStreamingFormat) {
                            ProgressBar progressBar = streetViewPanorama.AudioAttributesCompatParcelizer().MediaDescriptionCompat;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(progressBar);
                        } else {
                            if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof decodeBitmap) {
                                streetViewPanorama.write((StreetViewPanoramaFragment) ((decodeBitmap) dataSourceBitmapLoaderExternalSyntheticLambda0).RemoteActionCompatParcelizer());
                            }
                            ProgressBar progressBar2 = streetViewPanorama.AudioAttributesCompatParcelizer().MediaDescriptionCompat;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar2, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(progressBar2);
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
            return StreetViewPanorama.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<getStreetViewPanoramaAsync> setupdatedstatusIconCompatParcelizer = StreetViewPanorama.this.RemoteActionCompatParcelizer().IconCompatParcelizer();
                final StreetViewPanorama streetViewPanorama = StreetViewPanorama.this;
                this.read = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.StreetViewPanorama.MediaBrowserCompatItemReceiver.5
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((getStreetViewPanoramaAsync) obj2);
                    }

                    private Object IconCompatParcelizer(getStreetViewPanoramaAsync getstreetviewpanoramaasync) {
                        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getstreetviewpanoramaasync, getStreetViewPanoramaAsync.read.INSTANCE)) {
                            if (getstreetviewpanoramaasync instanceof getStreetViewPanoramaAsync.write) {
                                r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 r8lambdaibk6u1hk7j3awkl_wn934v2uvi8 = streetViewPanorama.AudioAttributesCompatParcelizer;
                                setSmallestDisplacement.Companion companion = setSmallestDisplacement.INSTANCE;
                                Context contextRequireContext = streetViewPanorama.requireContext();
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                                r8lambdaibk6u1hk7j3awkl_wn934v2uvi8.read(setSmallestDisplacement.Companion.write(contextRequireContext, ((getStreetViewPanoramaAsync.write) getstreetviewpanoramaasync).IconCompatParcelizer()));
                            } else if (getstreetviewpanoramaasync instanceof getStreetViewPanoramaAsync.AudioAttributesImplBaseParcelizer) {
                                streetViewPanorama.read(((getStreetViewPanoramaAsync.AudioAttributesImplBaseParcelizer) getstreetviewpanoramaasync).write());
                            } else if (getstreetviewpanoramaasync instanceof getStreetViewPanoramaAsync.AudioAttributesImplApi21Parcelizer) {
                                CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(streetViewPanorama, ((getStreetViewPanoramaAsync.AudioAttributesImplApi21Parcelizer) getstreetviewpanoramaasync).IconCompatParcelizer(), 0);
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getstreetviewpanoramaasync, getStreetViewPanoramaAsync.AudioAttributesCompatParcelizer.INSTANCE)) {
                                StreetViewPanorama streetViewPanorama2 = streetViewPanorama;
                                StreetViewPanorama streetViewPanorama3 = streetViewPanorama2;
                                String string = streetViewPanorama2.getString(R.string.kyc_under_verification);
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                                CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(streetViewPanorama3, string, 0);
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getstreetviewpanoramaasync, getStreetViewPanoramaAsync.RemoteActionCompatParcelizer.INSTANCE)) {
                                streetViewPanorama.AudioAttributesImplApi26Parcelizer();
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getstreetviewpanoramaasync, getStreetViewPanoramaAsync.IconCompatParcelizer.INSTANCE)) {
                                streetViewPanorama.AudioAttributesImplApi21Parcelizer();
                            } else {
                                throw new RenewEligibleCreator();
                            }
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

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return StreetViewPanorama.this.new MediaBrowserCompatItemReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesImplApi26Parcelizer() {
        maybeGetTypeVariable activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
        if (BaseActivity.AudioAttributesImplBaseParcelizer) {
            return;
        }
        createFloatList.Companion companion = createFloatList.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        Intent intentRemoteActionCompatParcelizer = createFloatList.Companion.RemoteActionCompatParcelizer(contextRequireContext);
        intentRemoteActionCompatParcelizer.setFlags(268468224);
        startActivity(intentRemoteActionCompatParcelizer);
        BaseActivity.AudioAttributesImplBaseParcelizer = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleMediaPlayPauseIfPendingOnHandler(StreetViewPanorama streetViewPanorama) {
        streetViewPanorama.requireActivity().onBackPressed();
    }

    private final void read() {
        AudioAttributesCompatParcelizer().AudioAttributesImplBaseParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.toScreenLocation
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StreetViewPanorama.handleMediaPlayPauseIfPendingOnHandler(this.read);
            }
        });
        AudioAttributesCompatParcelizer().AudioAttributesImplApi21Parcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.isZoomGesturesEnabled
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StreetViewPanorama.onAddQueueItem(this.read);
            }
        });
        AudioAttributesCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver.setOnClickListener(new View.OnClickListener() { // from class: o.pointToOrientation
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StreetViewPanorama.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(this.RemoteActionCompatParcelizer);
            }
        });
        AudioAttributesCompatParcelizer().RatingCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.isStreetNamesEnabled
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                StreetViewPanorama.read(this.read, z);
            }
        });
        AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.isUserNavigationEnabled
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StreetViewPanorama.onPlay(this.RemoteActionCompatParcelizer);
            }
        });
        AudioAttributesCompatParcelizer().write.setOnClickListener(new View.OnClickListener() { // from class: o.orientationToPoint
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StreetViewPanorama.onFastForward(this.write);
            }
        });
        AudioAttributesCompatParcelizer().IconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.animateTo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StreetViewPanorama.onMediaButtonEvent(this.read);
            }
        });
        AudioAttributesCompatParcelizer().onCommand.setOnClickListener(new View.OnClickListener() { // from class: o.setOnStreetViewPanoramaClickListener
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StreetViewPanorama.onPlayFromMediaId(this.read);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAddQueueItem(StreetViewPanorama streetViewPanorama) {
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8 = streetViewPanorama.AudioAttributesImplApi21Parcelizer;
        setClientDataHash.Companion companion = setClientDataHash.INSTANCE;
        Context contextRequireContext = streetViewPanorama.requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        r8lambdaibk6u1hk7j3awkl_wn934v2uvi8.read(setClientDataHash.Companion.read(contextRequireContext));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(StreetViewPanorama streetViewPanorama) {
        NavigationViewSavedState.Companion companion = NavigationViewSavedState.INSTANCE;
        Context contextRequireContext = streetViewPanorama.requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        streetViewPanorama.startActivity(NavigationViewSavedState.Companion.write(contextRequireContext, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(StreetViewPanorama streetViewPanorama, boolean z) {
        streetViewPanorama.AudioAttributesCompatParcelizer(z);
        streetViewPanorama.RemoteActionCompatParcelizer().read(new StreetViewPanoramaFragmentzzb.MediaBrowserCompatCustomActionResultReceiver(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPlay(StreetViewPanorama streetViewPanorama) {
        getStreetViewPanoramaCamera.Companion companion = getStreetViewPanoramaCamera.INSTANCE;
        Context contextRequireContext = streetViewPanorama.requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        streetViewPanorama.startActivity(getStreetViewPanoramaCamera.Companion.write(contextRequireContext));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFastForward(StreetViewPanorama streetViewPanorama) {
        streetViewPanorama.RemoteActionCompatParcelizer().read(StreetViewPanoramaFragmentzzb.AudioAttributesImplApi21Parcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onMediaButtonEvent(StreetViewPanorama streetViewPanorama) {
        streetViewPanorama.RemoteActionCompatParcelizer().read(StreetViewPanoramaFragmentzzb.IconCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPlayFromMediaId(StreetViewPanorama streetViewPanorama) {
        streetViewPanorama.MediaBrowserCompatMediaItem();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesImplApi21Parcelizer() {
        getAutofillClient.Companion companion = getAutofillClient.INSTANCE;
        String string = getString(R.string.text_change_password);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String string2 = getString(R.string.text_change_password_subtitle);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        String string3 = getString(R.string.proceed_text);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
        String string4 = getString(R.string.btn_cancel);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string4, "");
        getAutofillClient getautofillclientAudioAttributesCompatParcelizer = getAutofillClient.Companion.AudioAttributesCompatParcelizer(string, string2, string3, string4, 0, null, false, false, null, 496);
        FragmentManager childFragmentManager = getChildFragmentManager();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childFragmentManager, "");
        getBrowserClient.IconCompatParcelizer(getautofillclientAudioAttributesCompatParcelizer, childFragmentManager, new getCreatedOnDateMs() { // from class: o.StreetViewPanoramaOnStreetViewPanoramaCameraChangeListener
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return StreetViewPanorama.onPrepareFromSearch(this.AudioAttributesCompatParcelizer);
            }
        }, null, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPrepareFromSearch(StreetViewPanorama streetViewPanorama) {
        streetViewPanorama.RemoteActionCompatParcelizer().read(StreetViewPanoramaFragmentzzb.AudioAttributesCompatParcelizer.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(String p0) {
        getAutofillClient.Companion companion = getAutofillClient.INSTANCE;
        String string = getString(R.string.btn_ok);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        getAutofillClient getautofillclientAudioAttributesCompatParcelizer = getAutofillClient.Companion.AudioAttributesCompatParcelizer(null, p0, string, null, 0, null, false, false, null, 505);
        FragmentManager childFragmentManager = getChildFragmentManager();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childFragmentManager, "");
        getBrowserClient.IconCompatParcelizer(getautofillclientAudioAttributesCompatParcelizer, childFragmentManager, new getCreatedOnDateMs() { // from class: o.setOnStreetViewPanoramaCameraChangeListener
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return StreetViewPanorama.onPrepare(this.IconCompatParcelizer);
            }
        }, null, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPrepare(StreetViewPanorama streetViewPanorama) {
        streetViewPanorama.RemoteActionCompatParcelizer().read(StreetViewPanoramaFragmentzzb.RemoteActionCompatParcelizer.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    private final void MediaBrowserCompatMediaItem() {
        getAutofillClient.Companion companion = getAutofillClient.INSTANCE;
        String string = getString(R.string.text_logout_msg);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String string2 = getString(R.string.text_logout_msg_warn);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        String string3 = getString(R.string.logout);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
        String string4 = getString(R.string.btn_cancel);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string4, "");
        getAutofillClient getautofillclientAudioAttributesCompatParcelizer = getAutofillClient.Companion.AudioAttributesCompatParcelizer(string, string2, string3, string4, R.drawable.ic_logout_v2, null, false, false, null, 480);
        FragmentManager childFragmentManager = getChildFragmentManager();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childFragmentManager, "");
        getBrowserClient.IconCompatParcelizer(getautofillclientAudioAttributesCompatParcelizer, childFragmentManager, new getCreatedOnDateMs() { // from class: o.setPanningGesturesEnabled
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return StreetViewPanorama.onPlayFromSearch(this.IconCompatParcelizer);
            }
        }, null, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPlayFromSearch(StreetViewPanorama streetViewPanorama) {
        streetViewPanorama.RemoteActionCompatParcelizer().read(StreetViewPanoramaFragmentzzb.read.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(CourseConfigV2.SettingsItem p0) {
        if (p0 == CourseConfigV2.SettingsItem.THEME || p0 == CourseConfigV2.SettingsItem.VIBRATION) {
            TextView textView = AudioAttributesCompatParcelizer().onAddQueueItem;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(textView);
        }
        if (p0 == CourseConfigV2.SettingsItem.RESET || p0 == CourseConfigV2.SettingsItem.CHANGE_PASSWORD || p0 == CourseConfigV2.SettingsItem.CHANGE_PH_NO || p0 == CourseConfigV2.SettingsItem.KYC_VERIFICATION) {
            TextView textView2 = AudioAttributesCompatParcelizer().MediaBrowserCompatSearchResultReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(textView2);
        }
        int i = IconCompatParcelizer.read[p0.ordinal()];
        if (i == 1) {
            CardView cardView = AudioAttributesCompatParcelizer().read;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardView, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(cardView);
            return;
        }
        if (i == 2) {
            CardView cardView2 = AudioAttributesCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardView2, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(cardView2);
            return;
        }
        if (i == 3) {
            CardView cardView3 = AudioAttributesCompatParcelizer().MediaBrowserCompatItemReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardView3, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(cardView3);
            return;
        }
        if (i == 4) {
            CardView cardView4 = AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardView4, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(cardView4);
        } else if (i == 5) {
            CardView cardView5 = AudioAttributesCompatParcelizer().write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardView5, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(cardView5);
        } else {
            if (i != 7) {
                return;
            }
            CardView cardView6 = AudioAttributesCompatParcelizer().IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardView6, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(cardView6);
            TextView textView3 = AudioAttributesCompatParcelizer().handleMediaPlayPauseIfPendingOnHandler;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView3, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(textView3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(StreetViewPanoramaFragment p0) {
        RemoteActionCompatParcelizer(p0);
        read(p0.getMediaBrowserCompatItemReceiver());
        AudioAttributesImplBaseParcelizer();
        AudioAttributesCompatParcelizer(p0.getAudioAttributesImplApi26Parcelizer());
        RemoteActionCompatParcelizer(p0.getRemoteActionCompatParcelizer());
    }

    private final void RemoteActionCompatParcelizer(final StreetViewPanoramaFragment p0) {
        AudioAttributesCompatParcelizer().onPlayFromMediaId.setText(p0.getIconCompatParcelizer());
        AudioAttributesCompatParcelizer().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.setText(p0.getRead());
        AudioAttributesCompatParcelizer().onCustomAction.setText(p0.getAudioAttributesCompatParcelizer());
        DefaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener = AudioAttributesCompatParcelizer().AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener, "");
        PublicKeyCredentialBuilder.AudioAttributesCompatParcelizer(defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener, p0.getAudioAttributesImplBaseParcelizer(), p0.getWrite(), p0.getMediaBrowserCompatCustomActionResultReceiver(), getRawId.read, new getCreatedOnDateMs() { // from class: o.isPanningGesturesEnabled
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return StreetViewPanorama.read(this.AudioAttributesCompatParcelizer, p0);
            }
        });
        AudioAttributesCompatParcelizer(p0.getMediaBrowserCompatCustomActionResultReceiver());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(StreetViewPanorama streetViewPanorama, StreetViewPanoramaFragment streetViewPanoramaFragment) {
        buildDownloadCompletedNotification.write(streetViewPanorama.AudioAttributesCompatParcelizer().AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer, streetViewPanoramaFragment.getWrite());
        return getShowPopup.INSTANCE;
    }

    private final void read(boolean p0) {
        if (p0) {
            AudioAttributesCompatParcelizer().onMediaButtonEvent.setText(getString(R.string.my_plan));
            AudioAttributesCompatParcelizer().read.setOnClickListener(new View.OnClickListener() { // from class: o.setOnStreetViewPanoramaLongClickListener
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StreetViewPanorama.onPause(this.AudioAttributesCompatParcelizer);
                }
            });
        } else {
            AudioAttributesCompatParcelizer().onMediaButtonEvent.setText(getString(R.string.plan_subscribe));
            AudioAttributesCompatParcelizer().read.setOnClickListener(new View.OnClickListener() { // from class: o.setOnStreetViewPanoramaChangeListener
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StreetViewPanorama.onPlayFromUri(this.AudioAttributesCompatParcelizer);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPause(StreetViewPanorama streetViewPanorama) {
        streetViewPanorama.RemoteActionCompatParcelizer().read(StreetViewPanoramaFragmentzzb.AudioAttributesImplBaseParcelizer.INSTANCE);
        packageManager.Companion companion = packageManager.INSTANCE;
        maybeGetTypeVariable maybegettypevariableRequireActivity = streetViewPanorama.requireActivity();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(maybegettypevariableRequireActivity, "");
        streetViewPanorama.startActivity(packageManager.Companion.RemoteActionCompatParcelizer(maybegettypevariableRequireActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPlayFromUri(StreetViewPanorama streetViewPanorama) {
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8 = streetViewPanorama.RemoteActionCompatParcelizer;
        PlanActivity.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = PlanActivity.RemoteActionCompatParcelizer;
        Context contextRequireContext = streetViewPanorama.requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        String lowerCase = "SETTINGS".toLowerCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
        r8lambdaibk6u1hk7j3awkl_wn934v2uvi8.read(PlanActivity.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(contextRequireContext, "Pro Subscription Dialog", lowerCase));
    }

    private final void AudioAttributesImplBaseParcelizer() {
        String string;
        if (AppThemeManager.RemoteActionCompatParcelizer()) {
            string = getString(R.string.title_theme_system);
        } else {
            int i = IconCompatParcelizer.RemoteActionCompatParcelizer[AppThemeManager.read().ordinal()];
            if (i == 1) {
                string = getString(R.string.title_theme_light);
            } else if (i == 2) {
                string = getString(R.string.title_theme_dark);
            } else if (i == 3) {
                string = getString(R.string.title_theme_sepia);
            } else {
                string = "";
            }
        }
        toMagicModuleMetaRepoModel.write((Object) string);
        RemoteActionCompatParcelizer(string);
    }

    private final void RemoteActionCompatParcelizer(String p0) {
        AudioAttributesCompatParcelizer().onPlay.setText(getString(R.string.f_mcq_theme, p0));
    }

    private final void AudioAttributesCompatParcelizer(boolean p0) {
        isIndependent isindependentAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        isindependentAudioAttributesCompatParcelizer.RatingCompat.setChecked(p0);
        if (p0) {
            isindependentAudioAttributesCompatParcelizer.onFastForward.setText(getString(R.string.f_vibration_settings, getString(R.string.text_on)));
        } else {
            isindependentAudioAttributesCompatParcelizer.onFastForward.setText(getString(R.string.f_vibration_settings, getString(R.string.text_off)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void RemoteActionCompatParcelizer(int r4) {
        /*
            r3 = this;
            o.shouldEscapeCharacter$write r0 = kotlin.shouldEscapeCharacter.INSTANCE
            android.content.Context r0 = r3.requireContext()
            java.lang.String r1 = ""
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r0, r1)
            r2 = 2130968916(0x7f040154, float:1.75465E38)
            int r0 = kotlin.shouldEscapeCharacter.Companion.AudioAttributesCompatParcelizer(r0, r2)
            r2 = 3
            if (r4 == r2) goto L34
            r2 = 4
            if (r4 == r2) goto L20
            r2 = 8
            if (r4 == r2) goto L34
            r4 = 2131953347(0x7f1306c3, float:1.9543162E38)
            goto L47
        L20:
            o.shouldEscapeCharacter$write r4 = kotlin.shouldEscapeCharacter.INSTANCE
            android.content.Context r4 = r3.requireContext()
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r4, r1)
            r0 = 2130969681(0x7f040451, float:1.754805E38)
            int r0 = kotlin.shouldEscapeCharacter.Companion.AudioAttributesCompatParcelizer(r4, r0)
            r4 = 2131953351(0x7f1306c7, float:1.954317E38)
            goto L47
        L34:
            o.shouldEscapeCharacter$write r4 = kotlin.shouldEscapeCharacter.INSTANCE
            android.content.Context r4 = r3.requireContext()
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r4, r1)
            r0 = 2130968951(0x7f040177, float:1.754657E38)
            int r0 = kotlin.shouldEscapeCharacter.Companion.AudioAttributesCompatParcelizer(r4, r0)
            r4 = 2131953357(0x7f1306cd, float:1.9543183E38)
        L47:
            r3.IconCompatParcelizer(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.StreetViewPanorama.RemoteActionCompatParcelizer(int):void");
    }

    private final void IconCompatParcelizer(int p0, int p1) {
        AudioAttributesCompatParcelizer().handleMediaPlayPauseIfPendingOnHandler.setBackgroundColor(p0);
        AudioAttributesCompatParcelizer().handleMediaPlayPauseIfPendingOnHandler.setText(getString(p1));
    }

    private final void AudioAttributesCompatParcelizer(String p0) {
        AudioAttributesCompatParcelizer().AudioAttributesImplApi26Parcelizer.AudioAttributesImplApi21Parcelizer.setText(p0);
    }

    /* JADX INFO: renamed from: o.StreetViewPanorama$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/StreetViewPanorama$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/StreetViewPanorama;", "AudioAttributesCompatParcelizer", "()Lo/StreetViewPanorama;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static StreetViewPanorama AudioAttributesCompatParcelizer() {
            return new StreetViewPanorama();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
