package kotlin;

import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillValue;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\b\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/_matchToken;", "Landroid/view/ViewStructure;", "p0", "", "AudioAttributesCompatParcelizer", "(Lo/_matchToken;Landroid/view/ViewStructure;)V", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "write", "(Lo/_matchToken;Landroid/util/SparseArray;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _reportInvalidToken {
    public static final void AudioAttributesCompatParcelizer(_matchToken _matchtoken, ViewStructure viewStructure) {
        if (_matchtoken.getAudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer().isEmpty()) {
            return;
        }
        int iIconCompatParcelizer = _outputMultiByteChar.INSTANCE.IconCompatParcelizer(viewStructure, _matchtoken.getAudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer().size());
        for (Map.Entry<Integer, _writeBytes> entry : _matchtoken.getAudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer().entrySet()) {
            int iIntValue = entry.getKey().intValue();
            _writeBytes value = entry.getValue();
            ViewStructure viewStructureAudioAttributesCompatParcelizer = _outputMultiByteChar.INSTANCE.AudioAttributesCompatParcelizer(viewStructure, iIconCompatParcelizer);
            _outputMultiByteChar.INSTANCE.AudioAttributesCompatParcelizer(viewStructureAudioAttributesCompatParcelizer, _matchtoken.getWrite(), iIntValue);
            _outputMultiByteChar.INSTANCE.AudioAttributesCompatParcelizer(viewStructureAudioAttributesCompatParcelizer, iIntValue, _matchtoken.getRemoteActionCompatParcelizer().getContext().getPackageName(), null, null);
            _outputMultiByteChar.INSTANCE.write(viewStructureAudioAttributesCompatParcelizer, _writeNull.read(_writeQuotedRaw.INSTANCE.read()));
            _outputMultiByteChar _outputmultibytechar = _outputMultiByteChar.INSTANCE;
            List<_writeQuotedLong> list = value.read();
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(_skipCR.read(list.get(i)));
            }
            _outputmultibytechar.AudioAttributesCompatParcelizer(viewStructureAudioAttributesCompatParcelizer, (String[]) arrayList.toArray(new String[0]));
            WritableTypeIdInclusion read = value.getRead();
            if (read != null) {
                int iRound = Math.round(read.getAudioAttributesCompatParcelizer());
                int iRound2 = Math.round(read.getRemoteActionCompatParcelizer());
                _outputMultiByteChar.INSTANCE.write(viewStructureAudioAttributesCompatParcelizer, iRound, iRound2, 0, 0, Math.round(read.getWrite()) - iRound, Math.round(read.getIconCompatParcelizer()) - iRound2);
            }
            iIconCompatParcelizer++;
        }
    }

    public static final void write(_matchToken _matchtoken, SparseArray<AutofillValue> sparseArray) {
        if (_matchtoken.getAudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer().isEmpty()) {
            return;
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            AutofillValue autofillValue = sparseArray.get(iKeyAt);
            if (_outputMultiByteChar.INSTANCE.read(autofillValue)) {
                _matchtoken.getAudioAttributesCompatParcelizer().read(iKeyAt, _outputMultiByteChar.INSTANCE.RemoteActionCompatParcelizer(autofillValue).toString());
            } else {
                if (_outputMultiByteChar.INSTANCE.AudioAttributesCompatParcelizer(autofillValue)) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (_outputMultiByteChar.INSTANCE.write(autofillValue)) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (_outputMultiByteChar.INSTANCE.IconCompatParcelizer(autofillValue)) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }
}
