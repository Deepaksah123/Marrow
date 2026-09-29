package kotlin;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import android.widget.Toast;
import androidx.viewpager.widget.ViewPager;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.clevertap.android.sdk.inbox.CTInboxMessageContent;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class getConstant implements View.OnClickListener {
    private final SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 AudioAttributesCompatParcelizer;
    private ViewPager AudioAttributesImplBaseParcelizer;
    private JSONObject IconCompatParcelizer;
    private final int MediaBrowserCompatCustomActionResultReceiver;
    private final boolean MediaBrowserCompatItemReceiver;
    private final String RemoteActionCompatParcelizer;
    private final CTInboxMessage read;
    private final int write;

    getConstant(int i, CTInboxMessage cTInboxMessage, String str, JSONObject jSONObject, SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0, boolean z, int i2) {
        this.MediaBrowserCompatCustomActionResultReceiver = i;
        this.read = cTInboxMessage;
        this.RemoteActionCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = simpleBasePlayerPositionSupplierExternalSyntheticLambda0;
        this.IconCompatParcelizer = jSONObject;
        this.MediaBrowserCompatItemReceiver = z;
        this.write = i2;
    }

    getConstant(int i, CTInboxMessage cTInboxMessage, SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0, ViewPager viewPager) {
        this.MediaBrowserCompatCustomActionResultReceiver = i;
        this.read = cTInboxMessage;
        this.RemoteActionCompatParcelizer = null;
        this.AudioAttributesCompatParcelizer = simpleBasePlayerPositionSupplierExternalSyntheticLambda0;
        this.AudioAttributesImplBaseParcelizer = viewPager;
        this.MediaBrowserCompatItemReceiver = true;
        this.write = -1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewPager viewPager = this.AudioAttributesImplBaseParcelizer;
        if (viewPager != null) {
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = this.AudioAttributesCompatParcelizer;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda0 != null) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.read(this.MediaBrowserCompatCustomActionResultReceiver, viewPager.write());
                return;
            }
            return;
        }
        if (this.RemoteActionCompatParcelizer != null && this.IconCompatParcelizer != null) {
            if (this.AudioAttributesCompatParcelizer != null) {
                this.read.RemoteActionCompatParcelizer().get(0);
                if (CTInboxMessageContent.AudioAttributesImplBaseParcelizer(this.IconCompatParcelizer).equalsIgnoreCase("copy") && this.AudioAttributesCompatParcelizer.getActivity() != null) {
                    IconCompatParcelizer(this.AudioAttributesCompatParcelizer.getActivity());
                }
                this.AudioAttributesCompatParcelizer.write(this.MediaBrowserCompatCustomActionResultReceiver, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, read(this.read), this.write);
                return;
            }
            return;
        }
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda02 = this.AudioAttributesCompatParcelizer;
        if (simpleBasePlayerPositionSupplierExternalSyntheticLambda02 != null) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda02.write(this.MediaBrowserCompatCustomActionResultReceiver, (String) null, (JSONObject) null, (HashMap<String, String>) null, this.write);
        }
    }

    private void IconCompatParcelizer(Context context) {
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        String str = this.RemoteActionCompatParcelizer;
        this.read.RemoteActionCompatParcelizer().get(0);
        ClipData clipDataNewPlainText = ClipData.newPlainText(str, CTInboxMessageContent.AudioAttributesCompatParcelizer(this.IconCompatParcelizer));
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(clipDataNewPlainText);
            Toast.makeText(context, "Text Copied to Clipboard", 0).show();
        }
    }

    private HashMap<String, String> read(CTInboxMessage cTInboxMessage) {
        if (cTInboxMessage == null || cTInboxMessage.RemoteActionCompatParcelizer() == null || cTInboxMessage.RemoteActionCompatParcelizer().get(0) == null) {
            return null;
        }
        cTInboxMessage.RemoteActionCompatParcelizer().get(0);
        if (!"kv".equalsIgnoreCase(CTInboxMessageContent.AudioAttributesImplBaseParcelizer(this.IconCompatParcelizer))) {
            return null;
        }
        cTInboxMessage.RemoteActionCompatParcelizer().get(0);
        return CTInboxMessageContent.IconCompatParcelizer(this.IconCompatParcelizer);
    }
}
