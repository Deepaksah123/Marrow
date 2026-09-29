package kotlin;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.marrow.R;
import com.marrow2.ui.qbank.tracker.QbankTrackerViewModel;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin.shouldEscapeCharacter;
import kotlin.withFieldVisibility;
import kotlin.zzek;
import kotlin.zzfa;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u0003J\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\f\u0010\u0012R\u001b\u0010\u000b\u001a\u00020\u00138GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0016\u001a\u00020\u00188CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u000f\u0010\u001a"}, d2 = {"Lo/zzek;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/View;", "p0", "Landroid/os/Bundle;", "p1", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "Lo/zzez;", "read", "(Lo/zzez;)V", "Lo/zzew;", "(Lo/zzew;)V", "Lo/shouldSpliceIn;", "IconCompatParcelizer", "Lo/setSessionInfo;", "write", "()Lo/shouldSpliceIn;", "Lcom/marrow2/ui/qbank/tracker/QbankTrackerViewModel;", "Lo/RenewEligible;", "()Lcom/marrow2/ui/qbank/tracker/QbankTrackerViewModel;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zzek extends zzef {
    private static /* synthetic */ isResolutionNotSupported<Object>[] read = {toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(zzek.class, "binding", "getBinding()Lcom/marrow/databinding/FragmentQbankTrackerBinding;", 0))};

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final setSessionInfo RemoteActionCompatParcelizer;

    public zzek() {
        super((byte) 0);
        zzek zzekVar = this;
        this.RemoteActionCompatParcelizer = SessionDescription.IconCompatParcelizer(zzekVar, new AudioAttributesImplApi26Parcelizer(), SessionDescriptionParser.RemoteActionCompatParcelizer());
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass4(new AnonymousClass5(zzekVar)));
        this.write = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(QbankTrackerViewModel.class), new AnonymousClass2(renewEligibleWrite), new AnonymousClass1(renewEligibleWrite), new AnonymousClass3(zzekVar, renewEligibleWrite));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final shouldSpliceIn write() {
        return (shouldSpliceIn) this.RemoteActionCompatParcelizer.read(this, read[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final QbankTrackerViewModel read() {
        return (QbankTrackerViewModel) this.write.RemoteActionCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        RemoteActionCompatParcelizer();
        AudioAttributesCompatParcelizer();
        write().MediaMetadataCompat.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.zzeh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zzek.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
            }
        });
        zzek zzekVar = this;
        setBitrateKbps.RemoteActionCompatParcelizer(zzekVar, new AudioAttributesCompatParcelizer(null));
        setBitrateKbps.RemoteActionCompatParcelizer(zzekVar, new read(null));
        setBitrateKbps.RemoteActionCompatParcelizer(zzekVar, new IconCompatParcelizer(null));
        write().MediaDescriptionCompat.setOnClickListener(new View.OnClickListener() { // from class: o.zzei
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zzek.AudioAttributesImplApi26Parcelizer(this.IconCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(zzek zzekVar) {
        zzekVar.requireActivity().onBackPressed();
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        /* JADX INFO: renamed from: o.zzek$AudioAttributesCompatParcelizer$1, reason: invalid class name */
        static final class AnonymousClass1<T> implements getValidationToken {
            private /* synthetic */ zzek AudioAttributesCompatParcelizer;

            @Override // kotlin.getValidationToken
            public final /* synthetic */ Object IconCompatParcelizer(Object obj, SampleVideos sampleVideos) {
                return read((DataSourceBitmapLoaderExternalSyntheticLambda0<zzeu>) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            private Object read(DataSourceBitmapLoaderExternalSyntheticLambda0<zzeu> dataSourceBitmapLoaderExternalSyntheticLambda0) {
                if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof setStreamingFormat) {
                    FrameLayout frameLayout = this.AudioAttributesCompatParcelizer.write().AudioAttributesCompatParcelizer;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
                    bytesRead.AudioAttributesImplApi21Parcelizer(frameLayout);
                } else if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof decodeBitmap) {
                    FrameLayout frameLayout2 = this.AudioAttributesCompatParcelizer.write().AudioAttributesCompatParcelizer;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout2, "");
                    PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(frameLayout2);
                    V vRemoteActionCompatParcelizer = ((decodeBitmap) dataSourceBitmapLoaderExternalSyntheticLambda0).RemoteActionCompatParcelizer();
                    final zzek zzekVar = this.AudioAttributesCompatParcelizer;
                    zzeu zzeuVar = (zzeu) vRemoteActionCompatParcelizer;
                    zzekVar.write().AudioAttributesImplBaseParcelizer.setText(zzeuVar.write());
                    zzekVar.write().write.setAdapter(new zzes(zzeuVar.read()));
                    ImageView imageView = zzekVar.write().MediaBrowserCompatSearchResultReceiver;
                    if (zzeuVar.RemoteActionCompatParcelizer()) {
                        imageView.setAlpha(1.0f);
                        imageView.setOnClickListener(new View.OnClickListener() { // from class: o.zzeo
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                zzek.AudioAttributesCompatParcelizer.AnonymousClass1.RemoteActionCompatParcelizer(zzekVar);
                            }
                        });
                    } else {
                        imageView.setAlpha(0.4f);
                        imageView.setOnClickListener(null);
                    }
                    ImageView imageView2 = zzekVar.write().MediaBrowserCompatCustomActionResultReceiver;
                    if (zzeuVar.IconCompatParcelizer()) {
                        imageView2.setAlpha(1.0f);
                        imageView2.setOnClickListener(new View.OnClickListener() { // from class: o.zzeq
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                zzek.AudioAttributesCompatParcelizer.AnonymousClass1.read(zzekVar);
                            }
                        });
                    } else {
                        imageView2.setAlpha(0.4f);
                        imageView2.setOnClickListener(null);
                    }
                } else {
                    if (!(dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof setTopBitrateKbps)) {
                        throw new RenewEligibleCreator();
                    }
                    CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, ((setTopBitrateKbps) dataSourceBitmapLoaderExternalSyntheticLambda0).getWrite(), 0);
                    this.AudioAttributesCompatParcelizer.requireActivity().onBackPressed();
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void RemoteActionCompatParcelizer(zzek zzekVar) {
                zzekVar.read().read(zzfa.RemoteActionCompatParcelizer.INSTANCE);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void read(zzek zzekVar) {
                zzekVar.read().read(zzfa.write.INSTANCE);
            }

            AnonymousClass1(zzek zzekVar) {
                this.AudioAttributesCompatParcelizer = zzekVar;
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                if (zzek.this.read().read().write(new AnonymousClass1(zzek.this), this) == objIconCompatParcelizer) {
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
            return zzek.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
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
                setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<zzez>> setupdatedstatusAudioAttributesCompatParcelizer = zzek.this.read().AudioAttributesCompatParcelizer();
                final zzek zzekVar = zzek.this;
                this.read = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.zzek.read.2
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((DataSourceBitmapLoaderExternalSyntheticLambda0) obj2);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    private Object IconCompatParcelizer(DataSourceBitmapLoaderExternalSyntheticLambda0<zzez> dataSourceBitmapLoaderExternalSyntheticLambda0) {
                        if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof decodeBitmap) {
                            LinearLayout linearLayout = zzekVar.write().read;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(linearLayout);
                            zzekVar.read((zzez) ((decodeBitmap) dataSourceBitmapLoaderExternalSyntheticLambda0).RemoteActionCompatParcelizer());
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
            return zzek.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.zzek$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "AudioAttributesCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$write;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Fragment fragment) {
            super(0);
            this.$write = fragment;
        }
    }

    /* JADX INFO: renamed from: o.zzek$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "AudioAttributesCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$write.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$write = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.zzek$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "read", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$read).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(RenewEligible renewEligible) {
            super(0);
            this.$read = renewEligible;
        }
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<zzew>> setupdatedstatusIconCompatParcelizer = zzek.this.read().IconCompatParcelizer();
                final zzek zzekVar = zzek.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.zzek.IconCompatParcelizer.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((DataSourceBitmapLoaderExternalSyntheticLambda0) obj2);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    private Object AudioAttributesCompatParcelizer(DataSourceBitmapLoaderExternalSyntheticLambda0<zzew> dataSourceBitmapLoaderExternalSyntheticLambda0) {
                        if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof decodeBitmap) {
                            zzekVar.AudioAttributesCompatParcelizer((zzew) ((decodeBitmap) dataSourceBitmapLoaderExternalSyntheticLambda0).RemoteActionCompatParcelizer());
                        } else {
                            ConstraintLayout constraintLayout = zzekVar.write().onAddQueueItem;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
                            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(constraintLayout);
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
            return zzek.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.zzek$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "AudioAttributesCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ RenewEligible $RemoteActionCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $read = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$RemoteActionCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RenewEligible renewEligible) {
            super(0);
            this.$RemoteActionCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.zzek$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "AudioAttributesCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$write);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$AudioAttributesCompatParcelizer.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
            this.$write = renewEligible;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesImplApi26Parcelizer(zzek zzekVar) {
        zzekVar.AudioAttributesImplApi26Parcelizer();
    }

    private final void RemoteActionCompatParcelizer() {
        MaterialToolbar materialToolbar = write().MediaMetadataCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialToolbar, "");
        getHttpMethodString.read((View) materialToolbar, true, false, true, true, 0, 50);
        NestedScrollView nestedScrollView = write().MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(nestedScrollView, "");
        getHttpMethodString.read((View) nestedScrollView, false, true, true, true, 0, 49);
    }

    private final void AudioAttributesCompatParcelizer() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            LinearLayout linearLayout = write().read;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            PlayerControlViewExternalSyntheticLambda1.IconCompatParcelizer(contextRequireContext, linearLayout);
            Context contextRequireContext2 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
            ConstraintLayout constraintLayout = write().onAddQueueItem;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
            PlayerControlViewExternalSyntheticLambda1.IconCompatParcelizer(contextRequireContext2, constraintLayout);
            Context contextRequireContext3 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext3, "");
            FrameLayout frameLayout = write().RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
            PlayerControlViewExternalSyntheticLambda1.IconCompatParcelizer(contextRequireContext3, frameLayout);
        }
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        read().read(zzfa.IconCompatParcelizer.INSTANCE);
        MaterialButton materialButton = write().MediaDescriptionCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialButton, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(materialButton);
        ImageView imageView = write().IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(imageView);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o.zzem
            @Override // java.lang.Runnable
            public final void run() {
                zzek.MediaBrowserCompatItemReceiver(this.IconCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatItemReceiver(zzek zzekVar) {
        Uri uriAudioAttributesCompatParcelizer = buildDownloadCompletedNotification.AudioAttributesCompatParcelizer(zzekVar.write().AudioAttributesImplApi21Parcelizer);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setFlags(268435456);
        intent.addFlags(1);
        intent.putExtra("android.intent.extra.STREAM", uriAudioAttributesCompatParcelizer);
        intent.setType(MimeTypes.IMAGE_PNG);
        zzekVar.startActivity(Intent.createChooser(intent, "Share with"));
        MaterialButton materialButton = zzekVar.write().MediaDescriptionCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialButton, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(materialButton);
        ImageView imageView = zzekVar.write().IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(imageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(zzez p0) {
        String quantityString = getResources().getQuantityString(R.plurals.module_completed, p0.RemoteActionCompatParcelizer(), Integer.valueOf(p0.write()));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(quantityString, "");
        shouldSpliceIn shouldspliceinWrite = write();
        shouldspliceinWrite.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.setText(quantityString);
        shouldspliceinWrite.onCommand.setText(String.valueOf(p0.RemoteActionCompatParcelizer()));
        String string = getString(R.string.total_module_count_subtext, Integer.valueOf(p0.write()));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new StyleSpan(1), 6, string.length() - 14, 33);
        shouldspliceinWrite.handleMediaPlayPauseIfPendingOnHandler.setText(spannableString);
        if (p0.write() > 0) {
            shouldspliceinWrite.AudioAttributesImplApi26Parcelizer.setProgress((int) ((p0.RemoteActionCompatParcelizer() / p0.write()) * 100.0f));
        }
    }

    public static final class AudioAttributesImplApi26Parcelizer implements getAnswerMap<zzek, shouldSpliceIn> {
        /* JADX WARN: Type inference failed for: r0v1, types: [o.getApplicationLabel, o.shouldSpliceIn] */
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ shouldSpliceIn invoke(zzek zzekVar) {
            return read(zzekVar);
        }

        private static shouldSpliceIn read(zzek zzekVar) {
            toMagicModuleMetaRepoModel.write(zzekVar, "");
            return shouldSpliceIn.RemoteActionCompatParcelizer(zzekVar.requireView());
        }
    }

    public static final class RemoteActionCompatParcelizer extends ClickableSpan {
        private /* synthetic */ zzew IconCompatParcelizer;

        RemoteActionCompatParcelizer(zzew zzewVar) {
            this.IconCompatParcelizer = zzewVar;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            toMagicModuleMetaRepoModel.write(textPaint, "");
            shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
            Context contextRequireContext = zzek.this.requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            textPaint.setColor(shouldEscapeCharacter.Companion.read(contextRequireContext, R.attr.onSurfaceBgLinks, new TypedValue(), true));
            textPaint.setUnderlineText(false);
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            toMagicModuleMetaRepoModel.write(view, "");
            if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(this.IconCompatParcelizer.AudioAttributesCompatParcelizer(), "http://") || TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(this.IconCompatParcelizer.AudioAttributesCompatParcelizer(), "https://")) {
                maybeGetTypeVariable maybegettypevariableRequireActivity = zzek.this.requireActivity();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(maybegettypevariableRequireActivity, "");
                ProjectionDrawMode.IconCompatParcelizer(maybegettypevariableRequireActivity, this.IconCompatParcelizer.AudioAttributesCompatParcelizer());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(zzew p0) {
        String strRemoteActionCompatParcelizer = p0.RemoteActionCompatParcelizer();
        String strIconCompatParcelizer = p0.IconCompatParcelizer();
        StringBuilder sb = new StringBuilder();
        sb.append(strRemoteActionCompatParcelizer);
        sb.append(strIconCompatParcelizer);
        SpannableString spannableString = new SpannableString(sb.toString());
        spannableString.setSpan(new RemoteActionCompatParcelizer(p0), p0.RemoteActionCompatParcelizer().length(), p0.RemoteActionCompatParcelizer().length() + p0.IconCompatParcelizer().length(), 33);
        spannableString.setSpan(new StyleSpan(1), p0.RemoteActionCompatParcelizer().length(), p0.RemoteActionCompatParcelizer().length() + p0.IconCompatParcelizer().length(), 33);
        shouldSpliceIn shouldspliceinWrite = write();
        shouldspliceinWrite.onCustomAction.setText(p0.read());
        shouldspliceinWrite.MediaBrowserCompatMediaItem.setText(p0.write());
        shouldspliceinWrite.RatingCompat.setText(spannableString);
        shouldspliceinWrite.RatingCompat.setMovementMethod(LinkMovementMethod.getInstance());
        ConstraintLayout constraintLayout = shouldspliceinWrite.onAddQueueItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(constraintLayout);
    }

    /* JADX INFO: renamed from: o.zzek$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/zzek$write;", "", "<init>", "()V", "Lo/zzek;", "AudioAttributesCompatParcelizer", "()Lo/zzek;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static zzek AudioAttributesCompatParcelizer() {
            return new zzek();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
