package kotlin;

import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.PlanActivity;
import kotlin.PlanContractPresenter;
import kotlin.PlanContractView;
import kotlin.SettingsItem;
import kotlin.SettingsResultToggleChanged;
import kotlin.VideoTimelineItem;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0007\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0007\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017"}, d2 = {"Lo/OptionItemSeekOptionItem;", "Lo/SettingsItem;", "<init>", "()V", "Ljavax/net/ssl/X509TrustManager;", "p0", "Lo/getSubscriptionDataProvider;", "IconCompatParcelizer", "(Ljavax/net/ssl/X509TrustManager;)Lo/getSubscriptionDataProvider;", "Ljavax/net/ssl/SSLSocket;", "", "p1", "", "Lo/ThemeKtExternalSyntheticLambda1;", "p2", "", "RemoteActionCompatParcelizer", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "AudioAttributesCompatParcelizer", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "", "(Ljava/lang/String;)Z", "Lo/PlanPresenter;", "Ljava/util/List;", "read", "write"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OptionItemSeekOptionItem extends SettingsItem {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final List<PlanPresenter> read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final boolean read = SettingsItem.IconCompatParcelizer.RemoteActionCompatParcelizer();

    public OptionItemSeekOptionItem() {
        SettingsResultToggleChanged.Companion remoteActionCompatParcelizer = SettingsResultToggleChanged.INSTANCE;
        PlanActivity.Companion readVar = PlanActivity.INSTANCE;
        PlanContractPresenter.Companion readVar2 = PlanContractPresenter.INSTANCE;
        PlanContractView.Companion audioAttributesCompatParcelizer = PlanContractView.INSTANCE;
        List list = IntermediateLoginResponseBody.read(SettingsResultToggleChanged.Companion.RemoteActionCompatParcelizer(), new VideoTimelineSideSheetViewModel_HiltModulesKeyModule(PlanActivity.Companion.AudioAttributesCompatParcelizer()), new VideoTimelineSideSheetViewModel_HiltModulesKeyModule(PlanContractPresenter.Companion.RemoteActionCompatParcelizer()), new VideoTimelineSideSheetViewModel_HiltModulesKeyModule(PlanContractView.Companion.write()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((PlanPresenter) obj).AudioAttributesCompatParcelizer()) {
                arrayList.add(obj);
            }
        }
        this.read = arrayList;
    }

    @Override // kotlin.SettingsItem
    public final void RemoteActionCompatParcelizer(SSLSocket p0, String p1, List<? extends ThemeKtExternalSyntheticLambda1> p2) {
        Object next;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        Iterator<T> it = this.read.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((PlanPresenter) next).AudioAttributesCompatParcelizer(p0)) {
                    break;
                }
            }
        }
        PlanPresenter planPresenter = (PlanPresenter) next;
        if (planPresenter != null) {
            planPresenter.AudioAttributesCompatParcelizer(p0, p1, p2);
        }
    }

    @Override // kotlin.SettingsItem
    public final String AudioAttributesCompatParcelizer(SSLSocket p0) {
        Object next;
        toMagicModuleMetaRepoModel.write(p0, "");
        Iterator<T> it = this.read.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((PlanPresenter) next).AudioAttributesCompatParcelizer(p0)) {
                break;
            }
        }
        PlanPresenter planPresenter = (PlanPresenter) next;
        if (planPresenter != null) {
            return planPresenter.write(p0);
        }
        return null;
    }

    @Override // kotlin.SettingsItem
    public final boolean IconCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(p0);
    }

    @Override // kotlin.SettingsItem
    public final getSubscriptionDataProvider IconCompatParcelizer(X509TrustManager p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        VideoTimelineItem.Companion companion = VideoTimelineItem.INSTANCE;
        VideoTimelineItem videoTimelineItemRemoteActionCompatParcelizer = VideoTimelineItem.Companion.RemoteActionCompatParcelizer(p0);
        return videoTimelineItemRemoteActionCompatParcelizer != null ? videoTimelineItemRemoteActionCompatParcelizer : super.IconCompatParcelizer(p0);
    }

    /* JADX INFO: renamed from: o.OptionItemSeekOptionItem$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0005\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lo/OptionItemSeekOptionItem$write;", "", "<init>", "()V", "Lo/SettingsItem;", "RemoteActionCompatParcelizer", "()Lo/SettingsItem;", "", "read", "Z", "IconCompatParcelizer", "()Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private static boolean IconCompatParcelizer() {
            return OptionItemSeekOptionItem.read;
        }

        public static SettingsItem RemoteActionCompatParcelizer() {
            if (IconCompatParcelizer()) {
                return new OptionItemSeekOptionItem();
            }
            return null;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
