package kotlin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.marrow.R;
import com.marrow.data.api.models.response.sync.CrossDeviceSyncResponseObject;
import com.marrow.data.models.mcq.bookmark.FilterItemRecord;
import com.marrow.ui.activities.learn.video.LessonVideoActivity;
import com.marrow.ui.activities.plan.PlanActivity;
import com.marrow2.ui.better_search.BetterSearchViewModel;
import com.marrow2.ui.main.viewmodel.HomeSharedViewModel;
import java.util.Collection;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.DataBufferRef;
import kotlin.LastLocationRequestBuilder;
import kotlin.Metadata;
import kotlin.StandardIntegrityVerdictOptOut;
import kotlin.VisibilityChecker;
import kotlin.addAllowedCountryCodes;
import kotlin.getAutofillClient;
import kotlin.isStartTag;
import kotlin.onOutputSizeChanged;
import kotlin.setTokenBinding;
import kotlin.signalEndOfInput;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000 &2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001&B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0005J!\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0005J\u000f\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0005J\u000f\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u0005J\u000f\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u0005J\u000f\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u0005J\u000f\u0010\u001c\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u0005J\u000f\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u0005J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u0018\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010\u0005J\u000f\u0010!\u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\u0005J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020%H\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010#\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010(J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010)J\u001f\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010(J\u0017\u0010*\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010)J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\"H\u0002¢\u0006\u0004\b\u000b\u0010+J\u001f\u0010&\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b&\u0010(J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010)J\u000f\u0010,\u001a\u00020\nH\u0002¢\u0006\u0004\b,\u0010\u0005J\u000f\u0010-\u001a\u00020\nH\u0002¢\u0006\u0004\b-\u0010\u0005J\u000f\u0010.\u001a\u00020\nH\u0002¢\u0006\u0004\b.\u0010\u0005J\u000f\u0010/\u001a\u00020\nH\u0002¢\u0006\u0004\b/\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\u0005J\u001d\u0010#\u001a\u00020\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020100H\u0002¢\u0006\u0004\b#\u00102J\u000f\u00103\u001a\u00020\nH\u0002¢\u0006\u0004\b3\u0010\u0005J\u000f\u00104\u001a\u00020\nH\u0002¢\u0006\u0004\b4\u0010\u0005J\u000f\u00105\u001a\u00020\nH\u0002¢\u0006\u0004\b5\u0010\u0005J\u000f\u00106\u001a\u00020\nH\u0002¢\u0006\u0004\b6\u0010\u0005J\u000f\u00107\u001a\u00020\nH\u0002¢\u0006\u0004\b7\u0010\u0005J\u0019\u0010*\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\b*\u00109J\u0017\u0010#\u001a\u00020%2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010:J\u001d\u0010*\u001a\u00020\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020%00H\u0002¢\u0006\u0004\b*\u00102J\u001f\u0010*\u001a\u00020\n2\u0006\u0010\u0007\u001a\u0002012\u0006\u0010\t\u001a\u00020\"H\u0016¢\u0006\u0004\b*\u0010;R\u0018\u0010\u000b\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010=R\u0014\u0010*\u001a\u00020<8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010>R\u0016\u0010\u0018\u001a\u00020?8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b#\u0010@R\u001b\u0010&\u001a\u00020A8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b/\u0010B\u001a\u0004\bC\u0010DR\u001b\u0010#\u001a\u00020E8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010B\u001a\u0004\b#\u0010FR\u0016\u0010/\u001a\u00020G8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010HR\u0014\u0010\u001c\u001a\u00020I8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010J"}, d2 = {"Lo/transformFutureAsync;", "Landroidx/fragment/app/Fragment;", "Lcom/google/android/material/tabs/TabLayout$AudioAttributesCompatParcelizer;", "Lo/signalEndOfInput$AudioAttributesCompatParcelizer;", "<init>", "()V", "", "p0", "", "p1", "", "read", "(Ljava/lang/String;J)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onAddQueueItem", "write", "onResume", "AudioAttributesImplApi26Parcelizer", "MediaMetadataCompat", "AudioAttributesImplBaseParcelizer", "onPlay", "Lo/onOutputFrameAvailableForRendering;", "(Lo/onOutputFrameAvailableForRendering;)V", "onCommand", "MediaDescriptionCompat", "", "RemoteActionCompatParcelizer", "(I)V", "Lo/getAttributeValueIgnorePrefix;", "AudioAttributesCompatParcelizer", "(Lo/getAttributeValueIgnorePrefix;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;)V", "IconCompatParcelizer", "(Ljava/lang/String;I)V", "onCustomAction", "MediaBrowserCompatCustomActionResultReceiver", "onMediaButtonEvent", "MediaBrowserCompatItemReceiver", "", "Lo/isStartTagIgnorePrefix;", "(Ljava/util/List;)V", "RatingCompat", "handleMediaPlayPauseIfPendingOnHandler", "MediaBrowserCompatMediaItem", "MediaBrowserCompatSearchResultReceiver", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "Lcom/google/android/material/tabs/TabLayout$MediaBrowserCompatCustomActionResultReceiver;", "(Lcom/google/android/material/tabs/TabLayout$MediaBrowserCompatCustomActionResultReceiver;)V", "(Ljava/lang/String;)Lo/getAttributeValueIgnorePrefix;", "(Lo/isStartTagIgnorePrefix;I)V", "Lo/isReusable;", "Lo/isReusable;", "()Lo/isReusable;", "Lo/signalEndOfInput;", "Lo/signalEndOfInput;", "Lcom/marrow2/ui/better_search/BetterSearchViewModel;", "Lo/RenewEligible;", "AudioAttributesImplApi21Parcelizer", "()Lcom/marrow2/ui/better_search/BetterSearchViewModel;", "Lcom/marrow2/ui/main/viewmodel/HomeSharedViewModel;", "()Lcom/marrow2/ui/main/viewmodel/HomeSharedViewModel;", "Ljava/util/Timer;", "Ljava/util/Timer;", "Lo/transformFutureAsync$AudioAttributesImplApi21Parcelizer;", "Lo/transformFutureAsync$AudioAttributesImplApi21Parcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class transformFutureAsync extends setOnInputFrameProcessedListener implements TabLayout.AudioAttributesCompatParcelizer, signalEndOfInput.AudioAttributesCompatParcelizer {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private Timer MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final AudioAttributesImplApi21Parcelizer AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final RenewEligible AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private signalEndOfInput write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final RenewEligible RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private isReusable read;

    /* JADX INFO: loaded from: classes3.dex */
    public static final /* synthetic */ class RemoteActionCompatParcelizer {
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[getAttributeValueIgnorePrefix.values().length];
            try {
                iArr[getAttributeValueIgnorePrefix.read.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getAttributeValueIgnorePrefix.IconCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getAttributeValueIgnorePrefix.AudioAttributesImplBaseParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[getAttributeValueIgnorePrefix.MediaBrowserCompatCustomActionResultReceiver.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[getAttributeValueIgnorePrefix.MediaBrowserCompatItemReceiver.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[getAttributeValueIgnorePrefix.RemoteActionCompatParcelizer.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[getAttributeValueIgnorePrefix.AudioAttributesCompatParcelizer.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[getAttributeValueIgnorePrefix.write.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            RemoteActionCompatParcelizer = iArr;
        }
    }

    public transformFutureAsync() {
        transformFutureAsync transformfutureasync = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass1(new AnonymousClass2(transformfutureasync)));
        this.AudioAttributesCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(BetterSearchViewModel.class), new AnonymousClass7(renewEligibleWrite), new AnonymousClass10(renewEligibleWrite), new AnonymousClass9(transformfutureasync, renewEligibleWrite));
        this.RemoteActionCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(HomeSharedViewModel.class), new AnonymousClass3(transformfutureasync), new AnonymousClass4(transformfutureasync), new AnonymousClass5(transformfutureasync));
        this.MediaBrowserCompatItemReceiver = new Timer();
        this.AudioAttributesImplBaseParcelizer = new AudioAttributesImplApi21Parcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final isReusable AudioAttributesCompatParcelizer() {
        isReusable isreusable = this.read;
        toMagicModuleMetaRepoModel.write(isreusable);
        return isreusable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BetterSearchViewModel AudioAttributesImplApi21Parcelizer() {
        return (BetterSearchViewModel) this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    private final HomeSharedViewModel RemoteActionCompatParcelizer() {
        return (HomeSharedViewModel) this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    public static final class AudioAttributesImplApi21Parcelizer implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        AudioAttributesImplApi21Parcelizer() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(transformFutureAsync.this.AudioAttributesCompatParcelizer().IconCompatParcelizer.getText().toString(), " ")) {
                EditText editText = transformFutureAsync.this.AudioAttributesCompatParcelizer().IconCompatParcelizer;
                Editable text = transformFutureAsync.this.AudioAttributesCompatParcelizer().IconCompatParcelizer.getText();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(text, "");
                editText.setText(TestGroupLSModel.AudioAttributesImplApi26Parcelizer(text));
            }
            transformFutureAsync.this.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(new isStartTag.read(String.valueOf(editable)));
            transformFutureAsync.this.read(String.valueOf(editable), 500L);
        }
    }

    /* JADX INFO: renamed from: o.transformFutureAsync$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "IconCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$RemoteActionCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment) {
            super(0);
            this.$RemoteActionCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.transformFutureAsync$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "IconCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$RemoteActionCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$RemoteActionCompatParcelizer = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.transformFutureAsync$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "write", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass7 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$RemoteActionCompatParcelizer).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(RenewEligible renewEligible) {
            super(0);
            this.$RemoteActionCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(String p0, long p1) {
        this.MediaBrowserCompatItemReceiver.cancel();
        Timer timer = new Timer();
        this.MediaBrowserCompatItemReceiver = timer;
        timer.schedule(new MediaBrowserCompatItemReceiver(p0), 500L);
    }

    public static final class MediaBrowserCompatItemReceiver extends TimerTask {
        private /* synthetic */ String write;

        MediaBrowserCompatItemReceiver(String str) {
            this.write = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            transformFutureAsync.this.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(new isStartTag.AudioAttributesImplApi21Parcelizer(this.write));
        }
    }

    /* JADX INFO: renamed from: o.transformFutureAsync$10, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "RemoteActionCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass10 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ RenewEligible $IconCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $write = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$IconCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(RenewEligible renewEligible) {
            super(0);
            this.$IconCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.transformFutureAsync$9, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "read", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass9 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;
        private /* synthetic */ RenewEligible $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$RemoteActionCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$AudioAttributesCompatParcelizer.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
            this.$RemoteActionCompatParcelizer = renewEligible;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.read = isReusable.RemoteActionCompatParcelizer(p0, p1);
        ConstraintLayout constraintLayoutAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutAudioAttributesCompatParcelizer, "");
        return constraintLayoutAudioAttributesCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(DataBufferRef.read.INSTANCE);
        this.read = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        write();
        onAddQueueItem();
        MediaMetadataCompat();
        AudioAttributesImplBaseParcelizer();
        AudioAttributesImplApi26Parcelizer();
    }

    private final void onAddQueueItem() {
        getChildFragmentManager().IconCompatParcelizer(SmsRetrieverStatusCodes.RemoteActionCompatParcelizer.getWrite(), getViewLifecycleOwner(), new _addFields() { // from class: o.toLong
            @Override // kotlin._addFields
            public final void AudioAttributesCompatParcelizer(String str, Bundle bundle) {
                transformFutureAsync.RemoteActionCompatParcelizer(this.write, str, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(transformFutureAsync transformfutureasync, String str, Bundle bundle) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        if (bundle.getBoolean("positive_key_press")) {
            transformfutureasync.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(isStartTag.AudioAttributesImplBaseParcelizer.INSTANCE);
        }
    }

    private final void write() {
        LinearLayout linearLayout = AudioAttributesCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        getHttpMethodString.read((View) linearLayout, true, false, true, true, 0, 50);
        TextView textView = AudioAttributesCompatParcelizer().MediaMetadataCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        getHttpMethodString.read((View) textView, false, false, true, true, 0, 51);
        TabLayout tabLayout = AudioAttributesCompatParcelizer().MediaDescriptionCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(tabLayout, "");
        getHttpMethodString.read((View) tabLayout, false, false, true, true, 0, 51);
        LinearLayout linearLayout2 = AudioAttributesCompatParcelizer().MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
        getHttpMethodString.read((View) linearLayout2, false, false, true, true, 0, 51);
        RecyclerView recyclerView = AudioAttributesCompatParcelizer().RatingCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
        getHttpMethodString.read((View) recyclerView, false, true, true, true, 0, 49);
        LinearLayout linearLayout3 = AudioAttributesCompatParcelizer().AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout3, "");
        getHttpMethodString.read((View) linearLayout3, false, true, true, true, 0, 49);
        ConstraintLayout constraintLayout = AudioAttributesCompatParcelizer().write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        getHttpMethodString.read((View) constraintLayout, false, true, true, true, 0, 49);
        ConstraintLayout constraintLayout2 = AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout2, "");
        getHttpMethodString.read((View) constraintLayout2, false, true, true, true, 0, 49);
        ConstraintLayout constraintLayout3 = AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout3, "");
        getHttpMethodString.read((View) constraintLayout3, false, true, true, true, 0, 49);
    }

    /* JADX INFO: renamed from: o.transformFutureAsync$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "IconCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return this.$write.requireActivity().getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment) {
            super(0);
            this.$write = fragment;
        }
    }

    /* JADX INFO: renamed from: o.transformFutureAsync$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "RemoteActionCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $AudioAttributesCompatParcelizer = null;
        private /* synthetic */ Fragment $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            return this.$IconCompatParcelizer.requireActivity().getDefaultViewModelCreationExtras();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Fragment fragment) {
            super(0);
            this.$IconCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.transformFutureAsync$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "RemoteActionCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            return this.$IconCompatParcelizer.requireActivity().getDefaultViewModelProviderFactory();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Fragment fragment) {
            super(0);
            this.$IconCompatParcelizer = fragment;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(isStartTag.AudioAttributesImplApi26Parcelizer.INSTANCE);
        RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(new DataBufferRef.MediaBrowserCompatMediaItem(isConnectionFailedListenerRegistered.RemoteActionCompatParcelizer));
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        AudioAttributesCompatParcelizer().AudioAttributesImplBaseParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.unescapeFileName
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                transformFutureAsync.onMediaButtonEvent(this.write);
            }
        });
        AudioAttributesCompatParcelizer().AudioAttributesImplApi26Parcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.UtilExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                transformFutureAsync.onPause(this.read);
            }
        });
        AudioAttributesCompatParcelizer().MediaBrowserCompatSearchResultReceiver.setOnClickListener(new UtilExternalSyntheticLambda1(this));
        AudioAttributesCompatParcelizer().read.setOnClickListener(new View.OnClickListener() { // from class: o.newThread
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                transformFutureAsync.onPlay(this.read);
            }
        });
        AudioAttributesCompatParcelizer().IconCompatParcelizer.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o.UtilExternalSyntheticLambda4
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return transformFutureAsync.AudioAttributesCompatParcelizer(this.write, textView, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onMediaButtonEvent(transformFutureAsync transformfutureasync) {
        transformfutureasync.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(isStartTag.AudioAttributesCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPause(transformFutureAsync transformfutureasync) {
        transformfutureasync.read();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFastForward(transformFutureAsync transformfutureasync) {
        transformfutureasync.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(isStartTag.RemoteActionCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPlay(transformFutureAsync transformfutureasync) {
        transformfutureasync.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(isStartTag.MediaBrowserCompatMediaItem.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesCompatParcelizer(transformFutureAsync transformfutureasync, TextView textView, int i) {
        toMagicModuleMetaRepoModel.write(textView, "");
        if (i != 3) {
            return false;
        }
        dispatchTouchEvent.read(textView);
        transformfutureasync.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(new isStartTag.AudioAttributesImplApi21Parcelizer(textView.getText().toString()));
        return true;
    }

    private final void MediaMetadataCompat() {
        AudioAttributesCompatParcelizer().IconCompatParcelizer.addTextChangedListener(this.AudioAttributesImplBaseParcelizer);
        AudioAttributesCompatParcelizer().MediaDescriptionCompat.write((TabLayout.AudioAttributesCompatParcelizer) this);
        this.write = new signalEndOfInput(this);
        RecyclerView recyclerView = AudioAttributesCompatParcelizer().RatingCompat;
        signalEndOfInput signalendofinput = this.write;
        if (signalendofinput == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            signalendofinput = null;
        }
        recyclerView.setAdapter(signalendofinput);
        AudioAttributesCompatParcelizer().IconCompatParcelizer.requestFocus();
        requireActivity().getWindow().setSoftInputMode(4);
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<List<getAttributeValueIgnorePrefix>> setupdatedstatusAudioAttributesImplBaseParcelizer = transformFutureAsync.this.AudioAttributesImplApi21Parcelizer().AudioAttributesImplBaseParcelizer();
                final transformFutureAsync transformfutureasync = transformFutureAsync.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesImplBaseParcelizer.write(new getValidationToken() { // from class: o.transformFutureAsync.IconCompatParcelizer.1
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((List) obj2);
                    }

                    private Object IconCompatParcelizer(List<? extends getAttributeValueIgnorePrefix> list) {
                        if (!list.isEmpty()) {
                            transformfutureasync.IconCompatParcelizer(list);
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
            return transformFutureAsync.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplBaseParcelizer() {
        transformFutureAsync transformfutureasync = this;
        setBitrateKbps.read(transformfutureasync, new IconCompatParcelizer(null));
        setBitrateKbps.read(transformfutureasync, new read(null));
        setBitrateKbps.read(transformfutureasync, new write(null));
        setBitrateKbps.read(transformfutureasync, new AudioAttributesImplBaseParcelizer(null));
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<List<isStartTagIgnorePrefix>>> setupdatedstatusAudioAttributesCompatParcelizer = transformFutureAsync.this.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer();
                final transformFutureAsync transformfutureasync = transformFutureAsync.this;
                this.write = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.transformFutureAsync.read.3
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((DataSourceBitmapLoaderExternalSyntheticLambda0) obj2);
                    }

                    private Object IconCompatParcelizer(DataSourceBitmapLoaderExternalSyntheticLambda0<List<isStartTagIgnorePrefix>> dataSourceBitmapLoaderExternalSyntheticLambda0) {
                        if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof decodeBitmap) {
                            decodeBitmap decodebitmap = (decodeBitmap) dataSourceBitmapLoaderExternalSyntheticLambda0;
                            if (!((Collection) decodebitmap.RemoteActionCompatParcelizer()).isEmpty()) {
                                transformfutureasync.RemoteActionCompatParcelizer((List<? extends isStartTagIgnorePrefix>) decodebitmap.RemoteActionCompatParcelizer());
                            } else {
                                transformfutureasync.RatingCompat();
                            }
                        } else if (!(dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof setTopBitrateKbps) && !(dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof setStreamingFormat)) {
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
            return transformFutureAsync.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<isEndTag> setupdatedstatusIconCompatParcelizer = transformFutureAsync.this.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer();
                final transformFutureAsync transformfutureasync = transformFutureAsync.this;
                this.write = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.transformFutureAsync.write.4

                    /* JADX INFO: renamed from: o.transformFutureAsync$write$4$IconCompatParcelizer */
                    public static final /* synthetic */ class IconCompatParcelizer {
                        public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

                        static {
                            int[] iArr = new int[isEndTag.values().length];
                            try {
                                iArr[isEndTag.read.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[isEndTag.AudioAttributesImplApi26Parcelizer.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[isEndTag.MediaMetadataCompat.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            try {
                                iArr[isEndTag.AudioAttributesCompatParcelizer.ordinal()] = 4;
                            } catch (NoSuchFieldError unused4) {
                            }
                            try {
                                iArr[isEndTag.write.ordinal()] = 5;
                            } catch (NoSuchFieldError unused5) {
                            }
                            try {
                                iArr[isEndTag.AudioAttributesImplBaseParcelizer.ordinal()] = 6;
                            } catch (NoSuchFieldError unused6) {
                            }
                            try {
                                iArr[isEndTag.MediaBrowserCompatCustomActionResultReceiver.ordinal()] = 7;
                            } catch (NoSuchFieldError unused7) {
                            }
                            try {
                                iArr[isEndTag.MediaBrowserCompatItemReceiver.ordinal()] = 8;
                            } catch (NoSuchFieldError unused8) {
                            }
                            try {
                                iArr[isEndTag.RemoteActionCompatParcelizer.ordinal()] = 9;
                            } catch (NoSuchFieldError unused9) {
                            }
                            try {
                                iArr[isEndTag.IconCompatParcelizer.ordinal()] = 10;
                            } catch (NoSuchFieldError unused10) {
                            }
                            try {
                                iArr[isEndTag.AudioAttributesImplApi21Parcelizer.ordinal()] = 11;
                            } catch (NoSuchFieldError unused11) {
                            }
                            AudioAttributesCompatParcelizer = iArr;
                        }
                    }

                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((isEndTag) obj2);
                    }

                    private Object IconCompatParcelizer(isEndTag isendtag) {
                        switch (IconCompatParcelizer.AudioAttributesCompatParcelizer[isendtag.ordinal()]) {
                            case 1:
                                transformfutureasync.MediaBrowserCompatSearchResultReceiver();
                                break;
                            case 2:
                                transformfutureasync.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                                break;
                            case 3:
                                transformfutureasync.handleMediaPlayPauseIfPendingOnHandler();
                                break;
                            case 4:
                                transformfutureasync.MediaBrowserCompatMediaItem();
                                break;
                            case 5:
                                transformfutureasync.RatingCompat();
                                break;
                            case 6:
                                transformfutureasync.onMediaButtonEvent();
                                break;
                            case 7:
                                transformfutureasync.MediaBrowserCompatItemReceiver();
                                break;
                            case 8:
                                transformfutureasync.onCustomAction();
                                break;
                            case 9:
                                transformfutureasync.MediaBrowserCompatCustomActionResultReceiver();
                                break;
                            case 10:
                                transformfutureasync.MediaDescriptionCompat();
                                break;
                            case 11:
                                transformfutureasync.onCommand();
                                break;
                            default:
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

        write(SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return transformFutureAsync.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<onOutputSizeChanged> setupdatedstatus = transformFutureAsync.this.AudioAttributesImplApi21Parcelizer().read();
                final transformFutureAsync transformfutureasync = transformFutureAsync.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.transformFutureAsync.AudioAttributesImplBaseParcelizer.4
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((onOutputSizeChanged) obj2);
                    }

                    private Object IconCompatParcelizer(onOutputSizeChanged onoutputsizechanged) {
                        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(onoutputsizechanged, onOutputSizeChanged.RemoteActionCompatParcelizer.INSTANCE)) {
                            transformfutureasync.requireActivity().onBackPressed();
                        } else if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(onoutputsizechanged, onOutputSizeChanged.IconCompatParcelizer.INSTANCE)) {
                            if (onoutputsizechanged instanceof onOutputSizeChanged.read) {
                                onOutputSizeChanged.read readVar = (onOutputSizeChanged.read) onoutputsizechanged;
                                transformfutureasync.RemoteActionCompatParcelizer(readVar.read(), readVar.IconCompatParcelizer());
                            } else if (onoutputsizechanged instanceof onOutputSizeChanged.AudioAttributesImplApi21Parcelizer) {
                                transformfutureasync.write(((onOutputSizeChanged.AudioAttributesImplApi21Parcelizer) onoutputsizechanged).write());
                            } else if (onoutputsizechanged instanceof onOutputSizeChanged.AudioAttributesCompatParcelizer) {
                                onOutputSizeChanged.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (onOutputSizeChanged.AudioAttributesCompatParcelizer) onoutputsizechanged;
                                transformfutureasync.write(audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(), audioAttributesCompatParcelizer.write());
                            } else if (onoutputsizechanged instanceof onOutputSizeChanged.AudioAttributesImplApi26Parcelizer) {
                                transformfutureasync.IconCompatParcelizer(((onOutputSizeChanged.AudioAttributesImplApi26Parcelizer) onoutputsizechanged).read());
                            } else if (onoutputsizechanged instanceof onOutputSizeChanged.MediaBrowserCompatItemReceiver) {
                                onOutputSizeChanged.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = (onOutputSizeChanged.MediaBrowserCompatItemReceiver) onoutputsizechanged;
                                transformfutureasync.read(mediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(), mediaBrowserCompatItemReceiver.write());
                            } else if (onoutputsizechanged instanceof onOutputSizeChanged.MediaBrowserCompatCustomActionResultReceiver) {
                                transformFutureAsync transformfutureasync2 = transformfutureasync;
                                setTokenBinding.Companion readVar2 = setTokenBinding.INSTANCE;
                                Context contextRequireContext = transformfutureasync.requireContext();
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                                transformfutureasync2.startActivity(setTokenBinding.Companion.IconCompatParcelizer(contextRequireContext, ((onOutputSizeChanged.MediaBrowserCompatCustomActionResultReceiver) onoutputsizechanged).IconCompatParcelizer(), 8, null));
                            } else if (onoutputsizechanged instanceof onOutputSizeChanged.MediaBrowserCompatSearchResultReceiver) {
                                transformfutureasync.read(((onOutputSizeChanged.MediaBrowserCompatSearchResultReceiver) onoutputsizechanged).write());
                            } else if (onoutputsizechanged instanceof onOutputSizeChanged.RatingCompat) {
                                transformfutureasync.AudioAttributesCompatParcelizer(((onOutputSizeChanged.RatingCompat) onoutputsizechanged).AudioAttributesCompatParcelizer());
                            } else if (onoutputsizechanged instanceof onOutputSizeChanged.AudioAttributesImplBaseParcelizer) {
                                transformfutureasync.RemoteActionCompatParcelizer(((onOutputSizeChanged.AudioAttributesImplBaseParcelizer) onoutputsizechanged).AudioAttributesCompatParcelizer());
                            } else if (onoutputsizechanged instanceof onOutputSizeChanged.MediaBrowserCompatMediaItem) {
                                transformfutureasync.AudioAttributesCompatParcelizer().IconCompatParcelizer.setText(((onOutputSizeChanged.MediaBrowserCompatMediaItem) onoutputsizechanged).RemoteActionCompatParcelizer());
                            } else if (onoutputsizechanged instanceof onOutputSizeChanged.write) {
                                onOutputSizeChanged.write writeVar = (onOutputSizeChanged.write) onoutputsizechanged;
                                transformfutureasync.AudioAttributesCompatParcelizer(writeVar.AudioAttributesCompatParcelizer(), writeVar.RemoteActionCompatParcelizer());
                            } else if (onoutputsizechanged instanceof onOutputSizeChanged.MediaMetadataCompat) {
                                transformfutureasync.write(((onOutputSizeChanged.MediaMetadataCompat) onoutputsizechanged).AudioAttributesCompatParcelizer());
                            } else if (onoutputsizechanged instanceof onOutputSizeChanged.MediaDescriptionCompat) {
                                transformfutureasync.onPlay();
                            } else {
                                throw new RenewEligibleCreator();
                            }
                        }
                        transformfutureasync.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(isStartTag.write.INSTANCE);
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
            return transformFutureAsync.this.new AudioAttributesImplBaseParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPlay() {
        getAutofillClient.Companion companion = getAutofillClient.INSTANCE;
        String string = getString(R.string.video_for_paid_user);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String string2 = getString(R.string.view_plans);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        String string3 = getString(R.string.go_back);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
        getAutofillClient.Companion.AudioAttributesCompatParcelizer(null, string, string2, string3, 0, SmsRetrieverStatusCodes.RemoteActionCompatParcelizer, false, false, null, 465).show(getChildFragmentManager(), (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(onOutputFrameAvailableForRendering p0) {
        EditText editText = AudioAttributesCompatParcelizer().IconCompatParcelizer;
        String strIconCompatParcelizer = p0.IconCompatParcelizer();
        if (strIconCompatParcelizer.length() == 0) {
            strIconCompatParcelizer = getString(R.string.hint_better_search);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strIconCompatParcelizer, "");
        }
        editText.setHint(strIconCompatParcelizer);
        TextView textView = AudioAttributesCompatParcelizer().MediaMetadataCompat;
        String string = p0.read();
        if (string.length() == 0) {
            string = getString(R.string.label_bs_init);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        }
        textView.setText(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCommand() {
        LinearLayout linearLayout = AudioAttributesCompatParcelizer().AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout);
        ConstraintLayout constraintLayout = AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(constraintLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaDescriptionCompat() {
        ConstraintLayout constraintLayout = AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(constraintLayout);
        ConstraintLayout constraintLayout2 = AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout2, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(constraintLayout2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(int p0) {
        AudioAttributesCompatParcelizer().MediaDescriptionCompat.IconCompatParcelizer(AudioAttributesCompatParcelizer().MediaDescriptionCompat.AudioAttributesCompatParcelizer(p0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(getAttributeValueIgnorePrefix p0) {
        int i;
        switch (RemoteActionCompatParcelizer.RemoteActionCompatParcelizer[p0.ordinal()]) {
            case 1:
            case 2:
                i = R.string.label_bs_all_error;
                break;
            case 3:
                i = R.string.label_bs_qbank_error;
                break;
            case 4:
                i = R.string.label_bs_video_error;
                break;
            case 5:
                i = R.string.label_bs_test_error;
                break;
            case 6:
                i = R.string.label_bs_pearl_error;
                break;
            case 7:
                i = R.string.label_bs_pearl_id_error;
                break;
            case 8:
                i = R.string.label_bs_mcq_id_error;
                break;
            default:
                throw new RenewEligibleCreator();
        }
        AudioAttributesCompatParcelizer().MediaBrowserCompatMediaItem.setText(getText(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(String p0, String p1) {
        Intent intentRemoteActionCompatParcelizer = joinWithSeparator.RemoteActionCompatParcelizer(requireContext(), "pearl", p0, "search");
        if (intentRemoteActionCompatParcelizer == null) {
            String string = getString(R.string.pearl_not_found);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            read(string);
        } else {
            intentRemoteActionCompatParcelizer.addFlags(33554432);
            startActivity(intentRemoteActionCompatParcelizer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void write(String p0) {
        LastLocationRequestBuilder.Companion readVar = LastLocationRequestBuilder.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        startActivity(LastLocationRequestBuilder.Companion.write(contextRequireContext, new isFastestIntervalExplicitlySet(p0, null, 2, 0 == true ? 1 : 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(String p0, String p1) {
        startActivity(joinWithSeparator.RemoteActionCompatParcelizer(requireContext(), CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, p0, "search"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(String p0) {
        addAllowedCountryCodes.Companion iconCompatParcelizer = addAllowedCountryCodes.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        startActivity(addAllowedCountryCodes.Companion.read(contextRequireContext, p0, "search"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(String p0, int p1) {
        LessonVideoActivity.Companion remoteActionCompatParcelizer = LessonVideoActivity.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        startActivity(LessonVideoActivity.Companion.AudioAttributesCompatParcelizer(contextRequireContext, p0, p1, p1 > 0, StandardIntegrityVerdictOptOut.read.write));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(String p0, String p1) {
        PlanActivity.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = PlanActivity.RemoteActionCompatParcelizer;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        startActivity(PlanActivity.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(contextRequireContext, p0, p1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(String p0) {
        Toast.makeText(requireContext(), p0, 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCustomAction() {
        ImageView imageView = AudioAttributesCompatParcelizer().AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(imageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        ImageView imageView = AudioAttributesCompatParcelizer().AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(imageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onMediaButtonEvent() {
        ConstraintLayout constraintLayout = AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(constraintLayout);
        ConstraintLayout constraintLayout2 = AudioAttributesCompatParcelizer().write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout2, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(constraintLayout2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatItemReceiver() {
        ConstraintLayout constraintLayout = AudioAttributesCompatParcelizer().write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(constraintLayout);
    }

    private final void read() {
        AudioAttributesCompatParcelizer().IconCompatParcelizer.getText().clear();
        AudioAttributesCompatParcelizer().MediaDescriptionCompat.IconCompatParcelizer(AudioAttributesCompatParcelizer().MediaDescriptionCompat.AudioAttributesCompatParcelizer(0));
        AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(isStartTag.IconCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(List<? extends isStartTagIgnorePrefix> p0) {
        signalEndOfInput signalendofinput = this.write;
        if (signalendofinput == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            signalendofinput = null;
        }
        signalendofinput.IconCompatParcelizer(p0);
        RecyclerView recyclerView = AudioAttributesCompatParcelizer().RatingCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(recyclerView);
        LinearLayout linearLayout = AudioAttributesCompatParcelizer().AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RatingCompat() {
        RecyclerView recyclerView = AudioAttributesCompatParcelizer().RatingCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(recyclerView);
        ConstraintLayout constraintLayout = AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(constraintLayout);
        LinearLayout linearLayout = AudioAttributesCompatParcelizer().AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(linearLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleMediaPlayPauseIfPendingOnHandler() {
        ConstraintLayout constraintLayout = AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(constraintLayout);
        ConstraintLayout constraintLayout2 = AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout2, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(constraintLayout2);
        LinearLayout linearLayout = AudioAttributesCompatParcelizer().MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        bytesRead.MediaBrowserCompatItemReceiver(linearLayout);
        TextView textView = AudioAttributesCompatParcelizer().MediaMetadataCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView);
        TabLayout tabLayout = AudioAttributesCompatParcelizer().MediaDescriptionCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(tabLayout, "");
        createEquirectangular.write(tabLayout, requireContext().getResources().getDimensionPixelSize(R.dimen.toolbar_height), new getCreatedOnDateMs() { // from class: o.UtilExternalSyntheticLambda0
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return transformFutureAsync.onPlayFromUri(this.read);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPlayFromUri(transformFutureAsync transformfutureasync) {
        TabLayout tabLayout = transformfutureasync.AudioAttributesCompatParcelizer().MediaDescriptionCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(tabLayout, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(tabLayout);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatMediaItem() {
        ConstraintLayout constraintLayout = AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(constraintLayout);
        LinearLayout linearLayout = AudioAttributesCompatParcelizer().MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout);
        TextView textView = AudioAttributesCompatParcelizer().MediaMetadataCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView);
        TabLayout tabLayout = AudioAttributesCompatParcelizer().MediaDescriptionCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(tabLayout, "");
        createEquirectangular.read(tabLayout, 250, new getCreatedOnDateMs() { // from class: o.Projection
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return createEquirectangular.read();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatSearchResultReceiver() {
        buildResolutionString.IconCompatParcelizer("Search", "paintInitView");
        ConstraintLayout constraintLayout = AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(constraintLayout);
        TabLayout tabLayout = AudioAttributesCompatParcelizer().MediaDescriptionCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(tabLayout, "");
        createEquirectangular.read(tabLayout, 250, new getCreatedOnDateMs() { // from class: o.UtilApi21
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return transformFutureAsync.onPrepare(this.RemoteActionCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPrepare(transformFutureAsync transformfutureasync) {
        RecyclerView recyclerView = transformfutureasync.AudioAttributesCompatParcelizer().RatingCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(recyclerView);
        TextView textView = transformfutureasync.AudioAttributesCompatParcelizer().MediaMetadataCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(textView);
        LinearLayout linearLayout = transformfutureasync.AudioAttributesCompatParcelizer().MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout);
        LinearLayout linearLayout2 = transformfutureasync.AudioAttributesCompatParcelizer().AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout2);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        ConstraintLayout constraintLayout = AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(constraintLayout);
        ConstraintLayout constraintLayout2 = AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout2, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(constraintLayout2);
        TabLayout tabLayout = AudioAttributesCompatParcelizer().MediaDescriptionCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(tabLayout, "");
        createEquirectangular.read(tabLayout, 250, new getCreatedOnDateMs() { // from class: o.toUnsignedLong
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return transformFutureAsync.onPrepareFromMediaId(this.IconCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPrepareFromMediaId(transformFutureAsync transformfutureasync) {
        TextView textView = transformfutureasync.AudioAttributesCompatParcelizer().MediaMetadataCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView);
        RecyclerView recyclerView = transformfutureasync.AudioAttributesCompatParcelizer().RatingCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(recyclerView);
        LinearLayout linearLayout = transformfutureasync.AudioAttributesCompatParcelizer().MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(linearLayout);
        LinearLayout linearLayout2 = transformfutureasync.AudioAttributesCompatParcelizer().AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout2);
        return getShowPopup.INSTANCE;
    }

    @Override // com.google.android.material.tabs.TabLayout.RemoteActionCompatParcelizer
    public final void IconCompatParcelizer(TabLayout.MediaBrowserCompatCustomActionResultReceiver p0) {
        Object objAudioAttributesCompatParcelizer = p0 != null ? p0.AudioAttributesCompatParcelizer() : null;
        BetterSearchViewModel betterSearchViewModelAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        toMagicModuleMetaRepoModel.read(objAudioAttributesCompatParcelizer, "");
        betterSearchViewModelAudioAttributesImplApi21Parcelizer.IconCompatParcelizer(new isStartTag.MediaBrowserCompatCustomActionResultReceiver(RemoteActionCompatParcelizer((String) objAudioAttributesCompatParcelizer)));
    }

    private static getAttributeValueIgnorePrefix RemoteActionCompatParcelizer(String p0) {
        switch (p0.hashCode()) {
            case -1908356851:
                if (p0.equals("Pearls")) {
                    return getAttributeValueIgnorePrefix.RemoteActionCompatParcelizer;
                }
                break;
            case -1732810888:
                if (p0.equals("Videos")) {
                    return getAttributeValueIgnorePrefix.MediaBrowserCompatCustomActionResultReceiver;
                }
                break;
            case 65921:
                if (p0.equals(FilterItemRecord.filter_all_title)) {
                    return getAttributeValueIgnorePrefix.read;
                }
                break;
            case 76868141:
                if (p0.equals("QBank")) {
                    return getAttributeValueIgnorePrefix.AudioAttributesImplBaseParcelizer;
                }
                break;
            case 80698881:
                if (p0.equals("Tests")) {
                    return getAttributeValueIgnorePrefix.MediaBrowserCompatItemReceiver;
                }
                break;
        }
        return getAttributeValueIgnorePrefix.IconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(List<? extends getAttributeValueIgnorePrefix> p0) {
        AudioAttributesCompatParcelizer().MediaDescriptionCompat.MediaBrowserCompatCustomActionResultReceiver();
        for (getAttributeValueIgnorePrefix getattributevalueignoreprefix : p0) {
            TabLayout.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiverAudioAttributesImplApi21Parcelizer = AudioAttributesCompatParcelizer().MediaDescriptionCompat.AudioAttributesImplApi21Parcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mediaBrowserCompatCustomActionResultReceiverAudioAttributesImplApi21Parcelizer, "");
            String strWrite = AvcConfig.write(getattributevalueignoreprefix);
            String str = strWrite;
            if (str.length() > 0) {
                mediaBrowserCompatCustomActionResultReceiverAudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer((Object) strWrite);
                AudioAttributesCompatParcelizer().MediaDescriptionCompat.AudioAttributesCompatParcelizer(mediaBrowserCompatCustomActionResultReceiverAudioAttributesImplApi21Parcelizer.write(str), toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) strWrite, (Object) AvcConfig.write(AudioAttributesImplApi21Parcelizer().getOnMediaButtonEvent())));
            }
        }
    }

    @Override // o.signalEndOfInput.AudioAttributesCompatParcelizer
    public final void IconCompatParcelizer(isStartTagIgnorePrefix p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(new isStartTag.MediaBrowserCompatItemReceiver(p0, p1));
    }

    /* JADX INFO: renamed from: o.transformFutureAsync$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/transformFutureAsync$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "", "p0", "Lo/transformFutureAsync;", "RemoteActionCompatParcelizer", "(Ljava/lang/String;)Lo/transformFutureAsync;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static transformFutureAsync RemoteActionCompatParcelizer(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            transformFutureAsync transformfutureasync = new transformFutureAsync();
            Bundle bundle = new Bundle();
            bundle.putString("shared_mcq_id", p0);
            transformfutureasync.setArguments(bundle);
            return transformfutureasync;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
