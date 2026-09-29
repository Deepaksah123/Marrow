package kotlin;

import android.os.Build;
import com.marrow.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\u000b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000b\u0010\r"}, d2 = {"Lo/evaluateSelectionEligibility;", "", "<init>", "()V", "", "p0", "Lo/DefaultTrackSelectorParameters;", "write", "(I)Lo/DefaultTrackSelectorParameters;", "RemoteActionCompatParcelizer", "()Lo/DefaultTrackSelectorParameters;", "AudioAttributesCompatParcelizer", "", "()Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class evaluateSelectionEligibility {
    public static final evaluateSelectionEligibility INSTANCE = new evaluateSelectionEligibility();

    public static final /* synthetic */ class RemoteActionCompatParcelizer {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[getSelectionEligibility.values().length];
            try {
                iArr[getSelectionEligibility.AudioAttributesCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getSelectionEligibility.IconCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            IconCompatParcelizer = iArr;
        }
    }

    private evaluateSelectionEligibility() {
    }

    public final DefaultTrackSelectorParameters write(int p0) {
        if (p0 == 1547) {
            return RemoteActionCompatParcelizer();
        }
        if (p0 == 4501) {
            return new DefaultTrackSelectorParameters(getSelectionEligibility.MediaBrowserCompatCustomActionResultReceiver, false, R.string.text_device_error_noted, 2, null);
        }
        if (p0 == 4201) {
            return new DefaultTrackSelectorParameters(getSelectionEligibility.RemoteActionCompatParcelizer, false, R.string.text_follow_steps_to_resolve, 2, null);
        }
        if (p0 == 4202) {
            return new DefaultTrackSelectorParameters(getSelectionEligibility.AudioAttributesImplBaseParcelizer, false, R.string.text_follow_steps_to_resolve, 2, null);
        }
        return AudioAttributesCompatParcelizer(p0);
    }

    private static DefaultTrackSelectorParameters RemoteActionCompatParcelizer() {
        if (AudioAttributesCompatParcelizer()) {
            return new DefaultTrackSelectorParameters(getSelectionEligibility.write, false, R.string.text_follow_steps_to_resolve, 2, null);
        }
        return new DefaultTrackSelectorParameters(getSelectionEligibility.read, false, R.string.text_follow_steps_to_resolve, 2, null);
    }

    private static DefaultTrackSelectorParameters AudioAttributesCompatParcelizer(int p0) {
        getSelectionEligibility getselectioneligibility;
        if (checkLanguageConsistency.read(p0)) {
            getselectioneligibility = getSelectionEligibility.AudioAttributesCompatParcelizer;
        } else {
            getselectioneligibility = checkLanguageConsistency.write(p0) ? getSelectionEligibility.IconCompatParcelizer : getSelectionEligibility.AudioAttributesImplApi26Parcelizer;
        }
        boolean z = getselectioneligibility == getSelectionEligibility.AudioAttributesImplApi26Parcelizer;
        int i = RemoteActionCompatParcelizer.IconCompatParcelizer[getselectioneligibility.ordinal()];
        return new DefaultTrackSelectorParameters(getselectioneligibility, z, i != 1 ? i != 2 ? R.string.text_internet_troubleshoot_heading : R.string.text_device_restart_troubleshoot_heading : R.string.text_device_restart_required);
    }

    private static boolean AudioAttributesCompatParcelizer() {
        Set setIconCompatParcelizer = getKycMessage.IconCompatParcelizer("23043RP34I", "VHU4406IN", "VHU4401IN");
        if ((setIconCompatParcelizer instanceof Collection) && setIconCompatParcelizer.isEmpty()) {
            return false;
        }
        Iterator it = setIconCompatParcelizer.iterator();
        while (it.hasNext()) {
            if (TestGroupLSModel.read((String) it.next(), Build.MODEL, true)) {
                return true;
            }
        }
        return false;
    }
}
