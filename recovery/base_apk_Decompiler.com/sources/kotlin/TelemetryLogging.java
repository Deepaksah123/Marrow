package kotlin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.util.DeviceProperties;
import com.marrow.R;
import com.marrow2.ui.common.google_sign_in.GoogleSignUpViewModel;
import com.marrow2.ui.onboarding.email.EmailSignInViewModel;
import kotlin.ActivityLifecycleObserver;
import kotlin.Metadata;
import kotlin.TelemetryLogging;
import kotlin.VisibilityChecker;
import kotlin.createBundle;
import kotlin.createByteArraySparseArray;
import kotlin.getAnchorU;
import kotlin.getAutofillClient;
import kotlin.setWatermarkEnabled;
import kotlin.shouldEscapeCharacter;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0003R\u001b\u0010\u001b\u001a\u00020\u00178CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001dR\u0014\u0010\u0010\u001a\u00020\u001c8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001b\u0010\u0014\u001a\u00020!8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001b\u0010\"R\u0018\u0010\u001f\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010$"}, d2 = {"Lo/TelemetryLogging;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "read", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi26Parcelizer", "", "write", "(Ljava/lang/String;)V", "AudioAttributesImplBaseParcelizer", "Lcom/marrow2/ui/onboarding/email/EmailSignInViewModel;", "Lo/RenewEligible;", "AudioAttributesImplApi21Parcelizer", "()Lcom/marrow2/ui/onboarding/email/EmailSignInViewModel;", "AudioAttributesCompatParcelizer", "Lo/isPublished;", "Lo/isPublished;", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "()Lo/isPublished;", "Lcom/marrow2/ui/common/google_sign_in/GoogleSignUpViewModel;", "()Lcom/marrow2/ui/common/google_sign_in/GoogleSignUpViewModel;", "Lo/extractRoll;", "Lo/extractRoll;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TelemetryLogging extends createByteArrayArray {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private isPublished IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private extractRoll RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final RenewEligible AudioAttributesCompatParcelizer;

    public TelemetryLogging() {
        TelemetryLogging telemetryLogging = this;
        this.AudioAttributesCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(EmailSignInViewModel.class), new AnonymousClass2(telemetryLogging), new AnonymousClass5(telemetryLogging), new AnonymousClass3(telemetryLogging));
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass1(new AnonymousClass4(telemetryLogging)));
        this.write = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(GoogleSignUpViewModel.class), new AnonymousClass7(renewEligibleWrite), new AnonymousClass9(renewEligibleWrite), new AnonymousClass8(telemetryLogging, renewEligibleWrite));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EmailSignInViewModel AudioAttributesImplApi21Parcelizer() {
        return (EmailSignInViewModel) this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final isPublished RemoteActionCompatParcelizer() {
        isPublished ispublished = this.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(ispublished);
        return ispublished;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GoogleSignUpViewModel AudioAttributesCompatParcelizer() {
        return (GoogleSignUpViewModel) this.write.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: renamed from: o.TelemetryLogging$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/TelemetryLogging$RemoteActionCompatParcelizer;", "", "<init>", "()V", "", "p0", "Lo/TelemetryLogging;", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;)Lo/TelemetryLogging;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static TelemetryLogging AudioAttributesCompatParcelizer(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            TelemetryLogging telemetryLogging = new TelemetryLogging();
            Bundle bundle = new Bundle();
            bundle.putString("email_id", p0);
            telemetryLogging.setArguments(bundle);
            return telemetryLogging;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static final class MediaBrowserCompatCustomActionResultReceiver implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public MediaBrowserCompatCustomActionResultReceiver() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            TelemetryLogging.this.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(new createByteArraySparseArray.AudioAttributesImplApi26Parcelizer(String.valueOf(editable)));
        }
    }

    public static final class MediaBrowserCompatItemReceiver implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public MediaBrowserCompatItemReceiver() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            TelemetryLogging.this.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(new createByteArraySparseArray.AudioAttributesCompatParcelizer(String.valueOf(editable)));
        }
    }

    public static final class read implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public read() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            TelemetryLogging.this.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(new createByteArraySparseArray.RemoteActionCompatParcelizer(String.valueOf(editable)));
        }
    }

    public static final class write implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public write() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            TelemetryLogging.this.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(new createByteArraySparseArray.read(String.valueOf(editable)));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.IconCompatParcelizer = isPublished.read(p0, p1);
        ConstraintLayout constraintLayoutIconCompatParcelizer = RemoteActionCompatParcelizer().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer, "");
        return constraintLayoutIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        read();
        AudioAttributesImplBaseParcelizer();
        MediaBrowserCompatItemReceiver();
        AudioAttributesImplApi26Parcelizer();
        CardView cardView = RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardView, "");
        this.RemoteActionCompatParcelizer = new extractRoll(this, cardView, AudioAttributesCompatParcelizer(), new getCreatedOnDateMs() { // from class: o.TelemetryLoggingClient
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return TelemetryLogging.MediaBrowserCompatCustomActionResultReceiver();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver() {
        return getShowPopup.INSTANCE;
    }

    private final void read() {
        Toolbar toolbar = RemoteActionCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(toolbar, "");
        getHttpMethodString.read((View) toolbar, true, false, true, true, 0, 50);
        ConstraintLayout constraintLayout = RemoteActionCompatParcelizer().IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        getHttpMethodString.read((View) constraintLayout, false, true, true, true, 0, 49);
    }

    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Boolean> setupdatedstatusAudioAttributesCompatParcelizer = TelemetryLogging.this.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer();
                final TelemetryLogging telemetryLogging = TelemetryLogging.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.TelemetryLogging.AudioAttributesImplApi21Parcelizer.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer(((Boolean) obj2).booleanValue());
                    }

                    private Object RemoteActionCompatParcelizer(boolean z) {
                        ProgressBar progressBar = telemetryLogging.RemoteActionCompatParcelizer().read;
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

        AudioAttributesImplApi21Parcelizer(SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return TelemetryLogging.this.new AudioAttributesImplApi21Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatItemReceiver() {
        TelemetryLogging telemetryLogging = this;
        setBitrateKbps.RemoteActionCompatParcelizer(telemetryLogging, new AudioAttributesImplApi21Parcelizer(null));
        setBitrateKbps.RemoteActionCompatParcelizer(telemetryLogging, new AudioAttributesImplApi26Parcelizer(null));
        setBitrateKbps.read(telemetryLogging, new AudioAttributesImplBaseParcelizer(null));
        setBitrateKbps.read(telemetryLogging, new MediaMetadataCompat(null));
        setBitrateKbps.read(telemetryLogging, new RatingCompat(null));
    }

    /* JADX INFO: renamed from: o.TelemetryLogging$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "RemoteActionCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$read;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Fragment fragment) {
            super(0);
            this.$read = fragment;
        }
    }

    static final class AudioAttributesImplApi26Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isDark<createCharArray> isdarkAudioAttributesCompatParcelizer = TelemetryLogging.this.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer();
                final TelemetryLogging telemetryLogging = TelemetryLogging.this;
                this.read = 1;
                if (isdarkAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.TelemetryLogging.AudioAttributesImplApi26Parcelizer.3
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((createCharArray) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(createCharArray createchararray) {
                        if (createchararray.getAudioAttributesCompatParcelizer()) {
                            Button button = telemetryLogging.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer.read;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button, "");
                            bytesRead.read(button);
                        } else {
                            Button button2 = telemetryLogging.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer.read;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button2, "");
                            bytesRead.AudioAttributesCompatParcelizer(button2);
                        }
                        if (createchararray.getMediaBrowserCompatItemReceiver()) {
                            Button button3 = telemetryLogging.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button3, "");
                            bytesRead.read(button3);
                        } else {
                            Button button4 = telemetryLogging.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button4, "");
                            bytesRead.AudioAttributesCompatParcelizer(button4);
                        }
                        if (createchararray.getMediaBrowserCompatCustomActionResultReceiver()) {
                            Button button5 = telemetryLogging.RemoteActionCompatParcelizer().AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button5, "");
                            bytesRead.read(button5);
                        } else {
                            Button button6 = telemetryLogging.RemoteActionCompatParcelizer().AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button6, "");
                            bytesRead.AudioAttributesCompatParcelizer(button6);
                        }
                        if (createchararray.getAudioAttributesImplApi26Parcelizer().length() > 0) {
                            TextView textView = telemetryLogging.RemoteActionCompatParcelizer().AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
                            bytesRead.AudioAttributesCompatParcelizer(textView);
                            telemetryLogging.RemoteActionCompatParcelizer().AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer.setText(telemetryLogging.getString(R.string.text_resend_otp_in, createchararray.getAudioAttributesImplApi26Parcelizer()));
                        } else {
                            TextView textView2 = telemetryLogging.RemoteActionCompatParcelizer().AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
                            bytesRead.read(textView2);
                            telemetryLogging.RemoteActionCompatParcelizer().AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer.setText(telemetryLogging.getString(R.string.text_resend_otp));
                        }
                        telemetryLogging.RemoteActionCompatParcelizer().AudioAttributesImplApi21Parcelizer.IconCompatParcelizer.setText(telemetryLogging.getString(R.string.please_enter_code, createchararray.getRemoteActionCompatParcelizer()));
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

        AudioAttributesImplApi26Parcelizer(SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return TelemetryLogging.this.new AudioAttributesImplApi26Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.TelemetryLogging$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "AudioAttributesCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$read.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$read = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.TelemetryLogging$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "IconCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass7 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.TelemetryLogging$9, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "RemoteActionCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass9 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ RenewEligible $RemoteActionCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $write = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$RemoteActionCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(RenewEligible renewEligible) {
            super(0);
            this.$RemoteActionCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.TelemetryLogging$8, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "write", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass8 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $IconCompatParcelizer;
        private /* synthetic */ RenewEligible $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$RemoteActionCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$IconCompatParcelizer.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$IconCompatParcelizer = fragment;
            this.$RemoteActionCompatParcelizer = renewEligible;
        }
    }

    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<createByteArray> setupdatedstatus = TelemetryLogging.this.AudioAttributesImplApi21Parcelizer().read();
                final TelemetryLogging telemetryLogging = TelemetryLogging.this;
                this.read = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.TelemetryLogging.AudioAttributesImplBaseParcelizer.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((createByteArray) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(createByteArray createbytearray) {
                        telemetryLogging.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer.setDisplayedChild(createbytearray.getRemoteActionCompatParcelizer());
                        if (createbytearray == createByteArray.write) {
                            telemetryLogging.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer.read.setText("");
                            telemetryLogging.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer.read.requestFocus();
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

        AudioAttributesImplBaseParcelizer(SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return TelemetryLogging.this.new AudioAttributesImplBaseParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class MediaMetadataCompat extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        /* JADX INFO: renamed from: o.TelemetryLogging$MediaMetadataCompat$1, reason: invalid class name */
        static final class AnonymousClass1<T> implements getValidationToken {
            private /* synthetic */ TelemetryLogging read;

            @Override // kotlin.getValidationToken
            public final /* synthetic */ Object IconCompatParcelizer(Object obj, SampleVideos sampleVideos) {
                return AudioAttributesCompatParcelizer((createBundle) obj);
            }

            private Object AudioAttributesCompatParcelizer(final createBundle createbundle) {
                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(createbundle, createBundle.read.INSTANCE)) {
                    if (createbundle instanceof createBundle.MediaDescriptionCompat) {
                        this.read.write(((createBundle.MediaDescriptionCompat) createbundle).IconCompatParcelizer());
                    } else if (createbundle instanceof createBundle.MediaMetadataCompat) {
                        Handler handler = new Handler(Looper.getMainLooper());
                        final TelemetryLogging telemetryLogging = this.read;
                        handler.postDelayed(new Runnable() { // from class: o.ListAppsActivityContract
                            @Override // java.lang.Runnable
                            public final void run() {
                                TelemetryLogging.MediaMetadataCompat.AnonymousClass1.IconCompatParcelizer(telemetryLogging, createbundle);
                            }
                        }, 500L);
                    } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(createbundle, createBundle.MediaBrowserCompatSearchResultReceiver.INSTANCE)) {
                        this.read.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer.IconCompatParcelizer.setError(this.read.getString(R.string.wrong_email));
                    } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(createbundle, createBundle.IconCompatParcelizer.INSTANCE)) {
                        maybeGetTypeVariable activity = this.read.getActivity();
                        if (activity != null) {
                            activity.finish();
                        }
                    } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(createbundle, createBundle.MediaBrowserCompatCustomActionResultReceiver.INSTANCE)) {
                        TelemetryLogging telemetryLogging2 = this.read;
                        TelemetryLogging telemetryLogging3 = telemetryLogging2;
                        String string = telemetryLogging2.getString(R.string.app_error_no_internet);
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                        CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(telemetryLogging3, string, 0);
                    } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(createbundle, createBundle.write.INSTANCE)) {
                        getAnchorU.Companion companion = getAnchorU.INSTANCE;
                        Context contextRequireContext = this.read.requireContext();
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                        Intent intentIconCompatParcelizer = getAnchorU.Companion.IconCompatParcelizer(contextRequireContext);
                        intentIconCompatParcelizer.setFlags(268468224);
                        this.read.startActivity(intentIconCompatParcelizer);
                        this.read.requireActivity().finish();
                    } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(createbundle, createBundle.AudioAttributesImplBaseParcelizer.INSTANCE)) {
                        setWatermarkEnabled.Companion companion2 = setWatermarkEnabled.INSTANCE;
                        Context contextRequireContext2 = this.read.requireContext();
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
                        Intent intentAudioAttributesCompatParcelizer = setWatermarkEnabled.Companion.AudioAttributesCompatParcelizer(contextRequireContext2, false, false, 6);
                        intentAudioAttributesCompatParcelizer.setFlags(268468224);
                        this.read.startActivity(intentAudioAttributesCompatParcelizer);
                        this.read.requireActivity().finish();
                    } else if (createbundle instanceof createBundle.MediaBrowserCompatItemReceiver) {
                        TelemetryLogging telemetryLogging4 = this.read;
                        ActivityLifecycleObserver.Companion companion3 = ActivityLifecycleObserver.INSTANCE;
                        Context contextRequireContext3 = this.read.requireContext();
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext3, "");
                        telemetryLogging4.startActivity(ActivityLifecycleObserver.Companion.RemoteActionCompatParcelizer(contextRequireContext3, ((createBundle.MediaBrowserCompatItemReceiver) createbundle).AudioAttributesCompatParcelizer()));
                        this.read.requireActivity().finish();
                    } else if (createbundle instanceof createBundle.MediaBrowserCompatMediaItem) {
                        shouldEscapeCharacter.Companion companion4 = shouldEscapeCharacter.INSTANCE;
                        shouldEscapeCharacter.Companion.IconCompatParcelizer((View) this.read.RemoteActionCompatParcelizer().AudioAttributesImplApi21Parcelizer.read);
                        TelemetryLogging telemetryLogging5 = this.read;
                        String string2 = telemetryLogging5.getString(R.string.f_email_login_otp_message, ((createBundle.MediaBrowserCompatMediaItem) createbundle).write());
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
                        CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(telemetryLogging5, string2, 0);
                    } else if (createbundle instanceof createBundle.AudioAttributesImplApi21Parcelizer) {
                        EditText editText = this.read.RemoteActionCompatParcelizer().write.RemoteActionCompatParcelizer;
                        dispatchTouchEvent.write(editText);
                        createBundle.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = (createBundle.AudioAttributesImplApi21Parcelizer) createbundle;
                        editText.setText(audioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer());
                        editText.setSelection(audioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer().length());
                        this.read.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(createByteArraySparseArray.IconCompatParcelizer.INSTANCE);
                    } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(createbundle, createBundle.AudioAttributesImplApi26Parcelizer.INSTANCE)) {
                        this.read.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer.setText(this.read.getString(R.string.enter_your_dr_paasword));
                        TextView textView = this.read.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
                        bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView);
                        TextView textView2 = this.read.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer.IconCompatParcelizer;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
                        bytesRead.AudioAttributesImplApi21Parcelizer(textView2);
                    } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(createbundle, createBundle.AudioAttributesCompatParcelizer.INSTANCE)) {
                        shouldEscapeCharacter.Companion companion5 = shouldEscapeCharacter.INSTANCE;
                        shouldEscapeCharacter.Companion.IconCompatParcelizer((View) this.read.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer.read);
                        shouldEscapeCharacter.Companion companion6 = shouldEscapeCharacter.INSTANCE;
                        shouldEscapeCharacter.Companion.IconCompatParcelizer((View) this.read.RemoteActionCompatParcelizer().AudioAttributesImplApi21Parcelizer.read);
                    } else {
                        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(createbundle, createBundle.RemoteActionCompatParcelizer.INSTANCE)) {
                            throw new RenewEligibleCreator();
                        }
                        shouldEscapeCharacter.Companion companion7 = shouldEscapeCharacter.INSTANCE;
                        shouldEscapeCharacter.Companion.IconCompatParcelizer((View) this.read.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer.IconCompatParcelizer);
                    }
                }
                this.read.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(createByteArraySparseArray.IconCompatParcelizer.INSTANCE);
                return getShowPopup.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void IconCompatParcelizer(TelemetryLogging telemetryLogging, createBundle createbundle) {
                if (telemetryLogging.isVisible()) {
                    CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(telemetryLogging, ((createBundle.MediaMetadataCompat) createbundle).RemoteActionCompatParcelizer(), 0);
                }
            }

            AnonymousClass1(TelemetryLogging telemetryLogging) {
                this.read = telemetryLogging;
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (TelemetryLogging.this.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer().write(new AnonymousClass1(TelemetryLogging.this), this) == objIconCompatParcelizer) {
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

        MediaMetadataCompat(SampleVideos<? super MediaMetadataCompat> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return TelemetryLogging.this.new MediaMetadataCompat(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaMetadataCompat) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.TelemetryLogging$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "RemoteActionCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return this.$AudioAttributesCompatParcelizer.requireActivity().getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.TelemetryLogging$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "RemoteActionCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ Fragment $IconCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            return this.$IconCompatParcelizer.requireActivity().getDefaultViewModelCreationExtras();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Fragment fragment) {
            super(0);
            this.$IconCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.TelemetryLogging$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "read", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            return this.$AudioAttributesCompatParcelizer.requireActivity().getDefaultViewModelProviderFactory();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
        }
    }

    static final class RatingCompat extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Boolean> setupdatedstatusAudioAttributesImplBaseParcelizer = TelemetryLogging.this.AudioAttributesImplApi21Parcelizer().AudioAttributesImplBaseParcelizer();
                final TelemetryLogging telemetryLogging = TelemetryLogging.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesImplBaseParcelizer.write(new getValidationToken() { // from class: o.TelemetryLogging.RatingCompat.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer(((Boolean) obj2).booleanValue());
                    }

                    private Object AudioAttributesCompatParcelizer(boolean z) {
                        ProgressBar progressBar = telemetryLogging.RemoteActionCompatParcelizer().read;
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

        RatingCompat(SampleVideos<? super RatingCompat> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return TelemetryLogging.this.new RatingCompat(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RatingCompat) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            ConstraintLayout constraintLayout = RemoteActionCompatParcelizer().IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext, constraintLayout);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(String p0) {
        getAutofillClient.Companion companion = getAutofillClient.INSTANCE;
        String string = getString(R.string.btn_okay);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        getAutofillClient getautofillclientAudioAttributesCompatParcelizer = getAutofillClient.Companion.AudioAttributesCompatParcelizer(null, p0, string, null, 0, null, false, false, null, 505);
        FragmentManager childFragmentManager = getChildFragmentManager();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childFragmentManager, "");
        getBrowserClient.IconCompatParcelizer(getautofillclientAudioAttributesCompatParcelizer, childFragmentManager, new getCreatedOnDateMs() { // from class: o.createBigDecimal
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return TelemetryLogging.onCommand(this.RemoteActionCompatParcelizer);
            }
        }, null, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onCommand(TelemetryLogging telemetryLogging) {
        telemetryLogging.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(createByteArraySparseArray.AudioAttributesImplApi21Parcelizer.INSTANCE);
        telemetryLogging.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(createByteArraySparseArray.IconCompatParcelizer.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    public static final class IconCompatParcelizer extends onRemoveQueueItemAt {
        IconCompatParcelizer() {
            super(true);
        }

        @Override // kotlin.onRemoveQueueItemAt
        public final void handleOnBackPressed() {
            maybeGetTypeVariable activity = TelemetryLogging.this.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    private final void AudioAttributesImplBaseParcelizer() {
        onSetRating iconCompatParcelizer;
        onSetRating iconCompatParcelizer2;
        maybeGetTypeVariable activity = getActivity();
        if (activity != null && (iconCompatParcelizer2 = activity.getIconCompatParcelizer()) != null) {
            hasGetter viewLifecycleOwner = getViewLifecycleOwner();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewLifecycleOwner, "");
            iconCompatParcelizer2.AudioAttributesCompatParcelizer(viewLifecycleOwner, new IconCompatParcelizer());
        }
        isPublished ispublishedRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        RemoteActionCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.ShowFirstParty
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TelemetryLogging.MediaMetadataCompat(this.RemoteActionCompatParcelizer);
            }
        });
        processSample processsample = ispublishedRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
        EditText editText = processsample.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(editText, "");
        editText.addTextChangedListener(new write());
        Button button = processsample.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button, "");
        bytesRead.IconCompatParcelizer(button, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.ViewUtils
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return TelemetryLogging.MediaDescriptionCompat(this.RemoteActionCompatParcelizer);
            }
        });
        createBundles createbundles = ispublishedRemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer;
        EditText editText2 = createbundles.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(editText2, "");
        editText2.addTextChangedListener(new read());
        Button button2 = createbundles.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button2, "");
        bytesRead.IconCompatParcelizer(button2, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.setApi
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return TelemetryLogging.MediaBrowserCompatSearchResultReceiver(this.RemoteActionCompatParcelizer);
            }
        });
        TextView textView = createbundles.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        bytesRead.IconCompatParcelizer(textView, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.TelemetryLoggingOptions
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return TelemetryLogging.MediaBrowserCompatMediaItem(this.write);
            }
        });
        buildTrackOutput buildtrackoutput = ispublishedRemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer;
        EditText editText3 = buildtrackoutput.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(editText3, "");
        editText3.addTextChangedListener(new MediaBrowserCompatItemReceiver());
        TextView textView2 = buildtrackoutput.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
        bytesRead.IconCompatParcelizer(textView2, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.log
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return TelemetryLogging.handleMediaPlayPauseIfPendingOnHandler(this.AudioAttributesCompatParcelizer);
            }
        });
        Button button3 = buildtrackoutput.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button3, "");
        bytesRead.IconCompatParcelizer(button3, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.TelemetryLoggingOptionsBuilder
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return TelemetryLogging.onCustomAction(this.write);
            }
        });
        addMediaPlaylistDataSpecs addmediaplaylistdataspecs = ispublishedRemoteActionCompatParcelizer.write;
        EditText editText4 = addmediaplaylistdataspecs.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(editText4, "");
        editText4.addTextChangedListener(new MediaBrowserCompatCustomActionResultReceiver());
        Button button4 = addmediaplaylistdataspecs.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button4, "");
        bytesRead.IconCompatParcelizer(button4, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.SafeParcelReader
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return TelemetryLogging.onAddQueueItem(this.AudioAttributesCompatParcelizer);
            }
        });
        maybeGetTypeVariable activity2 = getActivity();
        if (activity2 == null || (iconCompatParcelizer = activity2.getIconCompatParcelizer()) == null) {
            return;
        }
        hasGetter viewLifecycleOwner2 = getViewLifecycleOwner();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewLifecycleOwner2, "");
        iconCompatParcelizer.AudioAttributesCompatParcelizer(viewLifecycleOwner2, new AudioAttributesCompatParcelizer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaMetadataCompat(TelemetryLogging telemetryLogging) {
        telemetryLogging.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(createByteArraySparseArray.MediaBrowserCompatItemReceiver.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaDescriptionCompat(TelemetryLogging telemetryLogging) {
        telemetryLogging.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(createByteArraySparseArray.write.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatSearchResultReceiver(TelemetryLogging telemetryLogging) {
        telemetryLogging.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(createByteArraySparseArray.MediaDescriptionCompat.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatMediaItem(TelemetryLogging telemetryLogging) {
        telemetryLogging.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(createByteArraySparseArray.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup handleMediaPlayPauseIfPendingOnHandler(TelemetryLogging telemetryLogging) {
        telemetryLogging.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(createByteArraySparseArray.MediaMetadataCompat.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onCustomAction(TelemetryLogging telemetryLogging) {
        telemetryLogging.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(createByteArraySparseArray.MediaBrowserCompatSearchResultReceiver.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onAddQueueItem(TelemetryLogging telemetryLogging) {
        telemetryLogging.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(createByteArraySparseArray.AudioAttributesImplBaseParcelizer.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    public static final class AudioAttributesCompatParcelizer extends onRemoveQueueItemAt {
        AudioAttributesCompatParcelizer() {
            super(true);
        }

        @Override // kotlin.onRemoveQueueItemAt
        public final void handleOnBackPressed() {
            TelemetryLogging.this.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(createByteArraySparseArray.MediaBrowserCompatItemReceiver.INSTANCE);
        }
    }
}
