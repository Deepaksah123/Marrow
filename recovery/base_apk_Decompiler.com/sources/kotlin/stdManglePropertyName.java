package kotlin;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import kotlin._booleanType;

/* JADX INFO: loaded from: classes2.dex */
final class stdManglePropertyName implements InputFilter {
    private final TextView IconCompatParcelizer;
    private _booleanType.IconCompatParcelizer read;

    stdManglePropertyName(TextView textView) {
        this.IconCompatParcelizer = textView;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    @Override // android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence filter(java.lang.CharSequence r3, int r4, int r5, android.text.Spanned r6, int r7, int r8) {
        /*
            r2 = this;
            android.widget.TextView r0 = r2.IconCompatParcelizer
            boolean r0 = r0.isInEditMode()
            if (r0 != 0) goto L53
            o._booleanType r0 = kotlin._booleanType.AudioAttributesCompatParcelizer()
            int r0 = r0.IconCompatParcelizer()
            if (r0 == 0) goto L48
            r1 = 1
            if (r0 == r1) goto L19
            r4 = 3
            if (r0 == r4) goto L48
            goto L53
        L19:
            if (r8 != 0) goto L2c
            if (r7 != 0) goto L2c
            int r6 = r6.length()
            if (r6 != 0) goto L2c
            android.widget.TextView r2 = r2.IconCompatParcelizer
            java.lang.CharSequence r2 = r2.getText()
            if (r3 != r2) goto L2c
            return r3
        L2c:
            if (r3 == 0) goto L53
            if (r4 != 0) goto L36
            int r2 = r3.length()
            if (r5 == r2) goto L3a
        L36:
            java.lang.CharSequence r3 = r3.subSequence(r4, r5)
        L3a:
            o._booleanType r2 = kotlin._booleanType.AudioAttributesCompatParcelizer()
            r4 = 0
            int r5 = r3.length()
            java.lang.CharSequence r2 = r2.IconCompatParcelizer(r3, r4, r5)
            return r2
        L48:
            o._booleanType r4 = kotlin._booleanType.AudioAttributesCompatParcelizer()
            o._booleanType$IconCompatParcelizer r2 = r2.IconCompatParcelizer()
            r4.read(r2)
        L53:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.stdManglePropertyName.filter(java.lang.CharSequence, int, int, android.text.Spanned, int, int):java.lang.CharSequence");
    }

    private _booleanType.IconCompatParcelizer IconCompatParcelizer() {
        if (this.read == null) {
            this.read = new read(this.IconCompatParcelizer, this);
        }
        return this.read;
    }

    static class read extends _booleanType.IconCompatParcelizer implements Runnable {
        private final Reference<stdManglePropertyName> IconCompatParcelizer;
        private final Reference<TextView> read;

        read(TextView textView, stdManglePropertyName stdmanglepropertyname) {
            this.read = new WeakReference(textView);
            this.IconCompatParcelizer = new WeakReference(stdmanglepropertyname);
        }

        @Override // o._booleanType.IconCompatParcelizer
        public final void read() {
            Handler handler;
            super.read();
            TextView textView = this.read.get();
            if (textView == null || (handler = textView.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            CharSequence text;
            CharSequence charSequenceWrite;
            TextView textView = this.read.get();
            if (AudioAttributesCompatParcelizer(textView, this.IconCompatParcelizer.get()) && textView.isAttachedToWindow() && text != (charSequenceWrite = _booleanType.AudioAttributesCompatParcelizer().write((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(charSequenceWrite);
                int selectionEnd = Selection.getSelectionEnd(charSequenceWrite);
                textView.setText(charSequenceWrite);
                if (charSequenceWrite instanceof Spannable) {
                    stdManglePropertyName.RemoteActionCompatParcelizer((Spannable) charSequenceWrite, selectionStart, selectionEnd);
                }
            }
        }

        private static boolean AudioAttributesCompatParcelizer(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }
    }

    static void RemoteActionCompatParcelizer(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }
}
