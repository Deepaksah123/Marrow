package kotlin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.util.DeviceProperties;
import com.marrow.R;
import com.marrow2.ui.custom_module.done.CustomModuleScoreViewModel;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin.getAutofillClient;
import kotlin.getFieldValue;
import kotlin.isFieldSet;
import kotlin.onSingleTapUp;
import kotlin.setForceApplySystemWindowInsetTop;
import kotlin.withFieldVisibility;
import kotlin.zadb;

/* JADX INFO: renamed from: o.zzp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0012\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001d\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\rH\u0002¢\u0006\u0004\b \u0010\u0003R\u0016\u0010\u0010\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u001b\u0010\u0012\u001a\u00020#8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010$\u001a\u0004\b\u0018\u0010%"}, d2 = {"Lo/zzp;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "RemoteActionCompatParcelizer", "", "write", "(Z)V", "AudioAttributesImplBaseParcelizer", "", "(I)V", "", "read", "(Ljava/lang/String;)V", "MediaBrowserCompatMediaItem", "AudioAttributesCompatParcelizer", "(I)Ljava/lang/String;", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatItemReceiver", "MediaBrowserCompatCustomActionResultReceiver", "Lo/createTsExtractor;", "Lo/createTsExtractor;", "Lcom/marrow2/ui/custom_module/done/CustomModuleScoreViewModel;", "Lo/RenewEligible;", "()Lcom/marrow2/ui/custom_module/done/CustomModuleScoreViewModel;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class C0297zzp extends isOfflineAccessRequested {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private createTsExtractor RemoteActionCompatParcelizer;

    public C0297zzp() {
        C0297zzp c0297zzp = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass1(new AnonymousClass5(c0297zzp)));
        this.write = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(CustomModuleScoreViewModel.class), new AnonymousClass4(renewEligibleWrite), new AnonymousClass2(renewEligibleWrite), new AnonymousClass3(c0297zzp, renewEligibleWrite));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CustomModuleScoreViewModel read() {
        return (CustomModuleScoreViewModel) this.write.RemoteActionCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        createTsExtractor createtsextractorIconCompatParcelizer = createTsExtractor.IconCompatParcelizer(p0, p1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(createtsextractorIconCompatParcelizer, "");
        this.RemoteActionCompatParcelizer = createtsextractorIconCompatParcelizer;
        if (createtsextractorIconCompatParcelizer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createtsextractorIconCompatParcelizer = null;
        }
        ScrollView scrollViewIconCompatParcelizer = createtsextractorIconCompatParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollViewIconCompatParcelizer, "");
        return scrollViewIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        RemoteActionCompatParcelizer();
        AudioAttributesImplApi26Parcelizer();
        AudioAttributesImplBaseParcelizer();
        MediaBrowserCompatCustomActionResultReceiver();
        write(4);
    }

    private final void RemoteActionCompatParcelizer() {
        createTsExtractor createtsextractor = this.RemoteActionCompatParcelizer;
        if (createtsextractor == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createtsextractor = null;
        }
        ConstraintLayout constraintLayout = createtsextractor.onAddQueueItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        getHttpMethodString.read((View) constraintLayout, true, true, true, true, 0, 48);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(boolean p0) {
        createTsExtractor createtsextractor = this.RemoteActionCompatParcelizer;
        createTsExtractor createtsextractor2 = null;
        if (createtsextractor == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createtsextractor = null;
        }
        createtsextractor.RemoteActionCompatParcelizer.setEnabled(p0);
        createTsExtractor createtsextractor3 = this.RemoteActionCompatParcelizer;
        if (createtsextractor3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createtsextractor3 = null;
        }
        createtsextractor3.RemoteActionCompatParcelizer.setSelected(p0);
        if (p0) {
            createTsExtractor createtsextractor4 = this.RemoteActionCompatParcelizer;
            if (createtsextractor4 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                createtsextractor2 = createtsextractor4;
            }
            createtsextractor2.RemoteActionCompatParcelizer.setAlpha(1.0f);
            return;
        }
        createTsExtractor createtsextractor5 = this.RemoteActionCompatParcelizer;
        if (createtsextractor5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            createtsextractor2 = createtsextractor5;
        }
        createtsextractor2.RemoteActionCompatParcelizer.setAlpha(0.5f);
        C0297zzp c0297zzp = this;
        String string = getString(R.string.review_after_test_is_ended);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(c0297zzp, string, 0);
    }

    /* JADX INFO: renamed from: o.zzp$AudioAttributesCompatParcelizer */
    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<String> setupdatedstatus = C0297zzp.this.read().read();
                final C0297zzp c0297zzp = C0297zzp.this;
                this.write = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.zzp.AudioAttributesCompatParcelizer.3
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((String) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(String str) {
                        createTsExtractor createtsextractor = c0297zzp.RemoteActionCompatParcelizer;
                        if (createtsextractor == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            createtsextractor = null;
                        }
                        createtsextractor.AudioAttributesImplBaseParcelizer.setText(str);
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
            return C0297zzp.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplBaseParcelizer() {
        C0297zzp c0297zzp = this;
        setBitrateKbps.read(c0297zzp, new AudioAttributesCompatParcelizer(null));
        setBitrateKbps.read(c0297zzp, new IconCompatParcelizer(null));
        setBitrateKbps.read(c0297zzp, new read(null));
        setBitrateKbps.RemoteActionCompatParcelizer(c0297zzp, new RemoteActionCompatParcelizer(null));
        setBitrateKbps.read(c0297zzp, new AudioAttributesImplBaseParcelizer(null));
        setBitrateKbps.RemoteActionCompatParcelizer(c0297zzp, new MediaBrowserCompatCustomActionResultReceiver(null));
        onSetRepeatMode.IconCompatParcelizer(requireActivity().getIconCompatParcelizer(), null, false, new getAnswerMap() { // from class: o.setDecodedBytesInternal
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return C0297zzp.read(this.RemoteActionCompatParcelizer, (onRemoveQueueItemAt) obj);
            }
        }, 3);
    }

    /* JADX INFO: renamed from: o.zzp$IconCompatParcelizer */
    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Pair<Integer, Integer>> setupdatedstatusAudioAttributesImplBaseParcelizer = C0297zzp.this.read().AudioAttributesImplBaseParcelizer();
                final C0297zzp c0297zzp = C0297zzp.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesImplBaseParcelizer.write(new getValidationToken() { // from class: o.zzp.IconCompatParcelizer.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((Pair) obj2);
                    }

                    private Object write(Pair<Integer, Integer> pair) {
                        int iIntValue = pair.write().intValue();
                        int iIntValue2 = pair.IconCompatParcelizer().intValue();
                        int i2 = iIntValue2 > 0 ? (int) ((iIntValue * 100.0f) / iIntValue2) : 0;
                        String strAudioAttributesCompatParcelizer = c0297zzp.AudioAttributesCompatParcelizer(i2);
                        String string = c0297zzp.getString(R.string.text_result_correct_out_of_total, QBankStatsResponse.RemoteActionCompatParcelizer(iIntValue), QBankStatsResponse.RemoteActionCompatParcelizer(iIntValue2));
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                        createTsExtractor createtsextractor = c0297zzp.RemoteActionCompatParcelizer;
                        createTsExtractor createtsextractor2 = null;
                        if (createtsextractor == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            createtsextractor = null;
                        }
                        createtsextractor.MediaMetadataCompat.setText(strAudioAttributesCompatParcelizer);
                        createTsExtractor createtsextractor3 = c0297zzp.RemoteActionCompatParcelizer;
                        if (createtsextractor3 == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            createtsextractor3 = null;
                        }
                        createtsextractor3.MediaDescriptionCompat.setText(string);
                        createTsExtractor createtsextractor4 = c0297zzp.RemoteActionCompatParcelizer;
                        if (createtsextractor4 == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            createtsextractor4 = null;
                        }
                        createtsextractor4.MediaBrowserCompatCustomActionResultReceiver.setProgress(i2);
                        StringBuilder sb = new StringBuilder();
                        sb.append(i2);
                        sb.append("%");
                        String string2 = sb.toString();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(iIntValue2);
                        sb2.append(" MCQs");
                        String string3 = sb2.toString();
                        createTsExtractor createtsextractor5 = c0297zzp.RemoteActionCompatParcelizer;
                        if (createtsextractor5 == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            createtsextractor5 = null;
                        }
                        createtsextractor5.MediaBrowserCompatSearchResultReceiver.setText(string2);
                        createTsExtractor createtsextractor6 = c0297zzp.RemoteActionCompatParcelizer;
                        if (createtsextractor6 == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            createtsextractor6 = null;
                        }
                        createtsextractor6.RatingCompat.setText(string3);
                        createTsExtractor createtsextractor7 = c0297zzp.RemoteActionCompatParcelizer;
                        if (createtsextractor7 == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                        } else {
                            createtsextractor2 = createtsextractor7;
                        }
                        TextView textView = createtsextractor2.RemoteActionCompatParcelizer;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
                        bytesRead.AudioAttributesImplApi21Parcelizer(textView);
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
            return C0297zzp.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.zzp$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "IconCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$IconCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Fragment fragment) {
            super(0);
            this.$IconCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.zzp$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "write", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$RemoteActionCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$RemoteActionCompatParcelizer = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.zzp$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "AudioAttributesCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.zzp$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "write", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $write = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.zzp$read */
    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Boolean> setupdatedstatusAudioAttributesImplApi26Parcelizer = C0297zzp.this.read().AudioAttributesImplApi26Parcelizer();
                final C0297zzp c0297zzp = C0297zzp.this;
                this.IconCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesImplApi26Parcelizer.write(new getValidationToken() { // from class: o.zzp.read.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((Boolean) obj2);
                    }

                    private Object read(Boolean bool) {
                        if (bool != null) {
                            c0297zzp.write(bool.booleanValue());
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
            return C0297zzp.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.zzp$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "RemoteActionCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $IconCompatParcelizer;
        private /* synthetic */ RenewEligible $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$read);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$IconCompatParcelizer.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$IconCompatParcelizer = fragment;
            this.$read = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.zzp$RemoteActionCompatParcelizer */
    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Integer> setupdatedstatusIconCompatParcelizer = C0297zzp.this.read().IconCompatParcelizer();
                final C0297zzp c0297zzp = C0297zzp.this;
                this.IconCompatParcelizer = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.zzp.RemoteActionCompatParcelizer.2
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer(((Number) obj2).intValue());
                    }

                    private Object IconCompatParcelizer(int i2) {
                        int integer = c0297zzp.getResources().getInteger(android.R.integer.config_longAnimTime);
                        createTsExtractor createtsextractor = c0297zzp.RemoteActionCompatParcelizer;
                        createTsExtractor createtsextractor2 = null;
                        if (createtsextractor == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            createtsextractor = null;
                        }
                        TextView textView = createtsextractor.MediaBrowserCompatSearchResultReceiver;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
                        createTsExtractor createtsextractor3 = c0297zzp.RemoteActionCompatParcelizer;
                        if (createtsextractor3 == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                        } else {
                            createtsextractor2 = createtsextractor3;
                        }
                        ProgressBar progressBar = createtsextractor2.MediaBrowserCompatCustomActionResultReceiver;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
                        onDraw.AudioAttributesCompatParcelizer(textView, progressBar, i2, integer << 1);
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
            return C0297zzp.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.zzp$AudioAttributesImplBaseParcelizer */
    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Boolean> setupdatedstatusMediaBrowserCompatItemReceiver = C0297zzp.this.read().MediaBrowserCompatItemReceiver();
                final C0297zzp c0297zzp = C0297zzp.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatusMediaBrowserCompatItemReceiver.write(new getValidationToken() { // from class: o.zzp.AudioAttributesImplBaseParcelizer.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer();
                    }

                    private Object RemoteActionCompatParcelizer() {
                        if (!c0297zzp.read().getHandleMediaPlayPauseIfPendingOnHandler()) {
                            c0297zzp.MediaBrowserCompatMediaItem();
                        } else {
                            createTsExtractor createtsextractor = c0297zzp.RemoteActionCompatParcelizer;
                            if (createtsextractor == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                createtsextractor = null;
                            }
                            ConstraintLayout constraintLayout = createtsextractor.IconCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(constraintLayout);
                            c0297zzp.write(0);
                            c0297zzp.read().AudioAttributesCompatParcelizer(isFieldSet.read.INSTANCE);
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
            return C0297zzp.this.new AudioAttributesImplBaseParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.zzp$MediaBrowserCompatCustomActionResultReceiver */
    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<getFieldValue> setupdatedstatusAudioAttributesCompatParcelizer = C0297zzp.this.read().AudioAttributesCompatParcelizer();
                final C0297zzp c0297zzp = C0297zzp.this;
                this.write = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.zzp.MediaBrowserCompatCustomActionResultReceiver.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((getFieldValue) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(getFieldValue getfieldvalue) {
                        if (getfieldvalue instanceof getFieldValue.IconCompatParcelizer) {
                            c0297zzp.read(((getFieldValue.IconCompatParcelizer) getfieldvalue).RemoteActionCompatParcelizer());
                        } else if (getfieldvalue instanceof getFieldValue.RemoteActionCompatParcelizer) {
                            if (!c0297zzp.requireActivity().isFinishing()) {
                                getFieldValue.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (getFieldValue.RemoteActionCompatParcelizer) getfieldvalue;
                                if (remoteActionCompatParcelizer.write().length() > 0) {
                                    createTsExtractor createtsextractor = c0297zzp.RemoteActionCompatParcelizer;
                                    if (createtsextractor == null) {
                                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                        createtsextractor = null;
                                    }
                                    createtsextractor.onCommand.setEnabled(true);
                                    String string = c0297zzp.getString(R.string.cm_share_body, remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(), remoteActionCompatParcelizer.write());
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                                    Context contextRequireContext = c0297zzp.requireContext();
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                                    scheduleUpdate.write(contextRequireContext, c0297zzp.getString(R.string.cm_share_title), string);
                                }
                            }
                            c0297zzp.read().AudioAttributesCompatParcelizer(isFieldSet.IconCompatParcelizer.INSTANCE);
                        } else if (getfieldvalue instanceof getFieldValue.read) {
                            C0297zzp c0297zzp2 = c0297zzp;
                            onSingleTapUp.Companion companion = onSingleTapUp.INSTANCE;
                            Context contextRequireContext2 = c0297zzp.requireContext();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
                            c0297zzp2.startActivity(onSingleTapUp.Companion.RemoteActionCompatParcelizer(contextRequireContext2, new WorkAccountClient(0, null, null, null, null, false, null, null, false, 0, null, null, false, 0L, 0L, false, null, 131071, null)));
                            c0297zzp.requireActivity().finish();
                        } else if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getfieldvalue, getFieldValue.write.INSTANCE)) {
                            throw new RenewEligibleCreator();
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

        MediaBrowserCompatCustomActionResultReceiver(SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return C0297zzp.this.new MediaBrowserCompatCustomActionResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(C0297zzp c0297zzp, onRemoveQueueItemAt onremovequeueitemat) {
        toMagicModuleMetaRepoModel.write(onremovequeueitemat, "");
        c0297zzp.AudioAttributesImplApi21Parcelizer();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(int p0) {
        createTsExtractor createtsextractor = this.RemoteActionCompatParcelizer;
        createTsExtractor createtsextractor2 = null;
        if (createtsextractor == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createtsextractor = null;
        }
        createtsextractor.MediaMetadataCompat.setVisibility(p0);
        createTsExtractor createtsextractor3 = this.RemoteActionCompatParcelizer;
        if (createtsextractor3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createtsextractor3 = null;
        }
        createtsextractor3.MediaDescriptionCompat.setVisibility(p0);
        createTsExtractor createtsextractor4 = this.RemoteActionCompatParcelizer;
        if (createtsextractor4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createtsextractor4 = null;
        }
        createtsextractor4.MediaBrowserCompatItemReceiver.setVisibility(p0);
        createTsExtractor createtsextractor5 = this.RemoteActionCompatParcelizer;
        if (createtsextractor5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createtsextractor5 = null;
        }
        createtsextractor5.AudioAttributesImplApi26Parcelizer.setVisibility(p0);
        createTsExtractor createtsextractor6 = this.RemoteActionCompatParcelizer;
        if (createtsextractor6 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            createtsextractor2 = createtsextractor6;
        }
        createtsextractor2.read.setVisibility(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(String p0) {
        AudioAttributesImplApi21Parcelizer();
        setForceApplySystemWindowInsetTop.Companion companion = setForceApplySystemWindowInsetTop.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        Intent intentAudioAttributesCompatParcelizer = setForceApplySystemWindowInsetTop.Companion.AudioAttributesCompatParcelizer(contextRequireContext, new setStaticLayoutBuilderConfigurer(p0, false, false, true, null, null, null, 118, null));
        intentAudioAttributesCompatParcelizer.addFlags(33554432);
        startActivity(intentAudioAttributesCompatParcelizer);
        requireActivity().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatMediaItem() {
        createTsExtractor createtsextractor = this.RemoteActionCompatParcelizer;
        if (createtsextractor == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createtsextractor = null;
        }
        ConstraintLayout constraintLayout = createtsextractor.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        onDraw.AudioAttributesCompatParcelizer(constraintLayout, Integer.valueOf(updateNavigation.read(contextRequireContext, 200)), (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.zzt
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return C0297zzp.onMediaButtonEvent(this.read);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onMediaButtonEvent(final C0297zzp c0297zzp) {
        c0297zzp.read().AudioAttributesCompatParcelizer(isFieldSet.RemoteActionCompatParcelizer.INSTANCE);
        createTsExtractor createtsextractor = c0297zzp.RemoteActionCompatParcelizer;
        createTsExtractor createtsextractor2 = null;
        if (createtsextractor == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createtsextractor = null;
        }
        ConstraintLayout constraintLayout = createtsextractor.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        ConstraintLayout constraintLayout2 = constraintLayout;
        createTsExtractor createtsextractor3 = c0297zzp.RemoteActionCompatParcelizer;
        if (createtsextractor3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createtsextractor3 = null;
        }
        ConstraintLayout constraintLayout3 = createtsextractor3.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout3, "");
        ConstraintLayout constraintLayout4 = constraintLayout3;
        createTsExtractor createtsextractor4 = c0297zzp.RemoteActionCompatParcelizer;
        if (createtsextractor4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            createtsextractor2 = createtsextractor4;
        }
        ConstraintLayout constraintLayout5 = createtsextractor2.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout5, "");
        onDraw.RemoteActionCompatParcelizer(constraintLayout2, constraintLayout4, constraintLayout5, new getCreatedOnDateMs() { // from class: o.zzs
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return C0297zzp.onPlayFromMediaId(this.IconCompatParcelizer);
            }
        });
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPlayFromMediaId(C0297zzp c0297zzp) {
        createTsExtractor createtsextractor = c0297zzp.RemoteActionCompatParcelizer;
        if (createtsextractor == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createtsextractor = null;
        }
        ConstraintLayout constraintLayout = createtsextractor.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(constraintLayout);
        c0297zzp.write(0);
        c0297zzp.read().AudioAttributesCompatParcelizer(isFieldSet.read.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String AudioAttributesCompatParcelizer(int p0) {
        if (p0 >= 90) {
            String string = getString(R.string.result_percent_text_90);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            return string;
        }
        if (p0 >= 75) {
            String string2 = getString(R.string.result_percent_text_75);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
            return string2;
        }
        if (p0 >= 50) {
            String string3 = getString(R.string.result_percent_text_50);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
            return string3;
        }
        String string4 = getString(R.string.result_percent_text_default);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string4, "");
        return string4;
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        zadb.Companion companion = zadb.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        Intent intentWrite = zadb.Companion.write(contextRequireContext);
        intentWrite.addFlags(268468224);
        startActivity(intentWrite);
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        createTsExtractor createtsextractor = this.RemoteActionCompatParcelizer;
        createTsExtractor createtsextractor2 = null;
        if (createtsextractor == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createtsextractor = null;
        }
        createtsextractor.AudioAttributesImplApi21Parcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.setStringsInternal
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0297zzp.MediaBrowserCompatMediaItem(this.RemoteActionCompatParcelizer);
            }
        });
        createTsExtractor createtsextractor3 = this.RemoteActionCompatParcelizer;
        if (createtsextractor3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createtsextractor3 = null;
        }
        createtsextractor3.RemoteActionCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.setStringInternal
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0297zzp.MediaBrowserCompatSearchResultReceiver(this.RemoteActionCompatParcelizer);
            }
        });
        createTsExtractor createtsextractor4 = this.RemoteActionCompatParcelizer;
        if (createtsextractor4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createtsextractor4 = null;
        }
        createtsextractor4.MediaBrowserCompatMediaItem.setOnClickListener(new View.OnClickListener() { // from class: o.zzu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0297zzp.onCustomAction(this.IconCompatParcelizer);
            }
        });
        createTsExtractor createtsextractor5 = this.RemoteActionCompatParcelizer;
        if (createtsextractor5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createtsextractor5 = null;
        }
        createtsextractor5.write.setOnClickListener(new View.OnClickListener() { // from class: o.setIntegerInternal
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0297zzp.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(this.AudioAttributesCompatParcelizer);
            }
        });
        createTsExtractor createtsextractor6 = this.RemoteActionCompatParcelizer;
        if (createtsextractor6 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createtsextractor6 = null;
        }
        createtsextractor6.AudioAttributesImplBaseParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.zzv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0297zzp.onAddQueueItem(this.read);
            }
        });
        createTsExtractor createtsextractor7 = this.RemoteActionCompatParcelizer;
        if (createtsextractor7 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            createtsextractor2 = createtsextractor7;
        }
        createtsextractor2.onCommand.setOnClickListener(new View.OnClickListener() { // from class: o.zzx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0297zzp.onCommand(this.read);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatMediaItem(C0297zzp c0297zzp) {
        c0297zzp.AudioAttributesImplApi21Parcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatSearchResultReceiver(C0297zzp c0297zzp) {
        createTsExtractor createtsextractor = c0297zzp.RemoteActionCompatParcelizer;
        if (createtsextractor == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createtsextractor = null;
        }
        if (createtsextractor.RemoteActionCompatParcelizer.isSelected()) {
            c0297zzp.read().AudioAttributesCompatParcelizer(isFieldSet.AudioAttributesImplApi26Parcelizer.INSTANCE);
            return;
        }
        C0297zzp c0297zzp2 = c0297zzp;
        String string = c0297zzp.getString(R.string.review_after_test_is_ended);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(c0297zzp2, string, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCustomAction(C0297zzp c0297zzp) {
        c0297zzp.MediaBrowserCompatItemReceiver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(C0297zzp c0297zzp) {
        c0297zzp.write();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAddQueueItem(C0297zzp c0297zzp) {
        c0297zzp.write();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCommand(C0297zzp c0297zzp) {
        createTsExtractor createtsextractor = c0297zzp.RemoteActionCompatParcelizer;
        if (createtsextractor == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createtsextractor = null;
        }
        createtsextractor.onCommand.setEnabled(false);
        CustomModuleScoreViewModel customModuleScoreViewModel = c0297zzp.read();
        String string = c0297zzp.getString(R.string.cm_share_title);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        customModuleScoreViewModel.AudioAttributesCompatParcelizer(new isFieldSet.AudioAttributesImplApi21Parcelizer(string));
    }

    private final void write() {
        read().AudioAttributesCompatParcelizer(isFieldSet.write.INSTANCE);
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        createTsExtractor createtsextractor = this.RemoteActionCompatParcelizer;
        if (createtsextractor == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createtsextractor = null;
        }
        dispatchTouchEvent.AudioAttributesCompatParcelizer(contextRequireContext, createtsextractor.AudioAttributesImplBaseParcelizer.getText().toString(), "");
        String string = getString(R.string.toast_copied, "Code");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(this, string, 0);
        read().AudioAttributesCompatParcelizer(isFieldSet.IconCompatParcelizer.INSTANCE);
    }

    private final void MediaBrowserCompatItemReceiver() {
        getAutofillClient.Companion companion = getAutofillClient.INSTANCE;
        String string = getString(R.string.text_custom_module_delete_confirm);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String string2 = getString(R.string.btn_cancel);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        String string3 = getString(R.string.yes_discard);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
        getAutofillClient getautofillclientAudioAttributesCompatParcelizer = getAutofillClient.Companion.AudioAttributesCompatParcelizer(string, null, string2, string3, 0, null, false, false, null, 498);
        FragmentManager childFragmentManager = getChildFragmentManager();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childFragmentManager, "");
        getBrowserClient.write(getautofillclientAudioAttributesCompatParcelizer, childFragmentManager, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.zzw
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return C0297zzp.MediaMetadataCompat();
            }
        }, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.getAuthorizationResultFromIntent
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return C0297zzp.handleMediaPlayPauseIfPendingOnHandler(this.AudioAttributesCompatParcelizer);
            }
        });
        read().AudioAttributesCompatParcelizer(isFieldSet.IconCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaMetadataCompat() {
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup handleMediaPlayPauseIfPendingOnHandler(C0297zzp c0297zzp) {
        c0297zzp.read().AudioAttributesCompatParcelizer(isFieldSet.AudioAttributesCompatParcelizer.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: renamed from: o.zzp$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/zzp$write;", "", "<init>", "()V", "", "p0", "p1", "Landroidx/fragment/app/Fragment;", "RemoteActionCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/fragment/app/Fragment;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Fragment RemoteActionCompatParcelizer(String p0, String p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            C0297zzp c0297zzp = new C0297zzp();
            Bundle bundle = new Bundle();
            bundle.putString("LessonDoneContract_cm_id", p0);
            bundle.putString("owner_category", p1);
            c0297zzp.setArguments(bundle);
            return c0297zzp;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            createTsExtractor createtsextractor = this.RemoteActionCompatParcelizer;
            createTsExtractor createtsextractor2 = null;
            if (createtsextractor == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                createtsextractor = null;
            }
            LinearLayout linearLayout = createtsextractor.MediaBrowserCompatItemReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            bytesRead.write(contextRequireContext, linearLayout);
            Context contextRequireContext2 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
            createTsExtractor createtsextractor3 = this.RemoteActionCompatParcelizer;
            if (createtsextractor3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                createtsextractor2 = createtsextractor3;
            }
            LinearLayout linearLayout2 = createtsextractor2.AudioAttributesImplApi26Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
            bytesRead.write(contextRequireContext2, linearLayout2);
        }
    }
}
