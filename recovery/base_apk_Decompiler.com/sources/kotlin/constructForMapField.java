package kotlin;

import android.view.inputmethod.ExtractedText;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/hasValueTypeDeserializer;", "Landroid/view/inputmethod/ExtractedText;", "write", "(Lo/hasValueTypeDeserializer;)Landroid/view/inputmethod/ExtractedText;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class constructForMapField {
    public static final ExtractedText write(hasValueTypeDeserializer hasvaluetypedeserializer) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = hasvaluetypedeserializer.AudioAttributesCompatParcelizer();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = hasvaluetypedeserializer.AudioAttributesCompatParcelizer().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = findProperty.MediaBrowserCompatCustomActionResultReceiver(hasvaluetypedeserializer.getAudioAttributesCompatParcelizer());
        extractedText.selectionEnd = findProperty.AudioAttributesImplApi26Parcelizer(hasvaluetypedeserializer.getAudioAttributesCompatParcelizer());
        extractedText.flags = !TestGroupLSModel.RemoteActionCompatParcelizer((CharSequence) hasvaluetypedeserializer.AudioAttributesCompatParcelizer(), '\n', false) ? 1 : 0;
        return extractedText;
    }
}
