package kotlin;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class _addClassMixIns implements finishBranchArray {
    @Override // kotlin.finishBranchArray
    public final StringDeserializer read(View view, StringDeserializer stringDeserializer) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Objects.toString(stringDeserializer);
        }
        if (stringDeserializer.read() == 2) {
            return stringDeserializer;
        }
        ClipData clipDataAudioAttributesCompatParcelizer = stringDeserializer.AudioAttributesCompatParcelizer();
        int iWrite = stringDeserializer.write();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < clipDataAudioAttributesCompatParcelizer.getItemCount(); i++) {
            CharSequence charSequenceWrite = write(context, clipDataAudioAttributesCompatParcelizer.getItemAt(i), iWrite);
            if (charSequenceWrite != null) {
                if (!z) {
                    IconCompatParcelizer(editable, charSequenceWrite);
                    z = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceWrite);
                }
            }
        }
        return null;
    }

    private static CharSequence write(Context context, ClipData.Item item, int i) {
        if ((i & 1) != 0) {
            CharSequence charSequenceCoerceToText = item.coerceToText(context);
            return charSequenceCoerceToText instanceof Spanned ? charSequenceCoerceToText.toString() : charSequenceCoerceToText;
        }
        return item.coerceToStyledText(context);
    }

    private static void IconCompatParcelizer(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
        int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, iMax2);
        editable.replace(iMax, iMax2, charSequence);
    }
}
