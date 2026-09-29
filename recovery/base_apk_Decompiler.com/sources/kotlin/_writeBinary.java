package kotlin;

import android.view.DragEvent;
import android.view.View;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012*\u0010\n\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R8\u0010\u0019\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\t0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u001a\u0010\u0015\u001a\u00020\u001f8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b\u0017\u0010!"}, d2 = {"Lo/_writeBinary;", "Landroid/view/View$OnDragListener;", "Lo/_decodeUtf8_3fast;", "Lkotlin/Function3;", "Lo/_skipWS;", "Lo/calloc;", "Lkotlin/Function1;", "Lo/findSetterInfo;", "", "", "p0", "<init>", "(Lo/getModuleData;)V", "Landroid/view/View;", "Landroid/view/DragEvent;", "p1", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z", "Lo/_skipUtf8_3;", "IconCompatParcelizer", "(Lo/_skipUtf8_3;)V", "AudioAttributesCompatParcelizer", "(Lo/_skipUtf8_3;)Z", "write", "Lo/getModuleData;", "read", "Lo/_decodeUtf8_3;", "Lo/_decodeUtf8_3;", "RemoteActionCompatParcelizer", "Lo/setCustomView;", "Lo/setCustomView;", "Lo/_handleOddName;", "Lo/_handleOddName;", "()Lo/_handleOddName;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _writeBinary implements View.OnDragListener, _decodeUtf8_3fast {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getModuleData<_skipWS, calloc, getAnswerMap<? super findSetterInfo, getShowPopup>, Boolean> read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final _decodeUtf8_3 RemoteActionCompatParcelizer = new _decodeUtf8_3(null, null, 3, null);

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final setCustomView<_skipUtf8_3> write = new setCustomView<>(0, 1, null);

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final _handleOddName AudioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer();

    /* JADX WARN: Multi-variable type inference failed */
    public _writeBinary(getModuleData<? super _skipWS, ? super calloc, ? super getAnswerMap<? super findSetterInfo, getShowPopup>, Boolean> getmoduledata) {
        this.read = getmoduledata;
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/_writeBinary$AudioAttributesCompatParcelizer;", "Lo/writerFor;", "Lo/_decodeUtf8_3;", "write", "()Lo/_decodeUtf8_3;", "p0", "", "read", "(Lo/_decodeUtf8_3;)V", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends writerFor<_decodeUtf8_3> {
        public final boolean equals(Object p0) {
            return p0 == this;
        }

        @Override // kotlin.writerFor
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final void IconCompatParcelizer(_decodeUtf8_3 p0) {
        }

        AudioAttributesCompatParcelizer() {
        }

        @Override // kotlin.writerFor
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final _decodeUtf8_3 IconCompatParcelizer() {
            return _writeBinary.this.RemoteActionCompatParcelizer;
        }

        public final int hashCode() {
            return _writeBinary.this.RemoteActionCompatParcelizer.hashCode();
        }
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final _handleOddName getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View p0, DragEvent p1) {
        _closeArrayScope _closearrayscope = new _closeArrayScope(p1);
        switch (p1.getAction()) {
            case 1:
                boolean zAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(_closearrayscope);
                Iterator<_skipUtf8_3> it = this.write.iterator();
                while (it.hasNext()) {
                    it.next().MediaBrowserCompatItemReceiver(_closearrayscope);
                }
                break;
            case 2:
                this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer(_closearrayscope);
                break;
            case 4:
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(_closearrayscope);
                this.write.clear();
                break;
            case 5:
                this.RemoteActionCompatParcelizer.read(_closearrayscope);
                break;
            case 6:
                this.RemoteActionCompatParcelizer.write(_closearrayscope);
                break;
        }
        return false;
    }

    @Override // kotlin._decodeUtf8_3fast
    public final void IconCompatParcelizer(_skipUtf8_3 p0) {
        this.write.add(p0);
    }

    @Override // kotlin._decodeUtf8_3fast
    public final boolean AudioAttributesCompatParcelizer(_skipUtf8_3 p0) {
        return this.write.contains(p0);
    }
}
