package kotlin;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.util.DeviceProperties;
import com.marrow.R;
import com.marrow.kt.ui.activities.sync.SyncingActivity;
import com.marrow2.data.user.remote.model.onboarding.UserBasicDetails;
import com.marrow2.ui.onboarding.phone.multiaccounts.PhoneAccountSelectionViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.ActivityLifecycleObserver;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin.getAutofillClient;
import kotlin.shouldEscapeCharacter;
import kotlin.writeIBinder;
import kotlin.writeIBinderArray;
import kotlin.writeLongArray;
import kotlin.writePendingIntent;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u000f\u0010\u001a\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u0013R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u001b\u0010\u0017\u001a\u00020\u001d8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u0017\u0010\u001fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010!R\u0014\u0010#\u001a\u00020 8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\"R\u0016\u0010\u0019\u001a\u00020$8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b#\u0010%"}, d2 = {"Lo/writeLongArray;", "Landroidx/fragment/app/Fragment;", "", "Lcom/marrow2/data/user/remote/model/onboarding/UserBasicDetails;", "p0", "<init>", "(Ljava/util/List;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "read", "()V", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi26Parcelizer", "", "RemoteActionCompatParcelizer", "(Ljava/lang/String;)V", "write", "MediaBrowserCompatCustomActionResultReceiver", "Ljava/util/List;", "AudioAttributesCompatParcelizer", "Lcom/marrow2/ui/onboarding/phone/multiaccounts/PhoneAccountSelectionViewModel;", "Lo/RenewEligible;", "()Lcom/marrow2/ui/onboarding/phone/multiaccounts/PhoneAccountSelectionViewModel;", "Lo/isSnapshotValid;", "Lo/isSnapshotValid;", "()Lo/isSnapshotValid;", "IconCompatParcelizer", "Lo/writePendingIntent;", "Lo/writePendingIntent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class writeLongArray extends writeIntegerObject {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private writePendingIntent write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final List<UserBasicDetails> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private isSnapshotValid read;

    public writeLongArray(List<UserBasicDetails> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.AudioAttributesCompatParcelizer = list;
        writeLongArray writelongarray = this;
        this.RemoteActionCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(PhoneAccountSelectionViewModel.class), new AnonymousClass4(writelongarray), new AnonymousClass2(writelongarray), new AnonymousClass1(writelongarray));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PhoneAccountSelectionViewModel RemoteActionCompatParcelizer() {
        return (PhoneAccountSelectionViewModel) this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    private final isSnapshotValid AudioAttributesCompatParcelizer() {
        isSnapshotValid issnapshotvalid = this.read;
        toMagicModuleMetaRepoModel.write(issnapshotvalid);
        return issnapshotvalid;
    }

    /* JADX INFO: renamed from: o.writeLongArray$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lo/writeLongArray$RemoteActionCompatParcelizer;", "", "<init>", "()V", "", "Lcom/marrow2/data/user/remote/model/onboarding/UserBasicDetails;", "p0", "", "p1", "p2", "p3", "Lo/writeLongArray;", "AudioAttributesCompatParcelizer", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo/writeLongArray;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static writeLongArray AudioAttributesCompatParcelizer(List<UserBasicDetails> p0, String p1, String p2, String p3) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            toMagicModuleMetaRepoModel.write(p3, "");
            writeLongArray writelongarray = new writeLongArray(p0);
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("multiple_account_list", new ArrayList<>(p0));
            bundle.putString("intermediate_token", p1);
            bundle.putString("country_code", p2);
            bundle.putString("phone_number", p3);
            writelongarray.setArguments(bundle);
            return writelongarray;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.read = isSnapshotValid.read(p0, p1);
        ConstraintLayout constraintLayoutIconCompatParcelizer = AudioAttributesCompatParcelizer().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer, "");
        return constraintLayoutIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        read();
        MediaBrowserCompatCustomActionResultReceiver();
        write();
        AudioAttributesImplApi26Parcelizer();
        AudioAttributesImplBaseParcelizer();
    }

    private final void read() {
        Toolbar toolbar = AudioAttributesCompatParcelizer().read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(toolbar, "");
        getHttpMethodString.read((View) toolbar, true, false, true, true, 0, 50);
        LinearLayout linearLayout = AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        getHttpMethodString.read((View) linearLayout, false, true, true, true, 0, 49);
    }

    private final void AudioAttributesImplBaseParcelizer() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            LinearLayout linearLayout = AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext, linearLayout);
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
                setUpdatedStatus<writeFloatObject> setupdatedstatus = writeLongArray.this.RemoteActionCompatParcelizer().read();
                final writeLongArray writelongarray = writeLongArray.this;
                this.write = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.writeLongArray.write.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((writeFloatObject) obj2);
                    }

                    private Object write(writeFloatObject writefloatobject) {
                        writePendingIntent writependingintent = writelongarray.write;
                        if (writependingintent == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            writependingintent = null;
                        }
                        writependingintent.IconCompatParcelizer(writefloatobject.write());
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
            return writeLongArray.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        writeLongArray writelongarray = this;
        setBitrateKbps.read(writelongarray, new write(null));
        setBitrateKbps.read(writelongarray, new AudioAttributesCompatParcelizer(null));
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        /* JADX INFO: renamed from: o.writeLongArray$AudioAttributesCompatParcelizer$3, reason: invalid class name */
        static final class AnonymousClass3<T> implements getValidationToken {
            private /* synthetic */ writeLongArray RemoteActionCompatParcelizer;

            @Override // kotlin.getValidationToken
            public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj, SampleVideos sampleVideos) {
                return IconCompatParcelizer((writeIBinderArray) obj);
            }

            private Object IconCompatParcelizer(final writeIBinderArray writeibinderarray) {
                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(writeibinderarray, writeIBinderArray.read.INSTANCE)) {
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(writeibinderarray, writeIBinderArray.AudioAttributesCompatParcelizer.INSTANCE)) {
                        maybeGetTypeVariable activity = this.RemoteActionCompatParcelizer.getActivity();
                        if (activity != null) {
                            activity.finish();
                        }
                    } else if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(writeibinderarray, writeIBinderArray.RemoteActionCompatParcelizer.INSTANCE)) {
                        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(writeibinderarray, writeIBinderArray.IconCompatParcelizer.INSTANCE)) {
                            writeLongArray writelongarray = this.RemoteActionCompatParcelizer;
                            SyncingActivity.Companion companion = SyncingActivity.INSTANCE;
                            Context contextRequireContext = this.RemoteActionCompatParcelizer.requireContext();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                            writelongarray.startActivityForResult(SyncingActivity.Companion.RemoteActionCompatParcelizer(contextRequireContext), 1002);
                            maybeGetTypeVariable activity2 = this.RemoteActionCompatParcelizer.getActivity();
                            if (activity2 != null) {
                                activity2.finish();
                            }
                        } else if (writeibinderarray instanceof writeIBinderArray.write) {
                            writeLongArray writelongarray2 = this.RemoteActionCompatParcelizer;
                            ActivityLifecycleObserver.Companion companion2 = ActivityLifecycleObserver.INSTANCE;
                            Context contextRequireContext2 = this.RemoteActionCompatParcelizer.requireContext();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
                            writelongarray2.startActivity(ActivityLifecycleObserver.Companion.RemoteActionCompatParcelizer(contextRequireContext2, ((writeIBinderArray.write) writeibinderarray).AudioAttributesCompatParcelizer()));
                            this.RemoteActionCompatParcelizer.requireActivity().finish();
                        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(writeibinderarray, writeIBinderArray.AudioAttributesImplApi21Parcelizer.INSTANCE)) {
                            writeLongArray writelongarray3 = this.RemoteActionCompatParcelizer;
                            writeLongArray writelongarray4 = writelongarray3;
                            String string = writelongarray3.getString(R.string.app_error_no_internet);
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                            CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(writelongarray4, string, 0);
                        } else if (writeibinderarray instanceof writeIBinderArray.AudioAttributesImplBaseParcelizer) {
                            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(((writeIBinderArray.AudioAttributesImplBaseParcelizer) writeibinderarray).AudioAttributesCompatParcelizer());
                        } else {
                            if (!(writeibinderarray instanceof writeIBinderArray.MediaBrowserCompatCustomActionResultReceiver)) {
                                throw new RenewEligibleCreator();
                            }
                            Handler handler = new Handler(Looper.getMainLooper());
                            final writeLongArray writelongarray5 = this.RemoteActionCompatParcelizer;
                            handler.postDelayed(new Runnable() { // from class: o.writeParcelable
                                @Override // java.lang.Runnable
                                public final void run() {
                                    writeLongArray.AudioAttributesCompatParcelizer.AnonymousClass3.read(writelongarray5, writeibinderarray);
                                }
                            }, 500L);
                        }
                    }
                }
                this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer().write(writeIBinder.write.INSTANCE);
                return getShowPopup.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void read(writeLongArray writelongarray, writeIBinderArray writeibinderarray) {
                if (writelongarray.isVisible()) {
                    CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(writelongarray, ((writeIBinderArray.MediaBrowserCompatCustomActionResultReceiver) writeibinderarray).RemoteActionCompatParcelizer(), 0);
                }
            }

            AnonymousClass3(writeLongArray writelongarray) {
                this.RemoteActionCompatParcelizer = writelongarray;
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                if (writeLongArray.this.RemoteActionCompatParcelizer().IconCompatParcelizer().write(new AnonymousClass3(writeLongArray.this), this) == objIconCompatParcelizer) {
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
            return writeLongArray.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(String p0) {
        getAutofillClient.Companion companion = getAutofillClient.INSTANCE;
        String string = getString(R.string.text_account_removal_warning_title, p0);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String string2 = getString(R.string.text_account_removal_warning_desc);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        String string3 = getString(R.string.yes_proceed);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
        String string4 = getString(R.string.btn_cancel);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string4, "");
        getAutofillClient getautofillclientAudioAttributesCompatParcelizer = getAutofillClient.Companion.AudioAttributesCompatParcelizer(string, string2, string3, string4, 0, null, false, false, null, 496);
        FragmentManager childFragmentManager = getChildFragmentManager();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childFragmentManager, "");
        getBrowserClient.write(getautofillclientAudioAttributesCompatParcelizer, childFragmentManager, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.writeLongObject
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return writeLongArray.AudioAttributesImplApi26Parcelizer(this.RemoteActionCompatParcelizer);
            }
        }, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.writeLong
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return writeLongArray.MediaBrowserCompatItemReceiver(this.RemoteActionCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi26Parcelizer(writeLongArray writelongarray) {
        writelongarray.RemoteActionCompatParcelizer().write(writeIBinder.RemoteActionCompatParcelizer.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: renamed from: o.writeLongArray$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "read", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return this.$write.requireActivity().getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Fragment fragment) {
            super(0);
            this.$write = fragment;
        }
    }

    /* JADX INFO: renamed from: o.writeLongArray$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "write", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ Fragment $IconCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $write = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            return this.$IconCompatParcelizer.requireActivity().getDefaultViewModelCreationExtras();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment) {
            super(0);
            this.$IconCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatItemReceiver(writeLongArray writelongarray) {
        writelongarray.RemoteActionCompatParcelizer().write(writeIBinder.AudioAttributesCompatParcelizer.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: renamed from: o.writeLongArray$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "read", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            return this.$AudioAttributesCompatParcelizer.requireActivity().getDefaultViewModelProviderFactory();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Fragment fragment) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
        }
    }

    private final void write() {
        RemoteActionCompatParcelizer().write(new writeIBinder.MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesCompatParcelizer));
        AudioAttributesCompatParcelizer().read.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.writeParcelSparseArray
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                writeLongArray.AudioAttributesImplApi21Parcelizer(this.IconCompatParcelizer);
            }
        });
        TextView textView = AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        bytesRead.IconCompatParcelizer(textView, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.writeParcelList
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return writeLongArray.AudioAttributesImplBaseParcelizer(this.IconCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesImplApi21Parcelizer(writeLongArray writelongarray) {
        maybeGetTypeVariable activity = writelongarray.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplBaseParcelizer(writeLongArray writelongarray) {
        writelongarray.RemoteActionCompatParcelizer().write(writeIBinder.IconCompatParcelizer.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        List listRemoteActionCompatParcelizer;
        ArrayList parcelableArrayList;
        shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
        shouldEscapeCharacter.Companion.IconCompatParcelizer(AudioAttributesCompatParcelizer().write);
        Bundle arguments = getArguments();
        writePendingIntent writependingintent = null;
        String string = arguments != null ? arguments.getString("country_code") : null;
        if (string == null) {
            string = "";
        }
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("phone_number") : null;
        if (string2 == null) {
            string2 = "";
        }
        Bundle arguments3 = getArguments();
        String string3 = arguments3 != null ? arguments3.getString("intermediate_token") : null;
        if (string3 == null) {
            string3 = "";
        }
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (parcelableArrayList = arguments4.getParcelableArrayList("multiple_account_list")) == null || (listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.onPlay(parcelableArrayList)) == null) {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        RemoteActionCompatParcelizer().write(new writeIBinder.AudioAttributesImplApi21Parcelizer(string, string2, string3, listRemoteActionCompatParcelizer));
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        this.write = new writePendingIntent(contextRequireContext, new read());
        RecyclerView recyclerView = AudioAttributesCompatParcelizer().write;
        writePendingIntent writependingintent2 = this.write;
        if (writependingintent2 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            writependingintent = writependingintent2;
        }
        recyclerView.setAdapter(writependingintent);
        RecyclerView recyclerView2 = AudioAttributesCompatParcelizer().write;
        requireContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView3 = AudioAttributesCompatParcelizer().write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView3, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(recyclerView3);
    }

    public static final class read implements writePendingIntent.RemoteActionCompatParcelizer {
        read() {
        }

        @Override // o.writePendingIntent.RemoteActionCompatParcelizer
        public final void RemoteActionCompatParcelizer(int i) {
            writeLongArray.this.RemoteActionCompatParcelizer().write(new writeIBinder.read(i));
        }
    }
}
