package kotlin;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH&¢\u0006\u0004\b\t\u0010\rJ\u000f\u0010\u000e\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H&¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0012H&¢\u0006\u0004\b\u000e\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/UTF8StreamJsonParser;", "", "", "p0", "Landroid/view/autofill/AutofillId;", "AudioAttributesCompatParcelizer", "(J)Landroid/view/autofill/AutofillId;", "p1", "Lo/findOverride;", "RemoteActionCompatParcelizer", "(Landroid/view/autofill/AutofillId;J)Lo/findOverride;", "Landroid/view/ViewStructure;", "", "(Landroid/view/ViewStructure;)V", "read", "()V", "write", "(Landroid/view/autofill/AutofillId;)V", "", "(Landroid/view/autofill/AutofillId;Ljava/lang/CharSequence;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface UTF8StreamJsonParser {
    AutofillId AudioAttributesCompatParcelizer(long p0);

    findOverride RemoteActionCompatParcelizer(AutofillId p0, long p1);

    void RemoteActionCompatParcelizer(ViewStructure p0);

    void read();

    void read(AutofillId p0, CharSequence p1);

    void write(AutofillId p0);
}
