package kotlin;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
final class DefaultAccessorNamingStrategyProvider implements KeyListener {
    private final KeyListener read;
    private final IconCompatParcelizer write;

    DefaultAccessorNamingStrategyProvider(KeyListener keyListener) {
        this(keyListener, new IconCompatParcelizer());
    }

    private DefaultAccessorNamingStrategyProvider(KeyListener keyListener, IconCompatParcelizer iconCompatParcelizer) {
        this.read = keyListener;
        this.write = iconCompatParcelizer;
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.read.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.write.IconCompatParcelizer(editable, i, keyEvent) || this.read.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.read.onKeyUp(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.read.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.read.clearMetaKeyState(view, editable, i);
    }

    public static class IconCompatParcelizer {
        public boolean IconCompatParcelizer(Editable editable, int i, KeyEvent keyEvent) {
            return _booleanType.RemoteActionCompatParcelizer(editable, i, keyEvent);
        }
    }
}
