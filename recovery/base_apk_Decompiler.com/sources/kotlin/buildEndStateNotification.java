package kotlin;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class buildEndStateNotification {
    public static final void RemoteActionCompatParcelizer(EditText editText, TextView textView, getCreatedOnDateMs<getShowPopup> getcreatedondatems, getCreatedOnDateMs<getShowPopup> getcreatedondatems2) {
        toMagicModuleMetaRepoModel.write(editText, "");
        toMagicModuleMetaRepoModel.write(textView, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        editText.setFilters(new toCssRgba[]{new toCssRgba(500, getcreatedondatems, getcreatedondatems2)});
        editText.addTextChangedListener(new IconCompatParcelizer(textView, 500, getcreatedondatems2));
    }

    public static final class IconCompatParcelizer implements TextWatcher {
        private /* synthetic */ int AudioAttributesCompatParcelizer = 500;
        private /* synthetic */ TextView RemoteActionCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs<getShowPopup> write;

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        IconCompatParcelizer(TextView textView, int i, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
            this.RemoteActionCompatParcelizer = textView;
            this.write = getcreatedondatems;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            int length = editable != null ? editable.length() : 0;
            TextView textView = this.RemoteActionCompatParcelizer;
            int i = this.AudioAttributesCompatParcelizer;
            StringBuilder sb = new StringBuilder();
            sb.append(length);
            sb.append("/");
            sb.append(i);
            textView.setText(sb.toString());
            if (length < this.AudioAttributesCompatParcelizer) {
                this.write.invoke();
            }
        }
    }
}
