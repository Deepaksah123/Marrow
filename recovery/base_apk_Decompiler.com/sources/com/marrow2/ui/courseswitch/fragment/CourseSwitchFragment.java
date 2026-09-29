package com.marrow2.ui.courseswitch.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.util.DeviceProperties;
import com.marrow.R;
import com.marrow.kt.ui.activities.sync.SyncingActivity;
import com.marrow2.data.user.remote.model.CourseModelV3;
import com.marrow2.data.user.remote.model.LearnMoreModelV3;
import com.marrow2.ui.courseswitch.fragment.CourseSwitchFragment;
import com.marrow2.ui.courseswitch.viewmodel.CourseSwitchViewModel;
import java.util.ArrayList;
import kotlin.BandwidthMeterEventListenerEventDispatcherHandlerAndListener;
import kotlin.CmcdConfigurationRequestConfig;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.MagicModuleUseCase;
import kotlin.Metadata;
import kotlin.PlanDetailsCreator;
import kotlin.PlayerControlViewExternalSyntheticLambda1;
import kotlin.RenewEligible;
import kotlin.RenewEligibleCompanion;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TopUserCompanion;
import kotlin.TypeResolutionContext;
import kotlin.VisibilityChecker;
import kotlin._resolveFieldVsGetter;
import kotlin.addFileTypeIfValidAndNotPresent;
import kotlin.addVideoSurfaceListener;
import kotlin.anyExplicitsWithoutIgnoral;
import kotlin.bytesRead;
import kotlin.drawFrame;
import kotlin.getAnswerMap;
import kotlin.getAutofillClient;
import kotlin.getBrowserClient;
import kotlin.getCameraMotionListener;
import kotlin.getCreatedOnDateMs;
import kotlin.getExamName;
import kotlin.getHttpMethodString;
import kotlin.getMagicModuleMeta;
import kotlin.getMagicModuleStats;
import kotlin.getRenewExpiresOn;
import kotlin.getShowPopup;
import kotlin.getSignInCredentialFromIntent;
import kotlin.getValidationToken;
import kotlin.getVideoFrameMetadataListener;
import kotlin.getYear;
import kotlin.hasMixIns;
import kotlin.lambdaonDetachedFromWindow0comgoogleandroidexoplayer2videosphericalSphericalGLSurfaceView;
import kotlin.maybeGetTypeVariable;
import kotlin.parseProj;
import kotlin.setBitrateKbps;
import kotlin.setSdkPayload;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaDataUcModel;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u0003J!\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0003R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u001b\u0010\u0012\u001a\u00020\u00178CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0011\u001a\u00020\u001b8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR\"\u0010\u001e\u001a\u00020\u001d8\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#"}, d2 = {"Lcom/marrow2/ui/courseswitch/fragment/CourseSwitchFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "MediaBrowserCompatItemReceiver", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "RemoteActionCompatParcelizer", "write", "read", "Lo/addFileTypeIfValidAndNotPresent;", "Lo/addFileTypeIfValidAndNotPresent;", "IconCompatParcelizer", "Lcom/marrow2/ui/courseswitch/viewmodel/CourseSwitchViewModel;", "Lo/RenewEligible;", "AudioAttributesCompatParcelizer", "()Lcom/marrow2/ui/courseswitch/viewmodel/CourseSwitchViewModel;", "Lo/parseProj;", "Lo/parseProj;", "Lo/BandwidthMeterEventListenerEventDispatcherHandlerAndListener;", "syncManager", "Lo/BandwidthMeterEventListenerEventDispatcherHandlerAndListener;", "getSyncManager", "()Lo/BandwidthMeterEventListenerEventDispatcherHandlerAndListener;", "setSyncManager", "(Lo/BandwidthMeterEventListenerEventDispatcherHandlerAndListener;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CourseSwitchFragment extends drawFrame {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private addFileTypeIfValidAndNotPresent IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private parseProj RemoteActionCompatParcelizer;

    @setSdkPayload
    public BandwidthMeterEventListenerEventDispatcherHandlerAndListener syncManager;
    private final RenewEligible write;

    public CourseSwitchFragment() {
        CourseSwitchFragment courseSwitchFragment = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass1(new AnonymousClass5(courseSwitchFragment)));
        this.write = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(CourseSwitchViewModel.class), new AnonymousClass2(renewEligibleWrite), new AnonymousClass4(renewEligibleWrite), new AnonymousClass3(courseSwitchFragment, renewEligibleWrite));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CourseSwitchViewModel AudioAttributesCompatParcelizer() {
        return (CourseSwitchViewModel) this.write.RemoteActionCompatParcelizer();
    }

    public final BandwidthMeterEventListenerEventDispatcherHandlerAndListener getSyncManager() {
        BandwidthMeterEventListenerEventDispatcherHandlerAndListener bandwidthMeterEventListenerEventDispatcherHandlerAndListener = this.syncManager;
        if (bandwidthMeterEventListenerEventDispatcherHandlerAndListener != null) {
            return bandwidthMeterEventListenerEventDispatcherHandlerAndListener;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    public final void setSyncManager(BandwidthMeterEventListenerEventDispatcherHandlerAndListener bandwidthMeterEventListenerEventDispatcherHandlerAndListener) {
        toMagicModuleMetaRepoModel.write(bandwidthMeterEventListenerEventDispatcherHandlerAndListener, "");
        this.syncManager = bandwidthMeterEventListenerEventDispatcherHandlerAndListener;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        addFileTypeIfValidAndNotPresent addfiletypeifvalidandnotpresentRemoteActionCompatParcelizer = addFileTypeIfValidAndNotPresent.RemoteActionCompatParcelizer(p0, p1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(addfiletypeifvalidandnotpresentRemoteActionCompatParcelizer, "");
        this.IconCompatParcelizer = addfiletypeifvalidandnotpresentRemoteActionCompatParcelizer;
        if (addfiletypeifvalidandnotpresentRemoteActionCompatParcelizer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            addfiletypeifvalidandnotpresentRemoteActionCompatParcelizer = null;
        }
        ConstraintLayout constraintLayoutIconCompatParcelizer = addfiletypeifvalidandnotpresentRemoteActionCompatParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer, "");
        return constraintLayoutIconCompatParcelizer;
    }

    private final void MediaBrowserCompatItemReceiver() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            addFileTypeIfValidAndNotPresent addfiletypeifvalidandnotpresent = this.IconCompatParcelizer;
            if (addfiletypeifvalidandnotpresent == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                addfiletypeifvalidandnotpresent = null;
            }
            RecyclerView recyclerView = addfiletypeifvalidandnotpresent.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
            bytesRead.write(contextRequireContext, recyclerView);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        RemoteActionCompatParcelizer();
        write();
        read();
        MediaBrowserCompatItemReceiver();
    }

    private final void RemoteActionCompatParcelizer() {
        addFileTypeIfValidAndNotPresent addfiletypeifvalidandnotpresent = this.IconCompatParcelizer;
        addFileTypeIfValidAndNotPresent addfiletypeifvalidandnotpresent2 = null;
        if (addfiletypeifvalidandnotpresent == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            addfiletypeifvalidandnotpresent = null;
        }
        Toolbar toolbar = addfiletypeifvalidandnotpresent.MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(toolbar, "");
        getHttpMethodString.read((View) toolbar, true, false, true, true, 0, 50);
        addFileTypeIfValidAndNotPresent addfiletypeifvalidandnotpresent3 = this.IconCompatParcelizer;
        if (addfiletypeifvalidandnotpresent3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            addfiletypeifvalidandnotpresent3 = null;
        }
        LinearLayout linearLayout = addfiletypeifvalidandnotpresent3.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        getHttpMethodString.read((View) linearLayout, false, true, true, true, 0, 49);
        addFileTypeIfValidAndNotPresent addfiletypeifvalidandnotpresent4 = this.IconCompatParcelizer;
        if (addfiletypeifvalidandnotpresent4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            addfiletypeifvalidandnotpresent2 = addfiletypeifvalidandnotpresent4;
        }
        ProgressBar progressBar = addfiletypeifvalidandnotpresent2.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
        getHttpMethodString.read((View) progressBar, true, true, true, true, 0, 48);
    }

    private final void write() {
        addFileTypeIfValidAndNotPresent addfiletypeifvalidandnotpresent = this.IconCompatParcelizer;
        addFileTypeIfValidAndNotPresent addfiletypeifvalidandnotpresent2 = null;
        if (addfiletypeifvalidandnotpresent == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            addfiletypeifvalidandnotpresent = null;
        }
        addfiletypeifvalidandnotpresent.MediaBrowserCompatCustomActionResultReceiver.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.parseMshp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CourseSwitchFragment.MediaBrowserCompatItemReceiver(this.AudioAttributesCompatParcelizer);
            }
        });
        this.RemoteActionCompatParcelizer = new parseProj(new MagicModuleSubmissionRequestBody() { // from class: o.ProjectionRendererMeshData
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CourseSwitchFragment.IconCompatParcelizer(this.IconCompatParcelizer, (CourseModelV3) obj, ((Integer) obj2).intValue());
            }
        }, new getAnswerMap() { // from class: o.setProjection
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return CourseSwitchFragment.IconCompatParcelizer(this.read, (CourseModelV3) obj);
            }
        });
        addFileTypeIfValidAndNotPresent addfiletypeifvalidandnotpresent3 = this.IconCompatParcelizer;
        if (addfiletypeifvalidandnotpresent3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            addfiletypeifvalidandnotpresent3 = null;
        }
        RecyclerView recyclerView = addfiletypeifvalidandnotpresent3.IconCompatParcelizer;
        parseProj parseproj = this.RemoteActionCompatParcelizer;
        if (parseproj == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            parseproj = null;
        }
        recyclerView.setAdapter(parseproj);
        addFileTypeIfValidAndNotPresent addfiletypeifvalidandnotpresent4 = this.IconCompatParcelizer;
        if (addfiletypeifvalidandnotpresent4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            addfiletypeifvalidandnotpresent2 = addfiletypeifvalidandnotpresent4;
        }
        addfiletypeifvalidandnotpresent2.RemoteActionCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.SceneRenderer
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CourseSwitchFragment.AudioAttributesImplApi26Parcelizer(this.AudioAttributesCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatItemReceiver(CourseSwitchFragment courseSwitchFragment) {
        maybeGetTypeVariable activity = courseSwitchFragment.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(CourseSwitchFragment courseSwitchFragment, CourseModelV3 courseModelV3, int i) {
        toMagicModuleMetaRepoModel.write(courseModelV3, "");
        courseSwitchFragment.AudioAttributesCompatParcelizer().write(new getVideoFrameMetadataListener.IconCompatParcelizer(Integer.parseInt(courseModelV3.getCourseId()), i));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(CourseSwitchFragment courseSwitchFragment, CourseModelV3 courseModelV3) {
        toMagicModuleMetaRepoModel.write(courseModelV3, "");
        getSignInCredentialFromIntent.Companion companion = getSignInCredentialFromIntent.INSTANCE;
        String title = courseModelV3.getTitle();
        LearnMoreModelV3 learnMore = courseModelV3.getLearnMore();
        String introPara = learnMore != null ? learnMore.getIntroPara() : null;
        LearnMoreModelV3 learnMore2 = courseModelV3.getLearnMore();
        ArrayList<String> courseComponents = learnMore2 != null ? learnMore2.getCourseComponents() : null;
        if (courseComponents == null) {
            courseComponents = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        getSignInCredentialFromIntent.Companion.IconCompatParcelizer(title, introPara, courseComponents).show(courseSwitchFragment.getChildFragmentManager(), "learn_more_dialog");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesImplApi26Parcelizer(CourseSwitchFragment courseSwitchFragment) {
        courseSwitchFragment.AudioAttributesCompatParcelizer().write(getVideoFrameMetadataListener.read.INSTANCE);
    }

    /* JADX INFO: renamed from: com.marrow2.ui.courseswitch.fragment.CourseSwitchFragment$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "write", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$read;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Fragment fragment) {
            super(0);
            this.$read = fragment;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        /* JADX INFO: renamed from: com.marrow2.ui.courseswitch.fragment.CourseSwitchFragment$write$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements getValidationToken {
            private /* synthetic */ CourseSwitchFragment write;

            @Override // kotlin.getValidationToken
            public final /* synthetic */ Object IconCompatParcelizer(Object obj, SampleVideos sampleVideos) {
                return AudioAttributesCompatParcelizer((lambdaonDetachedFromWindow0comgoogleandroidexoplayer2videosphericalSphericalGLSurfaceView) obj);
            }

            private Object AudioAttributesCompatParcelizer(lambdaonDetachedFromWindow0comgoogleandroidexoplayer2videosphericalSphericalGLSurfaceView lambdaondetachedfromwindow0comgoogleandroidexoplayer2videosphericalsphericalglsurfaceview) {
                String str;
                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(lambdaondetachedfromwindow0comgoogleandroidexoplayer2videosphericalsphericalglsurfaceview, lambdaonDetachedFromWindow0comgoogleandroidexoplayer2videosphericalSphericalGLSurfaceView.IconCompatParcelizer.INSTANCE)) {
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(lambdaondetachedfromwindow0comgoogleandroidexoplayer2videosphericalsphericalglsurfaceview, lambdaonDetachedFromWindow0comgoogleandroidexoplayer2videosphericalSphericalGLSurfaceView.write.INSTANCE)) {
                        CourseSwitchFragment courseSwitchFragment = this.write;
                        CourseSwitchFragment courseSwitchFragment2 = courseSwitchFragment;
                        String string = courseSwitchFragment.getString(R.string.app_error_no_internet);
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                        CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(courseSwitchFragment2, string, 0);
                    } else if (lambdaondetachedfromwindow0comgoogleandroidexoplayer2videosphericalsphericalglsurfaceview instanceof lambdaonDetachedFromWindow0comgoogleandroidexoplayer2videosphericalSphericalGLSurfaceView.MediaBrowserCompatCustomActionResultReceiver) {
                        CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(this.write, ((lambdaonDetachedFromWindow0comgoogleandroidexoplayer2videosphericalSphericalGLSurfaceView.MediaBrowserCompatCustomActionResultReceiver) lambdaondetachedfromwindow0comgoogleandroidexoplayer2videosphericalsphericalglsurfaceview).IconCompatParcelizer(), 0);
                    } else if (lambdaondetachedfromwindow0comgoogleandroidexoplayer2videosphericalsphericalglsurfaceview instanceof lambdaonDetachedFromWindow0comgoogleandroidexoplayer2videosphericalSphericalGLSurfaceView.read) {
                        Object[] objArr = {this.write.getSyncManager()};
                        int iOnRemoveQueueItem = getExamName.onRemoveQueueItem();
                        BandwidthMeterEventListenerEventDispatcherHandlerAndListener.read(getExamName.onRemoveQueueItem(), objArr, iOnRemoveQueueItem, 1896980334, getExamName.onRemoveQueueItem(), -1896980334, getExamName.onRemoveQueueItem());
                        SyncingActivity.Companion companion = SyncingActivity.INSTANCE;
                        Context contextRequireContext = this.write.requireContext();
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                        Intent intentRemoteActionCompatParcelizer = SyncingActivity.Companion.RemoteActionCompatParcelizer(contextRequireContext);
                        intentRemoteActionCompatParcelizer.setFlags(268468224);
                        this.write.requireActivity().finish();
                        this.write.startActivity(intentRemoteActionCompatParcelizer);
                    } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(lambdaondetachedfromwindow0comgoogleandroidexoplayer2videosphericalsphericalglsurfaceview, lambdaonDetachedFromWindow0comgoogleandroidexoplayer2videosphericalSphericalGLSurfaceView.RemoteActionCompatParcelizer.INSTANCE)) {
                        getAutofillClient.Companion companion2 = getAutofillClient.INSTANCE;
                        String string2 = this.write.getString(R.string.edition_switch_title);
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
                        String string3 = this.write.getString(R.string.edition_switch_message);
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
                        String string4 = this.write.getString(R.string.change_text);
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string4, "");
                        String string5 = this.write.getString(R.string.edition_cancel_switch_msg);
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string5, "");
                        getAutofillClient getautofillclientAudioAttributesCompatParcelizer = getAutofillClient.Companion.AudioAttributesCompatParcelizer(string2, string3, string4, string5, R.drawable.ic_change_course, null, true, false, null, 416);
                        FragmentManager childFragmentManager = this.write.getChildFragmentManager();
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childFragmentManager, "");
                        final CourseSwitchFragment courseSwitchFragment3 = this.write;
                        getBrowserClient.write(getautofillclientAudioAttributesCompatParcelizer, childFragmentManager, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.parseRawMshpData
                            @Override // kotlin.getCreatedOnDateMs
                            public final Object invoke() {
                                return CourseSwitchFragment.write.AnonymousClass1.read(courseSwitchFragment3);
                            }
                        }, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.ProjectionRenderer
                            @Override // kotlin.getCreatedOnDateMs
                            public final Object invoke() {
                                return CourseSwitchFragment.write.AnonymousClass1.AudioAttributesCompatParcelizer();
                            }
                        });
                        this.write.AudioAttributesCompatParcelizer().write(getVideoFrameMetadataListener.write.INSTANCE);
                    } else {
                        if (!(lambdaondetachedfromwindow0comgoogleandroidexoplayer2videosphericalsphericalglsurfaceview instanceof lambdaonDetachedFromWindow0comgoogleandroidexoplayer2videosphericalSphericalGLSurfaceView.AudioAttributesCompatParcelizer)) {
                            throw new RenewEligibleCreator();
                        }
                        lambdaonDetachedFromWindow0comgoogleandroidexoplayer2videosphericalSphericalGLSurfaceView.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (lambdaonDetachedFromWindow0comgoogleandroidexoplayer2videosphericalSphericalGLSurfaceView.AudioAttributesCompatParcelizer) lambdaondetachedfromwindow0comgoogleandroidexoplayer2videosphericalsphericalglsurfaceview;
                        if (audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer().length() == 0) {
                            str = "";
                        } else {
                            String string6 = this.write.getString(R.string.subtitle_switch_edition, audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer());
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string6, "");
                            str = string6;
                        }
                        getAutofillClient.Companion companion3 = getAutofillClient.INSTANCE;
                        String string7 = this.write.getString(R.string.title_switch_edition, audioAttributesCompatParcelizer.IconCompatParcelizer());
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string7, "");
                        String string8 = this.write.getString(R.string.btn_marrow_text);
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string8, "");
                        getAutofillClient getautofillclientAudioAttributesCompatParcelizer2 = getAutofillClient.Companion.AudioAttributesCompatParcelizer(string7, str, string8, null, R.drawable.ic_star, null, false, false, null, 424);
                        FragmentManager childFragmentManager2 = this.write.getChildFragmentManager();
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childFragmentManager2, "");
                        final CourseSwitchFragment courseSwitchFragment4 = this.write;
                        getBrowserClient.write(getautofillclientAudioAttributesCompatParcelizer2, childFragmentManager2, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.releaseSurface
                            @Override // kotlin.getCreatedOnDateMs
                            public final Object invoke() {
                                return CourseSwitchFragment.write.AnonymousClass1.RemoteActionCompatParcelizer(courseSwitchFragment4);
                            }
                        }, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.updateOrientationListenerRegistration
                            @Override // kotlin.getCreatedOnDateMs
                            public final Object invoke() {
                                return CourseSwitchFragment.write.AnonymousClass1.read();
                            }
                        });
                        this.write.AudioAttributesCompatParcelizer().write(getVideoFrameMetadataListener.write.INSTANCE);
                    }
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final getShowPopup read(CourseSwitchFragment courseSwitchFragment) {
                courseSwitchFragment.AudioAttributesCompatParcelizer().write(getVideoFrameMetadataListener.AudioAttributesCompatParcelizer.INSTANCE);
                return getShowPopup.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final getShowPopup AudioAttributesCompatParcelizer() {
                return getShowPopup.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final getShowPopup RemoteActionCompatParcelizer(CourseSwitchFragment courseSwitchFragment) {
                courseSwitchFragment.AudioAttributesCompatParcelizer().write(getVideoFrameMetadataListener.RemoteActionCompatParcelizer.INSTANCE);
                return getShowPopup.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final getShowPopup read() {
                return getShowPopup.INSTANCE;
            }

            AnonymousClass1(CourseSwitchFragment courseSwitchFragment) {
                this.write = courseSwitchFragment;
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                if (CourseSwitchFragment.this.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer().write(new AnonymousClass1(CourseSwitchFragment.this), this) == objIconCompatParcelizer) {
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
            return CourseSwitchFragment.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void read() {
        CourseSwitchFragment courseSwitchFragment = this;
        setBitrateKbps.RemoteActionCompatParcelizer(courseSwitchFragment, new write(null));
        setBitrateKbps.RemoteActionCompatParcelizer(courseSwitchFragment, new IconCompatParcelizer(null));
        setBitrateKbps.RemoteActionCompatParcelizer(courseSwitchFragment, new read(null));
        setBitrateKbps.RemoteActionCompatParcelizer(courseSwitchFragment, new RemoteActionCompatParcelizer(null));
    }

    /* JADX INFO: renamed from: com.marrow2.ui.courseswitch.fragment.CourseSwitchFragment$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "write", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$write.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$write = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: com.marrow2.ui.courseswitch.fragment.CourseSwitchFragment$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "write", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: com.marrow2.ui.courseswitch.fragment.CourseSwitchFragment$4, reason: invalid class name */
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

    /* JADX INFO: renamed from: com.marrow2.ui.courseswitch.fragment.CourseSwitchFragment$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "IconCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $IconCompatParcelizer;
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$write);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$IconCompatParcelizer.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$IconCompatParcelizer = fragment;
            this.$write = renewEligible;
        }
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<addVideoSurfaceListener> setupdatedstatus = CourseSwitchFragment.this.AudioAttributesCompatParcelizer().read();
                final CourseSwitchFragment courseSwitchFragment = CourseSwitchFragment.this;
                this.IconCompatParcelizer = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: com.marrow2.ui.courseswitch.fragment.CourseSwitchFragment.IconCompatParcelizer.2
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((addVideoSurfaceListener) obj2);
                    }

                    private Object IconCompatParcelizer(addVideoSurfaceListener addvideosurfacelistener) {
                        parseProj parseproj = courseSwitchFragment.RemoteActionCompatParcelizer;
                        if (parseproj == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            parseproj = null;
                        }
                        parseproj.IconCompatParcelizer(addvideosurfacelistener.IconCompatParcelizer(), addvideosurfacelistener.getAudioAttributesCompatParcelizer(), addvideosurfacelistener.getIconCompatParcelizer());
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
            return CourseSwitchFragment.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<String> setupdatedstatusIconCompatParcelizer = CourseSwitchFragment.this.AudioAttributesCompatParcelizer().IconCompatParcelizer();
                final CourseSwitchFragment courseSwitchFragment = CourseSwitchFragment.this;
                this.IconCompatParcelizer = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: com.marrow2.ui.courseswitch.fragment.CourseSwitchFragment.read.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((String) obj2);
                    }

                    private Object write(String str) {
                        String str2 = str;
                        addFileTypeIfValidAndNotPresent addfiletypeifvalidandnotpresent = null;
                        if (str2 == null || str2.length() == 0) {
                            addFileTypeIfValidAndNotPresent addfiletypeifvalidandnotpresent2 = courseSwitchFragment.IconCompatParcelizer;
                            if (addfiletypeifvalidandnotpresent2 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                addfiletypeifvalidandnotpresent = addfiletypeifvalidandnotpresent2;
                            }
                            TextView textView = addfiletypeifvalidandnotpresent.write;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView);
                        } else {
                            addFileTypeIfValidAndNotPresent addfiletypeifvalidandnotpresent3 = courseSwitchFragment.IconCompatParcelizer;
                            if (addfiletypeifvalidandnotpresent3 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                addfiletypeifvalidandnotpresent3 = null;
                            }
                            TextView textView2 = addfiletypeifvalidandnotpresent3.write;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
                            PlayerControlViewExternalSyntheticLambda1.write((View) textView2);
                            addFileTypeIfValidAndNotPresent addfiletypeifvalidandnotpresent4 = courseSwitchFragment.IconCompatParcelizer;
                            if (addfiletypeifvalidandnotpresent4 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                addfiletypeifvalidandnotpresent = addfiletypeifvalidandnotpresent4;
                            }
                            addfiletypeifvalidandnotpresent.write.setText(courseSwitchFragment.getString(R.string.course_label_header, str));
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
            return CourseSwitchFragment.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Boolean> setupdatedstatusMediaBrowserCompatCustomActionResultReceiver = CourseSwitchFragment.this.AudioAttributesCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver();
                final CourseSwitchFragment courseSwitchFragment = CourseSwitchFragment.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusMediaBrowserCompatCustomActionResultReceiver.write(new getValidationToken() { // from class: com.marrow2.ui.courseswitch.fragment.CourseSwitchFragment.RemoteActionCompatParcelizer.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read(((Boolean) obj2).booleanValue());
                    }

                    private Object read(boolean z) {
                        addFileTypeIfValidAndNotPresent addfiletypeifvalidandnotpresent = courseSwitchFragment.IconCompatParcelizer;
                        if (addfiletypeifvalidandnotpresent == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            addfiletypeifvalidandnotpresent = null;
                        }
                        ProgressBar progressBar = addfiletypeifvalidandnotpresent.read;
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

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return CourseSwitchFragment.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.marrow2.ui.courseswitch.fragment.CourseSwitchFragment$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/marrow2/ui/courseswitch/fragment/CourseSwitchFragment$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/getCameraMotionListener;", "p0", "Lcom/marrow2/ui/courseswitch/fragment/CourseSwitchFragment;", "AudioAttributesCompatParcelizer", "(Lo/getCameraMotionListener;)Lcom/marrow2/ui/courseswitch/fragment/CourseSwitchFragment;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static CourseSwitchFragment AudioAttributesCompatParcelizer(getCameraMotionListener p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            CourseSwitchFragment courseSwitchFragment = new CourseSwitchFragment();
            courseSwitchFragment.setArguments(p0.IconCompatParcelizer());
            return courseSwitchFragment;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
