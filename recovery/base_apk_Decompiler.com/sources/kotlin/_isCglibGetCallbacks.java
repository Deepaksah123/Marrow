package kotlin;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class _isCglibGetCallbacks extends SpannableStringBuilder {
    private final List<read> RemoteActionCompatParcelizer;
    private final Class<?> write;

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Editable append(char c) {
        return append(c);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Editable append(CharSequence charSequence) {
        return append(charSequence);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Editable append(CharSequence charSequence, int i, int i2) {
        return append(charSequence, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(char c) throws IOException {
        return append(c);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) throws IOException {
        return append(charSequence);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
        return append(charSequence, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable delete(int i, int i2) {
        return delete(i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable insert(int i, CharSequence charSequence) {
        return insert(i, charSequence);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        return insert(i, charSequence, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        return replace(i, i2, charSequence);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        return replace(i, i2, charSequence, i3, i4);
    }

    private _isCglibGetCallbacks(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        this.RemoteActionCompatParcelizer = new ArrayList();
        StringCollectionDeserializer.write(cls, "watcherClass cannot be null");
        this.write = cls;
    }

    private _isCglibGetCallbacks(Class<?> cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        this.RemoteActionCompatParcelizer = new ArrayList();
        StringCollectionDeserializer.write(cls, "watcherClass cannot be null");
        this.write = cls;
    }

    public static _isCglibGetCallbacks IconCompatParcelizer(Class<?> cls, CharSequence charSequence) {
        return new _isCglibGetCallbacks(cls, charSequence);
    }

    private boolean AudioAttributesCompatParcelizer(Object obj) {
        return obj != null && IconCompatParcelizer(obj.getClass());
    }

    private boolean IconCompatParcelizer(Class<?> cls) {
        return this.write == cls;
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new _isCglibGetCallbacks(this.write, this, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (AudioAttributesCompatParcelizer(obj)) {
            read readVar = new read(obj);
            this.RemoteActionCompatParcelizer.add(readVar);
            obj = readVar;
        }
        super.setSpan(obj, i, i2, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (IconCompatParcelizer(cls)) {
            read[] readVarArr = (read[]) super.getSpans(i, i2, read.class);
            T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, readVarArr.length));
            for (int i3 = 0; i3 < readVarArr.length; i3++) {
                tArr[i3] = readVarArr[i3].write;
            }
            return tArr;
        }
        return (T[]) super.getSpans(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        read readVarWrite;
        if (AudioAttributesCompatParcelizer(obj)) {
            readVarWrite = write(obj);
            if (readVarWrite != null) {
                obj = readVarWrite;
            }
        } else {
            readVarWrite = null;
        }
        super.removeSpan(obj);
        if (readVarWrite != null) {
            this.RemoteActionCompatParcelizer.remove(readVarWrite);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        read readVarWrite;
        if (AudioAttributesCompatParcelizer(obj) && (readVarWrite = write(obj)) != null) {
            obj = readVarWrite;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        read readVarWrite;
        if (AudioAttributesCompatParcelizer(obj) && (readVarWrite = write(obj)) != null) {
            obj = readVarWrite;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        read readVarWrite;
        if (AudioAttributesCompatParcelizer(obj) && (readVarWrite = write(obj)) != null) {
            obj = readVarWrite;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        if (cls == null || IconCompatParcelizer(cls)) {
            cls = read.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    private read write(Object obj) {
        for (int i = 0; i < this.RemoteActionCompatParcelizer.size(); i++) {
            read readVar = this.RemoteActionCompatParcelizer.get(i);
            if (readVar.write == obj) {
                return readVar;
            }
        }
        return null;
    }

    private void write() {
        for (int i = 0; i < this.RemoteActionCompatParcelizer.size(); i++) {
            this.RemoteActionCompatParcelizer.get(i).IconCompatParcelizer();
        }
    }

    private void IconCompatParcelizer() {
        for (int i = 0; i < this.RemoteActionCompatParcelizer.size(); i++) {
            this.RemoteActionCompatParcelizer.get(i).write();
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        write();
        super.replace(i, i2, charSequence);
        IconCompatParcelizer();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        write();
        super.replace(i, i2, charSequence, i3, i4);
        IconCompatParcelizer();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    static class read implements TextWatcher, SpanWatcher {
        private final AtomicInteger RemoteActionCompatParcelizer = new AtomicInteger(0);
        final Object write;

        read(Object obj) {
            this.write = obj;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.write).beforeTextChanged(charSequence, i, i2, i3);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.write).onTextChanged(charSequence, i, i2, i3);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.write).afterTextChanged(editable);
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.RemoteActionCompatParcelizer.get() <= 0 || !IconCompatParcelizer(obj)) {
                ((SpanWatcher) this.write).onSpanAdded(spannable, obj, i, i2);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.RemoteActionCompatParcelizer.get() <= 0 || !IconCompatParcelizer(obj)) {
                ((SpanWatcher) this.write).onSpanRemoved(spannable, obj, i, i2);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            if (this.RemoteActionCompatParcelizer.get() <= 0 || !IconCompatParcelizer(obj)) {
                ((SpanWatcher) this.write).onSpanChanged(spannable, obj, i, i2, i3, i4);
            }
        }

        final void IconCompatParcelizer() {
            this.RemoteActionCompatParcelizer.incrementAndGet();
        }

        final void write() {
            this.RemoteActionCompatParcelizer.decrementAndGet();
        }

        private static boolean IconCompatParcelizer(Object obj) {
            return obj instanceof _isGroovyMetaClassGetter;
        }
    }
}
