package kotlin;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.material.appbar.MaterialToolbar;
import com.marrow.R;
import com.marrow.ui.activities.plan.PlanActivity;
import com.marrow2.ui.recent_updates.RecentUpdatesViewModel;
import java.util.List;
import java.util.Locale;
import kotlin.LastLocationRequestBuilder;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin.getAutofillClient;
import kotlin.listIterator;
import kotlin.serializeIterableToIntentExtra;
import kotlin.withFieldVisibility;
import kotlin.zzgr;
import kotlin.zzhd;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0001\u0011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0004J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u0004J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u0017J\u0017\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000eH\u0002¢\u0006\u0004\b \u0010\u0004J\u0019\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0011\u0010\u0017J\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0015H\u0002¢\u0006\u0004\b!\u0010\u0017J!\u0010#\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\"2\b\u0010\b\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010%J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0015H\u0016¢\u0006\u0004\b#\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u0017J\u000f\u0010&\u001a\u00020\u000eH\u0002¢\u0006\u0004\b&\u0010\u0004J\u000f\u0010'\u001a\u00020\u000eH\u0002¢\u0006\u0004\b'\u0010\u0004J\u000f\u0010(\u001a\u00020\u000eH\u0002¢\u0006\u0004\b(\u0010\u0004R\u0016\u0010\u0011\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010*R\u0016\u0010#\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010,R\u0016\u0010\u001c\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010.R\u001b\u0010\u001b\u001a\u00020/8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u00100\u001a\u0004\b\u0016\u00101R\u0018\u0010!\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u00103R\u0018\u0010\u0014\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u00105"}, d2 = {"Lo/zzgo;", "Landroidx/fragment/app/Fragment;", "Lo/zzgy;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "AudioAttributesCompatParcelizer", "onStop", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatItemReceiver", "", "AudioAttributesImplBaseParcelizer", "(Ljava/lang/String;)V", "MediaBrowserCompatMediaItem", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "write", "RemoteActionCompatParcelizer", "Landroid/content/res/Configuration;", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "MediaDescriptionCompat", "read", "", "IconCompatParcelizer", "(ILjava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "MediaMetadataCompat", "RatingCompat", "MediaBrowserCompatSearchResultReceiver", "Lo/prepareExtraction;", "Lo/prepareExtraction;", "Lo/putAll;", "Lo/putAll;", "Lo/zzft;", "Lo/zzft;", "Lcom/marrow2/ui/recent_updates/RecentUpdatesViewModel;", "Lo/RenewEligible;", "()Lcom/marrow2/ui/recent_updates/RecentUpdatesViewModel;", "Lo/getAutofillClient;", "Lo/getAutofillClient;", "Landroid/widget/Toast;", "Landroid/widget/Toast;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zzgo extends zzgd implements zzgy {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final RenewEligible write;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private zzft RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private getAutofillClient read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private prepareExtraction AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private Toast MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private putAll IconCompatParcelizer;

    public zzgo() {
        zzgo zzgoVar = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass4(new AnonymousClass5(zzgoVar)));
        this.write = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(RecentUpdatesViewModel.class), new AnonymousClass3(renewEligibleWrite), new AnonymousClass1(renewEligibleWrite), new AnonymousClass2(zzgoVar, renewEligibleWrite));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecentUpdatesViewModel AudioAttributesImplBaseParcelizer() {
        return (RecentUpdatesViewModel) this.write.RemoteActionCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        prepareExtraction prepareextractionRemoteActionCompatParcelizer = prepareExtraction.RemoteActionCompatParcelizer(p0);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(prepareextractionRemoteActionCompatParcelizer, "");
        this.AudioAttributesCompatParcelizer = prepareextractionRemoteActionCompatParcelizer;
        if (prepareextractionRemoteActionCompatParcelizer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            prepareextractionRemoteActionCompatParcelizer = null;
        }
        ConstraintLayout constraintLayoutIconCompatParcelizer = prepareextractionRemoteActionCompatParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer, "");
        return constraintLayoutIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        AudioAttributesCompatParcelizer();
        AudioAttributesImplApi26Parcelizer();
        MediaBrowserCompatCustomActionResultReceiver();
        MediaBrowserCompatItemReceiver();
        MediaDescriptionCompat();
    }

    private final void AudioAttributesCompatParcelizer() {
        prepareExtraction prepareextraction = this.AudioAttributesCompatParcelizer;
        prepareExtraction prepareextraction2 = null;
        if (prepareextraction == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            prepareextraction = null;
        }
        MaterialToolbar materialToolbar = prepareextraction.AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialToolbar, "");
        getHttpMethodString.read((View) materialToolbar, true, false, true, true, 0, 50);
        prepareExtraction prepareextraction3 = this.AudioAttributesCompatParcelizer;
        if (prepareextraction3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            prepareextraction3 = null;
        }
        View view = prepareextraction3.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
        getHttpMethodString.read(view, false, true, true, true, 0, 49);
        prepareExtraction prepareextraction4 = this.AudioAttributesCompatParcelizer;
        if (prepareextraction4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            prepareextraction4 = null;
        }
        RecyclerView recyclerView = prepareextraction4.AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
        getHttpMethodString.read((View) recyclerView, false, true, true, true, 0, 49);
        prepareExtraction prepareextraction5 = this.AudioAttributesCompatParcelizer;
        if (prepareextraction5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            prepareextraction5 = null;
        }
        ConstraintLayout constraintLayout = prepareextraction5.MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        getHttpMethodString.read((View) constraintLayout, false, true, true, true, 0, 49);
        prepareExtraction prepareextraction6 = this.AudioAttributesCompatParcelizer;
        if (prepareextraction6 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            prepareextraction6 = null;
        }
        ProgressBar progressBar = prepareextraction6.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
        getHttpMethodString.read((View) progressBar, false, true, true, true, 0, 49);
        prepareExtraction prepareextraction7 = this.AudioAttributesCompatParcelizer;
        if (prepareextraction7 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            prepareextraction2 = prepareextraction7;
        }
        CardView cardView = prepareextraction2.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardView, "");
        getHttpMethodString.RemoteActionCompatParcelizer(cardView, false, true, false, true, 0, 53);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer(listIterator.write.INSTANCE);
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        zzgo zzgoVar = this;
        this.IconCompatParcelizer = new putAll(zzgoVar);
        this.RemoteActionCompatParcelizer = new zzft(zzgoVar);
        prepareExtraction prepareextraction = this.AudioAttributesCompatParcelizer;
        zzft zzftVar = null;
        if (prepareextraction == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            prepareextraction = null;
        }
        RecyclerView recyclerView = prepareextraction.MediaBrowserCompatItemReceiver;
        putAll putall = this.IconCompatParcelizer;
        if (putall == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            putall = null;
        }
        recyclerView.setAdapter(putall);
        requireActivity();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        prepareExtraction prepareextraction2 = this.AudioAttributesCompatParcelizer;
        if (prepareextraction2 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            prepareextraction2 = null;
        }
        RecyclerView recyclerView2 = prepareextraction2.AudioAttributesImplApi21Parcelizer;
        zzft zzftVar2 = this.RemoteActionCompatParcelizer;
        if (zzftVar2 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            zzftVar = zzftVar2;
        }
        recyclerView2.setAdapter(zzftVar);
        requireActivity();
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        recyclerView2.RemoteActionCompatParcelizer(new RemoteActionCompatParcelizer());
    }

    /* JADX INFO: renamed from: o.zzgo$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "IconCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$RemoteActionCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Fragment fragment) {
            super(0);
            this.$RemoteActionCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.zzgo$4, reason: invalid class name */
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

    /* JADX INFO: renamed from: o.zzgo$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "write", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$write).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(RenewEligible renewEligible) {
            super(0);
            this.$write = renewEligible;
        }
    }

    public static final class RemoteActionCompatParcelizer extends RecyclerView.MediaBrowserCompatSearchResultReceiver {
        RemoteActionCompatParcelizer() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatSearchResultReceiver
        public final void RemoteActionCompatParcelizer(RecyclerView recyclerView, int i, int i2) {
            toMagicModuleMetaRepoModel.write(recyclerView, "");
            RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer = recyclerView.AudioAttributesImplApi21Parcelizer();
            toMagicModuleMetaRepoModel.read(mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer, "");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer;
            int iOnPlay = linearLayoutManager.onPlay();
            int iOnPrepareFromMediaId = linearLayoutManager.onPrepareFromMediaId();
            int iMediaBrowserCompatItemReceiver = linearLayoutManager.MediaBrowserCompatItemReceiver();
            if (iOnPlay + iMediaBrowserCompatItemReceiver >= iOnPrepareFromMediaId && iMediaBrowserCompatItemReceiver >= 0) {
                zzgo.this.MediaMetadataCompat();
            }
            super.RemoteActionCompatParcelizer(recyclerView, i, i2);
        }
    }

    /* JADX INFO: renamed from: o.zzgo$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "AudioAttributesCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $read = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.zzgo$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "IconCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ RenewEligible $read;
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$read);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$write.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$write = fragment;
            this.$read = renewEligible;
        }
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ prepareExtraction IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Boolean> setupdatedstatusMediaBrowserCompatCustomActionResultReceiver = zzgo.this.AudioAttributesImplBaseParcelizer().MediaBrowserCompatCustomActionResultReceiver();
                final prepareExtraction prepareextraction = this.IconCompatParcelizer;
                final zzgo zzgoVar = zzgo.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatusMediaBrowserCompatCustomActionResultReceiver.write(new getValidationToken() { // from class: o.zzgo.IconCompatParcelizer.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer(((Boolean) obj2).booleanValue());
                    }

                    private Object RemoteActionCompatParcelizer(boolean z) {
                        if (z) {
                            CardView cardView = prepareextraction.RemoteActionCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardView, "");
                            PlayerControlViewExternalSyntheticLambda1.write(cardView);
                            ImageView imageView = prepareextraction.AudioAttributesImplApi26Parcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
                            PlayerControlViewExternalSyntheticLambda1.write(imageView);
                            ImageView imageView2 = prepareextraction.write;
                            Context contextRequireContext = zzgoVar.requireContext();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                            imageView2.setImageTintList(ColorStateList.valueOf(CmcdConfigurationRequestConfig.read(contextRequireContext, R.attr.onSurfaceBlue2, R.color.mb_50)));
                            View view = prepareextraction.read;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
                            PlayerControlViewExternalSyntheticLambda1.write(view);
                        } else {
                            ImageView imageView3 = prepareextraction.AudioAttributesImplApi26Parcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView3, "");
                            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(imageView3);
                            CardView cardView2 = prepareextraction.RemoteActionCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardView2, "");
                            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(cardView2);
                            View view2 = prepareextraction.read;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view2, "");
                            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(view2);
                            ImageView imageView4 = prepareextraction.write;
                            Context contextRequireContext2 = zzgoVar.requireContext();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
                            imageView4.setImageTintList(ColorStateList.valueOf(CmcdConfigurationRequestConfig.read(contextRequireContext2, R.attr.colorOnSurfaceVariant, R.color.mb_50)));
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(prepareExtraction prepareextraction, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = prepareextraction;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return zzgo.this.new IconCompatParcelizer(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatItemReceiver() {
        prepareExtraction prepareextraction = this.AudioAttributesCompatParcelizer;
        if (prepareextraction == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            prepareextraction = null;
        }
        zzgo zzgoVar = this;
        setBitrateKbps.read(zzgoVar, new IconCompatParcelizer(prepareextraction, null));
        setBitrateKbps.read(zzgoVar, new read(null));
        setBitrateKbps.read(zzgoVar, new write(null));
        setBitrateKbps.read(zzgoVar, new MediaBrowserCompatCustomActionResultReceiver(null));
        setBitrateKbps.read(zzgoVar, new MediaBrowserCompatItemReceiver(prepareextraction, null));
        setBitrateKbps.read(zzgoVar, new AudioAttributesImplBaseParcelizer(null));
        setBitrateKbps.read(zzgoVar, new AudioAttributesImplApi21Parcelizer(prepareextraction, null));
        setBitrateKbps.read(zzgoVar, new AudioAttributesImplApi26Parcelizer(prepareextraction, null));
        setBitrateKbps.read(zzgoVar, new MediaMetadataCompat(null));
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Boolean> setupdatedstatusMediaMetadataCompat = zzgo.this.AudioAttributesImplBaseParcelizer().MediaMetadataCompat();
                final zzgo zzgoVar = zzgo.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatusMediaMetadataCompat.write(new getValidationToken() { // from class: o.zzgo.read.4
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer(((Boolean) obj2).booleanValue());
                    }

                    private Object IconCompatParcelizer(boolean z) {
                        if (z) {
                            zzgoVar.MediaBrowserCompatMediaItem();
                        } else {
                            zzgoVar.AudioAttributesImplApi21Parcelizer();
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
            return zzgo.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<List<zzhb>> setupdatedstatusMediaBrowserCompatItemReceiver = zzgo.this.AudioAttributesImplBaseParcelizer().MediaBrowserCompatItemReceiver();
                final zzgo zzgoVar = zzgo.this;
                this.read = 1;
                if (setupdatedstatusMediaBrowserCompatItemReceiver.write(new getValidationToken() { // from class: o.zzgo.write.4
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((List) obj2);
                    }

                    private Object IconCompatParcelizer(List<zzhb> list) {
                        putAll putall = zzgoVar.IconCompatParcelizer;
                        if (putall == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            putall = null;
                        }
                        putall.write(list);
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
            return zzgo.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
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
                setUpdatedStatus<List<zzhj>> setupdatedstatusIconCompatParcelizer = zzgo.this.AudioAttributesImplBaseParcelizer().IconCompatParcelizer();
                final zzgo zzgoVar = zzgo.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.zzgo.MediaBrowserCompatCustomActionResultReceiver.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((List) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(List<zzhj> list) {
                        zzft zzftVar = zzgoVar.RemoteActionCompatParcelizer;
                        if (zzftVar == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            zzftVar = null;
                        }
                        zzftVar.RemoteActionCompatParcelizer(list);
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
            return zzgo.this.new MediaBrowserCompatCustomActionResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ prepareExtraction IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Integer> setupdatedstatusAudioAttributesCompatParcelizer = zzgo.this.AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer();
                final zzgo zzgoVar = zzgo.this;
                final prepareExtraction prepareextraction = this.IconCompatParcelizer;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.zzgo.MediaBrowserCompatItemReceiver.3
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read(((Number) obj2).intValue());
                    }

                    private Object read(int i2) {
                        putAll putall = zzgoVar.IconCompatParcelizer;
                        if (putall == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            putall = null;
                        }
                        putall.AudioAttributesCompatParcelizer(i2);
                        if (i2 > 0) {
                            ImageView imageView = prepareextraction.AudioAttributesCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
                            PlayerControlViewExternalSyntheticLambda1.write(imageView);
                        } else {
                            ImageView imageView2 = prepareextraction.AudioAttributesCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView2, "");
                            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(imageView2);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatItemReceiver(prepareExtraction prepareextraction, SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = prepareextraction;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return zzgo.this.new MediaBrowserCompatItemReceiver(this.IconCompatParcelizer, sampleVideos);
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
                setUpdatedStatus<Boolean> setupdatedstatusAudioAttributesImplBaseParcelizer = zzgo.this.AudioAttributesImplBaseParcelizer().AudioAttributesImplBaseParcelizer();
                final zzgo zzgoVar = zzgo.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesImplBaseParcelizer.write(new getValidationToken() { // from class: o.zzgo.AudioAttributesImplBaseParcelizer.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer(((Boolean) obj2).booleanValue());
                    }

                    private Object RemoteActionCompatParcelizer(boolean z) {
                        if (z) {
                            zzgoVar.write();
                        } else {
                            zzgoVar.RemoteActionCompatParcelizer();
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
            return zzgo.this.new AudioAttributesImplBaseParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;
        private /* synthetic */ prepareExtraction write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Boolean> setupdatedstatusAudioAttributesImplApi21Parcelizer = zzgo.this.AudioAttributesImplBaseParcelizer().AudioAttributesImplApi21Parcelizer();
                final prepareExtraction prepareextraction = this.write;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesImplApi21Parcelizer.write(new getValidationToken() { // from class: o.zzgo.AudioAttributesImplApi21Parcelizer.3
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer(((Boolean) obj2).booleanValue());
                    }

                    private Object IconCompatParcelizer(boolean z) {
                        if (z) {
                            RecyclerView recyclerView = prepareextraction.AudioAttributesImplApi21Parcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
                            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(recyclerView);
                            ConstraintLayout constraintLayout = prepareextraction.MediaBrowserCompatCustomActionResultReceiver;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
                            PlayerControlViewExternalSyntheticLambda1.write(constraintLayout);
                        } else {
                            RecyclerView recyclerView2 = prepareextraction.AudioAttributesImplApi21Parcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView2, "");
                            PlayerControlViewExternalSyntheticLambda1.write(recyclerView2);
                            ConstraintLayout constraintLayout2 = prepareextraction.MediaBrowserCompatCustomActionResultReceiver;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout2, "");
                            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(constraintLayout2);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplApi21Parcelizer(prepareExtraction prepareextraction, SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.write = prepareextraction;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return zzgo.this.new AudioAttributesImplApi21Parcelizer(this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class AudioAttributesImplApi26Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ prepareExtraction AudioAttributesCompatParcelizer;
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Boolean> setupdatedstatusAudioAttributesImplApi26Parcelizer = zzgo.this.AudioAttributesImplBaseParcelizer().AudioAttributesImplApi26Parcelizer();
                final prepareExtraction prepareextraction = this.AudioAttributesCompatParcelizer;
                this.read = 1;
                if (setupdatedstatusAudioAttributesImplApi26Parcelizer.write(new getValidationToken() { // from class: o.zzgo.AudioAttributesImplApi26Parcelizer.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read(((Boolean) obj2).booleanValue());
                    }

                    private Object read(boolean z) {
                        if (z) {
                            ProgressBar progressBar = prepareextraction.IconCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
                            PlayerControlViewExternalSyntheticLambda1.write(progressBar);
                        } else {
                            ProgressBar progressBar2 = prepareextraction.IconCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar2, "");
                            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(progressBar2);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplApi26Parcelizer(prepareExtraction prepareextraction, SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = prepareextraction;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return zzgo.this.new AudioAttributesImplApi26Parcelizer(this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
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
                setUpdatedStatus<zzhd> setupdatedstatus = zzgo.this.AudioAttributesImplBaseParcelizer().read();
                final zzgo zzgoVar = zzgo.this;
                this.read = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.zzgo.MediaMetadataCompat.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((zzhd) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(zzhd zzhdVar) {
                        if (zzhdVar instanceof zzhd.AudioAttributesCompatParcelizer) {
                            zzgoVar.RatingCompat();
                        } else if (zzhdVar instanceof zzhd.IconCompatParcelizer) {
                            zzgoVar.AudioAttributesCompatParcelizer(((zzhd.IconCompatParcelizer) zzhdVar).read());
                        } else if (zzhdVar instanceof zzhd.RemoteActionCompatParcelizer) {
                            zzgoVar.read(((zzhd.RemoteActionCompatParcelizer) zzhdVar).read());
                        } else if (zzhdVar instanceof zzhd.read) {
                            zzgoVar.AudioAttributesImplBaseParcelizer(((zzhd.read) zzhdVar).RemoteActionCompatParcelizer());
                        } else if (!(zzhdVar instanceof zzhd.write)) {
                            throw new RenewEligibleCreator();
                        }
                        zzgoVar.AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer(listIterator.RemoteActionCompatParcelizer.INSTANCE);
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
            return zzgo.this.new MediaMetadataCompat(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaMetadataCompat) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesImplBaseParcelizer(String p0) {
        Toast toast = this.MediaBrowserCompatItemReceiver;
        if (toast != null) {
            toast.cancel();
        }
        Toast toastMakeText = Toast.makeText(requireContext(), p0, 0);
        this.MediaBrowserCompatItemReceiver = toastMakeText;
        if (toastMakeText != null) {
            toastMakeText.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatMediaItem() {
        prepareExtraction prepareextraction = this.AudioAttributesCompatParcelizer;
        if (prepareextraction == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            prepareextraction = null;
        }
        TextView textView = prepareextraction.MediaBrowserCompatMediaItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        PlayerControlViewExternalSyntheticLambda1.write((View) textView);
        RecyclerView recyclerView = prepareextraction.AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesImplApi21Parcelizer() {
        prepareExtraction prepareextraction = this.AudioAttributesCompatParcelizer;
        if (prepareextraction == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            prepareextraction = null;
        }
        TextView textView = prepareextraction.MediaBrowserCompatMediaItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(textView);
        RecyclerView recyclerView = prepareextraction.AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
        PlayerControlViewExternalSyntheticLambda1.write(recyclerView);
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        prepareExtraction prepareextraction = this.AudioAttributesCompatParcelizer;
        if (prepareextraction == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            prepareextraction = null;
        }
        prepareextraction.AudioAttributesImplBaseParcelizer.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.zzgu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zzgo.MediaBrowserCompatSearchResultReceiver(this.read);
            }
        });
        prepareextraction.write.setOnClickListener(new View.OnClickListener() { // from class: o.zzgx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zzgo.MediaMetadataCompat(this.AudioAttributesCompatParcelizer);
            }
        });
        prepareextraction.read.setOnClickListener(new View.OnClickListener() { // from class: o.zzgv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zzgo.onCommand(this.write);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatSearchResultReceiver(zzgo zzgoVar) {
        zzgoVar.requireActivity().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaMetadataCompat(zzgo zzgoVar) {
        zzgoVar.AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer(listIterator.read.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCommand(zzgo zzgoVar) {
        zzgoVar.AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer(listIterator.read.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write() {
        prepareExtraction prepareextraction = this.AudioAttributesCompatParcelizer;
        if (prepareextraction == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            prepareextraction = null;
        }
        prepareextraction.write.setEnabled(true);
        prepareextraction.write.setClickable(true);
        prepareextraction.write.setAlpha(1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer() {
        prepareExtraction prepareextraction = this.AudioAttributesCompatParcelizer;
        if (prepareextraction == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            prepareextraction = null;
        }
        prepareextraction.write.setEnabled(false);
        prepareextraction.write.setClickable(false);
        prepareextraction.write.setAlpha(0.5f);
    }

    private final void write(String p0) {
        if (!getTrackName.write(requireContext())) {
            String string = getString(R.string.app_error_no_internet);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            AudioAttributesImplBaseParcelizer(string);
        } else {
            maybeGetTypeVariable maybegettypevariableRequireActivity = requireActivity();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(maybegettypevariableRequireActivity, "");
            zzgr.Companion companion = zzgr.INSTANCE;
            CmcdConfigurationRequestConfig.RemoteActionCompatParcelizer(maybegettypevariableRequireActivity, zzgr.Companion.AudioAttributesCompatParcelizer(p0));
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onConfigurationChanged(p0);
        MediaDescriptionCompat();
    }

    private final void MediaDescriptionCompat() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            prepareExtraction prepareextraction = this.AudioAttributesCompatParcelizer;
            if (prepareextraction == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                prepareextraction = null;
            }
            RecyclerView recyclerView = prepareextraction.AudioAttributesImplApi21Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext, recyclerView);
        }
    }

    /* JADX INFO: renamed from: o.zzgo$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/zzgo$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/zzgo;", "AudioAttributesCompatParcelizer", "()Lo/zzgo;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static zzgo AudioAttributesCompatParcelizer() {
            return new zzgo();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(String p0) {
        String str = p0;
        if (str == null || str.length() == 0) {
            return;
        }
        LastLocationRequestBuilder.Companion companion = LastLocationRequestBuilder.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        startActivity(LastLocationRequestBuilder.Companion.write(contextRequireContext, new isFastestIntervalExplicitlySet(p0, null, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(String p0) {
        serializeIterableToIntentExtra.Companion companion = serializeIterableToIntentExtra.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        startActivity(serializeIterableToIntentExtra.Companion.AudioAttributesCompatParcelizer(contextRequireContext, new ConnectionTracker(p0, null, 2, null)));
    }

    @Override // kotlin.zzgy
    public final void IconCompatParcelizer(int p0, String p1) {
        if (!getTrackName.write(requireContext())) {
            String string = getString(R.string.app_error_no_internet);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            AudioAttributesImplBaseParcelizer(string);
            return;
        }
        AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer(new listIterator.AudioAttributesCompatParcelizer(p0, p1));
    }

    @Override // kotlin.zzgy
    public final void write(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        write(p0);
        AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer(new listIterator.AudioAttributesImplApi26Parcelizer(p0, p1));
    }

    @Override // kotlin.zzgy
    public final void IconCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer(new listIterator.MediaBrowserCompatItemReceiver(p0));
    }

    @Override // kotlin.zzgy
    public final void RemoteActionCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer(new listIterator.AudioAttributesImplBaseParcelizer(p0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaMetadataCompat() {
        AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer(listIterator.IconCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RatingCompat() {
        String string = getString(R.string.text_pro_placeholder_dialog_msg, getString(R.string.qbank_module));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        getAutofillClient.Companion companion = getAutofillClient.INSTANCE;
        String string2 = getString(R.string.view_plans);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        String string3 = getString(R.string.go_back);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
        getAutofillClient getautofillclientAudioAttributesCompatParcelizer = getAutofillClient.Companion.AudioAttributesCompatParcelizer(string, null, string2, string3, 0, null, false, false, null, 498);
        this.read = getautofillclientAudioAttributesCompatParcelizer;
        if (getautofillclientAudioAttributesCompatParcelizer != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childFragmentManager, "");
            getBrowserClient.write(getautofillclientAudioAttributesCompatParcelizer, childFragmentManager, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.zzgw
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return zzgo.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(this.write);
                }
            }, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.zzgt
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return zzgo.handleMediaPlayPauseIfPendingOnHandler();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(zzgo zzgoVar) {
        zzgoVar.MediaBrowserCompatSearchResultReceiver();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup handleMediaPlayPauseIfPendingOnHandler() {
        return getShowPopup.INSTANCE;
    }

    private final void MediaBrowserCompatSearchResultReceiver() {
        AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer(listIterator.RemoteActionCompatParcelizer.INSTANCE);
        PlanActivity.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = PlanActivity.RemoteActionCompatParcelizer;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        String lowerCase = "PRO_MCQ_ACCESSED".toLowerCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
        startActivity(PlanActivity.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(contextRequireContext, "Pro Subscription Dialog", lowerCase));
    }
}
