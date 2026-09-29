package kotlin;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\b\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u0011JE\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\b\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0016¢\u0006\u0004\b\b\u0010\u0018J\u0015\u0010\u0014\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0016¢\u0006\u0004\b\u0014\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\n\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0016¢\u0006\u0004\b\n\u0010\u0018J\u001d\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u001a¢\u0006\u0004\b\u0014\u0010\u001bJ#\u0010\b\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\f0\u001c¢\u0006\u0004\b\b\u0010\u001dJ%\u0010\b\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\u001fJ\u001d\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010 J\u001d\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010!J\u001d\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0017¢\u0006\u0004\b\u0014\u0010\"J\u001d\u0010\n\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0017¢\u0006\u0004\b\n\u0010\"J\u001d\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010#J\u001d\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\"J\u001d\u0010$\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0017¢\u0006\u0004\b$\u0010\"J\u001d\u0010\b\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0017¢\u0006\u0004\b\b\u0010\"J\u001d\u0010%\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0017¢\u0006\u0004\b%\u0010\"J\u001d\u0010&\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0017¢\u0006\u0004\b&\u0010\"J\u001d\u0010$\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b$\u0010 J\u001d\u0010'\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0017¢\u0006\u0004\b'\u0010\"J\u001d\u0010(\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0017¢\u0006\u0004\b(\u0010\"J\u001d\u0010\n\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u001a¢\u0006\u0004\b\n\u0010\u001bJ\u001d\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010 J\u0015\u0010$\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u0016¢\u0006\u0004\b$\u0010)J\u0015\u0010$\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\f¢\u0006\u0004\b$\u0010*J\u0015\u0010\b\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0017¢\u0006\u0004\b\b\u0010+"}, d2 = {"Lo/_outputMultiByteChar;", "", "<init>", "()V", "Landroid/view/ViewStructure;", "p0", "", "p1", "AudioAttributesCompatParcelizer", "(Landroid/view/ViewStructure;I)Landroid/view/ViewStructure;", "IconCompatParcelizer", "(Landroid/view/ViewStructure;I)I", "", "p2", "p3", "p4", "", "(Landroid/view/ViewStructure;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "p5", "p6", "write", "(Landroid/view/ViewStructure;IIIIII)V", "Landroid/view/autofill/AutofillValue;", "", "(Landroid/view/autofill/AutofillValue;)Z", "read", "", "(Landroid/view/ViewStructure;Ljava/lang/CharSequence;)V", "", "(Landroid/view/ViewStructure;[Ljava/lang/String;)V", "Landroid/view/autofill/AutofillId;", "(Landroid/view/ViewStructure;Landroid/view/autofill/AutofillId;I)V", "(Landroid/view/ViewStructure;I)V", "(Landroid/view/ViewStructure;Landroid/view/autofill/AutofillValue;)V", "(Landroid/view/ViewStructure;Z)V", "(Landroid/view/ViewStructure;Ljava/lang/String;)V", "RemoteActionCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatItemReceiver", "(Landroid/view/autofill/AutofillValue;)Ljava/lang/CharSequence;", "(Ljava/lang/String;)Landroid/view/autofill/AutofillValue;", "(Z)Landroid/view/autofill/AutofillValue;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _outputMultiByteChar {
    public static final _outputMultiByteChar INSTANCE = new _outputMultiByteChar();

    private _outputMultiByteChar() {
    }

    public final ViewStructure AudioAttributesCompatParcelizer(ViewStructure p0, int p1) {
        return p0.newChild(p1);
    }

    public final int IconCompatParcelizer(ViewStructure p0, int p1) {
        return p0.addChildCount(p1);
    }

    public final void AudioAttributesCompatParcelizer(ViewStructure p0, int p1, String p2, String p3, String p4) {
        p0.setId(p1, p2, p3, p4);
    }

    public final void write(ViewStructure p0, int p1, int p2, int p3, int p4, int p5, int p6) {
        p0.setDimens(p1, p2, p3, p4, p5, p6);
    }

    public final boolean AudioAttributesCompatParcelizer(AutofillValue p0) {
        return p0.isDate();
    }

    public final boolean write(AutofillValue p0) {
        return p0.isList();
    }

    public final boolean read(AutofillValue p0) {
        return p0.isText();
    }

    public final boolean IconCompatParcelizer(AutofillValue p0) {
        return p0.isToggle();
    }

    public final void write(ViewStructure p0, CharSequence p1) {
        p0.setContentDescription(p1);
    }

    public final void AudioAttributesCompatParcelizer(ViewStructure p0, String[] p1) {
        p0.setAutofillHints(p1);
    }

    public final void AudioAttributesCompatParcelizer(ViewStructure p0, AutofillId p1, int p2) {
        p0.setAutofillId(p1, p2);
    }

    public final void write(ViewStructure p0, int p1) {
        p0.setAutofillType(p1);
    }

    public final void read(ViewStructure p0, AutofillValue p1) {
        p0.setAutofillValue(p1);
    }

    public final void write(ViewStructure p0, boolean p1) {
        p0.setCheckable(p1);
    }

    public final void IconCompatParcelizer(ViewStructure p0, boolean p1) {
        p0.setChecked(p1);
    }

    public final void write(ViewStructure p0, String p1) {
        p0.setClassName(p1);
    }

    public final void read(ViewStructure p0, boolean p1) {
        p0.setClickable(p1);
    }

    public final void RemoteActionCompatParcelizer(ViewStructure p0, boolean p1) {
        p0.setDataIsSensitive(p1);
    }

    public final void AudioAttributesCompatParcelizer(ViewStructure p0, boolean p1) {
        p0.setEnabled(p1);
    }

    public final void MediaBrowserCompatCustomActionResultReceiver(ViewStructure p0, boolean p1) {
        p0.setFocusable(p1);
    }

    public final void AudioAttributesImplApi21Parcelizer(ViewStructure p0, boolean p1) {
        p0.setFocused(p1);
    }

    public final void RemoteActionCompatParcelizer(ViewStructure p0, int p1) {
        p0.setInputType(p1);
    }

    public final void AudioAttributesImplApi26Parcelizer(ViewStructure p0, boolean p1) {
        p0.setLongClickable(p1);
    }

    public final void MediaBrowserCompatItemReceiver(ViewStructure p0, boolean p1) {
        p0.setSelected(p1);
    }

    public final void IconCompatParcelizer(ViewStructure p0, CharSequence p1) {
        p0.setText(p1);
    }

    public final void read(ViewStructure p0, int p1) {
        p0.setVisibility(p1);
    }

    public final CharSequence RemoteActionCompatParcelizer(AutofillValue p0) {
        return p0.getTextValue();
    }

    public final AutofillValue RemoteActionCompatParcelizer(String p0) {
        return AutofillValue.forText(p0);
    }

    public final AutofillValue AudioAttributesCompatParcelizer(boolean p0) {
        return AutofillValue.forToggle(p0);
    }
}
