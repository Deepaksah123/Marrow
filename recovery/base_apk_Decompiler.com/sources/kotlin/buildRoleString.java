package kotlin;

import com.google.android.gms.wallet.WalletConstants;
import com.marrow.R;
import com.marrow.data.models.ResponseError;
import com.marrow.designsystem.theme.AppTheme;

/* JADX INFO: loaded from: classes.dex */
public final class buildRoleString implements parseDtsxChannelConfiguration {
    public static final String AudioAttributesCompatParcelizer;
    public static final int[] IconCompatParcelizer = {1207, 1206, 1210};
    public static final String read;

    static {
        new ResponseError(0, R.string.app_error_none);
        new ResponseError(WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE, R.string.app_error_api);
        new ResponseError(ResponseError.NO_INTERNET_ERROR, R.string.app_error_no_internet);
        new ResponseError(ResponseError.NO_INTERNET_ERROR, R.string.app_ssl_error);
        new ResponseError(-401, R.string.app_error_no_internet);
        AudioAttributesCompatParcelizer = new String(Character.toChars(128249));
        read = new String(Character.toChars(9200));
    }

    @Deprecated
    public interface RemoteActionCompatParcelizer {
        public static final String read;

        static {
            StringBuilder sb = new StringBuilder();
            sb.append(AppTheme.RemoteActionCompatParcelizer.getRead());
            sb.append("+.Regular");
            read = sb.toString();
        }
    }
}
