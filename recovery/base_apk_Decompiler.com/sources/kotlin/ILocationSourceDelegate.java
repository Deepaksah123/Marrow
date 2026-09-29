package kotlin;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.util.DeviceProperties;
import com.marrow.R;
import com.marrow2.ui.signup.college.college_confirmation.viewmodel.SignUpSelectedCollegeViewModel;
import com.marrow2.ui.signup.college.viewmodel.CollegeSelectionParentViewModel;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin.enablePanning;
import kotlin.enableStreetNames;
import kotlin.shouldEscapeCharacter;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0003R\u0016\u0010\u0012\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00158CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001c\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lo/ILocationSourceDelegate;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "AudioAttributesImplBaseParcelizer", "write", "AudioAttributesCompatParcelizer", "Lo/createPlaylistParser;", "Lo/createPlaylistParser;", "Lcom/marrow2/ui/signup/college/college_confirmation/viewmodel/SignUpSelectedCollegeViewModel;", "Lo/RenewEligible;", "read", "()Lcom/marrow2/ui/signup/college/college_confirmation/viewmodel/SignUpSelectedCollegeViewModel;", "Lcom/marrow2/ui/signup/college/viewmodel/CollegeSelectionParentViewModel;", "RemoteActionCompatParcelizer", "()Lcom/marrow2/ui/signup/college/viewmodel/CollegeSelectionParentViewModel;", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ILocationSourceDelegate extends IMapFragmentDelegate {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private createPlaylistParser AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final RenewEligible read;

    public ILocationSourceDelegate() {
        ILocationSourceDelegate iLocationSourceDelegate = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass4(new AnonymousClass1(iLocationSourceDelegate)));
        this.read = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(SignUpSelectedCollegeViewModel.class), new AnonymousClass8(renewEligibleWrite), new AnonymousClass10(renewEligibleWrite), new AnonymousClass9(iLocationSourceDelegate, renewEligibleWrite));
        this.IconCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(CollegeSelectionParentViewModel.class), new AnonymousClass3(iLocationSourceDelegate), new AnonymousClass5(iLocationSourceDelegate), new AnonymousClass2(iLocationSourceDelegate));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SignUpSelectedCollegeViewModel read() {
        return (SignUpSelectedCollegeViewModel) this.read.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CollegeSelectionParentViewModel RemoteActionCompatParcelizer() {
        return (CollegeSelectionParentViewModel) this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        createPlaylistParser createplaylistparserIconCompatParcelizer = createPlaylistParser.IconCompatParcelizer(p0, p1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(createplaylistparserIconCompatParcelizer, "");
        this.AudioAttributesCompatParcelizer = createplaylistparserIconCompatParcelizer;
        if (createplaylistparserIconCompatParcelizer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createplaylistparserIconCompatParcelizer = null;
        }
        FrameLayout frameLayoutIconCompatParcelizer = createplaylistparserIconCompatParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayoutIconCompatParcelizer, "");
        return frameLayoutIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        write();
        AudioAttributesCompatParcelizer();
        AudioAttributesImplBaseParcelizer();
        read().write(RemoteActionCompatParcelizer().read(), RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer());
    }

    private final void AudioAttributesImplBaseParcelizer() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            createPlaylistParser createplaylistparser = this.AudioAttributesCompatParcelizer;
            if (createplaylistparser == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                createplaylistparser = null;
            }
            LinearLayout linearLayout = createplaylistparser.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext, linearLayout);
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
                setUpdatedStatus<MapLifecycleDelegate> setupdatedstatusIconCompatParcelizer = ILocationSourceDelegate.this.RemoteActionCompatParcelizer().IconCompatParcelizer();
                final ILocationSourceDelegate iLocationSourceDelegate = ILocationSourceDelegate.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.ILocationSourceDelegate.AudioAttributesCompatParcelizer.2

                    /* JADX INFO: renamed from: o.ILocationSourceDelegate$AudioAttributesCompatParcelizer$2$RemoteActionCompatParcelizer */
                    public static final /* synthetic */ class RemoteActionCompatParcelizer {
                        public static final /* synthetic */ int[] IconCompatParcelizer;

                        static {
                            int[] iArr = new int[MapLifecycleDelegate.values().length];
                            try {
                                iArr[MapLifecycleDelegate.write.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[MapLifecycleDelegate.RemoteActionCompatParcelizer.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[MapLifecycleDelegate.IconCompatParcelizer.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            try {
                                iArr[MapLifecycleDelegate.read.ordinal()] = 4;
                            } catch (NoSuchFieldError unused4) {
                            }
                            IconCompatParcelizer = iArr;
                        }
                    }

                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((MapLifecycleDelegate) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(MapLifecycleDelegate mapLifecycleDelegate) {
                        int i2 = RemoteActionCompatParcelizer.IconCompatParcelizer[mapLifecycleDelegate.ordinal()];
                        createPlaylistParser createplaylistparser = null;
                        if (i2 == 1) {
                            createPlaylistParser createplaylistparser2 = iLocationSourceDelegate.AudioAttributesCompatParcelizer;
                            if (createplaylistparser2 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                createplaylistparser = createplaylistparser2;
                            }
                            createplaylistparser.AudioAttributesCompatParcelizer.setText(iLocationSourceDelegate.getString(R.string.which_pg_school_did_you_go_to));
                        } else if (i2 == 2) {
                            createPlaylistParser createplaylistparser3 = iLocationSourceDelegate.AudioAttributesCompatParcelizer;
                            if (createplaylistparser3 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                createplaylistparser = createplaylistparser3;
                            }
                            createplaylistparser.AudioAttributesCompatParcelizer.setText(iLocationSourceDelegate.getString(R.string.which_school_did_you_go_to));
                        } else if (i2 == 3) {
                            createPlaylistParser createplaylistparser4 = iLocationSourceDelegate.AudioAttributesCompatParcelizer;
                            if (createplaylistparser4 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                createplaylistparser = createplaylistparser4;
                            }
                            createplaylistparser.AudioAttributesCompatParcelizer.setText(iLocationSourceDelegate.getString(R.string.which_school_did_you_go_to));
                        } else if (i2 != 4) {
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

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return ILocationSourceDelegate.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void write() {
        ILocationSourceDelegate iLocationSourceDelegate = this;
        setBitrateKbps.RemoteActionCompatParcelizer(iLocationSourceDelegate, new AudioAttributesCompatParcelizer(null));
        setBitrateKbps.read(iLocationSourceDelegate, new write(null));
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<enablePanning> setupdatedstatusIconCompatParcelizer = ILocationSourceDelegate.this.read().IconCompatParcelizer();
                final ILocationSourceDelegate iLocationSourceDelegate = ILocationSourceDelegate.this;
                this.write = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.ILocationSourceDelegate.write.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((enablePanning) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(enablePanning enablepanning) {
                        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(enablepanning, enablePanning.IconCompatParcelizer.INSTANCE)) {
                            iLocationSourceDelegate.RemoteActionCompatParcelizer().MediaBrowserCompatMediaItem();
                            iLocationSourceDelegate.read().read(enableStreetNames.IconCompatParcelizer.INSTANCE);
                        } else if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(enablepanning, enablePanning.read.INSTANCE)) {
                            if (enablepanning instanceof enablePanning.AudioAttributesCompatParcelizer) {
                                createPlaylistParser createplaylistparser = iLocationSourceDelegate.AudioAttributesCompatParcelizer;
                                createPlaylistParser createplaylistparser2 = null;
                                if (createplaylistparser == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    createplaylistparser = null;
                                }
                                createplaylistparser.AudioAttributesImplBaseParcelizer.setText(((enablePanning.AudioAttributesCompatParcelizer) enablepanning).RemoteActionCompatParcelizer());
                                createPlaylistParser createplaylistparser3 = iLocationSourceDelegate.AudioAttributesCompatParcelizer;
                                if (createplaylistparser3 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    createplaylistparser3 = null;
                                }
                                TextView textView = createplaylistparser3.AudioAttributesImplBaseParcelizer;
                                shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
                                Context contextRequireContext = iLocationSourceDelegate.requireContext();
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                                textView.setTextColor(shouldEscapeCharacter.Companion.read(contextRequireContext, R.attr.colorOnSurfaceVariant, new TypedValue(), true));
                                createPlaylistParser createplaylistparser4 = iLocationSourceDelegate.AudioAttributesCompatParcelizer;
                                if (createplaylistparser4 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    createplaylistparser4 = null;
                                }
                                TextView textView2 = createplaylistparser4.RemoteActionCompatParcelizer;
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
                                bytesRead.AudioAttributesImplApi21Parcelizer(textView2);
                                createPlaylistParser createplaylistparser5 = iLocationSourceDelegate.AudioAttributesCompatParcelizer;
                                if (createplaylistparser5 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                } else {
                                    createplaylistparser2 = createplaylistparser5;
                                }
                                Button button = createplaylistparser2.read;
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button, "");
                                bytesRead.read(button);
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

        write(SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return ILocationSourceDelegate.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.ILocationSourceDelegate$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "IconCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$IconCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Fragment fragment) {
            super(0);
            this.$IconCompatParcelizer = fragment;
        }
    }

    private final void AudioAttributesCompatParcelizer() {
        createPlaylistParser createplaylistparser = this.AudioAttributesCompatParcelizer;
        createPlaylistParser createplaylistparser2 = null;
        if (createplaylistparser == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createplaylistparser = null;
        }
        Button button = createplaylistparser.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button, "");
        bytesRead.IconCompatParcelizer(button, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.IMapViewDelegate
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return ILocationSourceDelegate.MediaBrowserCompatItemReceiver(this.RemoteActionCompatParcelizer);
            }
        });
        createPlaylistParser createplaylistparser3 = this.AudioAttributesCompatParcelizer;
        if (createplaylistparser3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            createplaylistparser2 = createplaylistparser3;
        }
        LinearLayout linearLayout = createplaylistparser2.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        bytesRead.IconCompatParcelizer(linearLayout, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.ILocationSourceDelegatezza
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return ILocationSourceDelegate.MediaBrowserCompatCustomActionResultReceiver(this.RemoteActionCompatParcelizer);
            }
        });
    }

    /* JADX INFO: renamed from: o.ILocationSourceDelegate$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "AudioAttributesCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$AudioAttributesCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$AudioAttributesCompatParcelizer = getcreatedondatems;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatItemReceiver(ILocationSourceDelegate iLocationSourceDelegate) {
        iLocationSourceDelegate.read().read(enableStreetNames.read.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: renamed from: o.ILocationSourceDelegate$8, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "RemoteActionCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass8 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$write).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(RenewEligible renewEligible) {
            super(0);
            this.$write = renewEligible;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(ILocationSourceDelegate iLocationSourceDelegate) {
        iLocationSourceDelegate.RemoteActionCompatParcelizer().MediaBrowserCompatSearchResultReceiver();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: renamed from: o.ILocationSourceDelegate$10, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "write", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass10 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $read = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.ILocationSourceDelegate$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/ILocationSourceDelegate$read;", "", "<init>", "()V", "Lo/ILocationSourceDelegate;", "IconCompatParcelizer", "()Lo/ILocationSourceDelegate;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static ILocationSourceDelegate IconCompatParcelizer() {
            return new ILocationSourceDelegate();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: renamed from: o.ILocationSourceDelegate$9, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "write", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass9 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ RenewEligible $RemoteActionCompatParcelizer;
        private /* synthetic */ Fragment $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$RemoteActionCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$read.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$read = fragment;
            this.$RemoteActionCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.ILocationSourceDelegate$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "write", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ Fragment $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return this.$IconCompatParcelizer.requireActivity().getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment) {
            super(0);
            this.$IconCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.ILocationSourceDelegate$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "IconCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ Fragment $RemoteActionCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $write = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            return this.$RemoteActionCompatParcelizer.requireActivity().getDefaultViewModelCreationExtras();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Fragment fragment) {
            super(0);
            this.$RemoteActionCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.ILocationSourceDelegate$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "IconCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            return this.$AudioAttributesCompatParcelizer.requireActivity().getDefaultViewModelProviderFactory();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
        }
    }
}
