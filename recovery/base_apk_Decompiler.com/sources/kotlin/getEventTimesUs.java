package kotlin;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.marrow.R;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.isValidFrameType;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010#\n\u0002\b\u0003\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u0017\"\u00020\u0018¢\u0006\u0004\b\u0013\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lo/getEventTimesUs;", "Lo/consumeCcData;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lo/argCount;", "", "", "IconCompatParcelizer", "(Lo/argCount;)V", "AudioAttributesCompatParcelizer", "()Z", "", "", "([Ljava/lang/String;)V", "", "write", "Ljava/util/Set;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getEventTimesUs extends consumeCcData {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Set<String> write = new LinkedHashSet();

    @Override // kotlin.consumeCcData, kotlin.addMenuProvider, kotlin.argCount
    public final Dialog onCreateDialog(Bundle p0) {
        final readNon255TerminatedValue readnon255terminatedvalue = new readNon255TerminatedValue(requireContext(), getTheme());
        readnon255terminatedvalue.setCanceledOnTouchOutside(true);
        readnon255terminatedvalue.setOnShowListener(new DialogInterface.OnShowListener() { // from class: o.getStyleIds
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                getEventTimesUs.IconCompatParcelizer(readnon255terminatedvalue, this);
            }
        });
        return readnon255terminatedvalue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(readNon255TerminatedValue readnon255terminatedvalue, getEventTimesUs geteventtimesus) {
        readnon255terminatedvalue.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(true);
        readnon255terminatedvalue.RemoteActionCompatParcelizer().IconCompatParcelizer(3);
        FrameLayout frameLayout = (FrameLayout) readnon255terminatedvalue.findViewById(R.id.design_bottom_sheet);
        if (frameLayout == null) {
            return;
        }
        float dimension = geteventtimesus.getResources().getDimension(R.dimen.corner_radius_16);
        isValidFrameType isvalidframetypeRemoteActionCompatParcelizer = new isValidFrameType.write().AudioAttributesCompatParcelizer(dimension).AudioAttributesImplBaseParcelizer(dimension).IconCompatParcelizer().write().RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(isvalidframetypeRemoteActionCompatParcelizer, "");
        frameSizeBytesByTypeNb framesizebytesbytypenb = new frameSizeBytesByTypeNb(isvalidframetypeRemoteActionCompatParcelizer);
        framesizebytesbytypenb.RemoteActionCompatParcelizer(geteventtimesus.requireContext());
        FrameLayout frameLayout2 = frameLayout;
        framesizebytesbytypenb.AudioAttributesImplApi21Parcelizer(ColorStateList.valueOf(createExtractors.RemoteActionCompatParcelizer(frameLayout2, R.attr.colorSurface)));
        framesizebytesbytypenb.handleMediaPlayPauseIfPendingOnHandler(InvalidTypeIdException.AudioAttributesImplBaseParcelizer(frameLayout2));
        frameLayout.setBackground(framesizebytesbytypenb);
        InvalidTypeIdException.RemoteActionCompatParcelizer(frameLayout2, (ColorStateList) null);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = -2;
        frameLayout.setLayoutParams(layoutParams);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        View viewInflate = p0.inflate(R.layout.overlay_host_bottomsheet, p1, false);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewInflate, "");
        return viewInflate;
    }

    public final void IconCompatParcelizer(argCount argcount) {
        toMagicModuleMetaRepoModel.write(argcount, "");
        argcount.setShowsDialog(false);
        boolean z = getChildFragmentManager().findFragmentById(R.id.overlay_container) != null;
        _doAddInjectable _doaddinjectableWrite = getChildFragmentManager().IconCompatParcelizer().MediaDescriptionCompat().write(R.id.overlay_container, argcount, argcount.getClass().getName());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(_doaddinjectableWrite, "");
        if (z) {
            _doaddinjectableWrite.read(argcount.getClass().getName());
        }
        _doaddinjectableWrite.write();
    }

    public final boolean AudioAttributesCompatParcelizer() {
        if (getChildFragmentManager().onCustomAction() > 0) {
            getChildFragmentManager().onPrepareFromUri();
            return true;
        }
        dismissAllowingStateLoss();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(getEventTimesUs geteventtimesus, String str, Bundle bundle) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        geteventtimesus.getParentFragmentManager().read(str, bundle);
    }

    /* JADX INFO: renamed from: o.getEventTimesUs$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\b"}, d2 = {"Lo/getEventTimesUs$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Landroidx/fragment/app/FragmentManager;", "p0", "Lo/getEventTimesUs;", "read", "(Landroidx/fragment/app/FragmentManager;)Lo/getEventTimesUs;", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static getEventTimesUs read(FragmentManager p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Fragment fragmentFindFragmentByTag = p0.findFragmentByTag("OverlayHostBottomSheet");
            if (fragmentFindFragmentByTag instanceof getEventTimesUs) {
                return (getEventTimesUs) fragmentFindFragmentByTag;
            }
            return null;
        }

        @getMagicModuleMeta
        public static getEventTimesUs write(FragmentManager p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            getEventTimesUs geteventtimesus = read(p0);
            if (geteventtimesus != null) {
                return geteventtimesus;
            }
            getEventTimesUs geteventtimesus2 = new getEventTimesUs();
            geteventtimesus2.setCancelable(true);
            geteventtimesus2.show(p0, "OverlayHostBottomSheet");
            p0.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            return geteventtimesus2;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final void IconCompatParcelizer(String... p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        int length = p0.length;
        for (int i = 0; i < 8; i++) {
            String str = p0[i];
            if (this.write.add(str)) {
                getChildFragmentManager().IconCompatParcelizer(str, this, new _addFields() { // from class: o.TtmlRegion
                    @Override // kotlin._addFields
                    public final void AudioAttributesCompatParcelizer(String str2, Bundle bundle) {
                        getEventTimesUs.IconCompatParcelizer(this.IconCompatParcelizer, str2, bundle);
                    }
                });
            }
        }
    }

    @getMagicModuleMeta
    public static final getEventTimesUs read(FragmentManager fragmentManager) {
        return Companion.read(fragmentManager);
    }

    @getMagicModuleMeta
    public static final getEventTimesUs write(FragmentManager fragmentManager) {
        return Companion.write(fragmentManager);
    }
}
