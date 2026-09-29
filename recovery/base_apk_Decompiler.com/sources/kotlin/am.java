package kotlin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.material.tabs.TabLayout;
import com.marrow.R;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import com.marrow.ui.activities.learn.video.LessonVideoActivity;
import com.marrow.ui.activities.plan.PlanActivity;
import com.marrow2.ui.qbank.lesson_list.model.SealedLessonDetailsModel;
import com.marrow2.ui.video.lesson_list.VideoLessonListViewModel;
import com.marrow2.ui.video.lesson_list.adapter.ClickedLessonDetails;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Cea708Decoder;
import kotlin.Metadata;
import kotlin.Recaptcha;
import kotlin.VisibilityChecker;
import kotlin._init_lambda4;
import kotlin.getAutofillClient;
import kotlin.getClientBWLJW6A;
import kotlin.getSubMeshCount;
import kotlin.isTrafficRestricted;
import kotlin.setExpandedHintEnabled;
import kotlin.setThumbRadius;
import kotlin.setTokenBinding;
import kotlin.setVerdictOptOut;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0001%B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0004J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0004J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u0004J-\u0010!\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00152\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\n\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J/\u0010%\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020#H\u0002¢\u0006\u0004\b\u001a\u0010&J\u000f\u0010'\u001a\u00020\u000eH\u0002¢\u0006\u0004\b'\u0010\u0004J\u000f\u0010(\u001a\u00020\u000eH\u0002¢\u0006\u0004\b(\u0010\u0004J\u000f\u0010)\u001a\u00020\u000eH\u0002¢\u0006\u0004\b)\u0010\u0004J\u000f\u0010*\u001a\u00020\u000eH\u0002¢\u0006\u0004\b*\u0010\u0004J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020+H\u0016¢\u0006\u0004\b\u001a\u0010,J\u000f\u0010%\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010\u0004J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020+H\u0016¢\u0006\u0004\b\u0016\u0010,J\u000f\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010-\u001a\u00020\u000eH\u0016¢\u0006\u0004\b-\u0010\u0004J\u000f\u0010.\u001a\u00020\u000eH\u0016¢\u0006\u0004\b.\u0010\u0004J\u000f\u0010/\u001a\u00020\u000eH\u0016¢\u0006\u0004\b/\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u0004R\u0016\u0010-\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u00101R\u001b\u0010\u0016\u001a\u0002028CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\b4\u00105R\u0014\u0010!\u001a\u0002068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u00107R\u0014\u0010\u001a\u001a\u0002088\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u00109R\u001e\u0010%\u001a\f\u0012\b\u0012\u0006*\u00020;0;0:8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010<R\u0014\u0010.\u001a\u00020=8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010>R\u0014\u0010/\u001a\u00020?8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010@R\u0014\u0010)\u001a\u00020A8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010B"}, d2 = {"Lo/am;", "Landroidx/fragment/app/Fragment;", "Lo/bk;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi26Parcelizer", "onCommand", "onAddQueueItem", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;)V", "RatingCompat", "Lo/getClientBWLJW6A$MediaDescriptionCompat;", "write", "(Lo/getClientBWLJW6A$MediaDescriptionCompat;)V", "onDestroyView", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "", "Lcom/marrow2/ui/qbank/lesson_list/model/SealedLessonDetailsModel$Lesson;", "", "IconCompatParcelizer", "(Ljava/lang/String;Ljava/util/List;Z)V", "", "p3", "RemoteActionCompatParcelizer", "(I)Ljava/lang/String;", "MediaMetadataCompat", "MediaDescriptionCompat", "MediaBrowserCompatItemReceiver", "MediaBrowserCompatSearchResultReceiver", "Lo/isTrafficRestricted$AudioAttributesImplApi26Parcelizer;", "(Lo/isTrafficRestricted$AudioAttributesImplApi26Parcelizer;)V", "read", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi21Parcelizer", "Lo/deriveAudioFormat;", "Lo/deriveAudioFormat;", "Lcom/marrow2/ui/video/lesson_list/VideoLessonListViewModel;", "Lo/RenewEligible;", "MediaBrowserCompatMediaItem", "()Lcom/marrow2/ui/video/lesson_list/VideoLessonListViewModel;", "Lo/bp;", "Lo/bp;", "Lo/onBindingDied;", "Lo/onBindingDied;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;", "Landroid/content/Intent;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;", "Lo/Cea708Decoder;", "Lo/Cea708Decoder;", "Lo/am$IconCompatParcelizer;", "Lo/am$IconCompatParcelizer;", "Lo/am$AudioAttributesCompatParcelizer;", "Lo/am$AudioAttributesCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class am extends ae implements bk {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final onBindingDied write;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final RenewEligible AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final bp IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Cea708Decoder MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> RemoteActionCompatParcelizer;
    private final AudioAttributesCompatParcelizer MediaBrowserCompatItemReceiver;
    private deriveAudioFormat read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final IconCompatParcelizer AudioAttributesImplApi21Parcelizer;

    public am() {
        am amVar = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass4(new AnonymousClass1(amVar)));
        this.AudioAttributesCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(VideoLessonListViewModel.class), new AnonymousClass2(renewEligibleWrite), new AnonymousClass5(renewEligibleWrite), new AnonymousClass3(amVar, renewEligibleWrite));
        this.IconCompatParcelizer = new bp(this, new getCreatedOnDateMs() { // from class: o.aw
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Boolean.valueOf(am.RatingCompat(this.RemoteActionCompatParcelizer));
            }
        });
        this.write = new onBindingDied(new getAnswerMap() { // from class: o.ay
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return am.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, (registerEvent) obj);
            }
        });
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult = registerForActivityResult(new _init_lambda4.AudioAttributesImplApi26Parcelizer(), new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() { // from class: o.ba
            @Override // kotlin.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
            public final void IconCompatParcelizer(Object obj) {
                am.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, (ActivityResult) obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult, "");
        this.RemoteActionCompatParcelizer = r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult;
        this.MediaBrowserCompatCustomActionResultReceiver = new Cea708Decoder(new write());
        this.AudioAttributesImplApi21Parcelizer = new IconCompatParcelizer();
        this.MediaBrowserCompatItemReceiver = new AudioAttributesCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VideoLessonListViewModel MediaBrowserCompatMediaItem() {
        return (VideoLessonListViewModel) this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RatingCompat(am amVar) throws Throwable {
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1200052891);
        if (objRemoteActionCompatParcelizer == null) {
            objRemoteActionCompatParcelizer = startForeground.read((char) (5289 - (ViewConfiguration.getTouchSlop() >> 8)), 19328 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 21 - ((Process.getThreadPriority(0) + 20) >> 6), 969842190, false, "INSTANCE", null);
        }
        Object obj = ((Field) objRemoteActionCompatParcelizer).get(null);
        Context contextRequireContext = amVar.requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        try {
            Object[] objArr = {contextRequireContext};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-920095149);
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) (Process.getGidForName("") + 5290), 19328 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (Process.myTid() >> 22) + 21, -1218334010, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class});
            }
            return ((Boolean) ((Method) objRemoteActionCompatParcelizer2).invoke(obj, objArr)).booleanValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(am amVar, registerEvent registerevent) {
        toMagicModuleMetaRepoModel.write(registerevent, "");
        amVar.AudioAttributesCompatParcelizer(registerevent.read());
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(am amVar, ActivityResult activityResult) {
        toMagicModuleMetaRepoModel.write(activityResult, "");
        amVar.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer(Recaptcha.RatingCompat.INSTANCE);
    }

    public static final class write implements Cea708Decoder.IconCompatParcelizer {
        write() {
        }

        @Override // o.Cea708Decoder.IconCompatParcelizer
        public final void write(String str, int i, String str2) {
            if (str != null) {
                am.this.IconCompatParcelizer.write(new Pair<>(str, Integer.valueOf(i)));
            }
        }
    }

    public static final class IconCompatParcelizer extends setColorSpan {
        IconCompatParcelizer() {
        }

        @Override // kotlin.setColorSpan
        public final void AudioAttributesCompatParcelizer(String str, String str2) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            am.this.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer(new Recaptcha.MediaDescriptionCompat(str2, str));
        }

        @Override // kotlin.setColorSpan, android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    /* JADX INFO: renamed from: o.am$1, reason: invalid class name */
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

    /* JADX INFO: renamed from: o.am$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "write", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$IconCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$IconCompatParcelizer = getcreatedondatems;
        }
    }

    public static final class AudioAttributesCompatParcelizer extends setItalicSpan {
        AudioAttributesCompatParcelizer() {
        }

        @Override // kotlin.setItalicSpan
        public final void IconCompatParcelizer(int i, String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            am.this.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer(new Recaptcha.MediaMetadataCompat(i, str));
        }

        @Override // kotlin.setItalicSpan, android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    /* JADX INFO: renamed from: o.am$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "read", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$write).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(RenewEligible renewEligible) {
            super(0);
            this.$write = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.am$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "IconCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $IconCompatParcelizer = null;
        private /* synthetic */ RenewEligible $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$RemoteActionCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(RenewEligible renewEligible) {
            super(0);
            this.$RemoteActionCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.am$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "write", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;
        private /* synthetic */ Fragment $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$RemoteActionCompatParcelizer.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$RemoteActionCompatParcelizer = fragment;
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        deriveAudioFormat deriveaudioformatAudioAttributesCompatParcelizer = deriveAudioFormat.AudioAttributesCompatParcelizer(p0, p1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(deriveaudioformatAudioAttributesCompatParcelizer, "");
        this.read = deriveaudioformatAudioAttributesCompatParcelizer;
        if (deriveaudioformatAudioAttributesCompatParcelizer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            deriveaudioformatAudioAttributesCompatParcelizer = null;
        }
        ConstraintLayout constraintLayoutIconCompatParcelizer = deriveaudioformatAudioAttributesCompatParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer, "");
        return constraintLayoutIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        AudioAttributesImplApi26Parcelizer();
        AudioAttributesImplBaseParcelizer();
        MediaDescriptionCompat();
        MediaMetadataCompat();
        RatingCompat();
        onAddQueueItem();
        onCommand();
    }

    private final void AudioAttributesImplBaseParcelizer() {
        getChildFragmentManager().IconCompatParcelizer(SmsRetrieverStatusCodes.RemoteActionCompatParcelizer.getWrite(), getViewLifecycleOwner(), new _addFields() { // from class: o.an
            @Override // kotlin._addFields
            public final void AudioAttributesCompatParcelizer(String str, Bundle bundle) {
                am.RemoteActionCompatParcelizer(this.write, str, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(am amVar, String str, Bundle bundle) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        if (bundle.getBoolean("positive_key_press")) {
            amVar.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer(Recaptcha.MediaBrowserCompatMediaItem.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        deriveAudioFormat deriveaudioformat = this.read;
        deriveAudioFormat deriveaudioformat2 = null;
        if (deriveaudioformat == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            deriveaudioformat = null;
        }
        ConstraintLayout constraintLayout = deriveaudioformat.MediaMetadataCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        getHttpMethodString.read((View) constraintLayout, true, false, true, true, 0, 50);
        deriveAudioFormat deriveaudioformat3 = this.read;
        if (deriveaudioformat3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            deriveaudioformat3 = null;
        }
        TabLayout tabLayout = deriveaudioformat3.MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(tabLayout, "");
        getHttpMethodString.read((View) tabLayout, false, false, true, true, 0, 51);
        deriveAudioFormat deriveaudioformat4 = this.read;
        if (deriveaudioformat4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            deriveaudioformat4 = null;
        }
        RecyclerView recyclerView = deriveaudioformat4.AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
        getHttpMethodString.RemoteActionCompatParcelizer(recyclerView, false, false, false, true, 0, 55);
        deriveAudioFormat deriveaudioformat5 = this.read;
        if (deriveaudioformat5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            deriveaudioformat5 = null;
        }
        LinearLayout linearLayout = deriveaudioformat5.AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        getHttpMethodString.read((View) linearLayout, false, false, true, true, 0, 51);
        deriveAudioFormat deriveaudioformat6 = this.read;
        if (deriveaudioformat6 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            deriveaudioformat2 = deriveaudioformat6;
        }
        RecyclerView recyclerView2 = deriveaudioformat2.MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView2, "");
        getHttpMethodString.RemoteActionCompatParcelizer(recyclerView2, false, true, true, true, 0, 49);
    }

    private final void onCommand() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            deriveAudioFormat deriveaudioformat = this.read;
            deriveAudioFormat deriveaudioformat2 = null;
            if (deriveaudioformat == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                deriveaudioformat = null;
            }
            LinearLayout linearLayout = deriveaudioformat.AudioAttributesImplApi26Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            bytesRead.write(contextRequireContext, linearLayout);
            Context contextRequireContext2 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
            int i = PlayerControlViewExternalSyntheticLambda1.read(contextRequireContext2);
            deriveAudioFormat deriveaudioformat3 = this.read;
            if (deriveaudioformat3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                deriveaudioformat3 = null;
            }
            RecyclerView recyclerView = deriveaudioformat3.MediaBrowserCompatItemReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
            RecyclerView recyclerView2 = recyclerView;
            recyclerView2.setPadding(i, recyclerView2.getPaddingTop(), i, recyclerView2.getPaddingBottom());
            deriveAudioFormat deriveaudioformat4 = this.read;
            if (deriveaudioformat4 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                deriveaudioformat4 = null;
            }
            deriveaudioformat4.MediaBrowserCompatItemReceiver.setClipToPadding(false);
            Context contextRequireContext3 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext3, "");
            deriveAudioFormat deriveaudioformat5 = this.read;
            if (deriveaudioformat5 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                deriveaudioformat2 = deriveaudioformat5;
            }
            Group group = deriveaudioformat2.read;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(group, "");
            bytesRead.IconCompatParcelizer(contextRequireContext3, group);
        }
    }

    private final void onAddQueueItem() {
        getProvider getprovider = getProvider.getInstance(requireContext());
        IconCompatParcelizer iconCompatParcelizer = this.AudioAttributesImplApi21Parcelizer;
        getprovider.registerReceiver(iconCompatParcelizer, iconCompatParcelizer.AudioAttributesCompatParcelizer());
        getProvider getprovider2 = getProvider.getInstance(requireContext());
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.MediaBrowserCompatItemReceiver;
        getprovider2.registerReceiver(audioAttributesCompatParcelizer, audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer());
        getProvider getprovider3 = getProvider.getInstance(requireContext());
        Cea708Decoder cea708Decoder = this.MediaBrowserCompatCustomActionResultReceiver;
        getprovider3.registerReceiver(cea708Decoder, cea708Decoder.AudioAttributesCompatParcelizer());
    }

    private final void AudioAttributesCompatParcelizer(String p0) {
        deriveAudioFormat deriveaudioformat = this.read;
        deriveAudioFormat deriveaudioformat2 = null;
        if (deriveaudioformat == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            deriveaudioformat = null;
        }
        Group group = deriveaudioformat.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(group, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(group);
        MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer(Recaptcha.AudioAttributesImplBaseParcelizer.INSTANCE);
        int i = this.IconCompatParcelizer.read(p0);
        deriveAudioFormat deriveaudioformat3 = this.read;
        if (deriveaudioformat3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            deriveaudioformat2 = deriveaudioformat3;
        }
        RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer = deriveaudioformat2.MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer();
        toMagicModuleMetaRepoModel.read(mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer, "");
        ((LinearLayoutManager) mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer).read(i, 0);
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<getClientBWLJW6A> setupdatedstatusAudioAttributesImplBaseParcelizer = am.this.MediaBrowserCompatMediaItem().AudioAttributesImplBaseParcelizer();
                final am amVar = am.this;
                this.write = 1;
                if (setupdatedstatusAudioAttributesImplBaseParcelizer.write(new getValidationToken() { // from class: o.am.read.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((getClientBWLJW6A) obj2);
                    }

                    private Object read(getClientBWLJW6A getclientbwljw6a) {
                        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getclientbwljw6a, getClientBWLJW6A.AudioAttributesImplBaseParcelizer.INSTANCE)) {
                            Toast.makeText(amVar.requireContext(), amVar.getString(R.string.text_lesson_coming_soon), 1).show();
                            amVar.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer(Recaptcha.AudioAttributesCompatParcelizer.INSTANCE);
                        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getclientbwljw6a, getClientBWLJW6A.MediaBrowserCompatCustomActionResultReceiver.INSTANCE)) {
                            Toast.makeText(amVar.requireContext(), amVar.getString(R.string.text_lesson_coming_soon_short), 1).show();
                            amVar.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer(Recaptcha.AudioAttributesCompatParcelizer.INSTANCE);
                        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getclientbwljw6a, getClientBWLJW6A.MediaBrowserCompatSearchResultReceiver.INSTANCE)) {
                            Toast.makeText(amVar.requireContext(), amVar.getString(R.string.error_subject_not_found), 1).show();
                            amVar.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer(Recaptcha.AudioAttributesCompatParcelizer.INSTANCE);
                            amVar.requireActivity().finish();
                        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getclientbwljw6a, getClientBWLJW6A.AudioAttributesImplApi26Parcelizer.INSTANCE)) {
                            getAutofillClient.Companion companion = getAutofillClient.INSTANCE;
                            String string = amVar.getString(R.string.video_for_paid_user);
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                            String string2 = amVar.getString(R.string.view_plans);
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
                            String string3 = amVar.getString(R.string.go_back);
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
                            getAutofillClient.Companion.AudioAttributesCompatParcelizer(null, string, string2, string3, 0, SmsRetrieverStatusCodes.RemoteActionCompatParcelizer, false, false, null, 465).show(amVar.getChildFragmentManager(), (String) null);
                            amVar.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer(Recaptcha.AudioAttributesCompatParcelizer.INSTANCE);
                        } else if (getclientbwljw6a instanceof getClientBWLJW6A.AudioAttributesImplApi21Parcelizer) {
                            am amVar2 = amVar;
                            LessonVideoActivity.Companion companion2 = LessonVideoActivity.INSTANCE;
                            Context contextRequireContext = amVar.requireContext();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                            amVar2.startActivity(LessonVideoActivity.Companion.AudioAttributesCompatParcelizer(contextRequireContext, ((getClientBWLJW6A.AudioAttributesImplApi21Parcelizer) getclientbwljw6a).AudioAttributesCompatParcelizer(), false, true, true, false));
                            amVar.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer(Recaptcha.AudioAttributesCompatParcelizer.INSTANCE);
                        } else if (getclientbwljw6a instanceof getClientBWLJW6A.RemoteActionCompatParcelizer) {
                            getClientBWLJW6A.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (getClientBWLJW6A.RemoteActionCompatParcelizer) getclientbwljw6a;
                            amVar.IconCompatParcelizer.read(remoteActionCompatParcelizer.RemoteActionCompatParcelizer(), remoteActionCompatParcelizer.AudioAttributesCompatParcelizer());
                        } else if (getclientbwljw6a instanceof getClientBWLJW6A.IconCompatParcelizer) {
                            getClientBWLJW6A.IconCompatParcelizer iconCompatParcelizer = (getClientBWLJW6A.IconCompatParcelizer) getclientbwljw6a;
                            amVar.IconCompatParcelizer(iconCompatParcelizer.RemoteActionCompatParcelizer(), iconCompatParcelizer.IconCompatParcelizer(), iconCompatParcelizer.write());
                        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getclientbwljw6a, getClientBWLJW6A.read.INSTANCE)) {
                            r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 r8lambdaibk6u1hk7j3awkl_wn934v2uvi8 = amVar.RemoteActionCompatParcelizer;
                            setThumbRadius.Companion companion3 = setThumbRadius.INSTANCE;
                            Context contextRequireContext2 = amVar.requireContext();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
                            r8lambdaibk6u1hk7j3awkl_wn934v2uvi8.read(setThumbRadius.Companion.RemoteActionCompatParcelizer(contextRequireContext2));
                            amVar.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer(Recaptcha.AudioAttributesCompatParcelizer.INSTANCE);
                        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getclientbwljw6a, getClientBWLJW6A.write.INSTANCE)) {
                            am amVar3 = amVar;
                            PlanActivity.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = PlanActivity.RemoteActionCompatParcelizer;
                            Context contextRequireContext3 = amVar.requireContext();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext3, "");
                            String lowerCase = "PRO_VIDEO_ACCESSED".toLowerCase(Locale.ROOT);
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
                            amVar3.startActivity(PlanActivity.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(contextRequireContext3, "Pro Subscription Dialog", lowerCase));
                            amVar.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer(Recaptcha.AudioAttributesCompatParcelizer.INSTANCE);
                        } else if (getclientbwljw6a instanceof getClientBWLJW6A.MediaDescriptionCompat) {
                            amVar.write((getClientBWLJW6A.MediaDescriptionCompat) getclientbwljw6a);
                            amVar.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer(Recaptcha.AudioAttributesCompatParcelizer.INSTANCE);
                        } else if (getclientbwljw6a instanceof getClientBWLJW6A.MediaBrowserCompatItemReceiver) {
                            setExpandedHintEnabled.Companion companion4 = setExpandedHintEnabled.INSTANCE;
                            setExpandedHintEnabled.Companion.AudioAttributesCompatParcelizer(((getClientBWLJW6A.MediaBrowserCompatItemReceiver) getclientbwljw6a).AudioAttributesCompatParcelizer()).show(amVar.getChildFragmentManager(), "announcement_info_dialog");
                            amVar.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer(Recaptcha.AudioAttributesCompatParcelizer.INSTANCE);
                        } else if (!(getclientbwljw6a instanceof getClientBWLJW6A.AudioAttributesCompatParcelizer)) {
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

        read(SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return am.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void RatingCompat() {
        am amVar = this;
        setBitrateKbps.read(amVar, new read(null));
        setBitrateKbps.RemoteActionCompatParcelizer(amVar, new MediaBrowserCompatItemReceiver(null));
        setBitrateKbps.RemoteActionCompatParcelizer(amVar, new AudioAttributesImplBaseParcelizer(null));
        setBitrateKbps.read(amVar, new AudioAttributesImplApi26Parcelizer(null));
        setBitrateKbps.read(amVar, new AudioAttributesImplApi21Parcelizer(null));
        setBitrateKbps.read(amVar, new MediaBrowserCompatCustomActionResultReceiver(null));
        setBitrateKbps.read(amVar, new RatingCompat(null));
        MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat();
        onSetRating iconCompatParcelizer = requireActivity().getIconCompatParcelizer();
        hasGetter viewLifecycleOwner = getViewLifecycleOwner();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewLifecycleOwner, "");
        iconCompatParcelizer.AudioAttributesCompatParcelizer(viewLifecycleOwner, mediaDescriptionCompat);
    }

    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<ReviewManagerFactory> setupdatedstatusMediaBrowserCompatCustomActionResultReceiver = am.this.MediaBrowserCompatMediaItem().MediaBrowserCompatCustomActionResultReceiver();
                final am amVar = am.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusMediaBrowserCompatCustomActionResultReceiver.write(new getValidationToken() { // from class: o.am.MediaBrowserCompatItemReceiver.3
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((ReviewManagerFactory) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(ReviewManagerFactory reviewManagerFactory) {
                        if (!reviewManagerFactory.read().isEmpty()) {
                            deriveAudioFormat deriveaudioformat = amVar.read;
                            deriveAudioFormat deriveaudioformat2 = null;
                            if (deriveaudioformat == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                deriveaudioformat = null;
                            }
                            if (deriveaudioformat.MediaBrowserCompatCustomActionResultReceiver.write() == 0) {
                                List<Integer> list = reviewManagerFactory.read();
                                am amVar2 = amVar;
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    int iIntValue = ((Number) it.next()).intValue();
                                    deriveAudioFormat deriveaudioformat3 = amVar2.read;
                                    if (deriveaudioformat3 == null) {
                                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                        deriveaudioformat3 = null;
                                    }
                                    TabLayout tabLayout = deriveaudioformat3.MediaBrowserCompatCustomActionResultReceiver;
                                    deriveAudioFormat deriveaudioformat4 = amVar2.read;
                                    if (deriveaudioformat4 == null) {
                                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                        deriveaudioformat4 = null;
                                    }
                                    tabLayout.AudioAttributesCompatParcelizer(deriveaudioformat4.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi21Parcelizer().write(amVar2.write(iIntValue)), false);
                                }
                            }
                            deriveAudioFormat deriveaudioformat5 = amVar.read;
                            if (deriveaudioformat5 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                deriveaudioformat5 = null;
                            }
                            TabLayout tabLayout2 = deriveaudioformat5.MediaBrowserCompatCustomActionResultReceiver;
                            deriveAudioFormat deriveaudioformat6 = amVar.read;
                            if (deriveaudioformat6 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                deriveaudioformat2 = deriveaudioformat6;
                            }
                            tabLayout2.IconCompatParcelizer(deriveaudioformat2.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(reviewManagerFactory.getWrite()));
                            return getShowPopup.INSTANCE;
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

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return am.this.new MediaBrowserCompatItemReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<C0195r> setupdatedstatusAudioAttributesImplApi26Parcelizer = am.this.MediaBrowserCompatMediaItem().AudioAttributesImplApi26Parcelizer();
                final am amVar = am.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesImplApi26Parcelizer.write(new getValidationToken() { // from class: o.am.AudioAttributesImplBaseParcelizer.4
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((C0195r) obj2);
                    }

                    private Object IconCompatParcelizer(C0195r c0195r) {
                        amVar.IconCompatParcelizer.AudioAttributesCompatParcelizer(c0195r);
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
            return am.this.new AudioAttributesImplBaseParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class AudioAttributesImplApi26Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<getTasksClient> setupdatedstatusMediaBrowserCompatItemReceiver = am.this.MediaBrowserCompatMediaItem().MediaBrowserCompatItemReceiver();
                final am amVar = am.this;
                this.write = 1;
                if (setupdatedstatusMediaBrowserCompatItemReceiver.write(new getValidationToken() { // from class: o.am.AudioAttributesImplApi26Parcelizer.1
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((getTasksClient) obj2);
                    }

                    private Object IconCompatParcelizer(getTasksClient gettasksclient) {
                        deriveAudioFormat deriveaudioformat = null;
                        if (gettasksclient.getAudioAttributesCompatParcelizer()) {
                            deriveAudioFormat deriveaudioformat2 = amVar.read;
                            if (deriveaudioformat2 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                deriveaudioformat = deriveaudioformat2;
                            }
                            LinearLayout linearLayout = deriveaudioformat.AudioAttributesImplApi26Parcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(linearLayout);
                        } else {
                            deriveAudioFormat deriveaudioformat3 = amVar.read;
                            if (deriveaudioformat3 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                deriveaudioformat = deriveaudioformat3;
                            }
                            LinearLayout linearLayout2 = deriveaudioformat.AudioAttributesImplApi26Parcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout2);
                        }
                        if (gettasksclient.getIconCompatParcelizer()) {
                            amVar.requireActivity().finish();
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

        AudioAttributesImplApi26Parcelizer(SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return am.this.new AudioAttributesImplApi26Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<List<registerEvent>> setupdatedstatus = am.this.MediaBrowserCompatMediaItem().read();
                final am amVar = am.this;
                this.write = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.am.AudioAttributesImplApi21Parcelizer.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((List) obj2);
                    }

                    private Object write(List<registerEvent> list) {
                        onBindingDied.write(amVar.write, list, null, 2);
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
            return am.this.new AudioAttributesImplApi21Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<t> setupdatedstatusIconCompatParcelizer = am.this.MediaBrowserCompatMediaItem().IconCompatParcelizer();
                final am amVar = am.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.am.MediaBrowserCompatCustomActionResultReceiver.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((t) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(t tVar) {
                        if (!tVar.getIconCompatParcelizer()) {
                            deriveAudioFormat deriveaudioformat = amVar.read;
                            deriveAudioFormat deriveaudioformat2 = null;
                            if (deriveaudioformat == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                deriveaudioformat = null;
                            }
                            deriveaudioformat.MediaBrowserCompatMediaItem.setText(tVar.getAudioAttributesCompatParcelizer());
                            if (tVar.getRead()) {
                                deriveAudioFormat deriveaudioformat3 = amVar.read;
                                if (deriveaudioformat3 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    deriveaudioformat3 = null;
                                }
                                ProgressBar progressBar = deriveaudioformat3.AudioAttributesImplBaseParcelizer;
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
                                bytesRead.AudioAttributesImplApi21Parcelizer(progressBar);
                                deriveAudioFormat deriveaudioformat4 = amVar.read;
                                if (deriveaudioformat4 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    deriveaudioformat4 = null;
                                }
                                Group group = deriveaudioformat4.read;
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(group, "");
                                bytesRead.MediaBrowserCompatCustomActionResultReceiver(group);
                                View[] viewArr = new View[2];
                                deriveAudioFormat deriveaudioformat5 = amVar.read;
                                if (deriveaudioformat5 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    deriveaudioformat5 = null;
                                }
                                RecyclerView recyclerView = deriveaudioformat5.MediaBrowserCompatItemReceiver;
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
                                viewArr[0] = recyclerView;
                                deriveAudioFormat deriveaudioformat6 = amVar.read;
                                if (deriveaudioformat6 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                } else {
                                    deriveaudioformat2 = deriveaudioformat6;
                                }
                                LinearLayoutCompat linearLayoutCompat = deriveaudioformat2.IconCompatParcelizer;
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutCompat, "");
                                viewArr[1] = linearLayoutCompat;
                                bytesRead.read(viewArr);
                            } else {
                                deriveAudioFormat deriveaudioformat7 = amVar.read;
                                if (deriveaudioformat7 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    deriveaudioformat7 = null;
                                }
                                ProgressBar progressBar2 = deriveaudioformat7.AudioAttributesImplBaseParcelizer;
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar2, "");
                                bytesRead.MediaBrowserCompatCustomActionResultReceiver(progressBar2);
                                if (tVar.getWrite()) {
                                    deriveAudioFormat deriveaudioformat8 = amVar.read;
                                    if (deriveaudioformat8 == null) {
                                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                        deriveaudioformat8 = null;
                                    }
                                    Group group2 = deriveaudioformat8.read;
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(group2, "");
                                    bytesRead.AudioAttributesImplApi21Parcelizer(group2);
                                    am amVar2 = amVar;
                                    String string = amVar2.getString(R.string.f_no_lesson_in_lesson_status_type, amVar2.write(amVar2.MediaBrowserCompatMediaItem().MediaBrowserCompatCustomActionResultReceiver().IconCompatParcelizer().write()), tVar.getAudioAttributesCompatParcelizer());
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                                    deriveAudioFormat deriveaudioformat9 = amVar.read;
                                    if (deriveaudioformat9 == null) {
                                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                        deriveaudioformat9 = null;
                                    }
                                    deriveaudioformat9.MediaBrowserCompatSearchResultReceiver.setText(string);
                                    View[] viewArr2 = new View[1];
                                    deriveAudioFormat deriveaudioformat10 = amVar.read;
                                    if (deriveaudioformat10 == null) {
                                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                        deriveaudioformat10 = null;
                                    }
                                    LinearLayoutCompat linearLayoutCompat2 = deriveaudioformat10.IconCompatParcelizer;
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutCompat2, "");
                                    viewArr2[0] = linearLayoutCompat2;
                                    bytesRead.read(viewArr2);
                                    View[] viewArr3 = new View[2];
                                    deriveAudioFormat deriveaudioformat11 = amVar.read;
                                    if (deriveaudioformat11 == null) {
                                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                        deriveaudioformat11 = null;
                                    }
                                    RecyclerView recyclerView2 = deriveaudioformat11.MediaBrowserCompatItemReceiver;
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView2, "");
                                    viewArr3[0] = recyclerView2;
                                    deriveAudioFormat deriveaudioformat12 = amVar.read;
                                    if (deriveaudioformat12 == null) {
                                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    } else {
                                        deriveaudioformat2 = deriveaudioformat12;
                                    }
                                    TabLayout tabLayout = deriveaudioformat2.MediaBrowserCompatCustomActionResultReceiver;
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(tabLayout, "");
                                    viewArr3[1] = tabLayout;
                                    bytesRead.IconCompatParcelizer(viewArr3);
                                    amVar.IconCompatParcelizer.IconCompatParcelizer(tVar.RemoteActionCompatParcelizer());
                                } else {
                                    deriveAudioFormat deriveaudioformat13 = amVar.read;
                                    if (deriveaudioformat13 == null) {
                                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                        deriveaudioformat13 = null;
                                    }
                                    Group group3 = deriveaudioformat13.read;
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(group3, "");
                                    bytesRead.MediaBrowserCompatCustomActionResultReceiver(group3);
                                    View[] viewArr4 = new View[3];
                                    deriveAudioFormat deriveaudioformat14 = amVar.read;
                                    if (deriveaudioformat14 == null) {
                                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                        deriveaudioformat14 = null;
                                    }
                                    RecyclerView recyclerView3 = deriveaudioformat14.MediaBrowserCompatItemReceiver;
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView3, "");
                                    viewArr4[0] = recyclerView3;
                                    deriveAudioFormat deriveaudioformat15 = amVar.read;
                                    if (deriveaudioformat15 == null) {
                                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                        deriveaudioformat15 = null;
                                    }
                                    LinearLayoutCompat linearLayoutCompat3 = deriveaudioformat15.IconCompatParcelizer;
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutCompat3, "");
                                    viewArr4[1] = linearLayoutCompat3;
                                    deriveAudioFormat deriveaudioformat16 = amVar.read;
                                    if (deriveaudioformat16 == null) {
                                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    } else {
                                        deriveaudioformat2 = deriveaudioformat16;
                                    }
                                    TabLayout tabLayout2 = deriveaudioformat2.MediaBrowserCompatCustomActionResultReceiver;
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(tabLayout2, "");
                                    viewArr4[2] = tabLayout2;
                                    bytesRead.IconCompatParcelizer(viewArr4);
                                    amVar.IconCompatParcelizer.IconCompatParcelizer(tVar.RemoteActionCompatParcelizer());
                                }
                            }
                            return getShowPopup.INSTANCE;
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
            return am.this.new MediaBrowserCompatCustomActionResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class RatingCompat extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<t> setupdatedstatusAudioAttributesCompatParcelizer = am.this.MediaBrowserCompatMediaItem().AudioAttributesCompatParcelizer();
                final am amVar = am.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.am.RatingCompat.4
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((t) obj2);
                    }

                    private Object IconCompatParcelizer(t tVar) {
                        if (tVar.getIconCompatParcelizer()) {
                            deriveAudioFormat deriveaudioformat = amVar.read;
                            deriveAudioFormat deriveaudioformat2 = null;
                            if (deriveaudioformat == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                deriveaudioformat = null;
                            }
                            deriveaudioformat.MediaBrowserCompatMediaItem.setText(tVar.getAudioAttributesCompatParcelizer());
                            if (tVar.getRead()) {
                                deriveAudioFormat deriveaudioformat3 = amVar.read;
                                if (deriveaudioformat3 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    deriveaudioformat3 = null;
                                }
                                ProgressBar progressBar = deriveaudioformat3.AudioAttributesImplBaseParcelizer;
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
                                bytesRead.AudioAttributesImplApi21Parcelizer(progressBar);
                                deriveAudioFormat deriveaudioformat4 = amVar.read;
                                if (deriveaudioformat4 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    deriveaudioformat4 = null;
                                }
                                Group group = deriveaudioformat4.read;
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(group, "");
                                bytesRead.MediaBrowserCompatCustomActionResultReceiver(group);
                                View[] viewArr = new View[6];
                                deriveAudioFormat deriveaudioformat5 = amVar.read;
                                if (deriveaudioformat5 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    deriveaudioformat5 = null;
                                }
                                RecyclerView recyclerView = deriveaudioformat5.MediaBrowserCompatItemReceiver;
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
                                viewArr[0] = recyclerView;
                                deriveAudioFormat deriveaudioformat6 = amVar.read;
                                if (deriveaudioformat6 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    deriveaudioformat6 = null;
                                }
                                LinearLayoutCompat linearLayoutCompat = deriveaudioformat6.IconCompatParcelizer;
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutCompat, "");
                                viewArr[1] = linearLayoutCompat;
                                deriveAudioFormat deriveaudioformat7 = amVar.read;
                                if (deriveaudioformat7 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    deriveaudioformat7 = null;
                                }
                                TabLayout tabLayout = deriveaudioformat7.MediaBrowserCompatCustomActionResultReceiver;
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(tabLayout, "");
                                viewArr[2] = tabLayout;
                                deriveAudioFormat deriveaudioformat8 = amVar.read;
                                if (deriveaudioformat8 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    deriveaudioformat8 = null;
                                }
                                LinearLayoutCompat linearLayoutCompat2 = deriveaudioformat8.IconCompatParcelizer;
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutCompat2, "");
                                viewArr[3] = linearLayoutCompat2;
                                deriveAudioFormat deriveaudioformat9 = amVar.read;
                                if (deriveaudioformat9 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    deriveaudioformat9 = null;
                                }
                                LinearLayout linearLayout = deriveaudioformat9.AudioAttributesImplApi26Parcelizer;
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
                                viewArr[4] = linearLayout;
                                deriveAudioFormat deriveaudioformat10 = amVar.read;
                                if (deriveaudioformat10 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                } else {
                                    deriveaudioformat2 = deriveaudioformat10;
                                }
                                Group group2 = deriveaudioformat2.RemoteActionCompatParcelizer;
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(group2, "");
                                viewArr[5] = group2;
                                bytesRead.read(viewArr);
                            } else {
                                deriveAudioFormat deriveaudioformat11 = amVar.read;
                                if (deriveaudioformat11 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    deriveaudioformat11 = null;
                                }
                                ProgressBar progressBar2 = deriveaudioformat11.AudioAttributesImplBaseParcelizer;
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar2, "");
                                bytesRead.MediaBrowserCompatCustomActionResultReceiver(progressBar2);
                                if (tVar.RemoteActionCompatParcelizer().isEmpty()) {
                                    deriveAudioFormat deriveaudioformat12 = amVar.read;
                                    if (deriveaudioformat12 == null) {
                                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                        deriveaudioformat12 = null;
                                    }
                                    Group group3 = deriveaudioformat12.read;
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(group3, "");
                                    bytesRead.AudioAttributesImplApi21Parcelizer(group3);
                                    deriveAudioFormat deriveaudioformat13 = amVar.read;
                                    if (deriveaudioformat13 == null) {
                                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                        deriveaudioformat13 = null;
                                    }
                                    deriveaudioformat13.MediaBrowserCompatSearchResultReceiver.setText("You don't have any New lessons");
                                    View[] viewArr2 = new View[4];
                                    deriveAudioFormat deriveaudioformat14 = amVar.read;
                                    if (deriveaudioformat14 == null) {
                                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                        deriveaudioformat14 = null;
                                    }
                                    RecyclerView recyclerView2 = deriveaudioformat14.MediaBrowserCompatItemReceiver;
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView2, "");
                                    viewArr2[0] = recyclerView2;
                                    deriveAudioFormat deriveaudioformat15 = amVar.read;
                                    if (deriveaudioformat15 == null) {
                                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                        deriveaudioformat15 = null;
                                    }
                                    TabLayout tabLayout2 = deriveaudioformat15.MediaBrowserCompatCustomActionResultReceiver;
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(tabLayout2, "");
                                    viewArr2[1] = tabLayout2;
                                    deriveAudioFormat deriveaudioformat16 = amVar.read;
                                    if (deriveaudioformat16 == null) {
                                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                        deriveaudioformat16 = null;
                                    }
                                    Group group4 = deriveaudioformat16.RemoteActionCompatParcelizer;
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(group4, "");
                                    viewArr2[2] = group4;
                                    deriveAudioFormat deriveaudioformat17 = amVar.read;
                                    if (deriveaudioformat17 == null) {
                                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    } else {
                                        deriveaudioformat2 = deriveaudioformat17;
                                    }
                                    LinearLayoutCompat linearLayoutCompat3 = deriveaudioformat2.IconCompatParcelizer;
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutCompat3, "");
                                    viewArr2[3] = linearLayoutCompat3;
                                    bytesRead.read(viewArr2);
                                } else {
                                    deriveAudioFormat deriveaudioformat18 = amVar.read;
                                    if (deriveaudioformat18 == null) {
                                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                        deriveaudioformat18 = null;
                                    }
                                    Group group5 = deriveaudioformat18.read;
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(group5, "");
                                    bytesRead.MediaBrowserCompatCustomActionResultReceiver(group5);
                                    deriveAudioFormat deriveaudioformat19 = amVar.read;
                                    if (deriveaudioformat19 == null) {
                                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                        deriveaudioformat19 = null;
                                    }
                                    TabLayout tabLayout3 = deriveaudioformat19.MediaBrowserCompatCustomActionResultReceiver;
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(tabLayout3, "");
                                    bytesRead.MediaBrowserCompatCustomActionResultReceiver(tabLayout3);
                                    View[] viewArr3 = new View[2];
                                    deriveAudioFormat deriveaudioformat20 = amVar.read;
                                    if (deriveaudioformat20 == null) {
                                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                        deriveaudioformat20 = null;
                                    }
                                    Group group6 = deriveaudioformat20.RemoteActionCompatParcelizer;
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(group6, "");
                                    viewArr3[0] = group6;
                                    deriveAudioFormat deriveaudioformat21 = amVar.read;
                                    if (deriveaudioformat21 == null) {
                                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                        deriveaudioformat21 = null;
                                    }
                                    LinearLayoutCompat linearLayoutCompat4 = deriveaudioformat21.IconCompatParcelizer;
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutCompat4, "");
                                    viewArr3[1] = linearLayoutCompat4;
                                    bytesRead.read(viewArr3);
                                    amVar.IconCompatParcelizer.IconCompatParcelizer(tVar.RemoteActionCompatParcelizer());
                                    View[] viewArr4 = new View[1];
                                    deriveAudioFormat deriveaudioformat22 = amVar.read;
                                    if (deriveaudioformat22 == null) {
                                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    } else {
                                        deriveaudioformat2 = deriveaudioformat22;
                                    }
                                    RecyclerView recyclerView3 = deriveaudioformat2.MediaBrowserCompatItemReceiver;
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView3, "");
                                    viewArr4[0] = recyclerView3;
                                    bytesRead.IconCompatParcelizer(viewArr4);
                                }
                            }
                            return getShowPopup.INSTANCE;
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
            return am.this.new RatingCompat(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RatingCompat) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public static final class MediaDescriptionCompat extends onRemoveQueueItemAt {
        MediaDescriptionCompat() {
            super(true);
        }

        @Override // kotlin.onRemoveQueueItemAt
        public final void handleOnBackPressed() {
            am.this.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer(Recaptcha.AudioAttributesImplApi21Parcelizer.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(getClientBWLJW6A.MediaDescriptionCompat p0) {
        getSubMeshCount.Companion companion = getSubMeshCount.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        startActivity(getSubMeshCount.Companion.RemoteActionCompatParcelizer(contextRequireContext, new getCameraMotionListener(p0.IconCompatParcelizer(), true, p0.RemoteActionCompatParcelizer())));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        super.onDestroyView();
    }

    private final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        getProvider.getInstance(requireContext()).IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
        getProvider.getInstance(requireContext()).IconCompatParcelizer(this.MediaBrowserCompatItemReceiver);
        getProvider.getInstance(requireContext()).IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(String p0, List<SealedLessonDetailsModel.Lesson> p1, boolean p2) {
        setVerdictOptOut.Companion companion = setVerdictOptOut.INSTANCE;
        setVerdictOptOut setverdictoptoutAudioAttributesCompatParcelizer = setVerdictOptOut.Companion.AudioAttributesCompatParcelizer(p0, p1, p2);
        setverdictoptoutAudioAttributesCompatParcelizer.setCancelable(true);
        FragmentManager childFragmentManager = getChildFragmentManager();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childFragmentManager, "");
        ak.read(setverdictoptoutAudioAttributesCompatParcelizer, childFragmentManager, (getAnswerMap<? super ClickedLessonDetails, getShowPopup>) new getAnswerMap() { // from class: o.at
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return am.write(this.RemoteActionCompatParcelizer, (ClickedLessonDetails) obj);
            }
        });
        MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer(Recaptcha.AudioAttributesCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(am amVar, ClickedLessonDetails clickedLessonDetails) {
        toMagicModuleMetaRepoModel.write(clickedLessonDetails, "");
        String write2 = clickedLessonDetails.getWrite();
        clickedLessonDetails.getRemoteActionCompatParcelizer();
        amVar.RemoteActionCompatParcelizer(write2);
        return getShowPopup.INSTANCE;
    }

    private final void RemoteActionCompatParcelizer(String str) {
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8 = this.RemoteActionCompatParcelizer;
        setTokenBinding.Companion companion = setTokenBinding.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        r8lambdaibk6u1hk7j3awkl_wn934v2uvi8.read(setTokenBinding.Companion.IconCompatParcelizer(contextRequireContext, str, 3, CourseConfigKeyConstantsKt.KEY_RELATED_MODULE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String write(int r2) {
        /*
            r1 = this;
            r0 = -1
            if (r2 == r0) goto L2e
            if (r2 == 0) goto L26
            r0 = 1
            if (r2 == r0) goto L1e
            r0 = 2
            if (r2 == r0) goto L16
            r0 = 3
            if (r2 != r0) goto L2e
            r2 = 2131953177(0x7f130619, float:1.9542818E38)
            java.lang.String r1 = r1.getString(r2)
            goto L35
        L16:
            r2 = 2131953112(0x7f1305d8, float:1.9542686E38)
            java.lang.String r1 = r1.getString(r2)
            goto L35
        L1e:
            r2 = 2131953241(0x7f130659, float:1.9542947E38)
            java.lang.String r1 = r1.getString(r2)
            goto L35
        L26:
            r2 = 2131953344(0x7f1306c0, float:1.9543156E38)
            java.lang.String r1 = r1.getString(r2)
            goto L35
        L2e:
            r2 = 2131953078(0x7f1305b6, float:1.9542617E38)
            java.lang.String r1 = r1.getString(r2)
        L35:
            kotlin.toMagicModuleMetaRepoModel.write(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.am.write(int):java.lang.String");
    }

    private final void MediaMetadataCompat() {
        deriveAudioFormat deriveaudioformat = this.read;
        deriveAudioFormat deriveaudioformat2 = null;
        if (deriveaudioformat == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            deriveaudioformat = null;
        }
        deriveaudioformat.AudioAttributesCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.av
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                am.AudioAttributesImplBaseParcelizer(this.RemoteActionCompatParcelizer);
            }
        });
        deriveAudioFormat deriveaudioformat3 = this.read;
        if (deriveaudioformat3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            deriveaudioformat3 = null;
        }
        deriveaudioformat3.IconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.aq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                am.MediaDescriptionCompat(this.IconCompatParcelizer);
            }
        });
        deriveAudioFormat deriveaudioformat4 = this.read;
        if (deriveaudioformat4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            deriveaudioformat2 = deriveaudioformat4;
        }
        deriveaudioformat2.write.setOnClickListener(new View.OnClickListener() { // from class: o.au
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                am.MediaMetadataCompat(this.IconCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesImplBaseParcelizer(am amVar) {
        amVar.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer(Recaptcha.AudioAttributesImplApi21Parcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaDescriptionCompat(am amVar) {
        deriveAudioFormat deriveaudioformat = amVar.read;
        deriveAudioFormat deriveaudioformat2 = null;
        if (deriveaudioformat == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            deriveaudioformat = null;
        }
        Group group = deriveaudioformat.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(group, "");
        if (group.getVisibility() == 0) {
            deriveAudioFormat deriveaudioformat3 = amVar.read;
            if (deriveaudioformat3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                deriveaudioformat2 = deriveaudioformat3;
            }
            Group group2 = deriveaudioformat2.RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(group2, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(group2);
            return;
        }
        deriveAudioFormat deriveaudioformat4 = amVar.read;
        if (deriveaudioformat4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            deriveaudioformat4 = null;
        }
        Group group3 = deriveaudioformat4.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(group3, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(group3);
        deriveAudioFormat deriveaudioformat5 = amVar.read;
        if (deriveaudioformat5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            deriveaudioformat5 = null;
        }
        RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer = deriveaudioformat5.MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer();
        toMagicModuleMetaRepoModel.read(mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer, "");
        int iMediaBrowserCompatCustomActionResultReceiver = ((LinearLayoutManager) mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer).MediaBrowserCompatCustomActionResultReceiver();
        int itemCount = amVar.IconCompatParcelizer.getItemCount();
        if (iMediaBrowserCompatCustomActionResultReceiver < 0 || iMediaBrowserCompatCustomActionResultReceiver >= itemCount) {
            return;
        }
        onBindingDied.write(amVar.write, null, amVar.IconCompatParcelizer.write(iMediaBrowserCompatCustomActionResultReceiver), 1);
        int iAudioAttributesCompatParcelizer = amVar.write.AudioAttributesCompatParcelizer(amVar.IconCompatParcelizer.write(iMediaBrowserCompatCustomActionResultReceiver));
        deriveAudioFormat deriveaudioformat6 = amVar.read;
        if (deriveaudioformat6 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            deriveaudioformat2 = deriveaudioformat6;
        }
        RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer2 = deriveaudioformat2.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer();
        toMagicModuleMetaRepoModel.read(mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer2, "");
        ((LinearLayoutManager) mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer2).read(iAudioAttributesCompatParcelizer, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaMetadataCompat(am amVar) {
        deriveAudioFormat deriveaudioformat = amVar.read;
        if (deriveaudioformat == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            deriveaudioformat = null;
        }
        Group group = deriveaudioformat.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(group, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(group);
    }

    private final void MediaDescriptionCompat() {
        deriveAudioFormat deriveaudioformat = this.read;
        deriveAudioFormat deriveaudioformat2 = null;
        if (deriveaudioformat == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            deriveaudioformat = null;
        }
        deriveaudioformat.AudioAttributesImplApi21Parcelizer.setAdapter(this.write);
        deriveAudioFormat deriveaudioformat3 = this.read;
        if (deriveaudioformat3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            deriveaudioformat2 = deriveaudioformat3;
        }
        deriveaudioformat2.MediaBrowserCompatItemReceiver.setAdapter(this.IconCompatParcelizer);
        MediaBrowserCompatItemReceiver();
        MediaBrowserCompatSearchResultReceiver();
    }

    private final void MediaBrowserCompatItemReceiver() {
        deriveAudioFormat deriveaudioformat = this.read;
        deriveAudioFormat deriveaudioformat2 = null;
        if (deriveaudioformat == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            deriveaudioformat = null;
        }
        deriveaudioformat.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(new setHandRotation(0, 0, getResources().getDimensionPixelSize(R.dimen.pad_large), getResources().getDimensionPixelSize(R.dimen.pad_large), getResources().getDimensionPixelSize(R.dimen.pad_normal_xx), 3, null));
        deriveAudioFormat deriveaudioformat3 = this.read;
        if (deriveaudioformat3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            deriveaudioformat2 = deriveaudioformat3;
        }
        deriveaudioformat2.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(new getVersionCode(getResources().getDimensionPixelSize(R.dimen.pad_large), getResources().getDimensionPixelSize(R.dimen.pad_large), Integer.valueOf(getResources().getDimensionPixelSize(R.dimen.pad_normal_xx)), this.IconCompatParcelizer));
    }

    private final void MediaBrowserCompatSearchResultReceiver() {
        deriveAudioFormat deriveaudioformat = this.read;
        if (deriveaudioformat == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            deriveaudioformat = null;
        }
        deriveaudioformat.MediaBrowserCompatCustomActionResultReceiver.write((TabLayout.AudioAttributesCompatParcelizer) new DataSourceBitmapLoader(new getAnswerMap() { // from class: o.ar
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return am.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, (TabLayout.MediaBrowserCompatCustomActionResultReceiver) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(am amVar, TabLayout.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
        toMagicModuleMetaRepoModel.write(mediaBrowserCompatCustomActionResultReceiver, "");
        amVar.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer(new Recaptcha.handleMediaPlayPauseIfPendingOnHandler(mediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer()));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: renamed from: o.am$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/am$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/ReviewInfo;", "p0", "Lo/am;", "AudioAttributesCompatParcelizer", "(Lo/ReviewInfo;)Lo/am;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static am AudioAttributesCompatParcelizer(ReviewInfo p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            am amVar = new am();
            amVar.setArguments(p0.read());
            return amVar;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // kotlin.bk
    public final void write(isTrafficRestricted.AudioAttributesImplApi26Parcelizer p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer(new Recaptcha.MediaBrowserCompatItemReceiver(p0));
    }

    @Override // kotlin.bk
    public final void RemoteActionCompatParcelizer() {
        MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer(Recaptcha.read.INSTANCE);
    }

    @Override // kotlin.bk
    public final void AudioAttributesCompatParcelizer(isTrafficRestricted.AudioAttributesImplApi26Parcelizer p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer(new Recaptcha.RemoteActionCompatParcelizer(p0.getOnPlayFromMediaId(), p0.getHandleMediaPlayPauseIfPendingOnHandler()));
    }

    @Override // kotlin.bk
    public final void AudioAttributesCompatParcelizer() {
        MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer(Recaptcha.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
    }

    @Override // kotlin.bk
    public final void read() {
        MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer(Recaptcha.AudioAttributesImplApi26Parcelizer.INSTANCE);
    }

    @Override // kotlin.bk
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer(Recaptcha.MediaBrowserCompatSearchResultReceiver.INSTANCE);
    }

    @Override // kotlin.bk
    public final void AudioAttributesImplApi21Parcelizer() {
        MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer(Recaptcha.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.INSTANCE);
    }

    @Override // kotlin.bk
    public final void write() {
        MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer(Recaptcha.write.INSTANCE);
    }
}
