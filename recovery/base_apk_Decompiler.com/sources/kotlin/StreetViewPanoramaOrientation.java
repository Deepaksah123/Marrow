package kotlin;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.util.DeviceProperties;
import com.marrow2.ui.signup.pass.viewmodel.SignUpPasswordViewModel;
import kotlin.InterfaceC0211tileProvider;
import kotlin.Metadata;
import kotlin.TileOverlay;
import kotlin.VisibilityChecker;
import kotlin.color;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0003R\u0016\u0010\u0014\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u001b\u0010\u0019\u001a\u00020\u00178CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lo/StreetViewPanoramaOrientation;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "AudioAttributesImplBaseParcelizer", "write", "RemoteActionCompatParcelizer", "onStop", "AudioAttributesCompatParcelizer", "Lo/DefaultHlsPlaylistParserFactory;", "Lo/DefaultHlsPlaylistParserFactory;", "Lcom/marrow2/ui/signup/pass/viewmodel/SignUpPasswordViewModel;", "Lo/RenewEligible;", "read", "()Lcom/marrow2/ui/signup/pass/viewmodel/SignUpPasswordViewModel;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StreetViewPanoramaOrientation extends StreetViewPanoramaLocation {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private DefaultHlsPlaylistParserFactory AudioAttributesCompatParcelizer;

    public StreetViewPanoramaOrientation() {
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass2(new AnonymousClass5(streetViewPanoramaOrientation)));
        this.read = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(SignUpPasswordViewModel.class), new AnonymousClass4(renewEligibleWrite), new AnonymousClass1(renewEligibleWrite), new AnonymousClass3(streetViewPanoramaOrientation, renewEligibleWrite));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SignUpPasswordViewModel read() {
        return (SignUpPasswordViewModel) this.read.RemoteActionCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        DefaultHlsPlaylistParserFactory defaultHlsPlaylistParserFactoryRemoteActionCompatParcelizer = DefaultHlsPlaylistParserFactory.RemoteActionCompatParcelizer(p0, p1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(defaultHlsPlaylistParserFactoryRemoteActionCompatParcelizer, "");
        this.AudioAttributesCompatParcelizer = defaultHlsPlaylistParserFactoryRemoteActionCompatParcelizer;
        if (defaultHlsPlaylistParserFactoryRemoteActionCompatParcelizer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsPlaylistParserFactoryRemoteActionCompatParcelizer = null;
        }
        ConstraintLayout constraintLayoutIconCompatParcelizer = defaultHlsPlaylistParserFactoryRemoteActionCompatParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer, "");
        return constraintLayoutIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        write();
        AudioAttributesCompatParcelizer();
        RemoteActionCompatParcelizer();
        AudioAttributesImplBaseParcelizer();
    }

    private final void AudioAttributesImplBaseParcelizer() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            DefaultHlsPlaylistParserFactory defaultHlsPlaylistParserFactory = this.AudioAttributesCompatParcelizer;
            if (defaultHlsPlaylistParserFactory == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                defaultHlsPlaylistParserFactory = null;
            }
            LinearLayout linearLayout = defaultHlsPlaylistParserFactory.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext, linearLayout);
        }
    }

    private final void write() {
        DefaultHlsPlaylistParserFactory defaultHlsPlaylistParserFactory = this.AudioAttributesCompatParcelizer;
        DefaultHlsPlaylistParserFactory defaultHlsPlaylistParserFactory2 = null;
        if (defaultHlsPlaylistParserFactory == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsPlaylistParserFactory = null;
        }
        Toolbar toolbar = defaultHlsPlaylistParserFactory.AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(toolbar, "");
        getHttpMethodString.read((View) toolbar, true, false, true, true, 0, 50);
        DefaultHlsPlaylistParserFactory defaultHlsPlaylistParserFactory3 = this.AudioAttributesCompatParcelizer;
        if (defaultHlsPlaylistParserFactory3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            defaultHlsPlaylistParserFactory2 = defaultHlsPlaylistParserFactory3;
        }
        ScrollView scrollView = defaultHlsPlaylistParserFactory2.MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollView, "");
        getHttpMethodString.read((View) scrollView, false, true, true, true, 0, 49);
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
            StreetViewPanoramaOrientation.this.read().AudioAttributesCompatParcelizer(new TileOverlay.IconCompatParcelizer(String.valueOf(editable)));
        }
    }

    private final void RemoteActionCompatParcelizer() {
        DefaultHlsPlaylistParserFactory defaultHlsPlaylistParserFactory = this.AudioAttributesCompatParcelizer;
        DefaultHlsPlaylistParserFactory defaultHlsPlaylistParserFactory2 = null;
        if (defaultHlsPlaylistParserFactory == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsPlaylistParserFactory = null;
        }
        defaultHlsPlaylistParserFactory.AudioAttributesImplApi21Parcelizer.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.StreetViewPanoramaOrientationBuilder
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StreetViewPanoramaOrientation.RemoteActionCompatParcelizer(this.read);
            }
        });
        DefaultHlsPlaylistParserFactory defaultHlsPlaylistParserFactory3 = this.AudioAttributesCompatParcelizer;
        if (defaultHlsPlaylistParserFactory3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsPlaylistParserFactory3 = null;
        }
        defaultHlsPlaylistParserFactory3.RemoteActionCompatParcelizer.requestFocus();
        DefaultHlsPlaylistParserFactory defaultHlsPlaylistParserFactory4 = this.AudioAttributesCompatParcelizer;
        if (defaultHlsPlaylistParserFactory4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsPlaylistParserFactory4 = null;
        }
        EditText editText = defaultHlsPlaylistParserFactory4.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(editText, "");
        editText.addTextChangedListener(new write());
        DefaultHlsPlaylistParserFactory defaultHlsPlaylistParserFactory5 = this.AudioAttributesCompatParcelizer;
        if (defaultHlsPlaylistParserFactory5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            defaultHlsPlaylistParserFactory2 = defaultHlsPlaylistParserFactory5;
        }
        Button button = defaultHlsPlaylistParserFactory2.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button, "");
        bytesRead.IconCompatParcelizer(button, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.getTileProvider
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return StreetViewPanoramaOrientation.MediaBrowserCompatCustomActionResultReceiver(this.IconCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        maybeGetTypeVariable activity = streetViewPanoramaOrientation.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        streetViewPanoramaOrientation.read().AudioAttributesCompatParcelizer(TileOverlay.AudioAttributesCompatParcelizer.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        DefaultHlsPlaylistParserFactory defaultHlsPlaylistParserFactory = this.AudioAttributesCompatParcelizer;
        if (defaultHlsPlaylistParserFactory == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsPlaylistParserFactory = null;
        }
        defaultHlsPlaylistParserFactory.RemoteActionCompatParcelizer.clearFocus();
        super.onStop();
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<fadeIn> setupdatedstatus = StreetViewPanoramaOrientation.this.read().read();
                final StreetViewPanoramaOrientation streetViewPanoramaOrientation = StreetViewPanoramaOrientation.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.StreetViewPanoramaOrientation.IconCompatParcelizer.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((fadeIn) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(fadeIn fadein) {
                        DefaultHlsPlaylistParserFactory defaultHlsPlaylistParserFactory = streetViewPanoramaOrientation.AudioAttributesCompatParcelizer;
                        if (defaultHlsPlaylistParserFactory == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            defaultHlsPlaylistParserFactory = null;
                        }
                        Button button = defaultHlsPlaylistParserFactory.read;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button, "");
                        bytesRead.IconCompatParcelizer(button, fadein.getRead());
                        ImageView imageView = defaultHlsPlaylistParserFactory.write;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
                        bytesRead.write(imageView, fadein.getAudioAttributesCompatParcelizer());
                        ImageView imageView2 = defaultHlsPlaylistParserFactory.IconCompatParcelizer;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView2, "");
                        bytesRead.write(imageView2, fadein.getWrite());
                        ImageView imageView3 = defaultHlsPlaylistParserFactory.MediaBrowserCompatItemReceiver;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView3, "");
                        bytesRead.write(imageView3, fadein.getIconCompatParcelizer());
                        ImageView imageView4 = defaultHlsPlaylistParserFactory.AudioAttributesImplBaseParcelizer;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView4, "");
                        bytesRead.write(imageView4, fadein.getAudioAttributesImplApi26Parcelizer());
                        ImageView imageView5 = defaultHlsPlaylistParserFactory.AudioAttributesImplApi26Parcelizer;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView5, "");
                        bytesRead.write(imageView5, fadein.getMediaBrowserCompatCustomActionResultReceiver());
                        if (fadein.getRemoteActionCompatParcelizer().length() > 0) {
                            Editable text = defaultHlsPlaylistParserFactory.RemoteActionCompatParcelizer.getText();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(text, "");
                            if (text.length() == 0) {
                                defaultHlsPlaylistParserFactory.RemoteActionCompatParcelizer.setText(fadein.getRemoteActionCompatParcelizer());
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

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return StreetViewPanoramaOrientation.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesCompatParcelizer() {
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = this;
        setBitrateKbps.RemoteActionCompatParcelizer(streetViewPanoramaOrientation, new IconCompatParcelizer(null));
        setBitrateKbps.RemoteActionCompatParcelizer(streetViewPanoramaOrientation, new RemoteActionCompatParcelizer(null));
    }

    /* JADX INFO: renamed from: o.StreetViewPanoramaOrientation$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "IconCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$AudioAttributesCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Fragment fragment) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.StreetViewPanoramaOrientation$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "write", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$read.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$read = getcreatedondatems;
        }
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<InterfaceC0211tileProvider> setupdatedstatusAudioAttributesCompatParcelizer = StreetViewPanoramaOrientation.this.read().AudioAttributesCompatParcelizer();
                final StreetViewPanoramaOrientation streetViewPanoramaOrientation = StreetViewPanoramaOrientation.this;
                this.write = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.StreetViewPanoramaOrientation.RemoteActionCompatParcelizer.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((InterfaceC0211tileProvider) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(InterfaceC0211tileProvider interfaceC0211tileProvider) {
                        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(interfaceC0211tileProvider, InterfaceC0211tileProvider.IconCompatParcelizer.INSTANCE)) {
                            if (!(interfaceC0211tileProvider instanceof InterfaceC0211tileProvider.RemoteActionCompatParcelizer)) {
                                throw new RenewEligibleCreator();
                            }
                            StreetViewPanoramaOrientation streetViewPanoramaOrientation2 = streetViewPanoramaOrientation;
                            color.Companion companion = color.INSTANCE;
                            Context contextRequireContext = streetViewPanoramaOrientation.requireContext();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                            InterfaceC0211tileProvider.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (InterfaceC0211tileProvider.RemoteActionCompatParcelizer) interfaceC0211tileProvider;
                            streetViewPanoramaOrientation2.startActivity(color.Companion.AudioAttributesCompatParcelizer(contextRequireContext, remoteActionCompatParcelizer.write(), remoteActionCompatParcelizer.IconCompatParcelizer()));
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

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return StreetViewPanoramaOrientation.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.StreetViewPanoramaOrientation$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "write", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$IconCompatParcelizer).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(RenewEligible renewEligible) {
            super(0);
            this.$IconCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.StreetViewPanoramaOrientation$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "write", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer = null;
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

    /* JADX INFO: renamed from: o.StreetViewPanoramaOrientation$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "write", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$write.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$write = fragment;
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.StreetViewPanoramaOrientation$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/StreetViewPanoramaOrientation$read;", "", "<init>", "()V", "", "p0", "Lo/StreetViewPanoramaOrientation;", "write", "(Ljava/lang/String;)Lo/StreetViewPanoramaOrientation;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static StreetViewPanoramaOrientation write(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            StreetViewPanoramaOrientation streetViewPanoramaOrientation = new StreetViewPanoramaOrientation();
            Bundle bundle = new Bundle();
            bundle.putString("email", p0);
            streetViewPanoramaOrientation.setArguments(bundle);
            return streetViewPanoramaOrientation;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
