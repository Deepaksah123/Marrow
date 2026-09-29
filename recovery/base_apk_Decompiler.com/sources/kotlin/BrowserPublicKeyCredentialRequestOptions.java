package kotlin;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.Glide;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.common.util.DeviceProperties;
import com.marrow.R;
import com.marrow.designsystem.theme.AppTheme;
import com.marrow.designsystem.theme.ThemeKt;
import com.marrow2.ui.profile.viewmodel.ProfileEditViewModel;
import de.hdodenhof.circleimageview.CircleImageView;
import java.io.File;
import java.util.List;
import kotlin.BrowserPublicKeyCredentialRequestOptions;
import kotlin.CmcdHeadersFactoryCmcdStatusBuilder;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin._init_lambda4;
import kotlin.getAttestationConveyancePreference;
import kotlin.setAuthenticationExtensionsClientOutputs;
import kotlin.shouldEscapeCharacter;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0003J'\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u0003J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001d\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u0003J\u0017\u0010 \u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\"\u001a\u00020\rH\u0002¢\u0006\u0004\b\"\u0010\u0003J\u000f\u0010#\u001a\u00020\rH\u0002¢\u0006\u0004\b#\u0010\u0003J\u000f\u0010$\u001a\u00020\rH\u0002¢\u0006\u0004\b$\u0010\u0003J\u000f\u0010%\u001a\u00020\rH\u0002¢\u0006\u0004\b%\u0010\u0003J\u0017\u0010 \u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0013H\u0002¢\u0006\u0004\b \u0010&J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010&J\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0010\u0010\u001aJ\u0017\u0010 \u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0015H\u0002¢\u0006\u0004\b \u0010\u001aJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0011\u0010\u001aJ\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u001aJ\u000f\u0010'\u001a\u00020\rH\u0002¢\u0006\u0004\b'\u0010\u0003R\u0016\u0010 \u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010)R\u001b\u0010\u0018\u001a\u00020*8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010+\u001a\u0004\b,\u0010-R\u0018\u0010\u0011\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b,\u0010/R\u0016\u0010\u0010\u001a\u00020\u00138\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0019\u00100R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0016\u00100R\u001e\u0010,\u001a\f\u0012\b\u0012\u0006*\u00020\u00150\u0015018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u00102R\u001e\u0010#\u001a\f\u0012\b\u0012\u0006*\u00020\u00130\u0013018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u00102R\u001e\u0010$\u001a\f\u0012\b\u0012\u0006*\u00020\u00150\u0015018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u00102R\u001e\u0010\u001d\u001a\f\u0012\b\u0012\u0006*\u00020303018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u00102R\u001e\u0010\u0019\u001a\f\u0012\b\u0012\u0006*\u00020404018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u00102"}, d2 = {"Lo/BrowserPublicKeyCredentialRequestOptions;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "write", "read", "handleMediaPlayPauseIfPendingOnHandler", "Landroid/net/Uri;", "", "", "AudioAttributesCompatParcelizer", "(Landroid/net/Uri;ZLjava/lang/String;)V", "RemoteActionCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "(Ljava/lang/String;)V", "onCommand", "RatingCompat", "MediaBrowserCompatCustomActionResultReceiver", "MediaDescriptionCompat", "Lo/setAuthenticatorAttachment;", "IconCompatParcelizer", "(Lo/setAuthenticatorAttachment;)V", "MediaMetadataCompat", "MediaBrowserCompatItemReceiver", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatSearchResultReceiver", "(Landroid/net/Uri;)V", "MediaBrowserCompatMediaItem", "Lo/HlsChunkSourceSegmentBaseHolder;", "Lo/HlsChunkSourceSegmentBaseHolder;", "Lcom/marrow2/ui/profile/viewmodel/ProfileEditViewModel;", "Lo/RenewEligible;", "AudioAttributesImplApi26Parcelizer", "()Lcom/marrow2/ui/profile/viewmodel/ProfileEditViewModel;", "Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap;", "Landroid/net/Uri;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;", "Lo/accessgetReportFullyDrawnExecutorp;", "Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BrowserPublicKeyCredentialRequestOptions extends BrowserPublicKeyCredentialCreationOptionsBuilder {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Uri AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private Uri write;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private Bitmap read;
    private final r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<String> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Uri> MediaBrowserCompatItemReceiver;
    private final r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<accessgetReportFullyDrawnExecutorp> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<String> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final RenewEligible RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private HlsChunkSourceSegmentBaseHolder IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> AudioAttributesImplApi21Parcelizer;

    public BrowserPublicKeyCredentialRequestOptions() {
        BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass3(new AnonymousClass1(browserPublicKeyCredentialRequestOptions)));
        this.RemoteActionCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(ProfileEditViewModel.class), new AnonymousClass5(renewEligibleWrite), new AnonymousClass4(renewEligibleWrite), new AnonymousClass2(browserPublicKeyCredentialRequestOptions, renewEligibleWrite));
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<String> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult = registerForActivityResult(new _init_lambda4.write(), new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() { // from class: o.COSEAlgorithmIdentifier
            @Override // kotlin.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
            public final void IconCompatParcelizer(Object obj) {
                BrowserPublicKeyCredentialRequestOptions.IconCompatParcelizer(this.RemoteActionCompatParcelizer, (Boolean) obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult, "");
        this.AudioAttributesImplApi26Parcelizer = r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult;
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Uri> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult2 = registerForActivityResult(new _init_lambda4.AudioAttributesImplApi21Parcelizer(), new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() { // from class: o.toCoseValue
            @Override // kotlin.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
            public final void IconCompatParcelizer(Object obj) {
                BrowserPublicKeyCredentialRequestOptions.read(this.read, (Boolean) obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult2, "");
        this.MediaBrowserCompatItemReceiver = r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult2;
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<String> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult3 = registerForActivityResult(new _init_lambda4.read(), new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() { // from class: o.ErrorCode
            @Override // kotlin.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
            public final void IconCompatParcelizer(Object obj) {
                BrowserPublicKeyCredentialRequestOptions.AudioAttributesImplBaseParcelizer(this.RemoteActionCompatParcelizer, (Uri) obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult3, "");
        this.AudioAttributesImplBaseParcelizer = r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult3;
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<accessgetReportFullyDrawnExecutorp> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult4 = registerForActivityResult(new _init_lambda4.IconCompatParcelizer(), new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() { // from class: o.BrowserPublicKeyCredentialRequestOptionsBuilder
            @Override // kotlin.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
            public final void IconCompatParcelizer(Object obj) {
                BrowserPublicKeyCredentialRequestOptions.AudioAttributesImplApi21Parcelizer(this.IconCompatParcelizer, (Uri) obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult4, "");
        this.MediaBrowserCompatCustomActionResultReceiver = r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult4;
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult5 = registerForActivityResult(new _init_lambda4.AudioAttributesImplApi26Parcelizer(), new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() { // from class: o.DevicePublicKeyStringDef
            @Override // kotlin.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
            public final void IconCompatParcelizer(Object obj) {
                BrowserPublicKeyCredentialRequestOptions.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, (ActivityResult) obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult5, "");
        this.AudioAttributesImplApi21Parcelizer = r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProfileEditViewModel AudioAttributesImplApi26Parcelizer() {
        return (ProfileEditViewModel) this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions, Boolean bool) {
        toMagicModuleMetaRepoModel.write(bool, "");
        if (bool.booleanValue()) {
            browserPublicKeyCredentialRequestOptions.MediaBrowserCompatSearchResultReceiver();
            return;
        }
        BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions2 = browserPublicKeyCredentialRequestOptions;
        String string = browserPublicKeyCredentialRequestOptions.getString(R.string.toast_profile_app_do_not_have_permission);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(browserPublicKeyCredentialRequestOptions2, string, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions, Boolean bool) {
        toMagicModuleMetaRepoModel.write(bool, "");
        if (bool.booleanValue()) {
            Uri uri = browserPublicKeyCredentialRequestOptions.AudioAttributesCompatParcelizer;
            if (uri == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                uri = null;
            }
            browserPublicKeyCredentialRequestOptions.IconCompatParcelizer(uri);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesImplBaseParcelizer(BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions, Uri uri) {
        if (uri != null) {
            browserPublicKeyCredentialRequestOptions.IconCompatParcelizer(uri);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesImplApi21Parcelizer(BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions, Uri uri) {
        if (uri != null) {
            browserPublicKeyCredentialRequestOptions.IconCompatParcelizer(uri);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions, ActivityResult activityResult) {
        Uri data;
        toMagicModuleMetaRepoModel.write(activityResult, "");
        if (activityResult.getRemoteActionCompatParcelizer() == -1) {
            ProfileEditViewModel profileEditViewModelAudioAttributesImplApi26Parcelizer = browserPublicKeyCredentialRequestOptions.AudioAttributesImplApi26Parcelizer();
            Intent read2 = activityResult.getRead();
            if ((read2 == null || (data = read2.getData()) == null) && (data = browserPublicKeyCredentialRequestOptions.write) == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                data = null;
            }
            profileEditViewModelAudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(new setAuthenticationExtensionsClientOutputs.IconCompatParcelizer(data));
        }
    }

    /* JADX INFO: renamed from: o.BrowserPublicKeyCredentialRequestOptions$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "write", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$write;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Fragment fragment) {
            super(0);
            this.$write = fragment;
        }
    }

    /* JADX INFO: renamed from: o.BrowserPublicKeyCredentialRequestOptions$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "AudioAttributesCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$AudioAttributesCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$AudioAttributesCompatParcelizer = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.BrowserPublicKeyCredentialRequestOptions$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "read", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$RemoteActionCompatParcelizer).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(RenewEligible renewEligible) {
            super(0);
            this.$RemoteActionCompatParcelizer = renewEligible;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolderWrite = HlsChunkSourceSegmentBaseHolder.write(p0, p1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(hlsChunkSourceSegmentBaseHolderWrite, "");
        this.IconCompatParcelizer = hlsChunkSourceSegmentBaseHolderWrite;
        if (hlsChunkSourceSegmentBaseHolderWrite == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsChunkSourceSegmentBaseHolderWrite = null;
        }
        ConstraintLayout constraintLayoutIconCompatParcelizer = hlsChunkSourceSegmentBaseHolderWrite.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer, "");
        return constraintLayoutIconCompatParcelizer;
    }

    /* JADX INFO: renamed from: o.BrowserPublicKeyCredentialRequestOptions$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "AudioAttributesCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $AudioAttributesCompatParcelizer = null;
        private /* synthetic */ RenewEligible $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
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

    /* JADX INFO: renamed from: o.BrowserPublicKeyCredentialRequestOptions$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "IconCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ RenewEligible $IconCompatParcelizer;
        private /* synthetic */ Fragment $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$IconCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$RemoteActionCompatParcelizer.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$RemoteActionCompatParcelizer = fragment;
            this.$IconCompatParcelizer = renewEligible;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        read();
        AudioAttributesImplApi21Parcelizer();
        RemoteActionCompatParcelizer();
        handleMediaPlayPauseIfPendingOnHandler();
    }

    private final void write() {
        HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolder = this.IconCompatParcelizer;
        if (hlsChunkSourceSegmentBaseHolder == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsChunkSourceSegmentBaseHolder = null;
        }
        hlsChunkSourceSegmentBaseHolder.AudioAttributesCompatParcelizer.setContent(multiplyFft.IconCompatParcelizer(1386520144, true, new MagicModuleSubmissionRequestBody() { // from class: o.fromCoseValue
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return BrowserPublicKeyCredentialRequestOptions.RemoteActionCompatParcelizer(this.read, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(final BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1386520144, i, -1, "com.marrow2.ui.profile.fragment.ProfileEditFragment.bindImageDialog.<anonymous> (ProfileEditFragment.kt:128)");
            }
            ThemeKt.read((AppTheme) null, false, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) multiplyFft.AudioAttributesCompatParcelizer(548272336, true, new MagicModuleSubmissionRequestBody() { // from class: o.toErrorCode
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return BrowserPublicKeyCredentialRequestOptions.write(this.write, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, RendererCapabilities.MODE_SUPPORT_MASK, 3);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(final BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(548272336, i, -1, "com.marrow2.ui.profile.fragment.ProfileEditFragment.bindImageDialog.<anonymous>.<anonymous> (ProfileEditFragment.kt:129)");
            }
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(browserPublicKeyCredentialRequestOptions);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.getCode
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return BrowserPublicKeyCredentialRequestOptions.onMediaButtonEvent(this.read);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            getCreatedOnDateMs getcreatedondatems = (getCreatedOnDateMs) objOnPause;
            boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescape.IconCompatParcelizer(browserPublicKeyCredentialRequestOptions);
            Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer2 || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = new getCreatedOnDateMs() { // from class: o.EC2Algorithm
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return BrowserPublicKeyCredentialRequestOptions.onPause(this.AudioAttributesCompatParcelizer);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
            }
            getCreatedOnDateMs getcreatedondatems2 = (getCreatedOnDateMs) objOnPause2;
            boolean zIconCompatParcelizer3 = _handleunrecognizedcharacterescape.IconCompatParcelizer(browserPublicKeyCredentialRequestOptions);
            Object objOnPause3 = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer3 || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause3 = new getCreatedOnDateMs() { // from class: o.FidoAppIdExtension
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return BrowserPublicKeyCredentialRequestOptions.onPlayFromSearch(this.RemoteActionCompatParcelizer);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause3);
            }
            GoogleThirdPartyPaymentExtension.write((getCreatedOnDateMs<getShowPopup>) getcreatedondatems, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems2, (getCreatedOnDateMs<getShowPopup>) objOnPause3, _handleunrecognizedcharacterescape, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onMediaButtonEvent(BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions) {
        HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolder = browserPublicKeyCredentialRequestOptions.IconCompatParcelizer;
        HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolder2 = null;
        if (hlsChunkSourceSegmentBaseHolder == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsChunkSourceSegmentBaseHolder = null;
        }
        ComposeView composeView = hlsChunkSourceSegmentBaseHolder.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(composeView, "");
        composeView.setVisibility(8);
        HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolder3 = browserPublicKeyCredentialRequestOptions.IconCompatParcelizer;
        if (hlsChunkSourceSegmentBaseHolder3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            hlsChunkSourceSegmentBaseHolder2 = hlsChunkSourceSegmentBaseHolder3;
        }
        ComposeView composeView2 = hlsChunkSourceSegmentBaseHolder2.AudioAttributesCompatParcelizer;
        getTimeoutSeconds gettimeoutseconds = getTimeoutSeconds.IconCompatParcelizer;
        composeView2.setContent(getTimeoutSeconds.read());
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPause(BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions) {
        browserPublicKeyCredentialRequestOptions.MediaBrowserCompatItemReceiver();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPlayFromSearch(BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions) {
        browserPublicKeyCredentialRequestOptions.AudioAttributesImplBaseParcelizer();
        return getShowPopup.INSTANCE;
    }

    private final void read() {
        HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolder = this.IconCompatParcelizer;
        HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolder2 = null;
        if (hlsChunkSourceSegmentBaseHolder == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsChunkSourceSegmentBaseHolder = null;
        }
        ConstraintLayout constraintLayout = hlsChunkSourceSegmentBaseHolder.AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        getHttpMethodString.read((View) constraintLayout, true, false, true, true, 0, 50);
        HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolder3 = this.IconCompatParcelizer;
        if (hlsChunkSourceSegmentBaseHolder3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            hlsChunkSourceSegmentBaseHolder2 = hlsChunkSourceSegmentBaseHolder3;
        }
        ScrollView scrollView = hlsChunkSourceSegmentBaseHolder2.MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollView, "");
        getHttpMethodString.read((View) scrollView, false, true, true, true, 0, 49);
    }

    private void handleMediaPlayPauseIfPendingOnHandler() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolder = this.IconCompatParcelizer;
            if (hlsChunkSourceSegmentBaseHolder == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                hlsChunkSourceSegmentBaseHolder = null;
            }
            ScrollView scrollView = hlsChunkSourceSegmentBaseHolder.MediaBrowserCompatItemReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollView, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext, scrollView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(final Uri p0, boolean p1, String p2) {
        HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolder = this.IconCompatParcelizer;
        if (hlsChunkSourceSegmentBaseHolder == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsChunkSourceSegmentBaseHolder = null;
        }
        DefaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener = hlsChunkSourceSegmentBaseHolder.AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener, "");
        String string = p0.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        PublicKeyCredentialBuilder.AudioAttributesCompatParcelizer(defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener, p1, string, p2, getRawId.IconCompatParcelizer, new getCreatedOnDateMs() { // from class: o.ErrorCodeUnsupportedErrorCodeException
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return BrowserPublicKeyCredentialRequestOptions.MediaBrowserCompatCustomActionResultReceiver(this.RemoteActionCompatParcelizer, p0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions, Uri uri) {
        Glide.write(browserPublicKeyCredentialRequestOptions.requireContext()).RemoteActionCompatParcelizer().write(uri).read(browserPublicKeyCredentialRequestOptions.new AudioAttributesImplApi21Parcelizer());
        return getShowPopup.INSTANCE;
    }

    public static final class AudioAttributesImplApi21Parcelizer extends updateQueuedPeriods<Bitmap> {
        @Override // kotlin.MediaSourceInfoHolder
        public final void AudioAttributesCompatParcelizer(Drawable drawable) {
        }

        AudioAttributesImplApi21Parcelizer() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MediaSourceInfoHolder
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public void RemoteActionCompatParcelizer(Bitmap bitmap) {
            toMagicModuleMetaRepoModel.write(bitmap, "");
            BrowserPublicKeyCredentialRequestOptions.this.read = bitmap;
            HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolder = BrowserPublicKeyCredentialRequestOptions.this.IconCompatParcelizer;
            if (hlsChunkSourceSegmentBaseHolder == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                hlsChunkSourceSegmentBaseHolder = null;
            }
            hlsChunkSourceSegmentBaseHolder.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer.setImageBitmap(BrowserPublicKeyCredentialRequestOptions.this.read);
            BrowserPublicKeyCredentialRequestOptions.this.MediaBrowserCompatMediaItem();
        }
    }

    private final void RemoteActionCompatParcelizer() {
        final HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolder = this.IconCompatParcelizer;
        if (hlsChunkSourceSegmentBaseHolder == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsChunkSourceSegmentBaseHolder = null;
        }
        TextView textView = hlsChunkSourceSegmentBaseHolder.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        bytesRead.IconCompatParcelizer(textView, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.getPublicKeyCredentialRequestOptions
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return BrowserPublicKeyCredentialRequestOptions.IconCompatParcelizer(this.read, hlsChunkSourceSegmentBaseHolder);
            }
        });
        ImageView imageView = hlsChunkSourceSegmentBaseHolder.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        bytesRead.IconCompatParcelizer(imageView, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.getAppId
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return BrowserPublicKeyCredentialRequestOptions.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(this.RemoteActionCompatParcelizer);
            }
        });
        ImageView imageView2 = hlsChunkSourceSegmentBaseHolder.AudioAttributesImplBaseParcelizer.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView2, "");
        bytesRead.IconCompatParcelizer(imageView2, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.setPublicKeyCredentialCreationOptions
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return BrowserPublicKeyCredentialRequestOptions.onAddQueueItem(this.RemoteActionCompatParcelizer);
            }
        });
        TextView textView2 = hlsChunkSourceSegmentBaseHolder.AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
        bytesRead.IconCompatParcelizer(textView2, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.setPublicKeyCredentialRequestOptions
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return BrowserPublicKeyCredentialRequestOptions.onFastForward(this.IconCompatParcelizer);
            }
        });
        TextView textView3 = hlsChunkSourceSegmentBaseHolder.MediaBrowserCompatMediaItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView3, "");
        bytesRead.IconCompatParcelizer(textView3, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.COSEAlgorithmIdentifierUnsupportedAlgorithmIdentifierException
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return BrowserPublicKeyCredentialRequestOptions.onPlayFromMediaId(this.read);
            }
        });
        ImageView imageView3 = hlsChunkSourceSegmentBaseHolder.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView3, "");
        bytesRead.IconCompatParcelizer(imageView3, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.BrowserRequestOptions
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return BrowserPublicKeyCredentialRequestOptions.onPlay(this.RemoteActionCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions, HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolder) {
        String string;
        HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolder2 = browserPublicKeyCredentialRequestOptions.IconCompatParcelizer;
        HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolder3 = null;
        if (hlsChunkSourceSegmentBaseHolder2 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsChunkSourceSegmentBaseHolder2 = null;
        }
        EditText editText = hlsChunkSourceSegmentBaseHolder2.MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(editText, "");
        if (editText.getVisibility() == 0) {
            HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolder4 = browserPublicKeyCredentialRequestOptions.IconCompatParcelizer;
            if (hlsChunkSourceSegmentBaseHolder4 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                hlsChunkSourceSegmentBaseHolder4 = null;
            }
            string = hlsChunkSourceSegmentBaseHolder4.MediaBrowserCompatCustomActionResultReceiver.getText().toString();
        } else {
            string = hlsChunkSourceSegmentBaseHolder.RatingCompat.getText().toString();
        }
        String str = string;
        ProfileEditViewModel profileEditViewModelAudioAttributesImplApi26Parcelizer = browserPublicKeyCredentialRequestOptions.AudioAttributesImplApi26Parcelizer();
        String string2 = hlsChunkSourceSegmentBaseHolder.MediaBrowserCompatMediaItem.getText().toString();
        String string3 = hlsChunkSourceSegmentBaseHolder.AudioAttributesImplApi26Parcelizer.getText().toString();
        HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolder5 = browserPublicKeyCredentialRequestOptions.IconCompatParcelizer;
        if (hlsChunkSourceSegmentBaseHolder5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            hlsChunkSourceSegmentBaseHolder3 = hlsChunkSourceSegmentBaseHolder5;
        }
        profileEditViewModelAudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(new setAuthenticationExtensionsClientOutputs.read(new setAuthenticatorAttachment("", str, string2, string3, hlsChunkSourceSegmentBaseHolder3.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer.getText().toString(), browserPublicKeyCredentialRequestOptions.read, false, 64, null)));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions) {
        browserPublicKeyCredentialRequestOptions.AudioAttributesImplApi26Parcelizer().AudioAttributesCompatParcelizer(setAuthenticationExtensionsClientOutputs.RemoteActionCompatParcelizer.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onAddQueueItem(BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions) {
        browserPublicKeyCredentialRequestOptions.AudioAttributesImplApi26Parcelizer().AudioAttributesCompatParcelizer(setAuthenticationExtensionsClientOutputs.write.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onFastForward(BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions) {
        BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions2 = browserPublicKeyCredentialRequestOptions;
        String string = browserPublicKeyCredentialRequestOptions.getString(R.string.college_name_change_error);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(browserPublicKeyCredentialRequestOptions2, string, 0);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPlayFromMediaId(BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions) {
        BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions2 = browserPublicKeyCredentialRequestOptions;
        String string = browserPublicKeyCredentialRequestOptions.getString(R.string.toast_year_click_disable);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(browserPublicKeyCredentialRequestOptions2, string, 0);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPlay(BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions) {
        maybeGetTypeVariable activity = browserPublicKeyCredentialRequestOptions.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return getShowPopup.INSTANCE;
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isDark<getAttestationConveyancePreference> isdark = BrowserPublicKeyCredentialRequestOptions.this.AudioAttributesImplApi26Parcelizer().read();
                final BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions = BrowserPublicKeyCredentialRequestOptions.this;
                this.IconCompatParcelizer = 1;
                if (isdark.write(new getValidationToken() { // from class: o.BrowserPublicKeyCredentialRequestOptions.read.2
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((getAttestationConveyancePreference) obj2);
                    }

                    private Object IconCompatParcelizer(getAttestationConveyancePreference getattestationconveyancepreference) {
                        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getattestationconveyancepreference, getAttestationConveyancePreference.RemoteActionCompatParcelizer.INSTANCE)) {
                            if (getattestationconveyancepreference instanceof getAttestationConveyancePreference.AudioAttributesImplBaseParcelizer) {
                                CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(browserPublicKeyCredentialRequestOptions, ((getAttestationConveyancePreference.AudioAttributesImplBaseParcelizer) getattestationconveyancepreference).IconCompatParcelizer(), 0);
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getattestationconveyancepreference, getAttestationConveyancePreference.AudioAttributesImplApi21Parcelizer.INSTANCE)) {
                                browserPublicKeyCredentialRequestOptions.MediaDescriptionCompat();
                            } else if (getattestationconveyancepreference instanceof getAttestationConveyancePreference.AudioAttributesImplApi26Parcelizer) {
                                browserPublicKeyCredentialRequestOptions.IconCompatParcelizer(((getAttestationConveyancePreference.AudioAttributesImplApi26Parcelizer) getattestationconveyancepreference).IconCompatParcelizer());
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getattestationconveyancepreference, getAttestationConveyancePreference.write.INSTANCE)) {
                                maybeGetTypeVariable activity = browserPublicKeyCredentialRequestOptions.getActivity();
                                if (activity != null) {
                                    activity.finish();
                                }
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getattestationconveyancepreference, getAttestationConveyancePreference.read.INSTANCE)) {
                                browserPublicKeyCredentialRequestOptions.AudioAttributesCompatParcelizer();
                            } else if (getattestationconveyancepreference instanceof getAttestationConveyancePreference.IconCompatParcelizer) {
                                getAttestationConveyancePreference.IconCompatParcelizer iconCompatParcelizer = (getAttestationConveyancePreference.IconCompatParcelizer) getattestationconveyancepreference;
                                browserPublicKeyCredentialRequestOptions.AudioAttributesCompatParcelizer(iconCompatParcelizer.write(), iconCompatParcelizer.IconCompatParcelizer(), iconCompatParcelizer.read());
                            } else if (getattestationconveyancepreference instanceof getAttestationConveyancePreference.AudioAttributesCompatParcelizer) {
                                browserPublicKeyCredentialRequestOptions.RemoteActionCompatParcelizer(((getAttestationConveyancePreference.AudioAttributesCompatParcelizer) getattestationconveyancepreference).AudioAttributesCompatParcelizer());
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

        read(SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return BrowserPublicKeyCredentialRequestOptions.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions = this;
        setBitrateKbps.RemoteActionCompatParcelizer(browserPublicKeyCredentialRequestOptions, new read(null));
        setBitrateKbps.RemoteActionCompatParcelizer(browserPublicKeyCredentialRequestOptions, new AudioAttributesCompatParcelizer(null));
        setBitrateKbps.RemoteActionCompatParcelizer(browserPublicKeyCredentialRequestOptions, new IconCompatParcelizer(null));
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Boolean> setupdatedstatusIconCompatParcelizer = BrowserPublicKeyCredentialRequestOptions.this.AudioAttributesImplApi26Parcelizer().IconCompatParcelizer();
                final BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions = BrowserPublicKeyCredentialRequestOptions.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.BrowserPublicKeyCredentialRequestOptions.AudioAttributesCompatParcelizer.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read(((Boolean) obj2).booleanValue());
                    }

                    private Object read(boolean z) {
                        if (z) {
                            browserPublicKeyCredentialRequestOptions.RatingCompat();
                        } else {
                            browserPublicKeyCredentialRequestOptions.MediaBrowserCompatCustomActionResultReceiver();
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
            return BrowserPublicKeyCredentialRequestOptions.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        /* JADX INFO: renamed from: o.BrowserPublicKeyCredentialRequestOptions$IconCompatParcelizer$1, reason: invalid class name */
        static final class AnonymousClass1<T> implements getValidationToken {
            private /* synthetic */ BrowserPublicKeyCredentialRequestOptions write;

            @Override // kotlin.getValidationToken
            public final /* synthetic */ Object IconCompatParcelizer(Object obj, SampleVideos sampleVideos) {
                return RemoteActionCompatParcelizer(((Number) obj).intValue());
            }

            private Object RemoteActionCompatParcelizer(int i) {
                if (i == 4) {
                    HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolder = this.write.IconCompatParcelizer;
                    HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolder2 = null;
                    if (hlsChunkSourceSegmentBaseHolder == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                        hlsChunkSourceSegmentBaseHolder = null;
                    }
                    ImageView imageView = hlsChunkSourceSegmentBaseHolder.read;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
                    imageView.setVisibility(8);
                    HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolder3 = this.write.IconCompatParcelizer;
                    if (hlsChunkSourceSegmentBaseHolder3 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    } else {
                        hlsChunkSourceSegmentBaseHolder2 = hlsChunkSourceSegmentBaseHolder3;
                    }
                    TextView textView = hlsChunkSourceSegmentBaseHolder2.RatingCompat;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
                    final BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions = this.write;
                    bytesRead.IconCompatParcelizer(textView, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.FidoCredentialDetails
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return BrowserPublicKeyCredentialRequestOptions.IconCompatParcelizer.AnonymousClass1.RemoteActionCompatParcelizer(browserPublicKeyCredentialRequestOptions);
                        }
                    });
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final getShowPopup RemoteActionCompatParcelizer(BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions) {
                BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions2 = browserPublicKeyCredentialRequestOptions;
                String string = browserPublicKeyCredentialRequestOptions.getString(R.string.toast_name_click_disable);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(browserPublicKeyCredentialRequestOptions2, string, 0);
                return getShowPopup.INSTANCE;
            }

            AnonymousClass1(BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions) {
                this.write = browserPublicKeyCredentialRequestOptions;
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                if (BrowserPublicKeyCredentialRequestOptions.this.AudioAttributesImplApi26Parcelizer().AudioAttributesCompatParcelizer().write(new AnonymousClass1(BrowserPublicKeyCredentialRequestOptions.this), this) == objIconCompatParcelizer) {
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
            return BrowserPublicKeyCredentialRequestOptions.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(String p0) {
        onCommand();
        HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolder = this.IconCompatParcelizer;
        HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolder2 = null;
        if (hlsChunkSourceSegmentBaseHolder == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsChunkSourceSegmentBaseHolder = null;
        }
        hlsChunkSourceSegmentBaseHolder.MediaBrowserCompatCustomActionResultReceiver.setText(p0);
        HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolder3 = this.IconCompatParcelizer;
        if (hlsChunkSourceSegmentBaseHolder3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            hlsChunkSourceSegmentBaseHolder2 = hlsChunkSourceSegmentBaseHolder3;
        }
        hlsChunkSourceSegmentBaseHolder2.MediaBrowserCompatCustomActionResultReceiver.requestFocus();
    }

    private final void onCommand() {
        HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolder = this.IconCompatParcelizer;
        HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolder2 = null;
        if (hlsChunkSourceSegmentBaseHolder == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsChunkSourceSegmentBaseHolder = null;
        }
        TextView textView = hlsChunkSourceSegmentBaseHolder.RatingCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        textView.setVisibility(8);
        HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolder3 = this.IconCompatParcelizer;
        if (hlsChunkSourceSegmentBaseHolder3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsChunkSourceSegmentBaseHolder3 = null;
        }
        ImageView imageView = hlsChunkSourceSegmentBaseHolder3.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        imageView.setVisibility(8);
        HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolder4 = this.IconCompatParcelizer;
        if (hlsChunkSourceSegmentBaseHolder4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            hlsChunkSourceSegmentBaseHolder2 = hlsChunkSourceSegmentBaseHolder4;
        }
        EditText editText = hlsChunkSourceSegmentBaseHolder2.MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(editText, "");
        editText.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RatingCompat() {
        HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolder = this.IconCompatParcelizer;
        if (hlsChunkSourceSegmentBaseHolder == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsChunkSourceSegmentBaseHolder = null;
        }
        ProgressBar progressBar = hlsChunkSourceSegmentBaseHolder.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
        progressBar.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolder = this.IconCompatParcelizer;
        if (hlsChunkSourceSegmentBaseHolder == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsChunkSourceSegmentBaseHolder = null;
        }
        ProgressBar progressBar = hlsChunkSourceSegmentBaseHolder.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
        progressBar.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaDescriptionCompat() {
        String string = getString(R.string.error_only_english_alphabets_for_name);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(this, string, 0);
        shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
        HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolder = this.IconCompatParcelizer;
        if (hlsChunkSourceSegmentBaseHolder == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsChunkSourceSegmentBaseHolder = null;
        }
        shouldEscapeCharacter.Companion.IconCompatParcelizer(hlsChunkSourceSegmentBaseHolder.MediaBrowserCompatCustomActionResultReceiver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(final setAuthenticatorAttachment p0) {
        AudioAttributesCompatParcelizer(p0.getRead());
        IconCompatParcelizer(p0.getIconCompatParcelizer());
        read(p0.getRemoteActionCompatParcelizer());
        write(p0.getAudioAttributesCompatParcelizer());
        HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolder = this.IconCompatParcelizer;
        if (hlsChunkSourceSegmentBaseHolder == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsChunkSourceSegmentBaseHolder = null;
        }
        DefaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener = hlsChunkSourceSegmentBaseHolder.AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener, "");
        PublicKeyCredentialBuilder.AudioAttributesCompatParcelizer(defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener, p0.getAudioAttributesImplApi21Parcelizer(), p0.getWrite(), p0.getAudioAttributesCompatParcelizer(), getRawId.IconCompatParcelizer, new getCreatedOnDateMs() { // from class: o.getCredentialId
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return BrowserPublicKeyCredentialRequestOptions.AudioAttributesCompatParcelizer(this.write, p0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions, setAuthenticatorAttachment setauthenticatorattachment) {
        HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolder = browserPublicKeyCredentialRequestOptions.IconCompatParcelizer;
        if (hlsChunkSourceSegmentBaseHolder == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsChunkSourceSegmentBaseHolder = null;
        }
        buildDownloadCompletedNotification.write(hlsChunkSourceSegmentBaseHolder.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer, setauthenticatorattachment.getWrite());
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer() {
        MediaMetadataCompat();
    }

    private final void MediaMetadataCompat() {
        shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
        HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolder = this.IconCompatParcelizer;
        HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolder2 = null;
        if (hlsChunkSourceSegmentBaseHolder == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsChunkSourceSegmentBaseHolder = null;
        }
        shouldEscapeCharacter.Companion.IconCompatParcelizer((View) hlsChunkSourceSegmentBaseHolder.MediaBrowserCompatCustomActionResultReceiver);
        HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolder3 = this.IconCompatParcelizer;
        if (hlsChunkSourceSegmentBaseHolder3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            hlsChunkSourceSegmentBaseHolder2 = hlsChunkSourceSegmentBaseHolder3;
        }
        ComposeView composeView = hlsChunkSourceSegmentBaseHolder2.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(composeView, "");
        composeView.setVisibility(0);
        write();
    }

    private final void MediaBrowserCompatItemReceiver() {
        CmcdHeadersFactoryCmcdStatusBuilder.Companion companion = CmcdHeadersFactoryCmcdStatusBuilder.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        CmcdHeadersFactoryCmcdStatusBuilder.Companion.IconCompatParcelizer(contextRequireContext, this.AudioAttributesImplApi26Parcelizer);
    }

    private final void AudioAttributesImplBaseParcelizer() {
        _init_lambda4.IconCompatParcelizer.Companion companion = _init_lambda4.IconCompatParcelizer.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        if (companion.write(contextRequireContext)) {
            this.MediaBrowserCompatCustomActionResultReceiver.read(accessensureViewModelStore.IconCompatParcelizer(_init_lambda4.IconCompatParcelizer.AudioAttributesCompatParcelizer.INSTANCE));
        } else {
            this.AudioAttributesImplBaseParcelizer.read("image/*");
        }
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private Object RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                CmcdHeadersFactoryCmcdStatusBuilder.Companion companion = CmcdHeadersFactoryCmcdStatusBuilder.INSTANCE;
                Context contextRequireContext = BrowserPublicKeyCredentialRequestOptions.this.requireContext();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                Uri uriRemoteActionCompatParcelizer = companion.RemoteActionCompatParcelizer(contextRequireContext, (File) null);
                this.RemoteActionCompatParcelizer = null;
                this.AudioAttributesCompatParcelizer = 1;
                if (setModifiedEndTimestampMs.RemoteActionCompatParcelizer(setMbbsVerificationYear.RemoteActionCompatParcelizer(), new AnonymousClass3(uriRemoteActionCompatParcelizer, BrowserPublicKeyCredentialRequestOptions.this, null), this) == objIconCompatParcelizer) {
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

        /* JADX INFO: renamed from: o.BrowserPublicKeyCredentialRequestOptions$MediaBrowserCompatCustomActionResultReceiver$3, reason: invalid class name */
        static final class AnonymousClass3 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private /* synthetic */ BrowserPublicKeyCredentialRequestOptions AudioAttributesCompatParcelizer;
            private int IconCompatParcelizer;
            private /* synthetic */ Uri read;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                getYear.IconCompatParcelizer();
                SdkPayloadData.IconCompatParcelizer(obj);
                Uri uri = this.read;
                if (uri != null) {
                    BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions = this.AudioAttributesCompatParcelizer;
                    browserPublicKeyCredentialRequestOptions.AudioAttributesCompatParcelizer = uri;
                    r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 r8lambdaibk6u1hk7j3awkl_wn934v2uvi8 = browserPublicKeyCredentialRequestOptions.MediaBrowserCompatItemReceiver;
                    Uri uri2 = browserPublicKeyCredentialRequestOptions.AudioAttributesCompatParcelizer;
                    if (uri2 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                        uri2 = null;
                    }
                    r8lambdaibk6u1hk7j3awkl_wn934v2uvi8.read(uri2);
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(Uri uri, BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions, SampleVideos<? super AnonymousClass3> sampleVideos) {
                super(2, sampleVideos);
                this.read = uri;
                this.AudioAttributesCompatParcelizer = browserPublicKeyCredentialRequestOptions;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass3(this.read, this.AudioAttributesCompatParcelizer, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass3) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        MediaBrowserCompatCustomActionResultReceiver(SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return BrowserPublicKeyCredentialRequestOptions.this.new MediaBrowserCompatCustomActionResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatSearchResultReceiver() {
        C0201setMcqCount.IconCompatParcelizer(getInternalName.RemoteActionCompatParcelizer(this), setMbbsVerificationYear.write(), null, new MediaBrowserCompatCustomActionResultReceiver(null), 2);
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ Uri AudioAttributesCompatParcelizer;
        private Object IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private Object read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Uri uriRemoteActionCompatParcelizer;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                CmcdHeadersFactoryCmcdStatusBuilder.Companion companion = CmcdHeadersFactoryCmcdStatusBuilder.INSTANCE;
                Context contextRequireContext = BrowserPublicKeyCredentialRequestOptions.this.requireContext();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                File fileAudioAttributesCompatParcelizer = CmcdHeadersFactoryCmcdStatusBuilder.Companion.AudioAttributesCompatParcelizer(contextRequireContext, this.AudioAttributesCompatParcelizer);
                if (fileAudioAttributesCompatParcelizer != null) {
                    BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions = BrowserPublicKeyCredentialRequestOptions.this;
                    CmcdHeadersFactoryCmcdStatusBuilder.Companion companion2 = CmcdHeadersFactoryCmcdStatusBuilder.INSTANCE;
                    Context contextRequireContext2 = browserPublicKeyCredentialRequestOptions.requireContext();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
                    uriRemoteActionCompatParcelizer = companion2.RemoteActionCompatParcelizer(contextRequireContext2, fileAudioAttributesCompatParcelizer);
                } else {
                    uriRemoteActionCompatParcelizer = null;
                }
                this.IconCompatParcelizer = null;
                this.read = null;
                this.RemoteActionCompatParcelizer = 1;
                if (setModifiedEndTimestampMs.RemoteActionCompatParcelizer(setMbbsVerificationYear.RemoteActionCompatParcelizer(), new AnonymousClass4(uriRemoteActionCompatParcelizer, BrowserPublicKeyCredentialRequestOptions.this, this.AudioAttributesCompatParcelizer, null), this) == objIconCompatParcelizer) {
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

        /* JADX INFO: renamed from: o.BrowserPublicKeyCredentialRequestOptions$write$4, reason: invalid class name */
        static final class AnonymousClass4 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private int AudioAttributesCompatParcelizer;
            private /* synthetic */ Uri RemoteActionCompatParcelizer;
            private /* synthetic */ Uri read;
            private /* synthetic */ BrowserPublicKeyCredentialRequestOptions write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                getYear.IconCompatParcelizer();
                SdkPayloadData.IconCompatParcelizer(obj);
                Uri uri = this.RemoteActionCompatParcelizer;
                if (uri != null) {
                    this.write.AudioAttributesCompatParcelizer(uri);
                } else {
                    this.write.AudioAttributesImplApi26Parcelizer().AudioAttributesCompatParcelizer(new setAuthenticationExtensionsClientOutputs.IconCompatParcelizer(this.read));
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(Uri uri, BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions, Uri uri2, SampleVideos<? super AnonymousClass4> sampleVideos) {
                super(2, sampleVideos);
                this.RemoteActionCompatParcelizer = uri;
                this.write = browserPublicKeyCredentialRequestOptions;
                this.read = uri2;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass4(this.RemoteActionCompatParcelizer, this.write, this.read, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass4) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(Uri uri, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = uri;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return BrowserPublicKeyCredentialRequestOptions.this.new write(this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void IconCompatParcelizer(Uri p0) {
        C0201setMcqCount.IconCompatParcelizer(getInternalName.RemoteActionCompatParcelizer(this), setMbbsVerificationYear.write(), null, new write(p0, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(Uri p0) {
        PackageManager packageManager;
        this.write = p0;
        Intent intent = new Intent("com.android.camera.action.CROP");
        intent.setDataAndType(p0, "image/*");
        Uri uri = this.write;
        List<ResolveInfo> listQueryIntentActivities = null;
        if (uri == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            uri = null;
        }
        intent.putExtra("output", uri);
        intent.addFlags(3);
        intent.putExtra("aspectX", 1);
        intent.putExtra("aspectY", 1);
        intent.putExtra("outputX", 200);
        intent.putExtra("outputY", 200);
        intent.putExtra("crop", true);
        intent.putExtra("scale", true);
        intent.putExtra("return-data", false);
        maybeGetTypeVariable activity = getActivity();
        if (activity != null && (packageManager = activity.getPackageManager()) != null) {
            listQueryIntentActivities = packageManager.queryIntentActivities(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        }
        List<ResolveInfo> list = listQueryIntentActivities;
        if (list == null || list.isEmpty()) {
            AudioAttributesImplApi26Parcelizer().AudioAttributesCompatParcelizer(new setAuthenticationExtensionsClientOutputs.IconCompatParcelizer(p0));
            return;
        }
        ActivityInfo activityInfo = listQueryIntentActivities.get(0).activityInfo;
        intent.setComponent(new ComponentName(((PackageItemInfo) activityInfo).packageName, ((PackageItemInfo) activityInfo).name));
        this.AudioAttributesImplApi21Parcelizer.read(intent);
    }

    private final void write(String p0) {
        HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolder = this.IconCompatParcelizer;
        if (hlsChunkSourceSegmentBaseHolder == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsChunkSourceSegmentBaseHolder = null;
        }
        hlsChunkSourceSegmentBaseHolder.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer.setText(p0);
    }

    private final void IconCompatParcelizer(String p0) {
        HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolder = this.IconCompatParcelizer;
        if (hlsChunkSourceSegmentBaseHolder == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsChunkSourceSegmentBaseHolder = null;
        }
        hlsChunkSourceSegmentBaseHolder.MediaBrowserCompatMediaItem.setText(p0);
    }

    private final void read(String p0) {
        HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolder = this.IconCompatParcelizer;
        if (hlsChunkSourceSegmentBaseHolder == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsChunkSourceSegmentBaseHolder = null;
        }
        hlsChunkSourceSegmentBaseHolder.AudioAttributesImplApi26Parcelizer.setText(p0);
    }

    private final void AudioAttributesCompatParcelizer(String p0) {
        HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolder = this.IconCompatParcelizer;
        if (hlsChunkSourceSegmentBaseHolder == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsChunkSourceSegmentBaseHolder = null;
        }
        hlsChunkSourceSegmentBaseHolder.RatingCompat.setText(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatMediaItem() {
        HlsChunkSourceSegmentBaseHolder hlsChunkSourceSegmentBaseHolder = this.IconCompatParcelizer;
        if (hlsChunkSourceSegmentBaseHolder == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsChunkSourceSegmentBaseHolder = null;
        }
        CircleImageView circleImageView = hlsChunkSourceSegmentBaseHolder.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(circleImageView, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(circleImageView);
    }

    /* JADX INFO: renamed from: o.BrowserPublicKeyCredentialRequestOptions$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/BrowserPublicKeyCredentialRequestOptions$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/BrowserPublicKeyCredentialRequestOptions;", "RemoteActionCompatParcelizer", "()Lo/BrowserPublicKeyCredentialRequestOptions;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static BrowserPublicKeyCredentialRequestOptions RemoteActionCompatParcelizer() {
            return new BrowserPublicKeyCredentialRequestOptions();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
