package kotlin;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.util.DeviceProperties;
import kotlin.Metadata;
import kotlin.StringResourceValueReader;
import kotlin.icon;
import kotlin.shouldEscapeCharacter;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0003R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00158CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lo/writeDouble;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "read", "AudioAttributesImplApi26Parcelizer", "RemoteActionCompatParcelizer", "onResume", "AudioAttributesCompatParcelizer", "Lo/DefaultHlsPlaylistTrackerMediaPlaylistBundleExternalSyntheticLambda0;", "Lo/DefaultHlsPlaylistTrackerMediaPlaylistBundleExternalSyntheticLambda0;", "write", "()Lo/DefaultHlsPlaylistTrackerMediaPlaylistBundleExternalSyntheticLambda0;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class writeDouble extends writeDoubleList {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private DefaultHlsPlaylistTrackerMediaPlaylistBundleExternalSyntheticLambda0 RemoteActionCompatParcelizer;

    private final DefaultHlsPlaylistTrackerMediaPlaylistBundleExternalSyntheticLambda0 write() {
        DefaultHlsPlaylistTrackerMediaPlaylistBundleExternalSyntheticLambda0 defaultHlsPlaylistTrackerMediaPlaylistBundleExternalSyntheticLambda0 = this.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(defaultHlsPlaylistTrackerMediaPlaylistBundleExternalSyntheticLambda0);
        return defaultHlsPlaylistTrackerMediaPlaylistBundleExternalSyntheticLambda0;
    }

    /* JADX INFO: renamed from: o.writeDouble$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/writeDouble$read;", "", "<init>", "()V", "", "p0", "p1", "Lo/writeDouble;", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;)Lo/writeDouble;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static writeDouble AudioAttributesCompatParcelizer(String p0, String p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            writeDouble writedouble = new writeDouble();
            Bundle bundle = new Bundle();
            StringBuilder sb = new StringBuilder();
            sb.append(p0);
            sb.append(" ");
            sb.append(p1);
            bundle.putString("phone_number", sb.toString());
            writedouble.setArguments(bundle);
            return writedouble;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.RemoteActionCompatParcelizer = DefaultHlsPlaylistTrackerMediaPlaylistBundleExternalSyntheticLambda0.RemoteActionCompatParcelizer(p0, p1);
        return write().IconCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        read();
        RemoteActionCompatParcelizer();
        AudioAttributesCompatParcelizer();
        AudioAttributesImplApi26Parcelizer();
    }

    private final void read() {
        Toolbar toolbar = write().AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(toolbar, "");
        getHttpMethodString.read((View) toolbar, true, false, true, true, 0, 50);
        ScrollView scrollView = write().write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollView, "");
        getHttpMethodString.read((View) scrollView, false, true, true, true, 0, 49);
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            ConstraintLayout constraintLayout = write().AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext, constraintLayout);
        }
    }

    private final void RemoteActionCompatParcelizer() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("phone_number") : null;
        if (string == null) {
            string = "";
        }
        write().read.setText(string);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
        shouldEscapeCharacter.Companion.IconCompatParcelizer(write().read);
        super.onResume();
    }

    private final void AudioAttributesCompatParcelizer() {
        DefaultHlsPlaylistTrackerMediaPlaylistBundleExternalSyntheticLambda0 defaultHlsPlaylistTrackerMediaPlaylistBundleExternalSyntheticLambda0Write = write();
        RelativeLayout relativeLayout = defaultHlsPlaylistTrackerMediaPlaylistBundleExternalSyntheticLambda0Write.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(relativeLayout, "");
        bytesRead.IconCompatParcelizer(relativeLayout, new writeChar(this));
        defaultHlsPlaylistTrackerMediaPlaylistBundleExternalSyntheticLambda0Write.AudioAttributesImplBaseParcelizer.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.writeFloat
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                writeDouble.MediaBrowserCompatItemReceiver(this.AudioAttributesCompatParcelizer);
            }
        });
        Button button = defaultHlsPlaylistTrackerMediaPlaylistBundleExternalSyntheticLambda0Write.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button, "");
        bytesRead.IconCompatParcelizer(button, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.writeFloatArray
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return writeDouble.AudioAttributesImplBaseParcelizer(this.IconCompatParcelizer);
            }
        });
        TextView textView = defaultHlsPlaylistTrackerMediaPlaylistBundleExternalSyntheticLambda0Write.MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        bytesRead.IconCompatParcelizer(textView, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.writeFloatList
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return writeDouble.MediaBrowserCompatCustomActionResultReceiver(this.write);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(writeDouble writedouble) {
        maybeGetTypeVariable activity = writedouble.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatItemReceiver(writeDouble writedouble) {
        maybeGetTypeVariable activity = writedouble.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplBaseParcelizer(writeDouble writedouble) {
        StringResourceValueReader.Companion readVar = StringResourceValueReader.INSTANCE;
        Context contextRequireContext = writedouble.requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        writedouble.startActivity(StringResourceValueReader.Companion.read(contextRequireContext));
        maybeGetTypeVariable activity = writedouble.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(writeDouble writedouble) {
        icon.Companion readVar = icon.INSTANCE;
        Context contextRequireContext = writedouble.requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        writedouble.startActivity(icon.Companion.read(contextRequireContext));
        return getShowPopup.INSTANCE;
    }
}
