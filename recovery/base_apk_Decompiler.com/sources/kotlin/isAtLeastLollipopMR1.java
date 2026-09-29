package kotlin;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.material.appbar.AppBarLayout;
import com.marrow.R;
import com.marrow2.ui.plan.viewmodel.ReferralCouponViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin.checkCallingOrSelfPermission;
import kotlin.getPublicKeyCredential;
import kotlin.isInstantApp;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0012\u0010\u0017J!\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00182\b\u0010\u0007\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0010\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u0015J\u0019\u0010\u0010\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0010\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u001b\u0010\u0014\u001a\u00020\u001d8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 "}, d2 = {"Lo/isAtLeastLollipopMR1;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "read", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesCompatParcelizer", "", "RemoteActionCompatParcelizer", "(Ljava/lang/String;)V", "Lo/PackageManagerWrapper;", "(Lo/PackageManagerWrapper;)V", "Landroid/widget/TextView;", "(Landroid/widget/TextView;Ljava/lang/String;)V", "IconCompatParcelizer", "Lo/peekId3PrivTimestamp;", "Lo/peekId3PrivTimestamp;", "Lcom/marrow2/ui/plan/viewmodel/ReferralCouponViewModel;", "write", "Lo/RenewEligible;", "()Lcom/marrow2/ui/plan/viewmodel/ReferralCouponViewModel;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class isAtLeastLollipopMR1 extends isAtLeastLollipop {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private peekId3PrivTimestamp IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final RenewEligible RemoteActionCompatParcelizer;

    public isAtLeastLollipopMR1() {
        isAtLeastLollipopMR1 isatleastlollipopmr1 = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass4(new AnonymousClass1(isatleastlollipopmr1)));
        this.RemoteActionCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(ReferralCouponViewModel.class), new AnonymousClass5(renewEligibleWrite), new AnonymousClass3(renewEligibleWrite), new AnonymousClass2(isatleastlollipopmr1, renewEligibleWrite));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReferralCouponViewModel write() {
        return (ReferralCouponViewModel) this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        peekId3PrivTimestamp peekid3privtimestampWrite = peekId3PrivTimestamp.write(p0, p1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(peekid3privtimestampWrite, "");
        this.IconCompatParcelizer = peekid3privtimestampWrite;
        if (peekid3privtimestampWrite == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            peekid3privtimestampWrite = null;
        }
        CoordinatorLayout coordinatorLayoutIconCompatParcelizer = peekid3privtimestampWrite.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(coordinatorLayoutIconCompatParcelizer, "");
        return coordinatorLayoutIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        read();
        MediaBrowserCompatCustomActionResultReceiver();
        AudioAttributesCompatParcelizer();
        RemoteActionCompatParcelizer();
    }

    private final void read() {
        peekId3PrivTimestamp peekid3privtimestamp = this.IconCompatParcelizer;
        peekId3PrivTimestamp peekid3privtimestamp2 = null;
        if (peekid3privtimestamp == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            peekid3privtimestamp = null;
        }
        AppBarLayout appBarLayout = peekid3privtimestamp.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(appBarLayout, "");
        getHttpMethodString.read((View) appBarLayout, true, false, true, true, 0, 50);
        peekId3PrivTimestamp peekid3privtimestamp3 = this.IconCompatParcelizer;
        if (peekid3privtimestamp3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            peekid3privtimestamp2 = peekid3privtimestamp3;
        }
        NestedScrollView nestedScrollView = peekid3privtimestamp2.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(nestedScrollView, "");
        getHttpMethodString.read((View) nestedScrollView, false, true, true, true, 0, 49);
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            peekId3PrivTimestamp peekid3privtimestamp = this.IconCompatParcelizer;
            peekId3PrivTimestamp peekid3privtimestamp2 = null;
            if (peekid3privtimestamp == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                peekid3privtimestamp = null;
            }
            FrameLayout frameLayout = peekid3privtimestamp.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
            bytesRead.write(contextRequireContext, frameLayout);
            Context contextRequireContext2 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
            peekId3PrivTimestamp peekid3privtimestamp3 = this.IconCompatParcelizer;
            if (peekid3privtimestamp3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                peekid3privtimestamp3 = null;
            }
            FrameLayout frameLayout2 = peekid3privtimestamp3.write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout2, "");
            bytesRead.write(contextRequireContext2, frameLayout2);
            Context contextRequireContext3 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext3, "");
            peekId3PrivTimestamp peekid3privtimestamp4 = this.IconCompatParcelizer;
            if (peekid3privtimestamp4 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                peekid3privtimestamp4 = null;
            }
            LinearLayout linearLayout = peekid3privtimestamp4.AudioAttributesImplApi21Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            bytesRead.write(contextRequireContext3, linearLayout);
            Context contextRequireContext4 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext4, "");
            peekId3PrivTimestamp peekid3privtimestamp5 = this.IconCompatParcelizer;
            if (peekid3privtimestamp5 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                peekid3privtimestamp2 = peekid3privtimestamp5;
            }
            LinearLayout linearLayout2 = peekid3privtimestamp2.RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
            bytesRead.write(contextRequireContext4, linearLayout2);
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
                setUpdatedStatus<Boolean> setupdatedstatus = isAtLeastLollipopMR1.this.write().read();
                final isAtLeastLollipopMR1 isatleastlollipopmr1 = isAtLeastLollipopMR1.this;
                this.IconCompatParcelizer = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.isAtLeastLollipopMR1.read.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write(((Boolean) obj2).booleanValue());
                    }

                    private Object write(boolean z) {
                        peekId3PrivTimestamp peekid3privtimestamp = isatleastlollipopmr1.IconCompatParcelizer;
                        if (peekid3privtimestamp == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            peekid3privtimestamp = null;
                        }
                        ProgressBar progressBar = peekid3privtimestamp.MediaBrowserCompatItemReceiver;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
                        bytesRead.write(progressBar, z);
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
            return isAtLeastLollipopMR1.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesCompatParcelizer() {
        isAtLeastLollipopMR1 isatleastlollipopmr1 = this;
        setBitrateKbps.read(isatleastlollipopmr1, new read(null));
        setBitrateKbps.read(isatleastlollipopmr1, new IconCompatParcelizer(null));
        setBitrateKbps.read(isatleastlollipopmr1, new AudioAttributesCompatParcelizer(null));
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<isInstantApp> setupdatedstatusIconCompatParcelizer = isAtLeastLollipopMR1.this.write().IconCompatParcelizer();
                final isAtLeastLollipopMR1 isatleastlollipopmr1 = isAtLeastLollipopMR1.this;
                this.write = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.isAtLeastLollipopMR1.IconCompatParcelizer.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((isInstantApp) obj2);
                    }

                    private Object write(isInstantApp isinstantapp) {
                        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(isinstantapp, isInstantApp.AudioAttributesCompatParcelizer.INSTANCE)) {
                            if (isinstantapp instanceof isInstantApp.IconCompatParcelizer) {
                                isatleastlollipopmr1.IconCompatParcelizer(((isInstantApp.IconCompatParcelizer) isinstantapp).RemoteActionCompatParcelizer());
                            } else if (isinstantapp instanceof isInstantApp.RemoteActionCompatParcelizer) {
                                isatleastlollipopmr1.read(((isInstantApp.RemoteActionCompatParcelizer) isinstantapp).RemoteActionCompatParcelizer());
                            } else {
                                peekId3PrivTimestamp peekid3privtimestamp = null;
                                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(isinstantapp, isInstantApp.AudioAttributesImplApi21Parcelizer.INSTANCE)) {
                                    peekId3PrivTimestamp peekid3privtimestamp2 = isatleastlollipopmr1.IconCompatParcelizer;
                                    if (peekid3privtimestamp2 == null) {
                                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    } else {
                                        peekid3privtimestamp = peekid3privtimestamp2;
                                    }
                                    FrameLayout frameLayout = peekid3privtimestamp.write;
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
                                    bytesRead.AudioAttributesImplApi21Parcelizer(frameLayout);
                                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(isinstantapp, isInstantApp.write.INSTANCE)) {
                                    peekId3PrivTimestamp peekid3privtimestamp3 = isatleastlollipopmr1.IconCompatParcelizer;
                                    if (peekid3privtimestamp3 == null) {
                                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    } else {
                                        peekid3privtimestamp = peekid3privtimestamp3;
                                    }
                                    FrameLayout frameLayout2 = peekid3privtimestamp.write;
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout2, "");
                                    bytesRead.MediaBrowserCompatCustomActionResultReceiver(frameLayout2);
                                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(isinstantapp, isInstantApp.MediaBrowserCompatCustomActionResultReceiver.INSTANCE)) {
                                    isAtLeastLollipopMR1 isatleastlollipopmr12 = isatleastlollipopmr1;
                                    isAtLeastLollipopMR1 isatleastlollipopmr13 = isatleastlollipopmr12;
                                    String string = isatleastlollipopmr12.getString(R.string.app_error_no_internet);
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                                    CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(isatleastlollipopmr13, string, 0);
                                    isatleastlollipopmr1.requireActivity().onBackPressed();
                                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(isinstantapp, isInstantApp.AudioAttributesImplBaseParcelizer.INSTANCE)) {
                                    isAtLeastLollipopMR1 isatleastlollipopmr14 = isatleastlollipopmr1;
                                    String string2 = isatleastlollipopmr14.getString(R.string.referral_code_expired_text);
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
                                    isatleastlollipopmr14.RemoteActionCompatParcelizer(string2);
                                } else if (isinstantapp instanceof isInstantApp.MediaBrowserCompatItemReceiver) {
                                    isatleastlollipopmr1.RemoteActionCompatParcelizer(((isInstantApp.MediaBrowserCompatItemReceiver) isinstantapp).read());
                                } else {
                                    if (!(isinstantapp instanceof isInstantApp.read)) {
                                        throw new RenewEligibleCreator();
                                    }
                                    String string3 = isatleastlollipopmr1.getString(R.string.text_subscribe_for_free_extension);
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
                                    isInstantApp.read readVar = (isInstantApp.read) isinstantapp;
                                    String string4 = isatleastlollipopmr1.getString(R.string.f_referal_coupon_share_message, readVar.read(), QBankStatsResponse.RemoteActionCompatParcelizer(readVar.write()), readVar.AudioAttributesCompatParcelizer());
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string4, "");
                                    Context contextRequireContext = isatleastlollipopmr1.requireContext();
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                                    DataSink.write(contextRequireContext, string3, string4);
                                }
                            }
                        }
                        isatleastlollipopmr1.write().IconCompatParcelizer(checkCallingOrSelfPermission.read.INSTANCE);
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
            return isAtLeastLollipopMR1.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.isAtLeastLollipopMR1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "read", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$read;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Fragment fragment) {
            super(0);
            this.$read = fragment;
        }
    }

    /* JADX INFO: renamed from: o.isAtLeastLollipopMR1$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "IconCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$read.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$read = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.isAtLeastLollipopMR1$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "write", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$write).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(RenewEligible renewEligible) {
            super(0);
            this.$write = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.isAtLeastLollipopMR1$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "RemoteActionCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $IconCompatParcelizer = null;
        private /* synthetic */ RenewEligible $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$RemoteActionCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(RenewEligible renewEligible) {
            super(0);
            this.$RemoteActionCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.isAtLeastLollipopMR1$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "AudioAttributesCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;
        private /* synthetic */ Fragment $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$read.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$read = fragment;
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<getApplicationLabelAndIcon> setupdatedstatusAudioAttributesCompatParcelizer = isAtLeastLollipopMR1.this.write().AudioAttributesCompatParcelizer();
                final isAtLeastLollipopMR1 isatleastlollipopmr1 = isAtLeastLollipopMR1.this;
                this.write = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.isAtLeastLollipopMR1.AudioAttributesCompatParcelizer.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((getApplicationLabelAndIcon) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(getApplicationLabelAndIcon getapplicationlabelandicon) {
                        peekId3PrivTimestamp peekid3privtimestamp = isatleastlollipopmr1.IconCompatParcelizer;
                        peekId3PrivTimestamp peekid3privtimestamp2 = null;
                        if (peekid3privtimestamp == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            peekid3privtimestamp = null;
                        }
                        peekid3privtimestamp.MediaMetadataCompat.removeAllViews();
                        List<PackageManagerWrapper> listRemoteActionCompatParcelizer = getapplicationlabelandicon.RemoteActionCompatParcelizer();
                        isAtLeastLollipopMR1 isatleastlollipopmr12 = isatleastlollipopmr1;
                        Iterator<T> it = listRemoteActionCompatParcelizer.iterator();
                        while (it.hasNext()) {
                            isatleastlollipopmr12.AudioAttributesCompatParcelizer((PackageManagerWrapper) it.next());
                        }
                        peekId3PrivTimestamp peekid3privtimestamp3 = isatleastlollipopmr1.IconCompatParcelizer;
                        if (peekid3privtimestamp3 == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                        } else {
                            peekid3privtimestamp2 = peekid3privtimestamp3;
                        }
                        isAtLeastLollipopMR1 isatleastlollipopmr13 = isatleastlollipopmr1;
                        peekid3privtimestamp2.MediaBrowserCompatMediaItem.setEnabled(true);
                        peekid3privtimestamp2.MediaBrowserCompatSearchResultReceiver.setEnabled(true);
                        peekid3privtimestamp2.MediaBrowserCompatMediaItem.setClickable(true);
                        peekid3privtimestamp2.MediaBrowserCompatSearchResultReceiver.setClickable(true);
                        peekid3privtimestamp2.MediaDescriptionCompat.setText(getapplicationlabelandicon.getRead());
                        peekid3privtimestamp2.RatingCompat.setText(isatleastlollipopmr13.getString(R.string.f_benefit_details_title, QBankStatsResponse.RemoteActionCompatParcelizer(getapplicationlabelandicon.getAudioAttributesCompatParcelizer()), QBankStatsResponse.RemoteActionCompatParcelizer(getapplicationlabelandicon.getRemoteActionCompatParcelizer())));
                        peekid3privtimestamp2.AudioAttributesImplBaseParcelizer.setText(isatleastlollipopmr13.getString(R.string.f_referal_coupon_header, QBankStatsResponse.RemoteActionCompatParcelizer(getapplicationlabelandicon.getRemoteActionCompatParcelizer())));
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
            return isAtLeastLollipopMR1.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(String p0) {
        getPublicKeyCredential.Companion companion = getPublicKeyCredential.INSTANCE;
        String string = getString(R.string.btn_ok);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        getPublicKeyCredential getpublickeycredentialIconCompatParcelizer = getPublicKeyCredential.Companion.IconCompatParcelizer("", p0, string, false);
        FragmentManager childFragmentManager = getChildFragmentManager();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childFragmentManager, "");
        SignInPassword.IconCompatParcelizer(getpublickeycredentialIconCompatParcelizer, childFragmentManager, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.isAtLeastP
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return isAtLeastLollipopMR1.AudioAttributesImplBaseParcelizer(this.RemoteActionCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplBaseParcelizer(isAtLeastLollipopMR1 isatleastlollipopmr1) {
        maybeGetTypeVariable activity = isatleastlollipopmr1.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return getShowPopup.INSTANCE;
    }

    private final void RemoteActionCompatParcelizer() {
        peekId3PrivTimestamp peekid3privtimestamp = this.IconCompatParcelizer;
        peekId3PrivTimestamp peekid3privtimestamp2 = null;
        if (peekid3privtimestamp == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            peekid3privtimestamp = null;
        }
        peekid3privtimestamp.MediaBrowserCompatMediaItem.setOnClickListener(new View.OnClickListener() { // from class: o.isAtLeastO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                isAtLeastLollipopMR1.MediaBrowserCompatItemReceiver(this.write);
            }
        });
        peekId3PrivTimestamp peekid3privtimestamp3 = this.IconCompatParcelizer;
        if (peekid3privtimestamp3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            peekid3privtimestamp3 = null;
        }
        peekid3privtimestamp3.MediaBrowserCompatSearchResultReceiver.setOnClickListener(new View.OnClickListener() { // from class: o.isAtLeastQ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                isAtLeastLollipopMR1.MediaBrowserCompatCustomActionResultReceiver(this.IconCompatParcelizer);
            }
        });
        peekId3PrivTimestamp peekid3privtimestamp4 = this.IconCompatParcelizer;
        if (peekid3privtimestamp4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            peekid3privtimestamp2 = peekid3privtimestamp4;
        }
        peekid3privtimestamp2.MediaBrowserCompatCustomActionResultReceiver.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.isAtLeastR
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                isAtLeastLollipopMR1.AudioAttributesImplApi26Parcelizer(this.write);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatItemReceiver(isAtLeastLollipopMR1 isatleastlollipopmr1) {
        isatleastlollipopmr1.write().IconCompatParcelizer(checkCallingOrSelfPermission.AudioAttributesCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatCustomActionResultReceiver(isAtLeastLollipopMR1 isatleastlollipopmr1) {
        peekId3PrivTimestamp peekid3privtimestamp = isatleastlollipopmr1.IconCompatParcelizer;
        peekId3PrivTimestamp peekid3privtimestamp2 = null;
        if (peekid3privtimestamp == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            peekid3privtimestamp = null;
        }
        ProgressBar progressBar = peekid3privtimestamp.AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(progressBar);
        peekId3PrivTimestamp peekid3privtimestamp3 = isatleastlollipopmr1.IconCompatParcelizer;
        if (peekid3privtimestamp3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            peekid3privtimestamp2 = peekid3privtimestamp3;
        }
        Button button = peekid3privtimestamp2.MediaBrowserCompatSearchResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(button);
        isatleastlollipopmr1.write().IconCompatParcelizer(checkCallingOrSelfPermission.write.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesImplApi26Parcelizer(isAtLeastLollipopMR1 isatleastlollipopmr1) {
        maybeGetTypeVariable activity = isatleastlollipopmr1.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(PackageManagerWrapper p0) {
        View viewInflate;
        peekId3PrivTimestamp peekid3privtimestamp = null;
        if (p0.getWrite()) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(requireContext());
            peekId3PrivTimestamp peekid3privtimestamp2 = this.IconCompatParcelizer;
            if (peekid3privtimestamp2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                peekid3privtimestamp2 = null;
            }
            viewInflate = layoutInflaterFrom.inflate(R.layout.view_referal_coupon_unlocked_revamp, (ViewGroup) peekid3privtimestamp2.MediaMetadataCompat, false);
        } else {
            LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(requireContext());
            peekId3PrivTimestamp peekid3privtimestamp3 = this.IconCompatParcelizer;
            if (peekid3privtimestamp3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                peekid3privtimestamp3 = null;
            }
            viewInflate = layoutInflaterFrom2.inflate(R.layout.view_referal_coupon_locked_revamp, (ViewGroup) peekid3privtimestamp3.MediaMetadataCompat, false);
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.tvUnlockedDaysRowTitle);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tvUnlockedDaysRowSubTitle);
        textView.setText(getString(R.string.f_unlocked_days_title, Integer.valueOf(p0.getRead())));
        if (p0.getWrite()) {
            toMagicModuleMetaRepoModel.write(textView2);
            read(textView2, p0.getRemoteActionCompatParcelizer());
        }
        peekId3PrivTimestamp peekid3privtimestamp4 = this.IconCompatParcelizer;
        if (peekid3privtimestamp4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            peekid3privtimestamp = peekid3privtimestamp4;
        }
        peekid3privtimestamp.MediaMetadataCompat.addView(viewInflate);
    }

    private final void read(TextView p0, String p1) {
        String string;
        TextView textView = p0;
        bytesRead.AudioAttributesImplApi21Parcelizer(textView);
        String str = "";
        if (p1 == null) {
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView);
        } else {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p1, (Object) "")) {
                string = getString(R.string.text_referral_coupon_other_as_applier);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            } else {
                string = getString(R.string.f_referral_coupon_current_user_as_applier, p1);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            }
            str = string;
        }
        p0.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(String p0) {
        Object systemService = requireActivity().getSystemService("clipboard");
        toMagicModuleMetaRepoModel.read(systemService, "");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("referral_coupon", p0));
        isAtLeastLollipopMR1 isatleastlollipopmr1 = this;
        String string = getString(R.string.referral_code_has_been_copied);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(isatleastlollipopmr1, string, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(String p0) {
        AuthenticatorAssertionResponse authenticatorAssertionResponse = AuthenticatorAssertionResponse.INSTANCE;
        String string = getString(R.string.text_subscribe_for_free_extension);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        AuthenticatorAssertionResponse.read(p0, "subscribe", string, new MagicModuleSubmissionRequestBody() { // from class: o.isAtLeastS
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return isAtLeastLollipopMR1.IconCompatParcelizer(this.read, (String) obj, ((Boolean) obj2).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(isAtLeastLollipopMR1 isatleastlollipopmr1, String str, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        if (z) {
            String string = isatleastlollipopmr1.getString(R.string.app_error_no_internet);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(isatleastlollipopmr1, string, 0);
        }
        isatleastlollipopmr1.write().IconCompatParcelizer(new checkCallingOrSelfPermission.RemoteActionCompatParcelizer(str));
        peekId3PrivTimestamp peekid3privtimestamp = isatleastlollipopmr1.IconCompatParcelizer;
        peekId3PrivTimestamp peekid3privtimestamp2 = null;
        if (peekid3privtimestamp == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            peekid3privtimestamp = null;
        }
        ProgressBar progressBar = peekid3privtimestamp.AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(progressBar);
        peekId3PrivTimestamp peekid3privtimestamp3 = isatleastlollipopmr1.IconCompatParcelizer;
        if (peekid3privtimestamp3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            peekid3privtimestamp2 = peekid3privtimestamp3;
        }
        Button button = peekid3privtimestamp2.MediaBrowserCompatSearchResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(button);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: renamed from: o.isAtLeastLollipopMR1$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/isAtLeastLollipopMR1$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/isAtLeastLollipopMR1;", "read", "()Lo/isAtLeastLollipopMR1;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static isAtLeastLollipopMR1 read() {
            return new isAtLeastLollipopMR1();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
