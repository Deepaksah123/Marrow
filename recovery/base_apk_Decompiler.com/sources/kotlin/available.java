package kotlin;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0001\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n\"\u00028\u0000¢\u0006\u0004\b\b\u0010\u000b\u001a!\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"T", "p0", "Lo/quoteAsUTF8;", "p1", "Lo/InputAccessor;", "RemoteActionCompatParcelizer", "(Ljava/lang/Object;Lo/quoteAsUTF8;)Lo/InputAccessor;", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "write", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "", "([Ljava/lang/Object;)Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lo/parseDouble;", "read", "(Ljava/lang/Object;Lo/_handleUnrecognizedCharacterEscape;I)Lo/parseDouble;"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "o/_qbuf")
final /* synthetic */ class available {
    public static /* synthetic */ InputAccessor RemoteActionCompatParcelizer$default(Object obj, quoteAsUTF8 quoteasutf8, int i, Object obj2) {
        if ((i & 2) != 0) {
            quoteasutf8 = _qbuf.RemoteActionCompatParcelizer();
        }
        return _qbuf.RemoteActionCompatParcelizer(obj, quoteasutf8);
    }

    public static final <T> InputAccessor<T> RemoteActionCompatParcelizer(T t, quoteAsUTF8<T> quoteasutf8) {
        return mark.AudioAttributesCompatParcelizer(t, quoteasutf8);
    }

    public static final <T> SnapshotStateList<T> write() {
        return new SnapshotStateList<>();
    }

    public static final <T> SnapshotStateList<T> write(T... tArr) {
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(getOrderDetails.onCommand(tArr));
        return snapshotStateList;
    }

    public static final <T> parseDouble<T> read(T t, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1058319986, i, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:340)");
        }
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = RemoteActionCompatParcelizer$default(t, null, 2, null);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        InputAccessor inputAccessor = (InputAccessor) objOnPause;
        inputAccessor.write(t);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return inputAccessor;
    }
}
