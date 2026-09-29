package kotlin;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow2.ui.signup.college.viewmodel.CollegeSelectionParentViewModel;
import com.marrow2.ui.signup.college.year.viewmodel.SignUpYearViewModel;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import kotlin.Dash;
import kotlin.Dot;
import kotlin.LatLngBounds;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin.radius;
import kotlin.withFieldVisibility;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0003R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u001aR\u0014\u0010\u0012\u001a\u00020\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001b\u0010\u001d\u001a\u00020\u001f8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010 R\u0016\u0010\u0011\u001a\u00020!8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0011\u0010\""}, d2 = {"Lo/radius;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "AudioAttributesImplApi21Parcelizer", "RemoteActionCompatParcelizer", "write", "AudioAttributesImplApi26Parcelizer", "Lo/getLatestPlaylistSnapshot;", "Lo/getLatestPlaylistSnapshot;", "read", "Lcom/marrow2/ui/signup/college/year/viewmodel/SignUpYearViewModel;", "AudioAttributesImplBaseParcelizer", "Lo/RenewEligible;", "()Lcom/marrow2/ui/signup/college/year/viewmodel/SignUpYearViewModel;", "AudioAttributesCompatParcelizer", "Lo/fillColor;", "IconCompatParcelizer", "Lo/fillColor;", "Lcom/marrow2/ui/signup/college/viewmodel/CollegeSelectionParentViewModel;", "()Lcom/marrow2/ui/signup/college/viewmodel/CollegeSelectionParentViewModel;", "Lo/target;", "Lo/target;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class radius extends clickable {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final RenewEligible AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final fillColor write;
    private target RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private getLatestPlaylistSnapshot read;

    public radius() {
        radius radiusVar = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass5(new AnonymousClass3(radiusVar)));
        this.AudioAttributesCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(SignUpYearViewModel.class), new AnonymousClass7(renewEligibleWrite), new AnonymousClass9(renewEligibleWrite), new AnonymousClass10(radiusVar, renewEligibleWrite));
        this.write = new fillColor();
        this.IconCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(CollegeSelectionParentViewModel.class), new AnonymousClass1(radiusVar), new AnonymousClass4(radiusVar), new AnonymousClass2(radiusVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SignUpYearViewModel read() {
        return (SignUpYearViewModel) this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CollegeSelectionParentViewModel AudioAttributesCompatParcelizer() {
        return (CollegeSelectionParentViewModel) this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        getLatestPlaylistSnapshot getlatestplaylistsnapshot = getLatestPlaylistSnapshot.read(p0, p1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlatestplaylistsnapshot, "");
        this.read = getlatestplaylistsnapshot;
        if (getlatestplaylistsnapshot == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getlatestplaylistsnapshot = null;
        }
        ConstraintLayout constraintLayoutIconCompatParcelizer = getlatestplaylistsnapshot.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer, "");
        return constraintLayoutIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        AudioAttributesImplApi26Parcelizer();
        write();
        RemoteActionCompatParcelizer();
        AudioAttributesImplApi21Parcelizer();
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            getLatestPlaylistSnapshot getlatestplaylistsnapshot = this.read;
            if (getlatestplaylistsnapshot == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                getlatestplaylistsnapshot = null;
            }
            LinearLayout linearLayout = getlatestplaylistsnapshot.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext, linearLayout);
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
                setUpdatedStatus<MapLifecycleDelegate> setupdatedstatusIconCompatParcelizer = radius.this.AudioAttributesCompatParcelizer().IconCompatParcelizer();
                final radius radiusVar = radius.this;
                this.write = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.radius.RemoteActionCompatParcelizer.2

                    /* JADX INFO: renamed from: o.radius$RemoteActionCompatParcelizer$2$AudioAttributesCompatParcelizer */
                    public static final /* synthetic */ class AudioAttributesCompatParcelizer {
                        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

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
                            RemoteActionCompatParcelizer = iArr;
                        }
                    }

                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((MapLifecycleDelegate) obj2);
                    }

                    private Object read(MapLifecycleDelegate mapLifecycleDelegate) {
                        int i2 = AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer[mapLifecycleDelegate.ordinal()];
                        getLatestPlaylistSnapshot getlatestplaylistsnapshot = null;
                        if (i2 == 1) {
                            getLatestPlaylistSnapshot getlatestplaylistsnapshot2 = radiusVar.read;
                            if (getlatestplaylistsnapshot2 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                getlatestplaylistsnapshot = getlatestplaylistsnapshot2;
                            }
                            getlatestplaylistsnapshot.write.setText(radiusVar.getString(R.string.confirm_year_admission_pg));
                        } else if (i2 == 2) {
                            getLatestPlaylistSnapshot getlatestplaylistsnapshot3 = radiusVar.read;
                            if (getlatestplaylistsnapshot3 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                getlatestplaylistsnapshot = getlatestplaylistsnapshot3;
                            }
                            getlatestplaylistsnapshot.write.setText(radiusVar.getString(R.string.confirm_year_admission));
                        } else if (i2 == 3) {
                            getLatestPlaylistSnapshot getlatestplaylistsnapshot4 = radiusVar.read;
                            if (getlatestplaylistsnapshot4 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                getlatestplaylistsnapshot = getlatestplaylistsnapshot4;
                            }
                            getlatestplaylistsnapshot.write.setText(radiusVar.getString(R.string.confirm_year_admission));
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

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return radius.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void RemoteActionCompatParcelizer() {
        radius radiusVar = this;
        setBitrateKbps.RemoteActionCompatParcelizer(radiusVar, new RemoteActionCompatParcelizer(null));
        setBitrateKbps.read(radiusVar, new write(null));
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: o.radius$write$3, reason: invalid class name */
        static final class AnonymousClass3<T> implements getValidationToken {
            private /* synthetic */ radius write;

            @Override // kotlin.getValidationToken
            public final /* synthetic */ Object IconCompatParcelizer(Object obj, SampleVideos sampleVideos) {
                return read((Dash) obj);
            }

            private Object read(Dash dash) {
                if (dash instanceof Dash.RemoteActionCompatParcelizer) {
                    CollegeSelectionParentViewModel collegeSelectionParentViewModelAudioAttributesCompatParcelizer = this.write.AudioAttributesCompatParcelizer();
                    String strAudioAttributesCompatParcelizer = ((Dash.RemoteActionCompatParcelizer) dash).AudioAttributesCompatParcelizer();
                    final radius radiusVar = this.write;
                    collegeSelectionParentViewModelAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(strAudioAttributesCompatParcelizer, new getAnswerMap() { // from class: o.CustomCap
                        @Override // kotlin.getAnswerMap
                        public final Object invoke(Object obj) {
                            return radius.write.AnonymousClass3.read(radiusVar, (LatLngBounds) obj);
                        }
                    });
                    this.write.read().AudioAttributesCompatParcelizer(Dot.read.INSTANCE);
                } else if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(dash, Dash.AudioAttributesCompatParcelizer.INSTANCE)) {
                    target targetVar = null;
                    getLatestPlaylistSnapshot getlatestplaylistsnapshot = null;
                    if (dash instanceof Dash.read) {
                        getLatestPlaylistSnapshot getlatestplaylistsnapshot2 = this.write.read;
                        if (getlatestplaylistsnapshot2 == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            getlatestplaylistsnapshot2 = null;
                        }
                        TextView textView = getlatestplaylistsnapshot2.IconCompatParcelizer;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
                        Dash.read readVar = (Dash.read) dash;
                        textView.setVisibility(readVar.getRead() ? 0 : 8);
                        getLatestPlaylistSnapshot getlatestplaylistsnapshot3 = this.write.read;
                        if (getlatestplaylistsnapshot3 == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                        } else {
                            getlatestplaylistsnapshot = getlatestplaylistsnapshot3;
                        }
                        Button button = getlatestplaylistsnapshot.RemoteActionCompatParcelizer;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button, "");
                        bytesRead.IconCompatParcelizer(button, readVar.getRead());
                        this.write.read().AudioAttributesCompatParcelizer(Dot.read.INSTANCE);
                    } else if (dash instanceof Dash.IconCompatParcelizer) {
                        target targetVar2 = this.write.RemoteActionCompatParcelizer;
                        if (targetVar2 == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                        } else {
                            targetVar = targetVar2;
                        }
                        Dash.IconCompatParcelizer iconCompatParcelizer = (Dash.IconCompatParcelizer) dash;
                        targetVar.read(iconCompatParcelizer.write());
                        fillColor fillcolor = this.write.write;
                        Context contextRequireContext = this.write.requireContext();
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                        fillcolor.write(contextRequireContext, iconCompatParcelizer.write());
                    } else {
                        throw new RenewEligibleCreator();
                    }
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final getShowPopup read(radius radiusVar, LatLngBounds latLngBounds) {
                toMagicModuleMetaRepoModel.write(latLngBounds, "");
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(latLngBounds, LatLngBounds.RemoteActionCompatParcelizer.INSTANCE)) {
                    radius radiusVar2 = radiusVar;
                    String string = radiusVar.getString(R.string.app_error_no_internet);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                    CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(radiusVar2, string, 0);
                } else if (latLngBounds instanceof LatLngBounds.write) {
                    CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(radiusVar, ((LatLngBounds.write) latLngBounds).RemoteActionCompatParcelizer(), 0);
                }
                return getShowPopup.INSTANCE;
            }

            AnonymousClass3(radius radiusVar) {
                this.write = radiusVar;
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (radius.this.read().read().write(new AnonymousClass3(radius.this), this) == objIconCompatParcelizer) {
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
            return radius.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.radius$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "write", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$write;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment) {
            super(0);
            this.$write = fragment;
        }
    }

    /* JADX INFO: renamed from: o.radius$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "AudioAttributesCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$AudioAttributesCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$AudioAttributesCompatParcelizer = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.radius$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "write", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass7 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$write).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(RenewEligible renewEligible) {
            super(0);
            this.$write = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.radius$9, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "write", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass9 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ RenewEligible $IconCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $read = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$IconCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(RenewEligible renewEligible) {
            super(0);
            this.$IconCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.radius$10, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "read", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass10 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;
        private /* synthetic */ RenewEligible $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$read);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$AudioAttributesCompatParcelizer.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
            this.$read = renewEligible;
        }
    }

    private final void write() {
        getLatestPlaylistSnapshot getlatestplaylistsnapshot = this.read;
        getLatestPlaylistSnapshot getlatestplaylistsnapshot2 = null;
        if (getlatestplaylistsnapshot == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getlatestplaylistsnapshot = null;
        }
        getlatestplaylistsnapshot.MediaBrowserCompatCustomActionResultReceiver.setOnClickListener(new View.OnClickListener() { // from class: o.center
            private static char[] AudioAttributesImplApi21Parcelizer;
            private static int AudioAttributesImplApi26Parcelizer;
            private static int AudioAttributesImplBaseParcelizer;
            private static char IconCompatParcelizer;
            private static final byte[] MediaBrowserCompatCustomActionResultReceiver;
            private static long MediaBrowserCompatItemReceiver;
            private static final int MediaBrowserCompatMediaItem;
            private static char RemoteActionCompatParcelizer;
            private static char read;
            private static char write;
            private static final byte[] $$c = {98, -46, 102, 39};
            private static final int $$d = 245;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {18, -127, -77, -105, 13, 4, -3, 5, 9, -11, 15, -19, -8, -2, -5, 15, 36, -34, -17, 11, -6, 1, 43, -44, 2, -3, 15, -19, 36, -17, -17, 15, -2, -7, 3, -17, 21, -13};
            private static final int $$b = 218;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.lang.String $$e(byte r6, short r7, short r8) {
                /*
                    int r7 = r7 * 2
                    int r7 = 3 - r7
                    int r8 = r8 * 3
                    int r0 = 1 - r8
                    int r6 = r6 * 21
                    int r6 = r6 + 101
                    byte[] r1 = kotlin.center.$$c
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    int r8 = 0 - r8
                    if (r1 != 0) goto L18
                    r3 = r7
                    r4 = r2
                    goto L2e
                L18:
                    r3 = r2
                L19:
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    int r7 = r7 + 1
                    if (r3 != r8) goto L26
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    return r6
                L26:
                    int r3 = r3 + 1
                    r4 = r1[r7]
                    r5 = r3
                    r3 = r7
                    r7 = r4
                    r4 = r5
                L2e:
                    int r7 = -r7
                    int r6 = r6 + r7
                    r7 = r3
                    r3 = r4
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.center.$$e(byte, short, short):java.lang.String");
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void c(byte r5, short r6, byte r7, java.lang.Object[] r8) {
                /*
                    int r6 = r6 + 82
                    int r0 = r5 + 4
                    int r7 = r7 + 4
                    byte[] r1 = kotlin.center.$$a
                    byte[] r0 = new byte[r0]
                    int r5 = r5 + 3
                    r2 = 0
                    if (r1 != 0) goto L12
                    r4 = r5
                    r3 = r2
                    goto L24
                L12:
                    r3 = r2
                L13:
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    if (r3 != r5) goto L20
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r0, r2)
                    r8[r2] = r5
                    return
                L20:
                    r4 = r1[r7]
                    int r3 = r3 + 1
                L24:
                    int r4 = -r4
                    int r6 = r6 + r4
                    int r7 = r7 + 1
                    goto L13
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.center.c(byte, short, byte, java.lang.Object[]):void");
            }

            private static void b(int i, int i2, char c, Object[] objArr) throws Throwable {
                DownloadService downloadService = new DownloadService();
                long[] jArr = new long[i2];
                downloadService.write = 0;
                while (downloadService.write < i2) {
                    int i3 = downloadService.write;
                    try {
                        Object[] objArr2 = {Integer.valueOf(AudioAttributesImplApi21Parcelizer[i + i3])};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                        if (objRemoteActionCompatParcelizer == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 36620), 2339 - TextUtils.indexOf((CharSequence) "", '0', 0), 29 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 480654850, false, $$e(b, b2, b2), new Class[]{Integer.TYPE});
                        }
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i3), Long.valueOf(MediaBrowserCompatItemReceiver), Integer.valueOf(c)};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 9701 - TextUtils.getOffsetAfter("", 0), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 25, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i3] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                        Object[] objArr4 = {downloadService, downloadService};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (Process.myPid() >> 22) + 23784, 33 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr = new char[i2];
                downloadService.write = 0;
                while (downloadService.write < i2) {
                    cArr[downloadService.write] = (char) jArr[downloadService.write];
                    Object[] objArr5 = {downloadService, downloadService};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) TextUtils.indexOf("", ""), 23784 - View.getDefaultSize(0, 0), Drawable.resolveOpacity(0, 0) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr);
            }

            private static void d(int i, char[] cArr, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                isStopped isstopped = new isStopped();
                char[] cArr2 = new char[cArr.length];
                isstopped.read = 0;
                char[] cArr3 = new char[2];
                int i3 = $10 + 29;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                while (isstopped.read < cArr.length) {
                    cArr3[0] = cArr[isstopped.read];
                    cArr3[1] = cArr[isstopped.read + 1];
                    int i5 = 58224;
                    for (int i6 = 0; i6 < 16; i6++) {
                        int i7 = $11 + 89;
                        $10 = i7 % 128;
                        int i8 = i7 % 2;
                        char c = cArr3[1];
                        char c2 = cArr3[0];
                        try {
                            Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i5) ^ ((c2 << 4) + ((char) (((long) write) ^ 1193402106669854891L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(read)};
                            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(815477582);
                            if (objRemoteActionCompatParcelizer == null) {
                                char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                                int iResolveSizeAndState = 1504 - View.resolveSizeAndState(0, 0, 0);
                                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 21;
                                byte b = (byte) ($$d & 3);
                                byte b2 = (byte) (b - 1);
                                objRemoteActionCompatParcelizer = startForeground.read(cAxisFromString, iResolveSizeAndState, edgeSlop, 1322448859, false, $$e(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                            cArr3[1] = cCharValue;
                            Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) IconCompatParcelizer) ^ 1193402106669854891L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(RemoteActionCompatParcelizer)};
                            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(815477582);
                            if (objRemoteActionCompatParcelizer2 == null) {
                                char c3 = (char) (1 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                                int windowTouchSlop = 1504 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                int i9 = (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 21;
                                byte b3 = (byte) ($$d & 3);
                                byte b4 = (byte) (b3 - 1);
                                objRemoteActionCompatParcelizer2 = startForeground.read(c3, windowTouchSlop, i9, 1322448859, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            cArr3[0] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                            i5 -= 40503;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2[isstopped.read] = cArr3[0];
                    cArr2[isstopped.read + 1] = cArr3[1];
                    Object[] objArr4 = {isstopped, isstopped};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-167774474);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), ((Process.getThreadPriority(0) + 20) >> 6) + 9016, 58 - (Process.myTid() >> 22), -1950993821, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr2, 0, i);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = 2 % 2;
                int i2 = AudioAttributesImplApi26Parcelizer + 57;
                AudioAttributesImplBaseParcelizer = i2 % 128;
                int i3 = i2 % 2;
                radius.MediaBrowserCompatItemReceiver(this.AudioAttributesCompatParcelizer);
                int i4 = AudioAttributesImplBaseParcelizer + 17;
                AudioAttributesImplApi26Parcelizer = i4 % 128;
                int i5 = i4 % 2;
            }

            /* JADX WARN: Removed duplicated region for block: B:316:0x0f14 A[Catch: all -> 0x0f67, TryCatch #32 {all -> 0x0f67, blocks: (B:303:0x0ef9, B:304:0x0efd, B:314:0x0f0d, B:316:0x0f14, B:317:0x0f15, B:322:0x0f2f, B:329:0x0f57), top: B:505:0x0ef9 }] */
            /* JADX WARN: Removed duplicated region for block: B:317:0x0f15 A[Catch: all -> 0x0f67, TRY_LEAVE, TryCatch #32 {all -> 0x0f67, blocks: (B:303:0x0ef9, B:304:0x0efd, B:314:0x0f0d, B:316:0x0f14, B:317:0x0f15, B:322:0x0f2f, B:329:0x0f57), top: B:505:0x0ef9 }] */
            /* JADX WARN: Removed duplicated region for block: B:366:0x1021 A[PHI: r7 r13 r14 r24 r25
              0x1021: PHI (r7v149 short) = (r7v146 short), (r7v150 short) binds: [B:370:0x1066, B:364:0x101b] A[DONT_GENERATE, DONT_INLINE]
              0x1021: PHI (r13v120 short) = (r13v117 short), (r13v121 short) binds: [B:370:0x1066, B:364:0x101b] A[DONT_GENERATE, DONT_INLINE]
              0x1021: PHI (r14v87 short) = (r14v84 short), (r14v88 short) binds: [B:370:0x1066, B:364:0x101b] A[DONT_GENERATE, DONT_INLINE]
              0x1021: PHI (r24v81 int[]) = (r24v78 int[]), (r24v82 int[]) binds: [B:370:0x1066, B:364:0x101b] A[DONT_GENERATE, DONT_INLINE]
              0x1021: PHI (r25v58 int) = (r25v57 int), (r25v59 int) binds: [B:370:0x1066, B:364:0x101b] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:389:0x10ec  */
            /* JADX WARN: Removed duplicated region for block: B:392:0x10f1  */
            /* JADX WARN: Removed duplicated region for block: B:434:0x113d  */
            /* JADX WARN: Removed duplicated region for block: B:597:0x1151 A[SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static void read(android.content.Context r33, long r34, long r36) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 4686
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.center.read(android.content.Context, long, long):void");
            }

            static {
                byte[] bArr = new byte[636];
                System.arraycopy("{¥Ô\u0016\u0012û\u0013\u0002ÿ\u0000Ï>\u0010ô\u0014ý\u0006ÿ\u0015À\u001a1\u0002\b\b\u000f\u000eõ\u0012û\u0013\u0002ÿ\u0000ÏKö\u0018\u0001¿+\u0016\u0018\u0001æ$ú\b\f\u0003\u0014à\u001c\u0005\u0012÷\u0014Ó(\u0006\u000e\bøü\u001aðÒCú\u0012þÌ\u001a*þ\u0016æ\u0017\u0011\tõ\u000eú\u0007\u0010\týþ\u0012û\u0013\u0002ÿ\u0000ÏMø\u0001\u0017¼-\u0018\u0001\u0017Ñ1\u0004ý\b\u0003\u0013\u0002ô\u0018ú\u000b\u0004\u0003\u0014å \u000bó\nð\u001e\b\u0006\u0012û\u0013\u0002ÿ\u0000ÏMø\u0001\u0017¼-\u0018\u0001\u0017².\u001d\u0001\u0017\u0007\u0002øó\"ú\u0003ù\u000fÿí\u001d\u0001\u0017\u0007\u0002øó\"ú\u0003ü\u001aðÒCú\u0012þÌ*&\u0003ü\nþ\u0002\u0001\u0002\u0010ü\u001aðÒCú\u0012þÌ *\u000bö\u0007\u0003\u0012ð\u0010\u000eõï\u001c\n\u000bç\u0010\u0010\u000eõü\u001aðÒCú\u0012þÌ+\u0019\u000f\u0002\rï\u0006\u000fþ\u0003\u0014Ô#\u0019\u0003÷ü\u001aðÒCú\u0012þÌIø\u0006\u000bþ\u0003\u0016¿\u0018'\u0005\u0007\u0013\u0005ûþ\u000fþï\u0018\r\u0000\u0003\u0016÷\u0014Ò'\u0005\u0007\u0013\u0005ûþ\u000fþü\u001aðÒCú\u0012þÌIø\u0006\u000bþ\u0003\u0016¿$\u001d\u0014ù\fú\n\rþ\u0001ÿü\u001aðÒCú\u0012þÌ&\u0018\r\u0000\u0003\u0016ö#ü\u001aðÒCú\u0012þÌ&\u0018\r\u0000\u0003\u0016Ì\u0012û\u0013\u0002ÿ\u0000ÏF\tÀ\u00198þû\rþü\u001aðÒCú\u0012þÌIø\u0006\u000bþ\u0003\u0016¿\u001a1\u0004\n\u0006\u0003\bó\u0016\u0000\bü\u0017×*\n\u0006ò\u0012ú\u0007\u0003\u0014Þ\u0019\u001cö\t\rýÜ3ô\u001b÷\nþá#\u0007\n\u0002ó\u001b\u0016ð\nüú\u0012û\u0013\u0002ÿ\u0000ÏKö\u0018\u0001¿\u00182û\u0013\u0002ÿ\u0000ä*þ\u0016ô\u0007\u0016ö\u0012\u0003\u0014Þ!\u000e\u0005\u0002\bü\u001aðÒCú\u0012þÌ#(\u0004þ\nû\u0006\u0018Ü\u001c\u0012û\u0013\u0002ÿ\u0000ÏF\tÀ*+ÿ\u0006ö\rÛ.\bù\r\u0000\tú\týí!\b\u0005\u0002\u000f\u0003\u0014Ø*\bø\u0004\u0010Ú'\u0016ú\u000b\u0004â\u001f\u0019à\u001a\tý\u000f\u000b\u0004\u0012û\u0013\u0002ÿ\u0000ÏF\tÀ#(\u0005\u0006ú\u0012\u0003\u0014Ö$\b\u0003ó\u001e\b\u0006\u0012û\u0013\u0002ÿ\u0000ÏF\tÀ\u001f\u001e\u0012û\rþ\u0012\u0012û\u0013\u0002ÿ\u0000ÏMø\u0001\u0017¼-\u0018\u0001\u0017ø\u0013\u0001\u0002\u000fôó\u001b\u0016ðá2ûô&ò\u0018öü\u001aðÒCú\u0012þÌ)(þ\u0005ø\u0006\u000fþ".getBytes(CharsetNames.ISO_8859_1), 0, bArr, 0, 636);
                MediaBrowserCompatCustomActionResultReceiver = bArr;
                MediaBrowserCompatMediaItem = 114;
                AudioAttributesCompatParcelizer();
                AudioAttributesImplBaseParcelizer = 0;
                AudioAttributesImplApi26Parcelizer = 1;
                IconCompatParcelizer = (char) 46401;
                RemoteActionCompatParcelizer = (char) 59312;
                write = (char) 6136;
                read = (char) 17294;
            }

            static void AudioAttributesCompatParcelizer() {
                char[] cArr = new char[AnalyticsListener.EVENT_VIDEO_INPUT_FORMAT_CHANGED];
                ByteBuffer.wrap("Ü!Î3ø<ê\u0017\u0094\u0018\u0086x°t¢]LP~_h²\u001aº\u0004\u00936\u0096 åÒíüÀîÕ\u0098Ü\u008b+µ §\u0006Q\u0015C{mp\u001f\u007f\tV;Z%µ×ªÁ\u0084ó\u0093\u009dû\u008fî¹á«×UØ@'r/\u001c\u0002\u000e\u00118\n*lÔ{Æ]ðVâ¹\u008c¬¾\u0080¨\u008fZ\u0081Dövø`Û\u0012Ë=\"/1Ù#Ë\u0011õ\u001açu\u0091o\u0083D\u00adS_½I°{¼e\u008b\u0017\u0085\u0001ù3ôÝßÏÊùÞä-\u0096'\u0080\u0010²\u0016\\eNoxYjN\u0014A\u0006¾0¸\"\u0087Ì\u0089þøèð\u009aã\u0084Ò¶Ú¡)S+}\u001fo\u0012\u0019{\u000bn5a'_ÑXÃ§í©\u009f\u009f\u0089\u0090»\u0083¥òWúAÉsË\u001e0\b2:\u001e$\u0012Ö\u001cÀkòe\u009cS\u008eT¸¼ª\u00adT¾F\u0092p\u0084bè\f÷>Ú(ÎÛ Å/÷\"á\u0017\u0093\u0018½x¯kYBKNuFg¬\u0011»\u0003\u0096-\u0088ßäÉìûÙåÎ\u0097Â\u00820¬8^\u0007H\nz}dp\u0016`\u0000W2ZÜ¶Î¢ø\u0084ê\u008c\u0094õ\u0086î°ã¢ÖLØ\u007f9i)\u001b\u0002\u0005\u000f7\u0000!lÓdý\\ïV\u0099¥\u008b¯µ\u009a§\u008eQ\u0083Cõmø\u001fÙ\tÉ4\"&1Ð Â\u0014ì\u001a\u009ew\u0088nºD¤SV¾@·r¼\u001c\u008b\u000e\u00868û*ôÔÜÆÈðÞã-\u008d$¿\u0012©\u0016[{Ekw@aO\u0013B=±/¸Ù\u0098Ë\u0080õâçë\u0091þ\u0083Ñ\u00adÏX(J7t\u001af\u0006\u0010`\u0002p,hÞJÈYú»ä¨\u0096\u0082\u0080\u008b²\u009e\\ñNïxÈj×\u00159\u0007/1\u0000#\u0011Í\u0006ÿjée\u009b[\u0085T·£¡\u00adS }\u008co\u0087\u0019õ\u000bö5Û'ÉÒ ü/î\"\u0098\u001f\u008a\u0018´y¦`PBBQlA\u001e°\bº:\u0089$\u0088ÖùÀòòß\u009cÛ\u008eÜ¹2«$U\u0006G\u0015q|cn\r~?T)GÛ¨Å©÷\u009aá\u0092\u0093þ½ú¯üYÒKÆv&`)\u0012\u001f<\u0010.\u001fØsÊgôHæN\u0090¼\u0082²¬\u0098^\u0097H\u009czòdâ\u0016Æ\u0000Ì39Ý0Ï ù\u0018ë\u001a\u0095i\u0087i±Z£RM¡\u007f±i£\u001b\u008a\u0005\u00807ú!ôÓÃýÎïÄ\u009a,\u0084%¶\u0011 \u0016Re|ln[\u0018N\nB4¾&¸Ð\u009dÂ\u0094ìÿ\u009eå\u0088þºÍ¤ÅW0A6s\u001c\u001d\u0006\u000f`9o+aÕPÇXñ¸ã \u008d\u0082¿\u0091©\u0083[ðEúwÕaÉ\f$>3(\u001dÚ\u0013Ä\u001cöràm\u0092F¼K®¾X°J¿t\u0091f\u0084\u0010è\u0002ë,ÙÞÒÉ9û2å<\u0097\u000b\u0081\u0007³\u007f]tOCyOkG\u0015¬\u0007£1\u0095#\u0096ÍåÿíéÚ\u009bÎ\u0085Ã°>¢8L\u0007~\u000bhy\u001ap\u0004\u007f6R GÒ¨ü¯î\u009b\u0098\u0092\u008aá´ñ¦èPÊBÁm>\u001f4\t\u001b;\t%\u001e×mÁeó]\u009dV\u008f¥¹¬«\u009dU\u008eG\u0082qòcø\rÇ?Ê*<Ô0Æ ð\u0019â\u001a\u008cw¾j¨DZJD¹v®`¤\u0012\u0090<\u0098.þØïÊÂôÎæÊ\u0091,\u0083;\u00ad\u0010_\nId{seX\u0017S\u0001\\3´Ý Ï\u0086ù\u0095ëü\u0095ê\u0087þ±×£ÚN7x+j\u0004\u0014\u0013\u0006~0u\"|ÌSþBè¦\u009aµ\u0084\u009c¶\u008b \u009eRò|înÈ\u0018×\u000b95.'\u0000Ñ\u0015Ã\u001cíw\u009fm\u0089F»U¥¿W\u00adA¾s\u0093\u001d\u0086\u000fè9ë+ÚÕÒÀ?ò2\u009c<\u008e\u000b¸\u0005ªxTtF_pMb^\fµ>¡(\u0088Ú\u008fÄðöòàÁ\u0092Ö¼Â¯*Y!K\u001eu\u0014g{\u0011e\u0003~-MßBÉ·û¶å\u0085\u0097\u008c\u0081ý³î]âOÒyØd'\u0016*\u0000\u001c2\u0010Ü\u0006ÎvøzêU\u0094C\u0086¤°¨¢\u009cL\u008e~\u0082hð\u001aø\u0004Ç6Ê!=Ó0ý!ï\u0011\u0099\u001a\u008bwµh§DQLC´m®\u001f½\t\u009e;\u0098%ç×ìÁÚóÐ\u009dÀ\u00884º:¤\tV\b@~rr\u001c[\u000eN8C*·Ô¸Æ\u0087ð\u008aâö\u008cð¾à¨ØZÚE3w6a\u0019\u0013\u0007=`/oÙbËQõXç¸\u0091 \u0083\u0082\u00ad\u0091_\u0083Ið{úeÕ\u0017É\u0002$,3Þ\u001dÈ\u0013ú\u001cäp\u0096e\u0080F²U\\¿N®x¾j\u0091\u0014\u0087\u0006è0÷\"ÜÌËÿ é4\u009b\"\u0085\n·\u0019¡~Sn}BoJ\u0019A\u000b¬5»'\u0090Ñ\u008dÃäíó\u009fÞ\u0089Ó»Ü¦7P&B\u0006l\u0015\u001e\u007f\bl:~$QÖEÀ¨ò·\u009c\u0099\u008e\u008f¸àªóTâFÊpÅc8\r4?\u0003)\rÛ\u0000Ål÷gá]\u0093V½¥¯¬Y\u009eK\u008eu\u0086gò\u0011ø\u0003Ù-ÊØ\"Ê.ô*æ\f\u0090\u001b\u0082p¬b^DHOzµd®\u0016½\u0000\u00942\u0082ÜæÎëøÛêÐ\u0094ß\u00874±#£\bM\b\u007fpir\u001bA\u0005S7G!ªÓ£ý\u0086ï\u0089\u0099÷\u008bðµÿ§ÑQÇ|(n)\u0018\u0018\n\u00124a&sÐhÂJìY\u009e¾\u0088¡º\u0082¤\u008dV\u0080@ìrû\u001cÕ\u000eÍ9$+/Õ\u001fÇ\u000eñ\u001dãw\u008de¿F©I[¼E°w¿a\u0091\u0013\u008e=è/÷ÙÝËÎö à0\u0092$¼\n®\u0019XxJjtBfJ\u0010G\u0002¬,»Þ\u0097È\u008búääí\u0096Ü\u0080Î²Ä]0O8y\u001bk\u0001\u0015b\u0007o1`#LÍDÿ¼é¶\u009b\u009c\u0085\u0088·à¡öSç}ÊoÆ\u001a2\u000446\u0003 \bÒ\nülî`\u0098R\u008aV´»¦¯P\u0080B\u008fl\u0085\u001e÷\bø:Ù$Ì×\"Á1ó'\u009d\u0012\u008f\u001a¹i«hUYGRq¾c¶\r¼?\u008b)\u0086ÛüÅô÷ÝáÉ\u0093Þ¾-¨#Z\u0017D\u0016v~`i\u0012@<S.IØªÊ¹ô\u0099æ\u008c\u0090â\u0082î¬ê^ÌHÛ{5e*\u0017\u0004\u0001\u000f3\u007fÝnÏ}ùWëE\u0095¦\u0087®±\u009f£\u0090M\u009f\u007fñiä\u001bÈ\u0005×0=\"*Ì\u0000þ\u0013è\u0001\u009aj\u0084y¶_ MR¢|®n¦\u0018\u008c\n\u00844ð&öÐÞÂÆí \u009f3\u0089!»\n¥\u0019W\u007fAnsB\u001dJ\u000fK9¬+»Õ\u0091Ç\u008dñäãó\u008dÙ¿Ú©ÜT1F$p\u0006b\u000b\fv>p(eÚQÄZö³à¨\u0092\u0084¼\u0093®ùXûJütÔfÀ\u0011&\u0003.-\u0016ß\u0010É\u001fûvåf\u0097H\u0081W³¾]¯O\u0080y\u008fk\u0086\u0015ô\u0007ø1Ç#ÎÎ<ø0ê?\u0094\u0015\u0086\u000e°h¢mL\\~Rh»\u001a·\u0004¼6\u0090 \u008cÒæüõîÛ\u0098Å\u008aÞµ7§ Q\bC\u0017m~\u001fm\t@;O%F×²Á¸ó\u0087\u009d\u008e\u008fû¹ð«åU×GÚr3\u001c\"\u000e\u00048\t*uÔnÆcðJâY\u008c¸¾´¨\u0083Z\u008aD\u0084vì`ç\u0012Ý<Ö/%Ù(Ë\u001bõ\u000eç\u0003\u0091w\u0083x\u00adG_NI¹Ü ".getBytes(CharsetNames.ISO_8859_1)).asCharBuffer().get(cArr, 0, AnalyticsListener.EVENT_VIDEO_INPUT_FORMAT_CHANGED);
                AudioAttributesImplApi21Parcelizer = cArr;
                MediaBrowserCompatItemReceiver = 2844375914692136450L;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void a(short r7, short r8, byte r9, java.lang.Object[] r10) {
                /*
                    int r7 = r7 + 4
                    int r8 = r8 + 4
                    byte[] r0 = kotlin.center.MediaBrowserCompatCustomActionResultReceiver
                    int r9 = 118 - r9
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L11
                    r3 = r9
                    r4 = r2
                    r9 = r7
                    goto L29
                L11:
                    r3 = r2
                L12:
                    int r4 = r3 + 1
                    byte r5 = (byte) r9
                    r1[r3] = r5
                    int r7 = r7 + 1
                    if (r4 != r8) goto L23
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L23:
                    r3 = r0[r7]
                    r6 = r9
                    r9 = r7
                    r7 = r3
                    r3 = r6
                L29:
                    int r3 = r3 + r7
                    int r7 = r3 + (-5)
                    r3 = r4
                    r6 = r9
                    r9 = r7
                    r7 = r6
                    goto L12
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.center.a(short, short, byte, java.lang.Object[]):void");
            }
        });
        getLatestPlaylistSnapshot getlatestplaylistsnapshot3 = this.read;
        if (getlatestplaylistsnapshot3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getlatestplaylistsnapshot3 = null;
        }
        getlatestplaylistsnapshot3.IconCompatParcelizer().setOnClickListener(new View.OnClickListener() { // from class: o.strokeColor
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                radius.MediaBrowserCompatCustomActionResultReceiver(this.read);
            }
        });
        getLatestPlaylistSnapshot getlatestplaylistsnapshot4 = this.read;
        if (getlatestplaylistsnapshot4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            getlatestplaylistsnapshot2 = getlatestplaylistsnapshot4;
        }
        Button button = getlatestplaylistsnapshot2.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button, "");
        bytesRead.IconCompatParcelizer(button, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.strokeWidth
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return radius.MediaBrowserCompatMediaItem(this.write);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatItemReceiver(radius radiusVar) {
        getLatestPlaylistSnapshot getlatestplaylistsnapshot = radiusVar.read;
        if (getlatestplaylistsnapshot == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getlatestplaylistsnapshot = null;
        }
        CardView cardView = getlatestplaylistsnapshot.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardView, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(cardView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatCustomActionResultReceiver(radius radiusVar) {
        getLatestPlaylistSnapshot getlatestplaylistsnapshot = radiusVar.read;
        if (getlatestplaylistsnapshot == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getlatestplaylistsnapshot = null;
        }
        CardView cardView = getlatestplaylistsnapshot.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardView, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(cardView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatMediaItem(radius radiusVar) {
        radiusVar.read().AudioAttributesCompatParcelizer(Dot.AudioAttributesCompatParcelizer.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        this.RemoteActionCompatParcelizer = new target(new getAnswerMap() { // from class: o.zIndex
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return radius.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, (String) obj);
            }
        });
        getLatestPlaylistSnapshot getlatestplaylistsnapshot = this.read;
        target targetVar = null;
        if (getlatestplaylistsnapshot == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getlatestplaylistsnapshot = null;
        }
        RecyclerView recyclerView = getlatestplaylistsnapshot.AudioAttributesImplApi26Parcelizer;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        recyclerView.AudioAttributesCompatParcelizer(new CmcdHeadersFactoryCmcdObject(contextRequireContext, 0, false, 4, null));
        getLatestPlaylistSnapshot getlatestplaylistsnapshot2 = this.read;
        if (getlatestplaylistsnapshot2 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getlatestplaylistsnapshot2 = null;
        }
        RecyclerView recyclerView2 = getlatestplaylistsnapshot2.AudioAttributesImplApi26Parcelizer;
        target targetVar2 = this.RemoteActionCompatParcelizer;
        if (targetVar2 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            targetVar = targetVar2;
        }
        recyclerView2.setAdapter(targetVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(radius radiusVar, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        getLatestPlaylistSnapshot getlatestplaylistsnapshot = radiusVar.read;
        getLatestPlaylistSnapshot getlatestplaylistsnapshot2 = null;
        if (getlatestplaylistsnapshot == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getlatestplaylistsnapshot = null;
        }
        getlatestplaylistsnapshot.AudioAttributesImplBaseParcelizer.setText(str);
        getLatestPlaylistSnapshot getlatestplaylistsnapshot3 = radiusVar.read;
        if (getlatestplaylistsnapshot3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            getlatestplaylistsnapshot2 = getlatestplaylistsnapshot3;
        }
        CardView cardView = getlatestplaylistsnapshot2.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardView, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(cardView);
        radiusVar.read().AudioAttributesCompatParcelizer(new Dot.write(str));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: renamed from: o.radius$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/radius$read;", "", "<init>", "()V", "Lo/radius;", "write", "()Lo/radius;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static radius write() {
            return new radius();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: renamed from: o.radius$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "write", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ Fragment $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return this.$IconCompatParcelizer.requireActivity().getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Fragment fragment) {
            super(0);
            this.$IconCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.radius$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "AudioAttributesCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            return this.$AudioAttributesCompatParcelizer.requireActivity().getDefaultViewModelCreationExtras();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Fragment fragment) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.radius$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "read", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            return this.$IconCompatParcelizer.requireActivity().getDefaultViewModelProviderFactory();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment) {
            super(0);
            this.$IconCompatParcelizer = fragment;
        }
    }
}
