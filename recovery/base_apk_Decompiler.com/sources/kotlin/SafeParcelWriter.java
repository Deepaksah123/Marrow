package kotlin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.util.DeviceProperties;
import com.marrow.R;
import com.marrow.ui.views.TimerView;
import com.marrow2.data.user.remote.model.onboarding.UserBasicDetails;
import com.marrow2.ui.onboarding.phone.PhoneLoginViewModel;
import java.util.List;
import kotlin.ActivityLifecycleObserver;
import kotlin.Metadata;
import kotlin.SafeParcelWriter;
import kotlin.StringResourceValueReader;
import kotlin.VisibilityChecker;
import kotlin.getAnchorU;
import kotlin.setWatermarkEnabled;
import kotlin.shouldEscapeCharacter;
import kotlin.writeDoubleArray;
import kotlin.writeIBinderSparseArray;
import kotlin.writeInt;
import kotlin.writeLongList;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0003J5\u0010\u0019\u001a\u00020\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0007\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u0003J\u001f\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001e\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001f\u0010\u0003R\u001b\u0010\u001c\u001a\u00020 8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b\"\u0010#R\u0018\u0010\u0010\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010%R\u0014\u0010&\u001a\u00020$8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'"}, d2 = {"Lo/SafeParcelWriter;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "read", "MediaBrowserCompatCustomActionResultReceiver", "onStop", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplBaseParcelizer", "", "Lcom/marrow2/data/user/remote/model/onboarding/UserBasicDetails;", "", "p3", "RemoteActionCompatParcelizer", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "write", "(Ljava/lang/String;)V", "IconCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "Lcom/marrow2/ui/onboarding/phone/PhoneLoginViewModel;", "Lo/RenewEligible;", "MediaBrowserCompatItemReceiver", "()Lcom/marrow2/ui/onboarding/phone/PhoneLoginViewModel;", "Lo/lambdaloadPlaylistInternal0comgoogleandroidexoplayer2sourcehlsplaylistDefaultHlsPlaylistTrackerMediaPlaylistBundle;", "Lo/lambdaloadPlaylistInternal0comgoogleandroidexoplayer2sourcehlsplaylistDefaultHlsPlaylistTrackerMediaPlaylistBundle;", "AudioAttributesCompatParcelizer", "()Lo/lambdaloadPlaylistInternal0comgoogleandroidexoplayer2sourcehlsplaylistDefaultHlsPlaylistTrackerMediaPlaylistBundle;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SafeParcelWriter extends skipUnknownField {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private lambdaloadPlaylistInternal0comgoogleandroidexoplayer2sourcehlsplaylistDefaultHlsPlaylistTrackerMediaPlaylistBundle read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final RenewEligible write;

    public SafeParcelWriter() {
        SafeParcelWriter safeParcelWriter = this;
        this.write = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(PhoneLoginViewModel.class), new AnonymousClass3(safeParcelWriter), new AnonymousClass2(safeParcelWriter), new AnonymousClass4(safeParcelWriter));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PhoneLoginViewModel MediaBrowserCompatItemReceiver() {
        return (PhoneLoginViewModel) this.write.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final lambdaloadPlaylistInternal0comgoogleandroidexoplayer2sourcehlsplaylistDefaultHlsPlaylistTrackerMediaPlaylistBundle AudioAttributesCompatParcelizer() {
        lambdaloadPlaylistInternal0comgoogleandroidexoplayer2sourcehlsplaylistDefaultHlsPlaylistTrackerMediaPlaylistBundle lambdaloadplaylistinternal0comgoogleandroidexoplayer2sourcehlsplaylistdefaulthlsplaylisttrackermediaplaylistbundle = this.read;
        toMagicModuleMetaRepoModel.write(lambdaloadplaylistinternal0comgoogleandroidexoplayer2sourcehlsplaylistdefaulthlsplaylisttrackermediaplaylistbundle);
        return lambdaloadplaylistinternal0comgoogleandroidexoplayer2sourcehlsplaylistdefaulthlsplaylisttrackermediaplaylistbundle;
    }

    /* JADX INFO: renamed from: o.SafeParcelWriter$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/SafeParcelWriter$IconCompatParcelizer;", "", "<init>", "()V", "Lo/SafeParcelWriter;", "AudioAttributesCompatParcelizer", "()Lo/SafeParcelWriter;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static SafeParcelWriter AudioAttributesCompatParcelizer() {
            return new SafeParcelWriter();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static final class MediaBrowserCompatItemReceiver extends onRemoveQueueItemAt {
        MediaBrowserCompatItemReceiver() {
            super(true);
        }

        @Override // kotlin.onRemoveQueueItemAt
        public final void handleOnBackPressed() {
            FragmentManager childFragmentManager = SafeParcelWriter.this.getChildFragmentManager();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childFragmentManager, "");
            if (childFragmentManager.onCustomAction() > 0) {
                childFragmentManager.onPrepareFromUri();
            } else {
                setEnabled(false);
                SafeParcelWriter.this.requireActivity().onBackPressed();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = new MediaBrowserCompatItemReceiver();
        onSetRating iconCompatParcelizer = requireActivity().getIconCompatParcelizer();
        hasGetter viewLifecycleOwner = getViewLifecycleOwner();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewLifecycleOwner, "");
        iconCompatParcelizer.AudioAttributesCompatParcelizer(viewLifecycleOwner, mediaBrowserCompatItemReceiver);
        this.read = lambdaloadPlaylistInternal0comgoogleandroidexoplayer2sourcehlsplaylistDefaultHlsPlaylistTrackerMediaPlaylistBundle.RemoteActionCompatParcelizer(p0, p1);
        ConstraintLayout constraintLayoutIconCompatParcelizer = AudioAttributesCompatParcelizer().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer, "");
        return constraintLayoutIconCompatParcelizer;
    }

    public static final class write implements TextWatcher {
        private /* synthetic */ getAdjuster read;

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public write(getAdjuster getadjuster) {
            this.read = getadjuster;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            if (String.valueOf(editable).length() >= 4) {
                AppCompatButton appCompatButton = this.read.AudioAttributesCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(appCompatButton, "");
                bytesRead.read(appCompatButton);
            } else {
                AppCompatButton appCompatButton2 = this.read.AudioAttributesCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(appCompatButton2, "");
                bytesRead.AudioAttributesCompatParcelizer(appCompatButton2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        read();
        dispatchTouchEvent.write(AudioAttributesCompatParcelizer().write.IconCompatParcelizer);
        AudioAttributesImplApi26Parcelizer();
        AudioAttributesImplBaseParcelizer();
        MediaBrowserCompatCustomActionResultReceiver();
    }

    private final void read() {
        Toolbar toolbar = AudioAttributesCompatParcelizer().MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(toolbar, "");
        getHttpMethodString.read((View) toolbar, true, false, true, true, 0, 50);
        ViewFlipper viewFlipper = AudioAttributesCompatParcelizer().AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFlipper, "");
        getHttpMethodString.read((View) viewFlipper, false, false, true, true, 0, 51);
        LinearLayout linearLayout = AudioAttributesCompatParcelizer().read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        getHttpMethodString.read((View) linearLayout, false, true, true, true, 0, 49);
        TextView textView = AudioAttributesCompatParcelizer().AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        getHttpMethodString.read((View) textView, false, true, true, true, 0, 49);
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            ViewFlipper viewFlipper = AudioAttributesCompatParcelizer().AudioAttributesImplBaseParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFlipper, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext, viewFlipper);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        maybeGetTypeVariable activity = getActivity();
        Object systemService = activity != null ? activity.getSystemService("input_method") : null;
        toMagicModuleMetaRepoModel.read(systemService, "");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        View view = getView();
        inputMethodManager.hideSoftInputFromWindow(view != null ? view.getWindowToken() : null, 0);
        shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
        shouldEscapeCharacter.Companion.IconCompatParcelizer((View) AudioAttributesCompatParcelizer().write.IconCompatParcelizer);
        shouldEscapeCharacter.Companion companion2 = shouldEscapeCharacter.INSTANCE;
        shouldEscapeCharacter.Companion.IconCompatParcelizer((View) AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer.write);
        super.onStop();
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        AudioAttributesCompatParcelizer().MediaBrowserCompatItemReceiver.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.finishObjectHeader
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SafeParcelWriter.MediaBrowserCompatItemReceiver(this.RemoteActionCompatParcelizer);
            }
        });
        final TimestampAdjusterProvider timestampAdjusterProvider = AudioAttributesCompatParcelizer().write;
        Button button = timestampAdjusterProvider.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button, "");
        bytesRead.IconCompatParcelizer(button, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.writeBigDecimal
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return SafeParcelWriter.IconCompatParcelizer(this.IconCompatParcelizer, timestampAdjusterProvider);
            }
        });
        Button button2 = timestampAdjusterProvider.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button2, "");
        bytesRead.IconCompatParcelizer(button2, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.writeBigDecimalArray
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return SafeParcelWriter.RatingCompat(this.read);
            }
        });
        final getAdjuster getadjuster = AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer;
        EditText editText = getadjuster.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(editText, "");
        editText.addTextChangedListener(new write(getadjuster));
        TimerView timerView = getadjuster.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(timerView, "");
        bytesRead.IconCompatParcelizer(timerView, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.beginObjectHeader
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return SafeParcelWriter.MediaDescriptionCompat(this.IconCompatParcelizer);
            }
        });
        AppCompatButton appCompatButton = getadjuster.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(appCompatButton, "");
        bytesRead.IconCompatParcelizer(appCompatButton, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.writeBigInteger
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return SafeParcelWriter.write(this.AudioAttributesCompatParcelizer, getadjuster);
            }
        });
        TextView textView = AudioAttributesCompatParcelizer().IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        bytesRead.IconCompatParcelizer(textView, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.writeBooleanObject
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return SafeParcelWriter.MediaMetadataCompat(this.AudioAttributesCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatItemReceiver(SafeParcelWriter safeParcelWriter) {
        maybeGetTypeVariable activity = safeParcelWriter.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(SafeParcelWriter safeParcelWriter, TimestampAdjusterProvider timestampAdjusterProvider) {
        safeParcelWriter.MediaBrowserCompatItemReceiver().write(new writeIBinderSparseArray.IconCompatParcelizer(timestampAdjusterProvider.RemoteActionCompatParcelizer.getText().toString(), timestampAdjusterProvider.IconCompatParcelizer.getText().toString(), limit.AudioAttributesCompatParcelizer));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RatingCompat(SafeParcelWriter safeParcelWriter) {
        safeParcelWriter.MediaBrowserCompatItemReceiver().write(writeIBinderSparseArray.RemoteActionCompatParcelizer.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaDescriptionCompat(SafeParcelWriter safeParcelWriter) {
        safeParcelWriter.MediaBrowserCompatItemReceiver().write(writeIBinderSparseArray.write.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(SafeParcelWriter safeParcelWriter, getAdjuster getadjuster) {
        safeParcelWriter.MediaBrowserCompatItemReceiver().write(new writeIBinderSparseArray.read(getadjuster.write.getText().toString()));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: renamed from: o.SafeParcelWriter$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "AudioAttributesCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ Fragment $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return this.$IconCompatParcelizer.requireActivity().getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment) {
            super(0);
            this.$IconCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.SafeParcelWriter$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "IconCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ Fragment $IconCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $read = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
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
    public static final getShowPopup MediaMetadataCompat(SafeParcelWriter safeParcelWriter) {
        TimestampAdjusterProvider timestampAdjusterProvider = safeParcelWriter.AudioAttributesCompatParcelizer().write;
        safeParcelWriter.MediaBrowserCompatItemReceiver().write(new writeIBinderSparseArray.IconCompatParcelizer(timestampAdjusterProvider.RemoteActionCompatParcelizer.getText().toString(), timestampAdjusterProvider.IconCompatParcelizer.getText().toString(), limit.IconCompatParcelizer));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: renamed from: o.SafeParcelWriter$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "AudioAttributesCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            return this.$read.requireActivity().getDefaultViewModelProviderFactory();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Fragment fragment) {
            super(0);
            this.$read = fragment;
        }
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<writeIBinderList> setupdatedstatusIconCompatParcelizer = SafeParcelWriter.this.MediaBrowserCompatItemReceiver().IconCompatParcelizer();
                final SafeParcelWriter safeParcelWriter = SafeParcelWriter.this;
                this.write = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.SafeParcelWriter.read.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((writeIBinderList) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(writeIBinderList writeibinderlist) {
                        safeParcelWriter.AudioAttributesCompatParcelizer().AudioAttributesImplBaseParcelizer.setDisplayedChild(writeibinderlist.getRead());
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
            return SafeParcelWriter.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplBaseParcelizer() {
        SafeParcelWriter safeParcelWriter = this;
        setBitrateKbps.read(safeParcelWriter, new read(null));
        setBitrateKbps.read(safeParcelWriter, new RemoteActionCompatParcelizer(null));
        setBitrateKbps.read(safeParcelWriter, new AudioAttributesCompatParcelizer(null));
        setBitrateKbps.read(safeParcelWriter, new AudioAttributesImplApi21Parcelizer(null));
        setBitrateKbps.read(safeParcelWriter, new MediaBrowserCompatCustomActionResultReceiver(null));
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        /* JADX INFO: renamed from: o.SafeParcelWriter$RemoteActionCompatParcelizer$1, reason: invalid class name */
        static final class AnonymousClass1<T> implements getValidationToken {
            private /* synthetic */ SafeParcelWriter write;

            @Override // kotlin.getValidationToken
            public final /* synthetic */ Object IconCompatParcelizer(Object obj, SampleVideos sampleVideos) {
                return read((writeInt) obj);
            }

            private Object read(final writeInt writeint) {
                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(writeint, writeInt.read.INSTANCE)) {
                    if (writeint instanceof writeInt.MediaBrowserCompatItemReceiver) {
                        writeInt.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = (writeInt.MediaBrowserCompatItemReceiver) writeint;
                        this.write.RemoteActionCompatParcelizer(mediaBrowserCompatItemReceiver.write(), mediaBrowserCompatItemReceiver.IconCompatParcelizer());
                    } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(writeint, writeInt.AudioAttributesImplApi26Parcelizer.INSTANCE)) {
                        this.write.AudioAttributesImplApi21Parcelizer();
                    } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(writeint, writeInt.AudioAttributesImplBaseParcelizer.INSTANCE)) {
                        this.write.AudioAttributesCompatParcelizer().write.RemoteActionCompatParcelizer.requestFocus();
                        SafeParcelWriter safeParcelWriter = this.write;
                        SafeParcelWriter safeParcelWriter2 = safeParcelWriter;
                        String string = safeParcelWriter.getString(R.string.error_country_code_empty);
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                        CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(safeParcelWriter2, string, 0);
                    } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(writeint, writeInt.RatingCompat.INSTANCE)) {
                        this.write.AudioAttributesCompatParcelizer().write.RemoteActionCompatParcelizer.requestFocus();
                        SafeParcelWriter safeParcelWriter3 = this.write;
                        SafeParcelWriter safeParcelWriter4 = safeParcelWriter3;
                        String string2 = safeParcelWriter3.getString(R.string.error_country_code_invalid);
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
                        CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(safeParcelWriter4, string2, 0);
                    } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(writeint, writeInt.MediaMetadataCompat.INSTANCE)) {
                        this.write.AudioAttributesCompatParcelizer().write.IconCompatParcelizer.requestFocus();
                        SafeParcelWriter safeParcelWriter5 = this.write;
                        SafeParcelWriter safeParcelWriter6 = safeParcelWriter5;
                        String string3 = safeParcelWriter5.getString(R.string.error_phone_number_empty);
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
                        CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(safeParcelWriter6, string3, 0);
                    } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(writeint, writeInt.MediaBrowserCompatSearchResultReceiver.INSTANCE)) {
                        this.write.AudioAttributesCompatParcelizer().write.IconCompatParcelizer.requestFocus();
                        SafeParcelWriter safeParcelWriter7 = this.write;
                        SafeParcelWriter safeParcelWriter8 = safeParcelWriter7;
                        String string4 = safeParcelWriter7.getString(R.string.invalid_mobile_number);
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string4, "");
                        CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(safeParcelWriter8, string4, 0);
                    } else if (writeint instanceof writeInt.MediaDescriptionCompat) {
                        shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
                        shouldEscapeCharacter.Companion.IconCompatParcelizer((View) this.write.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer.write);
                        Handler handler = new Handler(Looper.getMainLooper());
                        final SafeParcelWriter safeParcelWriter9 = this.write;
                        handler.postDelayed(new Runnable() { // from class: o.writeBooleanArray
                            @Override // java.lang.Runnable
                            public final void run() {
                                SafeParcelWriter.RemoteActionCompatParcelizer.AnonymousClass1.read(safeParcelWriter9, writeint);
                            }
                        }, 500L);
                    } else if (writeint instanceof writeInt.MediaBrowserCompatCustomActionResultReceiver) {
                        writeInt.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = (writeInt.MediaBrowserCompatCustomActionResultReceiver) writeint;
                        this.write.RemoteActionCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver.read(), mediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(), mediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(), mediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer());
                    } else if (writeint instanceof writeInt.AudioAttributesImplApi21Parcelizer) {
                        SafeParcelWriter safeParcelWriter10 = this.write;
                        ActivityLifecycleObserver.Companion companion2 = ActivityLifecycleObserver.INSTANCE;
                        Context contextRequireContext = this.write.requireContext();
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                        safeParcelWriter10.startActivity(ActivityLifecycleObserver.Companion.RemoteActionCompatParcelizer(contextRequireContext, ((writeInt.AudioAttributesImplApi21Parcelizer) writeint).AudioAttributesCompatParcelizer()));
                        this.write.requireActivity().finish();
                    } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(writeint, writeInt.AudioAttributesCompatParcelizer.INSTANCE)) {
                        shouldEscapeCharacter.Companion companion3 = shouldEscapeCharacter.INSTANCE;
                        shouldEscapeCharacter.Companion.IconCompatParcelizer((View) this.write.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer.write);
                    } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(writeint, writeInt.write.INSTANCE)) {
                        shouldEscapeCharacter.Companion companion4 = shouldEscapeCharacter.INSTANCE;
                        shouldEscapeCharacter.Companion.IconCompatParcelizer((View) this.write.AudioAttributesCompatParcelizer().write.IconCompatParcelizer);
                    } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(writeint, writeInt.RemoteActionCompatParcelizer.INSTANCE)) {
                        getAnchorU.Companion companion5 = getAnchorU.INSTANCE;
                        Context contextRequireContext2 = this.write.requireContext();
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
                        Intent intentIconCompatParcelizer = getAnchorU.Companion.IconCompatParcelizer(contextRequireContext2);
                        intentIconCompatParcelizer.setFlags(268468224);
                        this.write.startActivity(intentIconCompatParcelizer);
                        this.write.requireActivity().finish();
                    } else {
                        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(writeint, writeInt.IconCompatParcelizer.INSTANCE)) {
                            throw new RenewEligibleCreator();
                        }
                        setWatermarkEnabled.Companion companion6 = setWatermarkEnabled.INSTANCE;
                        Context contextRequireContext3 = this.write.requireContext();
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext3, "");
                        Intent intentAudioAttributesCompatParcelizer = setWatermarkEnabled.Companion.AudioAttributesCompatParcelizer(contextRequireContext3, false, false, 6);
                        intentAudioAttributesCompatParcelizer.setFlags(268468224);
                        this.write.startActivity(intentAudioAttributesCompatParcelizer);
                        this.write.requireActivity().finish();
                    }
                }
                this.write.MediaBrowserCompatItemReceiver().write(writeIBinderSparseArray.AudioAttributesCompatParcelizer.INSTANCE);
                return getShowPopup.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void read(SafeParcelWriter safeParcelWriter, writeInt writeint) {
                if (safeParcelWriter.isVisible()) {
                    CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(safeParcelWriter, ((writeInt.MediaDescriptionCompat) writeint).getRemoteActionCompatParcelizer(), 0);
                }
            }

            AnonymousClass1(SafeParcelWriter safeParcelWriter) {
                this.write = safeParcelWriter;
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (SafeParcelWriter.this.MediaBrowserCompatItemReceiver().MediaBrowserCompatItemReceiver().write(new AnonymousClass1(SafeParcelWriter.this), this) == objIconCompatParcelizer) {
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
            return SafeParcelWriter.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
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
                setUpdatedStatus<Boolean> setupdatedstatusMediaBrowserCompatCustomActionResultReceiver = SafeParcelWriter.this.MediaBrowserCompatItemReceiver().MediaBrowserCompatCustomActionResultReceiver();
                final SafeParcelWriter safeParcelWriter = SafeParcelWriter.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusMediaBrowserCompatCustomActionResultReceiver.write(new getValidationToken() { // from class: o.SafeParcelWriter.AudioAttributesCompatParcelizer.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer(((Boolean) obj2).booleanValue());
                    }

                    private Object AudioAttributesCompatParcelizer(boolean z) {
                        ProgressBar progressBar = safeParcelWriter.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
                        progressBar.setVisibility(z ? 0 : 8);
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
            return SafeParcelWriter.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isDark<writeIntArray> isdark = SafeParcelWriter.this.MediaBrowserCompatItemReceiver().read();
                final SafeParcelWriter safeParcelWriter = SafeParcelWriter.this;
                this.read = 1;
                if (isdark.write(new getValidationToken() { // from class: o.SafeParcelWriter.AudioAttributesImplApi21Parcelizer.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((writeIntArray) obj2);
                    }

                    private Object read(writeIntArray writeintarray) {
                        safeParcelWriter.IconCompatParcelizer(writeintarray.getIconCompatParcelizer(), writeintarray.getAudioAttributesCompatParcelizer());
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
            return SafeParcelWriter.this.new AudioAttributesImplApi21Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
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
                setUpdatedStatus<writeFloatSparseArray> setupdatedstatusAudioAttributesCompatParcelizer = SafeParcelWriter.this.MediaBrowserCompatItemReceiver().AudioAttributesCompatParcelizer();
                final SafeParcelWriter safeParcelWriter = SafeParcelWriter.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.SafeParcelWriter.MediaBrowserCompatCustomActionResultReceiver.1

                    /* JADX INFO: renamed from: o.SafeParcelWriter$MediaBrowserCompatCustomActionResultReceiver$1$write */
                    public static final /* synthetic */ class write {
                        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

                        static {
                            int[] iArr = new int[writeDoubleSparseArray.values().length];
                            try {
                                iArr[writeDoubleSparseArray.read.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[writeDoubleSparseArray.AudioAttributesCompatParcelizer.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[writeDoubleSparseArray.RemoteActionCompatParcelizer.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            RemoteActionCompatParcelizer = iArr;
                        }
                    }

                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((writeFloatSparseArray) obj2);
                    }

                    private Object read(writeFloatSparseArray writefloatsparsearray) {
                        int i2 = write.RemoteActionCompatParcelizer[writefloatsparsearray.getAudioAttributesCompatParcelizer().ordinal()];
                        if (i2 == 1) {
                            SafeParcelWriter safeParcelWriter2 = safeParcelWriter;
                            String string = safeParcelWriter2.getString(R.string.text_resend_otp);
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                            safeParcelWriter2.write(string);
                            safeParcelWriter.write();
                        } else if (i2 != 2) {
                            if (i2 != 3) {
                                throw new RenewEligibleCreator();
                            }
                            SafeParcelWriter safeParcelWriter3 = safeParcelWriter;
                            String string2 = safeParcelWriter3.getString(R.string.btn_call_me);
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
                            safeParcelWriter3.write(string2);
                            safeParcelWriter.write();
                        }
                        if (writefloatsparsearray.getRead().length() > 0) {
                            safeParcelWriter.RemoteActionCompatParcelizer();
                            SafeParcelWriter safeParcelWriter4 = safeParcelWriter;
                            String string3 = safeParcelWriter4.getString(R.string.f_call_me, writefloatsparsearray.getRead());
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
                            safeParcelWriter4.write(string3);
                        }
                        LinearLayout linearLayout = safeParcelWriter.AudioAttributesCompatParcelizer().read;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
                        linearLayout.setVisibility(writefloatsparsearray.getIconCompatParcelizer() ? 0 : 8);
                        TextView textView = safeParcelWriter.AudioAttributesCompatParcelizer().AudioAttributesImplApi26Parcelizer;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
                        textView.setVisibility(writefloatsparsearray.getMediaBrowserCompatCustomActionResultReceiver() ? 0 : 8);
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
            return SafeParcelWriter.this.new MediaBrowserCompatCustomActionResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(List<UserBasicDetails> p0, String p1, String p2, String p3) {
        writeLongList.Companion companion = writeLongList.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        startActivity(writeLongList.Companion.read(contextRequireContext, p0, p1, p2, p3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(String p0, String p1) {
        shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
        shouldEscapeCharacter.Companion.IconCompatParcelizer((View) AudioAttributesCompatParcelizer().write.IconCompatParcelizer);
        writeDoubleArray.Companion companion2 = writeDoubleArray.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        startActivity(writeDoubleArray.Companion.AudioAttributesCompatParcelizer(contextRequireContext, p0, p1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(String p0) {
        AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer.setText(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer() {
        TimerView timerView = AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(timerView, "");
        bytesRead.AudioAttributesCompatParcelizer(timerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(String p0, String p1) {
        AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer.read.setText(getString(R.string.f_title_enter_otp, p0, p1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write() {
        TimerView timerView = AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(timerView, "");
        bytesRead.read(timerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesImplApi21Parcelizer() {
        StringResourceValueReader.Companion companion = StringResourceValueReader.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        startActivity(StringResourceValueReader.Companion.read(contextRequireContext));
        maybeGetTypeVariable activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }
}
