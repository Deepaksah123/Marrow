package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class parseSelectionFlagsFromRoleDescriptors implements getApplicationLabel {
    public final ProgressBar AudioAttributesCompatParcelizer;
    private final ConstraintLayout RemoteActionCompatParcelizer;
    public final DashDownloader read;
    public final UtcTimingElement write;

    private parseSelectionFlagsFromRoleDescriptors(ConstraintLayout constraintLayout, UtcTimingElement utcTimingElement, DashDownloader dashDownloader, ProgressBar progressBar) {
        this.RemoteActionCompatParcelizer = constraintLayout;
        this.write = utcTimingElement;
        this.read = dashDownloader;
        this.AudioAttributesCompatParcelizer = progressBar;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public static parseSelectionFlagsFromRoleDescriptors IconCompatParcelizer(LayoutInflater layoutInflater) {
        return write(layoutInflater);
    }

    private static parseSelectionFlagsFromRoleDescriptors write(LayoutInflater layoutInflater) {
        return RemoteActionCompatParcelizer(layoutInflater.inflate(R.layout.activity_phone_number, (ViewGroup) null, false));
    }

    private static parseSelectionFlagsFromRoleDescriptors RemoteActionCompatParcelizer(View view) {
        int i = R.id.otp_screen_1;
        View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.otp_screen_1);
        if (viewIconCompatParcelizer != null) {
            UtcTimingElement utcTimingElement = UtcTimingElement.read(viewIconCompatParcelizer);
            View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.otp_screen_2);
            if (viewIconCompatParcelizer2 != null) {
                DashDownloader dashDownloaderRemoteActionCompatParcelizer = DashDownloader.RemoteActionCompatParcelizer(viewIconCompatParcelizer2);
                ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.progressBar);
                if (progressBar != null) {
                    return new parseSelectionFlagsFromRoleDescriptors((ConstraintLayout) view, utcTimingElement, dashDownloaderRemoteActionCompatParcelizer, progressBar);
                }
                i = R.id.progressBar;
            } else {
                i = R.id.otp_screen_2;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
