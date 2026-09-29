package kotlin;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin.getCameraPosition;
import kotlin.getLocations;
import kotlin.hasEvents;
import kotlin.onMapLongClick;
import kotlin.setOnMyLocationClickListener;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0011\u001a\u00020\u00138CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0019\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001c"}, d2 = {"Lo/setInterval;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "AudioAttributesCompatParcelizer", "(I)V", "Lo/getSegmentBaseList;", "write", "Lo/getSegmentBaseList;", "RemoteActionCompatParcelizer", "()Lo/getSegmentBaseList;", "Lo/addGroundOverlay;", "read", "Lo/addGroundOverlay;", "IconCompatParcelizer", "I"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setInterval extends isWaitForAccurateLocation {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private int read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private addGroundOverlay IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private getSegmentBaseList RemoteActionCompatParcelizer;

    public setInterval() {
        Uri uri = Uri.EMPTY;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(uri, "");
        Uri uri2 = Uri.EMPTY;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(uri2, "");
        this.IconCompatParcelizer = new addGroundOverlay("", uri, uri2);
    }

    private final getSegmentBaseList write() {
        getSegmentBaseList getsegmentbaselist = this.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(getsegmentbaselist);
        return getsegmentbaselist;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.RemoteActionCompatParcelizer = getSegmentBaseList.RemoteActionCompatParcelizer(p0, p1);
        ConstraintLayout constraintLayoutIconCompatParcelizer = write().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer, "");
        return constraintLayoutIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        Bundle arguments = getArguments();
        this.read = arguments != null ? arguments.getInt(LoggedUserResponse.KEY_KYC_STATUS) : 1;
        final MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer = new MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer();
        iconCompatParcelizer.AudioAttributesCompatParcelizer = this.read == 7 ? 5 : 1;
        getChildFragmentManager().IconCompatParcelizer("parent", this, new _addFields() { // from class: o.setMaxWaitTime
            @Override // kotlin._addFields
            public final void AudioAttributesCompatParcelizer(String str, Bundle bundle) {
                setInterval.AudioAttributesCompatParcelizer(iconCompatParcelizer, this, str, bundle);
            }
        });
        if (p1 == null) {
            AudioAttributesCompatParcelizer(iconCompatParcelizer.AudioAttributesCompatParcelizer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer, setInterval setinterval, String str, Bundle bundle) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        iconCompatParcelizer.AudioAttributesCompatParcelizer = bundle.getInt("page_change");
        addGroundOverlay addgroundoverlay = setinterval.IconCompatParcelizer;
        String string = bundle.getString("doc_type_title");
        if (string == null) {
            string = setinterval.IconCompatParcelizer.read();
        }
        addgroundoverlay.write(string);
        setinterval.IconCompatParcelizer.RemoteActionCompatParcelizer(bundle.getInt("doc_type"));
        addGroundOverlay addgroundoverlay2 = setinterval.IconCompatParcelizer;
        Uri uri = (Uri) bundle.getParcelable("front_image");
        if (uri == null) {
            uri = Uri.EMPTY;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(uri, "");
        }
        addgroundoverlay2.RemoteActionCompatParcelizer(uri);
        addGroundOverlay addgroundoverlay3 = setinterval.IconCompatParcelizer;
        Uri uri2 = (Uri) bundle.getParcelable("back_image");
        if (uri2 == null) {
            uri2 = Uri.EMPTY;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(uri2, "");
        }
        addgroundoverlay3.IconCompatParcelizer(uri2);
        setinterval.AudioAttributesCompatParcelizer(iconCompatParcelizer.AudioAttributesCompatParcelizer);
    }

    private final void AudioAttributesCompatParcelizer(int p0) {
        hasEvents haseventsWrite;
        if (p0 == 1) {
            hasEvents.Companion companion = hasEvents.INSTANCE;
            haseventsWrite = hasEvents.Companion.write(this.read);
        } else if (p0 == 2) {
            setOnMyLocationClickListener.Companion companion2 = setOnMyLocationClickListener.INSTANCE;
            haseventsWrite = setOnMyLocationClickListener.Companion.AudioAttributesCompatParcelizer(this.read);
        } else if (p0 == 3) {
            onMapLongClick.Companion companion3 = onMapLongClick.INSTANCE;
            haseventsWrite = onMapLongClick.Companion.read(this.read, this.IconCompatParcelizer.read(), this.IconCompatParcelizer.write());
        } else if (p0 == 4) {
            getCameraPosition.Companion companion4 = getCameraPosition.INSTANCE;
            haseventsWrite = getCameraPosition.Companion.AudioAttributesCompatParcelizer(this.IconCompatParcelizer.read(), this.IconCompatParcelizer.IconCompatParcelizer(), this.read);
        } else if (p0 == 5) {
            getLocations.Companion companion5 = getLocations.INSTANCE;
            haseventsWrite = getLocations.Companion.IconCompatParcelizer(this.read);
        } else {
            hasEvents.Companion companion6 = hasEvents.INSTANCE;
            haseventsWrite = hasEvents.Companion.write(this.read);
        }
        CmcdConfigurationRequestConfig.RemoteActionCompatParcelizer(this, write().write.getId(), haseventsWrite);
    }

    /* JADX INFO: renamed from: o.setInterval$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/setInterval$RemoteActionCompatParcelizer;", "", "<init>", "()V", "", "p0", "Lo/setInterval;", "IconCompatParcelizer", "(I)Lo/setInterval;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static setInterval IconCompatParcelizer(int p0) {
            setInterval setinterval = new setInterval();
            Bundle bundle = new Bundle();
            bundle.putInt(LoggedUserResponse.KEY_KYC_STATUS, p0);
            setinterval.setArguments(bundle);
            return setinterval;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
