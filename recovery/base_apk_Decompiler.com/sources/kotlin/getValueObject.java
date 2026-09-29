package kotlin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;
import com.marrow.R;
import com.marrow.ui.views.MaxHeightRecyclerView;
import com.marrow2.ui.pearl.viewmodel.PearlListViewModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.StatsUtils;
import kotlin.VisibilityChecker;
import kotlin._init_lambda4;
import kotlin.getEventKey;
import kotlin.registerDeadlineEvent;
import kotlin.serializeIterableToIntentExtra;
import kotlin.toInteger;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0010\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u0018\u001a\u00020\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0007\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001d\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\rH\u0002¢\u0006\u0004\b \u0010\u0003J\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0010\u0010!J\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0010\u0010\"J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0014J\u0017\u0010#\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0012H\u0002¢\u0006\u0004\b#\u0010\u0014J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020$H\u0002¢\u0006\u0004\b\u0013\u0010%J\u001f\u0010#\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0012H\u0002¢\u0006\u0004\b#\u0010&J\u000f\u0010'\u001a\u00020\rH\u0002¢\u0006\u0004\b'\u0010\u0003R\u0016\u0010\u001d\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010)R\u001b\u0010\u0010\u001a\u00020*8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b#\u0010-R\u0016\u0010\u0018\u001a\u00020.8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b#\u0010/R\u0014\u0010\u0013\u001a\u0002008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u00101R\u0014\u0010#\u001a\u0002028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u00103R\u0014\u0010'\u001a\u0002048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u00105R\u001e\u0010 \u001a\f\u0012\b\u0012\u0006*\u00020707068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u00108R\u0014\u0010\u001e\u001a\u0002098\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010:R\u0016\u0010+\u001a\u00020;8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010<"}, d2 = {"Lo/getValueObject;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "AudioAttributesCompatParcelizer", "onResume", "", "IconCompatParcelizer", "(Z)V", "", "", "(Ljava/lang/String;I)V", "read", "(Ljava/lang/String;Ljava/lang/String;)V", "", "Lo/registerDeadlineEvent;", "(Ljava/util/List;Ljava/lang/String;)V", "write", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi21Parcelizer", "(I)V", "(Ljava/lang/String;)V", "RemoteActionCompatParcelizer", "Lo/StatsEventTypes;", "(Lo/StatsEventTypes;)V", "(IZ)V", "AudioAttributesImplBaseParcelizer", "Lo/getResult;", "Lo/getResult;", "Lcom/marrow2/ui/pearl/viewmodel/PearlListViewModel;", "MediaBrowserCompatItemReceiver", "Lo/RenewEligible;", "()Lcom/marrow2/ui/pearl/viewmodel/PearlListViewModel;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Lo/zzaf;", "Lo/zzaf;", "Lo/onBindingDied;", "Lo/onBindingDied;", "Lo/DataSourceBitmapLoader;", "Lo/DataSourceBitmapLoader;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;", "Landroid/content/Intent;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;", "Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getValueObject extends onInstallStatusUpdated {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final C0239zzaf IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private RecyclerView.MediaBrowserCompatSearchResultReceiver MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final onBindingDied RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final DataSourceBitmapLoader AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final RenewEligible AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private LinearLayoutManager read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final CompoundButton.OnCheckedChangeListener AudioAttributesImplApi26Parcelizer;
    private getResult write;

    public getValueObject() {
        getValueObject getvalueobject = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass4(new AnonymousClass2(getvalueobject)));
        this.AudioAttributesCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(PearlListViewModel.class), new AnonymousClass1(renewEligibleWrite), new AnonymousClass5(renewEligibleWrite), new AnonymousClass3(getvalueobject, renewEligibleWrite));
        this.IconCompatParcelizer = new C0239zzaf(new getAnswerMap() { // from class: o.forFloat
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getValueObject.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, (String) obj);
            }
        }, new getModuleData() { // from class: o.forConcreteTypeArray
            @Override // kotlin.getModuleData
            public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                return getValueObject.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, (registerDeadlineEvent.RemoteActionCompatParcelizer) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        });
        this.RemoteActionCompatParcelizer = new onBindingDied(new getAnswerMap() { // from class: o.withConverter
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getValueObject.read(this.AudioAttributesCompatParcelizer, (registerEvent) obj);
            }
        });
        this.AudioAttributesImplBaseParcelizer = new DataSourceBitmapLoader(new getAnswerMap() { // from class: o.forStringMap
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getValueObject.write(this.IconCompatParcelizer, (TabLayout.MediaBrowserCompatCustomActionResultReceiver) obj);
            }
        });
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult = registerForActivityResult(new _init_lambda4.AudioAttributesImplApi26Parcelizer(), new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() { // from class: o.forString
            @Override // kotlin.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
            public final void IconCompatParcelizer(Object obj) throws Exception {
                getValueObject.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, (ActivityResult) obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult, "");
        this.AudioAttributesImplApi21Parcelizer = r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult;
        this.AudioAttributesImplApi26Parcelizer = new CompoundButton.OnCheckedChangeListener() { // from class: o.forLong
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) throws Exception {
                getValueObject.MediaDescriptionCompat(this.IconCompatParcelizer);
            }
        };
        this.MediaBrowserCompatItemReceiver = new handleMediaPlayPauseIfPendingOnHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PearlListViewModel RemoteActionCompatParcelizer() {
        return (PearlListViewModel) this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        getResult getresultRemoteActionCompatParcelizer = getResult.RemoteActionCompatParcelizer(p0, p1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getresultRemoteActionCompatParcelizer, "");
        this.write = getresultRemoteActionCompatParcelizer;
        if (getresultRemoteActionCompatParcelizer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getresultRemoteActionCompatParcelizer = null;
        }
        ConstraintLayout constraintLayoutIconCompatParcelizer = getresultRemoteActionCompatParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer, "");
        return constraintLayoutIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        AudioAttributesCompatParcelizer();
        AudioAttributesImplBaseParcelizer();
        write();
        AudioAttributesImplApi26Parcelizer();
        getValueObject getvalueobject = this;
        setBitrateKbps.RemoteActionCompatParcelizer(getvalueobject, new RemoteActionCompatParcelizer(null));
        setBitrateKbps.RemoteActionCompatParcelizer(getvalueobject, new AudioAttributesImplApi21Parcelizer(null));
        setBitrateKbps.read(getvalueobject, new AudioAttributesImplBaseParcelizer(null));
        setBitrateKbps.read(getvalueobject, new AudioAttributesImplApi26Parcelizer(null));
        setBitrateKbps.read(getvalueobject, new MediaBrowserCompatSearchResultReceiver(null));
        setBitrateKbps.RemoteActionCompatParcelizer(getvalueobject, new RatingCompat(null));
        setBitrateKbps.read(getvalueobject, new MediaMetadataCompat(null));
        setBitrateKbps.read(getvalueobject, new MediaBrowserCompatMediaItem(null));
        setBitrateKbps.read(getvalueobject, new MediaDescriptionCompat(null));
        setBitrateKbps.read(getvalueobject, new write(null));
        setBitrateKbps.read(getvalueobject, new AudioAttributesCompatParcelizer(null));
        setBitrateKbps.read(getvalueobject, new read(null));
        setBitrateKbps.read(getvalueobject, new MediaBrowserCompatItemReceiver(null));
        setBitrateKbps.read(getvalueobject, new MediaBrowserCompatCustomActionResultReceiver(null));
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isDark<DataSourceBitmapLoaderExternalSyntheticLambda0<List<registerDeadlineEvent>>> isdarkAudioAttributesImplApi26Parcelizer = getValueObject.this.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer();
                final getValueObject getvalueobject = getValueObject.this;
                this.IconCompatParcelizer = 1;
                if (isdarkAudioAttributesImplApi26Parcelizer.write(new getValidationToken() { // from class: o.getValueObject.RemoteActionCompatParcelizer.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((DataSourceBitmapLoaderExternalSyntheticLambda0) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(DataSourceBitmapLoaderExternalSyntheticLambda0<List<registerDeadlineEvent>> dataSourceBitmapLoaderExternalSyntheticLambda0) {
                        if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof decodeBitmap) {
                            C0239zzaf.AudioAttributesCompatParcelizer(getvalueobject.IconCompatParcelizer, (List) ((decodeBitmap) dataSourceBitmapLoaderExternalSyntheticLambda0).read(), null, false, 6);
                            getvalueobject.IconCompatParcelizer(!((Collection) r6.read()).isEmpty());
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
            return getValueObject.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isDark<List<String>> isdarkOnAddQueueItem = getValueObject.this.RemoteActionCompatParcelizer().onAddQueueItem();
                final getValueObject getvalueobject = getValueObject.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (isdarkOnAddQueueItem.write(new getValidationToken() { // from class: o.getValueObject.AudioAttributesImplApi21Parcelizer.2
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((List) obj2);
                    }

                    private Object IconCompatParcelizer(List<String> list) {
                        getResult getresult = getvalueobject.write;
                        getResult getresult2 = null;
                        if (getresult == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            getresult = null;
                        }
                        getresult.RatingCompat.read(getvalueobject.AudioAttributesImplBaseParcelizer);
                        getResult getresult3 = getvalueobject.write;
                        if (getresult3 == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            getresult3 = null;
                        }
                        getresult3.RatingCompat.MediaBrowserCompatCustomActionResultReceiver();
                        getValueObject getvalueobject2 = getvalueobject;
                        for (String str : list) {
                            getResult getresult4 = getvalueobject2.write;
                            if (getresult4 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                getresult4 = null;
                            }
                            TabLayout tabLayout = getresult4.RatingCompat;
                            getResult getresult5 = getvalueobject2.write;
                            if (getresult5 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                getresult5 = null;
                            }
                            tabLayout.write(getresult5.RatingCompat.AudioAttributesImplApi21Parcelizer().write(str));
                        }
                        boolean zIsEmpty = list.isEmpty();
                        getResult getresult6 = getvalueobject.write;
                        if (zIsEmpty) {
                            if (getresult6 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                getresult2 = getresult6;
                            }
                            TabLayout tabLayout2 = getresult2.RatingCompat;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(tabLayout2, "");
                            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(tabLayout2);
                        } else {
                            if (getresult6 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                getresult2 = getresult6;
                            }
                            TabLayout tabLayout3 = getresult2.RatingCompat;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(tabLayout3, "");
                            PlayerControlViewExternalSyntheticLambda1.write(tabLayout3);
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

        AudioAttributesImplApi21Parcelizer(SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getValueObject.this.new AudioAttributesImplApi21Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isDark<Integer> isdarkIconCompatParcelizer = getValueObject.this.RemoteActionCompatParcelizer().IconCompatParcelizer();
                final getValueObject getvalueobject = getValueObject.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (isdarkIconCompatParcelizer.write(new getValidationToken() { // from class: o.getValueObject.AudioAttributesImplBaseParcelizer.3
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer(((Number) obj2).intValue());
                    }

                    private Object RemoteActionCompatParcelizer(int i2) {
                        getResult getresult = getvalueobject.write;
                        getResult getresult2 = null;
                        if (getresult == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            getresult = null;
                        }
                        TabLayout tabLayout = getresult.RatingCompat;
                        getResult getresult3 = getvalueobject.write;
                        if (getresult3 == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                        } else {
                            getresult2 = getresult3;
                        }
                        tabLayout.IconCompatParcelizer(getresult2.RatingCompat.AudioAttributesCompatParcelizer(i2));
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
            return getValueObject.this.new AudioAttributesImplBaseParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class AudioAttributesImplApi26Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isDark<List<registerEvent>> isdarkAudioAttributesImplApi21Parcelizer = getValueObject.this.RemoteActionCompatParcelizer().AudioAttributesImplApi21Parcelizer();
                final getValueObject getvalueobject = getValueObject.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (isdarkAudioAttributesImplApi21Parcelizer.write(new getValidationToken() { // from class: o.getValueObject.AudioAttributesImplApi26Parcelizer.3
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((List) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(List<registerEvent> list) {
                        onBindingDied.write(getvalueobject.RemoteActionCompatParcelizer, list, null, 2);
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
            return getValueObject.this.new AudioAttributesImplApi26Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class MediaBrowserCompatSearchResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isDark<String> isdarkMediaBrowserCompatMediaItem = getValueObject.this.RemoteActionCompatParcelizer().MediaBrowserCompatMediaItem();
                final getValueObject getvalueobject = getValueObject.this;
                this.read = 1;
                if (isdarkMediaBrowserCompatMediaItem.write(new getValidationToken() { // from class: o.getValueObject.MediaBrowserCompatSearchResultReceiver.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((String) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(String str) {
                        onBindingDied.write(getvalueobject.RemoteActionCompatParcelizer, null, str, 1);
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

        MediaBrowserCompatSearchResultReceiver(SampleVideos<? super MediaBrowserCompatSearchResultReceiver> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getValueObject.this.new MediaBrowserCompatSearchResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatSearchResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class RatingCompat extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isDark<WakeLockTracker> isdarkMediaBrowserCompatCustomActionResultReceiver = getValueObject.this.RemoteActionCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver();
                final getValueObject getvalueobject = getValueObject.this;
                this.read = 1;
                if (isdarkMediaBrowserCompatCustomActionResultReceiver.write(new getValidationToken() { // from class: o.getValueObject.RatingCompat.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((WakeLockTracker) obj2);
                    }

                    private Object write(WakeLockTracker wakeLockTracker) throws Exception {
                        C0239zzaf.AudioAttributesCompatParcelizer(getvalueobject.IconCompatParcelizer, null, wakeLockTracker.AudioAttributesCompatParcelizer(), false, 5);
                        if (wakeLockTracker.write()) {
                            getValueObject getvalueobject2 = getvalueobject;
                            getvalueobject2.read(getvalueobject2.IconCompatParcelizer.AudioAttributesCompatParcelizer(), wakeLockTracker.AudioAttributesCompatParcelizer());
                            getvalueobject.RemoteActionCompatParcelizer().read(new getEventKey.write(false));
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

        RatingCompat(SampleVideos<? super RatingCompat> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getValueObject.this.new RatingCompat(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RatingCompat) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.getValueObject$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "write", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$RemoteActionCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment) {
            super(0);
            this.$RemoteActionCompatParcelizer = fragment;
        }
    }

    static final class MediaMetadataCompat extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isDark<Boolean> isdarkMediaMetadataCompat = getValueObject.this.RemoteActionCompatParcelizer().MediaMetadataCompat();
                final getValueObject getvalueobject = getValueObject.this;
                this.read = 1;
                if (isdarkMediaMetadataCompat.write(new getValidationToken() { // from class: o.getValueObject.MediaMetadataCompat.1
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer(((Boolean) obj2).booleanValue());
                    }

                    private Object IconCompatParcelizer(boolean z) {
                        getvalueobject.read(z);
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

        MediaMetadataCompat(SampleVideos<? super MediaMetadataCompat> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getValueObject.this.new MediaMetadataCompat(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaMetadataCompat) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.getValueObject$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "IconCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$IconCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$IconCompatParcelizer = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.getValueObject$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "write", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$RemoteActionCompatParcelizer).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RenewEligible renewEligible) {
            super(0);
            this.$RemoteActionCompatParcelizer = renewEligible;
        }
    }

    static final class MediaBrowserCompatMediaItem extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isDark<Boolean> isdarkMediaBrowserCompatSearchResultReceiver = getValueObject.this.RemoteActionCompatParcelizer().MediaBrowserCompatSearchResultReceiver();
                final getValueObject getvalueobject = getValueObject.this;
                this.read = 1;
                if (isdarkMediaBrowserCompatSearchResultReceiver.write(new getValidationToken() { // from class: o.getValueObject.MediaBrowserCompatMediaItem.4
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer(((Boolean) obj2).booleanValue());
                    }

                    private Object IconCompatParcelizer(boolean z) {
                        getvalueobject.RemoteActionCompatParcelizer(z);
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

        MediaBrowserCompatMediaItem(SampleVideos<? super MediaBrowserCompatMediaItem> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getValueObject.this.new MediaBrowserCompatMediaItem(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatMediaItem) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.getValueObject$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "read", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ RenewEligible $read;
        private /* synthetic */ getCreatedOnDateMs $write = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$read);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(RenewEligible renewEligible) {
            super(0);
            this.$read = renewEligible;
        }
    }

    static final class MediaDescriptionCompat extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isDark<Integer> isdarkMediaDescriptionCompat = getValueObject.this.RemoteActionCompatParcelizer().MediaDescriptionCompat();
                final getValueObject getvalueobject = getValueObject.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (isdarkMediaDescriptionCompat.write(new getValidationToken() { // from class: o.getValueObject.MediaDescriptionCompat.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer(((Number) obj2).intValue());
                    }

                    private Object AudioAttributesCompatParcelizer(int i2) {
                        getvalueobject.AudioAttributesCompatParcelizer(i2);
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

        MediaDescriptionCompat(SampleVideos<? super MediaDescriptionCompat> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getValueObject.this.new MediaDescriptionCompat(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaDescriptionCompat) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.getValueObject$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "RemoteActionCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;
        private /* synthetic */ Fragment $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$read.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$read = fragment;
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isDark<getWrappedCursor> isdarkAudioAttributesCompatParcelizer = getValueObject.this.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer();
                final getValueObject getvalueobject = getValueObject.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (isdarkAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.getValueObject.write.3
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((getWrappedCursor) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(getWrappedCursor getwrappedcursor) {
                        getResult getresult = getvalueobject.write;
                        if (getresult == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            getresult = null;
                        }
                        getAdjustedMetadata getadjustedmetadata = getresult.MediaBrowserCompatCustomActionResultReceiver;
                        getValueObject getvalueobject2 = getvalueobject;
                        getadjustedmetadata.RatingCompat.setText(getvalueobject2.getString(R.string.text_count_in_brackets, QBankStatsResponse.RemoteActionCompatParcelizer(getwrappedcursor.getWrite())));
                        getadjustedmetadata.MediaBrowserCompatMediaItem.setText(getvalueobject2.getString(R.string.text_count_in_brackets, QBankStatsResponse.RemoteActionCompatParcelizer(getwrappedcursor.getRead())));
                        getadjustedmetadata.MediaMetadataCompat.setText(getvalueobject2.getString(R.string.text_count_in_brackets, QBankStatsResponse.RemoteActionCompatParcelizer(getwrappedcursor.getAudioAttributesCompatParcelizer())));
                        getadjustedmetadata.AudioAttributesImplApi21Parcelizer.setText(getvalueobject2.getString(R.string.text_count_in_brackets, QBankStatsResponse.RemoteActionCompatParcelizer(getwrappedcursor.getIconCompatParcelizer())));
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
            return getValueObject.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isDark<StatsEventTypes> isdarkRatingCompat = getValueObject.this.RemoteActionCompatParcelizer().RatingCompat();
                final getValueObject getvalueobject = getValueObject.this;
                this.read = 1;
                if (isdarkRatingCompat.write(new getValidationToken() { // from class: o.getValueObject.AudioAttributesCompatParcelizer.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((StatsEventTypes) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(StatsEventTypes statsEventTypes) {
                        getvalueobject.IconCompatParcelizer(statsEventTypes);
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
            return getValueObject.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
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
                isDark<Boolean> isdarkOnCommand = getValueObject.this.RemoteActionCompatParcelizer().onCommand();
                final getValueObject getvalueobject = getValueObject.this;
                this.IconCompatParcelizer = 1;
                if (isdarkOnCommand.write(new getValidationToken() { // from class: o.getValueObject.read.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read(((Boolean) obj2).booleanValue());
                    }

                    private Object read(boolean z) {
                        C0239zzaf.AudioAttributesCompatParcelizer(getvalueobject.IconCompatParcelizer, null, null, z, 3);
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
            return getValueObject.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isDark<Integer> isdarkAudioAttributesImplBaseParcelizer = getValueObject.this.RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer();
                final getValueObject getvalueobject = getValueObject.this;
                this.IconCompatParcelizer = 1;
                if (isdarkAudioAttributesImplBaseParcelizer.write(new getValidationToken() { // from class: o.getValueObject.MediaBrowserCompatItemReceiver.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read(((Number) obj2).intValue());
                    }

                    private Object read(int i2) {
                        getvalueobject.RemoteActionCompatParcelizer(i2, false);
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

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getValueObject.this.new MediaBrowserCompatItemReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<StatsUtils> setupdatedstatusMediaBrowserCompatItemReceiver = getValueObject.this.RemoteActionCompatParcelizer().MediaBrowserCompatItemReceiver();
                final getValueObject getvalueobject = getValueObject.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusMediaBrowserCompatItemReceiver.write(new getValidationToken() { // from class: o.getValueObject.MediaBrowserCompatCustomActionResultReceiver.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((StatsUtils) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(StatsUtils statsUtils) throws Exception {
                        if (statsUtils instanceof StatsUtils.AudioAttributesCompatParcelizer) {
                            getvalueobject.AudioAttributesCompatParcelizer(((StatsUtils.AudioAttributesCompatParcelizer) statsUtils).IconCompatParcelizer());
                        } else if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(statsUtils, StatsUtils.RemoteActionCompatParcelizer.INSTANCE)) {
                            throw new RenewEligibleCreator();
                        }
                        getvalueobject.RemoteActionCompatParcelizer().read(getEventKey.IconCompatParcelizer.INSTANCE);
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
            return getValueObject.this.new MediaBrowserCompatCustomActionResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesCompatParcelizer() {
        getResult getresult = this.write;
        getResult getresult2 = null;
        if (getresult == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getresult = null;
        }
        MaterialToolbar materialToolbar = getresult.MediaMetadataCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialToolbar, "");
        getHttpMethodString.read((View) materialToolbar, true, false, true, true, 0, 50);
        getResult getresult3 = this.write;
        if (getresult3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getresult3 = null;
        }
        FrameLayout frameLayout = getresult3.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
        getHttpMethodString.read((View) frameLayout, false, true, true, true, 0, 49);
        getResult getresult4 = this.write;
        if (getresult4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getresult4 = null;
        }
        CardView cardView = getresult4.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardView, "");
        getHttpMethodString.RemoteActionCompatParcelizer(cardView, true, false, false, true, 0, 54);
        getResult getresult5 = this.write;
        if (getresult5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            getresult2 = getresult5;
        }
        CardView cardView2 = getresult2.MediaBrowserCompatSearchResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardView2, "");
        getHttpMethodString.RemoteActionCompatParcelizer(cardView2, true, false, false, true, 0, 54);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() throws Exception {
        super.onResume();
        RemoteActionCompatParcelizer().read(getEventKey.MediaBrowserCompatItemReceiver.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(boolean p0) {
        getResult getresult = null;
        if (p0) {
            getResult getresult2 = this.write;
            if (getresult2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                getresult2 = null;
            }
            RecyclerView recyclerView = getresult2.AudioAttributesImplApi26Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
            PlayerControlViewExternalSyntheticLambda1.write(recyclerView);
            getResult getresult3 = this.write;
            if (getresult3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                getresult = getresult3;
            }
            TextView textView = getresult.MediaDescriptionCompat;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(textView);
            return;
        }
        getResult getresult4 = this.write;
        if (getresult4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getresult4 = null;
        }
        RecyclerView recyclerView2 = getresult4.AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView2, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(recyclerView2);
        getResult getresult5 = this.write;
        if (getresult5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            getresult = getresult5;
        }
        TextView textView2 = getresult.MediaDescriptionCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
        PlayerControlViewExternalSyntheticLambda1.write((View) textView2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(getValueObject getvalueobject, String str) throws Exception {
        toMagicModuleMetaRepoModel.write(str, "");
        getvalueobject.RemoteActionCompatParcelizer().read(new getEventKey.MediaBrowserCompatCustomActionResultReceiver(str));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(final getValueObject getvalueobject, registerDeadlineEvent.RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i, int i2) throws Exception {
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        getvalueobject.RemoteActionCompatParcelizer().read(new getEventKey.read(remoteActionCompatParcelizer, i, i2, new getModuleData() { // from class: o.forBoolean
            @Override // kotlin.getModuleData
            public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                return getValueObject.write(this.RemoteActionCompatParcelizer, (String) obj, ((Integer) obj2).intValue(), (String) obj3);
            }
        }));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(getValueObject getvalueobject, String str, int i, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        getvalueobject.AudioAttributesCompatParcelizer(str, i);
        if (str2 != null) {
            CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(getvalueobject, str2, 0);
        }
        return getShowPopup.INSTANCE;
    }

    private final void AudioAttributesCompatParcelizer(String p0, int p1) {
        this.IconCompatParcelizer.read(p0, p1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(getValueObject getvalueobject, registerEvent registerevent) throws Exception {
        toMagicModuleMetaRepoModel.write(registerevent, "");
        getvalueobject.read(registerevent.read(), registerevent.AudioAttributesCompatParcelizer());
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(getValueObject getvalueobject, TabLayout.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) throws Exception {
        toMagicModuleMetaRepoModel.write(mediaBrowserCompatCustomActionResultReceiver, "");
        getvalueobject.RemoteActionCompatParcelizer().read(new getEventKey.MediaBrowserCompatSearchResultReceiver(String.valueOf(mediaBrowserCompatCustomActionResultReceiver.write())));
        return getShowPopup.INSTANCE;
    }

    private final void read(String p0, String p1) throws Exception {
        read();
        RemoteActionCompatParcelizer().read(new getEventKey.MediaMetadataCompat(p0, p1));
        Iterator<registerDeadlineEvent> it = this.IconCompatParcelizer.AudioAttributesCompatParcelizer().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            registerDeadlineEvent next = it.next();
            if ((next instanceof registerDeadlineEvent.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ((registerDeadlineEvent.write) next).read(), (Object) p0)) {
                break;
            } else {
                i++;
            }
        }
        RemoteActionCompatParcelizer(i, true);
    }

    private final void write() {
        final getResult getresult = this.write;
        if (getresult == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getresult = null;
        }
        getresult.MediaMetadataCompat.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.setBooleanInternal
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getValueObject.MediaBrowserCompatMediaItem(this.AudioAttributesCompatParcelizer);
            }
        });
        getresult.MediaBrowserCompatItemReceiver.setOnClickListener(new View.OnClickListener() { // from class: o.forStrings
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Exception {
                getValueObject.RatingCompat(this.RemoteActionCompatParcelizer);
            }
        });
        getresult.onAddQueueItem.setOnClickListener(new View.OnClickListener() { // from class: o.FastParser
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getValueObject.write(getresult);
            }
        });
        getresult.IconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.forBase64
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Exception {
                getValueObject.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(this.write);
            }
        });
        getresult.AudioAttributesCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.setLongInternal
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Exception {
                getValueObject.onCustomAction(this.AudioAttributesCompatParcelizer);
            }
        });
        getResult getresult2 = this.write;
        if (getresult2 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getresult2 = null;
        }
        getresult2.onCommand.setOnClickListener(new View.OnClickListener() { // from class: o.FastJsonResponseField
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getValueObject.handleMediaPlayPauseIfPendingOnHandler(this.IconCompatParcelizer);
            }
        });
        getresult.AudioAttributesImplApi21Parcelizer.setOnCheckedChangeListener(this.AudioAttributesImplApi26Parcelizer);
        getresult.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver.setOnCheckedChangeListener(null);
        getresult.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.setStringMapInternal
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Exception {
                getValueObject.IconCompatParcelizer(getresult, this);
            }
        });
        getresult.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer.setOnCheckedChangeListener(null);
        getresult.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.forInteger
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Exception {
                getValueObject.AudioAttributesImplApi21Parcelizer(getresult, this);
            }
        });
        getresult.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatItemReceiver.setOnCheckedChangeListener(null);
        getresult.MediaBrowserCompatCustomActionResultReceiver.write.setOnClickListener(new View.OnClickListener() { // from class: o.forConcreteType
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Exception {
                getValueObject.AudioAttributesImplBaseParcelizer(getresult, this);
            }
        });
        getresult.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplBaseParcelizer.setOnCheckedChangeListener(null);
        getresult.MediaBrowserCompatCustomActionResultReceiver.read.setOnClickListener(new View.OnClickListener() { // from class: o.forDouble
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Exception {
                getValueObject.MediaBrowserCompatItemReceiver(getresult, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatMediaItem(getValueObject getvalueobject) {
        getvalueobject.requireActivity().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RatingCompat(getValueObject getvalueobject) throws Exception {
        getvalueobject.RemoteActionCompatParcelizer().read(getEventKey.AudioAttributesCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(getResult getresult) {
        getresult.MediaBrowserCompatItemReceiver.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(getValueObject getvalueobject) throws Exception {
        getvalueobject.RemoteActionCompatParcelizer().read(getEventKey.AudioAttributesImplApi26Parcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCustomAction(getValueObject getvalueobject) throws Exception {
        getvalueobject.RemoteActionCompatParcelizer().read(getEventKey.AudioAttributesImplApi21Parcelizer.INSTANCE);
        getvalueobject.MediaBrowserCompatCustomActionResultReceiver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleMediaPlayPauseIfPendingOnHandler(getValueObject getvalueobject) {
        getvalueobject.read();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(getResult getresult, getValueObject getvalueobject) throws Exception {
        getresult.MediaBrowserCompatItemReceiver.performClick();
        getvalueobject.RemoteActionCompatParcelizer().read(new getEventKey.RemoteActionCompatParcelizer(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesImplApi21Parcelizer(getResult getresult, getValueObject getvalueobject) throws Exception {
        getresult.MediaBrowserCompatItemReceiver.performClick();
        getvalueobject.RemoteActionCompatParcelizer().read(new getEventKey.RemoteActionCompatParcelizer(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesImplBaseParcelizer(getResult getresult, getValueObject getvalueobject) throws Exception {
        getresult.MediaBrowserCompatItemReceiver.performClick();
        getvalueobject.RemoteActionCompatParcelizer().read(new getEventKey.RemoteActionCompatParcelizer(2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatItemReceiver(getResult getresult, getValueObject getvalueobject) throws Exception {
        getresult.MediaBrowserCompatItemReceiver.performClick();
        getvalueobject.RemoteActionCompatParcelizer().read(new getEventKey.RemoteActionCompatParcelizer(3));
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        requireContext();
        this.read = new LinearLayoutManager();
        getResult getresult = this.write;
        getResult getresult2 = null;
        if (getresult == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getresult = null;
        }
        RecyclerView recyclerView = getresult.AudioAttributesImplApi26Parcelizer;
        LinearLayoutManager linearLayoutManager = this.read;
        if (linearLayoutManager == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            linearLayoutManager = null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        getResult getresult3 = this.write;
        if (getresult3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getresult3 = null;
        }
        getresult3.AudioAttributesImplApi26Parcelizer.setAdapter(this.IconCompatParcelizer);
        lambdareportVideoFrameProcessingOffset4comgoogleandroidexoplayer2videoVideoRendererEventListenerEventDispatcher lambdareportvideoframeprocessingoffset4comgoogleandroidexoplayer2videovideorenderereventlistenereventdispatcher = new lambdareportVideoFrameProcessingOffset4comgoogleandroidexoplayer2videoVideoRendererEventListenerEventDispatcher(this.IconCompatParcelizer);
        getResult getresult4 = this.write;
        if (getresult4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getresult4 = null;
        }
        getresult4.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(lambdareportvideoframeprocessingoffset4comgoogleandroidexoplayer2videovideorenderereventlistenereventdispatcher);
        getResult getresult5 = this.write;
        if (getresult5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getresult5 = null;
        }
        getresult5.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver);
        getResult getresult6 = this.write;
        if (getresult6 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            getresult2 = getresult6;
        }
        getresult2.AudioAttributesImplBaseParcelizer.setAdapter(this.RemoteActionCompatParcelizer);
    }

    private final void read() {
        getResult getresult = this.write;
        getResult getresult2 = null;
        if (getresult == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getresult = null;
        }
        MaxHeightRecyclerView maxHeightRecyclerView = getresult.AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(maxHeightRecyclerView, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(maxHeightRecyclerView);
        getResult getresult3 = this.write;
        if (getresult3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            getresult2 = getresult3;
        }
        View view = getresult2.onCommand;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(view);
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        toInteger.Companion companion = toInteger.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        startActivity(toInteger.Companion.write(contextRequireContext, null));
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        getResult getresult = this.write;
        if (getresult == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getresult = null;
        }
        getAdjustedMetadata getadjustedmetadata = getresult.MediaBrowserCompatCustomActionResultReceiver;
        getadjustedmetadata.AudioAttributesImplApi26Parcelizer.setChecked(false);
        getadjustedmetadata.AudioAttributesImplBaseParcelizer.setChecked(false);
        getadjustedmetadata.MediaBrowserCompatItemReceiver.setChecked(false);
        getadjustedmetadata.MediaBrowserCompatCustomActionResultReceiver.setChecked(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(int p0) {
        getResult getresult = this.write;
        if (getresult == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getresult = null;
        }
        if (p0 != -1) {
            getresult.read.setImageDrawable(getDefaultViewModelCreationExtras.write(requireContext(), R.drawable.ic_bookmark_filled));
            AudioAttributesImplApi21Parcelizer();
            getAdjustedMetadata getadjustedmetadata = getresult.MediaBrowserCompatCustomActionResultReceiver;
            View view = getadjustedmetadata.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(view);
            if (p0 == -1 || p0 == 0) {
                getadjustedmetadata.MediaBrowserCompatCustomActionResultReceiver.setChecked(true);
                return;
            }
            if (p0 == 1) {
                getadjustedmetadata.AudioAttributesImplApi26Parcelizer.setChecked(true);
                return;
            } else if (p0 == 2) {
                getadjustedmetadata.MediaBrowserCompatItemReceiver.setChecked(true);
                return;
            } else {
                if (p0 == 3) {
                    getadjustedmetadata.AudioAttributesImplBaseParcelizer.setChecked(true);
                    return;
                }
                return;
            }
        }
        getresult.read.setImageDrawable(getDefaultViewModelCreationExtras.write(requireContext(), R.drawable.ic_bookmark_border));
        View view2 = getresult.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view2, "");
        PlayerControlViewExternalSyntheticLambda1.write(view2);
        AudioAttributesImplApi21Parcelizer();
        if (p0 != -1) {
            read(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(String p0) {
        int iIntValue = ((Number) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) RemoteActionCompatParcelizer().MediaDescriptionCompat().bm_())).intValue();
        serializeIterableToIntentExtra.Companion companion = serializeIterableToIntentExtra.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        this.AudioAttributesImplApi21Parcelizer.read(serializeIterableToIntentExtra.Companion.AudioAttributesCompatParcelizer(contextRequireContext, new ConnectionTracker(p0, ((WakeLockEvent) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) RemoteActionCompatParcelizer().read().bm_())).getAudioAttributesCompatParcelizer(), ((WakeLockEvent) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) RemoteActionCompatParcelizer().read().bm_())).getRead(), ((Boolean) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) RemoteActionCompatParcelizer().onCustomAction().bm_())).booleanValue(), iIntValue, false, fillWindow.RemoteActionCompatParcelizer, 32, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(getValueObject getvalueobject, ActivityResult activityResult) throws Exception {
        toMagicModuleMetaRepoModel.write(activityResult, "");
        if (activityResult.getRemoteActionCompatParcelizer() == -1) {
            getvalueobject.RemoteActionCompatParcelizer().read(new getEventKey.write(true));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(boolean p0) {
        getResult getresult = null;
        if (p0) {
            getResult getresult2 = this.write;
            if (getresult2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                getresult2 = null;
            }
            CardView cardView = getresult2.MediaBrowserCompatSearchResultReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardView, "");
            PlayerControlViewExternalSyntheticLambda1.write(cardView);
            getResult getresult3 = this.write;
            if (getresult3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                getresult = getresult3;
            }
            View view = getresult.onAddQueueItem;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
            PlayerControlViewExternalSyntheticLambda1.write(view);
            return;
        }
        getResult getresult4 = this.write;
        if (getresult4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getresult4 = null;
        }
        CardView cardView2 = getresult4.MediaBrowserCompatSearchResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardView2, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(cardView2);
        getResult getresult5 = this.write;
        if (getresult5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            getresult = getresult5;
        }
        View view2 = getresult.onAddQueueItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view2, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(view2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(boolean p0) {
        getResult getresult = null;
        if (p0) {
            getResult getresult2 = this.write;
            if (getresult2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                getresult2 = null;
            }
            MaxHeightRecyclerView maxHeightRecyclerView = getresult2.AudioAttributesImplBaseParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(maxHeightRecyclerView, "");
            PlayerControlViewExternalSyntheticLambda1.write(maxHeightRecyclerView);
            getResult getresult3 = this.write;
            if (getresult3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                getresult = getresult3;
            }
            View view = getresult.onCommand;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
            PlayerControlViewExternalSyntheticLambda1.write(view);
            return;
        }
        getResult getresult4 = this.write;
        if (getresult4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getresult4 = null;
        }
        MaxHeightRecyclerView maxHeightRecyclerView2 = getresult4.AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(maxHeightRecyclerView2, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(maxHeightRecyclerView2);
        getResult getresult5 = this.write;
        if (getresult5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            getresult = getresult5;
        }
        View view2 = getresult.onCommand;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view2, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(view2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(StatsEventTypes p0) {
        getResult getresult = null;
        if (p0.getRemoteActionCompatParcelizer()) {
            getResult getresult2 = this.write;
            if (getresult2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                getresult2 = null;
            }
            ImageView imageView = getresult2.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
            PlayerControlViewExternalSyntheticLambda1.write(imageView);
        } else {
            getResult getresult3 = this.write;
            if (getresult3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                getresult3 = null;
            }
            ImageView imageView2 = getresult3.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView2, "");
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(imageView2);
        }
        if (p0.getRead()) {
            getResult getresult4 = this.write;
            if (getresult4 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                getresult4 = null;
            }
            TextView textView = getresult4.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
            PlayerControlViewExternalSyntheticLambda1.write((View) textView);
        } else {
            getResult getresult5 = this.write;
            if (getresult5 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                getresult5 = null;
            }
            TextView textView2 = getresult5.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(textView2);
        }
        if (p0.getAudioAttributesCompatParcelizer()) {
            getResult getresult6 = this.write;
            if (getresult6 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                getresult6 = null;
            }
            LinearLayout linearLayout = getresult6.MediaBrowserCompatItemReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            PlayerControlViewExternalSyntheticLambda1.write(linearLayout);
        } else {
            getResult getresult7 = this.write;
            if (getresult7 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                getresult7 = null;
            }
            LinearLayout linearLayout2 = getresult7.MediaBrowserCompatItemReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(linearLayout2);
        }
        if (p0.getMediaBrowserCompatItemReceiver()) {
            getResult getresult8 = this.write;
            if (getresult8 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                getresult8 = null;
            }
            TabLayout tabLayout = getresult8.RatingCompat;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(tabLayout, "");
            PlayerControlViewExternalSyntheticLambda1.write(tabLayout);
        } else {
            getResult getresult9 = this.write;
            if (getresult9 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                getresult9 = null;
            }
            TabLayout tabLayout2 = getresult9.RatingCompat;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(tabLayout2, "");
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(tabLayout2);
        }
        String iconCompatParcelizer = p0.getIconCompatParcelizer();
        if (iconCompatParcelizer != null) {
            getResult getresult10 = this.write;
            if (getresult10 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                getresult10 = null;
            }
            getresult10.MediaBrowserCompatMediaItem.setText(iconCompatParcelizer);
        }
        Integer write2 = p0.getWrite();
        if (write2 != null) {
            int iIntValue = write2.intValue();
            getResult getresult11 = this.write;
            if (getresult11 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                getresult = getresult11;
            }
            getresult.MediaBrowserCompatMediaItem.setText(iIntValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaDescriptionCompat(getValueObject getvalueobject) throws Exception {
        PearlListViewModel pearlListViewModelRemoteActionCompatParcelizer = getvalueobject.RemoteActionCompatParcelizer();
        getResult getresult = getvalueobject.write;
        if (getresult == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getresult = null;
        }
        pearlListViewModelRemoteActionCompatParcelizer.read(new getEventKey.AudioAttributesImplBaseParcelizer(getresult.AudioAttributesImplApi21Parcelizer.isChecked()));
    }

    public static final class handleMediaPlayPauseIfPendingOnHandler extends RecyclerView.MediaBrowserCompatSearchResultReceiver {
        handleMediaPlayPauseIfPendingOnHandler() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatSearchResultReceiver
        public final void RemoteActionCompatParcelizer(RecyclerView recyclerView, int i, int i2) throws Exception {
            toMagicModuleMetaRepoModel.write(recyclerView, "");
            super.RemoteActionCompatParcelizer(recyclerView, i, i2);
            getResult getresult = getValueObject.this.write;
            getResult getresult2 = null;
            if (getresult == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                getresult = null;
            }
            getresult.RatingCompat.read(getValueObject.this.AudioAttributesImplBaseParcelizer);
            PearlListViewModel pearlListViewModelRemoteActionCompatParcelizer = getValueObject.this.RemoteActionCompatParcelizer();
            LinearLayoutManager linearLayoutManager = getValueObject.this.read;
            if (linearLayoutManager == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                linearLayoutManager = null;
            }
            pearlListViewModelRemoteActionCompatParcelizer.read(new getEventKey.RatingCompat(linearLayoutManager.MediaBrowserCompatCustomActionResultReceiver()));
            getResult getresult3 = getValueObject.this.write;
            if (getresult3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                getresult2 = getresult3;
            }
            getresult2.RatingCompat.write((TabLayout.AudioAttributesCompatParcelizer) getValueObject.this.AudioAttributesImplBaseParcelizer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(int p0, boolean p1) {
        getResult getresult = this.write;
        getResult getresult2 = null;
        if (getresult == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getresult = null;
        }
        RecyclerView.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizerAudioAttributesCompatParcelizer = getresult.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(audioAttributesImplBaseParcelizerAudioAttributesCompatParcelizer, "");
        int iIconCompatParcelizer = 0;
        if ((audioAttributesImplBaseParcelizerAudioAttributesCompatParcelizer instanceof lambdareportVideoFrameProcessingOffset4comgoogleandroidexoplayer2videoVideoRendererEventListenerEventDispatcher) && !p1) {
            iIconCompatParcelizer = ((lambdareportVideoFrameProcessingOffset4comgoogleandroidexoplayer2videoVideoRendererEventListenerEventDispatcher) audioAttributesImplBaseParcelizerAudioAttributesCompatParcelizer).IconCompatParcelizer();
        }
        if (p0 >= 0) {
            getResult getresult3 = this.write;
            if (getresult3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                getresult2 = getresult3;
            }
            RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer = getresult2.AudioAttributesImplApi26Parcelizer.AudioAttributesImplApi21Parcelizer();
            toMagicModuleMetaRepoModel.read(mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer, "");
            ((LinearLayoutManager) mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer).read(p0, iIconCompatParcelizer);
        }
    }

    private final void AudioAttributesImplBaseParcelizer() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            getResult getresult = this.write;
            if (getresult == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                getresult = null;
            }
            RecyclerView recyclerView = getresult.AudioAttributesImplApi26Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
            PlayerControlViewExternalSyntheticLambda1.IconCompatParcelizer(contextRequireContext, recyclerView);
        }
    }

    /* JADX INFO: renamed from: o.getValueObject$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/getValueObject$IconCompatParcelizer;", "", "<init>", "()V", "Lo/WakeLockEvent;", "p0", "Landroidx/fragment/app/Fragment;", "RemoteActionCompatParcelizer", "(Lo/WakeLockEvent;)Landroidx/fragment/app/Fragment;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Fragment RemoteActionCompatParcelizer(WakeLockEvent p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            getValueObject getvalueobject = new getValueObject();
            getvalueobject.setArguments(p0.RemoteActionCompatParcelizer());
            return getvalueobject;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(List<? extends registerDeadlineEvent> p0, String p1) {
        Iterator<? extends registerDeadlineEvent> it = p0.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            registerDeadlineEvent next = it.next();
            if ((next instanceof registerDeadlineEvent.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ((registerDeadlineEvent.RemoteActionCompatParcelizer) next).read(), (Object) p1)) {
                break;
            } else {
                i++;
            }
        }
        RemoteActionCompatParcelizer(i, false);
    }
}
