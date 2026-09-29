package kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.Fragment;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.marrow.R;
import com.marrow2.ui.common.google_sign_in.GoogleSignUpViewModel;
import kotlin.ActivityLifecycleObserver;
import kotlin.Metadata;
import kotlin.ProjectionMesh;
import kotlin._init_lambda4;
import kotlin.extractRoll;
import kotlin.getAnchorU;
import kotlin.onOrientationChange;
import kotlin.setWatermarkEnabled;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R \u0010\u0010\u001a\f\u0012\b\u0012\u0006*\u00020\u00190\u00190\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001a"}, d2 = {"Lo/extractRoll;", "", "Landroidx/fragment/app/Fragment;", "p0", "Landroid/view/View;", "p1", "Lcom/marrow2/ui/common/google_sign_in/GoogleSignUpViewModel;", "p2", "Lkotlin/Function0;", "", "p3", "<init>", "(Landroidx/fragment/app/Fragment;Landroid/view/View;Lcom/marrow2/ui/common/google_sign_in/GoogleSignUpViewModel;Lo/getCreatedOnDateMs;)V", "IconCompatParcelizer", "()V", "AudioAttributesCompatParcelizer", "write", "read", "Landroidx/fragment/app/Fragment;", "Landroid/view/View;", "MediaBrowserCompatCustomActionResultReceiver", "Lcom/marrow2/ui/common/google_sign_in/GoogleSignUpViewModel;", "RemoteActionCompatParcelizer", "Lo/getCreatedOnDateMs;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;", "Landroid/content/Intent;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class extractRoll {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final View read;
    private final getCreatedOnDateMs<getShowPopup> IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final GoogleSignUpViewModel RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Fragment AudioAttributesCompatParcelizer;

    public extractRoll(Fragment fragment, View view, GoogleSignUpViewModel googleSignUpViewModel, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(fragment, "");
        toMagicModuleMetaRepoModel.write(view, "");
        toMagicModuleMetaRepoModel.write(googleSignUpViewModel, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        this.AudioAttributesCompatParcelizer = fragment;
        this.read = view;
        this.RemoteActionCompatParcelizer = googleSignUpViewModel;
        this.IconCompatParcelizer = getcreatedondatems;
        IconCompatParcelizer();
        AudioAttributesCompatParcelizer();
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult = fragment.registerForActivityResult(new _init_lambda4.AudioAttributesImplApi26Parcelizer(), new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() { // from class: o.recenter
            @Override // kotlin.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
            public final void IconCompatParcelizer(Object obj) {
                extractRoll.RemoteActionCompatParcelizer(this.read, (ActivityResult) obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult, "");
        this.write = r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult;
    }

    private final void IconCompatParcelizer() {
        GoogleSignInOptions googleSignInOptionsBuild = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().requestIdToken(this.AudioAttributesCompatParcelizer.getString(R.string.google_login_web_api_release)).build();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(googleSignInOptionsBuild, "");
        final GoogleSignInClient client = GoogleSignIn.getClient((Activity) this.AudioAttributesCompatParcelizer.requireActivity(), googleSignInOptionsBuild);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(client, "");
        this.read.setOnClickListener(new View.OnClickListener() { // from class: o.notifyListeners
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                extractRoll.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, client);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(final extractRoll extractroll, final GoogleSignInClient googleSignInClient) {
        extractroll.IconCompatParcelizer.invoke();
        if (getTrackName.write(extractroll.AudioAttributesCompatParcelizer.requireContext())) {
            extractroll.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(new ProjectionMesh.write(true));
            googleSignInClient.signOut().addOnCompleteListener(new OnCompleteListener() { // from class: o.OrientationListener
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    extractRoll.RemoteActionCompatParcelizer(googleSignInClient, extractroll, task);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: o.pollRotationMatrix
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    extractRoll.AudioAttributesCompatParcelizer(this.write, exc);
                }
            });
        } else {
            Fragment fragment = extractroll.AudioAttributesCompatParcelizer;
            String string = fragment.getString(R.string.app_error_no_internet);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(fragment, string, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(GoogleSignInClient googleSignInClient, extractRoll extractroll, Task task) {
        toMagicModuleMetaRepoModel.write(task, "");
        Intent signInIntent = googleSignInClient.getSignInIntent();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(signInIntent, "");
        extractroll.write.read(signInIntent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(extractRoll extractroll, Exception exc) {
        toMagicModuleMetaRepoModel.write(exc, "");
        extractroll.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(ProjectionMesh.AudioAttributesCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(extractRoll extractroll, ActivityResult activityResult) {
        toMagicModuleMetaRepoModel.write(activityResult, "");
        if (activityResult.getRemoteActionCompatParcelizer() == -1) {
            Task<GoogleSignInAccount> signedInAccountFromIntent = GoogleSignIn.getSignedInAccountFromIntent(activityResult.getRead());
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(signedInAccountFromIntent, "");
            String idToken = signedInAccountFromIntent.getResult(ApiException.class).getIdToken();
            if (idToken != null) {
                extractroll.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(new ProjectionMesh.read(idToken));
                return;
            }
            return;
        }
        extractroll.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(new ProjectionMesh.write(false));
        extractroll.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(ProjectionMesh.RemoteActionCompatParcelizer.INSTANCE);
        Fragment fragment = extractroll.AudioAttributesCompatParcelizer;
        String string = fragment.getString(R.string.login_failed_due_to_gmail);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(fragment, string, 0);
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: o.extractRoll$RemoteActionCompatParcelizer$4, reason: invalid class name */
        static final class AnonymousClass4<T> implements getValidationToken {
            private /* synthetic */ extractRoll AudioAttributesCompatParcelizer;

            @Override // kotlin.getValidationToken
            public final /* synthetic */ Object IconCompatParcelizer(Object obj, SampleVideos sampleVideos) {
                return RemoteActionCompatParcelizer((onOrientationChange) obj);
            }

            private Object RemoteActionCompatParcelizer(final onOrientationChange onorientationchange) {
                final Fragment fragment = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
                extractRoll extractroll = this.AudioAttributesCompatParcelizer;
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(onorientationchange, onOrientationChange.AudioAttributesCompatParcelizer.INSTANCE)) {
                    String string = fragment.getString(R.string.app_error_no_internet);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                    CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(fragment, string, 0);
                } else if (onorientationchange instanceof onOrientationChange.RemoteActionCompatParcelizer) {
                    ActivityLifecycleObserver.Companion audioAttributesCompatParcelizer = ActivityLifecycleObserver.INSTANCE;
                    Context contextRequireContext = fragment.requireContext();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                    fragment.startActivity(ActivityLifecycleObserver.Companion.RemoteActionCompatParcelizer(contextRequireContext, ((onOrientationChange.RemoteActionCompatParcelizer) onorientationchange).IconCompatParcelizer()));
                    fragment.requireActivity().finish();
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(onorientationchange, onOrientationChange.IconCompatParcelizer.INSTANCE)) {
                    getAnchorU.Companion companion = getAnchorU.INSTANCE;
                    Context contextRequireContext2 = fragment.requireContext();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
                    Intent intentIconCompatParcelizer = getAnchorU.Companion.IconCompatParcelizer(contextRequireContext2);
                    intentIconCompatParcelizer.setFlags(268468224);
                    fragment.startActivity(intentIconCompatParcelizer);
                    fragment.requireActivity().finish();
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(onorientationchange, onOrientationChange.read.INSTANCE)) {
                    setWatermarkEnabled.Companion companion2 = setWatermarkEnabled.INSTANCE;
                    Context contextRequireContext3 = fragment.requireContext();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext3, "");
                    Intent intentAudioAttributesCompatParcelizer = setWatermarkEnabled.Companion.AudioAttributesCompatParcelizer(contextRequireContext3, false, false, 6);
                    intentAudioAttributesCompatParcelizer.setFlags(268468224);
                    fragment.startActivity(intentAudioAttributesCompatParcelizer);
                    fragment.requireActivity().finish();
                } else if (onorientationchange instanceof onOrientationChange.AudioAttributesImplApi26Parcelizer) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: o.OrientationListenerListener
                        @Override // java.lang.Runnable
                        public final void run() {
                            extractRoll.RemoteActionCompatParcelizer.AnonymousClass4.write(fragment, onorientationchange);
                        }
                    }, 500L);
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(onorientationchange, onOrientationChange.AudioAttributesImplBaseParcelizer.INSTANCE)) {
                    extractroll.write();
                } else if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(onorientationchange, onOrientationChange.write.INSTANCE)) {
                    throw new RenewEligibleCreator();
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void write(Fragment fragment, onOrientationChange onorientationchange) {
                if (fragment.isVisible()) {
                    CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(fragment, ((onOrientationChange.AudioAttributesImplApi26Parcelizer) onorientationchange).RemoteActionCompatParcelizer(), 0);
                }
            }

            AnonymousClass4(extractRoll extractroll) {
                this.AudioAttributesCompatParcelizer = extractroll;
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (extractRoll.this.RemoteActionCompatParcelizer.IconCompatParcelizer().write(new AnonymousClass4(extractRoll.this), this) == objIconCompatParcelizer) {
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
            return extractRoll.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesCompatParcelizer() {
        setBitrateKbps.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, new RemoteActionCompatParcelizer(null));
        setBitrateKbps.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, new AudioAttributesCompatParcelizer(null));
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Boolean> setupdatedstatusAudioAttributesCompatParcelizer = extractRoll.this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
                final extractRoll extractroll = extractRoll.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.extractRoll.AudioAttributesCompatParcelizer.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer(((Boolean) obj2).booleanValue());
                    }

                    private Object RemoteActionCompatParcelizer(boolean z) {
                        if (z) {
                            bytesRead.AudioAttributesCompatParcelizer(extractroll.read);
                        } else {
                            bytesRead.read(extractroll.read);
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
            return extractRoll.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write() {
        getAnchorU.Companion companion = getAnchorU.INSTANCE;
        Context contextRequireContext = this.AudioAttributesCompatParcelizer.requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        Intent intentIconCompatParcelizer = getAnchorU.Companion.IconCompatParcelizer(contextRequireContext);
        intentIconCompatParcelizer.setFlags(268468224);
        this.AudioAttributesCompatParcelizer.startActivity(intentIconCompatParcelizer);
    }
}
