package kotlin;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.util.DeviceProperties;
import com.marrow.R;
import com.marrow2.ui.custom_module.creation.viewmodel.CustomModuleCreationViewModel;
import com.marrow2.ui.custom_module.creation.viewmodel.CustomModuleModeViewModel;
import kotlin.AbstractC0287zzf;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin.getAccountTransferClient;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0003J!\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0003R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u001b\u0010\u0013\u001a\u00020\u00188CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u001bR\u001b\u0010\u0014\u001a\u00020\u001c8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u001a\u001a\u0004\b\u0019\u0010\u001d"}, d2 = {"Lo/AccountChangeEvent;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onStart", "onStop", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "AudioAttributesImplBaseParcelizer", "RemoteActionCompatParcelizer", "read", "Lo/isFmp4Variant;", "Lo/isFmp4Variant;", "write", "Lcom/marrow2/ui/custom_module/creation/viewmodel/CustomModuleModeViewModel;", "AudioAttributesCompatParcelizer", "Lo/RenewEligible;", "()Lcom/marrow2/ui/custom_module/creation/viewmodel/CustomModuleModeViewModel;", "Lcom/marrow2/ui/custom_module/creation/viewmodel/CustomModuleCreationViewModel;", "()Lcom/marrow2/ui/custom_module/creation/viewmodel/CustomModuleCreationViewModel;", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccountChangeEvent extends WorkAccountApi {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private isFmp4Variant write;
    private final RenewEligible read;

    public AccountChangeEvent() {
        AccountChangeEvent accountChangeEvent = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass1(new AnonymousClass5(accountChangeEvent)));
        this.RemoteActionCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(CustomModuleModeViewModel.class), new AnonymousClass3(renewEligibleWrite), new AnonymousClass4(renewEligibleWrite), new AnonymousClass2(accountChangeEvent, renewEligibleWrite));
        RenewEligible renewEligibleWrite2 = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass8(new getCreatedOnDateMs() { // from class: o.setEventIndex
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return AccountChangeEvent.MediaDescriptionCompat(this.RemoteActionCompatParcelizer);
            }
        }));
        this.read = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(CustomModuleCreationViewModel.class), new AnonymousClass7(renewEligibleWrite2), new AnonymousClass9(renewEligibleWrite2), new AnonymousClass10(accountChangeEvent, renewEligibleWrite2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CustomModuleModeViewModel write() {
        return (CustomModuleModeViewModel) this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CustomModuleCreationViewModel AudioAttributesCompatParcelizer() {
        return (CustomModuleCreationViewModel) this.read.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TypeResolutionContext MediaDescriptionCompat(AccountChangeEvent accountChangeEvent) {
        Fragment fragmentRequireParentFragment = accountChangeEvent.requireParentFragment();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        isFmp4Variant isfmp4variantAudioAttributesCompatParcelizer = isFmp4Variant.AudioAttributesCompatParcelizer(p0, p1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(isfmp4variantAudioAttributesCompatParcelizer, "");
        this.write = isfmp4variantAudioAttributesCompatParcelizer;
        if (isfmp4variantAudioAttributesCompatParcelizer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            isfmp4variantAudioAttributesCompatParcelizer = null;
        }
        LinearLayout linearLayoutIconCompatParcelizer = isfmp4variantAudioAttributesCompatParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
        return linearLayoutIconCompatParcelizer;
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<WorkAccountClient> setupdatedstatusAudioAttributesImplBaseParcelizer = AccountChangeEvent.this.AudioAttributesCompatParcelizer().AudioAttributesImplBaseParcelizer();
                final AccountChangeEvent accountChangeEvent = AccountChangeEvent.this;
                this.write = 1;
                if (setupdatedstatusAudioAttributesImplBaseParcelizer.write(new getValidationToken() { // from class: o.AccountChangeEvent.RemoteActionCompatParcelizer.3
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((WorkAccountClient) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(WorkAccountClient workAccountClient) {
                        accountChangeEvent.write().IconCompatParcelizer(workAccountClient);
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
            return AccountChangeEvent.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        setBitrateKbps.read(this, new RemoteActionCompatParcelizer(null));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        AudioAttributesCompatParcelizer().read(new AbstractC0287zzf.MediaMetadataCompat(write().IconCompatParcelizer().IconCompatParcelizer()));
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        AudioAttributesImplBaseParcelizer();
        read();
        RemoteActionCompatParcelizer();
    }

    private final void AudioAttributesImplBaseParcelizer() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            isFmp4Variant isfmp4variant = this.write;
            isFmp4Variant isfmp4variant2 = null;
            if (isfmp4variant == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                isfmp4variant = null;
            }
            LinearLayout linearLayout = isfmp4variant.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext, linearLayout);
            Context contextRequireContext2 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
            isFmp4Variant isfmp4variant3 = this.write;
            if (isfmp4variant3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                isfmp4variant2 = isfmp4variant3;
            }
            ConstraintLayout constraintLayout = isfmp4variant2.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext2, constraintLayout);
        }
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<WorkAccountClient> setupdatedstatusIconCompatParcelizer = AccountChangeEvent.this.write().IconCompatParcelizer();
                final AccountChangeEvent accountChangeEvent = AccountChangeEvent.this;
                this.write = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.AccountChangeEvent.write.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((WorkAccountClient) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(WorkAccountClient workAccountClient) {
                        isFmp4Variant isfmp4variant = accountChangeEvent.write;
                        isFmp4Variant isfmp4variant2 = null;
                        if (isfmp4variant == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            isfmp4variant = null;
                        }
                        isfmp4variant.AudioAttributesImplBaseParcelizer.setChecked(workAccountClient.getAudioAttributesImplApi26Parcelizer() == 1);
                        isFmp4Variant isfmp4variant3 = accountChangeEvent.write;
                        if (isfmp4variant3 == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            isfmp4variant3 = null;
                        }
                        RadioButton radioButton = isfmp4variant3.MediaBrowserCompatCustomActionResultReceiver;
                        isFmp4Variant isfmp4variant4 = accountChangeEvent.write;
                        if (isfmp4variant4 == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                        } else {
                            isfmp4variant2 = isfmp4variant4;
                        }
                        radioButton.setChecked(!isfmp4variant2.AudioAttributesImplBaseParcelizer.isChecked());
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
            return AccountChangeEvent.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void RemoteActionCompatParcelizer() {
        AccountChangeEvent accountChangeEvent = this;
        setBitrateKbps.RemoteActionCompatParcelizer(accountChangeEvent, new write(null));
        setBitrateKbps.RemoteActionCompatParcelizer(accountChangeEvent, new read(null));
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<Auth>> setupdatedstatusAudioAttributesCompatParcelizer = AccountChangeEvent.this.write().AudioAttributesCompatParcelizer();
                final AccountChangeEvent accountChangeEvent = AccountChangeEvent.this;
                this.write = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.AccountChangeEvent.read.4

                    /* JADX INFO: renamed from: o.AccountChangeEvent$read$4$AudioAttributesCompatParcelizer */
                    public static final /* synthetic */ class AudioAttributesCompatParcelizer {
                        public static final /* synthetic */ int[] write;

                        static {
                            int[] iArr = new int[CustomModuleModeViewModel.write.values().length];
                            try {
                                iArr[CustomModuleModeViewModel.write.AudioAttributesCompatParcelizer.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[CustomModuleModeViewModel.write.IconCompatParcelizer.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[CustomModuleModeViewModel.write.AudioAttributesImplApi21Parcelizer.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            try {
                                iArr[CustomModuleModeViewModel.write.write.ordinal()] = 4;
                            } catch (NoSuchFieldError unused4) {
                            }
                            try {
                                iArr[CustomModuleModeViewModel.write.read.ordinal()] = 5;
                            } catch (NoSuchFieldError unused5) {
                            }
                            try {
                                iArr[CustomModuleModeViewModel.write.RemoteActionCompatParcelizer.ordinal()] = 6;
                            } catch (NoSuchFieldError unused6) {
                            }
                            write = iArr;
                        }
                    }

                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((DataSourceBitmapLoaderExternalSyntheticLambda0) obj2);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    private Object AudioAttributesCompatParcelizer(DataSourceBitmapLoaderExternalSyntheticLambda0<Auth> dataSourceBitmapLoaderExternalSyntheticLambda0) {
                        String string;
                        isFmp4Variant isfmp4variant = null;
                        if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof setTopBitrateKbps) {
                            isFmp4Variant isfmp4variant2 = accountChangeEvent.write;
                            if (isfmp4variant2 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                isfmp4variant = isfmp4variant2;
                            }
                            TextView textView = isfmp4variant.MediaBrowserCompatItemReceiver;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView);
                        } else if (!(dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof setStreamingFormat)) {
                            if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof decodeBitmap) {
                                isFmp4Variant isfmp4variant3 = accountChangeEvent.write;
                                if (isfmp4variant3 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                } else {
                                    isfmp4variant = isfmp4variant3;
                                }
                                TextView textView2 = isfmp4variant.MediaBrowserCompatItemReceiver;
                                decodeBitmap decodebitmap = (decodeBitmap) dataSourceBitmapLoaderExternalSyntheticLambda0;
                                switch (AudioAttributesCompatParcelizer.write[((Auth) decodebitmap.RemoteActionCompatParcelizer()).getRemoteActionCompatParcelizer().ordinal()]) {
                                    case 1:
                                        string = accountChangeEvent.getString(R.string.f_custom_module_info_pro_user_0_monthly_completed, ((Auth) decodebitmap.RemoteActionCompatParcelizer()).getWrite(), ((Auth) decodebitmap.RemoteActionCompatParcelizer()).getIconCompatParcelizer());
                                        break;
                                    case 2:
                                        string = accountChangeEvent.getString(R.string.f_custom_module_info_pro_user_monthly_limit_not_reached, ((Auth) decodebitmap.RemoteActionCompatParcelizer()).getRead(), ((Auth) decodebitmap.RemoteActionCompatParcelizer()).getWrite(), ((Auth) decodebitmap.RemoteActionCompatParcelizer()).getAudioAttributesCompatParcelizer(), ((Auth) decodebitmap.RemoteActionCompatParcelizer()).getIconCompatParcelizer());
                                        break;
                                    case 3:
                                        string = accountChangeEvent.getString(R.string.f_custom_module_info_pro_user_monthly_limit_reached, ((Auth) decodebitmap.RemoteActionCompatParcelizer()).getIconCompatParcelizer());
                                        break;
                                    case 4:
                                        string = accountChangeEvent.getString(R.string.f_custom_module_info_free_user_0_completed, ((Auth) decodebitmap.RemoteActionCompatParcelizer()).getAudioAttributesImplApi21Parcelizer());
                                        break;
                                    case 5:
                                        string = accountChangeEvent.getString(R.string.f_custom_module_info_free_user_limit_not_reached, ((Auth) decodebitmap.RemoteActionCompatParcelizer()).getMediaBrowserCompatItemReceiver(), ((Auth) decodebitmap.RemoteActionCompatParcelizer()).getAudioAttributesImplApi21Parcelizer());
                                        break;
                                    case 6:
                                        string = accountChangeEvent.getString(R.string.f_custom_module_info_free_user_limit_reached, ((Auth) decodebitmap.RemoteActionCompatParcelizer()).getAudioAttributesImplApi21Parcelizer());
                                        break;
                                    default:
                                        throw new RenewEligibleCreator();
                                }
                                textView2.setText(string);
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
            return AccountChangeEvent.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.AccountChangeEvent$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "AudioAttributesCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$IconCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Fragment fragment) {
            super(0);
            this.$IconCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.AccountChangeEvent$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "read", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$AudioAttributesCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$AudioAttributesCompatParcelizer = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.AccountChangeEvent$8, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "AudioAttributesCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass8 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$AudioAttributesCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$AudioAttributesCompatParcelizer = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.AccountChangeEvent$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "AudioAttributesCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$read).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(RenewEligible renewEligible) {
            super(0);
            this.$read = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.AccountChangeEvent$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "IconCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass7 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$read).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(RenewEligible renewEligible) {
            super(0);
            this.$read = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.AccountChangeEvent$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "read", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ RenewEligible $RemoteActionCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $read = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$RemoteActionCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(RenewEligible renewEligible) {
            super(0);
            this.$RemoteActionCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.AccountChangeEvent$9, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "IconCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass9 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $write = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.AccountChangeEvent$10, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "RemoteActionCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass10 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;
        private /* synthetic */ RenewEligible $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$IconCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$AudioAttributesCompatParcelizer.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
            this.$IconCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.AccountChangeEvent$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "read", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $read;
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$write);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$read.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$read = fragment;
            this.$write = renewEligible;
        }
    }

    private final void read() {
        isFmp4Variant isfmp4variant = this.write;
        isFmp4Variant isfmp4variant2 = null;
        if (isfmp4variant == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            isfmp4variant = null;
        }
        isfmp4variant.write.setOnClickListener(new View.OnClickListener() { // from class: o.getAccountName
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccountChangeEvent.MediaBrowserCompatItemReceiver(this.AudioAttributesCompatParcelizer);
            }
        });
        isFmp4Variant isfmp4variant3 = this.write;
        if (isfmp4variant3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            isfmp4variant3 = null;
        }
        isfmp4variant3.AudioAttributesImplApi26Parcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.getChangeData
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccountChangeEvent.AudioAttributesImplApi26Parcelizer(this.IconCompatParcelizer);
            }
        });
        isFmp4Variant isfmp4variant4 = this.write;
        if (isfmp4variant4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            isfmp4variant4 = null;
        }
        isfmp4variant4.MediaBrowserCompatCustomActionResultReceiver.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.getChangeType
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                AccountChangeEvent.AudioAttributesCompatParcelizer(this.write, z);
            }
        });
        isFmp4Variant isfmp4variant5 = this.write;
        if (isfmp4variant5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            isfmp4variant5 = null;
        }
        isfmp4variant5.AudioAttributesImplBaseParcelizer.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.getEventIndex
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                AccountChangeEvent.read(this.write, z);
            }
        });
        isFmp4Variant isfmp4variant6 = this.write;
        if (isfmp4variant6 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            isfmp4variant6 = null;
        }
        isfmp4variant6.read.setOnClickListener(new View.OnClickListener() { // from class: o.getAccount
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccountChangeEvent.MediaBrowserCompatSearchResultReceiver(this.IconCompatParcelizer);
            }
        });
        isFmp4Variant isfmp4variant7 = this.write;
        if (isfmp4variant7 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            isfmp4variant2 = isfmp4variant7;
        }
        isfmp4variant2.RemoteActionCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.setAccount
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccountChangeEvent.RatingCompat(this.IconCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatItemReceiver(AccountChangeEvent accountChangeEvent) {
        isFmp4Variant isfmp4variant = accountChangeEvent.write;
        if (isfmp4variant == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            isfmp4variant = null;
        }
        isfmp4variant.MediaBrowserCompatCustomActionResultReceiver.setChecked(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesImplApi26Parcelizer(AccountChangeEvent accountChangeEvent) {
        isFmp4Variant isfmp4variant = accountChangeEvent.write;
        if (isfmp4variant == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            isfmp4variant = null;
        }
        isfmp4variant.AudioAttributesImplBaseParcelizer.setChecked(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(AccountChangeEvent accountChangeEvent, boolean z) {
        if (z) {
            isFmp4Variant isfmp4variant = accountChangeEvent.write;
            if (isfmp4variant == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                isfmp4variant = null;
            }
            isfmp4variant.AudioAttributesImplBaseParcelizer.setChecked(false);
            accountChangeEvent.write().RemoteActionCompatParcelizer(getAccountTransferClient.AudioAttributesCompatParcelizer.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(AccountChangeEvent accountChangeEvent, boolean z) {
        if (z) {
            isFmp4Variant isfmp4variant = accountChangeEvent.write;
            if (isfmp4variant == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                isfmp4variant = null;
            }
            isfmp4variant.MediaBrowserCompatCustomActionResultReceiver.setChecked(false);
            accountChangeEvent.write().RemoteActionCompatParcelizer(getAccountTransferClient.read.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatSearchResultReceiver(AccountChangeEvent accountChangeEvent) {
        accountChangeEvent.AudioAttributesCompatParcelizer().read(new AbstractC0287zzf.MediaMetadataCompat(accountChangeEvent.write().IconCompatParcelizer().IconCompatParcelizer()));
        withAlwaysAsId.read(accountChangeEvent, "requestKey", _getIndexResolver.write(setAction.write("isNext", Boolean.TRUE), setAction.write("currentFrag", 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RatingCompat(AccountChangeEvent accountChangeEvent) {
        withAlwaysAsId.read(accountChangeEvent, "requestKey", _getIndexResolver.write(setAction.write("isNext", Boolean.FALSE), setAction.write("currentFrag", 3)));
    }

    /* JADX INFO: renamed from: o.AccountChangeEvent$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/AccountChangeEvent$IconCompatParcelizer;", "", "<init>", "()V", "Landroidx/fragment/app/Fragment;", "IconCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Fragment IconCompatParcelizer() {
            return new AccountChangeEvent();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
