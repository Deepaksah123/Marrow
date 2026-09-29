package kotlin;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;
import java.util.Locale;
import kotlin.getBody;

/* JADX INFO: loaded from: classes4.dex */
public final class CommonWalletObject extends RecyclerView.onMediaButtonEvent {
    private final excludePlaylist IconCompatParcelizer;

    public static final /* synthetic */ class read {
        public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[LoyaltyPointsBalanceBuilder.values().length];
            try {
                iArr[LoyaltyPointsBalanceBuilder.RemoteActionCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoyaltyPointsBalanceBuilder.read.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoyaltyPointsBalanceBuilder.AudioAttributesCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AudioAttributesCompatParcelizer = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonWalletObject(excludePlaylist excludeplaylist) {
        super(excludeplaylist.IconCompatParcelizer());
        toMagicModuleMetaRepoModel.write(excludeplaylist, "");
        this.IconCompatParcelizer = excludeplaylist;
    }

    public final void IconCompatParcelizer(getBody.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        int color = _isNaN.getColor(this.IconCompatParcelizer.IconCompatParcelizer().getContext(), audioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer() == LoyaltyPointsBalanceBuilder.RemoteActionCompatParcelizer ? R.color.colorPrimary : R.color.v1_onbackgroundsurface3);
        excludePlaylist excludeplaylist = this.IconCompatParcelizer;
        TextView textView = excludeplaylist.IconCompatParcelizer;
        String upperCase = audioAttributesCompatParcelizer.getIconCompatParcelizer().toUpperCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase, "");
        textView.setText(upperCase);
        textView.setTextColor(color);
        TextView textView2 = excludeplaylist.AudioAttributesCompatParcelizer;
        int i = read.AudioAttributesCompatParcelizer[audioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer().ordinal()];
        if (i == 1) {
            textView2.setText(R.string.test_current_month);
        } else if (i == 2) {
            textView2.setText(R.string.test_upcoming_month);
        } else {
            if (i != 3) {
                throw new RenewEligibleCreator();
            }
            textView2.setText((CharSequence) null);
        }
        toMagicModuleMetaRepoModel.write(textView2);
        textView2.setVisibility(audioAttributesCompatParcelizer.getWrite() ? 0 : 8);
        textView2.setTextColor(color);
    }
}
