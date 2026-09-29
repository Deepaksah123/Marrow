package kotlin;

import android.view.View;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\f\u0010\u0013R\u001c\u0010\b\u001a\u00020\u00148\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016"}, d2 = {"Lo/_matchToken;", "Lo/_handleLongCustomEscape;", "Landroid/view/View;", "p0", "Lo/_writeGenericEscape;", "p1", "<init>", "(Landroid/view/View;Lo/_writeGenericEscape;)V", "write", "Landroid/view/View;", "RemoteActionCompatParcelizer", "()Landroid/view/View;", "AudioAttributesCompatParcelizer", "Lo/_writeGenericEscape;", "read", "()Lo/_writeGenericEscape;", "Landroid/view/autofill/AutofillManager;", "IconCompatParcelizer", "Landroid/view/autofill/AutofillManager;", "()Landroid/view/autofill/AutofillManager;", "Landroid/view/autofill/AutofillId;", "Landroid/view/autofill/AutofillId;", "()Landroid/view/autofill/AutofillId;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _matchToken implements _handleLongCustomEscape {
    private final _writeGenericEscape AudioAttributesCompatParcelizer;
    private final AutofillManager IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private AutofillId write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final View RemoteActionCompatParcelizer;

    public _matchToken(View view, _writeGenericEscape _writegenericescape) {
        this.RemoteActionCompatParcelizer = view;
        this.AudioAttributesCompatParcelizer = _writegenericescape;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.".toString());
        }
        this.IconCompatParcelizer = autofillManager;
        view.setImportantForAutofill(1);
        findFormatDefaults findformatdefaultsWrite = getDefaultInclusion.write(view);
        AutofillId autofillIdAudioAttributesCompatParcelizer = findformatdefaultsWrite != null ? findformatdefaultsWrite.AudioAttributesCompatParcelizer() : null;
        if (autofillIdAudioAttributesCompatParcelizer != null) {
            this.write = autofillIdAudioAttributesCompatParcelizer;
        } else {
            reportWrongTokenException.write("Required value was null.");
            throw new PlanDetailsCreator();
        }
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final View getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final _writeGenericEscape getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final AutofillManager getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final AutofillId getWrite() {
        return this.write;
    }
}
