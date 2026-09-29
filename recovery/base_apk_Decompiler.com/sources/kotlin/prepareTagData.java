package kotlin;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.timepicker.ChipTextInputComboView;
import com.google.android.material.timepicker.TimeModel;

/* JADX INFO: loaded from: classes5.dex */
final class prepareTagData implements TextView.OnEditorActionListener, View.OnKeyListener {
    private boolean AudioAttributesCompatParcelizer = false;
    private final ChipTextInputComboView IconCompatParcelizer;
    private final TimeModel RemoteActionCompatParcelizer;
    private final ChipTextInputComboView write;

    prepareTagData(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, TimeModel timeModel) {
        this.IconCompatParcelizer = chipTextInputComboView;
        this.write = chipTextInputComboView2;
        this.RemoteActionCompatParcelizer = timeModel;
    }

    public final void read() {
        TextInputLayout textInputLayout = this.IconCompatParcelizer.read();
        TextInputLayout textInputLayout2 = this.write.read();
        EditText editTextAudioAttributesCompatParcelizer = textInputLayout.AudioAttributesCompatParcelizer();
        EditText editTextAudioAttributesCompatParcelizer2 = textInputLayout2.AudioAttributesCompatParcelizer();
        editTextAudioAttributesCompatParcelizer.setImeOptions(268435461);
        editTextAudioAttributesCompatParcelizer2.setImeOptions(268435462);
        editTextAudioAttributesCompatParcelizer.setOnEditorActionListener(this);
        editTextAudioAttributesCompatParcelizer.setOnKeyListener(this);
        editTextAudioAttributesCompatParcelizer2.setOnKeyListener(this);
    }

    private void AudioAttributesCompatParcelizer(int i) {
        this.write.setChecked(i == 12);
        this.IconCompatParcelizer.setChecked(i == 10);
        this.RemoteActionCompatParcelizer.read = i;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean z = i == 5;
        if (z) {
            AudioAttributesCompatParcelizer(12);
        }
        return z;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        boolean zRemoteActionCompatParcelizer;
        if (this.AudioAttributesCompatParcelizer) {
            return false;
        }
        this.AudioAttributesCompatParcelizer = true;
        EditText editText = (EditText) view;
        if (this.RemoteActionCompatParcelizer.read == 12) {
            zRemoteActionCompatParcelizer = read(i, keyEvent, editText);
        } else {
            zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i, keyEvent, editText);
        }
        this.AudioAttributesCompatParcelizer = false;
        return zRemoteActionCompatParcelizer;
    }

    private boolean read(int i, KeyEvent keyEvent, EditText editText) {
        if (i == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText())) {
            AudioAttributesCompatParcelizer(10);
            return true;
        }
        write(editText);
        return false;
    }

    private boolean RemoteActionCompatParcelizer(int i, KeyEvent keyEvent, EditText editText) {
        Editable text = editText.getText();
        if (text == null) {
            return false;
        }
        if (i >= 7 && i <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2) {
            AudioAttributesCompatParcelizer(12);
            return true;
        }
        write(editText);
        return false;
    }

    private static void write(EditText editText) {
        if (editText.getSelectionStart() == 0 && editText.length() == 2) {
            editText.getText().clear();
        }
    }
}
