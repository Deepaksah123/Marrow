package kotlin;

import android.text.Annotation;
import android.text.SpannableString;
import java.util.List;
import kotlin.AbstractDeserializer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003*\n\u0010\u0005\"\u00020\u00042\u00020\u0004"}, d2 = {"Lo/AbstractDeserializer;", "", "read", "(Lo/AbstractDeserializer;)Ljava/lang/CharSequence;", "Landroid/content/ClipboardManager;", "AudioAttributesCompatParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class nameForField {
    public static final CharSequence read(AbstractDeserializer abstractDeserializer) {
        if (abstractDeserializer.read().isEmpty()) {
            return abstractDeserializer.getIconCompatParcelizer();
        }
        SpannableString spannableString = new SpannableString(abstractDeserializer.getIconCompatParcelizer());
        includeFilterSuppressNulls includefiltersuppressnulls = new includeFilterSuppressNulls();
        List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findPropertyUnwrapper>> list = abstractDeserializer.read();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractDeserializer.AudioAttributesCompatParcelizer<_findPropertyUnwrapper> audioAttributesCompatParcelizer = list.get(i);
            _findPropertyUnwrapper _findpropertyunwrapperRemoteActionCompatParcelizer = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
            int write = audioAttributesCompatParcelizer.getWrite();
            int iWrite = audioAttributesCompatParcelizer.write();
            includefiltersuppressnulls.AudioAttributesCompatParcelizer();
            includefiltersuppressnulls.AudioAttributesCompatParcelizer(_findpropertyunwrapperRemoteActionCompatParcelizer);
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", includefiltersuppressnulls.write()), write, iWrite, 33);
        }
        return spannableString;
    }
}
